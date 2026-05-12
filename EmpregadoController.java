package controller;

import model.Departamento;
import model.Empregado;
import view.JanelaEmpregado;

import javax.swing.*;

public class EmpregadoController {

    private JanelaEmpregado view;

    public EmpregadoController(JanelaEmpregado view) {

        this.view = view;

        carregarDepartamentos();

        configurarEventos();
    }

    private void carregarDepartamentos() {

        Departamento d1 =
                new Departamento(1, "RH");

        Departamento d2 =
                new Departamento(2, "Financeiro");

        Departamento d3 =
                new Departamento(3, "TI");

        view.comboDepartamento.addItem(d1);
        view.comboDepartamento.addItem(d2);
        view.comboDepartamento.addItem(d3);
    }

    private void configurarEventos() {

        view.btnSalvar.addActionListener(e -> salvarEmpregado());
    }

    private void salvarEmpregado() {

        try {

            String nome =
                    view.txtNome.getText();

            int idade =
                    Integer.parseInt(
                            view.txtIdade.getText()
                    );

            int matricula =
                    Integer.parseInt(
                            view.txtMatricula.getText()
                    );

            Departamento departamento =
                    (Departamento)
                            view.comboDepartamento
                                    .getSelectedItem();

            Empregado empregado =
                    new Empregado(
                            nome,
                            idade,
                            matricula,
                            departamento
                    );

            JOptionPane.showMessageDialog(
                    null,
                    "Empregado cadastrado!\n" +
                    "Nome: " + empregado.getNome() +
                    "\nDepartamento: " +
                    empregado.getDepartamento().getNome()
            );

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage()
            );
        }
    }
}