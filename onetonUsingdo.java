// --------- Name:- Bhavana Jadon --------- univ. roll no:- 2215000484 -----------

import java.util.Scanner;
public class onetonUsingdo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int i=1;
        do
        {
            System.out.print(i+" ");
            i++;
        }
        while(i<=num);
    }
}


