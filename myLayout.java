import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class myLayout extends JFrame {
JButton jb1,jb2,jb3,jb4;



myLayout(){
        setBounds(300,300,200,200);
        setLayout(new GridLayout(4,2));
        jb1=new JButton("Button 1");
        jb2=new JButton("Button 2");
        jb3=new JButton("Button 3");
        jb4=new JButton("Button 3");


       

        add(jb1);

        add(jb2);
        add(jb3);

        add(jb4);
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        



        setVisible(true);

}




public static void main(String[] args){

    new myLayout();


}
}