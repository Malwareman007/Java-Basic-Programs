class sum{ 

static int sum(int a, int b){ 

return a+b; 

} 

static double sum(int a, double b){ 

return a+b; 

} 

static double sum(double a, double b){ 

return a+b; 

} 

public static void main(String[] args){ 

System.out.println(sum(2, 2)); 

System.out.println(sum(2, 2.5)); 

System.out.println(sum(2.5, 2.5)); 

} 

} 
