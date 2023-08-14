// --------- Name:- Bhavana Jadon --------- univ. roll no:- 2215000484 -----------

import java.util.Scanner;
public class factorial1 {
    public static int fact(int x)
    {
        if(x==1)
            return 1;
        else    
            return x*fact(x-1); 
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n =sc.nextInt();
        int result = fact(n);
        System.out.println(result);
    }
}
