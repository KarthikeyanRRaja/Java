	import java.awt.*;  
	import javax.swing.JFrame;  
	  
	public class lab183 extends Canvas{  
	      
	    public void paint(Graphics g) {  
	  
	        Toolkit t=Toolkit.getDefaultToolkit();  
	        Image i=t.getImage("biri.jpg");  
	        g.drawImage(i, 120,100,this);  
	          
	    }  
	        public static void main(String[] args) {  
	        lab183 m=new lab183();  
	        JFrame f=new JFrame();  
	        f.add(m);  
	        f.setSize(400,400);  
	        f.setVisible(true);  
	    }  
	  
	}  
