	import javax.swing.*;  
	  
	public class lab179 extends JFrame{  
	  
	public lab179() {  
	JSlider slider = new JSlider(JSlider.VERTICAL, 0, 50, 25);  
	JPanel panel=new JPanel();  
	panel.add(slider);  
	  
	add(panel);  
	}  
	  
	public static void main(String s[]) {  
	lab179 frame=new lab179();  
	frame.pack();  
	frame.setVisible(true);  
	}  
	}  
