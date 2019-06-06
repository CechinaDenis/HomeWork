package employee_app.gui;

import java.io.IOException;
import java.sql.SQLException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

/**
 * @author Denis Cechina
 */
public class Export extends javax.swing.JFrame {

    public Export() {
        initComponents();
    }

    private void serialization(String extension)
            throws SQLException, IOException, ParserConfigurationException,
            TransformerException {

        String filePath = Main.fileSave();
        if (filePath.endsWith(extension)) {
            Main.serialization(filePath);
        } else if (!filePath.endsWith(extension)) {
            Main.serialization(filePath.concat(extension));
        } else {
            System.err.println("ERROR TRYING TO SAVE THE FILE");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExpCsv = new javax.swing.JButton();
        btnExpXml = new javax.swing.JButton();
        btnExpJson = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Export");
        setResizable(false);

        btnExpCsv.setText("Export .CSV");
        btnExpCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpCsvActionPerformed(evt);
            }
        });

        btnExpXml.setText("Export .XML");
        btnExpXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpXmlActionPerformed(evt);
            }
        });

        btnExpJson.setText("Export .JSON");

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
                        .addComponent(btnExpXml, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExpJson, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnExpCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExpCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExpXml, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExpJson, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExpCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpCsvActionPerformed

        try {
            serialization(".csv");
        } catch (NullPointerException | ParserConfigurationException | TransformerException
                | SQLException | IOException ex) {
            System.err.println("ParserConfigurationException "
                    + "| TransformerException |SQLException | IOException ex");
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnExpCsvActionPerformed

    private void btnExpXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpXmlActionPerformed

        try {
            serialization(".xml");
        } catch (ParserConfigurationException | TransformerException
                | SQLException | IOException ex) {
            System.err.println("ParserConfigurationException "
                    + "| TransformerException | SQLException | IOException ex");
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnExpXmlActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Export().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExpCsv;
    private javax.swing.JButton btnExpJson;
    private javax.swing.JButton btnExpXml;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
