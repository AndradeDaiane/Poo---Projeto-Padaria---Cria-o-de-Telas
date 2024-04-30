import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Padaria padaria = new Padaria();
        JFrame t = new JFrame("Padaria");
            t.setContentPane(new Padaria().Panelprincipal);
            t.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            t.pack();
            t.setResizable(false);
            t.setSize(500,500);
            t.setLocationRelativeTo(null);
            t.setVisible(true);

        }
}