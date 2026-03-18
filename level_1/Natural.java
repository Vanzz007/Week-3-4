import java.util.Scanner;
public class Natural {
    public static void main(String a[]){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the no:");
    int No= s.nextInt();
    if(No>0){
        int su=No*(No+1)/2;
        System.out.println("The sum of the natural no is:"+su);

    }
    else{
        System.out.println("The no is not a natural no");
    }

    }
    
}
