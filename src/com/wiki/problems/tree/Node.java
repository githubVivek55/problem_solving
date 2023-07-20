package com.wiki.problems.tree;

import java.util.Objects;

public class Node implements Comparable<Integer>{
    public Node left;
    public Node right;
    public Integer value;
    public Node(Integer v){
        this.value = v;
        this.left =null;
        this.right= null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return value.equals(node.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Integer o) {
        return o.compareTo(value);
    }
}
