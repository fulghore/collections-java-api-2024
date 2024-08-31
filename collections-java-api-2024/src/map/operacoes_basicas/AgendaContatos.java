package map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    //construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    //metodos
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome=null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome= agendaContatoMap.get(nome);

        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Aldrin", 123456);
        agendaContatos.adicionarContato("Aldrin", 5665);
        agendaContatos.adicionarContato("Aldrin Lima", 111111);
        agendaContatos.adicionarContato("Aldrin Barbosa", 987654);
        agendaContatos.adicionarContato("Ellen Guedes", 111111);
        agendaContatos.adicionarContato("Aldrin", 444444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Ellen Guedes");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Aldrin"));


    }
}
