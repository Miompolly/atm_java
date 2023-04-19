import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        Random rand = new Random();
        int rows = arr.length;
        int cols = arr[0].length;
        for (int k = 0; k < arr.length; k++) {
            for (int m = 0; m < arr[k].length; m++) {
                arr[k][m] = rand.nextInt(10);
            }}
        for (int row = 0; row < rows; row++) {
            int max = Integer.MIN_VALUE;
            for (int col = 0; col < cols; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
            arr[row][row] = max;
        }
        for (int k = 0; k < arr.length; k++) {
            for (int m = 0; m < arr[k].length; m++) {
                System.out.print(arr[k][m] + " ");
            }
            System.out.println();
        }

    }



    }