/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_jonrryenamorado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wende
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        JOptionPane.showMessageDialog(this, "Bienvenido! Como funciona el programa:\nSelecciona un archivo de texto para que el programa lea\n"
                + "1)Archivos de Texto grandes le tomara mas de un par de minutos en analizar\n"
                + "2)Toma todas las palabras del texto y las cuenta\n"
                + "3)Toma las combinaciones de dos palabras en una linea y las cuenta\n"
                + "4)Toma las combinaciones de tres palabras en una linea y las cuenta\n"
                + "5)Toma las 10 palabras mas repetidas para sacar el top ten\n"
                + "Todo esto lo muestra en tablas para ver los resultados."
                + "Tip: Usar Archivos de Texto de tamaño moderado para mejor funcionamiento");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta_una = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_dos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_tres = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_ten = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PALABRAS");

        jButton1.setText("SELECCIONAR ARCHIVO");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel2.setText("Una Palabra");

        jLabel3.setText("Dos Palabras");

        jLabel4.setText("Tres Palabras");

        jLabel5.setText("Top Ten");

        ta_una.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Word", "Count"
            }
        ));
        jScrollPane5.setViewportView(ta_una);

        ta_dos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Words", "Count"
            }
        ));
        jScrollPane6.setViewportView(ta_dos);

        ta_tres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Words", "Count"
            }
        ));
        jScrollPane1.setViewportView(ta_tres);

        ta_ten.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Word", "Count"
            }
        ));
        jScrollPane2.setViewportView(ta_ten);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jButton1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        File Archivo = null;
        FileReader FR = null;
        BufferedReader BR = null;
        Object[] v = {"Word", "Count"};
        Object[] v2 = {"Words", "Count"};

        one = new ArrayList();
        two = new ArrayList();
        three = new ArrayList();
        ta_una.setModel(new DefaultTableModel(v, 0));
        ta_dos.setModel(new DefaultTableModel(v2, 0));
        ta_tres.setModel(new DefaultTableModel(v2, 0));
        ta_ten.setModel(new DefaultTableModel(v, 0));

        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
            jfc.setFileFilter(filtro);
            File file = new File("");
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                file = jfc.getSelectedFile();
            }
            Archivo = new File(jfc.getSelectedFile().getAbsolutePath());
            System.out.println(jfc.getSelectedFile().getAbsolutePath());
            FR = new FileReader(Archivo);
            BR = new BufferedReader(FR);
            String line = "";

            while ((line = BR.readLine()) != null) {

                line = line.replace(" the ", " ");
                line = line.replace(" The ", " ");
                line = line.replace("for ", " ");
                line = line.replace(" in ", " ");
                line = line.replace(" or ", " ");
                line = line.replace(" it ", " ");
                line = line.replace(" it", " ");
                line = line.replace(" with ", " ");

                line = line.replace(" to ", " ");
                line = line.replace(" To ", " ");
                line = line.replace(":", "");
                line = line.replace(";", "");
                line = line.replace(",", "");
                line = line.replace("#", "");
                line = line.replace("$", "");
                line = line.replace("(", "");
                line = line.replace(")", "");
                line = line.replace("-", "");
                line = line.replace("_", "");
                line = line.replace("/", "");
                line = line.replace("'", "");
                line = line.replace("`", "");
                line = line.replace("<", "");
                line = line.replace(">", "");
                line = line.replace(".", "");
                line = line.replace("+", "");
                line = line.replace(" in ", " ");
                line = line.replace(" In ", " ");
                line = line.replace(" for ", " ");
                line = line.replace(" For ", " ");
                line = line.replace(" at ", " ");
                line = line.replace(" At ", " ");
                line = line.replace(" a ", " ");
                line = line.replace(" A ", " ");
                line = line.replace("*", "");
                line = line.replace("?", "");
                line = line.replace("\"", "");
                line = line.replace("\\", "");
                line = line.replaceAll("\\d+", "");
                line = line.replaceAll(" [a-z] ", " ");
                line = line.replaceAll(" [A-Z] ", " ");
                line = line.replaceAll(" and ", " ");
                line = line.replaceAll(" is ", " ");
                line = line.replaceAll(" Is ", " ");
                ArrayList<word> arraydos = new ArrayList();
                Scanner sc = new Scanner(line);
                sc.useDelimiter(" ");
                while (sc.hasNext()) {
                    word nueva = new word(sc.next(), 0);
                    one.add(nueva);
                    arraydos.add(nueva);
                    
                }
                
                for (int i = 0; i < arraydos.size(); i++) {
                    for (int j = 0; j < arraydos.size(); j++) {
                        if(i==j){
                            
                        }else{
                            String word = arraydos.get(i).getWord() + " " + arraydos.get(j).getWord();
                            two.add(new word(word,1));
                        }
                    }
                }
                
                for (int i = 0; i < two.size(); i++) {
                    for (int j = 0; j < two.size(); j++) {
                        if(i==j){
                            
                        }else{
                            String temp = two.get(i).getWord();
                            Scanner sc2 = new Scanner(temp);
                            while(sc2.hasNext()){
                                String word1 = sc2.next();
                                String word2 = sc2.next();
                                temp = word2 + " " + word1;
                            }
                            if(two.get(j).getWord().equals(two.get(i).getWord()) || two.get(j).equals(temp)){
                                two.get(i).setCount(two.get(i).getCount()+1);
                                two.remove(j);
                                j--;
                            }
                        }
                    }
                }
                

            }

        } catch (Exception e) {

        }

        try {
            BR.close();
            FR.close();
        } catch (Exception e) {

        }
        ArrayList<word> contuno = one;
        contuno = contar(contuno, contuno);
        
        text((contuno), (DefaultTableModel) ta_una.getModel());
        
        text((two), (DefaultTableModel) ta_dos.getModel());
        text((three), (DefaultTableModel) ta_tres.getModel());
        topten();
        text((one), (DefaultTableModel) ta_ten.getModel());
        System.out.println(two);
    }//GEN-LAST:event_jButton1MouseClicked

    public void doswords(){
        
    }
    
    
    public void topten() {

        for (int i = 0; i < one.size(); i++) {
            for (int j = 0; j < one.size(); j++) {
                if (i == j) {

                } else if (one.get(i).getCount() > one.get(j).getCount()) {
                    word temp = one.get(i);
                    one.set(i, one.get(j));
                    one.set(j, temp);
                    j = 0;
                }
            }
        }
        ArrayList<word> nueva = new ArrayList();
        for (int i = 0; i < 10 && i < one.size(); i++) {

            nueva.add(one.get(i));

        }
        one = nueva;
    }

    

    public ArrayList<word> contar(ArrayList<word> n, ArrayList<word> m) {
        for (int i = 0; i < n.size(); i++) {

            for (int j = 0; j < n.size(); j++) {

                if (n.get(i).getWord().equals(n.get(j).getWord())) {
                    n.get(i).setCount(n.get(i).getCount() + 1);

                    boolean del = false;
                    if (n.get(i).getCount() > 1) {
                        del = true;
                    }
                    n.get(i).setCount(n.get(i).getCount() + 1);
                    if (del) {
                        n.remove(j);
                        j--;
                    }

                }

            }
        }
        for (int i = 0; i < n.size(); i++) {
            n.get(i).setCount(n.get(i).getCount() / 2);
        }
        return n;
    }

    public void text(ArrayList<word> n, DefaultTableModel x) {

        for (word t : n) {
            if (t.getCount() == 0) {
                t.setCount(1);
            }
            Object[] row = {t.getWord(), t.getCount()};
            x.addRow(row);
        }

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable ta_dos;
    private javax.swing.JTable ta_ten;
    private javax.swing.JTable ta_tres;
    private javax.swing.JTable ta_una;
    // End of variables declaration//GEN-END:variables
    ArrayList<word> one = new ArrayList();
    ArrayList<word> two = new ArrayList();
    ArrayList<word> three = new ArrayList();

}
