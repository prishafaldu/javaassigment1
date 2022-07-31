import java.util.Scanner;
public class Practical3 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=sc.nextInt();
        
        System.out.println("enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {

           System.out.println(arr[i]);
        }
        System.out.println(arrayOneTwoThree(arr));

}
public static boolean arrayOneTwoThree(int[] nums) 
{
    for(int i = 0; i < nums.length - 2; i++) 
    {
       if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
       {
           return true;
       }
   }
   return false;
}
    
}
