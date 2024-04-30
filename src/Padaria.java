import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Padaria extends JFrame {
    public JPanel Panelprincipal;
    private JMenuBar JMB;
    private JMenu JM1;
    private JMenu JM2;
    private JMenu JM3;
    private JMenu JM4;
    private JMenu JM5;
    private JMenuItem JMI1;
    private JMenuItem JMI2;
    private JMenuItem JMI3;
    private JMenuItem JMI4;
    private JMenuItem JMI5;
    private JMenu JM6;
    private JMenuItem JMI6;


    public Padaria(){

        // Adicionar listeners para os itens de menu
        JMI1.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame t = new JFrame("ClientePrincipal");
                t.setContentPane(new ClientePrincipal().jpcliente);
                t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                t.pack();
                t.setResizable(false);
                t.setSize(500,500);
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            }


        });
        JMI2.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame t = new JFrame("FornecedorPrincipal");
                t.setContentPane(new FornecedorPrincipal().jpFornecedor);
                t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                t.pack();
                t.setResizable(false);
                t.setSize(500,500);
                t.setLocationRelativeTo(null);
                t.setVisible(true);

            }
        });
        JMI3.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame t = new JFrame("FuncionarioPrincipal");
                t.setContentPane(new FuncionarioPrincipal().jpFuncionario);
                t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                t.pack();
                t.setResizable(false);
                t.setSize(500,500);
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            }
        });

        JMI4.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame t = new JFrame("EstoquePrincipal");
                t.setContentPane(new EstoquePrincipal().jpEstoque);
                t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                t.pack();
                t.setResizable(false);
                t.setSize(500,500);
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            }
        });
        JMI5.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame t = new JFrame("MaquinarioPrincipal");
                t.setContentPane(new MaquinarioPrincipal().jpMaquinario);
                t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                t.pack();
                t.setResizable(false);
                t.setSize(500,500);
                t.setLocationRelativeTo(null);
                t.setVisible(true);
            }
        });
        JMI6.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}


