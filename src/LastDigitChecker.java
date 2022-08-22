//program to check the given 3 numbers have the same last digit.
//Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
//The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.


import java.util.Scanner;

public class LastDigitChecker {
    public static void main(String[] ar)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers ");
        System.out.println("First Number : ");
        int n1= sc.nextInt();
        sc.nextLine();
        System.out.println("Second Number : ");
        int n2=sc.nextInt();
        sc.nextLine();
        System.out.println("Third Number : ");
        int n3=sc.nextInt();
        sc.nextLine();

        if(hasSameLastDigit(n1,n2,n3)) {
            System.out.println("Atleast 2 numbers have the same last digit.");
        }
        else {
            System.out.println("no numbers have the same last digit! ");
        }
    }
    public static boolean hasSameLastDigit(int n1,int n2, int n3)
    {
        if(isValid(n1,n2,n3))
        {
            int ldn1=0;
            int ldn2=0;
            int ldn3=0;

            ldn1=n1%10;
            ldn2=n2%10;
            ldn3=n3%10;

            if((ldn1==ldn2)||(ldn2==ldn3)||(ldn1==ldn3))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }

    }
    public static boolean isValid(int num1, int num2, int num3)
    {
        if(((num1>=10)&&(num1<=1000))&&((num2>=10)&&(num2<=1000))&&((num3>=10)&&(num3<=1000)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

