class Test1 extends Thread{  
 public void run()
{  
    
    try{
    Thread.sleep(600*10);
    }
  catch(InterruptedException e)
   {
   System.out.println(e);}  
 
  }  
 }  
} 

class Test1 extends Thread{  
 public void run(){  
  try{
    Thread.sleep(1000);
    }
catch(InterruptedException e)
   {
   
  System.out.println(e);}  
    
  }  
 }  

}
class TestSleepMethod1 {
  
 public static void main(String args[]){  
  Test1 t1=new Test1();  
     t1.setPriority(10);
  Test2 t2=new Test2();  
  t1.start();  
  t2.start();  
 }  
}  

