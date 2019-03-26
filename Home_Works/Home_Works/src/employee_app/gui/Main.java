package employee_app.gui;

import employee_app.gui.employee_manager.Employee;
import employee_app.gui.service.EmployeeService;
import javax.swing.table.DefaultTableModel;

/**
 * @author Denis Cechina
 */
public class Main extends javax.swing.JFrame {

    private final int ID = 0;

    public static void addEmployee(Employee emp) {
        if (emp.isValid()) {
            addEmployeeToList(emp);
        } else {
            System.out.println("error");
        }
    }

    public Main() {
        initComponents();
    }

    private static void addEmployeeToList(Employee emp) {
        DefaultTableModel employeeListModel = (DefaultTableModel) 
                Main.tblMain.getModel();
        int employeeId = employeeListModel.getRowCount() + 1;
        employeeListModel.addRow(new Object[]{employeeId, emp.getName(),
            emp.getSurname(), emp.getBirthDate(), emp.getCity(),
            emp.getCountry(), emp.getStreet(), emp.getZipCode(),
            emp.getPosition()});
        emp.setId(employeeId);
    }

    public static void editEmployee(Integer idEmployee, String newName,
            String newSurename, String newBirthDate, String newCountry,
            String newCity, String newStreet, String newZipCode, 
            String newPosition) {
        DefaultTableModel employeeListModel = (DefaultTableModel) 
                Main.tblMain.getModel();
        employeeListModel.setValueAt(newName, idEmployee - 1, 1);
        employeeListModel.setValueAt(newSurename, idEmployee - 1, 2);
        employeeListModel.setValueAt(newBirthDate, idEmployee - 1, 3);
        employeeListModel.setValueAt(newCountry, idEmployee - 1, 4);
        employeeListModel.setValueAt(newCity, idEmployee - 1, 5);
        employeeListModel.setValueAt(newStreet, idEmployee - 1, 6);
        employeeListModel.setValueAt(newZipCode, idEmployee - 1, 7);
        employeeListModel.setValueAt(newPosition, idEmployee - 1, 8);
        EmployeeService.editEmployee(idEmployee, newName, newSurename,
                newBirthDate, newCountry, newCity, newStreet, newZipCode,
                newPosition);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMain = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnEdite = new javax.swing.JButton();
        btnSerch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main");

        tblMain.setAutoCreateRowSorter(true);
        tblMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surename", "Birthdate", "Country", "City", "Street", "ZIP Code", "Position"
            }
        ));
        jScrollPane1.setViewportView(tblMain);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdite.setText("Edite");
        btnEdite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditeActionPerformed(evt);
            }
        });

        btnSerch.setText("Serch");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnImport.setText("Import");

        btnExport.setText("Export");

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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdite, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSerch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdite, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSerch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditeActionPerformed

        int selectedRow = Main.tblMain.getSelectedRow();

        DefaultTableModel employeeListModel = (DefaultTableModel) 
                Main.tblMain.getModel();
        if (selectedRow != -1) {
            Object value = employeeListModel.getValueAt(selectedRow, ID);
            Integer employeeId = Integer.parseInt(value.toString());
            Employee foundEmployee = EmployeeService.getById(employeeId);
            Edit edit = new Edit(foundEmployee);

            edit.setVisible(true);
        }
    }//GEN-LAST:event_btnEditeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Add add = new Add();
        add.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        System.out.println(EmployeeService.getEmpoyeeList());
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int selectedRow = Main.tblMain.getSelectedRow();
        DefaultTableModel employeeListModel = (DefaultTableModel) 
                Main.tblMain.getModel();

        if (selectedRow != -1) {
            Object value = employeeListModel.getValueAt(selectedRow, ID);
            Integer employeeId = Integer.parseInt(value.toString());
            EmployeeService.deleteEmployee(employeeId);
            employeeListModel.removeRow(selectedRow);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdite;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnSerch;
    private javax.swing.JButton btnShow;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblMain;
    // End of variables declaration//GEN-END:variables
}
