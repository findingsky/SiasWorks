package web1;
//引入

import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class MyFrame2 extends JFrame
{

    //创建属性
    JLabel labelname;
    JTextField textname;
    JLabel labelage;
    JTextField textage;
    JLabel labelsg;
    JTextField textsg;
    JLabel labeltz;
    JTextField texttz;
    JLabel labeladdress;
    JTextField textaddress;
    JLabel labelschool;
    String[] schools = {"郑州大学", "河南大学", "河南科技大学", "河南工业大学"};
    JComboBox combo1;
    JLabel labeljob;
    String[] xbs = {"计算机科学与技术", "多媒体", "电子信息管理", "计算机维护"};
    JComboBox combo2;
    JButton button1;
    JButton button2;
    JMenuBar bar1;
    JMenu menufile;
    JMenuItem itemopen;
    JMenuItem itemsave;
    JMenuItem itemcolse;
    JMenu menuedit;
    JMenuItem itemxian;
    JMenuItem itemyin;
    JLabel labelxb;

    JList list1;

    public MyFrame2()
    {
        super();
        setTitle("学生信息管理系统2");
        setSize(380, 300);
        //setResizable(true);
        ImageIcon icon = new ImageIcon("image/winter.jpg");
        Image image1 = icon.getImage();
        setIconImage(image1);
        GridBagLayout gb1 = new GridBagLayout();//网格包布局
        GridBagConstraints gbc = new GridBagConstraints();//约束管理器  管家
        //新建标签
        labelname = new JLabel("姓名");


        labelage = new JLabel("年龄");
        labelsg = new JLabel("身高");
        labeltz = new JLabel("体重");
        labeladdress = new JLabel("家庭住址");
        labelschool = new JLabel("请选择学校");
        //labeljob=new JLabel("请选择专业");
        labelxb = new JLabel("请选择系别");

        //新建文本框
        textname = new JTextField(10);
        textage = new JTextField(10);
        textsg = new JTextField(10);
        texttz = new JTextField(10);
        textaddress = new JTextField(10);

        //新建列表框
        combo1 = new JComboBox(schools);

        list1 = new JList(xbs);

        //新建按钮
        button1 = new JButton("注册");
        button2 = new JButton("取消");

        //菜单栏
        bar1 = new JMenuBar();
        menufile = new JMenu("文件(F)");
        itemopen = new JMenuItem("打开");
        itemsave = new JMenuItem("保存");
        itemcolse = new JMenuItem("关闭");
        menuedit = new JMenu("编辑(E)");
        itemxian = new JMenuItem("显示");
        itemyin = new JMenuItem("隐藏");


        //得到窗口的内容窗格
        Container c1 = getContentPane();
        c1.setLayout(gb1);

        gbc.gridx = 1;//1列
        gbc.gridy = 1;//1行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelname, gbc);
        c1.add(labelname);


        gbc.gridx = 2;//2列
        gbc.gridy = 1;//1行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(textname, gbc);
        c1.add(textname);


        gbc.gridx = 3;//3列
        gbc.gridy = 1;//1行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelage, gbc);
        c1.add(labelage);

        gbc.gridx = 4;//1列
        gbc.gridy = 1;//1行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(textage, gbc);
        c1.add(textage);


        gbc.gridx = 1;//1列
        gbc.gridy = 2;//2行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelsg, gbc);
        c1.add(labelsg);


        gbc.gridx = 2;//2列
        gbc.gridy = 2;//2行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(textsg, gbc);
        c1.add(textsg);


        gbc.gridx = 3;//2列
        gbc.gridy = 2;//2行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labeltz, gbc);

        c1.add(labeltz);


        gbc.gridx = 4;//4列
        gbc.gridy = 2;//2行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(texttz, gbc);
        c1.add(texttz);

        gbc.gridx = 1;//1列
        gbc.gridy = 3;//3行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labeladdress, gbc);
        c1.add(labeladdress);

        gbc.gridx = 2;//2列
        gbc.gridy = 3;//3行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(textaddress, gbc);
        c1.add(textaddress);

        gbc.gridx = 1;//1列
        gbc.gridy = 4;//4行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelschool, gbc);
        c1.add(labelschool);

        gbc.gridx = 2;//2列
        gbc.gridy = 4;//4行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(combo1, gbc);
        c1.add(combo1);


        gbc.gridx = 1;//1列
        gbc.gridy = 5;//5行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelxb, gbc);
        //下拉框
        c1.add(labelxb);


        list1.setVisibleRowCount(1);
        JScrollPane jp1 = new JScrollPane(list1);


        gbc.gridx = 2;//2列
        gbc.gridy = 5;//6行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(jp1, gbc);
        c1.add(jp1);

        //按钮
        gbc.gridx = 2;//2列
        gbc.gridy = 7;//7行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(button1, gbc);
        c1.add(button1);
        button1.addActionListener(new ActionListener()
                                  {

                                      public void actionPerformed(ActionEvent e)
                                      {
                                          String name = textname.getText().trim();
                                          String age = textage.getText().trim();
                                          String height = textsg.getText().trim();
                                          String weight = texttz.getText().trim();
                                          String address = textaddress.getText().trim();
                                          String school = (String) combo1.getSelectedItem();
                                          String senkou = (String) list1.getSelectedValue();

                                          System.out.println(name);
                                          System.out.println(senkou);
                                          // 指定驱动
                                          String driver = "org.gjt.mm.mysql.Driver";
                                          // 数据库连接字符串
                                          String url = "jdbc:mysql://localhost:3306/JavaWeb?user='root';password='1qaz2wsx'";
                                          // 获取数据库连接
                                          Connection conn = null;
                                          try
                                          {
                                              // 加载驱动
                                              Class.forName(driver);
                                              // 获取数据库连接
                                              conn = DriverManager.getConnection(url, "root", "1qaz2wsx");
                                              if (conn != null)
                                              {
                                                  System.out.println("Successfully connected to MySQL server!");
                                              }
                                              String sql = "insert into student values('" + name + "','" +
                                                      height + "','" + weight + "','" + school + "','" + senkou + "','" + address + "')";
                                              System.out.println(sql);
                                              Statement stmt = conn.createStatement();
                                              int a = stmt.executeUpdate(sql);
                                              if (a == 1)
                                              {
                                                  System.out.println("插入成功");
                                              }
                                              else
                                              {
                                                  System.out.println("插入失败");
                                              }
                                          }
                                          catch (Exception ex)
                                          {
                                              ex.printStackTrace();
                                          }
                                          // 关闭数据库连接
                                          try
                                          {
                                              conn.close();
                                          }
                                          catch (Exception ex)
                                          {
                                              ex.printStackTrace();
                                          }


                                      }

                                  }


        );

        gbc.gridx = 3;//3列
        gbc.gridy = 7;//7行
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(button2, gbc);
        c1.add(button2);


        menufile.add(itemopen);
        menufile.add(itemsave);
        menufile.add(itemcolse);
        menuedit.add(itemxian);
        menuedit.add(itemyin);
        bar1.add(menufile);
        bar1.add(menuedit);

        setJMenuBar(bar1);

        //显示
        setVisible(true);
        //show();
    }


    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        MyFrame2 my1 = new MyFrame2();
        my1.show();
        my1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
	
	