package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Denis Cechina
 */
public class H_W_GUI_II extends javax.swing.JFrame {

    public H_W_GUI_II() {
        initComponents();
        this.btnPlsMns.setText("\u00B1");
    }

    private void txtAreaWriting(char btnNr) {
        String prvTxtArea = txtArea.getText();
        switch (btnNr) {
            case '1':
                txtArea.setText(prvTxtArea + "1");
                break;
            case '2':
                txtArea.setText(prvTxtArea + "2");
                break;
            case '3':
                txtArea.setText(prvTxtArea + "3");
                break;
            case '4':
                txtArea.setText(prvTxtArea + "4");
                break;
            case '5':
                txtArea.setText(prvTxtArea + "5");
                break;
            case '6':
                txtArea.setText(prvTxtArea + "6");
                break;
            case '7':
                txtArea.setText(prvTxtArea + "7");
                break;
            case '8':
                txtArea.setText(prvTxtArea + "8");
                break;
            case '9':
                txtArea.setText(prvTxtArea + "9");
                break;
            case '0':
                if (!"".equals(txtArea.getText())) {
                    txtArea.setText(prvTxtArea + "0");
                }
                break;
            case '.':
                if (!dotPutted && "".equals(txtArea.getText())) {
                    txtArea.setText(prvTxtArea + "0.");
                    dotPutted = true;
                } else if (!dotPutted
                        && (prvTxtArea.endsWith("+\n")
                        || prvTxtArea.endsWith("-\n")
                        || prvTxtArea.endsWith("*\n")
                        || prvTxtArea.endsWith("/\n"))) {
                    txtArea.setText(prvTxtArea + "0.");
                    dotPutted = true;
                } else if (!dotPutted && !"".equals(txtArea.getText())) {
                    txtArea.setText(prvTxtArea + ".");
                    dotPutted = true;
                }
                break;
        }
    }

    private void mathOperations(char operation) {
        String prvTxtArea = txtArea.getText();
        //First time operation
        if (!stOperationWrite && !"".equals(prvTxtArea)
                && "".equals(txtField.getText())) {
            stOperationWrite = true;
            switch (operation) {
                case '+':
                    txtField.setText(String.valueOf(Double.parseDouble(prvTxtArea)));
                    txtArea.setText("+\n");
                    break;
                case '-':
                    txtField.setText(String.valueOf(Double.parseDouble(prvTxtArea)));
                    txtArea.setText("-\n");
                    break;
                case '*':
                    txtField.setText(String.valueOf(Double.parseDouble(prvTxtArea)));
                    txtArea.setText("*\n");
                    break;
                case '/':
                    txtField.setText(String.valueOf(Double.parseDouble(prvTxtArea)));
                    txtArea.setText("/\n");
                    break;
            }
            dotPutted = false;
        } //Changing the operation sign
        else if (stOperationWrite && !"".equals(prvTxtArea)
                && (prvTxtArea.endsWith("+\n")
                || prvTxtArea.endsWith("-\n")
                || prvTxtArea.endsWith("*\n")
                || prvTxtArea.endsWith("/\n"))) {
            switch (operation) {
                case '+':
                    txtArea.setText("+\n");
                    break;
                case '-':
                    txtArea.setText("-\n");
                    break;
                case '*':
                    txtArea.setText("*\n");
                    break;
                case '/':
                    txtArea.setText("/\n");
                    break;
            }
        } //Calculating Nr from the txtField and entered Nr, when entering the 
        //next sign
        else if (stOperationWrite && !prvTxtArea.endsWith("\n")) {
            switch (operation) {
                case '+':
                    if (operation == prvTxtArea.charAt(0)) {
                        txtField.setText(String.valueOf(Double
                                .parseDouble(txtField.getText()) + Double.
                                parseDouble(prvTxtArea.substring(2))));
                        txtArea.setText("+\n");
                        break;
                    } else if (operation != prvTxtArea.charAt(0)) {
                        mathOperations(prvTxtArea.charAt(0));
                        break;
                    }
                case '-':
                    if (operation == prvTxtArea.charAt(0)) {
                        txtField.setText(String.valueOf(Double.
                                parseDouble(txtField.getText()) - Double.
                                parseDouble(prvTxtArea.substring(2))));
                        txtArea.setText("-\n");
                        break;
                    } else if (operation != prvTxtArea.charAt(0)) {
                        mathOperations(prvTxtArea.charAt(0));
                        break;
                    }
                case '*':
                    if (operation == prvTxtArea.charAt(0)) {
                        txtField.setText(String.valueOf(Double.
                                parseDouble(txtField.getText()) * Double.
                                parseDouble(prvTxtArea.substring(2))));
                        txtArea.setText("*\n");
                        break;
                    } else if (operation != prvTxtArea.charAt(0)) {
                        mathOperations(prvTxtArea.charAt(0));
                        break;
                    }
                case '/':
                    if (operation == prvTxtArea.charAt(0)) {
                        txtField.setText(String.valueOf(Double.
                                parseDouble(txtField.getText()) / Double.
                                parseDouble(prvTxtArea.substring(2))));
                        txtArea.setText("/\n");
                        break;
                    } else if (operation != prvTxtArea.charAt(0)) {
                        mathOperations(prvTxtArea.charAt(0));
                        break;
                    }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnEql = new javax.swing.JButton();
        btnPls = new javax.swing.JButton();
        btnMns = new javax.swing.JButton();
        btnMlt = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnPlsMns = new javax.swing.JButton();
        btnPercentages = new javax.swing.JButton();
        btnDvs = new javax.swing.JButton();
        txtField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArea.setEditable(false);
        txtArea.setColumns(5);
        jScrollPane1.setViewportView(txtArea);

        btn1.setText("1");
        btn1.setName(""); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnEql.setText("=");
        btnEql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqlActionPerformed(evt);
            }
        });

