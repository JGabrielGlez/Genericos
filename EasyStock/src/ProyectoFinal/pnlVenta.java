
package ProyectoFinal;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class pnlVenta extends controladorPanel implements Observador{
    
        

    
     @Override
    public void actualizar() {
        llenarTabla();
        vaciarTablaVenta();
    }

    
    public pnlVenta() {

        initComponents();
        m=(DefaultTableModel)tblVenta.getModel();
        modelVenta=(DefaultTableModel) tblTotal.getModel();
        leerArticulos();
        
        
    }
   //Es buena idea poner un botón de actualizar que se traiga la tabla tal cuál está en el panel de artículos
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNombre = new javax.swing.JPanel();
        lblVenta = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlFormulario = new javax.swing.JPanel();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTotal = new javax.swing.JTable();
        pnlBotonesTabla = new javax.swing.JPanel();
        pnlTotal = new javax.swing.JPanel();
        txtMonto = new javax.swing.JFormattedTextField();
        txtTotal = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGetTotal = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 102));
        setLayout(new java.awt.BorderLayout());

        pnlNombre.setBackground(new java.awt.Color(102, 255, 204));
        pnlNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNombreMouseClicked(evt);
            }
        });

        lblVenta.setFont(new java.awt.Font("Times", 0, 36)); // NOI18N
        lblVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVenta.setText("Venta");
        pnlNombre.add(lblVenta);

        add(pnlNombre, java.awt.BorderLayout.PAGE_START);

        pnlBotones.setBackground(new java.awt.Color(204, 204, 255));
        pnlBotones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBotonesMouseClicked(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(pnlBotones, java.awt.BorderLayout.PAGE_END);

        pnlFormulario.setLayout(new java.awt.BorderLayout());

        pnlTabla.setBackground(new java.awt.Color(51, 255, 51));

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artículo", "ID", "Costo Total", "Disponibles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVenta);
        if (tblVenta.getColumnModel().getColumnCount() > 0) {
            tblVenta.getColumnModel().getColumn(0).setResizable(false);
            tblVenta.getColumnModel().getColumn(1).setResizable(false);
            tblVenta.getColumnModel().getColumn(2).setResizable(false);
            tblVenta.getColumnModel().getColumn(3).setResizable(false);
        }

        tblTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artículo", "ID", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTotal);
        if (tblTotal.getColumnModel().getColumnCount() > 0) {
            tblTotal.getColumnModel().getColumn(0).setResizable(false);
            tblTotal.getColumnModel().getColumn(1).setResizable(false);
            tblTotal.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFormulario.add(pnlTabla, java.awt.BorderLayout.NORTH);

        pnlBotonesTabla.setBackground(new java.awt.Color(153, 153, 255));
        pnlBotonesTabla.setLayout(new java.awt.BorderLayout());
        pnlFormulario.add(pnlBotonesTabla, java.awt.BorderLayout.SOUTH);

        pnlTotal.setBackground(new java.awt.Color(204, 102, 0));
        pnlTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTotalMouseClicked(evt);
            }
        });
        pnlTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMonto.setEditable(false);
        txtMonto.setColumns(2);
        txtMonto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMonto.setText("Monto total:");
        pnlTotal.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 528, -1));

        txtTotal.setEditable(false);
        pnlTotal.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 0, 180, -1));

        btnAgregar.setText("Agregar artículo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlTotal.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlTotal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        btnGetTotal.setText("Obtener total");
        btnGetTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetTotalActionPerformed(evt);
            }
        });
        pnlTotal.add(btnGetTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 120, -1));

        pnlFormulario.add(pnlTotal, java.awt.BorderLayout.CENTER);

        add(pnlFormulario, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
 private int getSelectedRow(JTable tabla){
    int row=0;
    row=tabla.getSelectedRow();
    return row;
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //tengo que obtener la posición de la tabla para sacar del arreglo dicho artículo y poner solo el nombre y por default agregar 1 en cantidad
        
        String nom; double costo; int id;
        int pos=getSelectedRow(tblVenta);
        quitarSeleccion();

        
        if(pos!=-1){
            nom=articulos[pos].getName();
            id=articulos[pos].getId();
            
          if(filaValida(id, modelVenta)==true){
            
            Object[] o=new Object[3];
            o[0]=nom;
            o[1]=id;
            o[2]=1;
            modelVenta.addRow(o);
            
                }else{msg("Este artículo ya está agregado");}
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed
public boolean filaValida(int id, DefaultTableModel m) {
        boolean valido = true;
        for (int i = 0; i < m.getRowCount(); i++) {
            if ((int)(m.getValueAt(i, 1))==id) {
                valido = false;
            }
        }
        return valido;
    }

public void quitarSeleccion(){
    tblTotal.clearSelection();
    tblTotal.transferFocus();
    tblVenta.clearSelection();
    tblVenta.transferFocus();
}
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int pos=getSelectedRow(tblTotal);

       if(pos!=-1){
       
           modelVenta.removeRow(pos);
           quitarSeleccion();
           
       }else{msg("No hay fila seleccionada");}
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void pnlNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNombreMouseClicked
        quitarSeleccion();
    }//GEN-LAST:event_pnlNombreMouseClicked

    private void pnlTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTotalMouseClicked

                quitarSeleccion();

    }//GEN-LAST:event_pnlTotalMouseClicked

    private void pnlBotonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBotonesMouseClicked
        quitarSeleccion();
    }//GEN-LAST:event_pnlBotonesMouseClicked

    //método que recorra toda la columna de los articulos, identifique su id y lo busqie en la tabla de ventas, para despues
    //multiplciar su costo por la cantidad, verificando a su vez que no exceda la disponibilidad
    //también validad que sea algún número negativo o una letra
    public void sumaTotal(){
        if(m.getRowCount()!=-1){
        txtTotal.setText("");
        int  excedentes=0, a=comunicador.getA();
        double suma=0;
        String cad="| ", idErrorCad="| ", numNeg="| ";
        
        int disponible=0, cantidadVendida=0;
      
      for(int i=0; i<modelVenta.getRowCount();i++){//este es el contador para saber qué tantos id hay que encontrar
          
          int id = Integer.parseInt(modelVenta.getValueAt(i, 1).toString()); //esto me da el id del articulo a vender
          
          for(int b=0; b<a+1; b++){ //este es el contador para encontrar la posición del articulo con su id, a+1 es la cantidad de articulos en el arreglo 


              try{
                  
                  cantidadVendida=Integer.parseInt(modelVenta.getValueAt(i, 2).toString());
                  if(cantidadVendida<=0){
                      //numNeg+=(modelVenta.getValueAt(b, 1).toString())+"| ";
                      msg("Número inválido;"); excedentes++;}
              }catch(NumberFormatException e){
                  
                 idErrorCad+=articulos[b].getId()+" | ";
                  msg("Solo números son permitidos, error con los artículos con ID: "+idErrorCad);
                  excedentes++;
              }catch(Exception e){}
              
              if(articulos[b].getId()==id){//este me posiciona en el articulo a vender dentro del propio arreglo
                  disponible=articulos[b].getCant();
                  
                  if(existencia(disponible, cantidadVendida)==true){
                  suma+=cantidadVendida*articulos[b].getCosto();
                  b=a+2;
                  }else{
                    cad += articulos[b].getId()+ " | ";
                    
                     excedentes++; //concateno y cuento la cantidad de articulos que exceden el inventario
                     
          }
                  //esto para que salga del bucle cuando encuentre un valor que coincida
              }
              
          }//cierre del bucle for con b como contador, en este punto ya tengo la posición del articulo a vender
          
          
        
      }//cierre del primer bucle for
      
      if(excedentes>0){
          msg("La cantidad de los siguientes artículos con ID "+cad+"exceden las existencias");
          txtTotal.setText("");
      }else{
          txtTotal.setText(suma+"");
      }
      
     
      
    }else{msg("No hay artículos agregados");return;}
    
    }
    public boolean existencia(int disponible, int cantidadVenta){
       
        if(cantidadVenta>disponible){
           return false; 
        }
        return true;
    }
    
    
    private void btnGetTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetTotalActionPerformed
        if(modelVenta.getRowCount()>-1) {sumaTotal();} else {msg("No hay artículos seleccionados para vender");txtTotal.setText("");}
    }//GEN-LAST:event_btnGetTotalActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
