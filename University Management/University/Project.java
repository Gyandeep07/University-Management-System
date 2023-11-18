package University;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Project extends JFrame implements ActionListener{
    Project(){
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("University//icons//third.jpg"));
      Image i2=i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT); 
       ImageIcon i3=new ImageIcon(i2);
      JLabel image=new JLabel(i3);
        add(image);
        JMenuBar nb=new JMenuBar();
        JMenu newInformation=new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        nb.add(newInformation);

        JMenuItem facultyInfo=new JMenuItem("New Faculty Information");
        facultyInfo.setForeground(Color.black);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        setJMenuBar(nb);

          JMenuItem studentinfo=new JMenuItem("New Student Information");
        studentinfo.setForeground(Color.black);
                studentinfo.addActionListener(this);

        newInformation.add(studentinfo);

         JMenu details=new JMenu("View Details ");
        details.setForeground(Color.red);
        nb.add(details);

        JMenuItem facultydetail=new JMenuItem("View Faculty Details");
        facultydetail.setForeground(Color.black);
        facultydetail.addActionListener(this);

        details.add(facultydetail);
        setJMenuBar(nb);

          JMenuItem studentdetails=new JMenuItem("View Student Details");
        studentdetails.setForeground(Color.black);
        studentdetails.addActionListener(this);

        details.add(studentdetails);

         JMenu leave=new JMenu(" Apply Leave ");
        leave.setForeground(Color.blue);
        nb.add(leave);

        JMenuItem facultyleave=new JMenuItem("Faculty Leave");
        facultyleave.setForeground(Color.black);
                facultyleave.addActionListener(this);

        leave.add(facultyleave);
        setJMenuBar(nb);

          JMenuItem studentleave=new JMenuItem("Student Leave");
        studentleave.setForeground(Color.black);
                studentleave.addActionListener(this);

        leave.add(studentleave);

        
         JMenu leavedetails=new JMenu("Leave Details");
        leavedetails.setForeground(Color.red);
        nb.add(leavedetails);

        JMenuItem facultyleavedetals=new JMenuItem("Faculty Leave Details");
        facultyleavedetals.setForeground(Color.black);
        facultyleavedetals.addActionListener(this);

        leavedetails.add(facultyleavedetals);
        setJMenuBar(nb);

          JMenuItem studentleavedetails=new JMenuItem("Student Leave Details");
        studentleavedetails.setForeground(Color.black);
        studentleavedetails.addActionListener(this);

        leavedetails.add(studentleavedetails);

        
         JMenu exam=new JMenu(" Examination");
        exam.setForeground(Color.blue);
        nb.add(exam);

        JMenuItem examdetails=new JMenuItem(" Examination Results");
        examdetails.addActionListener(this);
        examdetails.setForeground(Color.black);
        exam.add(examdetails);
        setJMenuBar(nb);

          JMenuItem entermarks=new JMenuItem("Enter Marks ");
        entermarks.setForeground(Color.black);
        entermarks.addActionListener(this);

        exam.add(entermarks);

        
         JMenu updateinfo=new JMenu(" Update Details");
        updateinfo.setForeground(Color.red);
        nb.add(updateinfo);

        JMenuItem upfacultyinfo=new JMenuItem(" Update Faculty Details");
        upfacultyinfo.setForeground(Color.black);
        upfacultyinfo.addActionListener(this);

        updateinfo.add(upfacultyinfo);
        setJMenuBar(nb);

          JMenuItem upstudentinfo=new JMenuItem(" Update Student Details");
        upstudentinfo.setForeground(Color.black);
        upstudentinfo.addActionListener(this);

        updateinfo.add(upstudentinfo);

        
         JMenu fees=new JMenu(" Fee Details");
        fees.setForeground(Color.blue);
        nb.add(fees);

        JMenuItem feestructure=new JMenuItem(" Fee Structure ");
        feestructure.setForeground(Color.black);
         feestructure.addActionListener(this);
        fees.add(feestructure);
        setJMenuBar(nb);

          JMenuItem feeform=new JMenuItem("  Student Fee Form ");
        feeform.setForeground(Color.black);
          feeform.addActionListener(this);
        fees.add(feeform);
         JMenu utility=new JMenu("Utility");
        utility.setForeground(Color.red);
        nb.add(utility);
        JMenuItem notepad=new JMenuItem("Notepad");
        notepad.setForeground(Color.black);
        notepad.addActionListener(this);
        utility.add(notepad);
        setJMenuBar(nb);

          JMenuItem calc=new JMenuItem("Calculator");
        calc.setForeground(Color.black);
        calc.addActionListener(this);
        utility.add(calc);

JMenu about=new JMenu("About");
        about.setForeground(Color.blue);
        nb.add(about);

        JMenuItem ab =new JMenuItem("About");
        ab.setForeground(Color.black);
        ab.addActionListener(this);
        about.add(ab);
        
         JMenu exit=new JMenu(" Exit ");
        exit.setForeground(Color.red);
        nb.add(exit);

        JMenuItem ex =new JMenuItem("Exit");
        ex.setForeground(Color.black);
        ex.addActionListener(this);
        exit.add(ex);
        setJMenuBar(nb);

        setJMenuBar(nb);
setSize(1540, 850);
setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String msg=ae.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        }else if(msg.equalsIgnoreCase("Calculator")){

try {
    Runtime.getRuntime().exec("calc.exe");
} catch (Exception e) {

}}
else if(msg.equalsIgnoreCase("Notepad")){

try {
    Runtime.getRuntime().exec("notepad.exe");
} catch (Exception e) {

}

        }else if(msg.equals("New Faculty Information")){
          new AddTeacher();
        }else if(msg.equals("New Student Information")){
          new AddStudent();
        }
        else if(msg.equals("View Faculty Details")){
          new TeacherDetails();
        }else if(msg.equals("View Student Details")){
          new StudentDetails();
        }
        else if(msg.equals("Faculty Leave")){
          new TeacherLeave();
        }
        else if(msg.equals("Student Leave")){
          new StudentLeave();
        }
        else if(msg.equals("Faculty Leave Details")){
          new TeacherLeaveDetails();
        }
        else if(msg.equals("Student Leave Details")){
          new StudentLeaveDetails();
        } else if(msg.equals(" Update Faculty Details")){
          new UpdateTeacher();
        } else if(msg.equals(" Update Student Details")){
          new UpdateStudent();
        } else if(msg.equals("Enter Marks ")){
          new EnterMarks();
        } else if(msg.equals(" Examination Results")){
          new ExaminationDetails();
        }else if(msg.equals(" Fee Structure ")){
          new FeeStructure();
        }else if(msg.equals("About")){
          new About();
        }else if(msg.equals("  Student Fee Form ")){
          new StudentFeeForm();
        }
    }
    public static void main(String[] args) {
        new Project();
    }
}
