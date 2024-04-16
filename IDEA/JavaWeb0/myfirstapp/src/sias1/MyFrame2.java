package sias1;
//����

import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import bean.StudentBean;
import manage.DatabaseManage;

import javax.swing.JComboBox;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MyFrame2 extends JFrame
{

    //��������
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
    String[] schools = {"֣�ݴ�ѧ", "���ϴ�ѧ", "���ϿƼ���ѧ", "���Ϲ�ҵ��ѧ", "sias"};
    JComboBox combo1;
    JLabel labeljob;
    String[] xbs = {"�������ѧ�뼼��", "��ý��", "������Ϣ����", "�����ά��", "computer"};
    JComboBox combo2;
    JButton button1;
    JButton button2, button3;
    JButton button4, button5;
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
        setTitle("ѧ����Ϣ����ϵͳ2");
        setSize(380, 300);
        //setResizable(true);
        ImageIcon icon = new ImageIcon("image/winter.jpg");
        Image image1 = icon.getImage();
        setIconImage(image1);
        GridBagLayout gb1 = new GridBagLayout();//���������
        GridBagConstraints gbc = new GridBagConstraints();//Լ��������  �ܼ�
        //�½���ǩ
        labelname = new JLabel("����");


        labelage = new JLabel("����");
        labelsg = new JLabel("���");
        labeltz = new JLabel("����");
        labeladdress = new JLabel("��ͥסַ");
        labelschool = new JLabel("��ѡ��ѧУ");
        //labeljob=new JLabel("��ѡ��רҵ");
        labelxb = new JLabel("��ѡ��ϵ��");

        //�½��ı���
        textname = new JTextField(10);
        textage = new JTextField(10);
        textsg = new JTextField(10);
        texttz = new JTextField(10);
        textaddress = new JTextField(10);

        //�½��б��
        combo1 = new JComboBox(schools);

        list1 = new JList(xbs);

        //�½���ť
        button1 = new JButton("ע��");
        button2 = new JButton("ɾ��");
        button3 = new JButton("��ѯ");
        button4 = new JButton("�޸�");
        button5 = new JButton("���");
        //�˵���
        bar1 = new JMenuBar();
        menufile = new JMenu("�ļ�(F)");
        itemopen = new JMenuItem("��");
        itemsave = new JMenuItem("����");
        itemcolse = new JMenuItem("�ر�");
        menuedit = new JMenu("�༭(E)");
        itemxian = new JMenuItem("��ʾ");
        itemyin = new JMenuItem("����");


        //�õ����ڵ����ݴ���
        Container c1 = getContentPane();
        c1.setLayout(gb1);

        gbc.gridx = 1;//1��
        gbc.gridy = 1;//1��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelname, gbc);
        c1.add(labelname);


        gbc.gridx = 2;//2��
        gbc.gridy = 1;//1��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(textname, gbc);
        c1.add(textname);


        gbc.gridx = 3;//3��
        gbc.gridy = 1;//1��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelage, gbc);
        c1.add(labelage);

        gbc.gridx = 4;//1��
        gbc.gridy = 1;//1��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(textage, gbc);
        c1.add(textage);


        gbc.gridx = 1;//1��
        gbc.gridy = 2;//2��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelsg, gbc);
        c1.add(labelsg);


        gbc.gridx = 2;//2��
        gbc.gridy = 2;//2��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(textsg, gbc);
        c1.add(textsg);


        gbc.gridx = 3;//2��
        gbc.gridy = 2;//2��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labeltz, gbc);

        c1.add(labeltz);


        gbc.gridx = 4;//4��
        gbc.gridy = 2;//2��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(texttz, gbc);
        c1.add(texttz);

        gbc.gridx = 1;//1��
        gbc.gridy = 3;//3��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labeladdress, gbc);
        c1.add(labeladdress);

        gbc.gridx = 2;//2��
        gbc.gridy = 3;//3��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(textaddress, gbc);
        c1.add(textaddress);

        gbc.gridx = 1;//1��
        gbc.gridy = 4;//4��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelschool, gbc);
        c1.add(labelschool);

        gbc.gridx = 2;//2��
        gbc.gridy = 4;//4��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(combo1, gbc);
        c1.add(combo1);


        gbc.gridx = 1;//1��
        gbc.gridy = 5;//5��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(labelxb, gbc);
        //������
        c1.add(labelxb);


        list1.setVisibleRowCount(1);
        JScrollPane jp1 = new JScrollPane(list1);


        gbc.gridx = 2;//2��
        gbc.gridy = 5;//6��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(jp1, gbc);
        c1.add(jp1);


        gbc.gridx = 3;//2��
        gbc.gridy = 5;//7��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(button4, gbc);
        c1.add(button4);


        button4.addActionListener(new ActionListener()
                                  {

                                      public void actionPerformed(ActionEvent e)
                                      {

                                          String name3 = textname.getText().trim();
                                          String address3 = textaddress.getText().trim();
                                          System.out.println("name3:" + name3 + "a");
                                          System.out.println(address3);
                                          if (name3.equals("") && address3.equals(""))
                                          {
                                              JOptionPane.showMessageDialog(null, "���������޸ĵ����֣��ٵ����ѯ��ť���ٽ����޸�");
                                              return;

                                          }

                                          String name1 = textname.getText().trim();
                                          String age1 = textage.getText().trim();
                                          String tall1 = textsg.getText().trim();
                                          String weight1 = texttz.getText().trim();
                                          String address1 = textaddress.getText().trim();
                                          String school1 = (String) combo1.getSelectedItem();
                                          String depart1 = (String) list1.getSelectedValue();

                                          System.out.println(name1);
                                          System.out.println(depart1);


                                          String driver = "org.gjt.mm.mysql.Driver";
                                          //����MySQL���ݿ�����ӵ�ַ
                                          String url = "jdbc:mysql://localhost:3306/sias1?user='root';password='root'";
                                          //����������
                                          Connection conn = null;
                                          try
                                          {
                                              //ʹ��JDBC�����������ݿ�����
                                              Class.forName(driver);
                                              //ʹ��DriverManager���getConnection()������������,��һ���ַ����������û���,
                                              //�ڶ����ַ�������������
                                              conn = DriverManager.getConnection(url, "root", "root");
                                              if (conn != null)
                                              {
                                                  System.out.println("�ɹ�����JDBC����Դ.");
                                              }

                                              String sql1 = "update student set name='" + name1 + "',age=" + age1 + ",tall=" + tall1 + ",address='" + address1 + "',school='" + school1 + "',depart='" + depart1 + "'" + "where name='" + name1 + "'";

                                              System.out.println(sql1);
                                              Statement stmt = conn.createStatement();
                                              int a = stmt.executeUpdate(sql1);
                                              if (a == 1)
                                                  System.out.println("update insert!");

                                          }
                                          catch (Exception ex)
                                          {
                                              ex.printStackTrace();
                                          }
                                          try
                                          {
                                              //�ر����ݿ�������
                                              conn.close();
                                          }
                                          catch (Exception ex)
                                          {
                                              ex.printStackTrace();
                                          }


                                      }

                                  }
        );

        gbc.gridx = 4;//2��
        gbc.gridy = 5;//7��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(button5, gbc);
        c1.add(button5);


        button5.addActionListener(new ActionListener()
                                  {

                                      public void actionPerformed(ActionEvent e)
                                      {
                                          textname.setText("");
                                          textsg.setText("");
                                          textage.setText("");
                                          textaddress.setText("");
                                          combo1.setSelectedIndex(0);
                                          list1.setSelectedValue("��ý��", true);
                                      }
                                  }
        );


        //��ť
        gbc.gridx = 2;//2��
        gbc.gridy = 7;//7��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(button1, gbc);
        c1.add(button1);
        button1.addActionListener(new ActionListener()
                                  {

                                      public void actionPerformed(ActionEvent e)
                                      {
                                          String name1 = textname.getText().trim();
                                          String age1 = textage.getText().trim();
                                          String tall1 = textsg.getText().trim();
                                          String weight1 = texttz.getText().trim();
                                          String address1 = textaddress.getText().trim();
                                          String school1 = (String) combo1.getSelectedItem();
                                          String depart1 = (String) list1.getSelectedValue();

                                          System.out.println(name1);
                                          System.out.println(depart1);

                                          StudentBean stu1 = new StudentBean();
                                          stu1.setName(name1);
                                          stu1.setAge(Integer.parseInt(age1));


                                          stu1.setDepart(depart1);

                                          DatabaseManage dm1 = new DatabaseManage();
                                          boolean a = dm1.insert(stu1);
                                          if (a)
                                              System.out.println("insert success");
                                          else
                                              System.out.println("insert failure");


//			    String driver = "org.gjt.mm.mysql.Driver";
//			    //����MySQL���ݿ�����ӵ�ַ
//			    String url = "jdbc:mysql://localhost:3306/sias1?user='root';password='root'";
//			    //����������
//			    Connection conn = null;
//			    try{
//			      //ʹ��JDBC�����������ݿ�����
//			      Class.forName(driver);
//			      //ʹ��DriverManager���getConnection()������������,��һ���ַ����������û���,
//			      //�ڶ����ַ�������������
//			      conn = DriverManager.getConnection(url, "root", "root");
//			      if(conn != null){
//			        System.out.println("�ɹ�����JDBC����Դ.");
//			      }
//			      
//			      String sql1="insert into student values('"+name1+"',"+age1+","+weight1+","+tall1+",'"+address1+"','"+school1+"','"+depart1+"')";			      System.out.println(sql1);
//			      Statement stmt=conn.createStatement();
//			      int a=stmt.executeUpdate(sql1);
//			      if(a==1)
//			    	  System.out.println("�ɹ�ע��!");
//			       
//			    }catch(Exception ex){
//			      ex.printStackTrace();
//			    }
//			    try{
//			      //�ر����ݿ�������
//			      conn.close();
//			    }catch(Exception ex){
//			      ex.printStackTrace();
//			    }
//				

                                      }

                                  }


        );

        gbc.gridx = 3;//3��
        gbc.gridy = 7;//7��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(button2, gbc);
        c1.add(button2);


        button2.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                String name1 = textname.getText().trim();
                System.out.println(name1);

                //�������ݿ����ӵ���������
                String driver = "org.gjt.mm.mysql.Driver";
                //����MySQL���ݿ�����ӵ�ַ
                String url = "jdbc:mysql://localhost:3306/sias1?user='root';password='root'";
                //����������
                Connection conn = null;
                try
                {
                    //ʹ��JDBC�����������ݿ�����
                    Class.forName(driver);
                    //ʹ��DriverManager���getConnection()������������,��һ���ַ����������û���,
                    //�ڶ����ַ�������������
                    conn = DriverManager.getConnection(url, "root", "root");
                    if (conn != null)
                    {
                        System.out.println("�ɹ�����JDBC����Դ.");
                    }

                    String sql1 = "delete from student where name='" + name1 + "'";
                    System.out.println(sql1);
                    Statement stmt = conn.createStatement();
                    int a = stmt.executeUpdate(sql1);
                    if (a == 1)
                        System.out.println("delete sucess");

                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
                try
                {
                    //�ر����ݿ�������
                    conn.close();
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }


            }
        });


        gbc.gridx = 4;//4��
        gbc.gridy = 7;//7��
        gbc.weightx = 1;
        gbc.weighty = 1;
        gb1.setConstraints(button3, gbc);
        c1.add(button3);

        button3.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                String name1 = textname.getText().trim();
                System.out.println(name1);

                DatabaseManage dm1 = new DatabaseManage();
                StudentBean stu2 = dm1.query(name1);
                textname.setText(stu2.getName());
                textage.setText(stu2.getAge() + "");
                textsg.setText(stu2.getTall() + "");
                texttz.setText(stu2.getWeight() + "");
                textaddress.setText(stu2.getAddress());

            }
        });

        menufile.add(itemopen);
        menufile.add(itemsave);
        menufile.add(itemcolse);
        menuedit.add(itemxian);
        menuedit.add(itemyin);
        bar1.add(menufile);
        bar1.add(menuedit);

        setJMenuBar(bar1);

        //��ʾ
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
	
	