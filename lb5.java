import java.util.*; 

class MaximumNumber { 

public static void main(String[] args){ 

int max = 0; 

        	Scanner sc = new Scanner(System.in); 

        	int[] a = new int[10]; 

System.out.print("Enter 10 numbers :"); 

        	for(int i = 0; i<10; i++){ 

            		a[i] = sc.nextInt(); 

        	}  

        	for(int i = 0; i<10; i++){ 

            		if(a[i] > max) max = a[i]; 

        	} 

        	System.out.println("Maximum of 10 numbers is : "+ max); 

    } 

} 