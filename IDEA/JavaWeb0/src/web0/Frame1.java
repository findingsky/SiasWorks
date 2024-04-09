package web0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.BorderLayout.*;
public class Frame1 extends Frame0
{

        JLabel labelName;
        JTextField textName;
        JLabel labelSchool=new JLabel("School");
        String[] school = {"ѧ", "ѧ", "ѧ", "ѧ", "ѧ"};
        JComboBox comboSchool = new JComboBox(school);
        JLabel labelSenkou=new JLabel("专业");
        String[] senkou = {"", "", "", "", ""};
        JList list0=new JList(senkou);
        JMenuBar bar0=new JMenuBar();
        JMenu menuFile=new JMenu("file"), menuFind;
        JMenuItem itemOpen=new JMenuItem("open"), itemSave, itemExit, itemFind, itemReplace;
        JButton button0;
        JLabel labelAddress;
        JTextField textAddress;
        JTextField textSchool;


   public Frame1(){
        setTitle("sias2222");
        setSize(500,300);
       Container c0 = getContentPane();
       c0.add(button0);
       c0.add(labelSchool);
       c0.add(comboSchool);
       c0.add(labelSenkou);
       list0.setVisibleRowCount(1);
       JScrollPane jp0=new JScrollPane(list0);
       c0.add(jp0);
       menuFile.add(itemOpen);
       bar0.add(menuFile);
       setJMenuBar(bar0);
       setVisible(true);
   }
}
