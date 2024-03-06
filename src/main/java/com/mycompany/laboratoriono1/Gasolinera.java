package com.mycompany.laboratoriono1;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Gasolinera extends javax.swing.JFrame {

    String combustibles[] = {"Super", "Regular", "Diesel"};
    double precios[] = {32.45, 30.95, 30.97};
    double precio = 0;

    int cantidad = 0;
    
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Venta> listaVentas = new ArrayList<Venta>();

    public Gasolinera() {
        initComponents();

        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(combustibles);
        cboCombustible.setModel(comboModel);
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total");
        actualizarTabla();
        CalcularPrecio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        cboCombustible = new javax.swing.JComboBox<>();
        SpnCantidad = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        TxtPrecio = new javax.swing.JLabel();
        TxtTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblVentas = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Gasolinera S.A");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tipo de Combustible:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Cantidad:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Precio GL");

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        cboCombustible.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cboCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCombustible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCombustibleActionPerformed(evt);
            }
        });

        SpnCantidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SpnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        SpnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpnCantidadStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Precio Total");

        TxtPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TxtPrecio.setText("Q.0.00");

        TxtTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TxtTotal.setText("Q.0.00");

        TblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TblVentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpnCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTotal)
                    .addComponent(TxtPrecio))
                .addGap(0, 90, Short.MAX_VALUE)
                .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(cboCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(SpnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(TxtTotal)))
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        Venta venta = new Venta();
        venta.setId(cboCombustible.getSelectedIndex());
        venta.setDescripcion(cboCombustible.getSelectedItem().toString());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        venta.setTotal(precio * cantidad);
        listaVentas.add(venta);
        actualizarTabla();
        borrarVenta();
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void cboCombustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCombustibleActionPerformed
        CalcularPrecio();
        
    }//GEN-LAST:event_cboCombustibleActionPerformed

    private void SpnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpnCantidadStateChanged
        CalcularPrecio();
    }//GEN-LAST:event_SpnCantidadStateChanged


   
    public void borrarVenta() {

        precio = 0;
        cantidad = 0;
    }

    public void CalcularPrecio() {

        precio = precios[cboCombustible.getSelectedIndex()];
        cantidad = Integer.parseInt(SpnCantidad.getValue().toString());
        TxtPrecio.setText(aMoneda(precio));
        TxtTotal.setText(aMoneda(precio * cantidad));
    }

    public String aMoneda(double precio) {

        return "Q " + Math.round(precio * 100.0) / 100.0 + "";
    }

    public void actualizarTabla() {
        while (modelo.getRowCount() > 0) {

            modelo.removeRow(0);
        }
        for (Venta v : listaVentas) {

            Object x[] = new Object[4];
            x[0] = v.getDescripcion();
            x[1] = aMoneda(v.getPrecio());
            x[2] = v.getCantidad();
            x[3] = aMoneda(v.getTotal());
            modelo.addRow(x);

        }

        TblVentas.setModel(modelo);

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gasolinera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gasolinera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gasolinera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gasolinera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gasolinera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JSpinner SpnCantidad;
    private javax.swing.JTable TblVentas;
    private javax.swing.JLabel TxtPrecio;
    private javax.swing.JLabel TxtTotal;
    private javax.swing.JComboBox<String> cboCombustible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
