package University;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Marks extends JFrame implements ActionListener{
    String rollno;
    JButton cancal;
    Marks(String rollno){
this.rollno=rollno;
setSize(500,600);
setLocation(500,100);
 setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        JLabel heading=new JLabel("AKTU University Lucknow");
        heading.setBounds(100,10,500,25);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        add(heading);
         JLabel subheading=new JLabel("Result of Examination 2023");
        subheading.setBounds(100,50,500,20);
        subheading.setFont(new Font("Tahoma",Font.BOLD,18));
        add(subheading);
        
         JLabel ldlrollno=new JLabel("Roll Number "+rollno);
        ldlrollno.setBounds(60,100,500,20);
        ldlrollno.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(ldlrollno);
        JLabel lblsemester=new JLabel();
        lblsemester.setBounds(60,130,500,20);
        lblsemester.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lblsemester);
       JLabel sub1=new JLabel();
       sub1.setBounds(100,200,500,20);
       sub1.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(sub1);
        JLabel sub2=new JLabel();
       sub2.setBounds(100,230,500,20);
       sub2.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(sub2);
        JLabel sub3=new JLabel();
       sub3.setBounds(100,260,500,20);
       sub3.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(sub3);
        JLabel sub4=new JLabel();
       sub4.setBounds(100,290,500,20);
       sub4.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(sub4);
        JLabel sub5=new JLabel();
       sub5.setBounds(100,320,500,20);
       sub5.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(sub5);

       try {
        conn c=new conn();
        ResultSet rs1=c.s.executeQuery("select * from subject where rollno='"+rollno+"'");
        while (rs1.next()) {
            sub1.setText(rs1.getString("subject1"));
            sub2.setText(rs1.getString("subject2"));
            sub3.setText(rs1.getString("subject3"));
            sub4.setText(rs1.getString("subject4"));
            sub5.setText(rs1.getString("subject5"));

        }
         ResultSet rs2=c.s.executeQuery("select * from marks where rollno='"+rollno+"'");
          while (rs2.next()) {
            sub1.setText(sub1.getText()+"---------"+rs2.getString("marks1"));
             sub2.setText(sub2.getText()+"---------"+rs2.getString("marks2"));
            sub3.setText(sub3.getText()+"---------"+rs2.getString("marks3"));
            sub4.setText(sub4.getText()+"---------"+rs2.getString("marks4"));
            sub5.setText(sub5.getText()+"---------"+rs2.getString("marks5"));
            lblsemester.setText("Semester "+rs2.getString("semester") );
          }
       } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
       }
        cancal=new JButton("Back");
                cancal.setBounds(250,500,120,25);
                cancal.setBackground(Color.black);
                cancal.setForeground(Color.WHITE);
                cancal.addActionListener(this);
                cancal.setFont(new Font( "serif",Font.BOLD,15));
                add(cancal);


setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[] args) {
        new Marks("");
    }
}
