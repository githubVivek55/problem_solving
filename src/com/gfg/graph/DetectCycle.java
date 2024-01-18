package com.gfg.graph;

import java.util.*;

public class DetectCycle {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>(List.of(2)));
        adj.add(new ArrayList<>(List.of(1,3)));
        adj.add(new ArrayList<>(List.of(2)));
        System.out.println(isCycle(V, adj));
    }

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[V];
        Integer[] parent = new Integer[V];
        Arrays.fill(parent,-1);
        for (int i=0;i<V;i++){
            if(!visited[i] && detectCycle(adj,visited,i,parent)){
                return true;
            }
        }
        return false;
    }

    public static boolean detectCycle(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int V,Integer[] parent) {
        Stack<Integer> stack = new Stack<>();
        stack.push(V);
        while (!stack.empty()) {
            int node = stack.pop();
            visited[node]=true;
            ArrayList<Integer> edges = adj.get(node);
            for(Integer n: edges){
                if(Objects.equals(n, parent[node])){
                    continue;
                }
                if(visited[n]){
                    return true;
                }
                stack.push(n);
                parent[n]=node;
            }
        }
        return false;
    }
}
