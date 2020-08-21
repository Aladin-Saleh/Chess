import javax.swing.*;

public class Screen extends JFrame {

    public Screen(){

        this.setSize(1000,1000);
        this.setLocation(0,0);
        this.setTitle("Chess JAVA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Plateau chess = new Plateau();
        this.add(chess);










        this.setVisible(true);
    }
}
