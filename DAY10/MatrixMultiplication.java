class MatrixMultiplier implements Runnable {
    private final int[][] A;
    private final int[][] B;
    private final int[][] C;
    private final int row;
    private final int col;

    public MatrixMultiplier(int[][] A, int[][] B, int[][] C, int row, int col) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;
        this.col = col;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int k = 0; k < B.length; k++) {
            sum += A[row][k] * B[k][col];
        }
        synchronized (C) {
            C[row][col] = sum;
        }
    }
}

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] C = new int[A.length][B[0].length];

        Thread[] threads = new Thread[A.length * B[0].length];
        int threadIndex = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                threads[threadIndex] = new Thread(new MatrixMultiplier(A, B, C, i, j));
                threads[threadIndex].start();
                threadIndex++;
            }
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}