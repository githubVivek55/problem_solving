package com.gfg.graph;

import java.util.LinkedList;
import java.util.Queue;

public class StepsByKnight {
    public static void main(String[] args) {
        int[] pos = {4, 5};
        int[] target = {3, 3};
        int i = minStepToReachTarget(pos, target, 6);
        System.out.println(i);
    }

    public static int minStepToReachTarget(int[] KnightPos, int[] TargetPos, int N) {
        int[][] board = new int[N][N];
        int count = 0;
        int tx = TargetPos[0] - 1;
        int px = KnightPos[0] - 1;
        int py = KnightPos[1] - 1;
        int ty = TargetPos[1] - 1;
        board[py][px] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{px, py});
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                int[] pos = queue.poll();
                px = pos[0];
                py = pos[1];
                if (px == tx && py == ty) {
                    return count;
                }
                int[] arx = {-1, -1, 1, 1, -2, -2, 2, 2};
                int[] ary = {2, -2, 2, -2, -1, 1, -1, 1};

                for (int i = 0; i < 8; i++) {
                    if ((px + arx[i]) >= 0 && (px + arx[i]) < N && (py + ary[i]) < N && (py + ary[i]) >= 0) {
                        int[] arr = {px + arx[i], py + ary[i]};
                        if (board[arr[1]][arr[0]] != 1) {
                            queue.add(arr);
                            board[arr[1]][arr[0]] = 1;
                        }
                    }
                }
                size--;
            }
            count++;
        }
        return -1;
    }


}
