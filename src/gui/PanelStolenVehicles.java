package gui;

import javax.swing.table.DefaultTableModel;
import logic.TopsController;
import logic.VehicleController;

public class PanelStolenVehicles extends javax.swing.JPanel {
    
    DefaultTableModel modelTable;
    
    /**
     * Creates new form PanelStolenVehicles
     */
    public PanelStolenVehicles() {
        initComponents();
        modelTable = (DefaultTableModel) tableData.getModel();
        
        fillCombobox();
        cleanForm();
        cleanTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        lblLicensePlate = new javax.swing.JLabel();
        txtLicensePlate = new javax.swing.JTextField();
        lblReference = new javax.swing.JLabel();
        txtReference = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        cbxColor = new javax.swing.JComboBox<>();
        cbxNeighborhood = new javax.swing.JComboBox<>();
        lblNeighborhood = new javax.swing.JLabel();
        btnNewReport = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(780, 600));
        setMinimumSize(new java.awt.Dimension(780, 600));

        lblTitle.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Reporte de vehiculos");

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Placa", "Referencia", "Color", "Localidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableData);

        lblLicensePlate.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblLicensePlate.setText("Placa:");

        lblReference.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblReference.setText("Referencia:");

        lblColor.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblColor.setText("Color:");

        cbxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxNeighborhood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblNeighborhood.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblNeighborhood.setText("Localidad:");

        btnNewReport.setText("Nuevo");

        btnUpdate.setText("Modificar");

        btnSearch.setText("Buscar");

        btnDelete.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblReference)
                                .addComponent(lblLicensePlate))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtReference, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(txtLicensePlate))
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNeighborhood)
                                .addComponent(lblColor))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxNeighborhood, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLicensePlate)
                            .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReference)
                            .addComponent(txtReference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxNeighborhood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblColor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNeighborhood)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewReport)
                    .addComponent(btnUpdate)
                    .addComponent(btnSearch)
                    .addComponent(btnDelete))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cleanTable() {
        for (int i = 0; i < tableData.getRowCount(); i++) {
            modelTable.removeRow(i);
            i -= 1;
        }
    }
    
    private void fillTable() {
        cleanTable();
        String[][] data = VehicleController.queryDataTable();
        modelTable.setRowCount(0);
        for (String[] row : data) {
            modelTable.addRow(row);
        }
    }
    
    private void fillCombobox() {
        cbxNeighborhood.removeAllItems();
        cbxColor.removeAllItems();
        
        String[] neighborhoods = TopsController.getNeighborhoods();
        for (String element : neighborhoods) {
            cbxNeighborhood.addItem(element);
        }
        String[] colors = VehicleController.getColors();
        for (String element : colors) {
            cbxColor.addItem(element);
        }
    }
    
    private boolean checkEmptyFields() {
        return txtLicensePlate.getText().isEmpty() || txtReference.getText().isEmpty();
    }
    
    private void cleanForm() {
        txtLicensePlate.setText("");
        txtReference.setText("");
        cbxNeighborhood.setSelectedIndex(0);
        cbxColor.setSelectedIndex(0);
    }
    
    private String[] getValuesOfFields() {
        String[] data = {txtLicensePlate.getText(), txtReference.getText(), cbxNeighborhood.getSelectedItem().toString(), cbxColor.getSelectedItem().toString()};
        return data;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNewReport;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxColor;
    private javax.swing.JComboBox<String> cbxNeighborhood;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblLicensePlate;
    private javax.swing.JLabel lblNeighborhood;
    private javax.swing.JLabel lblReference;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtReference;
    // End of variables declaration//GEN-END:variables
}
