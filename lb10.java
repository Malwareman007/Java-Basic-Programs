import java.io.*; 

class copy { 

public static void main(String[] args) { 

 

try { 

            		FileWriter writer = new FileWriter("MyFile.txt", true); 

            		writer.write("Hello World"); 

            		writer.write("\r\n");   // write new line 

            		writer.write("Good Bye!"); 

            		writer.close(); 

        	} 

catch (IOException e) { 

            		e.printStackTrace(); 

        	} 

        	try { 

            		FileReader reader = new FileReader("MyFile.txt"); 

            		int character; 

  

        while ((character = reader.read()) != -1) { 

                		System.out.print((char) character); 

            		} 

            		reader.close(); 

  

        	} 

catch (IOException e) { 

            		e.printStackTrace(); 

        	} 

    	} 

} 