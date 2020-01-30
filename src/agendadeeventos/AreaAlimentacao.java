package agendadeeventos;

/**
 * Classe para representar a area de alimentacao do local do evento
 * @author Simon
 */
public class AreaAlimentacao extends Local {
    
    private String nome_lanchonete;
    private String lanche_do_dia;
    private double preco_lanche;

    public String getNome_lanchonete() {
        return nome_lanchonete;
    }

    public void setNome_lanchonete(String nome_lanchonete) {
        this.nome_lanchonete = nome_lanchonete;
    }

    public String getLanche_do_dia() {
        return lanche_do_dia;
    }

    public void setLanche_do_dia(String lanche_do_dia) {
        this.lanche_do_dia = lanche_do_dia;
    }

    public double getPreco_lanche() {
        return preco_lanche;
    }

    public void setPreco_lanche(double preco_lanche) {
        this.preco_lanche = preco_lanche;
    }
    
    
    
    
    
}
