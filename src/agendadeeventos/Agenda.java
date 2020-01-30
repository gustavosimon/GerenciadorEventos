package agendadeeventos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon
 */
public class Agenda extends javax.swing.JFrame {

// Cria um gerenciador de eventos
    GerenciaEventos ge = new GerenciaEventos();
// Cria um gerenciador de locais para eventos
    GerenciaLocais gl = new GerenciaLocais();
// Cria um gerenciador de financas
    Financas financasGeral1 = new Financas();
// Cria um gerenciador de vendas de ingressos
    VendasIngressos ingressos1 = new VendasIngressos();        
// Declaração dos grids
    EventosTM eventos;
       
/**
 * Cria a janela Agenda
 */
    public Agenda() {
// Inicializa a janela
        initComponents();
// Incializa a janela no meio da tela
        setLocationRelativeTo(null);
// Indica que nao permite maximizar a tela        
        setResizable(false);
// Desabilita os campos da janela 
        habilitaOuDesabilitaCampos(false);
// Habilita o botao de novo
        habilitaOuDesabilitaBotoes(true, false, false, false);
// Cria o grid de Eventos
        eventos = new EventosTM();
        tbl_evento.setModel(eventos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_evento = new javax.swing.JTable();
        sep = new javax.swing.JSeparator();
        sta_Evento = new javax.swing.JLabel();
        sta_gerevento = new javax.swing.JLabel();
        sta_nomedoevento = new javax.swing.JLabel();
        bt_novo = new javax.swing.JButton();
        bt_adicionar = new javax.swing.JButton();
        bt_info = new javax.swing.JButton();
        sta_data = new javax.swing.JLabel();
        ev_data = new javax.swing.JFormattedTextField();
        sta_numpessoas = new javax.swing.JLabel();
        ev_situacao = new javax.swing.JComboBox<>();
        sta_situacao = new javax.swing.JLabel();
        ev_nome = new javax.swing.JTextField();
        ev_qtdpes = new javax.swing.JTextField();
        bt_validar = new javax.swing.JButton();
        ev_local = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bt_inc_local = new javax.swing.JButton();
        ev_tipo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de eventos");

        tbl_evento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome do evento", "Qtd. pessoas", "Data do evento", "Situação", "Local"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_evento.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tbl_evento);
        tbl_evento.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        sta_Evento.setText("Eventos");

        sta_gerevento.setText("Gerenciador de eventos");
        sta_gerevento.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        sta_nomedoevento.setText("Nome do evento");

        bt_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendadeeventos/calendar.png"))); // NOI18N
        bt_novo.setText("Novo");
        bt_novo.setPreferredSize(new java.awt.Dimension(113, 25));
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        bt_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendadeeventos/incluir.png"))); // NOI18N
        bt_adicionar.setText("Adicionar");
        bt_adicionar.setPreferredSize(new java.awt.Dimension(113, 25));
        bt_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_adicionarActionPerformed(evt);
            }
        });

        bt_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendadeeventos/info.png"))); // NOI18N
        bt_info.setText("Informações");
        bt_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_infoActionPerformed(evt);
            }
        });

        sta_data.setText("Data do evento");

        try {
            ev_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ev_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ev_dataActionPerformed(evt);
            }
        });
        ev_data.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ev_dataFocusLost(evt);
            }
        });

        sta_numpessoas.setText("Nº pessoas");

        ev_situacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendente", "Confirmado", "Adiado", "Cancelado" }));
        ev_situacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ev_situacaoActionPerformed(evt);
            }
        });

        sta_situacao.setText("Situação");

        ev_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ev_nomeActionPerformed(evt);
            }
        });
        ev_nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ev_nomeFocusLost(evt);
            }
        });

        ev_qtdpes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ev_qtdpesFocusLost(evt);
            }
        });

        bt_validar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendadeeventos/check.png"))); // NOI18N
        bt_validar.setText("Validar");
        bt_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_validarActionPerformed(evt);
            }
        });

        ev_local.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ev_localFocusLost(evt);
            }
        });

        jLabel1.setText("Local");

        bt_inc_local.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendadeeventos/incluir.png"))); // NOI18N
        bt_inc_local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inc_localActionPerformed(evt);
            }
        });

        ev_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Festa", "Show" }));

        jLabel2.setText("Tipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sta_gerevento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_info, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_validar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sta_Evento)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sta_nomedoevento)
                                    .addComponent(sta_numpessoas))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ev_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ev_qtdpes, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sta_data)
                                    .addComponent(sta_situacao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ev_data, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ev_situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ev_local, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(ev_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_inc_local, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sep, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(sta_gerevento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sta_nomedoevento)
                        .addComponent(ev_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sta_data)
                        .addComponent(ev_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ev_local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(bt_inc_local, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sta_numpessoas)
                    .addComponent(ev_situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sta_situacao)
                    .addComponent(ev_qtdpes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ev_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_info, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_validar))
                .addGap(4, 4, 4)
                .addComponent(sta_Evento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sep, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_adicionarActionPerformed
// Faz validações gerais para incluir o evento    
        validaGeral();
// Situacao do evento
        int tipo;
        Evento e1 = null;
        tipo = ev_tipo.getSelectedIndex();
// Cria um novo evento conforme o tipo indicado
        switch(tipo){
            case 0:
                e1 = new Festa(Integer.parseInt(ev_qtdpes.getText()));            
                break;
            case 1:
                e1 = new Show(Integer.parseInt(ev_qtdpes.getText()));
                break;
        }
// Cria um local
        Local l1;
// Trata a data para salvar em formato Date
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        String date1 = "";
        try {
            data = formato.parse(ev_data.getText());
            date1 = formato.format(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
// Faz as atribuições digitadas pelo usuário para o objeto
        e1.setNome(ev_nome.getText());
        e1.setData(data);
        e1.setQtd_pessoas(Integer.parseInt(ev_qtdpes.getText()));
        e1.setDataEditada(date1);
// Situacao do evento
        int sit;
        sit = ev_situacao.getSelectedIndex();
        switch(sit){
            case 0:
                e1.setSituacao(Enum.Pendente);
                break;
            case 1: 
                e1.setSituacao(Enum.Confirmado);
                break;
            case 2:
                e1.setSituacao(Enum.Adiado);            
                break;
            case 3:
                e1.setSituacao(Enum.Cancelado);
                break;
        }
        l1 = gl.retornaLocalValido(ev_local.getText());
        e1.setLocal(l1);
// Adiciona o evento no grid para visualizacao
        eventos.addEvento(e1);
// Adiciona o evento no Arraylist do gerenciador
        ge.adicionaEvento(e1);
// Limpa os campos da manutencao de eventos
        limpaCamposManutencao();
// Desabilita os campos
        habilitaOuDesabilitaCampos(false);
// Habilita ou desabilita os botoes da manutencao
        habilitaOuDesabilitaBotoes(true, false, true, true);
    }//GEN-LAST:event_bt_adicionarActionPerformed

    
// Faz validações gerais para incluir o evento    
    public void validaGeral(){
// Valida se informou o nome do Evento
        if (ev_nome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o nome do evento!");
            ev_nome.requestFocus();
            return;
        }
// Valida se informou a data do Evento
        if (ev_data.getText().equals("  /  /    ")){
            JOptionPane.showMessageDialog(null, "Informe a data do evento!");
            ev_data.requestFocus();
            return;
        }
// Valida se informou a data do Evento
        if (ev_qtdpes.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe a quantidade de pessoas do evento!");
            ev_qtdpes.requestFocus();
            return;
        }
// Verifica se o local informado esta cadastrado        
        boolean encontrou = false;
        encontrou = gl.verificaLocal(ev_local.getText());
        if (!(encontrou)) {
            JOptionPane.showMessageDialog(null, "Local não cadastrado. Inclua este local para poder adicionar o evento!");
            bt_inc_local.requestFocus();
            return;
        }
    }
    
    
    private void bt_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_infoActionPerformed
// Informa os dados basicos do evento e informa que foi o mesmo foi iniciado
        Evento e1 = null;
        Date data = new Date();
        int linha;
        linha = tbl_evento.getSelectedRow();
        e1 = eventos.getEvento(linha);
// Define se o item selecionado e uma festa ou um show        
        if (e1 instanceof Festa){
            Festa f1;
            f1 = (Festa) eventos.getEvento(linha);
            f1.iniciarEvento();
// Salva a data do sistema como a data de inicio do evento
            f1.setData_inicio(data);
        } else {
            Show s1;
            s1 = (Show) eventos.getEvento(linha);
            s1.iniciarEvento();
// Salva a data do sistema como a data de inicio do evento            
            s1.setData_inicio(data);
        }
    }//GEN-LAST:event_bt_infoActionPerformed

    private void ev_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ev_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ev_dataActionPerformed

    private void ev_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ev_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ev_nomeActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
// Habilita os campos para a digitacao de um novo evento
        habilitaOuDesabilitaCampos(true);
        habilitaOuDesabilitaBotoes(false, true, false, false);
    }//GEN-LAST:event_bt_novoActionPerformed

    private void ev_situacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ev_situacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ev_situacaoActionPerformed

    private void bt_inc_localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inc_localActionPerformed
// Inclui um novo local
       incLocal incluiLocal;
       incluiLocal = new incLocal(gl);
       incluiLocal.setLocationRelativeTo(null);
       incluiLocal.setVisible(true);
    }//GEN-LAST:event_bt_inc_localActionPerformed

    private void ev_localFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ev_localFocusLost
// Verifica se o local informado esta cadastrado        
        boolean encontrou = false;
        encontrou = gl.verificaLocal(ev_local.getText());
        if (!(encontrou)) {
            JOptionPane.showMessageDialog(null, "Local não cadastrado. Inclua este local para poder adicionar o evento!");
            bt_inc_local.requestFocus();
        }
    }//GEN-LAST:event_ev_localFocusLost

    private void ev_nomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ev_nomeFocusLost

    }//GEN-LAST:event_ev_nomeFocusLost

    private void ev_dataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ev_dataFocusLost

    }//GEN-LAST:event_ev_dataFocusLost

    private void ev_qtdpesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ev_qtdpesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ev_qtdpesFocusLost

    private void bt_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_validarActionPerformed
