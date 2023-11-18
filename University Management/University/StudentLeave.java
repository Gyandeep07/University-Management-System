package University;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import com.toedter.calendar.JDateChooser;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StudentLeave extends JFrame implements ActionListener{
Choice crollno,ctime;
JDateChooser dcdate;
JButton submit,cancal;
    StudentLeave(){
setSize(500,550);
setLocation(550,100);
getContentPane().setBackground(Color.WHITE);
 setLayout(null);
        JLabel heading=new JLabel("Apply Leave (Student)");
        heading.setBounds(40,50,300,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        add(heading);
         JLabel lb1rollno=new JLabel("Search by Roll Number");
        lb1rollno.setBounds(60,100,200,20);
        lb1rollno.setFont(new Font("Tahoma",Font.PLAIN,18));

        add(lb1rollno);

crollno=new Choice();
crollno.setBounds(60,130,200,20);
add(crollno);
try {
    conn c=new conn();
    ResultSet rs=c.s.executeQuery("select * from student");
    while (rs.next()) {
        crollno.add(rs.getString("rollno"));
    }
} catch (Exception e) {
    e.printStackTrace();
}
 JLabel lb1date=new JLabel("Date");
        lb1date.setBounds(60,180,200,20);
        lb1date.setFont(new Font("Tahoma",Font.PLAIN,18));

        add(lb1date);
        dcdate=new JDateChooser();
        dcdate.setBounds(60,210,200,25);
        add(dcdate);

          JLabel lb1time=new JLabel("Time Duration");
        lb1time.setBounds(60,260,200,20);
        lb1time.setFont(new Font("Tahoma",Font.PLAIN,18));

        add(lb1time);

ctime=new Choice();
ctime.setBounds(60,290,200,20);
ctime.add("Full Day");
ctime.add("Half Day");

add(ctime);
 submit=new JButton("SUBMIT");
                submit.setBounds(60,350,100,25);
                submit.setBackground(Color.black);
                submit.setForeground(Color.WHITE);
                submit.addActionListener(this);
                submit.setFont(new Font( "serif",Font.BOLD,15));
                add(submit);

                cancal=new JButton("CANCEL");
                cancal.setBounds(200,350,100,25);
                cancal.setBackground(Color.black);
                cancal.setForeground(Color.WHITE);
                cancal.addActionListener(this);
                cancal.setFont(new Font( "serif",Font.BOLD,15));
                add(cancal);

setVisible(true);
    } public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
         String rollno=crollno.getSelectedItem();
         String date=((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
         String duration=ctime.getSelectedItem();
         String query="insert into studentleave values('"+rollno+"','"+date+"','"+duration+"')";
         try {
            conn c=new conn();
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Leave Confirmed");
            setVisible(false);
         } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
         }
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new StudentLeave();
    }
}
