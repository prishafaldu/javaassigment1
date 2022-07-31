//21ce028 prisha faldu
/*Aim- Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, 
so 17 % 10 is 7.lastDigit(7, 17) → truelastDigit(6, 17) → falselastDigit(3, 113) → true*/
import java.util.Scanner;
public class Practical2 
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        
        int b= sc.nextInt();
        System.out.println(a);
        System.out.println(" "+b);
        a=a%10;
        b=b%10;
        if(a==b)
        {
            System.out.println("true");
        } 
    else
    {
        System.out.println("false");
    }
    }
    
}
