import java.util.Scanner;
public class Multiple {
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nextInt();
        for(int i=6;i<10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    
}
