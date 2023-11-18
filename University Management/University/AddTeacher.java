package University;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
public class AddTeacher extends JFrame implements ActionListener {
    JTextField tfname,tffname,dob,tfaddress,tfphone,tfxii,tfx,tfemail,tfaadhar;
    JLabel labelempId;
    JDateChooser dcdob;
    JButton submit,cancal;
    JComboBox cbcourse,cbbranch;
    Random ran=new Random();
    long first4=Math.abs((ran.nextLong() % 9000L)+1000L);
    AddTeacher(){
        setSize(900,700);
                setLocation(350,50);
                setLayout(null);
                JLabel heading=new JLabel("New Teacher Details");
                heading.setBounds(310,30,500,50);
                heading.setFont(new Font("serif",Font.BOLD,30));
                add(heading);

                 JLabel lb1name=new JLabel("Name");
                lb1name.setBounds(50,150,100,30);
                lb1name.setFont(new Font("serif",Font.BOLD,20));
                add(lb1name);

                tfname=new JTextField();
                tfname.setBounds(200,150,150,30);
                add(tfname);

                  JLabel lb1fname=new JLabel("Father's Name");
                lb1fname.setBounds(400,150,200,30);
                lb1fname.setFont(new Font("serif",Font.BOLD,20));
                add(lb1fname);

                tffname=new JTextField();
                tffname.setBounds(600,150,150,30);
                add(tffname);

                  JLabel lb1empId=new JLabel("Employee Id");
                lb1empId.setBounds(50,200,200,30);
                lb1empId.setFont(new Font("serif",Font.BOLD,20));
                add(lb1empId);

                  labelempId=new JLabel("101"+first4);
                labelempId.setBounds(200,200,200,30);
                labelempId.setFont(new Font("serif",Font.BOLD,20));
                add(labelempId);

                 JLabel lb1dob=new JLabel("Date Of Birth ");
                lb1dob.setBounds(400,200,200,30);
                lb1dob.setFont(new Font("serif",Font.BOLD,20));
                add(lb1dob);
                
                dcdob=new JDateChooser();
                dcdob.setBounds(600,200,150,30);
                add(dcdob);
                
                 JLabel lb1address=new JLabel("Address");
                lb1address.setBounds(50,250,200,30);
                lb1address.setFont(new Font("serif",Font.BOLD,20));
                add(lb1address);

                tfaddress=new JTextField();
                tfaddress.setBounds(200,250,150,30);
                add(tfaddress);

                JLabel lb1phone=new JLabel("Phone");
                lb1phone.setBounds(400,250,200,30);
                lb1phone.setFont(new Font("serif",Font.BOLD,20));
                add(lb1phone);

                tfphone=new JTextField();
                tfphone.setBounds(600,250,150,30);
                add(tfphone);

                 JLabel lb1email=new JLabel("Email Id");
                lb1email.setBounds(50,300,200,30);
                lb1email.setFont(new Font("serif",Font.BOLD,20));
                add(lb1email);

                tfemail=new JTextField();
                tfemail.setBounds(200,300,150,30);
                add(tfemail);

                JLabel lb1x=new JLabel("Class 10th (%)");
                lb1x.setBounds(400,300,200,30);
                lb1x.setFont(new Font("serif",Font.BOLD,20));
                add(lb1x);

                tfx=new JTextField();
                tfx.setBounds(600,300,150,30);
                add(tfx);

                 JLabel lb1xii=new JLabel("Class 12th (%)");
                lb1xii.setBounds(50,350,200,30);
                lb1xii.setFont(new Font("serif",Font.BOLD,20));
                add(lb1xii);

                tfxii=new JTextField();
                tfxii.setBounds(200,350,150,30);
                add(tfxii);

                  JLabel lb1aadhar=new JLabel("Aadhar Number");
                lb1aadhar.setBounds(400,350,200,30);
                lb1aadhar.setFont(new Font("serif",Font.BOLD,20));
                add(lb1aadhar);

                tfaadhar=new JTextField();
                tfaadhar.setBounds(600,350,150,30);
                add(tfaadhar);

                JLabel lb1course=new JLabel("Qualification ");
                lb1course.setBounds(50,400,200,30);
                lb1course.setFont(new Font("serif",Font.BOLD,20));
                add(lb1course);
                String course[]={"B.Tech","BBA","BCA","MBA","MCA","Msc","Bsc","BCom","MA"};
                cbcourse= new JComboBox<>(course);
                cbcourse.setBounds(200,400,150,30);
                cbcourse.setBackground(Color.WHITE);
                add(cbcourse);

                JLabel lb1branch=new JLabel("Department ");
                lb1branch.setBounds(400,400,200,30);
                lb1branch.setFont(new Font("serif",Font.BOLD,20));
                add(lb1branch);
                String branch[]={"Computer Science","Electronics","Machanical","Civil","IT"};
                cbbranch= new JComboBox<>(branch);
                cbbranch.setBounds(600,400,150,30);
                cbbranch.setBackground(Color.WHITE);
                add(cbbranch);

                submit=new JButton("SUBMIT");
                submit.setBounds(250,550,120,30);
                submit.setBackground(Color.black);
                submit.setForeground(Color.WHITE);
                submit.addActionListener(this);
                submit.setFont(new Font( "serif",Font.BOLD,15));
                add(submit);

                cancal=new JButton("CANCEL");
                cancal.setBounds(450,550,120,30);
                cancal.setBackground(Color.black);
                cancal.setForeground(Color.WHITE);
                cancal.addActionListener(this);
                cancal.setFont(new Font( "serif",Font.BOLD,15));
                add(cancal);




                setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==submit){
String name=tfname.getText();
String fname=tffname.getText();
String rollno=labelempId.getText();
String dob=((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
String address=tfaddress.getText();
String phone=tfphone.getText();
String email=tfemail.getText();
String x=tfx.getText();
String xii=tfxii.getText();
String aadhar=tfaadhar.getText();
String course=(String) cbcourse.getSelectedItem();
String branch=(String) cbbranch.getSelectedItem();

try {
  String query="insert into teacher values('"+name+"','"+fname+"','"+rollno+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+x+"','"+xii+"','"+aadhar+"','"+course+"','"+branch+"') ";
  conn con=new conn();
  con.s.executeUpdate(query);
  JOptionPane.showMessageDialog(null,"Teacher Details Inserted Successfully");
  setVisible(false);

} catch (Exception e) {
  e.printStackTrace();
 
}
      }else{
        setVisible(false);
      }
    }
public static void main(String[] args) {
    new AddTeacher();
}
    
}
