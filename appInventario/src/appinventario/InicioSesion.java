package appinventario;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class InicioSesion extends javax.swing.JDialog {
    
    Color buttonsColor = new Color(255, 255, 255);
    Color buttonsColorEntered = new Color(230,230,230);

    public InicioSesion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        TextPrompt placeholderUser = new TextPrompt("Usuario", this.jTxtFieldUsuario);
        placeholderUser.changeAlpha(0.4f);
        
        TextPrompt placeholderPass = new TextPrompt("Contraseña", this.jTxtFieldContrasena);
        placeholderPass.changeAlpha(0.4f); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTxtFieldUsuario = new javax.swing.JTextField();
        jTxtFieldContrasena = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonInicia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iniciar Sesion");

        jPanel1.setBackground(new java.awt.Color(25, 34, 43));

        jTxtFieldUsuario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTxtFieldUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtFieldUsuario.setMargin(new java.awt.Insets(2, 15, 2, 15));

        jTxtFieldContrasena.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTxtFieldContrasena.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTxtFieldContrasena.setMargin(new java.awt.Insets(2, 10, 2, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventarios.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jButtonInicia.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButtonInicia.setText("Iniciar Sesion");
        jButtonInicia.setBorderPainted(false);
        jButtonInicia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInicia.setFocusPainted(false);
        jButtonInicia.setMaximumSize(new java.awt.Dimension(123, 40));
        jButtonInicia.setMinimumSize(new java.awt.Dimension(123, 40));
        jButtonInicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonIniciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonIniciaMouseExited(evt);
            }
        });
        jButtonInicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciaActionPerformed(evt);
            }
        });
        jButtonInicia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonIniciaKeyPressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(25, 34, 43));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bienvenido!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonInicia, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(jTxtFieldUsuario)
                            .addComponent(jTxtFieldContrasena))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(jTxtFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTxtFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonInicia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciaActionPerformed
        // TODO add your handling code here:
        String user = jTxtFieldUsuario.getText();
        String pass = jTxtFieldContrasena.getText();
        
        if(user.equals("admin") && pass.equals("123")){
            this.dispose();
            Interfaz inter = new Interfaz();
            inter.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Usuario y/o contraseña incorrectos", "No autenticado",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonIniciaActionPerformed

    private void jButtonIniciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonIniciaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonInicia.doClick();
        }
    }//GEN-LAST:event_jButtonIniciaKeyPressed

    private void jButtonIniciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniciaMouseEntered
        jButtonInicia.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jButtonIniciaMouseEntered

    private void jButtonIniciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniciaMouseExited
        jButtonInicia.setBackground(buttonsColor);
    }//GEN-LAST:event_jButtonIniciaMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            Color texto = new Color(255,255,255);
            Color fondoJMenuBar = new Color(26,36,46);
            Color fondoJMenuBarHover = new Color(40, 51, 66);
            
            int menuSpacing = 5;
            Border emptyBorder = BorderFactory.createEmptyBorder(0, menuSpacing, 0, menuSpacing);
            
            Insets insets = new Insets(0, 0, 0, 0);
            UIManager.put("MenuBar.margin"                , insets);
        
            UIManager.put( "MenuBar.background"           , fondoJMenuBar);
            UIManager.put("MenuBar.borderBottom"          , Color.RED);
            
            UIManager.put ( "Menu.foreground"             , texto);
            UIManager.put ( "Menu.selectionBackground"    , texto);
            UIManager.put ( "Menu.border", emptyBorder);
            UIManager.put ( "Menu.selectionBackground"    , fondoJMenuBarHover);
            UIManager.put ( "Menu.selectionForeground"    , texto);
            
            UIManager.put ( "MenuItem.background"         , fondoJMenuBarHover);
            UIManager.put ( "MenuItem.foreground"         , texto);
            UIManager.put ( "MenuItem.selectionBackground", fondoJMenuBar);
            UIManager.put ( "MenuItem.selectionForeground", texto);
            UIManager.put ( "MenuItem.border"             , BorderFactory.createEmptyBorder());
            
            UIManager.put("Button.background"             , Color.WHITE);
            
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InicioSesion dialog = new InicioSesion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInicia;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jTxtFieldContrasena;
    private javax.swing.JTextField jTxtFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
