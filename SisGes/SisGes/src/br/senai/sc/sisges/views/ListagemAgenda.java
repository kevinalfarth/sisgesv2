/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisges.views;

import br.senai.sc.sisges.dao.AgendaDao;
import br.senai.sc.sisges.dao.ColaboradorDao;
import br.senai.sc.sisges.modelo.Agenda;
import br.senai.sc.sisges.modelo.Colaborador;
import br.senai.sc.sisges.views.ListagemColaborador;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
impo rt java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class ListagemAgenda extends javax.swing.JPanel {
 private CardLayout ag;
    private int idAg;

    public ListagemAgenda() {
        initComponents();
        this.add(painelListagem, "painelListagem");
        this.add(painelEdicao, "painelEdicao");

        this.ag = (CardLayout) this.getLayout();
        this.ag.show(this, "painelListagem");
    }
     private void popularTabela() {
        AgendaDao ag = new AgendaDao();
        List<Agenda> listaTarefa;

        try {
            listaTarefa = ag.listarTarefas();

            DefaultTableModel model = (DefaultTableModel) tblTarefas.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaTarefa.size(); i++) {
                Agenda a = listaTarefa.get(i);
                lista.add(new Object[]{a.getCodColAge(), a.getCodEquAge(),
                    a.getDatComAge(),a.getDatCriAge(), a.getDesAge(),
                    a.getIdCol(),a.getIdEqu(),a.getTitAge()});
            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            String msg = "Ocorreu um erro ao obter as tarefas do banco de dados!";
            JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(ListagemColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      private void limparTabela() {
        ((DefaultTableModel) tblTarefas.getModel()).setNumRows(0);
        tblTarefas.updateUI();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("sis_ges?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        agendaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Agenda a");
        agendaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : agendaQuery.getResultList();
        painelListagem = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTarefas = new javax.swing.JTable();
        painelEdicao = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, agendaList, tblTarefas);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEqu}"));
        columnBinding.setColumnName("Id Equ");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCol}"));
        columnBinding.setColumnName("Id Col");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${desAge}"));
        columnBinding.setColumnName("Des Age");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${titAge}"));
        columnBinding.setColumnName("Tit Age");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${agendaPK}"));
        columnBinding.setColumnName("Agenda PK");
        columnBinding.setColumnClass(br.senai.sc.sisges.views.AgendaPK.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane2.setViewportView(tblTarefas);

        javax.swing.GroupLayout painelListagemLayout = new javax.swing.GroupLayout(painelListagem);
        painelListagem.setLayout(painelListagemLayout);
        painelListagemLayout.setHorizontalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        painelListagemLayout.setVerticalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        add(painelListagem, "card2");

        javax.swing.GroupLayout painelEdicaoLayout = new javax.swing.GroupLayout(painelEdicao);
        painelEdicao.setLayout(painelEdicaoLayout);
        painelEdicaoLayout.setHorizontalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        painelEdicaoLayout.setVerticalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(painelEdicao, "card2");

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<br.senai.sc.sisges.views.Agenda> agendaList;
    private javax.persistence.Query agendaQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painelEdicao;
    private javax.swing.JPanel painelListagem;
    private javax.swing.JTable tblTarefas;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
