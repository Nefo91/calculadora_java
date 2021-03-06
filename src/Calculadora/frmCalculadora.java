/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;
import Calculadora.frmBitacora;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;



/**
 *
 * @author mfer_
 */
public class frmCalculadora extends javax.swing.JFrame {
    
    public Clip clip;
    public String ruta = "/Calculadora/";
    
    private boolean punto = true;// sirve para el boton punto
    
    String num1, num2, signo,contenido,result;
    Double resultado;
    boolean encendido = false;
    boolean reinicio = false;
    
   
    /**
     * Creates new form frmCalculadora
     */
    public frmCalculadora() {
        initComponents();
        
    }
    
      public void sonido(String archivo){
          
          
          try{
             clip = AudioSystem.getClip();
             clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo+".wav")));
             clip.start();
          
          }catch (IOException | LineUnavailableException | UnsupportedAudioFileException e){
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

        panelPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_pantalla = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnLimpiartodo = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        mmenuOpc = new javax.swing.JMenu();
        mitemNuevo = new javax.swing.JMenuItem();
        mitemHistorial = new javax.swing.JMenuItem();
        menuayuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_pantalla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pantallaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(txt_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(txt_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn1KeyPressed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnSuma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnLimpiartodo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnLimpiartodo.setText("C");
        btnLimpiartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiartodoActionPerformed(evt);
            }
        });

        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnMultiplicacion.setText("X");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnLimpiar.setText("<--");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiartodo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(570, 570, 570))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(btnLimpiartodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnDivision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mmenuOpc.setText("Opciones");
        mmenuOpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmenuOpcActionPerformed(evt);
            }
        });

        mitemNuevo.setText("Nuevo");
        mitemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemNuevoActionPerformed(evt);
            }
        });
        mmenuOpc.add(mitemNuevo);

        mitemHistorial.setText("Historial");
        mitemHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemHistorialActionPerformed(evt);
            }
        });
        mmenuOpc.add(mitemHistorial);

        jMenuBar2.add(mmenuOpc);

        menuayuda.setText("Ayuda");
        menuayuda.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuayudaMenuSelected(evt);
            }
        });
        menuayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuayudaActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Ayuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuayuda.add(jMenuItem1);

        jMenuBar2.add(menuayuda);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pantallaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        //BOTON LIMPIAR
        sonido("Elemento ");
        contenido = this.txt_pantalla.getText();
        if (contenido.length() > 0){
            //decrementamos a la cadena contenido un caracter
            contenido = contenido.substring(0,contenido.length()-1);
            this.txt_pantalla.setText(contenido);
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        // TODO add your handling code here:
        //BOTON MULTIPLICACION
        //si el simbolo es distinto de: null
        sonido("Elemento ");
        if(!this.txt_pantalla.getText().equals("")){
            num1 = this.txt_pantalla.getText();
            signo = "*";
            this.txt_pantalla.setText("");       }
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
        //BOTON DIVISION
        //si el simbolo es distinto de: null
        sonido("Elemento ");
        if(!this.txt_pantalla.getText().equals("")){
            num1 = this.txt_pantalla.getText();
            signo = "/";
            this.txt_pantalla.setText("");       }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        // TODO add your handling code here:
        //BOTON PUNTO

        // contenido menor o igual a 0, muestra "0."
        // si el campo esta vacio muestra "0."
        sonido("Elemento ");
        contenido = this.txt_pantalla.getText();
        if(contenido.length()<=0){

            this.txt_pantalla.setText("0.");

        }else
        //cuenta cuantos puntos existen, si existe un punto
        //no poddra colocarlse otro punto
        if(this.txt_pantalla.getText().contains(".")){

        }else{
            this.txt_pantalla.setText(this.txt_pantalla.getText()+".");
            punto = false;
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnLimpiartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiartodoActionPerformed
        // TODO add your handling code here:
        //BOTON CLEAR
        sonido("Elemento ");
        this.txt_pantalla.setText("");

    }//GEN-LAST:event_btnLimpiartodoActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        // TODO add your handling code here:
        //BOTORN RESTA
        sonido("Elemento ");
        //si el simbolo es distinto de: null
        if(!this.txt_pantalla.getText().equals("")){
            num1 = this.txt_pantalla.getText();
            signo = "-";
            this.txt_pantalla.setText("");       }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
        //BOTON SUMA
        sonido("Elemento ");   
        
        //si el simbolo es distinto de: null
        if(!this.txt_pantalla.getText().equals("")){
            num1 = this.txt_pantalla.getText();
            signo = "+";
            this.txt_pantalla.setText("");       }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        sonido("Elemento ");
        //BOTON 3
        this.txt_pantalla.setText(this.txt_pantalla.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        // TODO add your handling code here:
        sonido("Elemento ");
        //BOTON IGUAL
        
        String total;
        num2 = this.txt_pantalla.getText();
        if (!num2.equals("")){
            total = operacion (num1,num2,signo);
            this.txt_pantalla.setText(total);
            
            reinicio = false;

        }

    }//GEN-LAST:event_btnIgualActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        //BOTON 1
        sonido("Elemento ");
        this.txt_pantalla.setText(this.txt_pantalla.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        sonido("Elemento ");
        //BOTON 2
        this.txt_pantalla.setText(this.txt_pantalla.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        sonido("Elemento ");
        //BOTON 0

        this.txt_pantalla.setText(this.txt_pantalla.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        sonido("Elemento ");
        //BOTON 4
        this.txt_pantalla.setText(this.txt_pantalla.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        sonido("Elemento ");
        //BOTON 5
        this.txt_pantalla.setText(this.txt_pantalla.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        sonido("Elemento ");
        //BOTON 6
        this.txt_pantalla.setText(this.txt_pantalla.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        sonido("Elemento ");
        //BOTON 8
        this.txt_pantalla.setText(this.txt_pantalla.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        sonido("Elemento ");
        //BOTON 7
        this.txt_pantalla.setText(this.txt_pantalla.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        sonido("Elemento ");
        //BOTON 9
        this.txt_pantalla.setText(this.txt_pantalla.getText()+"9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void mitemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemNuevoActionPerformed
        // TODO add your handling code here:
        //ItemNuevo
        sonido("Elemento ");
        reinicio = true;
        this.txt_pantalla.setText("");
        
        
    }//GEN-LAST:event_mitemNuevoActionPerformed

    private void mitemHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemHistorialActionPerformed
        // TODO add your handling code here:
        //histotial
        frmBitacora bit = new frmBitacora();
        bit.setVisible(true);
        bit.setLocationRelativeTo(null);
        bit.setTitle("Bitacora");
        
        
    }//GEN-LAST:event_mitemHistorialActionPerformed

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1MouseClicked

    private void mmenuOpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmenuOpcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmenuOpcActionPerformed

    private void btn1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1KeyPressed
        // TODO add your handling code here:
        //btn1
        char car = evt.getKeyChar();
        System.out.println(car);
    }//GEN-LAST:event_btn1KeyPressed

    private void menuayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuayudaActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_menuayudaActionPerformed

    private void menuayudaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuayudaMenuSelected
        // TODO add your handling code here:
        //////
        
        
    }//GEN-LAST:event_menuayudaMenuSelected

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI("https://drive.google.com/file/d/1lqHgVFmMyyDCre9RHmW4Yolei2uLJmxJ/view?usp=sharing");
                    desktop.browse(uri);
                }catch(URISyntaxException | IOException ex){
                
                }
            }
       
       
       }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    public String operacion (String num1, String num2, String signo){
        Double resultadocalc= 0.0;
        String respuesta = "";
        
        
        //CALCULO DE LAS OPERACIONES SUMAR, RESTAR, MULTIPLICAR, DIVIDIR
        
        
        if (signo.equals("+")){
        resultadocalc = Double.parseDouble(num1)+Double.parseDouble(num2);
        //respuesta = resultadocalc.toString();
        // se utiliza la funcion conversion para valuar los decimales 
        respuesta = conversion(resultadocalc);
        fichero (num1,"+",num2,respuesta);
        }else if(signo.equals("-")){
        resultadocalc = Double.parseDouble(num1)-Double.parseDouble(num2);
        respuesta = conversion(resultadocalc);
        fichero (num1,"-",num2,respuesta);
       // respuesta = resultadocalc.toString();
        }else if (signo.equals("*")){
        resultadocalc = Double.parseDouble(num1)*Double.parseDouble(num2);
        respuesta = conversion(resultadocalc);
        fichero (num1,"*",num2,respuesta);
       // respuesta = resultadocalc.toString();
        }else if (signo.equals("/")){
         
            if (num2.equals("0")){
              respuesta = "No se divide entre 0 ";
              fichero (num1,"/",num2,respuesta);
            }else {
                resultadocalc = Double.parseDouble(num1)/Double.parseDouble(num2);
                respuesta = conversion(resultadocalc);
                fichero (num1,"/",num2,respuesta);
                //respuesta = resultadocalc.toString();
            }
        }
        return respuesta;
    }
    
    public String conversion (Double resultadocalc){
          //////VALUANDO EL RESULTADO////
        String retorno;
            //conversion de double a string 
            retorno = Double.toString(resultadocalc);
            
             if(resultadocalc%1==0){
            
            //retorno va ser igual al mismo retorno convertido en string, pero recortado
            retorno = retorno.substring(0,retorno.length()-2);
        }
            
       return retorno;
    }
    
    
    public void fichero (String num1,String signo, String num2, String total){
    
        
        //reprganizar pasar el if abajo u try cartch primero 
        //crear el txtx primero 
        //meter dentro del if el llenado del txt
        //dentro del true meter nuevo
        //dentro del false solo operaciones 
        
        String datos = "";
        if  (reinicio){
        datos = "Nuevo\n"+ num1 +" "+ signo +" "+ num2 +" = "+ total+"\n";
       // reinicio = false;
        }else{
        datos = num1 +" "+ signo +" "+ num2 +" = "+ total+"\n";
        }
      
        //CREANDO FICHERO
        try{
            FileWriter fw;
            PrintWriter pw;
            
            fw = new FileWriter("Datos.txt",true);
            //pasando datos al txt
            pw = new PrintWriter (fw);
            
            while(encendido == true){
                pw.print(datos);
            }
            pw.print(datos);
            pw.close();

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "operaciones no grabadas");
        
        }
        
    }
    
  
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiartodo;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu menuayuda;
    private javax.swing.JMenuItem mitemHistorial;
    private javax.swing.JMenuItem mitemNuevo;
    private javax.swing.JMenu mmenuOpc;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txt_pantalla;
    // End of variables declaration//GEN-END:variables
}
