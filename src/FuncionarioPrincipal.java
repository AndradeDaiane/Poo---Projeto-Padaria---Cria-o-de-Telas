import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FuncionarioPrincipal {
    public Container jpFuncionario;
    public JPanel panel3;
    public JLabel JLabelFunci;
    private JTextField JTextNFuncionario;
    private JTextField JTextTelefoneFUN;
    private JTextField JTextEndereçoFuncionario;
    private JTextField JTextCPF;
    private JTextField JTextEmailFun;
    private JTextField JTextCargo;
    private JButton JButtonS2;
    private JButton JButtonG3;

    public FuncionarioPrincipal() {
        jpFuncionario = new JPanel();

        jpFuncionario.setLayout(new GridLayout(20,10));//Define o Layout do painel

        JLabelFunci = new JLabel("Funcionario");
        JTextNFuncionario = new JTextField(20);
        JTextTelefoneFUN = new JTextField(20);
        JTextEndereçoFuncionario = new JTextField(20);
        JTextCPF = new JTextField(20);
        JTextEmailFun = new JTextField(20);
        JTextCargo = new JTextField(20);
        JButtonG3 = new JButton("Salvar");
        JButtonS2 = new JButton("Sair");

        // Adiciona os componetes ao painel
        jpFuncionario.add(new JLabel("Nome Funcionario"));
        jpFuncionario.add(JTextNFuncionario);
        jpFuncionario.add(new JLabel("Telefone"));
        jpFuncionario.add(JTextTelefoneFUN);
        jpFuncionario.add(new JLabel("Endereço"));
        jpFuncionario.add(JTextEndereçoFuncionario);
        jpFuncionario.add(new JLabel("CPF:"));
        jpFuncionario.add(JTextCPF);
        jpFuncionario.add(new JLabel("Email:"));
        jpFuncionario.add(JTextEmailFun);
        jpFuncionario.add(new JLabel("Cargo:"));
        jpFuncionario.add(JTextCargo);
        jpFuncionario.add(JButtonG3);
        jpFuncionario.add(JButtonS2);

        JButtonG3.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //captura os dados inseridos pelo usuario
                String nome = JTextNFuncionario.getText();
                String Telefone = JTextTelefoneFUN.getText();
                String Endereço = JTextEndereçoFuncionario.getText();
                String CPF = JTextCPF.getText();
                String Email = JTextEmailFun.getText();
                String Cargo = JTextCargo.getText();
                // instancio um objeto da classe clientes
                // e guardo os dados no atributo da classe clientes
                Funcionario Fun1 = new Funcionario();
                Fun1.setNome(nome);
                Fun1.setTelefone(Telefone);
                Fun1.setEndereço(Endereço);
                Fun1.setCPF(CPF);
                Fun1.setEmail(Email);
                Fun1.setCargo(Cargo);
                // imprimo os dados dos atributos
                JOptionPane.showMessageDialog(null,
                        "Nome "+"\n"+Fun1.getNome()+"\n"+
                                "Telefone "+"\n"+Fun1.getTelefone()+"\n"+
                                "Endereço "+"\n"+Fun1.getEndereço()+"\n"+
                                "CPF "+"\n"+Fun1.getCPF()+"\n"+
                                "Email "+"\n"+Fun1.getEmail()+"\n"+
                                "Cargo "+"\n"+Fun1.getCargo());
            }
        });

        JButtonS2.addActionListener(new ActionListener() {
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
