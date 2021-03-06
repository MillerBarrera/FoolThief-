package gui;

import javax.swing.ImageIcon;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class MainWindow extends javax.swing.JFrame {

    public EventController controller;

    private PanelHome pnlHome = new PanelHome();
    private PanelReports pnlReports = new PanelReports();
    private PanelStolenVehicles pnlVehicles = new PanelStolenVehicles();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {

        setIconImage(new ImageIcon(getClass().getResource("/images/app_icon.png")).getImage());
        setVisible(true);
        initComponents(); // Init all components from GUI

        controller = new EventController(this);
        initPnlHome();
        beginTime();
    }

    private void initPnlHome() {
        container.removeAll();
        container.add(pnlHome);
        container.revalidate();
        container.repaint();
    }

    private void beginTime() {
        LocalDate now = LocalDate.now();
        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        int year = now.getYear();

        actualDate.setText(day + "/" + month + "/" + year);
        while (true) {
            try {
                Thread.sleep(500);
                actualHour.setText(formatter.format(LocalDateTime.now()));
            } catch (InterruptedException e) {
                // Nothing
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        menuContainer = new javax.swing.JPanel();
        menuIconImage = new javax.swing.JLabel();
        separatorLine1 = new javax.swing.JSeparator();
        separatorLine2 = new javax.swing.JSeparator();
        actualDate = new javax.swing.JLabel();
        actualHour = new javax.swing.JLabel();
        pnlBtnHome = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        pnlBtnReports = new javax.swing.JPanel();
        btnReports = new javax.swing.JButton();
        pnlBtnVehicles = new javax.swing.JPanel();
        btnVehicles = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FoolThief");
        setMinimumSize(new java.awt.Dimension(1020, 600));
        setName("mainFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1020, 600));

        bgPanel.setMaximumSize(getMaximumSize());
        bgPanel.setMinimumSize(getMinimumSize());
        bgPanel.setPreferredSize(getPreferredSize());
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuContainer.setBackground(new java.awt.Color(51, 51, 51));
        menuContainer.setFocusable(false);
        menuContainer.setPreferredSize(new java.awt.Dimension(260, 600));

        menuIconImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_menu.png"))); // NOI18N

        separatorLine1.setBackground(new java.awt.Color(204, 204, 255));
        separatorLine1.setForeground(new java.awt.Color(204, 204, 255));

        actualDate.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        actualDate.setForeground(new java.awt.Color(204, 204, 255));
        actualDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualDate.setText(" ");

        actualHour.setFont(new java.awt.Font("Century Gothic", 0, 34)); // NOI18N
        actualHour.setForeground(new java.awt.Color(204, 204, 255));
        actualHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualHour.setText(" ");

        pnlBtnHome.setBackground(new java.awt.Color(51, 51, 51));

        btnHome.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(213, 213, 213));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_home.png"))); // NOI18N
        btnHome.setText("Inicio");
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setFocusPainted(false);
        btnHome.setHideActionText(true);
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setIconTextGap(20);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBtnHomeLayout = new javax.swing.GroupLayout(pnlBtnHome);
        pnlBtnHome.setLayout(pnlBtnHomeLayout);
        pnlBtnHomeLayout.setHorizontalGroup(
            pnlBtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBtnHomeLayout.setVerticalGroup(
            pnlBtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlBtnReports.setBackground(new java.awt.Color(51, 51, 51));

        btnReports.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnReports.setForeground(new java.awt.Color(213, 213, 213));
        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_reports.png"))); // NOI18N
        btnReports.setText("Reportes");
        btnReports.setBorderPainted(false);
        btnReports.setContentAreaFilled(false);
        btnReports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReports.setFocusPainted(false);
        btnReports.setHideActionText(true);
        btnReports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReports.setIconTextGap(20);
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBtnReportsLayout = new javax.swing.GroupLayout(pnlBtnReports);
        pnlBtnReports.setLayout(pnlBtnReportsLayout);
        pnlBtnReportsLayout.setHorizontalGroup(
            pnlBtnReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBtnReportsLayout.setVerticalGroup(
            pnlBtnReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlBtnVehicles.setBackground(new java.awt.Color(51, 51, 51));

        btnVehicles.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnVehicles.setForeground(new java.awt.Color(213, 213, 213));
        btnVehicles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_vahicles.png"))); // NOI18N
        btnVehicles.setText("Rep. Vehiculo");
        btnVehicles.setBorderPainted(false);
        btnVehicles.setContentAreaFilled(false);
        btnVehicles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVehicles.setFocusPainted(false);
        btnVehicles.setHideActionText(true);
        btnVehicles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVehicles.setIconTextGap(20);
        btnVehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiclesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBtnVehiclesLayout = new javax.swing.GroupLayout(pnlBtnVehicles);
        pnlBtnVehicles.setLayout(pnlBtnVehiclesLayout);
        pnlBtnVehiclesLayout.setHorizontalGroup(
            pnlBtnVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVehicles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBtnVehiclesLayout.setVerticalGroup(
            pnlBtnVehiclesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVehicles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menuContainerLayout = new javax.swing.GroupLayout(menuContainer);
        menuContainer.setLayout(menuContainerLayout);
        menuContainerLayout.setHorizontalGroup(
            menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuContainerLayout.createSequentialGroup()
                .addGroup(menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBtnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBtnReports, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menuContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuIconImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(menuContainerLayout.createSequentialGroup()
                                .addGroup(menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(actualHour, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actualDate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separatorLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separatorLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(pnlBtnVehicles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuContainerLayout.setVerticalGroup(
            menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuIconImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBtnReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBtnVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(separatorLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualHour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actualDate)
                .addGap(35, 35, 35))
        );

        bgPanel.add(menuContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 600));

        container.setBackground(new java.awt.Color(222, 225, 230));
        container.setMaximumSize(container.getMaximumSize());
        container.setMinimumSize(menuContainer.getMinimumSize());
        container.setLayout(new java.awt.CardLayout());
        bgPanel.add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 780, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        container.removeAll();
        container.add(pnlHome);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        container.removeAll();
        container.add(pnlReports);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiclesActionPerformed
        container.removeAll();
        container.add(pnlVehicles);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_btnVehiclesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualDate;
    private javax.swing.JLabel actualHour;
    private javax.swing.JPanel bgPanel;
    javax.swing.JButton btnHome;
    javax.swing.JButton btnReports;
    javax.swing.JButton btnVehicles;
    public static javax.swing.JPanel container;
    private javax.swing.JPanel menuContainer;
    private javax.swing.JLabel menuIconImage;
    javax.swing.JPanel pnlBtnHome;
    javax.swing.JPanel pnlBtnReports;
    javax.swing.JPanel pnlBtnVehicles;
    private javax.swing.JSeparator separatorLine1;
    private javax.swing.JSeparator separatorLine2;
    // End of variables declaration//GEN-END:variables
}
