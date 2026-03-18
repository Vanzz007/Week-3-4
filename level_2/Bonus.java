import java.util.Scanner;

public class Bonus {
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the salary:");
        int sal= s.nextInt();
        System.out.println("Enter the time:");
        double t= s.nextInt();
        if(t>5){
            double b=sal*0.05;
            System.out.println("Bonus:"+b);

        }
        else{
            System.out.println("The person has not worked for more than 5 years.");
        }


    }
    
}
