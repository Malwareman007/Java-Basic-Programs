import java.util.Scanner; 

 

public class calculator { 

 

public static void main(String[] args) { 

Scanner sc = new Scanner(System.in); 

B obj = new B(); 

double x, y; 

char z; 

System.out.println("Enter operand 1 : "); 

x = sc.nextDouble(); 

System.out.println("Enter operand 2 : "); 

y = sc.nextDouble(); 

System.out.println("Select operator[+, -, /, *, %] : "); 

z = sc.next().charAt(0); 

switch(z) { 

case '+':{ 

System.out.println(x + " + "+ y + " = "+ obj.sum(x,y)); 

break; 

} 

case '-':{ 

System.out.println(x + " - "+ y + " = "+ obj.subtract(x,y)); 

break; 

} 

case '/':{ 

System.out.println(x + " / "+ y + " = "+ obj.divide(x,y)); 

break; 

} 

case '*':{ 

System.out.println(x + " * "+ y + " = "+ obj.multiply(x,y)); 

break; 

} 

case '%':{ 

System.out.println(x + " % "+ y + " = "+ obj.remainder(x,y)); 

break; 

} 

} 

} 

 

} 

 

 

interface A{ 

double sum(double a, double b); 

double subtract(double a, double b); 

double multiply(double a, double b); 

double divide(double a, double b); 

double remainder(double a, double b); 

} 

 

 

class B implements A{ 

public double sum(double a, double b) { 

return a+b; 

} 

public double subtract(double a, double b) { 

return a-b; 

} 

public double multiply(double a, double b) { 

return a*b; 

} 

public double divide(double a, double b) { 

return a/b; 

} 

public double remainder(double a, double b) { 

return a%b; 

} 

} 
