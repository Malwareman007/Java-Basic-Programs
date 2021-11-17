# Java-Basic-Programs
import java.util.Scanner;
public class Main
{
    public static float simpleInterest(float principal, float rate, float time)
    {
        float interest = (principal*rate*time)/100;
        return interest;
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        float p, r, t;
        System.out.println("Enter the Principal : ");
        p = sc.nextFloat(); 
        System.out.println("Enter the Rate of interest : ");
        r = sc.nextFloat(); 
        System.out.println("Enter the Time period : ");
        t = sc.nextFloat(); 
        sc.close();
        float interest = simpleInterest(p,r,t);
        System.out.println("Simple interest is : " + interest);

    }
    
}
