package com.gfg.tree;

import java.util.*;

public class KDistanceNodes {
    public static void main(String[] args) {
        Node root = new Node(20);
        Node left = new Node(8);
        Node right = new Node(22);
        Node l2 = new Node(4);
        Node r2 = new Node(12);
        root.left = left;
        root.right = right;
        left.left = l2;
        left.right = r2;
        ArrayList<Integer> integers = KDistanceNodes(root, 8, 1);
        integers.stream().forEach(System.out::println);
    }

    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
        Map<Integer, Node> parents = new HashMap<>();
        ArrayList<Integer> visited = new ArrayList<>();
        getDepth(root, null, parents);
        Node targetNode = null;
        Node node = parents.get(target);
        if (node == null) {
            targetNode = root;
        } else if (!Objects.isNull(node.left) && node.left.data == target) {
            targetNode = node.left;
        } else {
            targetNode = node.right;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(targetNode);
        while (!queue.isEmpty() && k > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node ele = queue.poll();
                visited.add(ele.data);
                if (ele.left != null && !visited.contains(ele.left.data))
                    queue.add(ele.left);
                if (ele.right != null && !visited.contains(ele.right.data))
                    queue.add(ele.right);
                if (!Objects.isNull(parents.get(ele.data)) && !visited.contains(parents.get(ele.data).data)) {
                    queue.add(parents.get(ele.data));
                }
            }
            k--;
        }
        ArrayList<Integer> result = new ArrayList<>();

        queue.forEach(ele -> result.add(ele.data));
        result.sort(Comparator.comparingInt(a -> a));
        return result;
    }

    public static Node findNode(Node root, int target) {
        if (root == null)
            return null;

        if (root.data == target) {
            return root;
        }
        Node lr = findNode(root.left, target);
        Node rl = findNode(root.right, target);
        return lr == null ? rl : lr;
    }

    private static void getDepth(Node root, Node parent, Map<Integer, Node> parents) {
        if (Objects.isNull(root))
            return;
        parents.put(root.data, Objects.isNull(parent) ? null : parent);
        getDepth(root.left, root, parents);
        getDepth(root.right, root, parents);
    }
}
