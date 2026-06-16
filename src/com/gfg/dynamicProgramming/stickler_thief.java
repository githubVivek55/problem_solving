
class SticklerThief {
    public static void main(String[] args) {
        int[] input = { 2, 1, 4, 9 };
        int curr = input[0];
        int next = input[0] > input[1] ? input[0] : input[1];

        for (int i = 2; i < input.length; i++) {
            int n1 = input[i] + curr;
            int n2 = next;
            if (n1 > n2) {
                curr = next;
                next = n1;
            } else {
                curr = next;
                next = n2;
            }
        }

        System.err.println("Answer:" + next);
    }
}