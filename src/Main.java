import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int A [][] = new int [7][6];
        for (int x=0;x<7;x++) {
            for (int y=0;y<6;y++) {
                A[x][y] = random.nextInt(10); ;
            }
        }
        System.out.println("Given two-dimensional array: ");
        for (int[ ] i : A) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println();

        //sum of row
        int finalSum = 0;
        for (int x=0;x<7;x++) {
            finalSum = 0;
            for (int y=0;y<6;y++) {
                finalSum = finalSum + A[x][y];
            }
            System.out.println("the sum for row number " + x + " is " + finalSum);
        }
        System.out.println();

        //sum of column
        for (int y=0;y<6;y++) {
            finalSum = 0;
            for (int x=0;x<7;x++) {
                finalSum = finalSum + A[x][y];
            }
            System.out.println("the sum for column number " + y + " is " + finalSum);
        }
        System.out.println();

        //total sum
        finalSum=0;
        for (int y=0;y<6;y++) {
            for (int x=0;x<7;x++) {
                finalSum = finalSum + A[x][y];
            }
        }
        System.out.println("the sum of all elements is " + finalSum);
    }
}