package src;

import controller.EmpregadoController;
import view.JanelaEmpregado;

public class Main {

    public static void main(String[] args) {

        JanelaEmpregado view =
                new JanelaEmpregado();

        new EmpregadoController(view);

        view.setVisible(true);
    }
}