
package insurance;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class employment extends javax.swing.JFrame {

   boolean click;
     boolean m1,m2,m3,m4,m5,m6,m7,ismale,isfemale,issingle,ismarried,month,year,day,d1,d2,d3,d11,d22,d33,month1,day1,year1;
    public employment() {
        click=true;   d1=d2=d3=d11=d22=d33=true;
        m1=m2=m3=month=day=year=month1=day1=year1=false;
        m1=m2=m3=m4=m5=m6=m7=ismale=isfemale=issingle=ismarried=false;
        initComponents();
    redp.setVisible(false);
        this.background.setSize(this.getWidth(), this.getHeight());
        this.jPanel1.setBackground(new Color(0,0,0,100));
        this.s1.setBackground(new Color(255,255,255,100));
        this.s2.setBackground(new Color(255,255,255,100));
        this.s5.setBackground(new Color(255,255,255,100));
        this.s4.setBackground(new Color(255,255,255,100));
        this.l1.setBackground(new Color(0,0,0,100));
        this.l2.setBackground(new Color(0,0,0,100));
        this.l3.setBackground(new Color(0,0,0,100));
        this.l11.setBackground(new Color(0,0,0,100));
        this.l4.setBackground(new Color(0,0,0,100));
        this.l5.setBackground(new Color(0,0,0,100));
        this.l6.setBackground(new Color(0,0,0,100));
        this.l7.setBackground(new Color(0,0,0,100));
        this.b1.setBackground(new Color(0,0,0,100));
        this.b2.setBackground(new Color(0,0,0,100));
        this.b3.setBackground(new Color(0,0,0,100));
        this.l10.setBackground(new Color(0,0,0,100));
        this.s6.setBackground(new Color(255,255,255,100));
        this.s3.setBackground(new Color(255,255,255,100));
        this.s7.setBackground(new Color(255,255,255,100));
        this.s8.setBackground(new Color(255,255,255,100));
        this.s10.setBackground(new Color(255,255,255,100));
        this.l8.setBackground(new Color(0,0,0,100));
        this.l12.setBackground(new Color(0,0,0,100));
        this.s9.setBackground(new Color(255,255,255,100));
        this.l13.setBackground(new Color(0,0,0,100));
        this.s11.setBackground(new Color(255,255,255,100));
        this.pp.setBackground(new Color(255,255,255,100));
        this.l44.setBackground(new Color(0,0,0,100));
   
        this.t1e1.setVisible(false);
        this.t2e1.setVisible(false);
        this.t3e1.setVisible(false);
        this.t4e1.setVisible(false);
        this.t6e.setVisible(false);
        this.t1e2.setVisible(false);
        this.t2e2.setVisible(false);
        this.t3e2.setVisible(false);
        this.t4e2.setVisible(false);
        this.t4e1.setVisible(false);
        this.t5e1.setVisible(false);
        this.t5e2.setVisible(false);
        this.t1.setCaretColor(Color.WHITE);
        this.t2.setCaretColor(Color.WHITE);
        this.t3.setCaretColor(Color.WHITE);
        this.t4.setCaretColor(Color.WHITE);
        this.t5.setCaretColor(Color.WHITE);
        this.t6.setCaretColor(Color.WHITE);
        this.t51.setCaretColor(Color.WHITE);
        this.t5222.setCaretColor(Color.WHITE);
        this.t53.setCaretColor(Color.WHITE);
        this.t511.setCaretColor(Color.WHITE);
        this.t522.setCaretColor(Color.WHITE);
        this.t533.setCaretColor(Color.WHITE);
          setLocation(300, 10);
        
      
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t4e1 = new javax.swing.JLabel();
        l4 = new javax.swing.JPanel();
        t5e1 = new javax.swing.JLabel();
        t4e2 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t5e2 = new javax.swing.JLabel();
        t1e1 = new javax.swing.JLabel();
        t6e = new javax.swing.JLabel();
        t2e1 = new javax.swing.JLabel();
        t3e1 = new javax.swing.JLabel();
        s3 = new javax.swing.JPanel();
        t5 = new javax.swing.JTextField();
        l8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        t1e2 = new javax.swing.JLabel();
        t3e2 = new javax.swing.JLabel();
        t2e2 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        s6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        linemale = new javax.swing.JPanel();
        lightmale = new javax.swing.JPanel();
        l44 = new javax.swing.JPanel();
        Female = new javax.swing.JPanel();
        femalesmall = new javax.swing.JLabel();
        linefemale = new javax.swing.JPanel();
        Lightfemale = new javax.swing.JPanel();
        s8 = new javax.swing.JPanel();
        singlebig = new javax.swing.JPanel();
        single = new javax.swing.JLabel();
        linesingle = new javax.swing.JPanel();
        lightmale1 = new javax.swing.JPanel();
        s10 = new javax.swing.JPanel();
        marriedbig = new javax.swing.JPanel();
        married = new javax.swing.JLabel();
        marriedline = new javax.swing.JPanel();
        Lightfemale1 = new javax.swing.JPanel();
        l6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        l12 = new javax.swing.JPanel();
        l10 = new javax.swing.JPanel();
        l5 = new javax.swing.JPanel();
        s7 = new javax.swing.JPanel();
        l1 = new javax.swing.JPanel();
        l7 = new javax.swing.JPanel();
        l3 = new javax.swing.JPanel();
        l2 = new javax.swing.JPanel();
        s1 = new javax.swing.JPanel();
        s5 = new javax.swing.JPanel();
        s2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        s4 = new javax.swing.JPanel();
        b1 = new javax.swing.JPanel();
        pp = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        b3 = new javax.swing.JPanel();
        b2 = new javax.swing.JPanel();
        pp3 = new javax.swing.JPanel();
        pp4 = new javax.swing.JPanel();
        pp1 = new javax.swing.JPanel();
        pp2 = new javax.swing.JPanel();
        redp = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        blue = new javax.swing.JPanel();
        pi = new javax.swing.JLabel();
        l11 = new javax.swing.JPanel();
        s9 = new javax.swing.JPanel();
        t51 = new javax.swing.JTextField();
        t522 = new javax.swing.JTextField();
        t53 = new javax.swing.JTextField();
        dayline = new javax.swing.JPanel();
        monthline = new javax.swing.JPanel();
        yearline = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        l13 = new javax.swing.JPanel();
        s11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        t511 = new javax.swing.JTextField();
        t5222 = new javax.swing.JTextField();
        t533 = new javax.swing.JTextField();
        dayline1 = new javax.swing.JPanel();
        monthline1 = new javax.swing.JPanel();
        yearline1 = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t4e1.setForeground(new java.awt.Color(204, 255, 255));
        t4e1.setText("   Ssn is requred");
        getContentPane().add(t4e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 110, -1));

        javax.swing.GroupLayout l4Layout = new javax.swing.GroupLayout(l4);
        l4.setLayout(l4Layout);
        l4Layout.setHorizontalGroup(
            l4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        l4Layout.setVerticalGroup(
            l4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );

        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 10, 790));

        t5e1.setForeground(new java.awt.Color(204, 255, 255));
        t5e1.setText("Phone is requred");
        getContentPane().add(t5e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 120, -1));

        t4e2.setForeground(new java.awt.Color(204, 255, 255));
        t4e2.setText("Ssn is 9 numbers");
        getContentPane().add(t4e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 110, 20));

        t4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(204, 204, 204));
        t4.setText("Ssn");
        t4.setBorder(null);
        t4.setOpaque(false);
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t4MouseExited(evt);
            }
        });
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t4KeyPressed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 312, 70));

        t5e2.setForeground(new java.awt.Color(204, 255, 255));
        t5e2.setText("Phone is 10 numbers");
        getContentPane().add(t5e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 130, -1));

        t1e1.setBackground(new java.awt.Color(204, 255, 255));
        t1e1.setForeground(new java.awt.Color(204, 255, 255));
        t1e1.setText("First name is requred");
        getContentPane().add(t1e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 150, -1));

        t6e.setForeground(new java.awt.Color(204, 255, 255));
        t6e.setText("Number is reqursd");
        getContentPane().add(t6e, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 120, 20));

        t2e1.setBackground(new java.awt.Color(204, 255, 255));
        t2e1.setForeground(new java.awt.Color(204, 255, 255));
        t2e1.setText("Secand name is requred");
        getContentPane().add(t2e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 150, -1));

        t3e1.setForeground(new java.awt.Color(204, 255, 255));
        t3e1.setText("Last name is requred");
        getContentPane().add(t3e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 130, -1));

        s3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s3Layout = new javax.swing.GroupLayout(s3);
        s3.setLayout(s3Layout);
        s3Layout.setHorizontalGroup(
            s3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s3Layout.setVerticalGroup(
            s3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 70, 70));

        t5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t5.setForeground(new java.awt.Color(204, 204, 204));
        t5.setText("Phone");
        t5.setBorder(null);
        t5.setOpaque(false);
        t5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t5MousePressed(evt);
            }
        });
        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t5KeyPressed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 320, 70));

        javax.swing.GroupLayout l8Layout = new javax.swing.GroupLayout(l8);
        l8.setLayout(l8Layout);
        l8Layout.setHorizontalGroup(
            l8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l8Layout.setVerticalGroup(
            l8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 380, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        t1e2.setForeground(new java.awt.Color(204, 255, 255));
        t1e2.setText("First name just alphabets");
        getContentPane().add(t1e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 160, 10));

        t3e2.setForeground(new java.awt.Color(204, 255, 255));
        t3e2.setText("Last name just alphabets");
        getContentPane().add(t3e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 150, -1));

        t2e2.setForeground(new java.awt.Color(204, 255, 255));
        t2e2.setText("Secand name just alphabets");
        getContentPane().add(t2e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 170, -1));

        t3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(204, 204, 204));
        t3.setText("Last name");
        t3.setBorder(null);
        t3.setOpaque(false);
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t3MouseExited(evt);
            }
        });
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t3KeyPressed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 312, 70));

        t6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t6.setForeground(new java.awt.Color(204, 204, 204));
        t6.setText("Years of expireance");
        t6.setBorder(null);
        t6.setOpaque(false);
        t6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t6MouseExited(evt);
            }
        });
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        t6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t6KeyPressed(evt);
            }
        });
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 320, 70));

        t1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(204, 204, 204));
        t1.setText("First name");
        t1.setBorder(null);
        t1.setOpaque(false);
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t1MouseExited(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 310, 70));

        t2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(204, 204, 204));
        t2.setText("Secand name");
        t2.setBorder(null);
        t2.setOpaque(false);
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t2MouseExited(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 312, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 750, 70, -1));

        s6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s6Layout = new javax.swing.GroupLayout(s6);
        s6.setLayout(s6Layout);
        s6Layout.setHorizontalGroup(
            s6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        s6Layout.setVerticalGroup(
            s6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, -1, 70));

        jPanel7.setBackground(new java.awt.Color(11, 99, 171));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Male");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });

        linemale.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout linemaleLayout = new javax.swing.GroupLayout(linemale);
        linemale.setLayout(linemaleLayout);
        linemaleLayout.setHorizontalGroup(
            linemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        linemaleLayout.setVerticalGroup(
            linemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        lightmale.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout lightmaleLayout = new javax.swing.GroupLayout(lightmale);
        lightmale.setLayout(lightmaleLayout);
        lightmaleLayout.setHorizontalGroup(
            lightmaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        lightmaleLayout.setVerticalGroup(
            lightmaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lightmale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(linemale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lightmale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(linemale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 730, 120, 70));

        javax.swing.GroupLayout l44Layout = new javax.swing.GroupLayout(l44);
        l44.setLayout(l44Layout);
        l44Layout.setHorizontalGroup(
            l44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l44Layout.setVerticalGroup(
            l44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l44, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 800, 380, 10));

        Female.setBackground(new java.awt.Color(11, 99, 171));
        Female.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FemaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FemaleMouseExited(evt);
            }
        });

        femalesmall.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        femalesmall.setForeground(new java.awt.Color(204, 204, 204));
        femalesmall.setText("Female");
        femalesmall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                femalesmallMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                femalesmallMouseEntered(evt);
            }
        });

        linefemale.setBackground(new java.awt.Color(11, 99, 171));
        linefemale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linefemaleMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout linefemaleLayout = new javax.swing.GroupLayout(linefemale);
        linefemale.setLayout(linefemaleLayout);
        linefemaleLayout.setHorizontalGroup(
            linefemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        linefemaleLayout.setVerticalGroup(
            linefemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Lightfemale.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout LightfemaleLayout = new javax.swing.GroupLayout(Lightfemale);
        Lightfemale.setLayout(LightfemaleLayout);
        LightfemaleLayout.setHorizontalGroup(
            LightfemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        LightfemaleLayout.setVerticalGroup(
            LightfemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FemaleLayout = new javax.swing.GroupLayout(Female);
        Female.setLayout(FemaleLayout);
        FemaleLayout.setHorizontalGroup(
            FemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FemaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FemaleLayout.createSequentialGroup()
                        .addComponent(Lightfemale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(femalesmall, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FemaleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(linefemale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        FemaleLayout.setVerticalGroup(
            FemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FemaleLayout.createSequentialGroup()
                .addGroup(FemaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FemaleLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(femalesmall)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FemaleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lightfemale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(linefemale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 730, 110, 70));

        s8.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s8Layout = new javax.swing.GroupLayout(s8);
        s8.setLayout(s8Layout);
        s8Layout.setHorizontalGroup(
            s8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s8Layout.setVerticalGroup(
            s8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(s8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 660, 70, 60));

        singlebig.setBackground(new java.awt.Color(11, 99, 171));
        singlebig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                singlebigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                singlebigMouseExited(evt);
            }
        });

        single.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        single.setForeground(new java.awt.Color(204, 204, 204));
        single.setText("Single");
        single.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                singleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                singleMouseEntered(evt);
            }
        });

        linesingle.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout linesingleLayout = new javax.swing.GroupLayout(linesingle);
        linesingle.setLayout(linesingleLayout);
        linesingleLayout.setHorizontalGroup(
            linesingleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        linesingleLayout.setVerticalGroup(
            linesingleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        lightmale1.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout lightmale1Layout = new javax.swing.GroupLayout(lightmale1);
        lightmale1.setLayout(lightmale1Layout);
        lightmale1Layout.setHorizontalGroup(
            lightmale1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        lightmale1Layout.setVerticalGroup(
            lightmale1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout singlebigLayout = new javax.swing.GroupLayout(singlebig);
        singlebig.setLayout(singlebigLayout);
        singlebigLayout.setHorizontalGroup(
            singlebigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singlebigLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lightmale1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(single, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, singlebigLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(linesingle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        singlebigLayout.setVerticalGroup(
            singlebigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singlebigLayout.createSequentialGroup()
                .addGroup(singlebigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(singlebigLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(single))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, singlebigLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lightmale1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(linesingle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(singlebig, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 810, -1, 70));

        s10.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s10Layout = new javax.swing.GroupLayout(s10);
        s10.setLayout(s10Layout);
        s10Layout.setHorizontalGroup(
            s10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s10Layout.setVerticalGroup(
            s10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 810, 70, 70));

        marriedbig.setBackground(new java.awt.Color(11, 99, 171));
        marriedbig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marriedbigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                marriedbigMouseExited(evt);
            }
        });

        married.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        married.setForeground(new java.awt.Color(204, 204, 204));
        married.setText("Married");
        married.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marriedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marriedMouseEntered(evt);
            }
        });

        marriedline.setBackground(new java.awt.Color(11, 99, 171));
        marriedline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marriedlineMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout marriedlineLayout = new javax.swing.GroupLayout(marriedline);
        marriedline.setLayout(marriedlineLayout);
        marriedlineLayout.setHorizontalGroup(
            marriedlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        marriedlineLayout.setVerticalGroup(
            marriedlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        Lightfemale1.setBackground(new java.awt.Color(11, 99, 171));

        javax.swing.GroupLayout Lightfemale1Layout = new javax.swing.GroupLayout(Lightfemale1);
        Lightfemale1.setLayout(Lightfemale1Layout);
        Lightfemale1Layout.setHorizontalGroup(
            Lightfemale1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        Lightfemale1Layout.setVerticalGroup(
            Lightfemale1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout marriedbigLayout = new javax.swing.GroupLayout(marriedbig);
        marriedbig.setLayout(marriedbigLayout);
        marriedbigLayout.setHorizontalGroup(
            marriedbigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marriedbigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(marriedbigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marriedbigLayout.createSequentialGroup()
                        .addComponent(Lightfemale1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(married, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marriedbigLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(marriedline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        marriedbigLayout.setVerticalGroup(
            marriedbigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marriedbigLayout.createSequentialGroup()
                .addGroup(marriedbigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(marriedbigLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(married)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marriedbigLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lightfemale1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(marriedline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(marriedbig, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 810, 110, 70));

        javax.swing.GroupLayout l6Layout = new javax.swing.GroupLayout(l6);
        l6.setLayout(l6Layout);
        l6Layout.setHorizontalGroup(
            l6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l6Layout.setVerticalGroup(
            l6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 380, 10));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Social");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 810, 60, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Stattus");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 840, 60, 30));

        javax.swing.GroupLayout l12Layout = new javax.swing.GroupLayout(l12);
        l12.setLayout(l12Layout);
        l12Layout.setHorizontalGroup(
            l12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l12Layout.setVerticalGroup(
            l12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 880, 380, 10));

        javax.swing.GroupLayout l10Layout = new javax.swing.GroupLayout(l10);
        l10.setLayout(l10Layout);
        l10Layout.setHorizontalGroup(
            l10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l10Layout.setVerticalGroup(
            l10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 380, 10));

        javax.swing.GroupLayout l5Layout = new javax.swing.GroupLayout(l5);
        l5.setLayout(l5Layout);
        l5Layout.setHorizontalGroup(
            l5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l5Layout.setVerticalGroup(
            l5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 380, 10));

        s7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s7Layout = new javax.swing.GroupLayout(s7);
        s7.setLayout(s7Layout);
        s7Layout.setHorizontalGroup(
            s7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s7Layout.setVerticalGroup(
            s7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, -1, -1));

        javax.swing.GroupLayout l1Layout = new javax.swing.GroupLayout(l1);
        l1.setLayout(l1Layout);
        l1Layout.setHorizontalGroup(
            l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        l1Layout.setVerticalGroup(
            l1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 390, 10));

        javax.swing.GroupLayout l7Layout = new javax.swing.GroupLayout(l7);
        l7.setLayout(l7Layout);
        l7Layout.setHorizontalGroup(
            l7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l7Layout.setVerticalGroup(
            l7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 380, 10));

        javax.swing.GroupLayout l3Layout = new javax.swing.GroupLayout(l3);
        l3.setLayout(l3Layout);
        l3Layout.setHorizontalGroup(
            l3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l3Layout.setVerticalGroup(
            l3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 380, 10));

        javax.swing.GroupLayout l2Layout = new javax.swing.GroupLayout(l2);
        l2.setLayout(l2Layout);
        l2Layout.setHorizontalGroup(
            l2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        l2Layout.setVerticalGroup(
            l2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 10, 780));

        s1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s1Layout = new javax.swing.GroupLayout(s1);
        s1.setLayout(s1Layout);
        s1Layout.setHorizontalGroup(
            s1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s1Layout.setVerticalGroup(
            s1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 70, 70));

        s5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s5Layout = new javax.swing.GroupLayout(s5);
        s5.setLayout(s5Layout);
        s5Layout.setHorizontalGroup(
            s5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s5Layout.setVerticalGroup(
            s5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 70, 70));

        s2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s2Layout = new javax.swing.GroupLayout(s2);
        s2.setLayout(s2Layout);
        s2Layout.setHorizontalGroup(
            s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s2Layout.setVerticalGroup(
            s2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 70, 70));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Employment ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 400, 90));

        s4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s4Layout = new javax.swing.GroupLayout(s4);
        s4.setLayout(s4Layout);
        s4Layout.setHorizontalGroup(
            s4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s4Layout.setVerticalGroup(
            s4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 70, 70));

        javax.swing.GroupLayout b1Layout = new javax.swing.GroupLayout(b1);
        b1.setLayout(b1Layout);
        b1Layout.setHorizontalGroup(
            b1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        b1Layout.setVerticalGroup(
            b1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 890, 140, -1));

        pp.setBackground(new java.awt.Color(204, 204, 204));
        pp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ppMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ppMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ppMouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Save ");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
        });
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel9KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout ppLayout = new javax.swing.GroupLayout(pp);
        pp.setLayout(ppLayout);
        ppLayout.setHorizontalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18))
        );
        ppLayout.setVerticalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        getContentPane().add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 900, 100, -1));

        javax.swing.GroupLayout b3Layout = new javax.swing.GroupLayout(b3);
        b3.setLayout(b3Layout);
        b3Layout.setHorizontalGroup(
            b3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        b3Layout.setVerticalGroup(
            b3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 960, 120, 30));

        javax.swing.GroupLayout b2Layout = new javax.swing.GroupLayout(b2);
        b2.setLayout(b2Layout);
        b2Layout.setHorizontalGroup(
            b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        b2Layout.setVerticalGroup(
            b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 890, 140, -1));

        pp3.setBackground(new java.awt.Color(4, 73, 150));

        javax.swing.GroupLayout pp3Layout = new javax.swing.GroupLayout(pp3);
        pp3.setLayout(pp3Layout);
        pp3Layout.setHorizontalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pp3Layout.setVerticalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(pp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 890, -1, -1));

        pp4.setBackground(new java.awt.Color(4, 73, 150));

        javax.swing.GroupLayout pp4Layout = new javax.swing.GroupLayout(pp4);
        pp4.setLayout(pp4Layout);
        pp4Layout.setHorizontalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pp4Layout.setVerticalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(pp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 890, -1, -1));

        pp1.setBackground(new java.awt.Color(4, 73, 150));

        javax.swing.GroupLayout pp1Layout = new javax.swing.GroupLayout(pp1);
        pp1.setLayout(pp1Layout);
        pp1Layout.setHorizontalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 890, -1, -1));

        pp2.setBackground(new java.awt.Color(4, 73, 150));

        javax.swing.GroupLayout pp2Layout = new javax.swing.GroupLayout(pp2);
        pp2.setLayout(pp2Layout);
        pp2Layout.setHorizontalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pp2Layout.setVerticalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(pp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 950, -1, -1));

        redp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redpMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                redpMouseExited(evt);
            }
        });
        redp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/3.png"))); // NOI18N
        jLabel10.setText("jLabel4");
        redp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 55));

        getContentPane().add(redp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 60, 50));

        blue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/2.png"))); // NOI18N
        pi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                piMouseEntered(evt);
            }
        });
        blue.add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 55));

        getContentPane().add(blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 60, 50));

        javax.swing.GroupLayout l11Layout = new javax.swing.GroupLayout(l11);
        l11.setLayout(l11Layout);
        l11Layout.setHorizontalGroup(
            l11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l11Layout.setVerticalGroup(
            l11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 720, -1, -1));

        s9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s9Layout = new javax.swing.GroupLayout(s9);
        s9.setLayout(s9Layout);
        s9Layout.setHorizontalGroup(
            s9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s9Layout.setVerticalGroup(
            s9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(s9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 730, -1, -1));

        t51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t51.setForeground(new java.awt.Color(204, 204, 204));
        t51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t51.setText("Day");
        t51.setBorder(null);
        t51.setOpaque(false);
        t51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t51MouseExited(evt);
            }
        });
        t51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t51ActionPerformed(evt);
            }
        });
        t51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t51KeyPressed(evt);
            }
        });
        getContentPane().add(t51, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 670, 60, 40));

        t522.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t522.setForeground(new java.awt.Color(204, 204, 204));
        t522.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t522.setText("Month");
        t522.setBorder(null);
        t522.setOpaque(false);
        t522.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t522MouseExited(evt);
            }
        });
        t522.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t522KeyPressed(evt);
            }
        });
        getContentPane().add(t522, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 670, 60, 40));

        t53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t53.setForeground(new java.awt.Color(204, 204, 204));
        t53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t53.setText("Year");
        t53.setBorder(null);
        t53.setOpaque(false);
        t53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t53MouseExited(evt);
            }
        });
        t53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t53KeyPressed(evt);
            }
        });
        getContentPane().add(t53, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 670, 60, 40));

        javax.swing.GroupLayout daylineLayout = new javax.swing.GroupLayout(dayline);
        dayline.setLayout(daylineLayout);
        daylineLayout.setHorizontalGroup(
            daylineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        daylineLayout.setVerticalGroup(
            daylineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(dayline, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 710, -1, 1));

        javax.swing.GroupLayout monthlineLayout = new javax.swing.GroupLayout(monthline);
        monthline.setLayout(monthlineLayout);
        monthlineLayout.setHorizontalGroup(
            monthlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        monthlineLayout.setVerticalGroup(
            monthlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(monthline, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 710, -1, 1));

        javax.swing.GroupLayout yearlineLayout = new javax.swing.GroupLayout(yearline);
        yearline.setLayout(yearlineLayout);
        yearlineLayout.setHorizontalGroup(
            yearlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        yearlineLayout.setVerticalGroup(
            yearlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(yearline, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 710, -1, 1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText(" Birth date");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, 90, 40));

        javax.swing.GroupLayout l13Layout = new javax.swing.GroupLayout(l13);
        l13.setLayout(l13Layout);
        l13Layout.setHorizontalGroup(
            l13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        l13Layout.setVerticalGroup(
            l13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 650, -1, 10));

        s11.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout s11Layout = new javax.swing.GroupLayout(s11);
        s11.setLayout(s11Layout);
        s11Layout.setHorizontalGroup(
            s11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        s11Layout.setVerticalGroup(
            s11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        getContentPane().add(s11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, -1, 64));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Date");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, 90, 40));

        t511.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t511.setForeground(new java.awt.Color(204, 204, 204));
        t511.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t511.setText("Day");
        t511.setBorder(null);
        t511.setOpaque(false);
        t511.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t511MouseExited(evt);
            }
        });
        t511.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t511KeyPressed(evt);
            }
        });
        getContentPane().add(t511, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, 60, 40));

        t5222.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t5222.setForeground(new java.awt.Color(204, 204, 204));
        t5222.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5222.setText("Month");
        t5222.setBorder(null);
        t5222.setOpaque(false);
        t5222.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t5222MouseExited(evt);
            }
        });
        t5222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5222ActionPerformed(evt);
            }
        });
        t5222.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t5222KeyPressed(evt);
            }
        });
        getContentPane().add(t5222, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 600, 60, 40));

        t533.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t533.setForeground(new java.awt.Color(204, 204, 204));
        t533.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t533.setText("Year");
        t533.setBorder(null);
        t533.setOpaque(false);
        t533.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t533MouseExited(evt);
            }
        });
        t533.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t533KeyPressed(evt);
            }
        });
        getContentPane().add(t533, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 600, 60, 40));

        javax.swing.GroupLayout dayline1Layout = new javax.swing.GroupLayout(dayline1);
        dayline1.setLayout(dayline1Layout);
        dayline1Layout.setHorizontalGroup(
            dayline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        dayline1Layout.setVerticalGroup(
            dayline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(dayline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, -1, 1));

        javax.swing.GroupLayout monthline1Layout = new javax.swing.GroupLayout(monthline1);
        monthline1.setLayout(monthline1Layout);
        monthline1Layout.setHorizontalGroup(
            monthline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        monthline1Layout.setVerticalGroup(
            monthline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(monthline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, -1, 1));

        javax.swing.GroupLayout yearline1Layout = new javax.swing.GroupLayout(yearline1);
        yearline1.setLayout(yearline1Layout);
        yearline1Layout.setHorizontalGroup(
            yearline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        yearline1Layout.setVerticalGroup(
            yearline1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(yearline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, -1, 1));

        background.setForeground(new java.awt.Color(204, 204, 204));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/all.jpg"))); // NOI18N
        background.setText("Married");
        background.setPreferredSize(new java.awt.Dimension(1200, 1000));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
      
    }//GEN-LAST:event_t4ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed

    }//GEN-LAST:event_t3ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
    
    }//GEN-LAST:event_t6ActionPerformed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
     if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
         m1=true;t1e1.setVisible(false);
         if(this.t1.getText().equals("First name")) 
        this.t1.setText("");
       }
      else if(evt.getKeyCode()==KeyEvent.VK_DOWN)  {if(this.t1.getText().equals("")&&m1){this.t1.setText("First name");
           this.t1e2.setVisible(false);  this.t1e1.setVisible(false);}
      else if(this.t1.getText().equals("First name")&&m1){this.t1e1.setVisible(false);this.t1e2.setVisible(false);}else{
          if(m1){
          int number=0;
          for(int i=0;i<this.t1.getText().length();i++){
                if (Character.isAlphabetic(this.t1.getText().charAt(i)))number++;}

            if(number==this.t1.getText().length()){
                this.t1e2.setVisible(false);this.t1e1.setVisible(false);}
            else{this.t1e2.setVisible(true);this.t1e1.setVisible(false);}}}
            this.t2.requestFocus(rootPaneCheckingEnabled);}
          else if(evt.getKeyCode()==KeyEvent.VK_UP)  {if(this.t1.getText().equals("")&&m1){this.t1.setText("First name");
           this.t1e2.setVisible(false);  this.t1e1.setVisible(false); } else if(this.t1.getText().equals("First name")&&m2)
           {this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
           else{ if(m1){
              int number=0;
              for(int i=0;i<this.t1.getText().length();i++){
                if (Character.isAlphabetic(this.t1.getText().charAt(i)))number++;}

            if(number==this.t1.getText().length()){
                this.t1e2.setVisible(false);this.t1e1.setVisible(false);}
            else{this.t1e2.setVisible(true);this.t1e1.setVisible(false);}}}
          this.t6.requestFocus(rootPaneCheckingEnabled);}
      else{
        this.t2.requestFocus(rootPaneCheckingEnabled);
        if(this.t1.getText().equals("")&&m1)this.t1.setText("First name");
        else if(this.t1.getText().equals("First name")&&m1)
        {this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
        else{
            if(m1){
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++){
                if (Character.isAlphabetic(this.t1.getText().charAt(i)))number++;}

            if(number==this.t1.getText().length()){
                this.t1e2.setVisible(false);this.t1e1.setVisible(false);}
            else{this.t1e2.setVisible(true);this.t1e1.setVisible(false);}}}
       
    }
    }//GEN-LAST:event_t1KeyPressed

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
                  if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
                      m2=true;this.t2e1.setVisible(false);
          if(this.t2.getText().equals("Secand name")) 
        this.t2.setText("");
       }
                  
        else if(evt.getKeyCode()==KeyEvent.VK_DOWN)  {if(this.t2.getText().equals("")&&m2)
        {this.t2.setText("Secand name");
           this.t2e2.setVisible(false);  this.t2e1.setVisible(false);}
        else if(this.t2.getText().equals("Secand name")&&m2)
           {this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
        else{
            if(m2){
          int number=0;
          for(int i=0;i<this.t2.getText().length();i++){
                if (Character.isAlphabetic(this.t2.getText().charAt(i)))number++;}

            if(number==this.t2.getText().length()){
                this.t2e2.setVisible(false);this.t2e1.setVisible(false);}
            else{this.t2e2.setVisible(true);this.t2e1.setVisible(false);}}}
            this.t3.requestFocus(rootPaneCheckingEnabled);}
          else if(evt.getKeyCode()==KeyEvent.VK_UP)  {if(this.t2.getText().equals("")&&m2)
          {this.t2.setText("Secand name");
           this.t2e2.setVisible(false);  this.t2e1.setVisible(false); }
          else if(this.t2.getText().equals("Secand name")&&m2)
           {this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
          else{ 
              if(m2){
              int number=0;
              for(int i=0;i<this.t2.getText().length();i++){
                if (Character.isAlphabetic(this.t2.getText().charAt(i)))number++;}

            if(number==this.t2.getText().length()){
                this.t2e2.setVisible(false);this.t1e1.setVisible(false);}
            else{this.t2e2.setVisible(true);this.t1e1.setVisible(false);}}}
          this.t1.requestFocus(rootPaneCheckingEnabled);}
      else{
        this.t3.requestFocus(rootPaneCheckingEnabled);
        if(this.t2.getText().equals("")&&m2)this.t2.setText("Secand name");
           else if(this.t2.getText().equals("Secand name")&&m2)
           {this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
        else{
               if(m2){
            int number=0;
            for(int i=0;i<this.t2.getText().length();i++){
                if (Character.isAlphabetic(this.t2.getText().charAt(i)))number++;}

            if(number==this.t2.getText().length()){
                this.t2e2.setVisible(false);this.t2e1.setVisible(false);}
            else if(this.t2.getText().equals("Secand name")){this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
            else{this.t2e2.setVisible(true);this.t2e1.setVisible(false);}}}
        
    }
    }//GEN-LAST:event_t2KeyPressed

    private void t3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyPressed
                 if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
                     m3=true;this.t3e1.setVisible(false);
          if(this.t3.getText().equals("Last name")) 
        this.t3.setText("");
       }
        else if(evt.getKeyCode()==KeyEvent.VK_DOWN)  {if(this.t3.getText().equals("")&&m3){this.t3.setText("Last name");
           this.t3e2.setVisible(false);  this.t3e1.setVisible(false);}else if(this.t3.getText().equals("Last name")&&m3)
           {this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
           else{
               if(m3){
          int number=0;
          for(int i=0;i<this.t3.getText().length();i++){
                if (Character.isAlphabetic(this.t3.getText().charAt(i)))number++;}

            if(number==this.t3.getText().length()){
                this.t3e2.setVisible(false);this.t3e1.setVisible(false);}
            else{this.t3e2.setVisible(true);this.t3e1.setVisible(false);}}}
            this.t4.requestFocus(rootPaneCheckingEnabled);}
          else if(evt.getKeyCode()==KeyEvent.VK_UP)  {if(this.t3.getText().equals("")&&m3)
          {this.t3.setText("Last name");
           this.t3e2.setVisible(false);  this.t3e1.setVisible(false); }
          else if(this.t3.getText().equals("Last name")&&m3)
          {this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
          else{ 
              if(m3){
              int number=0;
              for(int i=0;i<this.t3.getText().length();i++){
                if (Character.isAlphabetic(this.t3.getText().charAt(i)))number++;}

            if(number==this.t3.getText().length()){
                this.t3e2.setVisible(false);this.t3e1.setVisible(false);}
            else{this.t3e2.setVisible(true);this.t3e1.setVisible(false);}}} 
          this.t2.requestFocus(rootPaneCheckingEnabled);}
      else{
        this.t4.requestFocus(rootPaneCheckingEnabled);
        if(this.t3.getText().equals("")&&m3)
        {this.t3.setText("Last name");this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
        else if(this.t3.getText().equals("Last name")&&m3)
          {this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
        else{
            if(m3){
            int number=0;
            for(int i=0;i<this.t3.getText().length();i++){
                if (Character.isAlphabetic(this.t3.getText().charAt(i)))number++;}

            if(number==this.t3.getText().length()){
                this.t3e2.setVisible(false);this.t3e1.setVisible(false);}
            else if(this.t3.getText().equals("Last name")){this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
            else{this.t3e2.setVisible(true);this.t3e1.setVisible(false);}}}
       
    }
    }//GEN-LAST:event_t3KeyPressed

    private void t4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyPressed
         if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
            
               m4=true;
              
               this.t4e1.setVisible(false);
                int number=0;int length=0;
        
           if(this.t4.getText().equals("Ssn")) 
        this.t4.setText("");
            
              for(int i=0;i<this.t4.getText().length();i++){length++;
        if (Character.isDigit(this.t4.getText().charAt(i)))number++;}
        if(number==this.t4.getText().length()&&length==8){
                  this.t4e2.setVisible(false);}
       

       }
           else if(evt.getKeyCode()==KeyEvent.VK_UP)  {
                  this.t3.requestFocus(rootPaneCheckingEnabled);
               if(this.t4.getText().equals("")&&m4){
               this.t4.setText("Ssn");this.t4e1.setVisible(false);this.t4e2.setVisible(false);}
               else if(this.t4.getText().equals("Ssn")&&m4)
               {this.t4e2.setVisible(false);this.t4e1.setVisible(false);}
               else{ 
                   if(m4){
                int number=0;int length=0;
        
        
            
              for(int i=0;i<this.t4.getText().length();i++){length++;
        if (Character.isDigit(this.t4.getText().charAt(i)))number++;}
        if(number==this.t4.getText().length()&&length==9){
           
             this.t4e2.setVisible(false);}else{
          this.t4e2.setVisible(true);} 
     
 
           
           }}}
              else if(evt.getKeyCode()==KeyEvent.VK_DOWN)  {
                         this.t5.requestFocus(rootPaneCheckingEnabled);
                  if(this.t4.getText().equals("")&&m4){
               this.t4.setText("Ssn");this.t4e1.setVisible(false);this.t4e2.setVisible(false);}
                  else if(this.t4.getText().equals("Ssn")&&m4)
               {this.t4e2.setVisible(false);this.t4e1.setVisible(false);}
               else{ 
                      if(m4){
                int number=0;int length=0;
        
        
            
              for(int i=0;i<this.t4.getText().length();i++){length++;
        if (Character.isDigit(this.t4.getText().charAt(i)))number++;}
        if(number==this.t4.getText().length()&&length==9){
           
             this.t4e2.setVisible(false);this.t4e1.setVisible(false); }else{
            this.t4e2.setVisible(true);} 
 
 
           
           }} }
       else{
                   this.t5.requestFocus(rootPaneCheckingEnabled);
                     if(this.t4.getText().equals("")&&m4){
               this.t4.setText("Ssn");this.t4e1.setVisible(false);this.t4e2.setVisible(false);}
                  else if(this.t4.getText().equals("Ssn")&&m4)
               {this.t4e2.setVisible(false);this.t4e1.setVisible(false);}
                  else{
                      if(m4){
                     int number=0;int length=0;
        
              for(int i=0;i<this.t4.getText().length();i++){length++;
        if (Character.isDigit(this.t4.getText().charAt(i)))number++;}
        if(number==this.t4.getText().length()&&length==9){
                  this.t4e2.setVisible(false);}
        else{t4e2.setVisible(true);}
       
        if(this.t4.getText().equals("")){this.t4.setText("Ssn");this.t4e2.setVisible(false);this.t4e1.setVisible(false);}
                  }}
       }
    }//GEN-LAST:event_t4KeyPressed

    private void t5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyPressed
           if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
            
               m5=true;
              
               this.t5e1.setVisible(false);
                int number=0;int length=0;
           if(this.t5.getText().equals("Phone")) 
        this.t5.setText("");
        
              if(evt.getKeyCode()==8){   
             for(int i=0;i<this.t5.getText().length();i++){length++;
        if (Character.isDigit(this.t5.getText().charAt(i)))number++;}
         if((number==this.t5.getText().length()&&length==11)){
                  this.t5e2.setVisible(false);}}
         
              for(int i=0;i<this.t5.getText().length();i++){length++;
        if (Character.isDigit(this.t5.getText().charAt(i)))number++;}
         if(number==this.t5.getText().length()&&length==9){
                  this.t5e2.setVisible(false);}
             
       }
           else if(evt.getKeyCode()==KeyEvent.VK_UP)  {
               this.t4.requestFocus(rootPaneCheckingEnabled);
               if(this.t5.getText().equals("")&&m5){
               this.t5.setText("Phone");this.t5e1.setVisible(false);this.t5e2.setVisible(false);}
               else if(this.t5.getText().equals("Phone")&&m5){this.t5e2.setVisible(false);}
               else{ 
                   if(m5){
                int number=0;int length=0;
        
        
            
              for(int i=0;i<this.t5.getText().length();i++){length++;
        if (Character.isDigit(this.t5.getText().charAt(i)))number++;}
        if(number==this.t5.getText().length()&&length==10){
           
             this.t5e2.setVisible(false);} else{this.t5e2.setVisible(true);} }}}
           else if(evt.getKeyCode()==KeyEvent.VK_DOWN)  {
               this.t6.requestFocus(rootPaneCheckingEnabled);
               if(this.t5.getText().equals("")&&m5){this.t5.setText("Phone");
             this.t5e2.setVisible(false);this.t5e1.setVisible(false);}
             else if(this.t5.getText().equals("Phone")&&m5){this.t5e2.setVisible(false);}
             else{ 
                 if(m5){
                int number=0;int length=0;
        
        
            
              for(int i=0;i<this.t5.getText().length();i++){length++;
        if (Character.isDigit(this.t5.getText().charAt(i)))number++;}
        if(number==this.t5.getText().length()&&length==10){
           
             this.t5e2.setVisible(false);} else{this.t5e2.setVisible(true);} }  }}
       else{
               this.t6.requestFocus(rootPaneCheckingEnabled);
                    this.t6.requestFocus(rootPaneCheckingEnabled);
               if(this.t5.getText().equals("")&&m5){this.t5.setText("Phone");
             this.t5e2.setVisible(false);this.t5e1.setVisible(false);}
             else if(this.t5.getText().equals("Phone")&&m5){this.t5e2.setVisible(false);}   
             else{
                 if(m5){
               int number=0;int length=0;
        
              for(int i=0;i<this.t5.getText().length();i++){length++;
        if (Character.isDigit(this.t5.getText().charAt(i)))number++;}
        if(number==this.t5.getText().length()&&length==10){
                  this.t5e2.setVisible(false);}
        else{t5e2.setVisible(true);}
        
        if(this.t5.getText().equals("")){this.t5.setText("Phone");this.t5e2.setVisible(false);this.t5e1.setVisible(false);}
             }
       }}
    }//GEN-LAST:event_t5KeyPressed

    private void t6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t6KeyPressed
                 if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
             m6=true;this.t6e.setVisible(false);
            if(this.t6.getText().equals("Years of expireance"))
            this.t6.setText("");
        }
            else if(evt.getKeyCode()==KeyEvent.VK_UP){
                  this.t5.requestFocus(rootPaneCheckingEnabled);
                if(this.t6.getText().equals("")&&m6)
                {this.t6.setText("Years of expireance");this.t6e.setVisible(false);this.t6e.setVisible(false);}
                else if(this.t6.getText().equals("Years of expireance")&&m6)this.t6e.setVisible(false);
             else{
                    if(m6){
                 int number=0;
                 for(int i=0;i<this.t6.getText().length();i++)
                     if(Character.isDigit(this.t6.getText().charAt(i)))number++;
                 if(number==this.t6.getText().length()){this.t6e.setVisible(false);}else this.t6e.setVisible(true);
             }}}
             else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
             this.t511.requestFocus(rootPaneCheckingEnabled);
                if(this.t6.getText().equals("")&&m6)
                {this.t6.setText("Years of expireance");this.t6e.setVisible(false);this.t6e.setVisible(false);}
                else if(this.t6.getText().equals("Years of expireance")&&m6)this.t6e.setVisible(false);
              else{
                    if(m6){
                  int number=0;
                 for(int i=0;i<this.t6.getText().length();i++)
                     if(Character.isDigit(this.t6.getText().charAt(i)))number++;
                 if(number==this.t6.getText().length()){this.t6e.setVisible(false);}else this.t6e.setVisible(true);}}}
          else{
                  this.t511.requestFocus(rootPaneCheckingEnabled);
                  if(this.t6.getText().equals("")&&m6){this.t6.setText("Years of expireance");this.t6e.setVisible(false);this.t6e.setVisible(false);}
                  else if(this.t6.getText().equals("Years of expireance")&&m6){this.t6e.setVisible(false);this.t6e.setVisible(false);}
                  else{
                      if(m6){
                  int number=0;
                 for(int i=0;i<this.t6.getText().length();i++)
                     if(Character.isDigit(this.t6.getText().charAt(i)))number++;
                 if(number==this.t6.getText().length()){this.t6e.setVisible(false);}else this.t6e.setVisible(true);
             }
                  }
             
             }

    }//GEN-LAST:event_t6KeyPressed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
     
    }//GEN-LAST:event_t1ActionPerformed

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        if(ismale|| isfemale||click){
        this.linemale.setBackground(new Color(1,58,137));
    }//GEN-LAST:event_jPanel7MouseEntered
    }
    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
 if(ismale|| isfemale||click){
        this.linemale.setBackground(new Color(11,99,171));
 }
    }//GEN-LAST:event_jPanel7MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered

        if(ismale|| isfemale||click){
        this.linemale.setBackground(new Color(1,58,137));
    }//GEN-LAST:event_jLabel4MouseEntered
    }
    private void femalesmallMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femalesmallMouseEntered

        if(ismale|| isfemale||click){
        this.linefemale.setBackground(new Color(1,58,137));
}
    }//GEN-LAST:event_femalesmallMouseEntered

    private void linefemaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linefemaleMouseEntered
 
    }//GEN-LAST:event_linefemaleMouseEntered

    private void femalesmallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femalesmallMouseClicked

        isfemale=true; ismale=false;
        this.Lightfemale.setBackground(new Color(255,255,255));
       this.lightmale.setBackground(new Color(11,99,171));
      this.linefemale.setBackground(new Color(11,99,171));
         this.linemale.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_femalesmallMouseClicked

    private void FemaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FemaleMouseEntered
