package com.gfg.dynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinCost {
    static class Node {
        Integer x, y, cost;

        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{9, 4, 9, 9}, {6, 7, 6, 4}, {8, 3, 3, 7}, {7, 4, 9, 10}};
        int i = minimumCostPath(grid);
        System.out.println(i);
    }

    public static int minimumCostPath(int[][] grid) {
        int[] x = {0, 0, -1, +1};
        int[] y = {-1, +1, 0, 0};
        int n = grid.length;
        int[][] mat = new int[grid.length][grid.length];
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        for (int i = 0; i < grid.length; i++)
            Arrays.fill(mat[i], Integer.MAX_VALUE);

        mat[0][0] = grid[0][0];
        pq.add(new Node(0, 0, grid[0][0]));

        while (!pq.isEmpty()) {
            Node ele = pq.poll();
            for (int k = 0; k < x.length; k++) {
                int i = x[k];
                int j = y[k];
                int next_x = ele.x + i;
                int next_y = ele.y + j;
                if (next_y >= 0 && next_x >= 0 && next_x < n && next_y < n) {
                    int s = ele.cost + grid[next_x][next_y];
                    if (s < mat[next_x][next_y]) {
                        mat[next_x][next_y] = s;
                        pq.add(new Node(next_x, next_y, s));
                    }
                }
            }
        }

        return mat[grid.length - 1][grid.length - 1];
    }

}
