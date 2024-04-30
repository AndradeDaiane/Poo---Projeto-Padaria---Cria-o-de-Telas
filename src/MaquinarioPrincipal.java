import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaquinarioPrincipal {
    public Container jpMaquinario;
    public JPanel Panel5;
    public JLabel JLabelM;
    private JTextField JTextEquipamento;
    private JTextField JTextQTM;
    private JTextField JTextDtM;
    private JTextField JTextModelo;
    private JButton JButtonS4;
    private JButton JButtonG5;
    private JTextField JTextFuncionamento;

    public MaquinarioPrincipal() {
        jpMaquinario = new JPanel();

        jpMaquinario.setLayout(new GridLayout(20,10));//Define o Layout do painel

        JLabelM = new JLabel("Maquinario");
        JTextEquipamento = new JTextField(20);
        JTextQTM = new JTextField(20);
        JTextDtM = new JTextField(20);
        JTextFuncionamento = new JTextField(20);
        JTextModelo = new JTextField(20);
        JButtonG5 = new JButton("Salvar");
        JButtonS4 = new JButton("Sair");

        // Adiciona os componetes ao painel
        jpMaquinario.add(new JLabel("Equipamento"));
        jpMaquinario.add(JTextEquipamento);
        jpMaquinario.add(new JLabel("Quantidade de Maquinas"));
        jpMaquinario.add(JTextQTM);
        jpMaquinario.add(new JLabel("Data de Manuteção"));
        jpMaquinario.add(JTextDtM);
        jpMaquinario.add(new JLabel("Funcionamento"));
        jpMaquinario.add(JTextFuncionamento);
        jpMaquinario.add(new JLabel("Modelo:"));
        jpMaquinario.add(JTextModelo);
        jpMaquinario.add(JButtonS4);
        jpMaquinario.add(JButtonG5);

        JButtonG5.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //captura os dados inseridos pelo usuario
                String Equipamento = JTextEquipamento.getText();
                String Quantidade = JTextQTM.getText();
                String DataManutenção = JTextDtM.getText();
                String Funcionamento = JTextFuncionamento.getText();
                String Modelo = JTextModelo.getText();
                // instancio um objeto da classe clientes
                // e guardo os dados no atributo da classe clientes
                Maquinario Maq1 = new Maquinario();
                Maq1.setNomedoEquipamento(Equipamento);
                Maq1.setQuantidade(Quantidade);
                Maq1.setDataManuteção(DataManutenção);
                Maq1.setFuncionamento(Funcionamento);
                Maq1.setModelodoEquipamnto(Modelo);
                // imprimo os dados dos atributos
                JOptionPane.showMessageDialog(null,
                        "Equipamento "+"\n"+Maq1.getNomedoEquipamento()+"\n"+
                                "Quantidade "+"\n"+Maq1.getQuantidade()+"\n"+
                                "Data Manutenção "+"\n"+Maq1.getDataManuteção()+"\n"+
                                "Funcionamento "+"\n"+Maq1.getFuncionamento()+"\n"+
                                "Modelo "+"\n"+Maq1.getModelodoEquipamnto());
            }
        });

        JButtonS4.addActionListener(new ActionListener() {
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
