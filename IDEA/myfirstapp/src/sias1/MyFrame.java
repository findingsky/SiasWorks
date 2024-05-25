package sias1;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class MyFrame extends JFrame {
	JLabel labelname;
	JTextField textname;
	JLabel labelpassword;
	JPasswordField password1;
	JButton button1,button2;
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
		
		button1=new JButton("登陆");
		
button1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				String name1=textname.getText().trim();
				String pwd1=password1.getText();
				String id1="";
				if(rb1.isSelected())
					id1="教师";
				
				if(rb2.isSelected())
					id1="学生";
				
				if(rb3.isSelected())
					id1="管理员";
				
				
				 //定义数据库联接的驱动程序
			    String driver = "org.gjt.mm.mysql.Driver";
			    //定义MySQL数据库的联接地址
			    String url = "jdbc:mysql://localhost:3306/sias1?user='root';password='root'";
			    //声明联接类
			    Connection conn = null;
			    try{
			      //使用JDBC技术创建数据库联接
			      Class.forName(driver);
			      //使用DriverManager类的getConnection()方法建立联接,第一个字符参数定义用户名,
			      //第二个字符参数定义密码
			      conn = DriverManager.getConnection(url, "root", "root");
			      if(conn != null){
			        System.out.println("成功联接JDBC数据源.");
			      }
			      
			      String sql1="select * from usertable where username='"+name1+"'";
			      System.out.println(sql1);
			      Statement stmt=conn.createStatement();
			      ResultSet rs=stmt.executeQuery(sql1);
			     
			      if(rs.next())
			      {String name2=rs.getString(1);
			      String pwd2=rs.getString("pwd");
			      String id2=rs.getString(3);
			      if(pwd2.equals(pwd1)&&id2.equals(id1))
			      	{System.out.println("you are right user");
			      		MyFrame2 frame2=new MyFrame2();
			      		frame2.show();
			      		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			      	}
			      else
			      {
			    	  System.out.println("you are error user,or not have the user");
			      }
			      }
			      else
			      {
			    	  System.out.println("you are error user.or not have the user");
			      }
			    	 
			       
			    }catch(Exception ex){
			      ex.printStackTrace();
			    }
			    try{
			      //关闭数据库联接类
			      conn.close();
			    }catch(Exception ex){
			      ex.printStackTrace();
			    }
				
				
				
				
				
			}});

		
		button2=new JButton("注册");
		
	button2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				String name1=textname.getText().trim();
				String pwd1=password1.getText();
				String id1="";
				if(rb1.isSelected())
					id1="教师";
				
				if(rb2.isSelected())
					id1="学生";
				
				if(rb3.isSelected())
					id1="管理员";
				
				
				 //定义数据库联接的驱动程序
			    String driver = "org.gjt.mm.mysql.Driver";
			    //定义MySQL数据库的联接地址
			    String url = "jdbc:mysql://localhost:3306/sias1?user='root';password='root'";
			    //声明联接类
			    Connection conn = null;
			    try{
			      //使用JDBC技术创建数据库联接
			      Class.forName(driver);
			      //使用DriverManager类的getConnection()方法建立联接,第一个字符参数定义用户名,
			      //第二个字符参数定义密码
			      conn = DriverManager.getConnection(url, "root", "root");
			      if(conn != null){
			        System.out.println("成功联接JDBC数据源.");
			      }
			      
			      String sql1= "insert into usertable values('"+name1+"','"+pwd1+"','"+id1+"')";
			      System.out.println(sql1);
			      Statement stmt=conn.createStatement();
			      int a=stmt.executeUpdate(sql1);
			      if(a==1)
			    	  System.out.println("成功注册!");
			       
			    }catch(Exception ex){
			      ex.printStackTrace();
			    }
			    try{
			      //关闭数据库联接类
			      conn.close();
			    }catch(Exception ex){
			      ex.printStackTrace();
			    }
				
				
				
				
				
			}});

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
		
		
		gbc.gridx=3;
		gbc.gridy=3;
		gbc.weightx=1;
		gbc.weighty=1;
		gb1.setConstraints(button2,gbc);
		c1.add(button2);
		
		
		
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
