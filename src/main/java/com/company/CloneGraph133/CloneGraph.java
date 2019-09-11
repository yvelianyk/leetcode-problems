package com.company.CloneGraph133;

import java.util.*;

public class CloneGraph {

    public Node cloneGraph(Node node) {
        Stack<Node> stack = new Stack<Node>();
        Map<Node, Node> visited = new HashMap<Node, Node>();

        stack.push(node);
        visited.put(node, new Node(node.val, new ArrayList<Node>()));

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            ArrayList<Node> list = new ArrayList<Node>();
            for (Node neighbor : current.neighbors) {
                if(!visited.containsKey(neighbor)) {
                    stack.push(neighbor);
                    Node newNode = new Node(neighbor.val, new ArrayList<>());
                    visited.put(neighbor, newNode);
                    list.add(newNode);
                } else {
                    Node newNode = visited.get(neighbor);
                    list.add(newNode);
                }
            }

            Node newNode = visited.get(current);
            newNode.neighbors = list;
            visited.put(current, newNode);
        }

        return visited.get(node);

    }

}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
    }

    public Node(int _val, List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};