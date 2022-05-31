package Desafio04;

class Agenda {
    public int codigo;
    public int numeroTelefone;
    public int idade;

    public Agenda(int codigo, int numeroTelefone, int idade) {
        this.codigo = codigo;
        this.numeroTelefone = numeroTelefone;
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "codigo=" + codigo +
                ", numeroTelefone=" + numeroTelefone +
                ", idade=" + idade +
                '}';
    }
}