        btnPls.setText("+");
        btnPls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlsActionPerformed(evt);
            }
        });

        btnMns.setText("-");
        btnMns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMnsActionPerformed(evt);
            }
        });

        btnMlt.setText("*");
        btnMlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMltActionPerformed(evt);
            }
        });

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnPlsMns.setText("+/-");
        btnPlsMns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlsMnsActionPerformed(evt);
            }
        });

        btnPercentages.setText("%");
        btnPercentages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentagesActionPerformed(evt);
            }
        });

        btnDvs.setText("/");
        btnDvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDvsActionPerformed(evt);
            }
        });

        txtField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMlt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnPls, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMns, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEql, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPlsMns, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPercentages, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDvs, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtField))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlsMns, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPercentages, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDvs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMlt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMns, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPls, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEql, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtAreaWriting('5');
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtArea.setText("");
        txtField.setText("");
        dotPutted = false;
        stOperationWrite = false;
    }//GEN-LAST:event_btnCActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtAreaWriting('1');
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtAreaWriting('2');
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtAreaWriting('3');
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtAreaWriting('4');
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtAreaWriting('6');
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtAreaWriting('7');
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtAreaWriting('8');
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtAreaWriting('9');
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtAreaWriting('0');
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlsActionPerformed
        mathOperations('+');
        if (!"".equals(txtField.getText())) {
            txtArea.setText("+\n");
        }
        dotPutted = false;
    }//GEN-LAST:event_btnPlsActionPerformed

    private void btnMnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMnsActionPerformed
        mathOperations('-');
        if (!"".equals(txtField.getText())) {
            txtArea.setText("-\n");
        }
        dotPutted = false;
    }//GEN-LAST:event_btnMnsActionPerformed

    private void btnMltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMltActionPerformed
        mathOperations('*');
        if (!"".equals(txtField.getText())) {
            txtArea.setText("*\n");
        }
        dotPutted = false;
    }//GEN-LAST:event_btnMltActionPerformed

    private void btnDvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDvsActionPerformed
        mathOperations('/');
        if (!"".equals(txtField.getText())) {
            txtArea.setText("/\n");
        }
        dotPutted = false;
    }//GEN-LAST:event_btnDvsActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        txtAreaWriting('.');
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnEqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqlActionPerformed
        if (!"".equals(txtArea.getText())) {
            mathOperations(txtArea.getText().charAt(0));
        }
//        txtArea.setText("");
        dotPutted = false;
    }//GEN-LAST:event_btnEqlActionPerformed

    private void btnPercentagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentagesActionPerformed
        if (!"".equals(txtField.getText()) && !"".equals(txtArea.getText())
                && (txtArea.getText().startsWith("+\n")
                || txtArea.getText().startsWith("-\n")
                || txtArea.getText().startsWith("*\n")
                || txtArea.getText().startsWith("/\n"))
                && !txtArea.getText().endsWith("\n")) {

            percentages = Double.parseDouble(txtField.getText()) * (Double.
                    parseDouble(txtArea.getText().substring(2)) / 100);

            txtArea.setText(String.valueOf(txtArea.getText().charAt(0)) + "\n"
                    + String.valueOf(percentages));

            mathOperations(txtArea.getText().charAt(0));

        }
    }//GEN-LAST:event_btnPercentagesActionPerformed

    private void btnPlsMnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlsMnsActionPerformed
        if (!"".equals(txtArea.getText())
                && (txtArea.getText().startsWith("+\n")
                || txtArea.getText().startsWith("-\n")
                || txtArea.getText().startsWith("*\n")
                || txtArea.getText().startsWith("/\n"))
                && !txtArea.getText().endsWith("\n")) {
            try {
                String prvTxtArea = txtArea.getText().substring(2);
                if(!prvTxtArea.startsWith("-")){
                    txtArea.setText(txtArea.getText(0, 1) + "\n-" + prvTxtArea);
                    System.out.println("first if " + prvTxtArea);
                }
                    
                else if (prvTxtArea.startsWith("-")){
                    prvTxtArea = txtArea.getText().substring(1);
                    txtArea.setText(txtArea.getText(0, 1) + "\n" + prvTxtArea.substring(2));
                    System.out.println("Second if " + prvTxtArea);
                }
                
                System.out.println(prvTxtArea);
            } catch (BadLocationException ex) {
                Logger.getLogger(H_W_GUI_II.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnPlsMnsActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(H_W_GUI_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new H_W_GUI_II().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnDvs;
    private javax.swing.JButton btnEql;
    private javax.swing.JButton btnMlt;
    private javax.swing.JButton btnMns;
    private javax.swing.JButton btnPercentages;
    private javax.swing.JButton btnPls;
    private javax.swing.JButton btnPlsMns;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtField;
    // End of variables declaration//GEN-END:variables
    private boolean dotPutted = false, stOperationWrite = false;
    private double percentages;
}
