package sias1;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame {
	JLabel labelname;
	JTextField textname;
	JLabel labelpassword;
	JPasswordField password1;
	JButton button1;
	JRadioButton rb1,rb2,rb3;
	ButtonGroup group1;
	
	public MyFrame()
	{
		setTitle("sias");
		setSize(400,200);
		setResizable(false);
		ImageIcon icon=new ImageIcon("image\\sunset.jpg");
		Image image1=icon.getImage();
		setIconImage(image1);
		GridBagLayout gb1=new GridBagLayout();//网格包布局
		GridBagConstraints gbc=new GridBagConstraints();//约束管理器  管家
		
		labelname=new JLabel("name");
		textname=new JTextField(10);
		labelpassword=new JLabel("password");
		password1=new JPasswordField(10);
		rb1=new JRadioButton("教师");
		//rb2   rb3....
		rb2=new JRadioButton("学生");
		rb3=new JRadioButton("管理员");
		group1=new ButtonGroup();
		group1.add(rb1);
		group1.add(rb2);
		group1.add(rb3);
		
		button1=new JButton("确定");
		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("you press button");
				if(textname.getText().trim().equals("abc")&&password1.getText().trim().equals("123")&&rb1.isSelected())
				{System.out.println("you are right user");
				MyFrame2 frame2=new MyFrame2();
				frame2.show();
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				
			}
		});

		Container c1=getContentPane();
		c1.setLayout(gb1);
		
		
		
		gbc.gridx=1;//1列
		gbc.gridy=1;//1行
		gbc.weightx=1;
		gbc.weighty=1;
		gb1.setConstraints(labelname,gbc);
		c1.add(labelname);
		
		
		gbc.gridx=2;//2列
		gbc.gridy=1;//1行
		gbc.weightx=1;
		gbc.weighty=1;
		gb1.setConstraints(textname,gbc);
		c1.add(textname);
		
		gbc.gridx=3;//3列
		gbc.gridy=1;//1行
		gbc.weightx=1;
		gbc.weighty=1;
		gb1.setConstraints(labelpassword,gbc);
		c1.add(labelpassword);
		
		
		gbc.gridx=4;
		gbc.gridy=1;//1行
		gbc.weightx=1;
		gbc.weighty=1;
		gb1.setConstraints(password1,gbc);
		c1.add(password1);
		
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.weightx=1;
		gbc.weighty=1;
		gb1.setConstraints(rb1,gbc);
		c1.add(rb1);
		
		gbc.gridx=2;
		gbc.gridy=2;
		gbc.weightx=1;
		gbc.weighty=1;
		gb1.setConstraints(rb2,gbc);
		c1.add(rb2);
		
		gbc.gridx=3;
		gbc.gridy=2;
		gbc.weightx=1;
		gbc.weighty=1;
		gb1.setConstraints(rb3,gbc);
		c1.add(rb3);
		
		gbc.gridx=2;
		gbc.gridy=3;
		gbc.weightx=1;
		gbc.weighty=1;
		gb1.setConstraints(button1,gbc);
		c1.add(button1);
		
		
		
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MyFrame my1=new MyFrame();
     my1.show();
     my1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
