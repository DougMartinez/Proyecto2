/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Objeto.Inventario;
import proyecto2.ListasEnlazadas.ListaEnlazadaServer;
import proyecto2.ListasEnlazadas.ListaEnlazadaPersona;
import proyecto2.ListasEnlazadas.ListaEnlazada;
import proyecto2.Nodos.Nodo;
import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import proyecto2.PackProcesor;
import Objeto.Persona;
import Objeto.Producto;
import Objeto.Servidor;
import proyecto2.ListasEnlazadas.ListaEnlazadaInventario;
import proyecto2.Nodos.NodoInventario;
import proyecto2.Nodos.NodoPersona;
import proyecto2.Nodos.NodoServer;
import proyecto2.Util;

/**
 *
 * @author Douglas
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        Util u = new Util();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Proyecto 2");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Abrir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Guardar Como");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Play");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Stop");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("Resultados");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jScrollPane2.setBackground(new java.awt.Color(255, 204, 255));

        jTextArea2.setBackground(new java.awt.Color(255, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Archivo", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Resultados", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Abrir
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
//            BufferedReader bf = new BufferedReader(new FileReader(abrirCSV()));
//            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Douglas\\Desktop\\ArchivoEntrada.csv"));
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Douglas\\Desktop\\Nuevo documento de texto.txt"));
            String linea = bf.readLine();
            while(linea != null){
            jTextArea2.append(linea + "\n");
            linea = bf.readLine();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error al encontrar archivo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //Guardar
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(Path);
            pw = new PrintWriter(fichero);

            String[] linea = jTextArea2.getText().split("\n");
            for(int i=0; i<linea.length; i++){
                pw.println(linea[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //GuardarComo
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            String ruta="";
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(this);
            File archivo = fc.getSelectedFile();
            if(archivo !=null){
                FileWriter  fw = new FileWriter(archivo+".csv");
                String[] linea = jTextArea2.getText().split("\n");
                for(int i=0; i<linea.length; i++){
                    fw.write(linea[i] + "\n");
                }
                fw.close();
           }
        } catch(IOException ex){
          JOptionPane.showMessageDialog(null,
               "Su archivo no se ha guardado","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    //Play
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String[] linea1 = jTextArea2.getText().split("\n");
        String[] linea2;
        for(int i=1; i<linea1.length; i++){
            String aux = linea1[i];
            linea2 = aux.split(";");
            String op = linea2[0].toLowerCase();
            switch (op){
                case "servidores":
                    Servidor ser = new Servidor();
                    ser.setNoServer(Integer.parseInt(linea2[1]));
                    ser.setSigServer(Integer.parseInt(linea2[2]));
                    ser.setX(Integer.parseInt(linea2[3]));
                    ser.setY(Integer.parseInt(linea2[4]));
                    ser.setAlto(Integer.parseInt(linea2[5]));
                    ser.setAncho(Integer.parseInt(linea2[6]));
                    ser.setLlegada(Integer.parseInt(linea2[7]));
                    servidorLista.add(ser);
                    break;
                    
                case "personas":
                    Persona persona = new Persona();
                    persona.setX(Integer.parseInt(linea2[3]));
                    persona.setY(Integer.parseInt(linea2[4]));
                    persona.setTasaLlegada(Integer.parseInt(linea2[7])); //Cuantas personas entran al sistema
                    persona.setTiempo(Integer.parseInt(linea2[8])); // Cada cuanto entran las personas de TasaLLegada
                    persona.setRadio(Integer.parseInt(linea2[9]));
                    personaLista.add(persona);
                    break;
                    
                case "productos":
                    Producto prod = new Producto();
                    prod.setId(Integer.parseInt(linea2[10]));
                    prod.setNombre(linea2[11]);
                    prod.setDescripcion(linea2[12]);
                    prod.setLinea(linea2[13]);
                    productosLista.add(prod);
                    break;
                    
                case "inventario":
                    Inventario inv = new Inventario();
                    inv.setTiempo(Integer.parseInt(linea2[8]));
                    inv.setProducto(Integer.parseInt(linea2[10]));
                    inv.setCantidad(Integer.parseInt(linea2[14]));
                    inventarioLista.insertarFinal(inv);
                    break;
                    
                case "inicio":
                    Nodo n = productosLista.buscar(Integer.parseInt(linea2[10]));
                    if(n==null){
                        JOptionPane.showMessageDialog(this, "No se encontro producto con ese ID");
                    } else {
                        productosLista.getValor(Integer.parseInt(linea2[10]) - 1).setCantidad(Integer.parseInt(linea2[14]));
                    }
                    break;
            }
        }
        
        //Inicio de la simulacion
        PackProcesor ppr = new PackProcesor(productosLista,inventarioLista,personaLista,servidorLista);
        
        //Ingresar productos a la lista del inventario
        NodoInventario aux = inventarioLista.getPrimero();
        while(true){
            ppr.AgregarInv(aux);
            if(aux == inventarioLista.getUltimo()){
                break;
            }
            aux = aux.getSiguiente();
        }
        
        //Inicio del proceso de simulacion de compra
        //Se empieza a llenar la cola del servidor 1
        NodoPersona auxp = personaLista.getHead();
        while(true){
            ppr.generarPersonas1server(auxp);
            if(auxp == personaLista.getLast()){
                break;
            }
            auxp = auxp.getSiguiente();
        }
        
        //Se inicia el proceso de compra
        NodoServer auxs = servidorLista.getHead();
//        if(productosLista.getHead()==null){
            
//        }
        while(true){
            System.out.println("Recorri agregarle el thread a servidor numero "+auxs.getValor().getNoServer());
            if(auxs.getSiguiente()!=null){
                System.out.println("EL siguiente de ese servidor es "+auxs.getSiguiente().getValor().getNoServer());
            }
//            ppr.Procesar(auxs,auxs.getSiguiente());
            ppr.Procesar(auxs);

            if(auxs == servidorLista.getLast()){
                break;
            }
            auxs = auxs.getSiguiente();
        }
        
        
        
//      Se muesta la ventana de la simulacion donde se observa el movimiento de las "personas"
//        Simulador sim = new Simulador();
//        sim.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    //Salir - Cerrar  
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:      
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed
    
    private String abrirCSV(){
        String cadena="";
        fileCh = new JFileChooser();
        fileCh.showDialog(this, "Selecciona archivo");
        fichero = fileCh.getSelectedFile();
        cadena = fichero.getAbsolutePath();
        Path = cadena;
        return cadena;
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JFileChooser fileCh;
    public java.io.File fichero;
    public int contador=0;
    public String Path;
    public static ListaEnlazada productosLista = new ListaEnlazada();
    public static ListaEnlazadaServer servidorLista = new ListaEnlazadaServer();
    public static ListaEnlazadaPersona personaLista = new ListaEnlazadaPersona();
    public static ListaEnlazadaInventario inventarioLista = new ListaEnlazadaInventario();
            
}
