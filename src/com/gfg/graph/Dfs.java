package com.gfg.graph;

import java.util.ArrayList;
import java.util.List;

public class Dfs {
    public static void main(String[] args) {
        int V = 4, E = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(List.of(1,3)));
        adj.add(new ArrayList<>(List.of(2,0)));
        adj.add(new ArrayList<>(List.of(1)));
        adj.add(new ArrayList<>(List.of(0)));

        boolean[] visited = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
        dfs(visited, res, adj, 0);
        System.out.println(res);
    }

    static void dfs(boolean[] visited, ArrayList<Integer> res, ArrayList<ArrayList<Integer>> adj, int i) {
        if (!visited[i]) {
            visited[i] = true;
            res.add(i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                dfs(visited, res, adj, adj.get(i).get(j));
            }
        }
    }
}