if(ismale|| isfemale||click){
        this.linefemale.setBackground(new Color(1,58,137));
}
    }//GEN-LAST:event_FemaleMouseEntered

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        ismale=true; isfemale=false;
        this.Lightfemale.setBackground(new Color(11,99,171));
       this.lightmale.setBackground(new Color(255,255,255));
       this.linefemale.setBackground(new Color(11,99,171));
         this.linemale.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_jLabel4MouseClicked

    private void FemaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FemaleMouseExited
 if(ismale|| isfemale||click){
        this.linefemale.setBackground(new Color(11,99,171));
 }
    }//GEN-LAST:event_FemaleMouseExited

    private void singleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singleMouseClicked

        isfemale=true; ismarried=false;
        this.Lightfemale1.setBackground(new Color(11,99,171));
       this.lightmale1.setBackground(new Color(255,255,255));
       this.marriedline.setBackground(new Color(11,99,171));
         this.linesingle.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_singleMouseClicked

    private void singleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singleMouseEntered
if(issingle|| ismarried||click){
        this.linesingle.setBackground(new Color(1,58,137));
}
    }//GEN-LAST:event_singleMouseEntered

    private void singlebigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singlebigMouseEntered
if(issingle|| ismarried||click){
        this.linesingle.setBackground(new Color(1,58,137));
}
    }//GEN-LAST:event_singlebigMouseEntered

    private void singlebigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singlebigMouseExited
 if(issingle|| ismarried||click){
        this.linesingle.setBackground(new Color(11,99,171));
 }
    }//GEN-LAST:event_singlebigMouseExited

    private void marriedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marriedMouseClicked
