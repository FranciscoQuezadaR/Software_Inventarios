/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appinventario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicMenuUI;
import mx.tecnm.util.Imagenes;


/**
 *
 * @author franc
 */
public class JMenuBarPers extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menuFile,menuAbout,menuCerrar,menuMinimizar;
    private JMenuItem fileSalir,fileCerrarSesion,aboutVersion;
    private JFrame frame;
    
    public JMenuBarPers(JFrame frame) {
        
        this.frame = frame;
        
        mb = new JMenuBar();
        mb.setForeground(Color.red);
        mb.setPreferredSize(new Dimension(55,30));
        mb.add(Box.createHorizontalStrut(5));
        Border border = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.RED);
        mb.setBorder(border);
        frame.setJMenuBar(mb);
        
        menuFile = new JMenu("Archivo");
        mb.add(menuFile);
        fileSalir = new JMenuItem("Salir");
        menuFile.add(fileSalir);
        fileCerrarSesion = new JMenuItem("Cerrar sesion");
        menuFile.add(fileCerrarSesion);
        
        menuAbout = new JMenu("Acerca de");
        mb.add(menuAbout);
        aboutVersion = new JMenuItem("Version");
        menuAbout.add(aboutVersion);
        
        mb.add(Box.createHorizontalGlue());
         
        fileSalir.addActionListener(this);
        fileCerrarSesion.addActionListener(this);
        aboutVersion.addActionListener(this);
        
        aboutVersion.setPreferredSize(new Dimension(100,25)); // ******
        fileCerrarSesion.setPreferredSize(new Dimension(100,25)); // ******
        fileSalir.setPreferredSize(new Dimension(100,25)); // ******
        
        fileSalir.setBorderPainted(false);
        fileCerrarSesion.setBorderPainted(false);
    
        JLabel labelMinimizar = new JLabel("-", JLabel.CENTER);
        labelMinimizar.setForeground(Color.white);
        labelMinimizar.setPreferredSize(new Dimension(35, 0));
        mb.add(labelMinimizar);
        
        labelMinimizar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFrame f = frame;
                f.setState(Frame.ICONIFIED);
            }
        });
        
        JLabel labelCerrar = new JLabel("X", JLabel.CENTER);
        labelCerrar.setForeground(Color.white);
        labelCerrar.setPreferredSize(new Dimension(35, 0));
        mb.add(labelCerrar);

        labelCerrar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                //frame.dispose();
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==fileSalir) {
            frame.dispose();
        }
        if (e.getSource()==fileCerrarSesion) {
            frame.dispose();
            InicioSesion is = new InicioSesion(this, rootPaneCheckingEnabled);
            is.setVisible(true);
        }
        if (e.getSource()==aboutVersion) {
            JOptionPane.showMessageDialog(null,
            "Software Inventario\n\n"
            + "Integrantes:\n"
            + "Iván Osmar Vasquez Flores - 20130827\n" +
            "Adrián Torres de Alba - 20130763\n" +
            "Heriberto Agustín Zuñiga Silveti - 20130769\n" +
            "Luis Enrique Batres Martínez - 20130806\n" +
            "Marcos Eduardo Solis Ceniceros - 20130844\n" +
            "Francisco Quezada Rivera - 20130815\n\n" +
            "1.0.0 v", "Acerca De", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public JMenuBar menu() {
        return mb;
    }
    
    
    public class CenteredMenu extends JMenu {
        public CenteredMenu(String text) {
            super(text);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            FontMetrics fm = g2.getFontMetrics();
            Rectangle r = getBounds();
            int x = (r.width - fm.stringWidth(getText())) / 2;
            int y = (r.height - fm.getHeight()) / 2 + fm.getAscent();
            g2.drawString(getText(), x, y);
        }
    }
    
    
}
