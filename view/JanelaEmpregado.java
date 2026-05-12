package view;

import model.Departamento;

import javax.swing.*;

public class JanelaEmpregado extends JFrame {

    public JTextField txtNome;
    public JTextField txtIdade;
    public JTextField txtMatricula;

    public JComboBox<Departamento> comboDepartamento;

    public JButton btnSalvar;

    public JanelaEmpregado() {

        setTitle("Cadastro Empregado");
        setSize(400,300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20,20,100,25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(120,20,200,25);
        add(txtNome);

        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(20,60,100,25);
        add(lblIdade);

        txtIdade = new JTextField();
        txtIdade.setBounds(120,60,200,25);
        add(txtIdade);

        JLabel lblMatricula = new JLabel("Matrícula:");
        lblMatricula.setBounds(20,100,100,25);
        add(lblMatricula);

        txtMatricula = new JTextField();
        txtMatricula.setBounds(120,100,200,25);
        add(txtMatricula);

        JLabel lblDepartamento =
                new JLabel("Departamento:");

        lblDepartamento.setBounds(20,140,100,25);
        add(lblDepartamento);

        comboDepartamento = new JComboBox<>();
        comboDepartamento.setBounds(120,140,200,25);
        add(comboDepartamento);

        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(120,190,120,30);
        add(btnSalvar);
    }
}
