
package ProyectoFinal;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import static javax.swing.JOptionPane.*;


public class frmMenu extends javax.swing.JFrame{
        
    //zona de inicialiación de clases 
        pnlVenta venta=new pnlVenta(); 
        pnlArticulo articulo=new pnlArticulo(this);
        pnlInventario inventario=new pnlInventario(this);
        
    
    public frmMenu() {//este es el constructor del menu
        initComponents();
        articulo.enlazarObservador(venta);

        this.setExtendedState(this.MAXIMIZED_BOTH);//da el tamaño máximo según el tamaño de ventana. 
        this.setResizable(false);
        this.setLocationRelativeTo(null);//con esto aparecerá centrado.
        this.setTitle("Bienvenido a EasyStock, actualmente estás en la versión gratuita");
        pnlContenedor.add(venta);
        venta.setVisible(true);
        
        
    }

    ////gafedsf
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatosTienda = new javax.swing.JPanel();
        lnlNombreTienda = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnSalirSistema = new javax.swing.JButton();
        pnlBotones = new javax.swing.JPanel();
        btnArticulos = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnDistribuidor = new javax.swing.JButton();
        pnlContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        pnlDatosTienda.setBackground(new java.awt.Color(102, 255, 102));
        pnlDatosTienda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnlNombreTienda.setFont(new java.awt.Font("Malayalam MN", 0, 36)); // NOI18N
        lnlNombreTienda.setText("Tienda de Software EasyStock");
        pnlDatosTienda.add(lnlNombreTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 546, 88));

        lblDireccion.setText("Ubicada Allende #239, col. Centro  ");
        pnlDatosTienda.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 18, -1, -1));

        lblTelefono.setText("Teléfono: 311 234 3434");
        pnlDatosTienda.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        getContentPane().add(pnlDatosTienda, java.awt.BorderLayout.NORTH);

        pnlDatos.setBackground(new java.awt.Color(102, 255, 204));

        jTextField1.setText("Hora y fecha actual:");

        jTextField2.setText("Datos del usuario");

        btnSalirSistema.setText("Salir del sistema");
        btnSalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btnSalirSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addComponent(btnSalirSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlDatos, java.awt.BorderLayout.LINE_END);

        pnlBotones.setBackground(new java.awt.Color(0, 255, 204));

        btnArticulos.setText("Artículos");
        btnArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticulosActionPerformed(evt);
            }
        });

        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        btnDistribuidor.setText("Distribuidor");
        btnDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistribuidorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDistribuidor, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        getContentPane().add(pnlBotones, java.awt.BorderLayout.LINE_START);

        pnlContenedor.setPreferredSize(new java.awt.Dimension(560, 640));
        pnlContenedor.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticulosActionPerformed
       mostrarPanelArticulo();
       desactivarBoton(evt); 
    }//GEN-LAST:event_btnArticulosActionPerformed

    private void btnSalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirSistemaActionPerformed
            this.dispose();
            
    }//GEN-LAST:event_btnSalirSistemaActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        mostrarPanelInventario();
        desactivarBoton(evt);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistribuidorActionPerformed
        showMessageDialog(this,"Disponible en la aplicación PREMIUM");
    }//GEN-LAST:event_btnDistribuidorActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
                
            }
        });
    }
    
    
    //zona de métodos
    public void actualizarPanel(){
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        activarBotones();
        
    }
     
   public void desactivarBoton(ActionEvent e){
       JButton botonPresionado=(JButton)e.getSource();
       botonPresionado.setEnabled(false);
   }
    
    public void mostrarPanelArticulo() {
        pnlContenedor.remove(panelActual());
        pnlContenedor.add(articulo);
        actualizarPanel();
        //venta.vaciarTablaVenta();
        

    }

    public void mostrarPanelVenta() {
        pnlContenedor.remove(panelActual());
        pnlContenedor.add(venta);
        actualizarPanel();

    }

    public void mostrarPanelInventario() {
        pnlContenedor.remove(panelActual());
        pnlContenedor.add(inventario);
        actualizarPanel();
    }

    public Component panelActual() {
        Component actual;
        actual = pnlContenedor.getComponent(0);
        return actual;
    }

    public void activarBotones() {
        btnArticulos.setEnabled(true);
        btnDistribuidor.setEnabled(true);
        btnInventario.setEnabled(true);
        btnPedidos.setEnabled(true);
    }
    
    
    public controladorPanel getArticulo() {
        return articulo;
    }
     
    
        
    
        
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnDistribuidor;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnSalirSistema;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lnlNombreTienda;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlDatosTienda;
    // End of variables declaration//GEN-END:variables

    
    
}
