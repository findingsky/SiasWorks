package sias1;
import javax.swing.*;
public class MyFrame3 extends MyFrame{

	/**
	 * @param args
	 */
	
	public MyFrame3()
	{
		setTitle("3");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyFrame3 m=new MyFrame3();
      m.getContentPane().add(new JLabel("school"));
      m.getContentPane().add(new JTextField(10));
      m.show();
	}

}
