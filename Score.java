package quiz.applicationcs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Score extends JFrame implements ActionListener {
    
    Score(String name, int score){
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel qno = new JLabel();
        qno.setBounds(20, 50, 50, 30);
        qno.setFont(new Font("Tahoma",Font.PLAIN, 24));
        add(qno);
        
        JLabel lScore = new JLabel("Your SCORE is "+ score);
        lScore.setBounds(200, 200, 450, 40);
        lScore.setFont(new Font("Tahoma",Font.BOLD,40));
        add(lScore);
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new login();
        
    }
    
    public static void main(String[] args){
        new Score("User",0);
    }
    
}