if(m.getRowCount()!=-1){
    sumaTotal();
    recibo reciboForm = new recibo();
    reciboForm.setTabla(tblTotal);
    reciboForm.setVisible(true);
    reciboForm.setMonto(txtTotal.getText());
}
       

    }//GEN-LAST:event_btnAceptarActionPerformed
   
        public void llenarTabla() {
        m.setRowCount(0);
        articulos = comunicador.getArticulo();
        int a = comunicador.getA();//esto me da el numero de filas de la tabla de articulos
        //a es hasta donde está lleno el arreglo, la cantidad de filas.


        if (a != -1) {
                    m.setRowCount(a+1);

            for (int i = 0; i < a+1; i++) {

                Object[] datos = new Object[4];
                datos[0] = articulos[i].getName();
                datos[1] = articulos[i].getId();
                datos[2] = articulos[i].getCosto();
                datos[3] = articulos[i].getCant();
                m.setValueAt(datos[0], i, 0);
                m.setValueAt(datos[1], i, 1);
                m.setValueAt(datos[2], i, 2);
                m.setValueAt(datos[3], i, 3);

            }
        }

        //m.fireTableDataChanged();
    }

    private void msg(String m){
        JOptionPane.showMessageDialog(this,m);
    }
    
    private void leerArticulos(){
        String nom; int id, cantidad; double costo;
        //new Articulo(nom, id, cantidad, costo);
        try{
        fce=new FileReader("DatosArticulos.NoBorrar");
        bce=new BufferedReader(fce);
        String linea="";
        
        while((linea=bce.readLine())!=null){//esto es para crear el arreglo
            String R[]=linea.split("\\|"); m.addRow(R);
           // msg(""+R[0]+R[1]+R[2]+R[3]);
            nom=R[0]; id=Integer.parseInt(R[1]); costo=Double.parseDouble(R[2]); cantidad=Integer.parseInt(R[3]);
            articulos[++a]=new Articulo(nom, id, cantidad, costo);
        }
        
            comunicador.setArticulo(articulos,a);
            
        }catch(Exception e){}
        
    }
    
    public void vaciarTablaVenta(){
        modelVenta.setRowCount(0);
    }

    public JTable getTblTotal() {
        return tblTotal;
    }
    
    
    
    //variables de los archivos
    private FileWriter fcs;//flujo de escritura
    private FileReader fce;//flujo de lectura
    private BufferedReader bce;//
    private DefaultTableModel m,modelVenta;
    private Articulo[] articulos=new Articulo[5];
    private Articulo[] venta=new Articulo[5];
    private int a = -1;
    
    recibo recibo;
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGetTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblVenta;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlBotonesTabla;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlNombre;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JPanel pnlTotal;
    private javax.swing.JTable tblTotal;
    private javax.swing.JTable tblVenta;
    private javax.swing.JFormattedTextField txtMonto;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

   

   
}