ismarried=true; issingle=false;
        this.Lightfemale1.setBackground(new Color(255,255,255));
       this.lightmale1.setBackground(new Color(11,99,171));
          this.marriedline.setBackground(new Color(11,99,171));
         this.linesingle.setBackground(new Color(11,99,171));
    }//GEN-LAST:event_marriedMouseClicked

    private void marriedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marriedMouseEntered
if(issingle|| ismarried||click){
        this.marriedline.setBackground(new Color(1,58,137));
}
    }//GEN-LAST:event_marriedMouseEntered

    private void marriedlineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marriedlineMouseEntered
       
    }//GEN-LAST:event_marriedlineMouseEntered

    private void marriedbigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marriedbigMouseEntered
if(issingle|| ismarried||click){
        this.marriedline.setBackground(new Color(1,58,137));
}
    }//GEN-LAST:event_marriedbigMouseEntered

    private void marriedbigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marriedbigMouseExited
 if(issingle|| ismarried||click){
        this.marriedline.setBackground(new Color(11,99,171));
 }
    }//GEN-LAST:event_marriedbigMouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       m1=m2=m3=m4=m5=m6=click=false;
        
    
        boolean b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
        if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;this.t1e2.setVisible(false);}
        else if(this.t1.getText().equals("First name"))
        {this.t1e1.setVisible(true);this .t1e2.setVisible(false);this.t1.setText("");b1=false;}
        else {
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++){
                if (Character.isAlphabetic(this.t1.getText().charAt(i)))number++;}

            if(number==this.t1.getText().length()){
                this.t1e2.setVisible(false);b1=true;this.t1e1.setVisible(false);}
            else{this.t1e2.setVisible(true);b1=false;this.t1e1.setVisible(false);}}

        if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;this.t2e2.setVisible(false);}
        else if(this.t2.getText().equals("Secand name"))
        {this.t2e1.setVisible(true);this.t2.setText("");b2=false;this.t2e2.setVisible(false);}

        else {
            int number=0;
            for(int i=0;i<this.t2.getText().length();i++){
                if (Character.isAlphabetic(this.t2.getText().charAt(i)))number++;}
            if(number==this.t2.getText().length()){
                this.t2e1.setVisible(false);b2=true;t2e2.setVisible(false);}
            else{this.t2e2.setVisible(true);b2=false;this.t2e1.setVisible(false);}}

        if(this.t3.getText().equals(""))
        {this.t3e1.setVisible(true);b3=false;this.t3e2.setVisible(false);}
        else if(this.t3.getText().equals("Last name"))
        {this.t3e1.setVisible(true);this.t3.setText("");b3=false;this.t3e2.setVisible(false);}
           else {
            int number=0;
            for(int i=0;i<this.t3.getText().length();i++){
                if (Character.isAlphabetic(this.t3.getText().charAt(i)))number++;}
            if(number==this.t3.getText().length()){
                this.t3e1.setVisible(false);b3=true;t3e2.setVisible(false);}
            else{this.t3e2.setVisible(true);b3=false;this.t3e1.setVisible(false);}}
     
        if(this.t4.getText().equals("")){this.t4e1.setVisible(true);b4=false;this.t4e2.setVisible(false);}
        else if(this.t4.getText().equals("Ssn"))
        {this.t4e1.setVisible(true);this.t4.setText("");b4=false;t4e2.setVisible(false);}
        else {
            int number=0;int length=0;
            for(int i=0;i<this.t4.getText().length();i++){length++;
            if (Character.isDigit(this.t4.getText().charAt(i)))number++;}
            if(number==this.t4.getText().length()&&length==9){
                this.t4e1.setVisible(false);b4=true;this.t4e2.setVisible(false);}
            else {b4=false; this.t4e2.setVisible(true);this.t4e1.setVisible(false);}}
       
        if(this.t5.getText().equals(""))
        {this.t5e1.setVisible(true);b5=false;this.t5e2.setVisible(false);}
        else if(this.t5.getText().equals("Phone"))
        {this.t5e1.setVisible(true);this.t5.setText("");b5=false;this.t5e2.setVisible(false);}

        else {
            int number=0;int length=0;
            for(int i=0;i<this.t5.getText().length();i++){length++;
            if (Character.isDigit(this.t5.getText().charAt(i)))number++;}
            if(number==this.t5.getText().length()&&length==10){
                this.t5e1.setVisible(false);b5=true;this.t5e2.setVisible(false);}
            else { this.t5e2.setVisible(true);b5=false;this.t5e1.setVisible(false);}}

        if(this.t6.getText().equals("")){this.t6e.setVisible(true);b6=false;}
        else if(this.t6.getText().equals("Years of expireance")){this.t6e.setVisible(true);this.t6.setText("");b6=false;}
        else {
            int number=0;
            for(int i=0;i<this.t6.getText().length();i++)
            if (Character.isDigit(this.t6.getText().charAt(i)))number++;
            if(number==this.t6.getText().length()){ this.t6e.setVisible(false);b6=true;}
            else{   this.t6e.setVisible(true);b6=false;}}
  if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);b9=false;d1=false;}
               else if(this.t51.getText().equals("Day")){this.dayline.setBackground(Color.RED);b9=false;d1=false;}
               else{        int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<=31){
                   this.dayline.setBackground(new Color(204,204,204));b9=true;d1=true;}
                   else{this.dayline.setBackground(Color.RED);b9=false;d1=false;}
                       } else{this.dayline.setBackground(Color.RED);b9=false;d1=false;}
               }
        if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);b10=false;d2=false;}
               else if(this.t522.getText().equals("Month")){this.monthline.setBackground(Color.RED);b10=false;d2=false;}
               else{        int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                   this.monthline.setBackground(new Color(204,204,204));b10=true;d2=true;}
                   else{this.monthline.setBackground(Color.RED);b10=false;d2=false;}
                       } else{this.monthline.setBackground(Color.RED);b10=false;d2=false;}
               }
         if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);b11=false;d3=false;}
               else if(this.t53.getText().equals("Year")){this.yearline.setBackground(Color.RED);b11=false;d3=false;}
               else{        int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1970&&Integer.parseInt(this.t53.getText())<1995){
                   this.yearline.setBackground(new Color(204,204,204));b11=true;d3=true;}
                   else{this.yearline.setBackground(Color.RED);b11=false;d3=false;}
                       } else{this.yearline.setBackground(Color.RED);b11=false;d3=false;}
               }
        
          if(this.t511.getText().equals("")){this.dayline1.setBackground(Color.RED);b12=false;d11=false;}
               else if(this.t511.getText().equals("Day")){this.dayline1.setBackground(Color.RED);b12=false;d11=false;}
               else{        int number=0;
              for(int i=0;i<this.t511.getText().length();i++)if(Character.isDigit(this.t511.getText().charAt(i)))number++;  
               if(number==this.t511.getText().length()){
                   if(Integer.parseInt(this.t511.getText())>=1&&Integer.parseInt(this.t511.getText())<=31){
                   this.dayline1.setBackground(new Color(204,204,204));b12=true;d11=true;}
                   else{this.dayline1.setBackground(Color.RED);b12=false;d11=false;}
                       } else{this.dayline1.setBackground(Color.RED);b12=false;d11=false;}
               }
        if(this.t5222.getText().equals("")){this.monthline1.setBackground(Color.RED);b13=false;d22=false;}
               else if(this.t5222.getText().equals("Month")){this.monthline1.setBackground(Color.RED);b13=false;d22=false;}
               else{        int number=0;
              for(int i=0;i<this.t5222.getText().length();i++)if(Character.isDigit(this.t5222.getText().charAt(i)))number++;  
               if(number==this.t5222.getText().length()){
                   if(Integer.parseInt(this.t5222.getText())>=1&&Integer.parseInt(this.t5222.getText())<=12){
                   this.monthline1.setBackground(new Color(204,204,204));b13=true;d22=true;}
                   else{this.monthline1.setBackground(Color.RED);b13=false;d22=false;}
                       } else{this.monthline1.setBackground(Color.RED);b13=false;d22=false;}
               }
         if(this.t533.getText().equals("")){this.yearline1.setBackground(Color.RED);b14=false;d33=false;}
               else if(this.t533.getText().equals("Year")){this.yearline1.setBackground(Color.RED);b14=false;d33=false;}
               else{        int number=0;
              for(int i=0;i<this.t533.getText().length();i++)if(Character.isDigit(this.t533.getText().charAt(i)))number++;  
               if(number==this.t533.getText().length()){
                   if(Integer.parseInt(this.t533.getText())>1980&&Integer.parseInt(this.t533.getText())<2020){
                   this.yearline1.setBackground(new Color(204,204,204));b14=true;d33=true;}
                   else{this.yearline1.setBackground(Color.RED);b14=false;d33=false;}
                       } else{this.yearline1.setBackground(Color.RED);b14=false;d33=false;}
               }
         
        if(!ismale&&!isfemale){b7=false;this.linemale.setBackground(Color.RED);this.linefemale.setBackground(Color.RED);}
        else {b7=true;}
        if(!issingle&&!ismarried){b8=false;this.linesingle.setBackground(Color.RED);this.marriedline.setBackground(Color.red);}
        else b8=true;
        /////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        if(b1&&b2&&b3&&b4&&b5&&b6&&b7&&b8&&b9&&b10&&b11&&b12&&b13&&b14){
         ////////////////////////////////////////////////////////////
         
         //raed
         
         ///////////////////////////////////////////////////
            isfemale=ismale=ismarried=issingle=false;
            t1.setText("First name");
            t2.setText("Secand name");
            t3.setText("Last name");
            t4.setText("Ssn");
            t5.setText("Phone");
            t6.setText("Years of expireance");
            t51.setText("Day");
            t511.setText("Day");
            t522.setText("Month");
            t5222.setText("Month");
            t53.setText("Year");
            t533.setText("Year");
            this.t1.requestFocus(rootPaneCheckingEnabled);
            Lightfemale.setBackground(new Color(11,99,171));
            Lightfemale1.setBackground(new Color(11,99,171));
            lightmale.setBackground(new Color(11,99,171));
            lightmale1.setBackground(new Color(11,99,171));
            JOptionPane.showMessageDialog(null, "Succesed");
            
     
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyPressed
      
    }//GEN-LAST:event_jLabel9KeyPressed

    private void ppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppMouseClicked
     m1=m2=m3=m4=m5=m6=click=false;
        
    
        boolean b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
        if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;this.t1e2.setVisible(false);}
        else if(this.t1.getText().equals("First name"))
        {this.t1e1.setVisible(true);this .t1e2.setVisible(false);this.t1.setText("");b1=false;}
        else {
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++){
                if (Character.isAlphabetic(this.t1.getText().charAt(i)))number++;}

            if(number==this.t1.getText().length()){
                this.t1e2.setVisible(false);b1=true;this.t1e1.setVisible(false);}
            else{this.t1e2.setVisible(true);b1=false;this.t1e1.setVisible(false);}}

        if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;this.t2e2.setVisible(false);}
        else if(this.t2.getText().equals("Secand name"))
        {this.t2e1.setVisible(true);this.t2.setText("");b2=false;this.t2e2.setVisible(false);}

        else {
            int number=0;
            for(int i=0;i<this.t2.getText().length();i++){
                if (Character.isAlphabetic(this.t2.getText().charAt(i)))number++;}
            if(number==this.t2.getText().length()){
                this.t2e1.setVisible(false);b2=true;t2e2.setVisible(false);}
            else{this.t2e2.setVisible(true);b2=false;this.t2e1.setVisible(false);}}

        if(this.t3.getText().equals(""))
        {this.t3e1.setVisible(true);b3=false;this.t3e2.setVisible(false);}
        else if(this.t3.getText().equals("Last name"))
        {this.t3e1.setVisible(true);this.t3.setText("");b3=false;this.t3e2.setVisible(false);}
           else {
            int number=0;
            for(int i=0;i<this.t3.getText().length();i++){
                if (Character.isAlphabetic(this.t3.getText().charAt(i)))number++;}
            if(number==this.t3.getText().length()){
                this.t3e1.setVisible(false);b3=true;t3e2.setVisible(false);}
            else{this.t3e2.setVisible(true);b3=false;this.t3e1.setVisible(false);}}
     
        if(this.t4.getText().equals("")){this.t4e1.setVisible(true);b4=false;this.t4e2.setVisible(false);}
        else if(this.t4.getText().equals("Ssn"))
        {this.t4e1.setVisible(true);this.t4.setText("");b4=false;t4e2.setVisible(false);}
        else {
            int number=0;int length=0;
            for(int i=0;i<this.t4.getText().length();i++){length++;
            if (Character.isDigit(this.t4.getText().charAt(i)))number++;}
            if(number==this.t4.getText().length()&&length==9){
                this.t4e1.setVisible(false);b4=true;this.t4e2.setVisible(false);}
            else {b4=false; this.t4e2.setVisible(true);this.t4e1.setVisible(false);}}
       
        if(this.t5.getText().equals(""))
        {this.t5e1.setVisible(true);b5=false;this.t5e2.setVisible(false);}
        else if(this.t5.getText().equals("Phone"))
        {this.t5e1.setVisible(true);this.t5.setText("");b5=false;this.t5e2.setVisible(false);}

        else {
            int number=0;int length=0;
            for(int i=0;i<this.t5.getText().length();i++){length++;
            if (Character.isDigit(this.t5.getText().charAt(i)))number++;}
            if(number==this.t5.getText().length()&&length==10){
                this.t5e1.setVisible(false);b5=true;this.t5e2.setVisible(false);}
            else { this.t5e2.setVisible(true);b5=false;this.t5e1.setVisible(false);}}

        if(this.t6.getText().equals("")){this.t6e.setVisible(true);b6=false;}
        else if(this.t6.getText().equals("Years of expireance")){this.t6e.setVisible(true);this.t6.setText("");b6=false;}
        else {
            int number=0;
            for(int i=0;i<this.t6.getText().length();i++)
            if (Character.isDigit(this.t6.getText().charAt(i)))number++;
            if(number==this.t6.getText().length()){ this.t6e.setVisible(false);b6=true;}
            else{   this.t6e.setVisible(true);b6=false;}}
  if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);b9=false;d1=false;}
               else if(this.t51.getText().equals("Day")){this.dayline.setBackground(Color.RED);b9=false;d1=false;}
               else{        int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<=31){
                   this.dayline.setBackground(new Color(204,204,204));b9=true;d1=true;}
                   else{this.dayline.setBackground(Color.RED);b9=false;d1=false;}
                       } else{this.dayline.setBackground(Color.RED);b9=false;d1=false;}
               }
        if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);b10=false;d2=false;}
               else if(this.t522.getText().equals("Month")){this.monthline.setBackground(Color.RED);b10=false;d2=false;}
               else{        int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                   this.monthline.setBackground(new Color(204,204,204));b10=true;d2=true;}
                   else{this.monthline.setBackground(Color.RED);b10=false;d2=false;}
                       } else{this.monthline.setBackground(Color.RED);b10=false;d2=false;}
               }
         if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);b11=false;d3=false;}
               else if(this.t53.getText().equals("Year")){this.yearline.setBackground(Color.RED);b11=false;d3=false;}
               else{        int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1970&&Integer.parseInt(this.t53.getText())<1995){
                   this.yearline.setBackground(new Color(204,204,204));b11=true;d3=true;}
                   else{this.yearline.setBackground(Color.RED);b11=false;d3=false;}
                       } else{this.yearline.setBackground(Color.RED);b11=false;d3=false;}
               }
        
          if(this.t511.getText().equals("")){this.dayline1.setBackground(Color.RED);b12=false;d11=false;}
               else if(this.t511.getText().equals("Day")){this.dayline1.setBackground(Color.RED);b12=false;d11=false;}
               else{        int number=0;
              for(int i=0;i<this.t511.getText().length();i++)if(Character.isDigit(this.t511.getText().charAt(i)))number++;  
               if(number==this.t511.getText().length()){
                   if(Integer.parseInt(this.t511.getText())>=1&&Integer.parseInt(this.t511.getText())<=31){
                   this.dayline1.setBackground(new Color(204,204,204));b12=true;d11=true;}
                   else{this.dayline1.setBackground(Color.RED);b12=false;d11=false;}
                       } else{this.dayline1.setBackground(Color.RED);b12=false;d11=false;}
               }
        if(this.t5222.getText().equals("")){this.monthline1.setBackground(Color.RED);b13=false;d22=false;}
               else if(this.t5222.getText().equals("Month")){this.monthline1.setBackground(Color.RED);b13=false;d22=false;}
               else{        int number=0;
              for(int i=0;i<this.t5222.getText().length();i++)if(Character.isDigit(this.t5222.getText().charAt(i)))number++;  
               if(number==this.t5222.getText().length()){
                   if(Integer.parseInt(this.t5222.getText())>=1&&Integer.parseInt(this.t5222.getText())<=12){
                   this.monthline1.setBackground(new Color(204,204,204));b13=true;d22=true;}
                   else{this.monthline1.setBackground(Color.RED);b13=false;d22=false;}
                       } else{this.monthline1.setBackground(Color.RED);b13=false;d22=false;}
               }
         if(this.t533.getText().equals("")){this.yearline1.setBackground(Color.RED);b14=false;d33=false;}
               else if(this.t533.getText().equals("Year")){this.yearline1.setBackground(Color.RED);b14=false;d33=false;}
               else{        int number=0;
              for(int i=0;i<this.t533.getText().length();i++)if(Character.isDigit(this.t533.getText().charAt(i)))number++;  
               if(number==this.t533.getText().length()){
                   if(Integer.parseInt(this.t533.getText())>1980&&Integer.parseInt(this.t533.getText())<2020){
                   this.yearline1.setBackground(new Color(204,204,204));b14=true;d33=true;}
                   else{this.yearline1.setBackground(Color.RED);b14=false;d33=false;}
                       } else{this.yearline1.setBackground(Color.RED);b14=false;d33=false;}
               }
         
        if(!ismale&&!isfemale){b7=false;this.linemale.setBackground(Color.RED);this.linefemale.setBackground(Color.RED);}
        else {b7=true;}
        if(!issingle&&!ismarried){b8=false;this.linesingle.setBackground(Color.RED);this.marriedline.setBackground(Color.red);}
        else b8=true;
        /////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        if(b1&&b2&&b3&&b4&&b5&&b6&&b7&&b8&&b9&&b10&&b11&&b12&&b13&&b14){
          ////////////////////////////////////////////////////////////
         
         //raed
         
         ///////////////////////////////////////////////////
            isfemale=ismale=ismarried=issingle=false;
            t1.setText("First name");
            t2.setText("Secand name");
            t3.setText("Last name");
            t4.setText("Ssn");
            t5.setText("Phone");
            t6.setText("Years of expireance");
            t51.setText("Day");
            t511.setText("Day");
            t522.setText("Month");
            t5222.setText("Month");
            t53.setText("Year");
            t533.setText("Year");
            this.t1.requestFocus(rootPaneCheckingEnabled);
            Lightfemale.setBackground(new Color(11,99,171));
            Lightfemale1.setBackground(new Color(11,99,171));
            lightmale.setBackground(new Color(11,99,171));
            lightmale1.setBackground(new Color(11,99,171));
            JOptionPane.showMessageDialog(null, "Succesed");
        }
    }//GEN-LAST:event_ppMouseClicked

    private void ppMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppMouseEntered
        this.pp1.setOpaque(false);
        this.pp1.repaint();
        this.pp2.setOpaque(false);
        this.pp2.repaint();
        this.pp3.setOpaque(false);
        this.pp3.repaint();
        this.pp4.setOpaque(false);
        this.pp4.repaint();
    }//GEN-LAST:event_ppMouseEntered

    private void ppMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppMouseExited
        this.pp1.setOpaque(true);
        this.pp1.repaint();
        this.pp2.setOpaque(true);
        this.pp2.repaint();
        this.pp3.setOpaque(true);
        this.pp3.repaint();
        this.pp4.setOpaque(true);
        this.pp4.repaint();
    }//GEN-LAST:event_ppMouseExited

    private void t1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseExited
 if(this.t1.getText().equals("")&&m1)
                {this.t1.setText("First name");this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
                else if(this.t1.getText().equals("First name")&&m1)this.t1e2.setVisible(false);
             else{
                    if(m1){
                 int number=0;
                 for(int i=0;i<this.t1.getText().length();i++)
                     if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
                 if(number==this.t1.getText().length()){this.t1e2.setVisible(false);}else this.t1e2.setVisible(true);
                    
                    }}    }//GEN-LAST:event_t1MouseExited

    private void t2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseExited
 if(this.t2.getText().equals("")&&m2)
                {this.t2.setText("Secand name");this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
                else if(this.t2.getText().equals("Secand name")&&m2)this.t2e2.setVisible(false);
             else{
                    if(m2){
                 int number=0;
                 for(int i=0;i<this.t2.getText().length();i++)
                     if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
                 if(number==this.t2.getText().length()){this.t2e2.setVisible(false);}else this.t2e2.setVisible(true);
                    
                    }}    }//GEN-LAST:event_t2MouseExited

    private void t3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3MouseExited
 if(this.t3.getText().equals("")&&m3)
                {this.t3.setText("Last name");this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
                else if(this.t3.getText().equals("Last name")&&m3)this.t3e2.setVisible(false);
             else{
                    if(m3){
                 int number=0;
                 for(int i=0;i<this.t3.getText().length();i++)
                     if(Character.isAlphabetic(this.t3.getText().charAt(i)))number++;
                 if(number==this.t3.getText().length()){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
                    
                    }}    }//GEN-LAST:event_t3MouseExited

    private void t4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4MouseExited
  if(this.t4.getText().equals("")&&m4)
                {this.t4.setText("Ssn");this.t4e1.setVisible(false);this.t4e2.setVisible(false);}
                else if(this.t4.getText().equals("Ssn")&&m4)this.t4e2.setVisible(false);
             else{
                    if(m4){
                 int number=0;int length=0;
                 for(int i=0;i<this.t4.getText().length();i++){length++;
                     if(Character.isDigit(this.t4.getText().charAt(i)))number++;}
                 if(number==this.t4.getText().length()&&length==9){this.t4e2.setVisible(false);}else this.t4e2.setVisible(true);
             }}       }//GEN-LAST:event_t4MouseExited

    private void t5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t5MouseExited
         if(this.t5.getText().equals("")&&m5)
                {this.t5.setText("Phone");this.t5e1.setVisible(false);this.t5e2.setVisible(false);}
                else if(this.t5.getText().equals("Phone")&&m5)this.t5e2.setVisible(false);
             else{
                    if(m5){
                 int number=0;int length=0;
                 for(int i=0;i<this.t5.getText().length();i++){length++;
                     if(Character.isDigit(this.t5.getText().charAt(i)))number++;}
                 if(number==this.t5.getText().length()&&length==10){this.t5e2.setVisible(false);}else this.t5e2.setVisible(true);
             }}       
    }//GEN-LAST:event_t5MouseExited

    private void t6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t6MouseExited
       
   if(this.t6.getText().equals("")&&m6){this.t6.setText("Years of expireance");
             this.t6e.setVisible(false);  }
       else{
       if(m6){
                     int number=0;
        
              for(int i=0;i<this.t6.getText().length();i++){
        if (Character.isDigit(this.t6.getText().charAt(i)))number++;}
        if(number==this.t6.getText().length())
                  this.t6e.setVisible(false);
               else t6e.setVisible(true);}}
       
       
    }//GEN-LAST:event_t6MouseExited

    private void t5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5MousePressed

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseEntered

    private void redpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redpMouseClicked
        // TODO add your handling code hereset
        setVisible(false);
    }//GEN-LAST:event_redpMouseClicked

    private void redpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redpMouseExited
        redp.setVisible(false);
        blue.setVisible(true);
    }//GEN-LAST:event_redpMouseExited

    private void piMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_piMouseEntered
        blue.setVisible(false);
        redp.setVisible(true);

    }//GEN-LAST:event_piMouseEntered

    private void t51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t51MouseExited
        if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);this.t51.setText("Day");d1=false;}
        else if(this.t51.getText().equals("Day")&&d1)this.dayline.setBackground(new Color(204,204,204));
        else{        int number=0;
            for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;
            if(number==this.t51.getText().length()){
                if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<31){
                    this.dayline.setBackground(new Color(204,204,204));d1=true;}
                else{this.dayline.setBackground(Color.RED);}
            } else{this.dayline.setBackground(Color.RED);}
    }//GEN-LAST:event_t51MouseExited
    }
    private void t51KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t51KeyPressed
         if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_LEFT&&
            evt.getKeyCode()!=KeyEvent.VK_RIGHT){
            day=true;
            if(t51.getText().equals("Day"))this.t51.setText("");

        }
        else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
            if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);this.t51.setText("Day");d1=false;}
            else if(this.t51.getText().equals("Day")&&d1)this.dayline.setBackground(new Color(204,204,204));
            else{        int number=0;
                for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;
                if(number==this.t51.getText().length()){
                    if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<=31){
                        this.dayline.setBackground(new Color(204,204,204));d1=true;}
                    else{this.dayline.setBackground(Color.RED);}
                } else{this.dayline.setBackground(Color.RED);}
            }

            this.t53.requestFocus(rootPaneCheckingEnabled);}

        else if(evt.getKeyCode()==KeyEvent.VK_RIGHT||evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.t522.requestFocus(rootPaneCheckingEnabled);
            if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);this.t51.setText("Day");d1=false;}
            else if(this.t51.getText().equals("Day")&&d1){this.dayline.setBackground(new Color(204,204,204));}
            else{

                int number=0;
                for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;
                if(number==this.t51.getText().length()){
                    if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<=31){
                        this.dayline.setBackground(new Color(204,204,204));d1=true;}
                    else{this.dayline.setBackground(Color.RED);}
                } else{this.dayline.setBackground(Color.RED);}
            }

        }
    }//GEN-LAST:event_t51KeyPressed

    private void t522MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t522MouseExited
        if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);this.t522.setText("Month");d2=false;}
        else if(this.t522.getText().equals("Month")&&d2)this.monthline.setBackground(new Color(204,204,204));
        else{        int number=0;
            for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;
            if(number==this.t522.getText().length()){
                if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){

                    this.monthline.setBackground(new Color(204,204,204));d2=true;}
                else{this.monthline.setBackground(Color.RED);}
            } else{this.monthline.setBackground(Color.RED);}}

    }//GEN-LAST:event_t522MouseExited

    private void t522KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t522KeyPressed
        if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_LEFT&&
            evt.getKeyCode()!=KeyEvent.VK_RIGHT){
            month=true;
            if(t522.getText().equals("Month"))this.t522.setText("");

        }
        else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
            if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);this.t522.setText("Month");d2=false;}
            else if(this.t522.getText().equals("Month")&&d2)this.monthline.setBackground(new Color(204,204,204));
            else{        int number=0;
                for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;
                if(number==this.t522.getText().length()){
                    if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){

                        this.monthline.setBackground(new Color(204,204,204));d2=true;}
                    else{this.monthline.setBackground(Color.RED);}
                } else{this.monthline.setBackground(Color.RED);}
            }

            this.t51.requestFocus(rootPaneCheckingEnabled);}
        else if(evt.getKeyCode()==KeyEvent.VK_RIGHT||evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.t53.requestFocus(rootPaneCheckingEnabled);
            if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);this.t522.setText("Month");d2=false;}
            else if(this.t522.getText().equals("Month")&&d2)this.monthline.setBackground(new Color(204,204,204));
            else{

                int number=0;
                for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;
                if(number==this.t522.getText().length()){
                    if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                        this.monthline.setBackground(new Color(204,204,204));d2=true;}
                    else{this.monthline.setBackground(Color.RED);}
                } else{this.monthline.setBackground(Color.RED);}
            }

        }
    }//GEN-LAST:event_t522KeyPressed

    private void t53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t53MouseExited
        if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);this.t53.setText("Year");d3=false;}
        else if(this.t53.getText().equals("Year")&&d3)this.yearline.setBackground(new Color(204,204,204));
        else{        int number=0;
            for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;
            if(number==this.t53.getText().length()){
                if(Integer.parseInt(this.t53.getText())>1970&&Integer.parseInt(this.t53.getText())<1995){
                    this.yearline.setBackground(new Color(204,204,204));d3=true;}
                else{this.yearline.setBackground(Color.RED);}
            } else{this.yearline.setBackground(Color.RED);}
        }

    }//GEN-LAST:event_t53MouseExited

    private void t53KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t53KeyPressed
        if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_LEFT&&
            evt.getKeyCode()!=KeyEvent.VK_RIGHT){
            year=true;
            if(t53.getText().equals("Year"))this.t53.setText("");

        }
        else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
            this.t522.requestFocus(rootPaneCheckingEnabled);
            if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);this.t53.setText("Year");d3=false;}
            else if(this.t53.getText().equals("Year")&&d3)this.yearline.setBackground(new Color(204,204,204));
            else{        int number=0;
                for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;
                if(number==this.t53.getText().length()){
                    if(Integer.parseInt(this.t53.getText())>1970&&Integer.parseInt(this.t53.getText())<1995){
                        this.yearline.setBackground(new Color(204,204,204));d3=true;}
                    else{this.yearline.setBackground(Color.RED);}
                } else{this.yearline.setBackground(Color.RED);}
            }

        }
        else if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
            this.t51.requestFocus(rootPaneCheckingEnabled);
            if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);this.t53.setText("Year");d3=false;}
            else if(this.t53.getText().equals("Year")&&d3)this.yearline.setBackground(new Color(204,204,204));
            else{

                int number=0;
                for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;
                if(number==this.t53.getText().length()){
                    if(Integer.parseInt(this.t53.getText())>1970&&Integer.parseInt(this.t53.getText())<1995){
                        this.yearline.setBackground(new Color(204,204,204));d3=true;}
                    else{this.yearline.setBackground(Color.RED);}
                } else{this.yearline.setBackground(Color.RED);}
            }

        }
        else{
    m1=m2=m3=m4=m5=m6=click=false;
        
    
        boolean b1,b2,b3,b4,b5,b6,b7,b8;
        if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;this.t1e2.setVisible(false);}
        else if(this.t1.getText().equals("First name"))
        {this.t1e1.setVisible(true);this .t1e2.setVisible(false);this.t1.setText("");b1=false;}
        else {
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++){
                if (Character.isAlphabetic(this.t1.getText().charAt(i)))number++;}

            if(number==this.t1.getText().length()){
                this.t1e2.setVisible(false);b1=true;this.t1e1.setVisible(false);}
            else{this.t1e2.setVisible(true);b1=false;this.t1e1.setVisible(false);}}

        if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;this.t2e2.setVisible(false);}
        else if(this.t2.getText().equals("Secand name"))
        {this.t2e1.setVisible(true);this.t2.setText("");b2=false;this.t2e2.setVisible(false);}

        else {
            int number=0;
            for(int i=0;i<this.t2.getText().length();i++){
                if (Character.isAlphabetic(this.t2.getText().charAt(i)))number++;}
            if(number==this.t2.getText().length()){
                this.t2e1.setVisible(false);b2=true;t2e2.setVisible(false);}
            else{this.t2e2.setVisible(true);b2=false;this.t2e1.setVisible(false);}}

        if(this.t3.getText().equals(""))
        {this.t3e1.setVisible(true);b3=false;this.t3e2.setVisible(false);}
        else if(this.t3.getText().equals("Last name"))
        {this.t3e1.setVisible(true);this.t3.setText("");b3=false;this.t3e2.setVisible(false);}
           else {
            int number=0;
            for(int i=0;i<this.t3.getText().length();i++){
                if (Character.isAlphabetic(this.t3.getText().charAt(i)))number++;}
            if(number==this.t3.getText().length()){
                this.t3e1.setVisible(false);b3=true;t3e2.setVisible(false);}
            else{this.t3e2.setVisible(true);b3=false;this.t3e1.setVisible(false);}}
     
        if(this.t4.getText().equals("")){this.t4e1.setVisible(true);b4=false;this.t4e2.setVisible(false);}
        else if(this.t4.getText().equals("Ssn"))
        {this.t4e1.setVisible(true);this.t4.setText("");b4=false;t4e2.setVisible(false);}
        else {
            int number=0;int length=0;
            for(int i=0;i<this.t4.getText().length();i++){length++;
            if (Character.isDigit(this.t4.getText().charAt(i)))number++;}
            if(number==this.t4.getText().length()&&length==9){
                this.t4e1.setVisible(false);b4=true;this.t4e2.setVisible(false);}
            else {b4=false; this.t4e2.setVisible(true);this.t4e1.setVisible(false);}}
       
        if(this.t5.getText().equals(""))
        {this.t5e1.setVisible(true);b5=false;this.t5e2.setVisible(false);}
        else if(this.t5.getText().equals("Phone"))
        {this.t5e1.setVisible(true);this.t5.setText("");b5=false;this.t5e2.setVisible(false);}

        else {
            int number=0;int length=0;
            for(int i=0;i<this.t5.getText().length();i++){length++;
            if (Character.isDigit(this.t5.getText().charAt(i)))number++;}
            if(number==this.t5.getText().length()&&length==10){
                this.t5e1.setVisible(false);b5=true;this.t5e2.setVisible(false);}
            else { this.t5e2.setVisible(true);b5=false;this.t5e1.setVisible(false);}}

        if(this.t6.getText().equals("")){this.t6e.setVisible(true);b6=false;}
        else if(this.t6.getText().equals("Years of expireance")){this.t6e.setVisible(true);this.t6.setText("");b6=false;}
        else {
            int number=0;
            for(int i=0;i<this.t6.getText().length();i++)
            if (Character.isDigit(this.t6.getText().charAt(i)))number++;
            if(number==this.t6.getText().length()){ this.t6e.setVisible(false);b6=true;}
            else{   this.t6e.setVisible(true);b6=false;}}
  if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);b4=false;d1=false;}
               else if(this.t51.getText().equals("Day")){this.dayline.setBackground(Color.RED);b4=false;d1=false;}
               else{        int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<=31){
                   this.dayline.setBackground(new Color(204,204,204));b4=true;d1=true;}
                   else{this.dayline.setBackground(Color.RED);b4=false;d1=false;}
                       } else{this.dayline.setBackground(Color.RED);b4=false;d1=false;}
               }
        if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);b5=false;d2=false;}
               else if(this.t522.getText().equals("Month")){this.monthline.setBackground(Color.RED);b5=false;d2=false;}
               else{        int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                   this.monthline.setBackground(new Color(204,204,204));b5=true;d2=true;}
                   else{this.monthline.setBackground(Color.RED);b5=false;d2=false;}
                       } else{this.monthline.setBackground(Color.RED);b5=false;d2=false;}
               }
         if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);b6=false;d3=false;}
               else if(this.t53.getText().equals("Year")){this.yearline.setBackground(Color.RED);b6=false;d3=false;}
               else{        int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1970&&Integer.parseInt(this.t53.getText())<1995){
                   this.yearline.setBackground(new Color(204,204,204));b6=true;d3=true;}
                   else{this.yearline.setBackground(Color.RED);b6=false;d3=false;}
                       } else{this.yearline.setBackground(Color.RED);b6=false;d3=false;}
               }
        
        if(!ismale&&!isfemale){b7=false;this.linemale.setBackground(Color.RED);this.linefemale.setBackground(Color.RED);}
        else {b7=true;}
        if(!issingle&&!ismarried){b8=false;this.linesingle.setBackground(Color.RED);this.marriedline.setBackground(Color.red);}
        else b8=true;
        /////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        if(b1&&b2&&b3&&b4&&b5&&b6&&b7&&b8){
          
              ////////////////////////////////////////////////////////////
         
         //raed
         
         ///////////////////////////////////////////////////
            isfemale=ismale=ismarried=issingle=false;
            t1.setText("First name");
            t2.setText("Secand name");
            t3.setText("Last name");
            t4.setText("Ssn");
            t5.setText("Phone");
            t6.setText("Years of expireance");
            t51.setText("Day");
            t511.setText("Day");
            t522.setText("Month");
            t5222.setText("Month");
            t53.setText("Year");
            t533.setText("Year");
            this.t1.requestFocus(rootPaneCheckingEnabled);
            Lightfemale.setBackground(new Color(11,99,171));
            Lightfemale1.setBackground(new Color(11,99,171));
            lightmale.setBackground(new Color(11,99,171));
            lightmale1.setBackground(new Color(11,99,171));
            JOptionPane.showMessageDialog(null, "Succesed");
        }
        }
    }//GEN-LAST:event_t53KeyPressed

    private void t511MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t511MouseExited
           if(this.t511.getText().equals("")){this.dayline1.setBackground(Color.RED);this.t511.setText("Day");d11=false;}
        else if(this.t511.getText().equals("Day")&&d11)this.dayline1.setBackground(new Color(204,204,204));
        else{        int number=0;
            for(int i=0;i<this.t511.getText().length();i++)if(Character.isDigit(this.t511.getText().charAt(i)))number++;
            if(number==this.t511.getText().length()){
                if(Integer.parseInt(this.t511.getText())>=1&&Integer.parseInt(this.t511.getText())<31){
                    this.dayline1.setBackground(new Color(204,204,204));d11=true;}
                else{this.dayline1.setBackground(Color.RED);}
            } else{this.dayline1.setBackground(Color.RED);}
    }     
    }//GEN-LAST:event_t511MouseExited

    private void t511KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t511KeyPressed
  if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_LEFT&&
            evt.getKeyCode()!=KeyEvent.VK_RIGHT){
            day1=true;
            if(t511.getText().equals("Day"))this.t511.setText("");

        }
        else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
            if(this.t511.getText().equals("")){this.dayline1.setBackground(Color.RED);this.t511.setText("Day");d11=false;}
            else if(this.t511.getText().equals("Day")&&d11)this.dayline1.setBackground(new Color(204,204,204));
            else{        int number=0;
                for(int i=0;i<this.t511.getText().length();i++)if(Character.isDigit(this.t511.getText().charAt(i)))number++;
                if(number==this.t511.getText().length()){
                    if(Integer.parseInt(this.t511.getText())>=1&&Integer.parseInt(this.t511.getText())<=31){
                        this.dayline1.setBackground(new Color(204,204,204));d11=true;}
                    else{this.dayline1.setBackground(Color.RED);}
                } else{this.dayline1.setBackground(Color.RED);}
            }

            this.t533.requestFocus(rootPaneCheckingEnabled);}

        else if(evt.getKeyCode()==KeyEvent.VK_RIGHT||evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.t5222.requestFocus(rootPaneCheckingEnabled);
            if(this.t511.getText().equals("")){this.dayline1.setBackground(Color.RED);this.t511.setText("Day");d11=false;}
            else if(this.t511.getText().equals("Day")&&d11){this.dayline1.setBackground(new Color(204,204,204));}
            else{

                int number=0;
                for(int i=0;i<this.t511.getText().length();i++)if(Character.isDigit(this.t511.getText().charAt(i)))number++;
                if(number==this.t511.getText().length()){
                    if(Integer.parseInt(this.t511.getText())>=1&&Integer.parseInt(this.t511.getText())<=31){
                        this.dayline1.setBackground(new Color(204,204,204));d11=true;}
                    else{this.dayline1.setBackground(Color.RED);}
                } else{this.dayline1.setBackground(Color.RED);}
            }

        }    }//GEN-LAST:event_t511KeyPressed

    private void t5222MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t5222MouseExited
        // TODO add your handling code here:
                if(this.t5222.getText().equals("")){this.monthline1.setBackground(Color.RED);this.t5222.setText("Month");d22=false;}
        else if(this.t5222.getText().equals("Month")&&d22)this.monthline1.setBackground(new Color(204,204,204));
        else{        int number=0;
            for(int i=0;i<this.t5222.getText().length();i++)if(Character.isDigit(this.t5222.getText().charAt(i)))number++;
            if(number==this.t5222.getText().length()){
                if(Integer.parseInt(this.t5222.getText())>=1&&Integer.parseInt(this.t5222.getText())<=12){

                    this.monthline1.setBackground(new Color(204,204,204));d22=true;}
                else{this.monthline1.setBackground(Color.RED);}
            } else{this.monthline1.setBackground(Color.RED);}}
    }//GEN-LAST:event_t5222MouseExited

    private void t5222KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5222KeyPressed
        if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_LEFT&&
            evt.getKeyCode()!=KeyEvent.VK_RIGHT){
            month1=true;
            if(t5222.getText().equals("Month"))this.t5222.setText("");

        }
        else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
            if(this.t5222.getText().equals("")){this.monthline1.setBackground(Color.RED);this.t5222.setText("Month");d22=false;}
            else if(this.t5222.getText().equals("Month")&&d22)this.monthline1.setBackground(new Color(204,204,204));
            else{        int number=0;
                for(int i=0;i<this.t5222.getText().length();i++)if(Character.isDigit(this.t5222.getText().charAt(i)))number++;
                if(number==this.t5222.getText().length()){
                    if(Integer.parseInt(this.t5222.getText())>=1&&Integer.parseInt(this.t5222.getText())<=12){

                        this.monthline1.setBackground(new Color(204,204,204));d22=true;}
                    else{this.monthline1.setBackground(Color.RED);}
                } else{this.monthline1.setBackground(Color.RED);}
            }

            this.t511.requestFocus(rootPaneCheckingEnabled);}
        else if(evt.getKeyCode()==KeyEvent.VK_RIGHT||evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.t533.requestFocus(rootPaneCheckingEnabled);
            if(this.t5222.getText().equals("")){this.monthline1.setBackground(Color.RED);this.t5222.setText("Month");d2=false;}
            else if(this.t5222.getText().equals("Month")&&d22)this.monthline1.setBackground(new Color(204,204,204));
            else{

                int number=0;
                for(int i=0;i<this.t5222.getText().length();i++)if(Character.isDigit(this.t5222.getText().charAt(i)))number++;
                if(number==this.t5222.getText().length()){
                    if(Integer.parseInt(this.t5222.getText())>=1&&Integer.parseInt(this.t5222.getText())<=12){
                        this.monthline1.setBackground(new Color(204,204,204));d22=true;}
                    else{this.monthline1.setBackground(Color.RED);}
                } else{this.monthline1.setBackground(Color.RED);}
            }

        }    }//GEN-LAST:event_t5222KeyPressed

    private void t533MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t533MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_t533MouseExited

    private void t533KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t533KeyPressed
        if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_LEFT&&
            evt.getKeyCode()!=KeyEvent.VK_RIGHT){
            year1=true;
            if(t533.getText().equals("Year"))this.t533.setText("");

        }
        else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
            this.t5222.requestFocus(rootPaneCheckingEnabled);
            if(this.t533.getText().equals("")){this.yearline1.setBackground(Color.RED);this.t533.setText("Year");d3=false;}
            else if(this.t533.getText().equals("Year")&&d33)this.yearline1.setBackground(new Color(204,204,204));
            else{        int number=0;
                for(int i=0;i<this.t533.getText().length();i++)if(Character.isDigit(this.t533.getText().charAt(i)))number++;
                if(number==this.t533.getText().length()){
                    if(Integer.parseInt(this.t533.getText())>1980&&Integer.parseInt(this.t533.getText())<2021){
                        this.yearline1.setBackground(new Color(204,204,204));d33=true;}
                    else{this.yearline1.setBackground(Color.RED);}
                } else{this.yearline1.setBackground(Color.RED);}
            }

        }
        else if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
            this.t511.requestFocus(rootPaneCheckingEnabled);
            if(this.t533.getText().equals("")){this.yearline1.setBackground(Color.RED);this.t533.setText("Year");d3=false;}
            else if(this.t533.getText().equals("Year")&&d33)this.yearline1.setBackground(new Color(204,204,204));
            else{

                int number=0;
                for(int i=0;i<this.t533.getText().length();i++)if(Character.isDigit(this.t533.getText().charAt(i)))number++;
                if(number==this.t533.getText().length()){
                    if(Integer.parseInt(this.t533.getText())>1980&&Integer.parseInt(this.t533.getText())<2020){
                        this.yearline1.setBackground(new Color(204,204,204));d33=true;}
                    else{this.yearline1.setBackground(Color.RED);}
                } else{this.yearline1.setBackground(Color.RED);}
            }

        }
        else{
               this.t51.requestFocus(rootPaneCheckingEnabled);
                  int number=0;
                for(int i=0;i<this.t533.getText().length();i++)if(Character.isDigit(this.t533.getText().charAt(i)))number++;
                if(number==this.t533.getText().length()){
                    if(Integer.parseInt(this.t533.getText())>1980&&Integer.parseInt(this.t533.getText())<2020){
                        this.yearline1.setBackground(new Color(204,204,204));d33=true;}
                    else{this.yearline1.setBackground(Color.RED);}
                } else{this.yearline1.setBackground(Color.RED);}
                } 
          
        
    }//GEN-LAST:event_t533KeyPressed

    private void t51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t51ActionPerformed

    private void t5222ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5222ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5222ActionPerformed

   
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Female;
    private javax.swing.JPanel Lightfemale;
    private javax.swing.JPanel Lightfemale1;
    private javax.swing.JPanel b1;
    private javax.swing.JPanel b2;
    private javax.swing.JPanel b3;
    private javax.swing.JLabel background;
    private javax.swing.JPanel blue;
    private javax.swing.JPanel dayline;
    private javax.swing.JPanel dayline1;
    private javax.swing.JLabel femalesmall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel l1;
    private javax.swing.JPanel l10;
    private javax.swing.JPanel l11;
    private javax.swing.JPanel l12;
    private javax.swing.JPanel l13;
    private javax.swing.JPanel l2;
    private javax.swing.JPanel l3;
    private javax.swing.JPanel l4;
    private javax.swing.JPanel l44;
    private javax.swing.JPanel l5;
    private javax.swing.JPanel l6;
    private javax.swing.JPanel l7;
    private javax.swing.JPanel l8;
    private javax.swing.JPanel lightmale;
    private javax.swing.JPanel lightmale1;
    private javax.swing.JPanel linefemale;
    private javax.swing.JPanel linemale;
    private javax.swing.JPanel linesingle;
    private javax.swing.JLabel married;
    private javax.swing.JPanel marriedbig;
    private javax.swing.JPanel marriedline;
    private javax.swing.JPanel monthline;
    private javax.swing.JPanel monthline1;
    private javax.swing.JLabel pi;
    private javax.swing.JPanel pp;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JPanel pp3;
    private javax.swing.JPanel pp4;
    private javax.swing.JPanel redp;
    private javax.swing.JPanel s1;
    private javax.swing.JPanel s10;
    private javax.swing.JPanel s11;
    private javax.swing.JPanel s2;
    private javax.swing.JPanel s3;
    private javax.swing.JPanel s4;
    private javax.swing.JPanel s5;
    private javax.swing.JPanel s6;
    private javax.swing.JPanel s7;
    private javax.swing.JPanel s8;
    private javax.swing.JPanel s9;
    private javax.swing.JLabel single;
    private javax.swing.JPanel singlebig;
    private javax.swing.JTextField t1;
    private javax.swing.JLabel t1e1;
    private javax.swing.JLabel t1e2;
    private javax.swing.JTextField t2;
    private javax.swing.JLabel t2e1;
    private javax.swing.JLabel t2e2;
    private javax.swing.JTextField t3;
    private javax.swing.JLabel t3e1;
    private javax.swing.JLabel t3e2;
    private javax.swing.JTextField t4;
    private javax.swing.JLabel t4e1;
    private javax.swing.JLabel t4e2;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t51;
    private javax.swing.JTextField t511;
    private javax.swing.JTextField t522;
    private javax.swing.JTextField t5222;
    private javax.swing.JTextField t53;
    private javax.swing.JTextField t533;
    private javax.swing.JLabel t5e1;
    private javax.swing.JLabel t5e2;
    private javax.swing.JTextField t6;
    private javax.swing.JLabel t6e;
    private javax.swing.JPanel yearline;
    private javax.swing.JPanel yearline1;
    // End of variables declaration//GEN-END:variables
}
