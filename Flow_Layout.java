package cse537;
import java.awt.*;
import java.awt.event.*;



public class Flow_Layout {

	public static void main(String[] args) {
	    Frame f= new Frame();    
        Panel pa=new Panel(); 
        pa.setBounds(40,80,200,200);    
        pa.setBackground(Color.pink);  
		
		f.add(pa);
		pa.setLayout(new FlowLayout());
		pa.add(new Button("India"));
		pa.add(new Button("Pakisthan"));
		pa.add(new Button("China"));
		pa.add(new Button("France"));
		pa.add(new Button("Countries"));
		f.setSize(300,300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			    {
			    	System.exit(0);
			    }
		});
		
		// TODO Auto-generated method stub

	}

}






