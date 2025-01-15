import javax.swing.*;

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

        JButton jButton = new JButton();
        jButton.setText("Clique aqui");
        add(jButton);

    }
}
