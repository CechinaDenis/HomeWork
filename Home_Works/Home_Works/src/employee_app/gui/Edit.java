package employee_app.gui;

import employee_app.gui.employee_manager.Employee;
import employee_app.gui.employee_manager.Position;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Denis Cechina
 */
public class Edit extends javax.swing.JFrame {

    private final Employee emp;

    public Edit(Employee emp) {
        initComponents();
        txtFldName.setText(emp.getName());
        txtFldSurname.setText(emp.getSurname());
        formTxtFldBirthdate.setText(emp.getBirthDate());
        txtFldCountry.setText(emp.getCountry());
        txtFldCity.setText(emp.getCity());
        txtFldStreet.setText(emp.getStreet());
        txtFldZipCode.setText(emp.getZipCode());
        cmbBoxPossition.setSelectedItem(emp.getPosition().toString());
        this.emp = emp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFldSurname = new java.awt.TextField();
        lblZipCode = new javax.swing.JLabel();
        txtFldZipCode = new java.awt.TextField();
        formTxtFldBirthdate = new javax.swing.JFormattedTextField();
        lblPossition = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblBirthdate = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblCounrty = new javax.swing.JLabel();
        txtFldCountry = new java.awt.TextField();
        lblCity = new javax.swing.JLabel();
        txtFldCity = new java.awt.TextField();
        lblStreet = new javax.swing.JLabel();
        txtFldName = new java.awt.TextField();
        txtFldStreet = new java.awt.TextField();
        btnSave = new javax.swing.JButton();
        cmbBoxPossition = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit");
        setResizable(false);

        txtFldSurname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFldSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldSurnameActionPerformed(evt);
            }
        });

        lblZipCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblZipCode.setText("ZIP Code:");

        txtFldZipCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFldZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldZipCodeActionPerformed(evt);
            }
        });

        formTxtFldBirthdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        formTxtFldBirthdate.setToolTipText("YYYY-MM-DD");
        formTxtFldBirthdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblPossition.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPossition.setText("Possition:");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setText("Name:");

        lblBirthdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBirthdate.setText("Birth Date:");

        lblSurname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSurname.setText("Surname:");

        lblCounrty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCounrty.setText("Country:");

        txtFldCountry.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFldCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldCountryActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCity.setText("City:");

        txtFldCity.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldCityActionPerformed(evt);
            }
        });

        lblStreet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblStreet.setText("Street:");

        txtFldName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldNameActionPerformed(evt);
            }
        });

        txtFldStreet.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFldStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldStreetActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        cmbBoxPossition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book Keeper", "HR Manager", "Manager", "Programmer", "Salesman", "Technician" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCounrty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSurname)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFldSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFldName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblBirthdate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(formTxtFldBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPossition)
                                    .addComponent(lblZipCode))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFldZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbBoxPossition, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStreet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtFldSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(lblSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblBirthdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(formTxtFldBirthdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtFldCountry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCounrty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFldCity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZipCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldZipCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPossition, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBoxPossition, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFldSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldSurnameActionPerformed

    }//GEN-LAST:event_txtFldSurnameActionPerformed

    private void txtFldZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldZipCodeActionPerformed

    }//GEN-LAST:event_txtFldZipCodeActionPerformed

    private void txtFldCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldCountryActionPerformed

    }//GEN-LAST:event_txtFldCountryActionPerformed

    private void txtFldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldCityActionPerformed

    }//GEN-LAST:event_txtFldCityActionPerformed

    private void txtFldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldNameActionPerformed

    }//GEN-LAST:event_txtFldNameActionPerformed

    private void txtFldStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldStreetActionPerformed

    }//GEN-LAST:event_txtFldStreetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String position = cmbBoxPossition.getSelectedItem().toString();
        Position pos = Position.getByPositionName(position);
        try {
            int affectedRows = Main.editEmployee(this.emp.getId(), txtFldName.getText(),
                    txtFldSurname.getText(), formTxtFldBirthdate.getText(),
                    txtFldCountry.getText(), txtFldCity.getText(),
                    txtFldStreet.getText(), txtFldZipCode.getText(), pos,
                    this.emp.getRefRow());
            if (affectedRows == 1) {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Employee Successfully Edited");
            } else if (affectedRows == -3) {
                JOptionPane.showMessageDialog(null, "Please ENTER Employee ( * ) Fields!!!");
            } else if (affectedRows == 0) {
                JOptionPane.showMessageDialog(null, "Employee already exists in the Database");
            } else if (affectedRows == -2) {
                JOptionPane.showMessageDialog(null, "ERROR Main.addEmployeeToList");
            } else if (affectedRows == -1) {
                JOptionPane.showMessageDialog(null, "ERROR EmployeeDao.add");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Exception");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Edit(null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbBoxPossition;
    private javax.swing.JFormattedTextField formTxtFldBirthdate;
    private javax.swing.JLabel lblBirthdate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCounrty;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPossition;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblZipCode;
    private java.awt.TextField txtFldCity;
    private java.awt.TextField txtFldCountry;
    private java.awt.TextField txtFldName;
    private java.awt.TextField txtFldStreet;
    private java.awt.TextField txtFldSurname;
    private java.awt.TextField txtFldZipCode;
    // End of variables declaration//GEN-END:variables
}
