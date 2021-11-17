class teacher{ 

int teacher_id; 

String name; 

String subject; 

void display(){ 

System.out.println("Teacher ID: "+ teacher_id); 

System.out.println("Name : "+ name); 

System.out.println("Subject : "+ subject); 

} 

public static void main(String[] args){ 

teacher t1 = new teacher(); 

teacher t2 = new teacher(); 

t1.teacher_id = 200103695; 

t1.name = "KUSHAGRA OJHA"; 

t1.subject = "Theory"; 

t2.teacher_id = 200102412; 

t2.name = "TASHWIN"; 

t2.subject = "Programming"; 

t1.display(); 

t2.display(); 

} 

} 