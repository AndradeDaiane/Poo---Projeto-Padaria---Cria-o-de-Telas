import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FornecedorPrincipal {
    public Container jpFornecedor;
    public JPanel panel2;
    public JLabel JLabelF;
    private JTextField JTextNFormecedor;
    private JTextField JTextCPFCNPJFo;
    private JTextField JTextEmail;
    private JTextField JTextTelefoneF;
    private JTextField JTextMercadoria;
    private JTextField JTextEndereço;
    private JButton JButtonS1;
    private JButton JButtonG2;

    public FornecedorPrincipal() {
        jpFornecedor = new JPanel();

        jpFornecedor.setLayout(new GridLayout(20,10));//Define o Layout do painel

        JLabelF = new JLabel("Fornecedor");
        JTextNFormecedor = new JTextField(20);
        JTextCPFCNPJFo = new JTextField(20);
        JTextEmail = new JTextField(20);
        JTextTelefoneF = new JTextField(20);
        JTextMercadoria = new JTextField(20);
        JTextEndereço = new JTextField(20);
        JButtonG2 = new JButton("Salvar");
        JButtonS1 = new JButton("Sair");

        // Adiciona os componetes ao painel
        jpFornecedor.add(new JLabel("Nome Fornecedor"));
        jpFornecedor.add(JTextNFormecedor);
        jpFornecedor.add(new JLabel("CPF / CNPJ"));
        jpFornecedor.add(JTextCPFCNPJFo);
        jpFornecedor.add(new JLabel("Email"));
        jpFornecedor.add(JTextEmail);
        jpFornecedor.add(new JLabel("Telefone:"));
        jpFornecedor.add(JTextTelefoneF);
        jpFornecedor.add(new JLabel("Mercadoria:"));
        jpFornecedor.add(JTextMercadoria);
        jpFornecedor.add(new JLabel("Endereço:"));
        jpFornecedor.add(JTextEndereço);
        jpFornecedor.add(JButtonS1);
        jpFornecedor.add(JButtonG2);

        JButtonG2.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //captura os dados inseridos pelo usuario
                String nome = JTextNFormecedor.getText();
                String CPFCNPJ = JTextCPFCNPJFo.getText();
                String Email = JTextEmail.getText();
                String Telefone = JTextTelefoneF.getText();
                String Mercadoria = JTextMercadoria.getText();
                String Endereço = JTextEndereço.getText();
                // instancio um objeto da classe clientes
                // e guardo os dados no atributo da classe clientes
                Fornecedor For1 = new Fornecedor();
                For1.setNomeEmpresa(nome);
                For1.setCPFCnpj(CPFCNPJ);
                For1.setEmail(Email);
                For1.setTelefone(Telefone);
                For1.setMercadoria(Mercadoria);
                For1.setEndereço(Endereço);
                // imprimo os dados dos atributos
                JOptionPane.showMessageDialog(null,
                        "Nome "+"\n"+For1.getNomeEmpresa()+"\n"+
                                "CPFCNPJ "+"\n"+For1.getCPFCnpj()+"\n"+
                                "Email "+"\n"+For1.getEmail()+"\n"+
                                "Telefone "+"\n"+For1.getTelefone()+"\n"+
                                "Mercadoria "+"\n"+For1.getMercadoria()+"\n"+
                                "Endereço "+"\n"+For1.getNomeEmpresa());
            }
        });

        JButtonS1.addActionListener(new ActionListener() {
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
