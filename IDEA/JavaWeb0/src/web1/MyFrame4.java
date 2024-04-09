package web1;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame4 extends MyFrame{
//	JLabel labelscore=new JLabel("cengji");
	public MyFrame4()  //���캯��   ��������  ��ʼ��
	{
		setTitle("4");
		Container c1=getContentPane();
		
		
		c1.add(new JTextField(10));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFrame4 mf4=new MyFrame4();
		mf4.getContentPane().add(new JLabel("chengji"));
		mf4.getContentPane().add(new JButton("cancel"));
		
	}

}
