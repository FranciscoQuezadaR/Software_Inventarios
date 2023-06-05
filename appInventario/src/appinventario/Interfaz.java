package appinventario;

import BD.BD;
import BD.Conexion;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;


public class Interfaz extends javax.swing.JFrame {

    Color colorBlack             = new Color ( 0,   0,   0   );
    Color colorWithe             = new Color ( 255, 255, 255 );
    Color buttonsColor           = new Color ( 25,  34,  43  );
    Color buttonsColorEntered    = new Color ( 26,  36,  46  );
    Color buttonEliminar         = new Color ( 255, 111, 111 );
    Color buttonExport           = new Color ( 109, 196, 109 );
    Color buttonsColorEnteredTop = new Color ( 239, 239, 239 );
    
    DefaultListModel<String> modeloProds = new DefaultListModel<>();
    DefaultListModel<String> modeloCant = new DefaultListModel<>();
    DefaultListModel<String> modeloTotal = new DefaultListModel<>();
    
    int opcVenta = -1;
    int opc = 1; // Opcion para verificar la posicion del panel lateral
    /*
        opc = 1 -> Productos
        opc = 2 -> Provedores
        opc = 3 -> Ventas
        opc = 4 -> Empresas
    */
    
    DefaultTableModel modelo;
    Conexion con = new Conexion();
    BD bd = new BD();
    Point mouseDownCompCoords = null;
    
