class Fibonacci{ 

 

public static void main(String[] a1) { 

    	long a=0,b=1,i=0; 

int n = 100; 

    			System.out.println(a + " " + b); 

    			while(i<n-2) { 

        			long c=a+b; 

        			if( c%5 != 0) { 

System.out.println(" " + c); 

} 

        			i +=1; 

        			a=b; 

        			b=c;     

    			} 

} 

} 