package employee_app.gui;

import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
 * @author Denis Cechina
 */
public class Import extends javax.swing.JFrame {

    public Import() {
        initComponents();
    }

    private void deserialization(String extension)
            throws SQLException, IOException, ParserConfigurationException,
            TransformerException, NullPointerException, SAXException {

        String filePath = Main.fileOpen(extension);
        if (filePath.endsWith(extension)) {
            Main.deserialization(filePath);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR TRYING TO OPEN THE FILE");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImpCsv = new javax.swing.JButton();
        btnImpXml = new javax.swing.JButton();
        btnImpJson = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Import");
        setResizable(false);

        btnImpCsv.setText("Import .CSV");
        btnImpCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpCsvActionPerformed(evt);
            }
        });

        btnImpXml.setText("Import .XML");
        btnImpXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpXmlActionPerformed(evt);
            }
        });

        btnImpJson.setText("Import .JSON");
        btnImpJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpJsonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnImpXml, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImpJson, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnImpCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImpCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImpXml, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImpJson, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImpCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpCsvActionPerformed

        try {
            deserialization("csv");
        } catch (SQLException ex) {
            System.out.println("SQLException");
        } catch (IOException ex) {
            System.out.println("IOException");
        } catch (ParserConfigurationException ex) {
            System.out.println("ParserConfigurationException");
        } catch (TransformerException ex) {
            System.out.println("TransformerException");
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException");
        } catch (SAXException ex) {
            System.out.println("SAXException");
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnImpCsvActionPerformed

    private void btnImpXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpXmlActionPerformed

        try {
            deserialization("xml");
        } catch (SQLException ex) {
            System.out.println("SQLException");
        } catch (IOException ex) {
            System.out.println("IOException");
        } catch (ParserConfigurationException ex) {
            System.out.println("ParserConfigurationException");
        } catch (TransformerException ex) {
            System.out.println("TransformerException");
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException");
        } catch (SAXException ex) {
            System.out.println("SAXException");
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnImpXmlActionPerformed

    private void btnImpJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpJsonActionPerformed

        try {
            deserialization("json");
        } catch (SQLException ex) {
            System.out.println("SQLException");
        } catch (IOException ex) {
            System.out.println("IOException");
        } catch (ParserConfigurationException ex) {
            System.out.println("ParserConfigurationException");
        } catch (TransformerException ex) {
            System.out.println("TransformerException");
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException");
        } catch (SAXException ex) {
            System.out.println("SAXException");
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnImpJsonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Import().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImpCsv;
    private javax.swing.JButton btnImpJson;
    private javax.swing.JButton btnImpXml;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
