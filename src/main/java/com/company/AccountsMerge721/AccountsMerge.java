package com.company.AccountsMerge721;

import java.util.*;

public class AccountsMerge {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> emailToId = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();
        UF uf = new UF(10001);

        int id = 0;
        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                emailToId.putIfAbsent(email, id++);
                emailToName.put(email, name);
                uf.union(emailToId.get(account.get(1)), emailToId.get(email));
            }
        }

        Map<Integer, List<String>> resMap = new HashMap<>();
        for (String email : emailToName.keySet()) {
            int index = uf.findRoot(emailToId.get(email));
            List<String> emails = resMap.getOrDefault(index, new ArrayList<>());
            emails.add(email);
            resMap.put(index, emails);
        }

        for (List<String> emails : resMap.values()) {
            Collections.sort(emails);
            emails.add(0, emailToName.get(emails.get(0)));
        }
        return new ArrayList(resMap.values());
    }

    class UF {
        private int[] root;
        private int[] size;
        public int count;

        UF(int n) {
            root = new int[n];
            size = new int[n];
            count = n;
            for (int i = 0; i < n; i++) {
                root[i] = i;
                size[i] = 1;
            }
        }

        public void union(int p, int q) {
            int rootP = findRoot(p);
            int rootQ = findRoot(q);
            if (rootP == rootQ) return;

            int sizeP = size[rootP];
            int sizeQ = size[rootQ];
            if (sizeP > sizeQ) {
                root[rootQ] = rootP;
                size[rootP] += sizeQ;
            } else {
                root[rootP] = rootQ;
                size[rootQ] += sizeP;
            }
            count--;
        }

        public int findRoot(int node) {
            while (node != root[node]) {
                root[node] = root[root[node]];
                node = root[node];
            }
            return node;
        }

        public boolean connected(int p, int q) {
            return findRoot(p) == findRoot(q);
        }
    }
}
