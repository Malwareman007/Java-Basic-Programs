import java.util.*; 

class VowelConsonant { 

    public static void main(String args[]) { 

Scanner sc = new Scanner(System.in); 

System.out.print("Enter alphabet : "); 

char x = sc.next().charAt(0); 

String ans = (x=='a'||x=='A'||x=='e'||x=='E'||x=='i'||x=='I'||x=='o'||x=='O'||x=='u'||x=='U') ? "vowel" : "consonant"; 

      	System.out.println(ans); 

    } 

} 
