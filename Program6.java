import java.util.*; 
public class sort_names { 
public static void main(String[] args) { 
String[] x = new String[10]; 
int z; 
String temp; 
Scanner sc = new Scanner(System.in); 
for(int i = 0; i<10; i++) { 
System.out.println("Enter Strings :"); 
x[i] = sc.next(); 
} 
for(int j = 0; j<10; j++) { 
for(int i = 0; i<(9-j); i++ ) { 
z = x[i].compareTo(x[i+1]); 
if(z == 0 || z<0)continue; 
else { 
temp = x[i+1]; 
x[i+1] = x[i]; 
x[i] = temp; 
} 
} 
} 
System.out.println("Printing  the String \n");
for(int i = 0; i<10; i++){ 
System.out.print(x[i]+"\n "); 
}	 
} 
}
