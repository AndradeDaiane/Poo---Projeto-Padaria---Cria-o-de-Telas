import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClientePrincipal {
    public JPanel panel1;
    public JLabel JLabelC;
    public Container jpcliente;
    private JTextField JTextNome;
    private JTextField JTextTelefone;
    private JTextField JTextCPFCNPJ;
    private JTextField JTextPedido;
    private JButton JButtonS;
    private JButton JButtonG;

    public ClientePrincipal() {
        jpcliente = new JPanel();
        jpcliente.setLayout(new GridLayout(10,5));//Define o Layout do painel

        JLabelC = new JLabel("Cliente");
        JTextNome = new JTextField(20);
        JTextTelefone = new JTextField(20);
        JTextCPFCNPJ = new JTextField(20);
        JTextPedido = new JTextField(20);
        JButtonG = new JButton("Salvar");
        JButtonS = new JButton("Sair");

        // Adiciona os componetes ao painel
        jpcliente.add(new JLabel("Nome"));
        jpcliente.add(JTextNome);
        jpcliente.add(new JLabel("Telefone:"));
        jpcliente.add(JTextTelefone);
        jpcliente.add(new JLabel("CPF/CNPJ:"));
        jpcliente.add(JTextCPFCNPJ);
        jpcliente.add(new JLabel("Pedido:"));
        jpcliente.add(JTextPedido);
        jpcliente.add(JButtonG);
        jpcliente.add(JButtonS);

        JButtonG.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //captura os dados inseridos pelo usuario
                String nome = JTextNome.getText();
                String Telefone = JTextTelefone.getText();
                String CPFCNPJ = JTextCPFCNPJ.getText();
                String Pedido = JTextPedido.getText();
                // instancio um objeto da classe clientes
                // e guardo os dados no atributo da classe clientes
                Cliente Cli1 = new Cliente();
                Cli1.setNome(nome);
                Cli1.setTelefone(Telefone);
                Cli1.setCPFCNPJ(CPFCNPJ);
                Cli1.setPedido(Pedido);
                // imprimo os dados dos atributos
                JOptionPane.showMessageDialog(null,
                        "Nome "+"\n"+Cli1.getNome()+"\n"+
                                "Telefone "+"\n"+Cli1.getTelefone()+"\n"+
                                "CPFCNPJ "+"\n"+Cli1.getCPFCNPJ()+"\n"+
                                "Pedido "+"\n"+Cli1.getPedido());

            }
        });
        JButtonS.addActionListener(new ActionListener() {
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


