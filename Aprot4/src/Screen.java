import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame { //extends serve pra não precisar ficar colocando jframe em
    // todo  set etc

    public Screen(){
        JFrame jFrame = new JFrame();
        setVisible(true);
        setSize(800, 500);
        setTitle("tela hmm");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        JButton jButton = new JButton();
        jButton.setText("Clique aqui");
        jButton.setBounds(100, 200, 250, 70);
        jButton.setFont(new Font("Arial", Font.BOLD, 30));
        jButton.setForeground(new Color(10, 10, 10));
        jButton.setBackground(new Color(120, 113, 113));

        JButton jButton2 = new JButton();
        jButton2.setText("não aqui");
        jButton2.setBounds(200, 300, 350, 70);
        jButton2.setFont(new Font("Arial", Font.BOLD, 30));
        jButton2.setForeground(new Color(10, 10, 10));
        jButton2.setBackground(new Color(120, 113, 113));
        add(jButton);
        add(jButton2);

    }
}
