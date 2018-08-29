	import javax.swing.*;  
	  
	public class lab180 extends JFrame{  
	  
	public lab180() {  
	  
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
	slider.setMinorTickSpacing(2);  
	slider.setMajorTickSpacing(10);  
	  
	slider.setPaintTicks(true);  
	slider.setPaintLabels(true);  
	  
	JPanel panel=new JPanel();  
	panel.add(slider);  
	add(panel);  
	}  
	  
	public static void main(String s[]) {  
	lab180 frame=new lab180();  
	frame.pack();  
	frame.setVisible(true);  
	  
	}  
	}  
