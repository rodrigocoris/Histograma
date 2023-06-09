/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package histograma;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Formulario extends javax.swing.JFrame {

    
    public Formulario() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1_Imagen = new javax.swing.JLabel();
        jPanel_rojo = new javax.swing.JPanel();
        jPanel_verde = new javax.swing.JPanel();
        jPanel_alfa = new javax.swing.JPanel();
        jPanel_azul = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        JPanel_Gris = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1_Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/histograma/foto2.jpg"))); // NOI18N
        jLabel1_Imagen.setText("JLabel_Imagen");
        jLabel1_Imagen.setToolTipText("");
        jScrollPane1.setViewportView(jLabel1_Imagen);

        jPanel_rojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel_rojoLayout = new javax.swing.GroupLayout(jPanel_rojo);
        jPanel_rojo.setLayout(jPanel_rojoLayout);
        jPanel_rojoLayout.setHorizontalGroup(
            jPanel_rojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_rojoLayout.setVerticalGroup(
            jPanel_rojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        jPanel_verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel_verdeLayout = new javax.swing.GroupLayout(jPanel_verde);
        jPanel_verde.setLayout(jPanel_verdeLayout);
        jPanel_verdeLayout.setHorizontalGroup(
            jPanel_verdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );
        jPanel_verdeLayout.setVerticalGroup(
            jPanel_verdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        jPanel_alfa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel_alfaLayout = new javax.swing.GroupLayout(jPanel_alfa);
        jPanel_alfa.setLayout(jPanel_alfaLayout);
        jPanel_alfaLayout.setHorizontalGroup(
            jPanel_alfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_alfaLayout.setVerticalGroup(
            jPanel_alfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );

        jPanel_azul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel_azulLayout = new javax.swing.GroupLayout(jPanel_azul);
        jPanel_azul.setLayout(jPanel_azulLayout);
        jPanel_azulLayout.setHorizontalGroup(
            jPanel_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        jPanel_azulLayout.setVerticalGroup(
            jPanel_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );

        boton1.setText("Dibujar histogramas");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        JPanel_Gris.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout JPanel_GrisLayout = new javax.swing.GroupLayout(JPanel_Gris);
        JPanel_Gris.setLayout(JPanel_GrisLayout);
        JPanel_GrisLayout.setHorizontalGroup(
            JPanel_GrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        JPanel_GrisLayout.setVerticalGroup(
            JPanel_GrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("src/histograma/foto2.jpg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_rojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_azul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(JPanel_Gris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_verde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_alfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_verde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_alfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JPanel_Gris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_rojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jButton2.setText("Secuencial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tiempos de ejecucion:");

        jButton3.setText("ForkJoin");

        jButton4.setText("Execute Service");

        jButton1.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(7, 7, 7)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        try {
            //LEEMOS LA IMAGEN
            Image imagen=ImageIO.read(new File(jTextField1.getText()));
            //establecemos la imagen como imagen en el jLabel
            jLabel1_Imagen.setIcon(new ImageIcon(imagen));
            //CREAMOS EL HISTOGRAMA
            Histograma ObjHistograma=new Histograma();
            int[][] histograma=ObjHistograma.histograma((BufferedImage)imagen);
            //DIBUJAMOS EL HISTOGRAMA
            DibujarGrafico ObjDibujaHisto=new DibujarGrafico();
            for (int i = 0; i < 5; i++) {
                //extraemos un canal del histograma 
                int[] histogramaCanal=new int[256];
                System.arraycopy(histograma[i], 0, histogramaCanal, 0, histograma[i].length);
                //Dibujamos en el panel
                switch(i){
                    case 0:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, jPanel_rojo, Color.red);
                        break;
                    case 1:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, jPanel_verde, Color.green);
                        break;
                    case 2:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, jPanel_azul, Color.blue);
                        break;
                    case 3:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, jPanel_alfa, Color.black);
                        break;
                    case 4:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, JPanel_Gris, Color.gray);
                        break;
                }
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
            //LEEMOS LA IMAGEN
            Image imagen=ImageIO.read(new File(jTextField1.getText()));
            //establecemos la imagen como imagen en el jLabel
            jLabel1_Imagen.setIcon(new ImageIcon(imagen));
            //CREAMOS EL HISTOGRAMA
            Histograma ObjHistograma=new Histograma();
            int[][] histograma=ObjHistograma.histograma((BufferedImage)imagen);
            //DIBUJAMOS EL HISTOGRAMA
            DibujarGrafico ObjDibujaHisto=new DibujarGrafico();
            for (int i = 0; i < 5; i++) {
                //extraemos un canal del histograma 
                int[] histogramaCanal=new int[256];
                System.arraycopy(histograma[i], 0, histogramaCanal, 0, histograma[i].length);
                //Dibujamos en el panel
                switch(i){
                    case 0:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, jPanel_rojo, Color.red);
                        break;
                    case 1:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, jPanel_verde, Color.green);
                        break;
                    case 2:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, jPanel_azul, Color.blue);
                        break;
                    case 3:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, jPanel_alfa, Color.black);
                        break;
                    case 4:
                        ObjDibujaHisto.crearHistograma(histogramaCanal, JPanel_Gris, Color.gray);
                        break;
                }
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_Gris;
    private javax.swing.JButton boton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_Imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_alfa;
    private javax.swing.JPanel jPanel_azul;
    private javax.swing.JPanel jPanel_rojo;
    private javax.swing.JPanel jPanel_verde;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
