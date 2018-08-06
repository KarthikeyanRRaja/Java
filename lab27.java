
 class A {
		void msg(){System.out.println("Hello");}  
		}  
		class B{  
		void msg(){System.out.println("Welcome");}  
		}  
		public class lab27 extends A,B{//suppose if it were  
		   
		 public static void main(String args[]){  
	   lab27 obj=new lab27();  
		   obj.msg();//Now which msg() method would be invoked?  
		}  


}
