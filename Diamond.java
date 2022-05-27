import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row, i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner sc  = now Scanner(System.in);
        space = row - 1;
        for (j = 1; <= space; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j -1; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (j = 1; j <= row; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * 2 *(row - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}