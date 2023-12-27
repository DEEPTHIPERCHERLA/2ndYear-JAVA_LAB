package cse537;
import java.awt.*;
import java.awt.event.*;



public class Border_Layout {

	public static void main(String[] args) {
	    Frame f= new Frame();    
        Panel pa=new Panel(); 
        pa.setBounds(40,80,200,200);    
        pa.setBackground(Color.gray);  
		
		f.add(pa);
		pa.setLayout(new BorderLayout());
		pa.add(new Button("India"),BorderLayout.NORTH);
		pa.add(new Button("Pakisthan"),BorderLayout.SOUTH);
		pa.add(new Button("China"),BorderLayout.WEST);
		pa.add(new Button("France"),BorderLayout.EAST);
		pa.add(new Button("Countries"),BorderLayout.CENTER);
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
