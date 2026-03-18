import java.util.Scanner;

public class OddEve {
    public static void main(String a[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter no:");
    int n=s.nextInt();
    if(n>0){
    for(int i=1;i<5;i++){
        if (i%2==0){
            System.out.println(i+" is even");
        }
        else{
            System.out.println(i+" is odd");
        }
    }
    }
    else{
        System.out.println("It is not a natural no.");
    }
}
}
