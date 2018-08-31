	import java.awt.*;  
	import javax.swing.*;  
	  
	public class lab194 extends Frame {  
	 Button buttons[];  
	  
	 public lab194() {  
	   buttons = new Button [5];  
    
	   for (int i = 0;i<5;i++) {  
	      buttons[i] = new Button ("Button " + (i + 1));  
	      add (buttons[i]);  
	    }  
	  
	setLayout (new BoxLayout (this, BoxLayout.X_AXIS));  
	setSize(400,400);  
	setVisible(true);  
	}  
	  
	public static void main(String args[]){  
	lab194 b=new lab194();  
	}  
	}  
