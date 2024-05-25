package sias1;

import bean.StudentBean;

import javax.swing.*;
import java.awt.*;

public class StudentView {
    private JTextField textName;
    private JTextField textAge;
    private JTextField textTall;
    private JTextField textWeight;
    private JTextField textAddress;
    private JComboBox<String> comboSchool;
    private JList<String> listDepartment;

    public StudentView() {
        JFrame frame = new JFrame("Student Information");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(7, 2));

        container.add(new JLabel("Name:"));
        textName = new JTextField();
        container.add(textName);

        container.add(new JLabel("Age:"));
        textAge = new JTextField();
        container.add(textAge);

        container.add(new JLabel("Tall:"));
        textTall = new JTextField();
        container.add(textTall);

        container.add(new JLabel("Weight:"));
        textWeight = new JTextField();
        container.add(textWeight);

        container.add(new JLabel("Address:"));
        textAddress = new JTextField();
        container.add(textAddress);

        container.add(new JLabel("School:"));
        comboSchool = new JComboBox<>(new String[]{"School1", "School2", "School3"});
        container.add(comboSchool);

        container.add(new JLabel("Department:"));
        listDepartment = new JList<>(new String[]{"Department1", "Department2", "Department3"});
        JScrollPane scrollPane = new JScrollPane(listDepartment);
        container.add(scrollPane);

        frame.setVisible(true);
    }

    public JTextField getTextName() {
        return textName;
    }

    public JTextField getTextAge() {
        return textAge;
    }

    public JTextField getTextTall() {
        return textTall;
    }

    public JTextField getTextWeight() {
        return textWeight;
    }

    public JTextField getTextAddress() {
        return textAddress;
    }

    public JComboBox<String> getComboSchool() {
        return comboSchool;
    }

    public JList<String> getListDepartment() {
        return listDepartment;
    }
    public void updateView(StudentBean model) {
        // 使用模型数据更新视图的逻辑
        textName.setText(model.getName());
        textAge.setText(String.valueOf(model.getAge()));
        textTall.setText(String.valueOf(model.getTall()));
        textWeight.setText(String.valueOf(model.getWeight()));
        textAddress.setText(model.getAddress());
        comboSchool.setSelectedItem(model.getSchool());
        listDepartment.setSelectedValue(model.getDepart(), true);
    }
}
