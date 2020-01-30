package agendadeeventos;

/**
 * Classe para criação de locais a serem relacionados com os eventos
 * @author Simon
 */
public class Local {

// Nome do local    
    private String nome;
// Quantidade maxima do local    
    private int qtd_max;
// Largura do local
    private int largura;
// Comprimento do local
    private int comprimento;    
// Area de fumantes do local
    private AreaFumante area_fumante;
// Area de alimentacao do local
    private AreaAlimentacao area_alimentacao;

    public AreaFumante getArea_fumante() {
        return area_fumante;
    }

    public void setArea_fumante(AreaFumante area_fumante) {
        this.area_fumante = area_fumante;
    }

    public AreaAlimentacao getArea_alimentacao() {
        return area_alimentacao;
    }

    public void setArea_alimentacao(AreaAlimentacao area_alimentacao) {
        this.area_alimentacao = area_alimentacao;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd_max() {
        return qtd_max;
    }

    public void setQtd_max(int qtd_max) {
        this.qtd_max = qtd_max;
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
}