    public Interfaz() {
        initComponents();
        JMenuBarPers men = new JMenuBarPers ( this );
        modelo = (DefaultTableModel)table.getModel();
        
        bd.muestraProductos(modelo);
        actualizaNumeros();
        
        
        addMouseListener(new MouseAdapter() {
            
            
            public void mousePressed(MouseEvent e) {
                mouseDownCompCoords = e.getPoint();
            }
        });
        
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point currCoords = e.getLocationOnScreen();
                setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
            }
        });
        
        javax.swing.border.Border border = javax.swing.BorderFactory.createLineBorder(new Color(230, 230, 230), 1);
        this.getRootPane().setBorder(border);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formEmpresa = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtxtNombreEmp = new javax.swing.JTextField();
        jtxtGiroEmp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtEmailEmp = new javax.swing.JTextField();
        jtxtTelefonoEmp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtDomicilioEmp = new javax.swing.JTextField();
        jBtnGuardarEmp = new javax.swing.JButton();
        jBtnCancelarEmp = new javax.swing.JButton();
        formProducto = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtnGuardarProd = new javax.swing.JButton();
        jBtnCancelarProd = new javax.swing.JButton();
        jtxtPrecioCompraProd = new javax.swing.JTextField();
        jtxtCantidadProd = new javax.swing.JTextField();
        jtxtNombreProd = new javax.swing.JTextField();
        jtxtCodigoProd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtMarcaProd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtPrecioVentaProd = new javax.swing.JTextField();
        jcbProvedoresProd = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        formProvedor = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jBtnGuardarProv = new javax.swing.JButton();
        jBtnCancelarProv = new javax.swing.JButton();
        jtxtTelefonoProv = new javax.swing.JTextField();
        jtxtFechaCProv = new javax.swing.JTextField();
        jtxtNombreProv = new javax.swing.JTextField();
        jtxtEmailProv = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jcbEmpresaProv = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        formVenta = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jBtnGuardaVent = new javax.swing.JButton();
        jBtnCancelarVent = new javax.swing.JButton();
        jLabelFechaVent = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabelCodigoVent = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProds = new javax.swing.JList<>();
        jBtnAgProdVent = new javax.swing.JButton();
        jLabelSubtotalVenta = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListCantidad = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListTotal = new javax.swing.JList<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabelTotalVenta = new javax.swing.JLabel();
        productos = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableVenta = new javax.swing.JTable();
        jBtnGuardarNvaVenta = new javax.swing.JButton();
        jBtnCancelarNvaVenta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbtnProvedores = new javax.swing.JButton();
        jbtnVentas = new javax.swing.JButton();
        jbtnProductos = new javax.swing.JButton();
        jbtnEmpresas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jlblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnNuevo = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnExptrExcl = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Nombre: ");

        jLabel9.setText("Giro:");

        jLabel8.setText("Email:");

        jtxtTelefonoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTelefonoEmpActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefono:");

        jLabel11.setText("Domicilio:");

        jtxtDomicilioEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDomicilioEmpActionPerformed(evt);
            }
        });

        jBtnGuardarEmp.setText("Guardar");
        jBtnGuardarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarEmpActionPerformed(evt);
            }
        });

        jBtnCancelarEmp.setText("Cancelar");
        jBtnCancelarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBtnGuardarEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnCancelarEmp))
                    .addComponent(jtxtTelefonoEmp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtEmailEmp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtGiroEmp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtNombreEmp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDomicilioEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtxtNombreEmp)
                        .addGap(15, 15, 15)
                        .addComponent(jtxtGiroEmp)
                        .addGap(15, 15, 15)
                        .addComponent(jtxtEmailEmp)
                        .addGap(15, 15, 15)
                        .addComponent(jtxtTelefonoEmp)))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDomicilioEmp)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout formEmpresaLayout = new javax.swing.GroupLayout(formEmpresa.getContentPane());
        formEmpresa.getContentPane().setLayout(formEmpresaLayout);
        formEmpresaLayout.setHorizontalGroup(
            formEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        formEmpresaLayout.setVerticalGroup(
            formEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre: ");

        jLabel3.setText("Precio C: ");

        jLabel4.setText("Cantidad: ");

        jBtnGuardarProd.setText("Guardar");
        jBtnGuardarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarProdActionPerformed(evt);
            }
        });

        jBtnCancelarProd.setText("Cancelar");
        jBtnCancelarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarProdActionPerformed(evt);
            }
        });

        jLabel5.setText("Codigo: ");

        jLabel6.setText("Marca: ");

        jLabel12.setText("Precio V: ");

        jLabel13.setText("Provedores:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jtxtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jBtnGuardarProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnCancelarProd))
                            .addComponent(jtxtPrecioCompraProd)
                            .addComponent(jtxtCantidadProd)
                            .addComponent(jtxtMarcaProd)
                            .addComponent(jcbProvedoresProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtPrecioVentaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 20, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtCodigoProd))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtNombreProd))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtMarcaProd))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtPrecioCompraProd))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtxtPrecioVentaProd))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtCantidadProd))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProvedoresProd)
                    .addComponent(jLabel13))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout formProductoLayout = new javax.swing.GroupLayout(formProducto.getContentPane());
        formProducto.getContentPane().setLayout(formProductoLayout);
        formProductoLayout.setHorizontalGroup(
            formProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formProductoLayout.setVerticalGroup(
            formProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formProductoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Nombre: ");

        jLabel15.setText("Telefono:");

        jLabel16.setText("Fecha de contrato:");

        jBtnGuardarProv.setText("Guardar");
        jBtnGuardarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarProvActionPerformed(evt);
            }
        });

        jBtnCancelarProv.setText("Cancelar");
        jBtnCancelarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarProvActionPerformed(evt);
            }
        });

        jLabel17.setText("Email:");

        jLabel18.setText("Empresa:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(48, 48, 48))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jcbEmpresaProv, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtFechaCProv, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtEmailProv, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtTelefonoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnGuardarProv)
                        .addGap(35, 35, 35)
                        .addComponent(jBtnCancelarProv)))
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtxtNombreProv))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtxtTelefonoProv))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtxtEmailProv))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jtxtFechaCProv))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEmpresaProv)
                    .addComponent(jLabel18))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout formProvedorLayout = new javax.swing.GroupLayout(formProvedor.getContentPane());
        formProvedor.getContentPane().setLayout(formProvedorLayout);
        formProvedorLayout.setHorizontalGroup(
            formProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formProvedorLayout.setVerticalGroup(
            formProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formProvedorLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setText("Subtotal:");

        jBtnGuardaVent.setText("Guardar");
        jBtnGuardaVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardaVentActionPerformed(evt);
            }
        });

        jBtnCancelarVent.setText("Cancelar");
        jBtnCancelarVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarVentActionPerformed(evt);
            }
        });

        jLabelFechaVent.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFechaVent.setOpaque(true);

        jLabel20.setText("Total:");

        jLabelCodigoVent.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCodigoVent.setOpaque(true);

        jListProds.setBorder(null);
        jListProds.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jListProds.setEnabled(false);
        jScrollPane2.setViewportView(jListProds);

        jBtnAgProdVent.setText("+");
        jBtnAgProdVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgProdVentActionPerformed(evt);
            }
        });

        jLabel22.setText("Productos");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel23.setText("Cantidad");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jListCantidad.setBorder(null);
        jListCantidad.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jListCantidad.setEnabled(false);
        jScrollPane3.setViewportView(jListCantidad);

        jListTotal.setBorder(null);
        jListTotal.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jListTotal.setEnabled(false);
        jListTotal.setFocusable(false);
        jScrollPane4.setViewportView(jListTotal);

        jLabel24.setText("Total");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel25.setText("Venta No.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jBtnAgProdVent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jBtnGuardaVent)
                                .addGap(34, 34, 34)
                                .addComponent(jBtnCancelarVent))
                            .addComponent(jLabelTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSubtotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelFechaVent, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCodigoVent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFechaVent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigoVent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 15, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabelSubtotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabelTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardaVent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelarVent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAgProdVent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout formVentaLayout = new javax.swing.GroupLayout(formVenta.getContentPane());
        formVenta.getContentPane().setLayout(formVentaLayout);
        formVentaLayout.setHorizontalGroup(
            formVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formVentaLayout.setVerticalGroup(
            formVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jTableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableVenta);
        if (jTableVenta.getColumnModel().getColumnCount() > 0) {
            jTableVenta.getColumnModel().getColumn(0).setResizable(false);
            jTableVenta.getColumnModel().getColumn(1).setResizable(false);
        }

        jBtnGuardarNvaVenta.setText("Guardar");
        jBtnGuardarNvaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarNvaVentaActionPerformed(evt);
            }
        });

        jBtnCancelarNvaVenta.setText("Cancelar");
        jBtnCancelarNvaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarNvaVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jBtnGuardarNvaVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnCancelarNvaVenta))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardarNvaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelarNvaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout productosLayout = new javax.swing.GroupLayout(productos.getContentPane());
        productos.getContentPane().setLayout(productosLayout);
        productosLayout.setHorizontalGroup(
            productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        productosLayout.setVerticalGroup(
            productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productosLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jPanel2.setBackground(new java.awt.Color(25, 34, 43));

        jbtnProvedores.setBackground(new java.awt.Color(25, 34, 43));
        jbtnProvedores.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnProvedores.setForeground(new java.awt.Color(255, 255, 255));
        jbtnProvedores.setText("Provedores");
        jbtnProvedores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnProvedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnProvedores.setFocusPainted(false);
        jbtnProvedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnProvedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnProvedoresMouseExited(evt);
            }
        });
        jbtnProvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProvedoresActionPerformed(evt);
            }
        });

        jbtnVentas.setBackground(new java.awt.Color(25, 34, 43));
        jbtnVentas.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnVentas.setForeground(new java.awt.Color(255, 255, 255));
        jbtnVentas.setText("Ventas");
        jbtnVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnVentas.setFocusPainted(false);
        jbtnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnVentasMouseExited(evt);
            }
        });
        jbtnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVentasActionPerformed(evt);
            }
        });

        jbtnProductos.setBackground(new java.awt.Color(25, 34, 43));
        jbtnProductos.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnProductos.setForeground(new java.awt.Color(255, 255, 255));
        jbtnProductos.setText("Productos");
        jbtnProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnProductos.setFocusPainted(false);
        jbtnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnProductosMouseExited(evt);
            }
        });
        jbtnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProductosActionPerformed(evt);
            }
        });

        jbtnEmpresas.setBackground(new java.awt.Color(25, 34, 43));
        jbtnEmpresas.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnEmpresas.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEmpresas.setText("Empresas");
        jbtnEmpresas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnEmpresas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEmpresas.setFocusPainted(false);
        jbtnEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnEmpresasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnEmpresasMouseExited(evt);
            }
        });
        jbtnEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEmpresasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtnProvedores, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
            .addComponent(jbtnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtnEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jbtnProvedores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jbtnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jbtnEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Codigo", "Nombre", "Marca", "Precio Compra", "Precio Venta", "Existencias", "Provedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jlblTitulo.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jlblTitulo.setText("Productos");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("_______________________________________________________________________________________________");

        jbtnNuevo.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-por-nueva-copia-30.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbtnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnNuevo.setFocusPainted(false);
        jbtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnNuevo.setName("Nuevo"); // NOI18N
        jbtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnNuevoMouseExited(evt);
            }
        });
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnModificar.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jbtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-editar-archivo-30.png"))); // NOI18N
        jbtnModificar.setText("Modificar");
        jbtnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnModificar.setFocusPainted(false);
        jbtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnModificarMouseExited(evt);
            }
        });
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jbtnEliminar.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eliminar-30.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.setFocusPainted(false);
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnEliminarMouseExited(evt);
            }
        });
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnExptrExcl.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jbtnExptrExcl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-export-excel-30.png"))); // NOI18N
        jbtnExptrExcl.setText("Exportar");
        jbtnExptrExcl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbtnExptrExcl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnExptrExcl.setFocusPainted(false);
        jbtnExptrExcl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnExptrExcl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnExptrExcl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnExptrExclMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnExptrExclMouseExited(evt);
            }
        });
        jbtnExptrExcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExptrExclActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1040, 1040, 1040)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jbtnExptrExcl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jbtnExptrExcl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jlblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jbtnNuevo.getAccessibleContext().setAccessibleDescription("Nuevo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExptrExclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExptrExclActionPerformed
        ExportarExcel obj;
        try {
            obj = new ExportarExcel();
            obj.exportarExcel(table);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_jbtnExptrExclActionPerformed

    private void jbtnExptrExclMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExptrExclMouseExited
        jbtnExptrExcl.setBackground(colorWithe);
        jbtnExptrExcl.setForeground(colorBlack);
        ImageIcon icono = new ImageIcon(getClass().getResource("../icons8-export-excel-30.png"));
        jbtnExptrExcl.setIcon(icono);
    }//GEN-LAST:event_jbtnExptrExclMouseExited

    private void jbtnExptrExclMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExptrExclMouseEntered
        jbtnExptrExcl.setBackground(buttonExport);
        jbtnExptrExcl.setForeground(colorWithe);
        ImageIcon icono = new ImageIcon(getClass().getResource("../icons8-export-excel-30-white.png"));
        jbtnExptrExcl.setIcon(icono);
    }//GEN-LAST:event_jbtnExptrExclMouseEntered

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        int indice = table.getSelectedRow();
  
        try{
            switch (opc) {
                case 1:
                    int codigo = Integer.parseInt(table.getValueAt(indice, 1).toString());
                    bd.eliminaProducto(codigo);
                    JOptionPane.showMessageDialog(null, "Se elimino correctamente", "ELIMINADO", JOptionPane.OK_OPTION);
                    bd.muestraProductos(modelo);
                    break;         
                case 2:
                    String tel = table.getValueAt(indice, 2).toString();
                    bd.eliminaProvedor(tel);
                    JOptionPane.showMessageDialog(null, "Se elimino correctamente", "ELIMINADO", JOptionPane.OK_OPTION);
                    bd.muestraProvedores(modelo);
                    break;
                    
                case 3:
                    int codigoVenta = Integer.parseInt(table.getValueAt(indice, 1).toString());
                    bd.eliminaVenta(codigoVenta);
                    JOptionPane.showMessageDialog(null, "Se elimino correctamente", "ELIMINADO", JOptionPane.OK_OPTION);
                    bd.muestraVenta(modelo);
                break;    
                case 4:
                    String nombre = table.getValueAt(indice, 1).toString();
                    bd.eliminaEmpresa(nombre);
                    JOptionPane.showMessageDialog(null, "Se elimino correctamente", "ELIMINADO", JOptionPane.OK_OPTION);
                    bd.muestraEmpresas(modelo);
                    break;
                default:
                    throw new AssertionError();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun elemento de la tabla", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        actualizaNumeros();
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseExited
        jbtnEliminar.setBackground(colorWithe);
        jbtnEliminar.setForeground(colorBlack);
        ImageIcon icono = new ImageIcon(getClass().getResource("../icons8-eliminar-30.png"));
        jbtnEliminar.setIcon(icono);
    }//GEN-LAST:event_jbtnEliminarMouseExited

    private void jbtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseEntered
        jbtnEliminar.setBackground(buttonEliminar);
        jbtnEliminar.setForeground(colorWithe);
        ImageIcon icono = new ImageIcon(getClass().getResource("../icons8-eliminar-30-white.png"));
        jbtnEliminar.setIcon(icono);
    }//GEN-LAST:event_jbtnEliminarMouseEntered

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        try{
            int indice = table.getSelectedRow();
            switch (opc) {
                case 1:
                    int codigo      = Integer.parseInt (table.getValueAt ( indice, 1).toString());
                    String nombre   = table.getValueAt ( indice, 2).toString();
                    String marca    = table.getValueAt ( indice, 3).toString();
                    float pC        = Float.parseFloat ( table.getValueAt(indice, 4)+"");
                    float pV        = Float.parseFloat ( table.getValueAt(indice, 5)+"");
                    int cant        = Integer.parseInt ( table.getValueAt(indice, 6)+"");
                    String provedor = table.getValueAt ( indice, 7).toString();
                    bd.getProvedores(jcbProvedoresProd);
                    
                    setInfoProducto(codigo,nombre, marca, pC, pV, cant, provedor);
                    editarPropiedades(formProducto, 340, 370, "Modificar Producto");
                break;    
                case 2:
                    String nomP    = table.getValueAt(indice, 1).toString();
                    String telP    = table.getValueAt(indice, 2).toString();
                    String emailP  = table.getValueAt(indice, 3).toString();
                    String fechaP  = table.getValueAt(indice, 4).toString();
                    String empresa = table.getValueAt(indice, 5).toString();
                    bd.getEmpresas(jcbEmpresaProv);
                    
                    setInfoProvedor(nomP, telP, emailP, fechaP, empresa);
                    editarPropiedades(formProvedor, 380, 300, "Modificar Provedor");
                break;
                case 3:
                    opcVenta = 0;
                    jBtnAgProdVent.setEnabled(false);
                    jBtnGuardaVent.setEnabled(false);
                    jBtnCancelarVent.setText("Ok");
                    String codVenta =table.getValueAt(indice, 1).toString();
                    String fechaVenta = table.getValueAt(indice, 2).toString();
                    String subtotalVenta = table.getValueAt(indice, 3).toString();
                    String totalVenta = table.getValueAt(indice, 4).toString();
                    
                    setInfoVenta(fechaVenta, codVenta, subtotalVenta, totalVenta);
                    editarPropiedades(formVenta, 350, 445, "Venta");
                break;
                case 4:
                    String nombreE    = table.getValueAt(indice, 1).toString();
                    String giroE      = table.getValueAt(indice, 2).toString();
                    String emailE     = table.getValueAt(indice, 3).toString();
                    String telefonoE  = table.getValueAt(indice, 4).toString();
                    String domicilioE = table.getValueAt(indice, 5).toString();
                    
                    setInfoEmpresa(nombreE, giroE, emailE, telefonoE, domicilioE);
                    editarPropiedades(formEmpresa, 361, 302, "Modificar Empresa");
                break;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun elemento de la tabla", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnModificarMouseExited
        jbtnModificar.setBackground(colorWithe);
    }//GEN-LAST:event_jbtnModificarMouseExited

    private void jbtnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnModificarMouseEntered
        jbtnModificar.setBackground(buttonsColorEnteredTop);
    }//GEN-LAST:event_jbtnModificarMouseEntered

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        switch (opc) {
            case 1:
                if (bd.hayProvedores()) {
                    bd.getProvedores(jcbProvedoresProd);
                    editarPropiedades(formProducto, 340, 370, "Nuevo Producto");
                    resetFormProductos();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No hay provedores");
                }
           break;
            case 2:
                if (bd.hayEmpresas()) {
                    bd.getEmpresas(jcbEmpresaProv);
                    editarPropiedades(formProvedor, 380, 300, "Nuevo Provedor"); 
                    resetFormProvedores();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No hay empresas");
                }
            break;
            case 3:
                if (bd.hayProductos()) {
                    opcVenta = 1;
                    jBtnGuardaVent.setEnabled(true);
                    jBtnAgProdVent.setEnabled(true);
                    jBtnCancelarVent.setText("Cancelar");
                    LocalTime horaActual = LocalTime.now();
                    DateTimeFormatter formato12Horas = DateTimeFormatter.ofPattern("hh:mm:ss");
                    String horaFormateada = horaActual.format(formato12Horas);
                    
                    LocalDate fechaActual = LocalDate.now();
                    editarPropiedades(formVenta, 350, 445, "Nueva Venta");
                    
                    int maxVenta = bd.maxVentas();
                    jLabelFechaVent.setText(fechaActual.toString()+ " " + horaFormateada);
                    jLabelCodigoVent.setText((maxVenta+1) + "");
                    
                    resetFormVenta();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No hay productos");
                }
                break;
            case 4:
                editarPropiedades(formEmpresa, 361, 302, "Nueva Empresa"); 
                resetFormEmpresa();
            break;
        }
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevoMouseExited
        jbtnNuevo.setBackground(colorWithe);
    }//GEN-LAST:event_jbtnNuevoMouseExited

    private void jbtnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevoMouseEntered
        jbtnNuevo.setBackground(buttonsColorEnteredTop);
    }//GEN-LAST:event_jbtnNuevoMouseEntered

    private void jbtnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProductosActionPerformed
        opc = 1;
        bd.muestraProductos(modelo);
        jlblTitulo.setText("Productos");
        jbtnModificar.setEnabled(true);
        
        jbtnModificar.setText("Modificar");
        ImageIcon icono = new ImageIcon(getClass().getResource("../icons8-editar-archivo-30.png"));
        jbtnModificar.setIcon(icono);
    }//GEN-LAST:event_jbtnProductosActionPerformed

    private void jbtnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProductosMouseExited
        this.jbtnProductos.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnProductosMouseExited

    private void jbtnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProductosMouseEntered
        this.jbtnProductos.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnProductosMouseEntered

    private void jbtnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVentasActionPerformed
        opc = 3;
        jlblTitulo.setText("Ventas");
        bd.muestraVenta(modelo);
        
        jbtnModificar.setText("Ver venta");
        
        ImageIcon icono = new ImageIcon(getClass().getResource("../icons8-ver-30.png"));
        jbtnModificar.setIcon(icono);
    }//GEN-LAST:event_jbtnVentasActionPerformed

    private void jbtnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVentasMouseExited
        this.jbtnVentas.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnVentasMouseExited

    private void jbtnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVentasMouseEntered
        this.jbtnVentas.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnVentasMouseEntered

    private void jbtnProvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProvedoresActionPerformed
        opc = 2;
        jlblTitulo.setText("Provedores");
        bd.muestraProvedores(modelo);
        jbtnModificar.setEnabled(true);
        
        jbtnModificar.setText("Modificar");
        ImageIcon icono = new ImageIcon(getClass().getResource("../icons8-editar-archivo-30.png"));
        jbtnModificar.setIcon(icono);
    }//GEN-LAST:event_jbtnProvedoresActionPerformed

    private void jbtnProvedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProvedoresMouseExited
        this.jbtnProvedores.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnProvedoresMouseExited

    private void jbtnProvedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProvedoresMouseEntered
        this.jbtnProvedores.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnProvedoresMouseEntered

    private void jbtnEmpresasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEmpresasMouseEntered
        this.jbtnEmpresas.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnEmpresasMouseEntered

    private void jbtnEmpresasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEmpresasMouseExited
        this.jbtnEmpresas.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnEmpresasMouseExited

    private void jbtnEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEmpresasActionPerformed
        opc = 4;
        jlblTitulo.setText("Empresas");
        bd.muestraEmpresas(modelo);
        jbtnModificar.setEnabled(true);
        
        jbtnModificar.setText("Modificar");
        ImageIcon icono = new ImageIcon(getClass().getResource("../icons8-editar-archivo-30.png"));
        jbtnModificar.setIcon(icono);
    }//GEN-LAST:event_jbtnEmpresasActionPerformed

    private void jtxtTelefonoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTelefonoEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTelefonoEmpActionPerformed

    private void jtxtDomicilioEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDomicilioEmpActionPerformed
        //**********************************************************************
    }//GEN-LAST:event_jtxtDomicilioEmpActionPerformed

    private void jBtnGuardarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarEmpActionPerformed
        Empresa empresa = new Empresa();

        String nombreEmpresa = jtxtNombreEmp.getText();
        String emailEmpresa  = jtxtEmailEmp.getText();
        String telEmpresa    = jtxtTelefonoEmp.getText();
        
        empresa.setNombre    ( nombreEmpresa                );
        empresa.setGiro      ( jtxtGiroEmp.getText()          );
        empresa.setEmail     ( emailEmpresa                  );
        empresa.setTelefono  ( telEmpresa                  );
        empresa.setDomicilio ( jtxtDomicilioEmp.getText() );
        
        if(validarCamposEmpresa()){
            if (formEmpresa.getTitle().equals("Modificar Empresa")) {
            bd.actualizaEmpresa(empresa);
            JOptionPane.showMessageDialog(null, "Se guardo correctamente","ACTUALIZADO",JOptionPane.INFORMATION_MESSAGE);
            formEmpresa.dispose();
            bd.muestraEmpresas(modelo);
            }
            else {
                if (bd.existeNombreEnEmpresas(nombreEmpresa)) {
                    JOptionPane.showMessageDialog(null, "Una empresa con el mismo NOMBRE ya existe, no se insertara.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }else if (bd.existeEmailEnEmpresas(emailEmpresa)){
                    JOptionPane.showMessageDialog(null, "Una empresa con el mismo EMAIL ya existe, no se insertara.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }else if (bd.existeTelEnEmpresas(telEmpresa)){
                    JOptionPane.showMessageDialog(null, "Una empresa con el mismo TELEFONO ya existe, no se insertara.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }else{
                    bd.insertaEmpresa(empresa);
                    JOptionPane.showMessageDialog(null, "Se agrego correctamente","REGISTRADO",JOptionPane.INFORMATION_MESSAGE);
                    formEmpresa.dispose();
                    bd.muestraEmpresas(modelo);
                }
            }
        }
        actualizaNumeros();
    }//GEN-LAST:event_jBtnGuardarEmpActionPerformed

    private void jBtnCancelarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarEmpActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere cancelar la operacion? (No se guardaran cambios)", "CANCELAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(opcion == JOptionPane.YES_OPTION)
            formEmpresa.dispose();
    }//GEN-LAST:event_jBtnCancelarEmpActionPerformed

    private void jBtnGuardarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarProdActionPerformed
        Producto producto = new Producto();
        
        int index  = this.jcbProvedoresProd.getSelectedIndex();
        int idProv = bd.getIdProvedor ( this.jcbProvedoresProd.getItemAt ( index ) );
        
        int codigo = Integer.parseInt ( jtxtCodigoProd.getText() );
        String nombre = jtxtNombreProd.getText();
        
        producto.setCodigo       ( codigo                                                           );
        producto.setNombre       ( nombre                                                           );
        producto.setMarca        ( jtxtMarcaProd.getText()                                     );
        producto.setPrecioCompra ( Float.parseFloat(jtxtPrecioCompraProd.getText())     );
        producto.setPrecioVenta  ( Float.parseFloat(jtxtPrecioVentaProd.getText())       );
        producto.setExistencias  ( Integer.parseInt(jtxtCantidadProd.getText())          );
        producto.setIdProvedor   ( idProv                                                   );

        try{
            if(validarCamposProducto()){
                if (formProducto.getTitle().equals("Modificar Producto")) {
                    bd.actualizaProducto(producto);
                    JOptionPane.showMessageDialog(null, "Se guardo correctamente","ACTUALIZADO",JOptionPane.INFORMATION_MESSAGE);
                    bd.muestraProductos(modelo);
                    formProducto.dispose();
                }
                else {
                    if (!bd.existeCodigoProducto(codigo)) {
                        if (!bd.existeNombreProducto(nombre)) {
                            bd.insertaProducto(producto);
                            JOptionPane.showMessageDialog(null, "Se agrego correctamente","REGISTRADO",JOptionPane.INFORMATION_MESSAGE);
                            formProducto.dispose();
                            bd.muestraProductos(modelo);
                        } else {
                            JOptionPane.showMessageDialog(null, "Un producto con el mismo NOMBRE ya existe, no se insertara.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Un producto con el mismo CODIGO ya existe, no se insertara.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }

                    }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros (NO PUEDE HABER CAMPOS VACIOS)", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
   
        actualizaNumeros();
    }//GEN-LAST:event_jBtnGuardarProdActionPerformed

    private void jBtnCancelarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarProdActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere cancelar la operacion? (No se guardaran cambios)", "CANCELAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(opcion == JOptionPane.YES_OPTION)
            formProducto.dispose();
    }//GEN-LAST:event_jBtnCancelarProdActionPerformed

    private void jBtnGuardarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarProvActionPerformed
        Provedor provedor = new Provedor();

        int index = this.jcbEmpresaProv.getSelectedIndex();
        int idEmpresa = bd.getIdEmpresa(this.jcbEmpresaProv.getItemAt(index));

        String telefono = jtxtTelefonoProv.getText();
        String email = jtxtEmailProv.getText();
                
        provedor.setNombre(jtxtNombreProv.getText());
        provedor.setTelefono(telefono);
        provedor.setEmail(email);
        provedor.setFechaContrato(jtxtFechaCProv.getText());
        provedor.setIdEmpresa(idEmpresa);
        
        if(validarCamposProvedor()){
            if(formProvedor.getTitle().equals("Modificar Provedor")){
                bd.actualizaProvedor(provedor);
                JOptionPane.showMessageDialog(null, "Se guardo correctamente","ACTUALIZADO",JOptionPane.INFORMATION_MESSAGE);
                formProvedor.dispose();
                bd.muestraProvedores(modelo);
            }else{
               if(!bd.existeTelEnProvedores(telefono)){
                   if (!bd.existeEmailEnProvedores(email)) {
                       bd.insertaProvedor(provedor);
                       JOptionPane.showMessageDialog(null, "Se agrego correctamente","REGISTRADO",JOptionPane.INFORMATION_MESSAGE);
                       formProvedor.dispose();
                       bd.muestraProvedores(modelo);
                   } else {
                       JOptionPane.showMessageDialog(null, "Un provedor con el mismo EMAIL ya existe, no se insertara.", "ERROR", JOptionPane.ERROR_MESSAGE);
                   }   
                }else{
                    JOptionPane.showMessageDialog(null, "Un provedor con el mismo TELEFONO ya existe, no se insertara.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        actualizaNumeros();
    }//GEN-LAST:event_jBtnGuardarProvActionPerformed

    private void jBtnCancelarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarProvActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere cancelar la operacion? (No se guardaran cambios)", "CANCELAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(opcion == JOptionPane.YES_OPTION)
            formProvedor.dispose();
    }//GEN-LAST:event_jBtnCancelarProvActionPerformed

    private void jBtnGuardaVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardaVentActionPerformed
        Venta v = new Venta();
        ProductoVenta pv = new ProductoVenta();
        
        String fechaVenta = jLabelFechaVent.getText(); 
        v.setFecha(fechaVenta);
        v.setSubtotal(Float.parseFloat(jLabelSubtotalVenta.getText()));
        v.setTotal(Float.parseFloat(jLabelTotalVenta.getText()));
        
        bd.insertaVenta(v);
        int idVenta = bd.getIdVenta(fechaVenta);
        bd.muestraVenta(modelo);
        JOptionPane.showMessageDialog(null, "Se agrego correctamente","REGISTRADO",JOptionPane.INFORMATION_MESSAGE);
        
        int cantProd = modeloProds.getSize();
        for (int i = 0; i < cantProd; i++) {
            pv.setCodigo(Integer.parseInt(jLabelCodigoVent.getText()));
            pv.setProdCantidad(Integer.parseInt(modeloCant.getElementAt(i)));
            pv.setProdTotal(Float.parseFloat(modeloTotal.getElementAt(i)));
            pv.setIdVenta(idVenta);
            pv.setIdProd(bd.getIdProducto(modeloProds.getElementAt(i)));
            
            bd.insertaProductoVenta(pv);
        }
        
        bd.muestraVenta(modelo);
        formVenta.dispose();
    }//GEN-LAST:event_jBtnGuardaVentActionPerformed

    private void jBtnCancelarVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarVentActionPerformed
        if (opcVenta == 1) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere cancelar la operacion? (No se guardaran cambios)", "CANCELAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if(opcion == JOptionPane.YES_OPTION)
                formVenta.dispose();
        } else {
            formVenta.dispose();
        }
    }//GEN-LAST:event_jBtnCancelarVentActionPerformed

    private void jBtnAgProdVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgProdVentActionPerformed
        editarPropiedades(productos, 285, 485, "Productos Vendidos");
        
        DefaultTableModel modeloVenta = (DefaultTableModel)jTableVenta.getModel();
        bd.muestraProductosTab(modeloVenta);
        
        setInfoListas(modelo, modeloProds, modeloCant);
    }//GEN-LAST:event_jBtnAgProdVentActionPerformed

    private void jBtnGuardarNvaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarNvaVentaActionPerformed
        modeloProds = new DefaultListModel<>();
        modeloCant = new DefaultListModel<>();
        modeloTotal = new DefaultListModel<>();
        float totalVenta = 0, subtotalVenta = 0;
        
        for (int i = 0; i < jTableVenta.getRowCount(); i++) {
            Object cant = jTableVenta.getValueAt(i, 1);
            if (cant != null && Integer.parseInt(cant.toString()) != 0) {
                String producto = jTableVenta.getValueAt(i, 0).toString();
                String cantidad = jTableVenta.getValueAt(i, 1).toString();
                modeloProds.addElement(producto);
                modeloCant.addElement(cantidad);
                
                float precioProd = bd.precioVentaProds(producto);
                float total = precioProd * Integer.parseInt(cantidad);
                
                subtotalVenta += total;
                totalVenta += total;
                
                modeloTotal.addElement(total+"");
            }
        }
        
        jListProds.setModel(modeloProds);
        jListCantidad.setModel(modeloCant);
        jListTotal.setModel(modeloTotal);
        
        productos.dispose();
        
        jLabelSubtotalVenta.setText(subtotalVenta + "");
        jLabelTotalVenta.setText(totalVenta + "");
        
        actualizaNumeros();
    }//GEN-LAST:event_jBtnGuardarNvaVentaActionPerformed

    private void jBtnCancelarNvaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarNvaVentaActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere cancelar la operacion? (No se guardaran cambios)", "CANCELAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(opcion == JOptionPane.YES_OPTION)
            productos.dispose();
    }//GEN-LAST:event_jBtnCancelarNvaVentaActionPerformed

    public static void main(String args[]){
        try {
            Color texto = new Color(255,255,255);
            Color fondoJMenuBar = new Color(26,36,46);
            Color fondoJMenuBarHover = new Color(40, 51, 66);
            
            int menuSpacing = 5; // espacio en píxeles
            Border emptyBorder = BorderFactory.createEmptyBorder(0, menuSpacing, 0, menuSpacing);
            
            Insets insets = new Insets(0, 0, 0, 0);
            UIManager.put ("MenuBar.margin"                , insets);
        
            UIManager.put ( "MenuBar.background"           , fondoJMenuBar);
            UIManager.put ( "MenuBar.borderBottom"          , Color.RED);
            
            UIManager.put ( "Menu.foreground"              , texto);
            UIManager.put ( "Menu.selectionBackground"     , texto);
            UIManager.put ( "Menu.border"                  , emptyBorder);
            UIManager.put ( "Menu.selectionBackground"     , fondoJMenuBarHover);
            UIManager.put ( "Menu.selectionForeground"     , texto);
            
            UIManager.put ( "MenuItem.background"          , fondoJMenuBarHover);
            UIManager.put ( "MenuItem.foreground"          , texto);
            UIManager.put ( "MenuItem.selectionBackground" , fondoJMenuBar);
            UIManager.put ( "MenuItem.selectionForeground" , texto);
            UIManager.put ( "MenuItem.border"              , BorderFactory.createEmptyBorder());
            
            UIManager.put ("Button.background"             , Color.WHITE);
            UIManager.put ("Button.focus"                  , new ColorUIResource(new Color(0, 0, 0, 0)));
            
            UIManager.put ("Menu.shortcutKeys"             , null);
            UIManager.put ("MenuItem.acceleratorSelectionForeground", null);
            UIManager.put ("MenuItem.selectionBackground", UIManager.getColor("MenuBar.background"));

            
            
            
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
   
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz interfaz = new Interfaz();
                interfaz.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog formEmpresa;
    private javax.swing.JDialog formProducto;
    private javax.swing.JDialog formProvedor;
    private javax.swing.JDialog formVenta;
    private javax.swing.JButton jBtnAgProdVent;
    private javax.swing.JButton jBtnCancelarEmp;
    private javax.swing.JButton jBtnCancelarNvaVenta;
    private javax.swing.JButton jBtnCancelarProd;
    private javax.swing.JButton jBtnCancelarProv;
    private javax.swing.JButton jBtnCancelarVent;
    private javax.swing.JButton jBtnGuardaVent;
    private javax.swing.JButton jBtnGuardarEmp;
    private javax.swing.JButton jBtnGuardarNvaVenta;
    private javax.swing.JButton jBtnGuardarProd;
    private javax.swing.JButton jBtnGuardarProv;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCodigoVent;
    private javax.swing.JLabel jLabelFechaVent;
    private javax.swing.JLabel jLabelSubtotalVenta;
    private javax.swing.JLabel jLabelTotalVenta;
    private javax.swing.JList<String> jListCantidad;
    private javax.swing.JList<String> jListProds;
    private javax.swing.JList<String> jListTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableVenta;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnEmpresas;
    private javax.swing.JButton jbtnExptrExcl;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnProductos;
    private javax.swing.JButton jbtnProvedores;
    private javax.swing.JButton jbtnVentas;
    private javax.swing.JComboBox<String> jcbEmpresaProv;
    private javax.swing.JComboBox<String> jcbProvedoresProd;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JTextField jtxtCantidadProd;
    private javax.swing.JTextField jtxtCodigoProd;
    private javax.swing.JTextField jtxtDomicilioEmp;
    private javax.swing.JTextField jtxtEmailEmp;
    private javax.swing.JTextField jtxtEmailProv;
    private javax.swing.JTextField jtxtFechaCProv;
    private javax.swing.JTextField jtxtGiroEmp;
    private javax.swing.JTextField jtxtMarcaProd;
    private javax.swing.JTextField jtxtNombreEmp;
    private javax.swing.JTextField jtxtNombreProd;
    private javax.swing.JTextField jtxtNombreProv;
    private javax.swing.JTextField jtxtPrecioCompraProd;
    private javax.swing.JTextField jtxtPrecioVentaProd;
    private javax.swing.JTextField jtxtTelefonoEmp;
    private javax.swing.JTextField jtxtTelefonoProv;
    private javax.swing.JDialog productos;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    public void editarPropiedades(JDialog dialog, int sizeHor, int sizeVer, String titulo) {
        dialog.setVisible            ( true                      );
        dialog.setSize               ( sizeHor, sizeVer );
        dialog.setResizable          ( false               );
        dialog.setLocationRelativeTo ( this                      );
        dialog.setTitle              (titulo                  );
    }
    
    public void setInfoEmpresa(String nombre, String giro, String email, String telefono, String domicilio) {
        jtxtNombreEmp.setText    ( nombre    );
        jtxtGiroEmp.setText      ( giro      );
        jtxtEmailEmp.setText     ( email     );
        jtxtTelefonoEmp.setText  ( telefono  );
        jtxtDomicilioEmp.setText ( domicilio );
        
        jtxtNombreEmp.setEditable(false);
    }
    
    public void setInfoVenta(String fecha, String codigo, String subtotal, String total) {
        jLabelFechaVent.setText(fecha);
        jLabelCodigoVent.setText(codigo);
        jLabelSubtotalVenta.setText(subtotal);
        jLabelTotalVenta.setText(total);
        
        bd.muestraInfoVentas(modeloProds, modeloCant, modeloTotal, Integer.parseInt(codigo)); 
        jListProds.setModel(modeloProds);
        jListCantidad.setModel(modeloCant);
        jListTotal.setModel(modeloTotal);
    }
    
    public void setInfoProducto(int codigo, String nombre, String marca, float pc, float pv, int existencias, String provedor) {
        jtxtCodigoProd.setText            ( codigo+""        );
        jtxtNombreProd.setText            ( nombre         );
        jtxtMarcaProd.setText             ( marca          );
        jtxtPrecioCompraProd.setText      ( pc+""            );
        jtxtPrecioVentaProd.setText       ( pv+""            );
        jtxtCantidadProd.setText          ( existencias + "" );
        jcbProvedoresProd.setSelectedItem (provedor   );
        
        jtxtCodigoProd.setEditable(false);
        jcbProvedoresProd.setEnabled(false);
    }
    
    public void setInfoProvedor(String nombre, String telefono, String email, String fecha, String empresa) {
        jtxtNombreProv.setText   ( nombre   );
        jtxtTelefonoProv.setText ( telefono );
        jtxtEmailProv.setText    ( email    );
        jtxtFechaCProv.setText   ( fecha    );
        jcbEmpresaProv.setSelectedItem ( empresa  );
        
        jtxtNombreProv.setEditable(false);
        jcbEmpresaProv.setEnabled(false);
    }
    
    public void setInfoListas(DefaultTableModel modelo, DefaultListModel prods, DefaultListModel cant) {
        int numRenglones = prods.getSize();
        int cont = prods.getSize();
        int renglonesTotales = jTableVenta.getRowCount();
        for (int i = 0; i < renglonesTotales; i++) {
            for (int j = 0; j < numRenglones; j++) {
                if (jTableVenta.getValueAt(i, 0).equals(prods.getElementAt(j))) {
                    jTableVenta.setValueAt(cant.getElementAt(j), i, 1);
                    System.out.println("Entro");
                    
                    cont--;
                } 
                if (cont == 0) {
                    break;
                }
            }
            if (cont == 0) {
                break;
            }
        }
    }
    
    public void resetFormProductos() {
        jtxtCodigoProd.setText            ( ""    );
        jtxtNombreProd.setText            ( ""    );
        jtxtMarcaProd.setText             ( ""    );
        jtxtPrecioCompraProd.setText      ( ""    );
        jtxtPrecioVentaProd.setText       ( ""    );
        jtxtCantidadProd.setText          ( ""    );
        jcbProvedoresProd.setSelectedIndex( 0 );
        
        jtxtCodigoProd.setEditable(true);
        jcbProvedoresProd.setEnabled(true);
    }
    
    public void resetFormProvedores() {
        jtxtNombreProv.setText   ( "" );
        jtxtTelefonoProv.setText ( "" );
        jtxtEmailProv.setText    ( "" );
        jtxtFechaCProv.setText   ( "" );
        jtxtEmailProv.setText    ( "" );
        
        jtxtNombreProv.setEditable(true);
        jcbEmpresaProv.setEnabled(true);
    }
    
    public void resetFormVenta() {
        modeloProds.removeAllElements();
        modeloCant.removeAllElements();
        modeloTotal.removeAllElements();
        
        jLabelSubtotalVenta.setText("");
        jLabelTotalVenta.setText("");
    }
    
    public void resetFormEmpresa() {
        jtxtNombreEmp.setText     ( ""   );
        jtxtGiroEmp.setText       ( ""   );
        jtxtEmailEmp.setText      ( ""   );
        jtxtTelefonoEmp.setText   ( ""   );
        jtxtDomicilioEmp.setText  ( ""   );
        
        jtxtNombreEmp.setEditable ( true );
    }
    
    public boolean validarCamposEmpresa(){
        //OBTENER LOS VALORES DE LOS CAMPOS
        String nombreEmpresa = jtxtNombreEmp.getText();
        String giro          = jtxtGiroEmp.getText();
        String emailEmpresa  = jtxtEmailEmp.getText();
        String telEmpresa    = jtxtTelefonoEmp.getText();
        String domicilio     = jtxtDomicilioEmp.getText();
        
        //VALIDAR NOMBRE
        if(nombreEmpresa.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo NOMBRE no puede estar vacio", "REVISAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!nombreEmpresa.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")){
            JOptionPane.showMessageDialog(null, "El NOMBRE debe contener solo letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //VALIDAR GIRO
        if(giro.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo GIRO no puede estar vacio", "REVISAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!giro.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")){
            JOptionPane.showMessageDialog(null, "El GIRO debe contener solo letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //VALIDAR EMAIL 
        if(emailEmpresa.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo EMAIL no puede estar vacio", "REVISAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!emailEmpresa.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}||\\s*$")){
            JOptionPane.showMessageDialog(null, "El EMAIL no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //VALIDAR TELEFONO
        if(telEmpresa.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo TELEFONO no puede estar vacio", "REVISAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!telEmpresa.matches("\\d{10}")){
            JOptionPane.showMessageDialog(null, "El TELEFONO debe contener solo 10 numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //VALIDAR DOMICILIO
        if(domicilio.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo DOMICILIO no puede estar vacio", "REVISAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!domicilio.matches("^[A-Za-z0-9\\s\\#\\.\\-\\,]+$")){
            JOptionPane.showMessageDialog(null, "El DOMICILIO no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    public boolean validarCamposProvedor(){
        //OBTENER LOS VALORES DE LOS CAMPOS
        String nomProv = jtxtNombreProv.getText();
        String telProv = jtxtTelefonoProv.getText();
        String emailProv = jtxtEmailProv.getText();
        String fechaConP = jtxtFechaCProv.getText();
        
        //VALIDAR NOMBRE
        if(nomProv.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo NOMBRE no puede estar vacio", "REVISAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!nomProv.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")){
            JOptionPane.showMessageDialog(null, "El NOMBRE debe contener solo letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //VALIDAR TELEFONO
        if(telProv.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo TELEFONO no puede estar vacio", "REVISAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!telProv.matches("\\d{10}")){
            JOptionPane.showMessageDialog(null, "El TELEFONO debe contener solo 10 numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //VALIDAR EMAIL 
        if(emailProv.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo EMAIL no puede estar vacio", "REVISAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!emailProv.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}||\\s*$")){
            JOptionPane.showMessageDialog(null, "El EMAIL no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //VALIDAR FECHA
        if(fechaConP.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo FECHA no puede estar vacio", "REVISAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!fechaConP.matches("\\d{4}-\\d{2}-\\d{2}")){
            JOptionPane.showMessageDialog(null, "La FECHA no es valida (aaaa-mm-dd)", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    public boolean validarCamposProducto(){
        //OBTENER LOS VALORES DE LOS CAMPOS
        int codProd = Integer.parseInt(jtxtCodigoProd.getText());
        String codigo = Integer.toString(codProd);
        String nombreProd = jtxtNombreProd.getText();
        String marcaProd = jtxtMarcaProd.getText();
        //float pC = Float.parseFloat(jtxtPrecioCompraProd.getText());
        //float pV = Float.parseFloat(jtxtPrecioVentaProd.getText());
        //int cantProd = Integer.parseInt(jtxtCantidadProd.getText());
        
        //VALIDAR CODIGO
        if(codigo.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo CODIGO no puede estar vacio", "REVISAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //VALIDAR NOMBRE
        if(nombreProd.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo NOMBRE no puede estar vacio", "REVISAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!nombreProd.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")){
            JOptionPane.showMessageDialog(null, "El NOMBRE debe contener solo letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //VALIDAR MARCA
        if(marcaProd.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo MARCA no puede estar vacio", "REVISAR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!marcaProd.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")){
            JOptionPane.showMessageDialog(null, "La MARCA debe contener solo letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    
    public void actualizaNumeros() {
        int contador = 1;
        for (int i = 0; i < table.getRowCount(); i++) {
            table.setValueAt(contador, i, 0);
            contador++;
        }
    }
}
