	import javax.swing.*;  
	public class lab178 extends JFrame{  
	JProgressBar jb;  
	int i=0,num=0;  
	  
	lab178(){  
	jb=new JProgressBar(0,2000);  
	jb.setBounds(40,40,200,30);  
	      
	jb.setValue(0);  
	jb.setStringPainted(true);  
	      
	add(jb);  
	setSize(400,400);  
	setLayout(null);  
	}  
	  
	public void iterate(){  
	while(i<=2000){  
	  jb.setValue(i);  
	  i=i+20;  
	  try{Thread.sleep(150);}catch(Exception e){}  
	}  
	}  
	public static void main(String[] args) {  
	    lab178 m=new lab178();  
	    m.setVisible(true);  
	    m.iterate();  
	}  
	}  
