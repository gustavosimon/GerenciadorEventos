package agendadeeventos;

import javax.swing.JOptionPane;

/**
 * Classe para o evento do tipo Festa, implementa a interface Conformidade
 * @author Simon
 */
public class Festa extends Evento implements Conformidade {
    
    public Local localfesta;

    public Local getLocalfesta() {
        return localfesta;
    }

    public void setLocalfesta(Local localfesta) {
        this.localfesta = localfesta;
    }
    
    public Festa(){
        
    }
    
    public Festa(String nome){
        this.nome = nome;
    }
    
    public Festa(String nome, Local l1){
        this.nome = nome;
        this.local = l1;
    }
    

    public Festa(int qtd_pes){
// Calula a taxa de vistoria da festa (Atributo herdado de evento)
        this.taxa = qtd_pes * 0.85;
        
    }
    
    public void iniciarEvento(){
        JOptionPane.showMessageDialog(null, "Nome da Festa: " + this.getNome() + "\n" + "Quantidade de pessoas: " + this.getQtd_pessoas() + "\n" + "Data: " + this.getDataEditada() + "\n\n" + "A festa foi iniciada!");
    }
    
    @Override
    public void verificaAlvara() {
        JOptionPane.showMessageDialog(null, "Festa  com  capacidade para " + this.getLocal().getQtd_max() + " pessoas!");
    }

    @Override
    public void realizarVistoria() {
        JOptionPane.showMessageDialog(null, "Informações de dimensão do local:" + "\n" + "Largura: " + this.getLocal().getLargura() + "\n" + "Comprimento: " + this.getLocal().getComprimento() + "\n" + "Taxa de vistoria: R$ " + this.taxa);
    }

    @Override
    public void estabeleceAreaRestritas() {
    // Cria uma area de fumantes para o local do evento
        AreaFumante area_fumante = new AreaFumante();
        this.getLocal().setArea_fumante(area_fumante);
        JOptionPane.showMessageDialog(null, "Foi criada a area de fumantes para o evento!");
    }

    @Override
    public void controlaNormasGerais() {
        if (this.getQtd_pessoas() > this.getLocal().getQtd_max()){
            JOptionPane.showMessageDialog(null, "Vai dar problema com a galera!");
        } else {
            JOptionPane.showMessageDialog(null, "Evento com a capacidade controlada!");
        }
    }
    
}
