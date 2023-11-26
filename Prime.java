package problemsandquetions;
import java.util.Scanner;

public class Prime {
    public static void main (String arrgs[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=s.nextInt();
        int count=0;
        for (int i=2;i<num;i++){
            if(num%i==0){
                count+=1;
            }
        }
        if (count==2){
            System.out.println(num+" is Prime number ");
        }
        else{
            System.out.println(num+" is not  a prime number");
        }


    }
}
