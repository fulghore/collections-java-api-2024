package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributo
    private Map<LocalDate, Evento> eventoMap;

    //constutor
    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    //metodos
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
//        Set<LocalDate> dataSet = eventoMap.keySet();
//        Collection<Evento> values = eventoMap.values();
            //eventoMap.get();
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Próximo evento: " + proximoEvento + " Data: " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento1", "Atração1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento2", "Atração2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 17), "Evento3", "Atração3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}

