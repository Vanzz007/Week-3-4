import java.util.Scanner;
public class Vote {
    public static void main(String a[]){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the age:");
    int Age= s.nextInt();
    if(Age>17){
        System.out.println("Eligible to vote");

    }
    else{
        System.out.println("Not eligible to vote");
    }

    }
    
} 