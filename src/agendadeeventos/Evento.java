package agendadeeventos;

import java.util.Date;

/**
 * Classe abstrata para as classes Festa e Show
 * @author Simon
 */
public abstract class Evento {
// Nome do evento
    protected String nome;
// Data do evento
    protected Date data = new Date();
// Quantidade de pessoas presentes no evento
    protected int qtd_pessoas;
// Situacao do evento
    protected Enum situacao;
// Data de inicio do evento
    protected Date data_inicio = new Date();
// Data editada para exibição na tabela
    protected String dataEditada;
// Local do evento
    protected Local local;
// Taxas de vistoria
    protected double taxa;

    
    
    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    
    public String getDataEditada() {
        return dataEditada;
    }

    public void setDataEditada(String dataEditada) {
        this.dataEditada = dataEditada;
    }
    
    public Evento(){
        
    }
    
    public Evento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQtd_pessoas() {
        return qtd_pessoas;
    }

    public void setQtd_pessoas(int qtd_pessoas) {
        this.qtd_pessoas = qtd_pessoas;
    }

    public Enum getSituacao() {
        return situacao;
    }

    public void setSituacao(Enum situacao) {
        this.situacao = situacao;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    
    public void iniciarEvento(){
// Método é substituido nas clasess filhas        
    }
    
}
