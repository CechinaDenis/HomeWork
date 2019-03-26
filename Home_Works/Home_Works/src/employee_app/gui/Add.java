package employee_app.gui;

import employee_app.gui.employee_manager.Employee;
import employee_app.gui.employee_manager.Position;
import employee_app.gui.service.EmployeeService;

/**
 * @author Admin
 */
public class Add extends javax.swing.JFrame {

    public Add() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFldName = new java.awt.TextField();
        txtFldSurename = new java.awt.TextField();
        lblName = new javax.swing.JLabel();
        lblBirthdate = new javax.swing.JLabel();
        lblSurename = new javax.swing.JLabel();
        lblCounrty = new javax.swing.JLabel();
        txtFldCountry = new java.awt.TextField();
        lblCity = new javax.swing.JLabel();
        txtFldCity = new java.awt.TextField();
        lblStreet = new javax.swing.JLabel();
        txtFldStreet = new java.awt.TextField();
        lblZipCode = new javax.swing.JLabel();
        txtFldZipCode = new java.awt.TextField();
        lblPossition = new javax.swing.JLabel();
        cmbBoxPossition = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        formTxtFldBirthdate = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add");

        txtFldName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldNameActionPerformed(evt);
            }
        });

        txtFldSurename.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFldSurename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldSurenameActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setText("Name:");

        lblBirthdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBirthdate.setText("Birth Date:");

        lblSurename.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSurename.setText("Surename:");

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

        txtFldStreet.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFldStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldStreetActionPerformed(evt);
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

        lblPossition.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPossition.setText("Possition:");

        cmbBoxPossition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book Keeper", "HR Manager", "Manager", "Programmer", "Salesman", "Technician" }));

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        formTxtFldBirthdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        formTxtFldBirthdate.setToolTipText("YYYY-MM-DD");
        formTxtFldBirthdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFldName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSurename)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFldSurename, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBirthdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formTxtFldBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCounrty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFldCity, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStreet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblZipCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFldZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPossition)
                        .addGap(10, 10, 10)
                        .addComponent(cmbBoxPossition, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFldSurename, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(lblSurename, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBirthdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(formTxtFldBirthdate, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txtFldName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCounrty, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFldCountry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(txtFldCity, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFldStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblZipCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtFldZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbBoxPossition)
                    .addComponent(lblPossition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblName.getAccessibleContext().setAccessibleName("");
        lblBirthdate.getAccessibleContext().setAccessibleName("");
        lblSurename.getAccessibleContext().setAccessibleName("");
        lblCounrty.getAccessibleContext().setAccessibleName("");
        lblStreet.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldNameActionPerformed

    }//GEN-LAST:event_txtFldNameActionPerformed

    private void txtFldSurenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldSurenameActionPerformed

    }//GEN-LAST:event_txtFldSurenameActionPerformed

    private void txtFldCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldCountryActionPerformed

    }//GEN-LAST:event_txtFldCountryActionPerformed

    private void txtFldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldCityActionPerformed

    }//GEN-LAST:event_txtFldCityActionPerformed

    private void txtFldStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldStreetActionPerformed

    }//GEN-LAST:event_txtFldStreetActionPerformed

    private void txtFldZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldZipCodeActionPerformed

    }//GEN-LAST:event_txtFldZipCodeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String position = cmbBoxPossition.getSelectedItem().toString();
        Employee emp = new Employee(txtFldName.getText(), txtFldSurename.getText(),
                formTxtFldBirthdate.getText(), txtFldCountry.getText(),
                txtFldCity.getText(), txtFldStreet.getText(), txtFldZipCode.getText());
        EmployeeService.getEmpoyeeList().add(emp);
        emp.setPosition(Position.getByPositionName(position));
        Main.addEmployee(emp);
        txtFldName.setText("");
        txtFldSurename.setText("");
        txtFldCountry.setText("");
        txtFldCity.setText("");
        txtFldStreet.setText("");
        txtFldZipCode.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_btnAddActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Add().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cmbBoxPossition;
    private javax.swing.JFormattedTextField formTxtFldBirthdate;
    private javax.swing.JLabel lblBirthdate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCounrty;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPossition;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblSurename;
    private javax.swing.JLabel lblZipCode;
    private java.awt.TextField txtFldCity;
    private java.awt.TextField txtFldCountry;
    private java.awt.TextField txtFldName;
    private java.awt.TextField txtFldStreet;
    private java.awt.TextField txtFldSurename;
    private java.awt.TextField txtFldZipCode;
    // End of variables declaration//GEN-END:variables
}
