import java.util.*; /*thread allows you to do multiple things at the same time Professor Gita's help for me with threads */ 
public class Tuna implements Runnable {    
   public void run()    {       
      try       {           
         for(int i = 100; i <= 1000; i++)           
         {              
            System.out.print(i + " ");              
            Thread.sleep(5);           
         }           
         System.out.println();       
      }       
      catch(Exception e)       
      {       
      }    
   } 
} 
class Tuna1 implements Runnable 
{    
   public   void run()    
   {       
      try       
      {          
         for(int i = 1; i <= 10; i++)          
         {             
            System.out.print(i + " " );             
            Thread.sleep(20);          
         }          
         System.out.println();       
      }       
      catch(Exception e)       
      {       
      }    
   } 
} 
class Driver 
{    
   public static void main(String[] args)    
   {      
      Tuna task1 = new Tuna();
      Thread t1 = new Thread(task1);
     
      Tuna1 task2 = new Tuna1();
      Thread t2 = new Thread(task2);
      t1.start();
      t2.start();
   }
}
