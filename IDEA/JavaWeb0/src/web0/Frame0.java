package web0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.BorderLayout.*;

public class Frame0 extends JFrame
{
    JLabel label0, label1, label2, label3, label4, label5, label6, label7, label8, label9;
    JTextField text0, text1, text2, text3, text4, text5;
    JButton button0, button1;
    JRadioButton radio0, radio1, sex0, sex1, sex2;
    ButtonGroup group0, groupSex;

    public Frame0()
    {
        setSize(400, 300);
        setTitle("Frame0");
        setVisible(true);
        ImageIcon icon0 = new ImageIcon("img\\icon0.png");
        Image image0 = icon0.getImage();
        setIconImage(image0);
        setVisible(true);

        group0 = new ButtonGroup();
        groupSex = new ButtonGroup();
        label0 = new JLabel("用户名");
        text0 = new JTextField(10);
        label1 = new JLabel("密码");
        text1 = new JTextField(12);
        label2 = new JLabel("确认密码");
        text2 = new JTextField(12);
        label3 = new JLabel("性别");
        sex0 = new JRadioButton("男");
        sex1 = new JRadioButton("女");
        sex2 = new JRadioButton("其他");
        text3 = new JTextField(1);
        label4 = new JLabel("爱好");
        text4 = new JTextField(12);
        label5 = new JLabel("Email");
        text5 = new JTextField(25);
        label6 = new JLabel("学院");
        radio0 = new JRadioButton("电子信息工程学院");
        radio1 = new JRadioButton("计算机与软件工程学院");
        button0 = new JButton("确定");
        button1 = new JButton("取消");
        Container c0 = getContentPane();
        c0.setLayout(new FlowLayout());
        c0.add(label0, CENTER);
        c0.add(text0, CENTER);
        c0.add(label1, CENTER);
        c0.add(text1, CENTER);
        c0.add(label2, CENTER);
        c0.add(text2, CENTER);
        c0.add(label3, CENTER);
        groupSex.add(sex0);
        groupSex.add(sex1);
        groupSex.add(sex2);
        c0.add(sex0, CENTER);
        c0.add(sex1, CENTER);
        c0.add(sex2, CENTER);
        c0.add(label4, CENTER);
        c0.add(text4, CENTER);
        c0.add(label5, CENTER);
        c0.add(text5, CENTER);
        c0.add(label6, CENTER);
        group0.add(radio0);
        group0.add(radio1);
        c0.add(radio0, CENTER);
        c0.add(radio1, CENTER);
        c0.add(button0, SOUTH);
        c0.add(button1, SOUTH);
        button0.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (text0.getText().trim().equals("abc") && text1.getText().trim().equals("123"))
                {
                    JOptionPane.showMessageDialog(null, "登录成功");
                    Frame1 f1 = new Frame1();
                    f1.show();
                    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else
                {
                    JOptionPane.showMessageDialog(null, "登录失败");
                }
            }
        });
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }

        });

    }

    public static void main(String[] ars)
    {
        Frame0 mf0 = new Frame0();
        mf0.show();
        Frame0.setDefaultLookAndFeelDecorated(JFrame.EXIT_ON_CLOSE);
    }

    private static void setDefaultLookAndFeelDecorated(int ignoredExitOnClose)
    {
    }
}