// Executa os métodos de validacao do evento
        Evento e1 = null;
        int linha;
        linha = tbl_evento.getSelectedRow();
        e1 = eventos.getEvento(linha);
// Define se o item selecionado e uma festa ou um show        
        if (e1 instanceof Festa){
            Festa f1;
            f1 = (Festa) eventos.getEvento(linha);
            f1.verificaAlvara();
            f1.realizarVistoria();
            f1.estabeleceAreaRestritas();
            f1.controlaNormasGerais();
        } else {
            Show s1;
            s1 = (Show) eventos.getEvento(linha);
            s1.verificaAlvara();
            s1.realizarVistoria();
            s1.estabeleceAreaRestritas();
            s1.controlaNormasGerais();
        }
    }//GEN-LAST:event_bt_validarActionPerformed

// Habilita ou desabilita os botoes
    public void habilitaOuDesabilitaBotoes(boolean a, boolean b, boolean c, boolean d){
        bt_novo.setEnabled(a);
        bt_adicionar.setEnabled(b);
        bt_info.setEnabled(c);
        bt_validar.setEnabled(d);
    }
    
// Habilita ou desabilita os campos de manutencao do evento    
    public void habilitaOuDesabilitaCampos(boolean b){
        ev_nome.setEnabled(b);
        ev_data.setEnabled(b);
        ev_qtdpes.setEnabled(b);
        ev_situacao.setEnabled(b);
        ev_local.setEnabled(b);
        ev_tipo.setEnabled(b);
        bt_inc_local.setEnabled(b);
    }
    
// Limpa os campos da manutencao    
    public void limpaCamposManutencao(){
        ev_nome.setText("");
        ev_data.setText("");
        ev_qtdpes.setText("");
        ev_local.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adicionar;
    private javax.swing.JButton bt_inc_local;
    private javax.swing.JButton bt_info;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_validar;
    private javax.swing.JFormattedTextField ev_data;
    private javax.swing.JTextField ev_local;
    private javax.swing.JTextField ev_nome;
    private javax.swing.JTextField ev_qtdpes;
    private javax.swing.JComboBox<String> ev_situacao;
    private javax.swing.JComboBox ev_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator sep;
    private javax.swing.JLabel sta_Evento;
    private javax.swing.JLabel sta_data;
    private javax.swing.JLabel sta_gerevento;
    private javax.swing.JLabel sta_nomedoevento;
    private javax.swing.JLabel sta_numpessoas;
    private javax.swing.JLabel sta_situacao;
    private javax.swing.JTable tbl_evento;
    // End of variables declaration//GEN-END:variables

}
