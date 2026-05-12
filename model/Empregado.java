
package model;


public class Empregado extends Pessoa {

    private int matrFuncional;

    private Departamento departamento;

    public Empregado(String nome,
                      int idade,
                      int matrFuncional,
                      Departamento departamento) {

        super(nome, idade);

        setMatrFuncional(matrFuncional);

        this.departamento = departamento;
    }

    public int getMatrFuncional() {
        return matrFuncional;
    }

    public void setMatrFuncional(int matrFuncional) {

        if (matrFuncional > 0 && matrFuncional < 9999) {
            this.matrFuncional = matrFuncional;
        } else {
            throw new IllegalArgumentException(
                    "Matrícula inválida!"
            );
        }
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
