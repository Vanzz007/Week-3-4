import java.util.Scanner;
public class Print{
    public static void main(string a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=s.nxtInt();
        if(n>0){
            for(int i=0;i<n;i++){
                if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                
            }
        }


    }
}
