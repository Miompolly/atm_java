import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] myArray = new int[7][7];
        Random rand = new Random();
        int rows = myArray.length;
        int cols = myArray[0].length;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = rand.nextInt(10);
            }}

        for (int row = 0; row < rows; row++) {
            int max = Integer.MIN_VALUE;
            for (int col = 0; col < cols; col++) {
                if (myArray[row][col] < max) {
                    max = myArray[row][col];
                }
            }
            myArray[row][row] = max;
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }


    }



    }