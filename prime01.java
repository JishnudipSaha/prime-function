import java.util.*;
class prime01
{
    int checkPrime(int a)
    {
        int b=a; int k=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                k++;
            }
        }
            if(k==2)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
    public static void main (String [] args)
    {
        prime01 Math=new prime01();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int show=Math.checkPrime(n);
        if(show==1)
        {
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
}