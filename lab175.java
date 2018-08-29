	import javax.swing.*;  
	public class lab175 {  
	JFrame f;  
	lab175(){  
	    f=new JFrame("Combo ex");  
	    JLabel l=new JLabel("COUNTRY");  
	    String country[]={"India","Aus","U.S.A","England","Newzeland"};  
	    l.setBounds(20,50,90,20);  
	    JComboBox cb=new JComboBox(country);  
	    cb.setBounds(90, 50,90,20);  
	    f.add(cb);  	      
	    f.setLayout(null);  
	f.add(l);
	    f.setSize(400,500); 
	    f.setVisible(true);  
	      
	}  
	public static void main(String[] args) {  
	    new lab175();  
	      
	}  
	}  
