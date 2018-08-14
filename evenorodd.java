import java.io.*;
import java.io.FileOutputStream;
 class Table {
	
			 synchronized void printTable(int n){//synchronized method  
			   
			      
			     try{
			    	 
			         FileOutputStream fodd = new FileOutputStream("odd.txt");
			         FileOutputStream feven = new FileOutputStream("even1.txt");
			         //DataOutputStream dos=new DataOutputStream(feven);
			         //DataOutputStream doso=new DataOutputStream(fodd);
			         //byte b[]=i.getInt();
			         PrintWriter p2=new PrintWriter(fodd);
			         PrintWriter p1=new PrintWriter(feven);
			         //p.println(800);
			         for(int i=n;i<=20;i++){  
			        	 
				      if((i%2)==0)
				      {
			          p1.println(i);
			          
				      }
				      else
				      {
			          p2.println(i);
				      }
			          
			         }

			         p2.close();
			         
			         p1.close();
			         
			     }catch(Exception e){

			         }
			   
			     try{  
			      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
			   }  
			  
			 }  
			 
			
			  
			class MyThread1 extends Thread{  
			Table t;  
			MyThread1(Table t){  
			this.t=t;  
			}  
			public void run(){  
			t.printTable(0);  
		}  
			  
			}  
			class MyThread2 extends Thread{  
		Table t;  
			MyThread2(Table t){  
			this.t=t;  
			}  
			public void run(){  
			t.printTable(1);  
			}  
			}  
			  
	public class evenorodd { 
		    public static void main(String args[]){  
			Table obj = new Table();//only one object  
			MyThread1 t1=new MyThread1(obj);  
			MyThread2 t2=new MyThread2(obj);  
			t1.start();  
			t2.start();  
		}  
	  

}
