package agendadeeventos;

import java.util.ArrayList;

/**
 * Classe para controlar o calendário de eventos 
 * @author Simon
 */
public class GerenciaEventos {
    
    ArrayList<Evento> listaEventos = new ArrayList();

    public GerenciaEventos(){
        
    }
    
// Metodo para adicionar um evento no Arraylist do Gerenciador
    public void adicionaEvento(Evento x){
        listaEventos.add(x);
    }
// Metodo para imprimir os eventos contidos no Arraylist do Gerenciador    
    public void listaEventos(){
        System.out.println("EVENTOS CADASTRADOS");
        for (Evento listaEvento : listaEventos) {
            System.out.println("Evento: " + listaEvento.getNome() + "Data:" + listaEvento.getData());
        }
    }

}
