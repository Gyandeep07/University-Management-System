package University;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class Login extends JFrame implements ActionListener{
    JTextField tfusername,tfpass;
     
    JButton login,cancle;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel lb1username=new JLabel("Username:");
        lb1username.setBounds(40,20,100,20);
        add(lb1username);
 tfusername=new JTextField();
tfusername.setBounds(150,20,150,20);
add(tfusername);

 JLabel lb1pass=new JLabel("Password:");
        lb1pass.setBounds(40,70,100,20);
        add(lb1pass);
 tfpass=new JPasswordField();
tfpass.setBounds(150,70,150,20);

add(tfpass);

 login=new JButton("Login");
login.setBounds(40,140,120,30);
login.setBackground(Color.black);
login.setForeground(Color.WHITE);
login.addActionListener(this);
login.setFont(new Font( "Tahoma",Font.BOLD,15));
add(login);


 cancle=new JButton("Cancel");
cancle.setBounds(180,140,120,30);
cancle.setBackground(Color.black);
cancle.setForeground(Color.WHITE);
cancle.addActionListener(this);

cancle.setFont(new Font( "Tahoma",Font.BOLD,15));
add(cancle);

ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("University//icons//second.jpg"));
Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT); 
 ImageIcon i3=new ImageIcon(i2);
JLabel image=new JLabel(i3);
image.setBounds(350,0,200,200);
  add(image);

setSize(600,300);
setLocation(500,250);
setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
String username=tfusername.getText();
String password=tfpass.getText();
  String query="select * from login where username='"+username+"' and password='"+password+"'";

       try {
        conn c=new conn();
      ResultSet rs=  c.s.executeQuery(query);
      if(rs.next()){
setVisible(false);
new Project();
      }else{
        JOptionPane.showMessageDialog(null ,"Invalid username or password");
setVisible(false);

      }
      // c.s.close();
        
       } catch (Exception e) {
        e.printStackTrace();
       }
}else if(ae.getSource()==cancle){
setVisible(false);
        }

    }
    public static void main(String[] args) {
        new Login();
    }
}
