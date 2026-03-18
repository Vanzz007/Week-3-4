import java.util.Scanner;

public class Largest {
    public static void main(String a[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter no1:");
        int no1 = s.nextInt();

        System.out.println("Enter no2:");
        int no2 = s.nextInt();

        System.out.println("Enter no3:");
        int no3 = s.nextInt();

        if (no1 > no2 && no1 > no3) {
            System.out.println("No1 is the largest.");
        }
        else if (no2 > no1 && no2 > no3) {
            System.out.println("No2 is the largest.");
        }
        else {
            System.out.println("No3 is the largest.");
        }

    }
}