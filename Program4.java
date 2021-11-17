import java.util.Scanner; 

public class Decimalcheck { 

 

     

  public static void main(String[] args) 

    { 

        Scanner in = new Scanner(System.in); 

 

        System.out.print("Input floating-point N1: "); 

        double x = in.nextDouble(); 

        System.out.print("Input floating-point N2: "); 

        double y = in.nextDouble(); 

 

        x = Math.round(x * 10000); 

        x = x / 10000; 

 

        y = Math.round(y * 10000); 

        y = y / 10000; 

 

        if (x == y) 

        { 

            System.out.println("They are the same up to four decimal places"); 

        } 

        else 

        { 

            System.out.println("They are not same"); 

        } 

    } 

} 
