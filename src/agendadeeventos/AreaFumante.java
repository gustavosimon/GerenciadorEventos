package agendadeeventos;

/**
 * Classe para representar a area de fumantes do local do evento
 * @author Simon
 */
public class AreaFumante extends Local {
    
    int capacidade_pessoas;
    int largura;
    int comprimento;
    boolean area_coberta;

    public int getCapacidade_pessoas() {
        return capacidade_pessoas;
    }

    public void setCapacidade_pessoas(int capacidade_pessoas) {
        this.capacidade_pessoas = capacidade_pessoas;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public boolean isArea_coberta() {
        return area_coberta;
    }

    public void setArea_coberta(boolean area_coberta) {
        this.area_coberta = area_coberta;
    }
    
    
    
    
}
