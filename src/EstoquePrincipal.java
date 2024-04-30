import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstoquePrincipal {
    public Container jpEstoque;
    public JPanel panel4;
    public JLabel JLabelEstoque;
    private JTextField JTextTP;
    private JTextField JTextQT;
    private JTextField JTextFornecedor;
    private JTextField JTextValidade;
    private JTextField JTextPreço;
    private JTextField JTextMarca;
    private JButton JButtonS3;
    private JButton JButtonG4;

    public EstoquePrincipal() {
        jpEstoque = new JPanel();

        jpEstoque.setLayout(new GridLayout(20,10));//Define o Layout do painel

        JLabelEstoque = new JLabel("Estoque");
        JTextTP = new JTextField(20);
        JTextQT = new JTextField(20);
        JTextFornecedor = new JTextField(20);
        JTextValidade = new JTextField(20);
        JTextPreço = new JTextField(20);
        JTextMarca = new JTextField(20);
        JButtonS3 = new JButton("Salvar");
        JButtonG4 = new JButton("Sair");

        // Adiciona os componetes ao painel
        jpEstoque.add(new JLabel("Tipo de Produto"));
        jpEstoque.add(JTextTP);
        jpEstoque.add(new JLabel("Quantidade de Produto:"));
        jpEstoque.add(JTextQT);
        jpEstoque.add(new JLabel("Fornecedor"));
        jpEstoque.add(JTextFornecedor);
        jpEstoque.add(new JLabel("Validade:"));
        jpEstoque.add(JTextValidade);
        jpEstoque.add(new JLabel("Preço:"));
        jpEstoque.add(JTextPreço);
        jpEstoque.add(new JLabel("Marca:"));
        jpEstoque.add(JTextMarca);
        jpEstoque.add(JButtonS3);
        jpEstoque.add(JButtonG4);

        JButtonS3.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //captura os dados inseridos pelo usuario
                String TipodeProduto = JTextTP.getText();
                String Quantidade = JTextQT.getText();
                String Fornecedor = JTextFornecedor.getText();
                String Validade = JTextValidade.getText();
                String Preço = JTextPreço.getText();
                String Marca = JTextMarca.getText();
                // instancio um objeto da classe clientes
                // e guardo os dados no atributo da classe clientes
                Estoque Est1 = new Estoque();
                Est1.setTipodeProduto(TipodeProduto);
                Est1.setQuantidadedeProduto(Quantidade);
                Est1.setFornecedor(Fornecedor);
                Est1.setValidade(Validade);
                Est1.setPreçoProduto(Preço);
                Est1.setMarcadoProduto(Marca);
                // imprimo os dados dos atributos
                JOptionPane.showMessageDialog(null,
                        "Tipode Produto "+"\n"+Est1.getTipodeProduto()+"\n"+
                                "Quantidade "+"\n"+Est1.getQuantidadedeProduto()+"\n"+
                                "Fornecedor "+"\n"+Est1.getFornecedor()+"\n"+
                                "Validade "+"\n"+Est1.getValidade()+"\n"+
                                "Preço "+"\n"+Est1.getPreçoProduto()+"\n"+
                                "Marca "+"\n"+Est1.getMarcadoProduto());
            }
        });

        JButtonG4.addActionListener(new ActionListener() {
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
