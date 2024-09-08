package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    Set<Contato> contatoSet;

    //construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Aldrin", 123456);
        agendaContatos.adicionarContato("Aldrin", 0);
        agendaContatos.adicionarContato("Aldrin Lima", 111111);
        agendaContatos.adicionarContato("Aldrin Barbosa", 987654);
        agendaContatos.adicionarContato("Ellen Guedes", 234567);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Aldrin"));;

        System.out.println("Contato atualizado " + agendaContatos.atualizarNumeroContato("Aldrin", 777777));
    }

}
