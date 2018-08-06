
 class lab {
	lab24 obj;  
		 lab(lab24 obj){  
		    this.obj=obj;  
		  }  
		  void display(){  
		    System.out.println(obj.data);//using data member of A4 class  
		  }  
		}  
		  
	    public class lab24{  
		  int data=10;  
		  lab24(){  
			  	   lab b=new lab(this);  
			  	   b.display();  
			  	  }  
			  	  public static void main(String args[]){  
			  		lab24 a=new lab24();  
			  	  }  



}
