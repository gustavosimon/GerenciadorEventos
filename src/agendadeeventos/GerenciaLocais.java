package agendadeeventos;

import java.util.ArrayList;

/**
 * Classe para gerenciar os locais dos eventos
 * @author Simon
 */
public class GerenciaLocais {
    
    ArrayList<Local> listaLocais = new ArrayList();

    public GerenciaLocais(){
    
    }
    
// Metodo para adicionar um evento no Arraylist do Gerenciador
    public void adicionaLocal(Local x){
        listaLocais.add(x);
    }
// Metodo para imprimir os eventos contidos no Arraylist do Gerenciador    
    public void listaLocais(){
        System.out.println("Locais CADASTRADOS");
        for (Local listaLocal : listaLocais) {
            if (listaLocal.getNome() != null) {
                System.out.println("Local:" + listaLocal.getNome());
            }
        }
    }
    
// Verifica se o local é valido    
    public boolean verificaLocal(String nome_local){        
        boolean encontrou = false;
        for (Local listaLocal : listaLocais) {
            if (listaLocal.getNome().equals(nome_local)) {
                encontrou = true;
                break;
            }
        }
        return encontrou;
    }
    
// Retorna o objeto Local digitado pelo usuario
      public Local retornaLocalValido(String nome_local){
        Local l1 = null;
        for (Local listaLocal : listaLocais) {
            if (listaLocal.getNome().equals(nome_local)) {
                l1 = listaLocal; 
            }
        }
        return l1;
    }   
}
