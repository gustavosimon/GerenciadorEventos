package agendadeeventos;

import javax.swing.JOptionPane;

/**
 * Classe para o evento do tipo Show, implementa a interface Conformidade
 * @author Simon
 */
public class Show extends Evento implements Conformidade {
    
    public Local localevento;

    public Local getLocalevento() {
        return localevento;
    }

    public void setLocalevento(Local localevento) {
        this.localevento = localevento;
    }
    
    public Show(){
        
    }
    
    public Show(String nome){
        this.nome = nome;
    }
    
    public Show(String nome, Local l1){
        this.nome = nome;
        this.local = l1;
    }


    public Show(int qtd_pes){
// Calula a taxa de vistoria da festa (Atributo herdado de evento)
        this.taxa = qtd_pes * 1.25;
    }

    public void iniciarEvento(){
        JOptionPane.showMessageDialog(null, "Nome do Show: " + this.getNome() + "\n" + "Quantidade de pessoas: " + this.getQtd_pessoas() + "\n" + "Data: " + this.getDataEditada() + "\n\n" + "O show foi iniciado!");
    }

    @Override
    public void verificaAlvara() {
        JOptionPane.showMessageDialog(null, "A capacidade máxima do local é: " + this.getLocal().getQtd_max());
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
    // Cria uma area de alimentacao para o local do evento
        AreaAlimentacao area_alimentacao = new AreaAlimentacao();
        this.getLocal().setArea_alimentacao(area_alimentacao);
        JOptionPane.showMessageDialog(null, "Foram criadas as areas de fumantes e de alimentação para o evento!");
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
