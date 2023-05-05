package com.Moonhalf;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;

public class Login{
    public static int[] i = {0};
    static String[] Username = new String[5];
    static String[] Password = new String[5];
    static String[] Age = new String[5];
    static String[] Gender = new String[5];
    static String[] Address = new String[5];

    public static void main(String[] args) {

        //创建登录窗口
        JFrame jFrame = new JFrame("登录");

        //设置窗口大小
        jFrame.setSize(800,500);

        //将布局管理器置为null
        jFrame.setLayout(null);

        //添加标签【Escape】
        JLabel escape = new JLabel("Escape");
        escape.setForeground(Color.cyan);//设置字体颜色
        escape.setFont(new Font("Cascadia Code", Font.PLAIN,50));
        escape.setBounds(300,50,800,100);
        jFrame.add(escape);

        //添加标签【用户名】
        JLabel textUser = new JLabel("用户名:");
        textUser.setForeground(Color.pink);
        textUser.setFont(new Font("黑体", Font.PLAIN,30));
        textUser.setBounds(200,140,200,100);
        jFrame.add(textUser);

        //添加用户名输入框 user
        JTextField user = new JTextField(20);
        user.setFont(new Font("黑体", Font.PLAIN,19));
        user.setSelectedTextColor(new Color(0xFF0000));
        user.setBounds(330,170,281,40);
        jFrame.add(user);

        //添加标签【密码】 textPassword
        JLabel textPassword = new JLabel("  密码:");
        textPassword.setForeground(Color.pink);
        textPassword.setFont(new Font("黑体", Font.PLAIN,30));
        textPassword.setBounds(200,200,200,100);
        jFrame.add(textPassword);

        //添加密码输入框 password
        JPasswordField password = new JPasswordField(20);
        password.setBounds(330,230,281,40);
        jFrame.add(password);

        //添加登录按钮
        JButton Button = new JButton("登录");
        Button.setForeground(new Color(0x023BF6));
        Button.setBackground(new Color(0x38FF00));
        Button.setFont(new Font("黑体", Font.PLAIN,20));
        Button.setBorderPainted(false);
        Button.setBounds(450,330,100,50);
        jFrame.add(Button);


        //添加CheckBox
        JCheckBox cm = new JCheckBox("Cheating mode");
        cm.setBounds(200,330,200,50);
        cm.setFont(new Font("等线", Font.PLAIN,20));
        jFrame.add(cm);


        //添加登录按钮事件
        Button.addActionListener((e -> {
            //CheckBox判断
            if(cm.isSelected()){
                i[0]++;
            }

            //数据库数据读取
            Connection connection=JdbcUtil.getConnection();
            Statement statement = null;
            try {
                assert connection != null;
                statement = connection.createStatement();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            //返回结果集
            String sql = "SELECT *FROM user;";
            ResultSet resultSet = null;
            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            int i = 0;
            while(true){
                try {
                    if (!resultSet.next()) break;
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    System.out.println("username="+resultSet.getString("username"));
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    System.out.println("password="+resultSet.getString("password"));
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    Username[i] = resultSet.getString("username");
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    Password[i] = resultSet.getString("password");
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    Age[i] = resultSet.getString("age");
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    Gender[i] = resultSet.getString("gender");
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    Address[i] = resultSet.getString("address");
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                i++;
            }

            //设定条件
            String pwd = new String(password.getPassword());
            //n->只要数据库里有一个账号密码对上了就可以进
            //m->数据库里目前只放了两个账号所以只读两个（好吧保险起见弄五个）
            int m = 0;
            int n = 0;
            while(m < 5) {
                if (user.getText().equals(Username[m])) {
                    if (pwd.equals(Password[m])) {
                        n++;
                        //将登录界面设为不可见
                        jFrame.setVisible(false);
                        //账号和密码正确,进入游戏
                        EscapeApp.main(args);
                    }
                }
                m++;
            }
            //账号或密码错误，不给进，清空帐户和密码框
            if(n == 0){
                JOptionPane.showMessageDialog(jFrame, "用户名或密码错误", "提示", JOptionPane.INFORMATION_MESSAGE);
                user.setText("");
                password.setText("");
            }
        }));

        //设置窗体的位置在屏幕中间
        jFrame.setLocationRelativeTo(null);

        //禁止调整窗口大小
        jFrame.setResizable(false);

        //设置窗口为可见
        jFrame.setVisible(true);

        //使用窗口关闭按钮 能够正常退出
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}