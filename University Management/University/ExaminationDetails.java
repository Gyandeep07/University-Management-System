package University;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;

import net.proteanit.sql.DbUtils;

public class ExaminationDetails extends JFrame implements ActionListener{
    JTextField search;
    JButton submit,cancal;
    JTable table;
    ExaminationDetails(){

        setSize(1000,475);
        setLocation(300,100);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        JLabel heading=new JLabel("Check Results");
        heading.setBounds(80,15,400,50);
        heading.setFont(new Font("Tahoma",Font.BOLD,25));
        add(heading);
search=new JTextField();
search.setBounds(80,90,200,30);
search.setFont(new Font("Tahoma",Font.PLAIN,18));
add(search);
 submit=new JButton("Result");
                submit.setBounds(300,90,120,30);
                submit.setBackground(Color.black);
                submit.setForeground(Color.WHITE);
                submit.addActionListener(this);
                submit.setFont(new Font( "serif",Font.BOLD,15));
                add(submit);

                cancal=new JButton("Back");
                cancal.setBounds(440,90,120,30);
                cancal.setBackground(Color.black);
                cancal.setForeground(Color.WHITE);
                cancal.addActionListener(this);
                cancal.setFont(new Font( "serif",Font.BOLD,15));
                add(cancal);

table=new JTable();
table.setFont(new Font("Tahoma",Font.PLAIN,16));
JScrollPane jsp=new JScrollPane(table);
jsp.setBounds(0,130,1000,310);
add(jsp);
try {
    conn c=new conn();
ResultSet rs=c.s.executeQuery("select * from student");
table.setModel(DbUtils.resultSetToTableModel(rs));

} catch (Exception e) {
    // TODO: handle exception
    e.printStackTrace();
}

table.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent me){
int row=table.getSelectedRow();
search.setText(table.getModel().getValueAt(row, 2).toString());
    }
});


        setVisible(true);
    } 
    public void actionPerformed(ActionEvent ae){
if(ae.getSource()==submit){
    setVisible(false);
new Marks(search.getText());
}else{
    setVisible(false);
}
    }
    public static void main(String[] args) {
        new ExaminationDetails();
    }
}
