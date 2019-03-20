package br.senai.sc.sisges.views;

import br.senai.sc.sisges.dao.ColaboradorDao;
import br.senai.sc.sisges.dao.EquipeDao;
import br.senai.sc.sisges.modelo.Colaborador;
import br.senai.sc.sisges.modelo.Equipe;
import br.senai.sc.sisges.views.CadastroColaborador;
import br.senai.sc.sisges.views.ListagemColaborador;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class ListagemEquipe extends javax.swing.JPanel {

    private CardLayout cl;
    private int codEqu;

    public ListagemEquipe() {
        initComponents();

        this.add(painelListagem, "painelListagem");
        this.add(painelEdicao, "painelEdicao");

        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelListagem");
    }

    private void popularTabela() {
        EquipeDao cl = new EquipeDao();
        List<Equipe> listaEquipe;

        try {
            listaEquipe = cl.listarEquipe();

            DefaultTableModel model = (DefaultTableModel) tblEquipe.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaEquipe.size(); i++) {
                Equipe equ = listaEquipe.get(i);
                lista.add(new Object[]{equ.getIdEqu(), equ.getNomEqu(),});
            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            String msg = "Ocorreu um erro ao obter as equipes do banco de dados!";
            JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(ListagemEquipe.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTextField1 = new javax.swing.JTextField();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("sis_ges?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        equipeQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Equipe e");
        equipeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : equipeQuery.getResultList();
        painelEdicao = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelNomeEquipe = new javax.swing.JLabel();
        cpNomeEquipe = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        cpDescricaoEquipe = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnSalvar = new javax.swing.JButton();
        btnListarColaboradores = new javax.swing.JButton();
        painelListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipe = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        setLayout(new java.awt.CardLayout());

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setText("Atualizar equipe");

        labelNomeEquipe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNomeEquipe.setText("Nome da Equipe:");

        cpNomeEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeEquipeActionPerformed(evt);
            }
        });

        labelDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelDescricao.setText("Descrição:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnListarColaboradores.setText("Listar colaboradores");
        btnListarColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarColaboradoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEdicaoLayout = new javax.swing.GroupLayout(painelEdicao);
        painelEdicao.setLayout(painelEdicaoLayout);
        painelEdicaoLayout.setHorizontalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(labelTitulo))
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNomeEquipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpNomeEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpDescricaoEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListarColaboradores)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        painelEdicaoLayout.setVerticalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeEquipe)
                    .addComponent(cpNomeEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescricao)
                    .addComponent(cpDescricaoEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnListarColaboradores))
                .addGap(27, 27, 27))
        );

        add(painelEdicao, "card2");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, equipeList, tblEquipe);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${desEqu}"));
        columnBinding.setColumnName("Des Equ");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomEqu}"));
        columnBinding.setColumnName("Nom Equ");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEqu}"));
        columnBinding.setColumnName("Id Equ");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tblEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEquipeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEquipe);

        javax.swing.GroupLayout painelListagemLayout = new javax.swing.GroupLayout(painelListagem);
        painelListagem.setLayout(painelListagemLayout);
        painelListagemLayout.setHorizontalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        painelListagemLayout.setVerticalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        add(painelListagem, "card3");

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Equipe Equ = new Equipe();
        Equ.setNomEqu(cpNomeEquipe.getText());
        Equ.setDesEqu(cpDescricaoEquipe.getText());

        EquipeDao equDao = new EquipeDao();
        try {
            equDao.inserir(Equ);
            JOptionPane.showMessageDialog(null, "Dados da equipe atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar dados da equipe!");
            Logger.getLogger(CadastroColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void limparTabela() {
        ((DefaultTableModel) tblEquipe.getModel()).setNumRows(0);
        tblEquipe.updateUI();
    }

    private void cpNomeEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeEquipeActionPerformed

    private void preencherFormulario(int codigoEquipe) {

        EquipeDao equipe = new EquipeDao();

        try {
            Equipe equ = equipe.getEquipe(codigoEquipe);
            cpNomeEquipe.setText(equ.getNomEqu());
            cpDescricaoEquipe.setText(equ.getDesEqu());

        } catch (SQLException ex) {
            Logger.getLogger(ListagemColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.codEqu = codigoEquipe;

    }

    private void tblEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEquipeMouseClicked
        int linha = tblEquipe.getSelectedRow();

        if (linha != -1) {

            String codigo = tblEquipe.getValueAt(linha, 0).toString();
            int codigoEquipe = Integer.parseInt(codigo);
            this.preencherFormulario(codigoEquipe);
            this.cl.show(this, "painelEdicao");
        }

    }//GEN-LAST:event_tblEquipeMouseClicked

    private void btnListarColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarColaboradoresActionPerformed

        ListagemColaborador lc = new ListagemColaborador();
        this.add(painelListagem, "painelListagem");
        this.add(painelEdicao, "painelEdicao");

        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelListagem");

    }//GEN-LAST:event_btnListarColaboradoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarColaboradores;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cpDescricaoEquipe;
    private javax.swing.JTextField cpNomeEquipe;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<br.senai.sc.sisges.views.Equipe> equipeList;
    private javax.persistence.Query equipeQuery;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNomeEquipe;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelEdicao;
    private javax.swing.JPanel painelListagem;
    private javax.swing.JTable tblEquipe;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}