package web1;

import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.*;


public class MyFrame extends JFrame{
     /**
	 * 
	 */
	private static final long serialVersionUID = -3296035775817729593L;
	JLabel labelname;  //????????д???????
	 JTextField textname;
	 JLabel labelpwd;
	 JPasswordField pwd1;
	 JButton button1;
	 String[] schools={"sias","Tsinghua","Tokyo","Kyoto"};
	 
	
	
	 String[] dept={"computer","english","law","opera"};
	 
	 JComboBox combo1;
	 JList list1;
	 JRadioButton rb1,rb2,rb3;
	 ButtonGroup group1;
	 
	 
	 JMenuBar bar1;
	 JMenu menufile,menuedit;
	 JMenuItem itemopen,itemclose,itemsave;
	
	public MyFrame()
	{
		//super("????????????");
		
		setSize(600,400);
		setTitle("welcome to sias");
		
		
		
		labelname=new JLabel("姓名");
		textname=new JTextField(10);
		labelpwd=new JLabel("密码");
		pwd1=new JPasswordField(10);
		
		rb1=new JRadioButton("教师");
		rb2=new JRadioButton("学生");
		
		group1=new ButtonGroup();
		//group1.add(rb1);
		//group1.add(rb2);
		
		combo1=new JComboBox(schools);
		list1=new JList(dept);
		
		button1=new JButton("ok");
		button1.addActionListener(
				new ActionListener(){
					
					public void actionPerformed(ActionEvent e)
					{
//						System.out.println("you press button");
//						if(textname.getText().trim().equals("abc") && pwd1.getText().trim().equals("123") )
//						{
//							System.out.println("you are right user");
//							MyFrame5 mf=new MyFrame5();
//							mf.show();
//							
//						}
//						else
//						{
//							System.out.println("you are wrong user");
//						
//					}//else
			
				String name1=textname.getText();
				String schoola= (String)combo1.getSelectedItem();
				String departa=  (String) list1.getSelectedValue();
					System.out.println(name1);
					System.out.println(schoola);
					System.out.println(departa);
						
					
					}//actionPerformed
					
				}//ActionListener class
				
				);
		
		Container   c1=   getContentPane();
		
		c1.setLayout(new FlowLayout());
		c1.add(labelname);
		c1.add(textname);
		
		
		c1.add(labelpwd);
		c1.add(pwd1);
		
		c1.add(rb1);
		c1.add(rb2);
		
		
		
		c1.add(combo1);
	//c1.add(list1);
		list1.setVisibleRowCount(2);
		JScrollPane jp1=new JScrollPane(list1);
	  c1.add(jp1);
	
	
		c1.add(button1 );
		
		
		bar1=new JMenuBar();//?????
		menufile=new JMenu("file");//???
		itemopen=new JMenuItem("open");
		itemclose=new JMenuItem("close");
		
		
		menufile.add(itemopen);
		menufile.add(itemclose);
		menuedit=new JMenu("edit");
		menuedit.add(new JMenuItem("aaa"));
		bar1.add(menuedit);
		bar1.add(menufile);
		setJMenuBar(bar1);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyFrame f1=new MyFrame();    
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
	}

	
}
