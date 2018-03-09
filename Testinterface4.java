interface Printable{  
void print();  
}  
interface Showable extends Printable{  
void show();  
}  
class Testinterface4 implements Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
Testinterface4 obj = new Testinterface4();  
obj.print();  
obj.show();  
 }  
}  

