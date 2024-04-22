package com.gfg.graph;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DetectCycleDirected {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(List.of(0, 1)));
        adj.add(new ArrayList<>(List.of(1, 2)));
        adj.add(new ArrayList<>(List.of(2, 3)));
        adj.add(new ArrayList<>(List.of(3, 0)));

        System.out.println(isCyclic(4,adj));
    }

    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] rec = new boolean[V];
        for(int i=0;i<V;i++){
            if(traverse(i,visited,rec,adj)){
                return true;
            }
        }
        return false;
    }

    public static boolean traverse(int v, boolean[] visited, boolean[] recStack,ArrayList<ArrayList<Integer>> adj){
        if(recStack[v]){
            return true;
        }
        if(visited[v]){
            return false;
        }
        recStack[v]=true;
        visited[v]=true;

        List<Integer> edges = adj.get(v);

        for (Integer d : edges){
            if(traverse(d,visited,recStack,adj)){
                return true;
            }

        }
        recStack[v]=false;
        return false;
    }

}
