package com.company.RemoveSubfolders1233;

import java.util.*;

public class RemoveSubfolders {
    public List<String> removeSubfolders(String[] folder) {
        List<String> result = new ArrayList<>();
        Set<String> roots = new HashSet<>(Arrays.asList(folder));

        for (String someFolder : folder) {
            if (checkFolder(someFolder, roots)) {
                result.add(someFolder);
            }
        }
        return result;
    }

    private boolean checkFolder(String folder, Set<String> roots) {
        int lastIndex = folder.lastIndexOf('/');
        String parent = folder.substring(0, lastIndex);;

        while (!parent.equals("")) {
            if (roots.contains(parent)) return false;
            lastIndex = parent.lastIndexOf('/');
            parent = parent.substring(0, lastIndex);
        }

        return true;
    }
}
