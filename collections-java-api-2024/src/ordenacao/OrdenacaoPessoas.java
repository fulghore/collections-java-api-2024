package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributos
    private List<Pessoa> listPessoas;

    //construtor
    public OrdenacaoPessoas() {
        this.listPessoas = new ArrayList<>();
    }

    //metodos
    public void adicionarPessoa(String nome, int idade, double altura){
        listPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> idadesOrdenadas = new ArrayList<>(listPessoas);
        Collections.sort(idadesOrdenadas);
        return idadesOrdenadas;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> alturasOrdenadas = new ArrayList<>(listPessoas);
        Collections.sort(alturasOrdenadas, new comparatorPorAltura());
        return alturasOrdenadas;
    }

      public static void main(String[] args) {
  // Criando uma instância da classe OrdenacaoPessoas
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

    // Adicionando pessoas à lista
    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

    // Exibindo a lista de pessoas adicionadas
    System.out.println(ordenacaoPessoas.listPessoas);

    // Ordenando e exibindo por idade
    System.out.println(ordenacaoPessoas.ordenarPorIdade());

    // Ordenando e exibindo por altura
    System.out.println(ordenacaoPessoas.ordenarPorAltura());
  }
}
