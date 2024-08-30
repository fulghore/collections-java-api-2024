package set.pesquisa;

import java.util.Objects;

public class Contato {
    //atributos
    private String nome;
    private int numeroTelefone;

    //construtor
    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    //setter
    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    //To String
    @Override
    public String toString() {
        return nome + ' ' +
                numeroTelefone;
    }
}
