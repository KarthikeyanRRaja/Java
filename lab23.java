
public class lab23 {
	void m(lab23 obj){  
			  System.out.println("method is invoked");  
			  }  
			  void p(){  
			  m(this);  
		  }  
		    
			  public static void main(String args[]){  
			  lab23 s1 = new lab23();  
		  s1.p();  
			  }  

}
