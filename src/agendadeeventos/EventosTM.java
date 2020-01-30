package agendadeeventos;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/**
 * Classe para manipular a tabela de eventos - Fonte adaptado a partir do disponibilizado pelo professor
 * @author dalalana
 */
public class EventosTM extends AbstractTableModel {
    
    private List<Evento> linhas;
    private String[] colunas = new String[]{"Nome","Data","Qtd.Pessoas","Situacao","Local"};

    public EventosTM(){
        linhas = new ArrayList<Evento>();
        
    }
    public EventosTM(List<Evento> lista) {
        this.linhas = new ArrayList<Evento>(lista);
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        return String.class; // pq todos as colunas da minha tabela sÃ£o String, do contrÃ¡rio posso usar um switch
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Evento p = linhas.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getNome();
            case 1:
                return p.getDataEditada();
               
            case 2:
                return p.getQtd_pessoas();
           
            case 3:    
                return p.getSituacao();
     
            case 4:
                return p.getLocal().getNome();

            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Evento p = linhas.get(rowIndex); // carrega o item da linha a ser modificado
        switch(columnIndex){
            case 0:
                p.setNome(aValue.toString());
                break;
            
            case 1:        
                p.setDataEditada(aValue.toString());
                break;
               
            case 2:
                p.setQtd_pessoas(Integer.parseInt(aValue.toString()));
                break;
            case 3:
                p.setSituacao(Enum.valueOf(aValue.toString()));
                break;
            case 4:
                p.getLocal().setNome(aValue.toString());
                break;
            default:
                
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    
    public void setValueAt(Evento aValue, int rowIndex) {
        Evento p = linhas.get(rowIndex); // carrega o item da linha a ser modificado
        
        p.setNome(aValue.getNome());
        p.setDataEditada(aValue.getDataEditada());
        p.setQtd_pessoas(aValue.getQtd_pessoas());
       
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    public Evento getEvento(int indiceLinha){
        return linhas.get(indiceLinha);
    }
    
    public void addEvento(Evento p){
        linhas.add(p);
        int ultimoIndice = getRowCount()-1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
    public void remove(int indiceLinha){
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
   
    public void addLista(List<Evento> f){
        // pega o tamanho antigo da tabela
        int tamanhoAntigo = getRowCount();
        
        //adiciona registros
        linhas.addAll(f);
        fireTableRowsInserted(tamanhoAntigo, getRowCount()-1);
    }
    
    public void limpar(){
        linhas.clear();
        fireTableDataChanged();
    }
    
    public boolean isEmpty(){
        return linhas.isEmpty();
    }
    
    public void atualizaTabela(){
        this.fireTableDataChanged();
    }
    
    
}