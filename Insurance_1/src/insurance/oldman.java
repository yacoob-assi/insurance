
package insurance;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class oldman extends javax.swing.JFrame {

  
    boolean click=true;
    boolean m1,m2,m3,m4,m5,month,day,year,d1,d2,d3;
    public oldman() {
        initComponents();
        d1=d2=d3=true;
        m1=m2=m3=m4=m5=month=day=year=false;

         this.background.setSize(this.getWidth(), this.getHeight());
         this.title.setBackground(new Color(0,0,0,100));
       redp1.setVisible(false);
         this.S1.setBackground(new Color(255,255,255,100));
         this.S2.setBackground(new Color(255,255,255,100));
         this.S3.setBackground(new Color(255,255,255,100));
         this.S4.setBackground(new Color(255,255,255,100));
         this.S5.setBackground(new Color(255,255,255,100));
         this.L1.setBackground(new Color(0,0,0,100));
         this.L2.setBackground(new Color(0,0,0,100));
         this.L3.setBackground(new Color(0,0,0,100));
         this.L4.setBackground(new Color(0,0,0,100));
         this.L5.setBackground(new Color(0,0,0,100));
         this.L6.setBackground(new Color(0,0,0,100));
         this.L7.setBackground(new Color(0,0,0,100));
         this.back1.setBackground(new Color(0,0,0,100));
         this.back2.setBackground(new Color(0,0,0,100));
         this.back3.setBackground(new Color(0,0,0,100));
         this.back4.setBackground(new Color(0,0,0,100));
         this.t1e1.setVisible(false);
         this.t2e1.setVisible(false);
         this.t3e1.setVisible(false);
         this.t4e.setVisible(false);
         this.t1e2.setVisible(false);
         this.t2e2.setVisible(false);
         this.t3e2.setVisible(false);
         
         this.pp.setBackground(new Color(255,255,255,100));
         this.t1.setCaretColor(Color.WHITE);
         this.t2.setCaretColor(Color.WHITE);
         this.t3.setCaretColor(Color.WHITE);
         this.t4.setCaretColor(Color.WHITE);
         this.t51.setCaretColor(Color.WHITE);
         this.t522.setCaretColor(Color.WHITE);
         this.t53.setCaretColor(Color.WHITE);
        setLocation(300, 10);
                    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp3 = new javax.swing.JPanel();
        pp4 = new javax.swing.JPanel();
        t2e1 = new javax.swing.JLabel();
        t1e1 = new javax.swing.JLabel();
        t3e1 = new javax.swing.JLabel();
        t4e = new javax.swing.JLabel();
        t1e2 = new javax.swing.JLabel();
        t2e2 = new javax.swing.JLabel();
        t3e2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        L2 = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        S1 = new javax.swing.JPanel();
        L1 = new javax.swing.JPanel();
        L4 = new javax.swing.JPanel();
        S3 = new javax.swing.JPanel();
        S2 = new javax.swing.JPanel();
        S4 = new javax.swing.JPanel();
        L5 = new javax.swing.JPanel();
        L6 = new javax.swing.JPanel();
        L7 = new javax.swing.JPanel();
        L3 = new javax.swing.JPanel();
        S5 = new javax.swing.JPanel();
        pp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        back3 = new javax.swing.JPanel();
        back4 = new javax.swing.JPanel();
        back2 = new javax.swing.JPanel();
        back1 = new javax.swing.JPanel();
        pp2 = new javax.swing.JPanel();
        pp1 = new javax.swing.JPanel();
        dayline = new javax.swing.JPanel();
        t51 = new javax.swing.JTextField();
        monthline = new javax.swing.JPanel();
        t53 = new javax.swing.JTextField();
        yearline = new javax.swing.JPanel();
        t522 = new javax.swing.JTextField();
        redp1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        blue = new javax.swing.JPanel();
        pi = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(pp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 700, -1, -1));

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

        getContentPane().add(pp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 700, -1, -1));

        t2e1.setForeground(new java.awt.Color(204, 255, 255));
        t2e1.setText("Last name is requred");
        getContentPane().add(t2e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 140, 20));

        t1e1.setForeground(new java.awt.Color(204, 255, 255));
        t1e1.setText("First name is requred");
        getContentPane().add(t1e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 140, 20));

        t3e1.setForeground(new java.awt.Color(204, 255, 255));
        t3e1.setText("Number is requred");
        getContentPane().add(t3e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 130, -1));

        t4e.setForeground(new java.awt.Color(204, 255, 255));
        t4e.setText("Pension is requred");
        getContentPane().add(t4e, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 130, -1));

        t1e2.setForeground(new java.awt.Color(204, 255, 255));
        t1e2.setText("First name just alphabets");
        getContentPane().add(t1e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 150, -1));

        t2e2.setForeground(new java.awt.Color(204, 255, 255));
        t2e2.setText("Last name just alphabets");
        getContentPane().add(t2e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 390, 150, -1));

        t3e2.setForeground(new java.awt.Color(204, 255, 255));
        t3e2.setText("Employee number is 9 numbers");
        getContentPane().add(t3e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 470, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 610, 60, 20));

        t4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(204, 204, 204));
        t4.setText("Pension");
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
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 320, 70));

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 320, 70));

        t2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(204, 204, 204));
        t2.setText("Last name");
        t2.setBorder(null);
        t2.setOpaque(false);
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t2MousePressed(evt);
            }
        });
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 320, 70));

        t3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(204, 204, 204));
        t3.setText("Employee number");
        t3.setBorder(null);
        t3.setOpaque(false);
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t3MouseExited(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t3KeyPressed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 320, 70));

        javax.swing.GroupLayout L2Layout = new javax.swing.GroupLayout(L2);
        L2.setLayout(L2Layout);
        L2Layout.setHorizontalGroup(
            L2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        L2Layout.setVerticalGroup(
            L2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        title.setToolTipText("Member Login");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Riterment");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 410, -1));

        S1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout S1Layout = new javax.swing.GroupLayout(S1);
        S1.setLayout(S1Layout);
        S1Layout.setHorizontalGroup(
            S1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        S1Layout.setVerticalGroup(
            S1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        javax.swing.GroupLayout L1Layout = new javax.swing.GroupLayout(L1);
        L1.setLayout(L1Layout);
        L1Layout.setHorizontalGroup(
            L1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        L1Layout.setVerticalGroup(
            L1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 400, -1));

        javax.swing.GroupLayout L4Layout = new javax.swing.GroupLayout(L4);
        L4.setLayout(L4Layout);
        L4Layout.setHorizontalGroup(
            L4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        L4Layout.setVerticalGroup(
            L4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 390, 10));

        S3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout S3Layout = new javax.swing.GroupLayout(S3);
        S3.setLayout(S3Layout);
        S3Layout.setHorizontalGroup(
            S3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        S3Layout.setVerticalGroup(
            S3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        S2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout S2Layout = new javax.swing.GroupLayout(S2);
        S2.setLayout(S2Layout);
        S2Layout.setHorizontalGroup(
            S2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        S2Layout.setVerticalGroup(
            S2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        S4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout S4Layout = new javax.swing.GroupLayout(S4);
        S4.setLayout(S4Layout);
        S4Layout.setHorizontalGroup(
            S4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        S4Layout.setVerticalGroup(
            S4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(S4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        javax.swing.GroupLayout L5Layout = new javax.swing.GroupLayout(L5);
        L5.setLayout(L5Layout);
        L5Layout.setHorizontalGroup(
            L5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        L5Layout.setVerticalGroup(
            L5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 390, 10));

        javax.swing.GroupLayout L6Layout = new javax.swing.GroupLayout(L6);
        L6.setLayout(L6Layout);
        L6Layout.setHorizontalGroup(
            L6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        L6Layout.setVerticalGroup(
            L6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 390, 10));

        javax.swing.GroupLayout L7Layout = new javax.swing.GroupLayout(L7);
        L7.setLayout(L7Layout);
        L7Layout.setHorizontalGroup(
            L7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        L7Layout.setVerticalGroup(
            L7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(L7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 390, 10));

        javax.swing.GroupLayout L3Layout = new javax.swing.GroupLayout(L3);
        L3.setLayout(L3Layout);
        L3Layout.setHorizontalGroup(
            L3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        L3Layout.setVerticalGroup(
            L3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, -1, 570));

        S5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout S5Layout = new javax.swing.GroupLayout(S5);
        S5.setLayout(S5Layout);
        S5Layout.setHorizontalGroup(
            S5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        S5Layout.setVerticalGroup(
            S5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(S5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, 70));

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

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Save");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout ppLayout = new javax.swing.GroupLayout(pp);
        pp.setLayout(ppLayout);
        ppLayout.setHorizontalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        ppLayout.setVerticalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        getContentPane().add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 710, 100, 50));

        javax.swing.GroupLayout back3Layout = new javax.swing.GroupLayout(back3);
        back3.setLayout(back3Layout);
        back3Layout.setHorizontalGroup(
            back3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        back3Layout.setVerticalGroup(
            back3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        getContentPane().add(back3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 650, 130, 170));

        javax.swing.GroupLayout back4Layout = new javax.swing.GroupLayout(back4);
        back4.setLayout(back4Layout);
        back4Layout.setHorizontalGroup(
            back4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        back4Layout.setVerticalGroup(
            back4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(back4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 770, 120, 50));

        javax.swing.GroupLayout back2Layout = new javax.swing.GroupLayout(back2);
        back2.setLayout(back2Layout);
        back2Layout.setHorizontalGroup(
            back2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        back2Layout.setVerticalGroup(
            back2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        getContentPane().add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 650, 140, 170));

        javax.swing.GroupLayout back1Layout = new javax.swing.GroupLayout(back1);
        back1.setLayout(back1Layout);
        back1Layout.setHorizontalGroup(
            back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        back1Layout.setVerticalGroup(
            back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 650, 120, 50));

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

        getContentPane().add(pp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 760, -1, -1));

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

        getContentPane().add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 700, -1, -1));

        dayline.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout daylineLayout = new javax.swing.GroupLayout(dayline);
        dayline.setLayout(daylineLayout);
        daylineLayout.setHorizontalGroup(
            daylineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        daylineLayout.setVerticalGroup(
            daylineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(dayline, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, 50, 1));

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
        t51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t51KeyPressed(evt);
            }
        });
        getContentPane().add(t51, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 50, 40));

        monthline.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout monthlineLayout = new javax.swing.GroupLayout(monthline);
        monthline.setLayout(monthlineLayout);
        monthlineLayout.setHorizontalGroup(
            monthlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        monthlineLayout.setVerticalGroup(
            monthlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(monthline, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 50, 1));

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
        getContentPane().add(t53, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, 50, 40));

        yearline.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout yearlineLayout = new javax.swing.GroupLayout(yearline);
        yearline.setLayout(yearlineLayout);
        yearlineLayout.setHorizontalGroup(
            yearlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        yearlineLayout.setVerticalGroup(
            yearlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(yearline, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 640, 50, 1));

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t522KeyReleased(evt);
            }
        });
        getContentPane().add(t522, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, 50, 40));

        redp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redp1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                redp1MouseExited(evt);
            }
        });
        redp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/3.png"))); // NOI18N
        jLabel11.setText("jLabel4");
        redp1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 66, 55));

        getContentPane().add(redp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 60, 50));

        blue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/2.png"))); // NOI18N
        pi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                piMouseEntered(evt);
            }
        });
        blue.add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 55));

        getContentPane().add(blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 60, 50));

        background.setForeground(new java.awt.Color(204, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/all.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
       
    }//GEN-LAST:event_t2ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
   
    }//GEN-LAST:event_t4ActionPerformed

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
   
    }//GEN-LAST:event_jLabel3KeyPressed

    private void ppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppMouseClicked
 boolean b1,b2,b3,b4,b6,b7,b8;
 m1=m2=m3=false;
 d1=d2=d3=false;
           if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;}
        else if(this.t1.getText().equals("First name")){this.t1e1.setVisible(true);this.t1.setText("");b1=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++)if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
            if(number==this.t1.getText().length()){this.t1e2.setVisible(false);b1=true;}else{
            this.t1e2.setVisible(true);b1=false;}
            }
         
           if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;}
         else if(this.t2.getText().equals("Last name")){this.t2e1.setVisible(true);this.t2.setText("");b2=false;}
         else{ 
            int number=0;
            for(int i=0;i<this.t2.getText().length();i++)if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
            if(number==this.t2.getText().length()){this.t2e2.setVisible(false);b2=true;}else{
            this.t2e2.setVisible(true);b2=false;}
            }
       
           if(this.t3.getText().equals("")){this.t3e1.setVisible(true);b3=false;}
        else if(this.t3.getText().equals("Employee number")){this.t3e1.setVisible(true);this.t3.setText("");b3=false;}
        else {
            int number=0;int length=0;
            for(int i=0;i<this.t3.getText().length();i++){
                length++;if(Character.isDigit(this.t3.getText().charAt(i)))number++;
            }
            if(number==this.t3.getText().length()&&length==4){this.t3e2.setVisible(false);b3=true;}
            else{this.t3e2.setVisible(true);b3=false;}
        }
         if(this.t4.getText().equals("")){this.t4e.setVisible(true);b4=false;}
        else if(this.t4.getText().equals("Pension")){this.t4e.setVisible(true);this.t4.setText("");b4=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t4.getText().length();i++)if(Character.isAlphabetic(this.t4.getText().charAt(i)))number++;
            if(number==this.t4.getText().length()){this.t4e.setVisible(false);b4=true;}else{
            this.t4e.setVisible(true);b4=false;}
            this.t4e.setVisible(false);b4=true;}
         
            if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);b6=false;d1=false;}
               else if(this.t51.getText().equals("Day")){this.dayline.setBackground(Color.RED);b6=false;d1=false;}
               else{        int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<=31){
                   this.dayline.setBackground(new Color(204,204,204));b6=true;d1=true;}
                   else{this.dayline.setBackground(Color.RED);b6=false;d1=false;}
                       } else{this.dayline.setBackground(Color.RED);b6=false;d1=false;}
               }
        if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);b7=false;d2=false;}
               else if(this.t522.getText().equals("Month")){this.monthline.setBackground(Color.RED);b7=false;d2=false;}
               else{        int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                   this.monthline.setBackground(new Color(204,204,204));b7=true;d2=false;}
                   else{this.monthline.setBackground(Color.RED);b7=false;d2=false;}
                       } else{this.monthline.setBackground(Color.RED);b7=false;d2=false;}
               }
         if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);b8=false;d3=false;}
               else if(this.t53.getText().equals("Year")){
                   this.yearline.setBackground(Color.RED);b8=false;d3=false;}
               else{        int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1980&&Integer.parseInt(this.t53.getText())<2020){
                   this.yearline.setBackground(new Color(204,204,204));b8=true;d3=true;}
                   else{this.yearline.setBackground(Color.RED);b8=false;d3=false;}
                       } else{this.yearline.setBackground(Color.RED);b8=false;d3=false;}
               }
       /////////////////////////////////////////////////////////////////////////////////
         /////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////
         if(b1&&b2&&b3&&b4&&b6&&b7&&b8){
              //////////////////////////////////////////
           
           //raed
           
           ////////////////////////////////////////////////////////////
           boolean f=true;
                  try { EntityManagerFactory emf = Persistence.createEntityManagerFactory("Insurance_1PU");
            EntityManager em=emf.createEntityManager();
                Riterment ret=new Riterment();
                String s1=t1.getText();
                String s2=t2.getText();
                String s3=t3.getText();
                String s4=t4.getText();
                String s5=t51.getText();
                String s6=t522.getText();
                String s7= t53.getText();          
                switch(Integer.parseInt(s6)){
                case 1: s6="JAN"; break; 
                case 2: s6="FEB"; break; 
                case 3: s6="MAR"; break; 
                case 4: s6="APR"; break; 
                case 5: s6="MAY"; break; 
                case 6: s6="JUN"; break; 
                case 7: s6="JUL"; break; 
                case 8: s6="AUG"; break; 
                case 9: s6="SEP"; break; 
                case 10: s6="OCT"; break; 
                case 11: s6="NOV"; break; 
                case 12: s6="DEC"; break; 
                 }
            String s8=s5+"-"+s6+"-"+s7;
            Date date =new Date(s8);
            ret.setFirstName(s1);
            ret.setLastName(s2);
            ret.setEmpNum(Integer.parseInt(s3));
            ret.setPension(Integer.parseInt(s4));
            ret.setRitDate(date);
            em.getTransaction().begin();
            em.persist(ret);
            em.getTransaction().commit();
            em.close();}
                  catch(Exception ex){
                   JOptionPane.showMessageDialog(null,"Employee Ssn Wrong");
                   f=false;
                  }
                  if(f==true){
                      JOptionPane.showMessageDialog(null," Done");
                 t1.setText("First name");
               t2.setText("Last name");
               t3.setText("Employee number");
                 t4.setText("Pension");
                   t51.setText("Day");
                     t522.setText("Month");
                      t53.setText("Year");
                      this.t1.requestFocus(rootPaneCheckingEnabled);
                      dayline.setBackground(new Color(240,240,240));
                      monthline.setBackground(new Color(240,240,240));
                      yearline.setBackground(new Color(240,240,240));
         
                  }

            
           
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

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
       
    }//GEN-LAST:event_t1ActionPerformed

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
    
    }//GEN-LAST:event_t1KeyReleased

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
           if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
            this.t1e1.setVisible(false);m1=true;
            if(this.t1.getText().equals("First name"))
            this.t1.setText("");
        }
             else if(evt.getKeyCode()==KeyEvent.VK_UP){
                  this.t3.requestFocus(rootPaneCheckingEnabled);
                if(this.t1.getText().equals("")&&m1)
                {this.t1.setText("First name");this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
                else if(this.t1.getText().equals("First name")&&m1)this.t1e2.setVisible(false);
             else{
                    if(m1){
                 int number=0;
                 for(int i=0;i<this.t1.getText().length();i++)
                     if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
                 if(number==this.t1.getText().length()){this.t1e2.setVisible(false);}else this.t1e2.setVisible(true);
             }}}
        else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
             this.t2.requestFocus(rootPaneCheckingEnabled);
                if(this.t1.getText().equals("")&&m1)
                {this.t1.setText("First name");this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
                else if(this.t1.getText().equals("First name")&&m1)this.t1e2.setVisible(false);
             else{
                    if(m1){
                 int number=0;
                 for(int i=0;i<this.t1.getText().length();i++)
                     if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
                 if(number==this.t1.getText().length()){this.t1e2.setVisible(false);}else this.t1e2.setVisible(true);}}}
        else{
           this.t2.requestFocus(rootPaneCheckingEnabled);
           if(this.t1.getText().equals("First name")&&m1){ this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
        else    if(this.t1.getText().equals("")&&m1){this.t1.setText("First name");
            this.t1e1.setVisible(false);this.t1e2.setVisible(false);}
       else{
            if(m1){
                 int number=0;
                 for(int i=0;i<this.t1.getText().length();i++)
                     if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
                 if(number==this.t1.getText().length()){this.t1e2.setVisible(false);}else this.t1e2.setVisible(true);
             }}}
    }//GEN-LAST:event_t1KeyPressed

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
          if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
             m2=true;this.t2e1.setVisible(false);
            if(this.t2.getText().equals("Last name"))
            this.t2.setText("");
        }
            else if(evt.getKeyCode()==KeyEvent.VK_UP){
                  this.t1.requestFocus(rootPaneCheckingEnabled);
                if(this.t2.getText().equals("")&&m2)
                {this.t2.setText("Last name");this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
                else if(this.t2.getText().equals("Last name")&&m2)this.t2e2.setVisible(false);
             else{
                    if(m2){
                 int number=0;
                 for(int i=0;i<this.t2.getText().length();i++)
                     if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
                 if(number==this.t2.getText().length()){this.t2e2.setVisible(false);}else this.t2e2.setVisible(true);
             }}
            }
             else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
             this.t3.requestFocus(rootPaneCheckingEnabled);
                if(this.t2.getText().equals("")&&m2)
                {this.t2.setText("Last name");this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
                else if(this.t2.getText().equals("Last name")&&m2)this.t2e2.setVisible(false);
                 else{
                    if(m2){
                  int number=0;
                 for(int i=0;i<this.t2.getText().length();i++)
                     if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
                 if(number==this.t2.getText().length()){this.t2e2.setVisible(false);}else this.t2e2.setVisible(true);
             }}}
          else{
                  this.t3.requestFocus(rootPaneCheckingEnabled);
                  if(this.t2.getText().equals("")&&m2){this.t2.setText("Last name");this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
                  else if(this.t2.getText().equals("Last name")&&m2){this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
                  else{
                      if(m2){
                  int number=0;
                 for(int i=0;i<this.t2.getText().length();i++)
                     if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
                 if(number==this.t2.getText().length()){this.t2e2.setVisible(false);}else this.t2e2.setVisible(true);
             }}
             
             
             }
           
    }//GEN-LAST:event_t2KeyPressed

    private void t3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyPressed
           if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
              m3=true;this.t3e1.setVisible(false);
              int number=0;int length=0;
            if(this.t3.getText().equals("Employee number"))
            this.t3.setText("");
                 if(evt.getKeyCode()==8){   
             for(int i=0;i<this.t3.getText().length();i++){length++;
        if (Character.isDigit(this.t3.getText().charAt(i)))number++;}
         if((number==this.t3.getText().length()&&length==5)){
                  this.t3e2.setVisible(false);}}
         
              for(int i=0;i<this.t3.getText().length();i++){length++;
        if (Character.isDigit(this.t3.getText().charAt(i)))number++;}
         if(number==this.t3.getText().length()&&length==3){
                  this.t3e2.setVisible(false);}
             
              
           
        }
           else if(evt.getKeyCode()==KeyEvent.VK_UP){
                  this.t2.requestFocus(rootPaneCheckingEnabled);
                if(this.t3.getText().equals("")&&m3)
                {this.t3.setText("Employee number");this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
                else if(this.t3.getText().equals("Employee number")&&m3)this.t3e2.setVisible(false);
             else{
                    if(m3){
                 int number=0;int length=0;
                 for(int i=0;i<this.t3.getText().length();i++){length++;
                     if(Character.isDigit(this.t3.getText().charAt(i)))number++;}
                 if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
             }}}
                      else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
                  this.t4.requestFocus(rootPaneCheckingEnabled);
                if(this.t3.getText().equals("")&&m3)
                {this.t3.setText("Employee number");this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
                else if(this.t3.getText().equals("Employee number")&&m3)this.t3e2.setVisible(false);
             else{
                    if(m3){
                 int number=0;int length=0;
                 for(int i=0;i<this.t3.getText().length();i++){length++;
                     if(Character.isDigit(this.t3.getText().charAt(i)))number++;}
                 if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
             }}}
        else{
              this.t4.requestFocus(rootPaneCheckingEnabled);
            if(this.t3.getText().equals("")&&m3)
            {this.t3.setText("Employee number");this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
            else if(this.t3.getText().equals("Employee number")&&m3){this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
            else{
                if(m3){
                  int number=0;int length=0;
                 for(int i=0;i<this.t3.getText().length();i++){length++;
                     if(Character.isDigit(this.t3.getText().charAt(i)))number++;}
                 if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
            }}
        }
    }//GEN-LAST:event_t3KeyPressed

    private void t4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyPressed
         if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
            this.t4e.setVisible(false);m4=true;
            if(this.t4.getText().equals("Pension"))
            this.t4.setText("");
        }
             else if(evt.getKeyCode()==KeyEvent.VK_UP){
                  this.t3.requestFocus(rootPaneCheckingEnabled);
                if(this.t4.getText().equals("")&&m4)
                {this.t4.setText("Pension");this.t4e.setVisible(false);this.t4e.setVisible(false);}
                else if(this.t4.getText().equals("Pension")&&m4)this.t4e.setVisible(false);
             else{
                    if(m4){
                 int number=0;
                 for(int i=0;i<this.t4.getText().length();i++)
                     if(Character.isDigit(this.t4.getText().charAt(i)))number++;
                 if(number==this.t4.getText().length()){this.t4e.setVisible(false);}else this.t4e.setVisible(true);
             }}}
        else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
             this.t1.requestFocus(rootPaneCheckingEnabled);
                if(this.t4.getText().equals("")&&m4)
                {this.t4.setText("Pension");this.t4e.setVisible(false);this.t4e.setVisible(false);}
                else if(this.t4.getText().equals("Pension")&&m4)this.t4e.setVisible(false);
             else{
                    if(m4){
                 int number=0;
                 for(int i=0;i<this.t4.getText().length();i++)
                     if(Character.isDigit(this.t4.getText().charAt(i)))number++;
                 if(number==this.t4.getText().length()){this.t4e.setVisible(false);}else this.t4e.setVisible(true);}}}
        else{
        this.t51.requestFocus(rootPaneCheckingEnabled);
           if(this.t4.getText().equals("Pension")&&m4){ this.t4e.setVisible(false);this.t4e.setVisible(false);}
        else    if(this.t4.getText().equals("")&&m4){this.t4.setText("Pension");
            this.t4e.setVisible(false);this.t4e.setVisible(false);}
       else{
            if(m4){
                 int number=0;
                 for(int i=0;i<this.t4.getText().length();i++)
                     if(Character.isDigit(this.t4.getText().charAt(i)))number++;
                 if(number==this.t4.getText().length()){this.t4e.setVisible(false);}else this.t4e.setVisible(true);
             }}}
    }//GEN-LAST:event_t4KeyPressed

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
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<31){
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
                   if(Integer.parseInt(this.t53.getText())>1980&&Integer.parseInt(this.t53.getText())<2021){
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
                   if(Integer.parseInt(this.t53.getText())>1980&&Integer.parseInt(this.t53.getText())<2020){
                   this.yearline.setBackground(new Color(204,204,204));d3=true;}
                   else{this.yearline.setBackground(Color.RED);}
                       } else{this.yearline.setBackground(Color.RED);}
               }
                      
      
            }
              else{
                   boolean b1,b2,b3,b4,b6,b7,b8;
                   m1=m2=m3=false;
 d1=d2=d3=false;
 
           if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;}
        else if(this.t1.getText().equals("First name")){this.t1e1.setVisible(true);this.t1.setText("");b1=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++)if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
            if(number==this.t1.getText().length()){this.t1e2.setVisible(false);b1=true;}else{
            this.t1e2.setVisible(true);b1=false;}
            }
         
           if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;}
         else if(this.t2.getText().equals("Last name")){this.t2e1.setVisible(true);this.t2.setText("");b2=false;}
         else{ 
            int number=0;
            for(int i=0;i<this.t2.getText().length();i++)if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
            if(number==this.t2.getText().length()){this.t2e2.setVisible(false);b2=true;}else{
            this.t2e2.setVisible(true);b2=false;}
           }
       
           if(this.t3.getText().equals("")){this.t3e1.setVisible(true);b3=false;}
        else if(this.t3.getText().equals("Employee number")){this.t3e1.setVisible(true);this.t3.setText("");b3=false;}
        else {
            int number=0;int length=0;
            for(int i=0;i<this.t3.getText().length();i++){
                length++;if(Character.isDigit(this.t3.getText().charAt(i)))number++;
            }
            if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);b3=true;}
            else{this.t3e2.setVisible(true);b3=false;}
        }
         if(this.t4.getText().equals("")){this.t4e.setVisible(true);b4=false;}
        else if(this.t4.getText().equals("Pension")){this.t4e.setVisible(true);this.t4.setText("");b4=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t4.getText().length();i++)if(Character.isAlphabetic(this.t4.getText().charAt(i)))number++;
            if(number==this.t4.getText().length()){this.t4e.setVisible(false);b4=true;}else{
            this.t4e.setVisible(true);b4=false;}
            this.t4e.setVisible(false);b4=true;}
         
            if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);b6=false;d1=false;}
               else if(this.t51.getText().equals("Day")){this.dayline.setBackground(Color.RED);b6=false;d1=false;}
               else{        int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<=31){
                   this.dayline.setBackground(new Color(204,204,204));b6=true;d1=true;}
                   else{this.dayline.setBackground(Color.RED);b6=false;d1=false;}
                       } else{this.dayline.setBackground(Color.RED);b6=false;d1=false;}
               }
        if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);b7=false;d2=false;}
               else if(this.t522.getText().equals("Month")){this.monthline.setBackground(Color.RED);b7=false;d2=false;}
               else{        int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                   this.monthline.setBackground(new Color(204,204,204));b7=true;d2=false;}
                   else{this.monthline.setBackground(Color.RED);b7=false;d2=false;}
                       } else{this.monthline.setBackground(Color.RED);b7=false;d2=false;}
               }
         if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);b8=false;d3=false;}
               else if(this.t53.getText().equals("Year")){this.yearline.setBackground(Color.RED);b8=false;d3=false;}
               else{        int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1980&&Integer.parseInt(this.t53.getText())<2020){
                   this.yearline.setBackground(new Color(204,204,204));b8=true;d3=true;}
                   else{this.yearline.setBackground(Color.RED);b8=false;d3=false;}
                       } else{this.yearline.setBackground(Color.RED);b8=false;d3=false;}
               }
          /////////////////////////////////////////////////////////////////////////////////
         /////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////
         if(b1&&b2&&b3&&b4&&b6&&b7&&b8){
           
                 //////////////////////////////////////////
           
           //raed
           
           ////////////////////////////////////////////////////////////
           
           
              boolean f=true;
                  try { EntityManagerFactory emf = Persistence.createEntityManagerFactory("Insurance_1PU");
            EntityManager em=emf.createEntityManager();
                Riterment ret=new Riterment();
                String s1=t1.getText();
                String s2=t2.getText();
                String s3=t3.getText();
                String s4=t4.getText();
                String s5=t51.getText();
                String s6=t522.getText();
                String s7= t53.getText();          
                switch(Integer.parseInt(s6)){
                case 1: s6="JAN"; break; 
                case 2: s6="FEB"; break; 
                case 3: s6="MAR"; break; 
                case 4: s6="APR"; break; 
                case 5: s6="MAY"; break; 
                case 6: s6="JUN"; break; 
                case 7: s6="JUL"; break; 
                case 8: s6="AUG"; break; 
                case 9: s6="SEP"; break; 
                case 10: s6="OCT"; break; 
                case 11: s6="NOV"; break; 
                case 12: s6="DEC"; break; 
                 }
            String s8=s5+"-"+s6+"-"+s7;
            Date date =new Date(s8);
            ret.setFirstName(s1);
            ret.setLastName(s2);
            ret.setEmpNum(Integer.parseInt(s3));
            ret.setPension(Integer.parseInt(s4));
            ret.setRitDate(date);
            em.getTransaction().begin();
            em.persist(ret);
            em.getTransaction().commit();
            em.close();}
                  catch(Exception ex){
                   JOptionPane.showMessageDialog(null,"Employee Ssn Wrong");
                   f=false;
                  }
                  if(f==true){
                      JOptionPane.showMessageDialog(null," Done");
                 t1.setText("First name");
               t2.setText("Last name");
               t3.setText("Employee number");
                 t4.setText("Pension");
                   t51.setText("Day");
                     t522.setText("Month");
                      t53.setText("Year");
                      this.t1.requestFocus(rootPaneCheckingEnabled);
                      dayline.setBackground(new Color(240,240,240));
                      monthline.setBackground(new Color(240,240,240));
                      yearline.setBackground(new Color(240,240,240));
         
                  }
         }
              }
    }//GEN-LAST:event_t53KeyPressed

    private void t522KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t522KeyReleased
        
    }//GEN-LAST:event_t522KeyReleased

    private void t51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t51MouseExited
       
  if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);this.t51.setText("Day");d1=false;}
               else if(this.t51.getText().equals("Day")&&d1)this.dayline.setBackground(new Color(204,204,204));
               else{        int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<31){
                   this.dayline.setBackground(new Color(204,204,204));d1=true;}
                   else{this.dayline.setBackground(Color.RED);}
                       } else{this.dayline.setBackground(Color.RED);}}        
    }//GEN-LAST:event_t51MouseExited

    private void t522MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t522MouseExited
  if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);this.t522.setText("Month");d2=false;}
                else if(this.t522.getText().equals("Month")&&d2)this.monthline.setBackground(new Color(204,204,204));
               else{        int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                     
                   this.monthline.setBackground(new Color(204,204,204));d2=true;}
                   else{this.monthline.setBackground(Color.RED);}
                       } else{this.monthline.setBackground(Color.RED);}}    }//GEN-LAST:event_t522MouseExited

    private void t53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t53MouseExited
   if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);this.t53.setText("Year");d3=false;}
                else if(this.t53.getText().equals("Year")&&d3)this.yearline.setBackground(new Color(204,204,204));
               else{        int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1980&&Integer.parseInt(this.t53.getText())<2021){
                   this.yearline.setBackground(new Color(204,204,204));d3=true;}
                   else{this.yearline.setBackground(Color.RED);}
                       } else{this.yearline.setBackground(Color.RED);}
               }    }//GEN-LAST:event_t53MouseExited

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
                    
                    }}      }//GEN-LAST:event_t1MouseExited

    private void t2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseExited
 if(this.t2.getText().equals("")&&m2)
                {this.t2.setText("Last name");this.t2e1.setVisible(false);this.t2e2.setVisible(false);}
                else if(this.t2.getText().equals("Last name")&&m2)this.t2e2.setVisible(false);
             else{
                    if(m2){
                 int number=0;
                 for(int i=0;i<this.t2.getText().length();i++)
                     if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
                 if(number==this.t2.getText().length()){this.t2e2.setVisible(false);}else this.t2e2.setVisible(true);
                    
                    }}     }//GEN-LAST:event_t2MouseExited

    private void t3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3MouseExited
   if(this.t3.getText().equals("")&&m3)
                {this.t3.setText("Employee number");this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
                else if(this.t3.getText().equals("Employee number")&&m3)this.t3e2.setVisible(false);
             else{
                    if(m3){
                 int number=0;int length=0;
                 for(int i=0;i<this.t3.getText().length();i++){length++;
                     if(Character.isDigit(this.t3.getText().charAt(i)))number++;}
                 if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
             }}        }//GEN-LAST:event_t3MouseExited

    private void t4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4MouseExited
  if(this.t4.getText().equals("")&&m4)
                {this.t4.setText("Pension");this.t4e.setVisible(false);this.t4e.setVisible(false);}
                else if(this.t4.getText().equals("Pension")&&m4)this.t4e.setVisible(false);
             else{
                    if(m4){
                 int number=0;
                 for(int i=0;i<this.t4.getText().length();i++)
                     if(Character.isDigit(this.t4.getText().charAt(i)))number++;
                 if(number==this.t4.getText().length()){this.t4e.setVisible(false);}else this.t4e.setVisible(true);}}
            
       
    }//GEN-LAST:event_t4MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
 boolean b1,b2,b3,b4,b6,b7,b8;
 m1=m2=m3=false;
 d1=d2=d3=false;
           if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;}
        else if(this.t1.getText().equals("First name")){this.t1e1.setVisible(true);this.t1.setText("");b1=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++)if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
            if(number==this.t1.getText().length()){this.t1e2.setVisible(false);b1=true;}else{
            this.t1e2.setVisible(true);b1=false;}
           }
         
           if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;}
         else if(this.t2.getText().equals("Last name")){this.t2e1.setVisible(true);this.t2.setText("");b2=false;}
         else{ 
            int number=0;
            for(int i=0;i<this.t2.getText().length();i++)if(Character.isAlphabetic(this.t2.getText().charAt(i)))number++;
            if(number==this.t2.getText().length()){this.t2e2.setVisible(false);b2=true;}else{
            this.t2e2.setVisible(true);b2=false;}
            }
       
           if(this.t3.getText().equals("")){this.t3e1.setVisible(true);b3=false;}
        else if(this.t3.getText().equals("Employee number")){this.t3e1.setVisible(true);this.t3.setText("");b3=false;}
        else {
            int number=0;int length=0;
            for(int i=0;i<this.t3.getText().length();i++){
                length++;if(Character.isDigit(this.t3.getText().charAt(i)))number++;
            }
            if(number==this.t3.getText().length()&&length==9){this.t3e2.setVisible(false);b3=true;}
            else{this.t3e2.setVisible(true);b3=false;}
        }
         if(this.t4.getText().equals("")){this.t4e.setVisible(true);b4=false;}
        else if(this.t4.getText().equals("Pension")){this.t4e.setVisible(true);this.t4.setText("");b4=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t4.getText().length();i++)if(Character.isAlphabetic(this.t4.getText().charAt(i)))number++;
            if(number==this.t4.getText().length()){this.t4e.setVisible(false);b4=true;}else{
            this.t4e.setVisible(true);b4=false;}
          }
         
            if(this.t51.getText().equals("")){this.dayline.setBackground(Color.RED);b6=false;d1=false;}
               else if(this.t51.getText().equals("Day")){this.dayline.setBackground(Color.RED);b6=false;d1=false;}
               else{        int number=0;
              for(int i=0;i<this.t51.getText().length();i++)if(Character.isDigit(this.t51.getText().charAt(i)))number++;  
               if(number==this.t51.getText().length()){
                   if(Integer.parseInt(this.t51.getText())>=1&&Integer.parseInt(this.t51.getText())<=31){
                   this.dayline.setBackground(new Color(204,204,204));b6=true;d1=true;}
                   else{this.dayline.setBackground(Color.RED);b6=false;d1=false;}
                       } else{this.dayline.setBackground(Color.RED);b6=false;d1=false;}
               }
        if(this.t522.getText().equals("")){this.monthline.setBackground(Color.RED);b7=false;d2=false;}
               else if(this.t522.getText().equals("Month")){this.monthline.setBackground(Color.RED);b7=false;d2=false;}
               else{        int number=0;
              for(int i=0;i<this.t522.getText().length();i++)if(Character.isDigit(this.t522.getText().charAt(i)))number++;  
               if(number==this.t522.getText().length()){
                   if(Integer.parseInt(this.t522.getText())>=1&&Integer.parseInt(this.t522.getText())<=12){
                   this.monthline.setBackground(new Color(204,204,204));b7=true;d2=false;}
                   else{this.monthline.setBackground(Color.RED);b7=false;d2=false;}
                       } else{this.monthline.setBackground(Color.RED);b7=false;d2=false;}
               }
         if(this.t53.getText().equals("")){this.yearline.setBackground(Color.RED);b8=false;d3=false;}
               else if(this.t53.getText().equals("Year")){this.yearline.setBackground(Color.RED);b8=false;d3=false;}
               else{        int number=0;
              for(int i=0;i<this.t53.getText().length();i++)if(Character.isDigit(this.t53.getText().charAt(i)))number++;  
               if(number==this.t53.getText().length()){
                   if(Integer.parseInt(this.t53.getText())>1980&&Integer.parseInt(this.t53.getText())<2040){
                   this.yearline.setBackground(new Color(204,204,204));b8=true;d3=true;}
                   else{this.yearline.setBackground(Color.RED);b8=false;d3=false;}
                       } else{this.yearline.setBackground(Color.RED);b8=false;d3=false;}
               }
           /////////////////////////////////////////////////////////////////////////////////
         /////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////
         if(b1&&b2&&b3&&b4&&b6&&b7&&b8){
           //////////////////////////////////////////
           
           //raed
           
           ////////////////////////////////////////////////////////////
           
           
               boolean f=true;
                  try { EntityManagerFactory emf = Persistence.createEntityManagerFactory("Insurance_1PU");
            EntityManager em=emf.createEntityManager();
                Riterment ret=new Riterment();
                String s1=t1.getText();
                String s2=t2.getText();
                String s3=t3.getText();
                String s4=t4.getText();
                String s5=t51.getText();
                String s6=t522.getText();
                String s7= t53.getText();          
                switch(Integer.parseInt(s6)){
                case 1: s6="JAN"; break; 
                case 2: s6="FEB"; break; 
                case 3: s6="MAR"; break; 
                case 4: s6="APR"; break; 
                case 5: s6="MAY"; break; 
                case 6: s6="JUN"; break; 
                case 7: s6="JUL"; break; 
                case 8: s6="AUG"; break; 
                case 9: s6="SEP"; break; 
                case 10: s6="OCT"; break; 
                case 11: s6="NOV"; break; 
                case 12: s6="DEC"; break; 
                 }
            String s8=s5+"-"+s6+"-"+s7;
            Date date =new Date(s8);
            ret.setFirstName(s1);
            ret.setLastName(s2);
            ret.setEmpNum(Integer.parseInt(s3));
            ret.setPension(Integer.parseInt(s4));
            ret.setRitDate(date);
            em.getTransaction().begin();
            em.persist(ret);
            em.getTransaction().commit();
            em.close();}
                  catch(Exception ex){
                   JOptionPane.showMessageDialog(null,"Employee Ssn Wrong");
                   f=false;
                  }
                  if(f==true){
                      JOptionPane.showMessageDialog(null," Done");
                 t1.setText("First name");
               t2.setText("Last name");
               t3.setText("Employee number");
                 t4.setText("Pension");
                   t51.setText("Day");
                     t522.setText("Month");
                      t53.setText("Year");
                      this.t1.requestFocus(rootPaneCheckingEnabled);
                      dayline.setBackground(new Color(240,240,240));
                      monthline.setBackground(new Color(240,240,240));
                      yearline.setBackground(new Color(240,240,240));
         
                  }

          
         }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void t2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MousePressed
  
    }//GEN-LAST:event_t2MousePressed

    private void piMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_piMouseEntered
        blue.setVisible(false);
        redp1.setVisible(true);
    }//GEN-LAST:event_piMouseEntered

    private void redp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redp1MouseClicked
        // TODO add your handling code hereset
        setVisible(false);
    }//GEN-LAST:event_redp1MouseClicked

    private void redp1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redp1MouseExited
        redp1.setVisible(false);
        blue.setVisible(true);
    }//GEN-LAST:event_redp1MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
      this.pp1.setOpaque(false);
        this.pp1.repaint();
        this.pp2.setOpaque(false);
        this.pp2.repaint();
        this.pp3.setOpaque(false);
        this.pp3.repaint();
        this.pp4.setOpaque(false);
        this.pp4.repaint();
    }//GEN-LAST:event_jLabel3MouseEntered

   
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oldman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel L1;
    private javax.swing.JPanel L2;
    private javax.swing.JPanel L3;
    private javax.swing.JPanel L4;
    private javax.swing.JPanel L5;
    private javax.swing.JPanel L6;
    private javax.swing.JPanel L7;
    private javax.swing.JPanel S1;
    private javax.swing.JPanel S2;
    private javax.swing.JPanel S3;
    private javax.swing.JPanel S4;
    private javax.swing.JPanel S5;
    private javax.swing.JPanel back1;
    private javax.swing.JPanel back2;
    private javax.swing.JPanel back3;
    private javax.swing.JPanel back4;
    private javax.swing.JLabel background;
    private javax.swing.JPanel blue;
    private javax.swing.JPanel dayline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel monthline;
    private javax.swing.JLabel pi;
    private javax.swing.JPanel pp;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JPanel pp3;
    private javax.swing.JPanel pp4;
    private javax.swing.JPanel redp1;
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
    private javax.swing.JLabel t4e;
    private javax.swing.JTextField t51;
    private javax.swing.JTextField t522;
    private javax.swing.JTextField t53;
    private javax.swing.JPanel title;
    private javax.swing.JPanel yearline;
    // End of variables declaration//GEN-END:variables
}
