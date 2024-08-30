package set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

//atributos
public class ConjundoConvidados {
    private Set<Convidado> convidadosSet;

    //construtor

    public ConjundoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    //metodos
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadosPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet){
            if (c.getCodigoConvite()==codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados (){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjundoConvidados conjuntoConvidados = new ConjundoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");

        conjuntoConvidados.removerConvidadosPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");

        conjuntoConvidados.exibirConvidados();
    }
}
