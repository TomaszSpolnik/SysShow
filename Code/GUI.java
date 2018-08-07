import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
                                                                                /**
                                                                                 * @author T.Spolnik
                                                                                 */
public class GUI extends javax.swing.JFrame {                                   //GUI class auto-gen code
private static final long serialVersionUID = 2663759408813833184L;
	public GUI() {
        initComponents();
	}
    private void initComponents() {
        jButton3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPaneRAMcapacity = new javax.swing.JTextPane();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPaneRAMmanufacturer = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPaneRAMspeed = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPaneHDDsize = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneOSname = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPaneHDDmodel = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPaneCPUname = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jButton3.setText("RAM manufacturer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jScrollPane5.setViewportView(jTextPaneRAMcapacity);
        jButton4.setText("RAM capacity (bytes)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton5.setText("OS name");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton6.setText("HDD size (bytes)");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton7.setText("RAM speed");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jScrollPane7.setViewportView(jTextPaneRAMmanufacturer);
        jScrollPane9.setViewportView(jTextPaneRAMspeed);
        jScrollPane8.setViewportView(jTextPaneHDDsize);
        jScrollPane2.setViewportView(jTextPaneOSname);
        jScrollPane3.setViewportView(jTextPaneHDDmodel);
        jButton1.setText("HDD model");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jScrollPane4.setViewportView(jTextPaneCPUname);
        jButton2.setText("CPU name");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton8.setText("Process all");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane9)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        pack();
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        File file1 = new File("ramman.txt");                                    //Checks for ramman.txt in the program's directory. If exists, reads the data ramman.bat received from the system. 
        if(file1.exists()){                                                     //Then it outputs the info on the screen. Afterwards, deletes that file after outputting it on the screen.
            try {
                byte[] data;
                try (FileInputStream IS = new FileInputStream(file1)) {
                    data = new byte[(int) file1.length()];
                    IS.read(data);
                }
                String str = new String(data, "UTF-8");
                jTextPaneRAMmanufacturer.setText(str);    
            }catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            file1.delete();
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        File file1 = new File("ramcap.txt");                                    //Checks for ramcap.txt in the program's directory. If exists, reads the data ramcap.bat received from the system. 
        if(file1.exists()){                                                     //Then it outputs the info on the screen. Afterwards, deletes that file after outputting it on the screen.
            try {
                byte[] data;
                try (FileInputStream IS = new FileInputStream(file1)) {
                    data = new byte[(int) file1.length()];
                    IS.read(data);
                }
                String str = new String(data, "UTF-8");
                jTextPaneRAMcapacity.setText(str);    
            }catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            } 
            file1.delete();
        }      
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        File file1 = new File("osname.txt");                                    //Checks for osname.txt in the program's directory. If exists, reads the data osname.bat received from the system. 
        if(file1.exists()){                                                     //Then it outputs the info on the screen. Afterwards, deletes that file after outputting it on the screen.
            try {
                byte[] data;
                try (FileInputStream IS = new FileInputStream(file1)) {
                    data = new byte[(int) file1.length()];
                    IS.read(data);
                }
                String str = new String(data, "UTF-8");
                jTextPaneOSname.setText(str);    
            }catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            file1.delete();
        }
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        File file1 = new File("hddsiz.txt");                                    //Checks for hddsiz.txt in the program's directory. If exists, reads the data hddsiz.bat received from the system. 
        if(file1.exists()){                                                     //Then it outputs the info on the screen. Afterwards, deletes that file after outputting it on the screen.
            try {
                byte[] data;
                try (FileInputStream IS = new FileInputStream(file1)) {
                    data = new byte[(int) file1.length()];
                    IS.read(data);
                }
                String str = new String(data, "UTF-8");
                jTextPaneHDDsize.setText(str);    
            }catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            file1.delete();
        }
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        File file1 = new File("ramspe.txt");                                    //Checks for ramspe.txt in the program's directory. If exists, reads the data ramspe.bat received from the system. 
        if(file1.exists()){                                                     //Then it outputs the info on the screen. Afterwards, deletes that file after outputting it on the screen.
            try {
                byte[] data;
                try (FileInputStream IS = new FileInputStream(file1)) {
                    data = new byte[(int) file1.length()];
                    IS.read(data);
                }
                String str = new String(data, "UTF-8");
                jTextPaneRAMspeed.setText(str);    
            }catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            file1.delete();
        }   
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        File file1 = new File("hddmod.txt");                                    //Checks for hddmod.txt in the program's directory. If exists, reads the data hddmod.bat received from the system. 
        if(file1.exists()){                                                     //Then it outputs the info on the screen. Afterwards, deletes that file after outputting it on the screen.
            try {
                byte[] data;
                try (FileInputStream IS = new FileInputStream(file1)) {
                    data = new byte[(int) file1.length()];
                    IS.read(data);
                }
                String str = new String(data, "UTF-8");
                jTextPaneHDDmodel.setText(str);    
            }catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            file1.delete();
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        File file1 = new File("cpunam.txt");                                    //Checks for cpunam.txt in the program's directory. If exists, reads the data cpunam.bat received from the system. 
        if(file1.exists()){                                                     //Then it outputs the info on the screen. Afterwards, deletes that file after outputting it on the screen.
            try {
                byte[] data;
                try (FileInputStream IS = new FileInputStream(file1)) {
                    data = new byte[(int) file1.length()];
                    IS.read(data);
                }
                String str = new String(data, "UTF-8");
                jTextPaneCPUname.setText(str);    
            }catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            file1.delete();
        }   
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        jButton1.doClick();                                                     //Executes all buttons
        jButton2.doClick();
        jButton3.doClick();
        jButton4.doClick();
        jButton5.doClick();
        jButton6.doClick();
        jButton7.doClick();
    }
    public static void main(String args[]) {                                    //Auto-gen main class
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane jTextPaneCPUname;
    private javax.swing.JTextPane jTextPaneHDDmodel;
    private javax.swing.JTextPane jTextPaneHDDsize;
    private javax.swing.JTextPane jTextPaneOSname;
    private javax.swing.JTextPane jTextPaneRAMcapacity;
    private javax.swing.JTextPane jTextPaneRAMmanufacturer;
    private javax.swing.JTextPane jTextPaneRAMspeed;
}
