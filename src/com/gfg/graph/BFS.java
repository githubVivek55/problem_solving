package com.gfg.graph;

import java.util.*;
import java.util.stream.Collectors;

public class BFS {
    public static void main(String[] args) {
        int V = 6, E = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(List.of(4,5)));
        adj.add(new ArrayList<>(List.of(2)));
        adj.add(new ArrayList<>(List.of(5)));
        adj.add(new ArrayList<>(List.of(4)));
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());


        System.out.println(adj);
        System.out.println(bfsOfGraph(V, adj));
    }

    /*
     * V = 5, E = 4
     * edges = {(0,1),(0,2),(0,3),(2,4)}
     * */
    static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];
        queue.add(0);
        visited[0]=true;

        while (!queue.isEmpty()){
            int a = queue.poll();
            res.add(a);
            for(int i=0;i<adj.get(a).size();i++){
                int curr = adj.get(a).get(i);
                if(!visited[curr]){
                    queue.add(curr);
                    visited[curr]=true;
                }
            }
        }
        return res;
    }
}
