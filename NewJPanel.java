/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.regex.*;
/**
 *
 * @author Xiaomi
 */
public class NewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public NewJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        jButton2.setText("??????????????");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel1.setText("...");

        jLabel2.setText("???????????????? ????????");

        jLabel3.setText("?????????????????????????? ????????");

        jLabel4.setText("...");

        jButton1.setText("??????????????????????");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextField1.setText("1");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel5.setText("????????");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(634, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("??????????????????????", jPanel3);

        jButton4.setText("??????????????");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel6.setText("???????????????? ????????");

        jLabel7.setText("???????????????????????????? ????????");

        jLabel8.setText("????????");

        jButton5.setText("????????????????????????");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jTextField2.setText("1");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel9.setText("...");

        jLabel10.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))))
                .addContainerGap(633, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("????????????????????????", jPanel1);

        jButton6.setText("??????????????");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jLabel11.setText("???????????????? ????????");

        jLabel12.setText("???????????????????????????? ????????");

        jButton7.setText("????????????????????????");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jLabel14.setText("...");

        jLabel15.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(jButton6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))))
                .addContainerGap(701, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Bruteforce", jPanel2);

        jButton8.setText("??????????????");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jLabel13.setText("???????????????? ????????");

        jLabel16.setText("???????????????????????????? ????????");

        jButton9.setText("????????????????????????");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jLabel17.setText("...");

        jLabel18.setText("...");

        jLabel19.setText("???????? ?????? ???????????????????????? ??????????????");

        jLabel20.setText("...");

        jButton10.setText("??????????????");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel16))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(jLabel18)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(43, 43, 43)
                            .addComponent(jLabel20))))
                .addContainerGap(650, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)))
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("?????????????????? ????????????", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int selection = fileChooser.showOpenDialog(this);
            File selectedFile = fileChooser.getSelectedFile();
            String ttInputFile = selectedFile.getCanonicalPath();
            this.jLabel1.setText(ttInputFile);
            this.jLabel4.setText(ttInputFile.substring(0, ttInputFile.lastIndexOf(".")) + "_encrypt.txt");
        } catch (IOException ex) {
            Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked
    
    private void msgStop(String xMessage) {
        JOptionPane.showMessageDialog(
                null,
                xMessage,
                "????????????????!",
                JOptionPane.ERROR_MESSAGE);
    }
    
    private void msgInfo(String xMessage) {
        JOptionPane.showMessageDialog(
                null,
                xMessage,
                "????????????????!",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {                                      
            StringBuilder ttStrKey = new StringBuilder(this.jTextField1.getText());
            Integer ttIntKey = 0;
            try {
                ttIntKey = Integer.valueOf(ttStrKey.toString());
            } catch (Exception e) {
                msgStop("???????? ?????????? ???????? ???????????? ???????????? ?????????? ????????????");
                return;
            }
            StringBuilder ttStrInputFile = new StringBuilder(this.jLabel1.getText());
            if (ttStrInputFile.toString().equals("") || ttStrInputFile.toString().equals("...")) {
                msgStop("???? ???????????? ???????? ?? ?????????????????? ??????????");
                return;
            }
            StringBuilder ttStrOutputFile = new StringBuilder(this.jLabel4.getText());
            if (ttStrInputFile.toString().equals("") || ttStrInputFile.toString().equals("...")) {
                msgStop("???? ???????????? ???????? ?? ???????????????????????????? ??????????");
                return;
            }
            
            File ttInputFile = new File(ttStrInputFile.toString());
            try (Scanner ttInput = new Scanner(ttInputFile)) {
                CaesarWorker encrypt = new CaesarWorker(ttIntKey);
                try (PrintWriter out = new PrintWriter(ttStrOutputFile.toString())) {
                    while (ttInput.hasNextLine()) {
                        out.println(encrypt.encryptByAlphabet(ttInput.nextLine()));
                    }
                }
            }
            msgInfo("???????????? ??????????????????");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int selection = fileChooser.showOpenDialog(this);
            File selectedFile = fileChooser.getSelectedFile();
            String ttInputFile = selectedFile.getCanonicalPath();
            this.jLabel10.setText(ttInputFile);
            this.jLabel9.setText(ttInputFile.substring(0, ttInputFile.lastIndexOf(".")) + "_decrypt.txt");
        } catch (IOException ex) {
            Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try {                                      
            StringBuilder ttStrKey = new StringBuilder(this.jTextField2.getText());
            Integer ttIntKey = 0;
            try {
                ttIntKey = Integer.valueOf(ttStrKey.toString());
            } catch (Exception e) {
                msgStop("???????? ?????????? ???????? ???????????? ???????????? ?????????? ????????????");
                return;
            }
            StringBuilder ttStrInputFile = new StringBuilder(this.jLabel10.getText());
            if (ttStrInputFile.toString().equals("") || ttStrInputFile.toString().equals("...")) {
                msgStop("???? ???????????? ???????? ?? ?????????????????? ??????????");
                return;
            }
            StringBuilder ttStrOutputFile = new StringBuilder(this.jLabel9.getText());
            if (ttStrInputFile.toString().equals("") || ttStrInputFile.toString().equals("...")) {
                msgStop("???? ???????????? ???????? ?? ?????????????????????????????? ??????????");
                return;
            }
            
            File ttInputFile = new File(ttStrInputFile.toString());
            try (Scanner ttInput = new Scanner(ttInputFile)) {
                CaesarWorker encrypt = new CaesarWorker(ttIntKey);
                try (PrintWriter out = new PrintWriter(ttStrOutputFile.toString())) {
                    while (ttInput.hasNextLine()) {
                        out.println(encrypt.decryptByAlphabet(ttInput.nextLine()));
                    }
                }
            }
            msgInfo("???????????? ??????????????????");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int selection = fileChooser.showOpenDialog(this);
            File selectedFile = fileChooser.getSelectedFile();
            String ttInputFile = selectedFile.getCanonicalPath();
            this.jLabel14.setText(ttInputFile);
            this.jLabel15.setText(ttInputFile.substring(0, ttInputFile.lastIndexOf(".")) + "_decrypt.txt");
        } catch (IOException ex) {
            Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        try {
            StringBuilder ttStrInputFile = new StringBuilder(this.jLabel14.getText());
            if (ttStrInputFile.toString().equals("") || ttStrInputFile.toString().equals("...")) {
                msgStop("???? ???????????? ???????? ?? ?????????????????? ??????????");
                return;
            }
            StringBuilder ttStrOutputFile = new StringBuilder(this.jLabel15.getText());
            if (ttStrInputFile.toString().equals("") || ttStrInputFile.toString().equals("...")) {
                msgStop("???? ???????????? ???????? ?? ?????????????????????????????? ??????????");
                return;
            }
            
            File ttInputFile = new File(ttStrInputFile.toString());
            StringBuilder someText = new StringBuilder();
            boolean isStart = true;
            try (Scanner ttInput = new Scanner(ttInputFile)) {
                while (ttInput.hasNextLine()) {
                    if (isStart) {
                        someText.append(ttInput.nextLine());
                        isStart = false;
                    } else {
                        someText.append('\n' + ttInput.nextLine());
                    }
                }
            }
            
            CaesarWorker worker = new CaesarWorker();
            int alphabetLength = worker.alphabet.length();
            Pattern pattern = Pattern.compile("\\.[ ][??-??]");
            boolean isSuccess = false;
            for (int i = 0; i < alphabetLength; i++) {
                String ttRes = worker.decryptByAlphabet(someText.toString(), i);
                if (pattern.matcher(ttRes).find()) {
                    try(PrintWriter out = new PrintWriter(ttStrOutputFile.toString())) {
                            out.print(ttRes);
                            System.out.print(ttRes);
                    }
                    isSuccess = true;
                    break;
                }
            }
            if (isSuccess) {
                msgInfo("???????????? ??????????????????.\n???????? ??????????????????????.");
            } else {
                msgInfo("???????????? ??????????????????.\n???????? ???? ??????????????????????.");
            }
        } catch (IOException ex) {
            Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int selection = fileChooser.showOpenDialog(this);
            File selectedFile = fileChooser.getSelectedFile();
            String ttInputFile = selectedFile.getCanonicalPath();
            this.jLabel20.setText(ttInputFile);
        } catch (IOException ex) {
            Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        try {
            StringBuilder ttStrAlphabetFile = new StringBuilder(this.jLabel20.getText());
            if (ttStrAlphabetFile.toString().equals("") || ttStrAlphabetFile.toString().equals("...")) {
                msgStop("???? ???????????? ???????? ?? ?????????? ?????? ???????????????????????? ??????????????");
                return;
            }
            StringBuilder ttStrInputFile = new StringBuilder(this.jLabel18.getText());
            if (ttStrInputFile.toString().equals("") || ttStrInputFile.toString().equals("...")) {
                msgStop("???? ???????????? ???????? ?? ?????????????????? ??????????");
                return;
            }
            StringBuilder ttStrOutputFile = new StringBuilder(this.jLabel17.getText());
            if (ttStrInputFile.toString().equals("") || ttStrInputFile.toString().equals("...")) {
                msgStop("???? ???????????? ???????? ?? ?????????????????????????????? ??????????");
                return;
            }
            
            StringBuilder alphabetText = getTextFromFile(ttStrAlphabetFile.toString());
            StringBuilder inputText = getTextFromFile(ttStrInputFile.toString());
            CaesarWorker worker = new CaesarWorker();
            try (PrintWriter out = new PrintWriter(ttStrOutputFile.toString())) {
                out.print(worker.decryptByCharFrequecy(alphabetText, inputText));
            }
            msgInfo("???????????? ??????????????????.");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int selection = fileChooser.showOpenDialog(this);
            File selectedFile = fileChooser.getSelectedFile();
            String ttInputFile = selectedFile.getCanonicalPath();
            this.jLabel18.setText(ttInputFile);
            this.jLabel17.setText(ttInputFile.substring(0, ttInputFile.lastIndexOf(".")) + "_decrypt.txt");
        } catch (IOException ex) {
            Logger.getLogger(NewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10MouseClicked

    private StringBuilder getTextFromFile(String xFileName) throws FileNotFoundException {
        File ttInputFile = new File(xFileName);
        StringBuilder someText = new StringBuilder();
        try (Scanner ttInput = new Scanner(ttInputFile)) {
            while (ttInput.hasNextLine()) {
                someText.append(ttInput.nextLine() +"\n" );
            }
        }
        return someText;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
