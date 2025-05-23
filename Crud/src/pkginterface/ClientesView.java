/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkginterface;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Cliente;
import model.dao.ClienteDAO;

/**
 *
 * @author Uriel
 */
public class ClientesView extends javax.swing.JFrame {

    /**
     * Creates new form ClientesView
     */
    public ClientesView() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTClientes.getModel();
        jTClientes.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
    }

    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) jTClientes.getModel();
        modelo.setNumRows(0);
        ClienteDAO cdao = new ClienteDAO();

        for (Cliente c : cdao.read()) {

            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCpf(),
                c.getTelefone(),
                c.getEmail(),
                c.getEndereco(),
                c.getDataNascimento(),
            });
        }
    }
public void readJTableForNomeOuCpf(String nome, String cpf) {
    DefaultTableModel modelo = (DefaultTableModel) jTClientes.getModel();
    modelo.setNumRows(0);
    ClienteDAO dao = new ClienteDAO();
    for (Cliente c : dao.readForNomeOuCpf(nome, cpf)) {
        modelo.addRow(new Object[]{
            c.getId(),
            c.getNome(),
            c.getCpf(),
            c.getTelefone(),
            c.getEmail(),
            c.getEndereco(),
            c.getDataNascimento()
        });
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();
        jBVoltar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBApagar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        txtBuscaNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setPreferredSize(new java.awt.Dimension(1110, 651));

        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Cpf", "Telefone", "Email", "Endereço", "Data Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTClientes.setPreferredSize(new java.awt.Dimension(1100, 80));
        jTClientes.setRequestFocusEnabled(false);
        jTClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTClientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTClientes);

        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBApagar.setText("Apagar");
        jBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBApagarActionPerformed(evt);
            }
        });

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jBVoltar)
                .addGap(351, 351, 351)
                .addComponent(jBEditar)
                .addGap(50, 50, 50)
                .addComponent(jBApagar)
                .addGap(50, 50, 50)
                .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jBPesquisar))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1106, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBVoltar)
                    .addComponent(jBEditar)
                    .addComponent(jBApagar)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
    int selectedRow = jTClientes.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um cliente para editar.");
        return;
    }

    int id = (int) jTClientes.getValueAt(selectedRow, 0);
    String nome = (String) jTClientes.getValueAt(selectedRow, 1); 
    String telefone = (String) jTClientes.getValueAt(selectedRow, 3);
    String email = (String) jTClientes.getValueAt(selectedRow, 4);
    String endereco = (String) jTClientes.getValueAt(selectedRow, 5);
    java.sql.Date dataSql = (java.sql.Date) jTClientes.getValueAt(selectedRow, 6);
    String dataNascimento = new java.text.SimpleDateFormat("dd/MM/yyyy").format(dataSql);


    ClienteEdit editPopup = new ClienteEdit(this, id, nome, telefone, endereco, email, dataNascimento);
    editPopup.setLocationRelativeTo(null); 
    editPopup.setVisible(true);


    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
    String busca = txtBuscaNome.getText();
    readJTableForNomeOuCpf(busca, busca);
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jTClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClientesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClientesKeyReleased

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
    Cadastro cadastro = new Cadastro();
    cadastro.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBApagarActionPerformed
        if (jTClientes.getSelectedRow() != -1) {
            Cliente c = new Cliente();
            ClienteDAO dao = new ClienteDAO();

            c.setId((int)jTClientes.getValueAt(jTClientes.getSelectedRow(), 0));

            dao.delete(c);


            readJTable();

        } else{
            JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir.");
        }
    }//GEN-LAST:event_jBApagarActionPerformed

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
            java.util.logging.Logger.getLogger(ClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesView().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBApagar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTClientes;
    private javax.swing.JTextField txtBuscaNome;
    // End of variables declaration//GEN-END:variables
}
