
package insurance;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Pay_employee extends javax.swing.JFrame {

   
    boolean click =true;
    boolean m1,m2,m3,m4;
    public Pay_employee() {
        initComponents();
        m1=m2=m3=m4=false;
    
         this.background.setSize(this.getWidth(), this.getHeight());
         this.title.setBackground(new Color(0,0,0,100));
         this.s1.setBackground(new Color(255,255,255,100));
         this.s2.setBackground(new Color(255,255,255,100));
         this.s3.setBackground(new Color(255,255,255,100));
         this.s4.setBackground(new Color(255,255,255,100));
         redp.setVisible(false);
         this.l1.setBackground(new Color(0,0,0,100));
         this.l2.setBackground(new Color(0,0,0,100));
         this.l3.setBackground(new Color(0,0,0,100));
         this.l4.setBackground(new Color(0,0,0,100));
         this.l5.setBackground(new Color(0,0,0,100));
         this.l6.setBackground(new Color(0,0,0,100));
         this.l7.setBackground(new Color(0,0,0,100));
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
           setLocation(300, 10);
         
                           
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        s1 = new javax.swing.JPanel();
        s2 = new javax.swing.JPanel();
        s3 = new javax.swing.JPanel();
        s4 = new javax.swing.JPanel();
        l5 = new javax.swing.JPanel();
        l2 = new javax.swing.JPanel();
        l1 = new javax.swing.JPanel();
        l4 = new javax.swing.JPanel();
        l3 = new javax.swing.JPanel();
        l6 = new javax.swing.JPanel();
        l7 = new javax.swing.JPanel();
        t1e1 = new javax.swing.JLabel();
        t2e1 = new javax.swing.JLabel();
        t3e1 = new javax.swing.JLabel();
        t2e2 = new javax.swing.JLabel();
        t1e2 = new javax.swing.JLabel();
        t3e2 = new javax.swing.JLabel();
        t4e = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        pp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        back2 = new javax.swing.JPanel();
        back3 = new javax.swing.JPanel();
        back1 = new javax.swing.JPanel();
        back4 = new javax.swing.JPanel();
        pp1 = new javax.swing.JPanel();
        pp2 = new javax.swing.JPanel();
        pp3 = new javax.swing.JPanel();
        pp4 = new javax.swing.JPanel();
        redp = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        blue = new javax.swing.JPanel();
        pi = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setToolTipText("Member Login");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Payment");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 410, 80));

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

        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

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

        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

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

        getContentPane().add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

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

        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, -1));

        javax.swing.GroupLayout l5Layout = new javax.swing.GroupLayout(l5);
        l5.setLayout(l5Layout);
        l5Layout.setHorizontalGroup(
            l5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        l5Layout.setVerticalGroup(
            l5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        javax.swing.GroupLayout l2Layout = new javax.swing.GroupLayout(l2);
        l2.setLayout(l2Layout);
        l2Layout.setHorizontalGroup(
            l2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        l2Layout.setVerticalGroup(
            l2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

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

        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 390, -1));

        javax.swing.GroupLayout l4Layout = new javax.swing.GroupLayout(l4);
        l4.setLayout(l4Layout);
        l4Layout.setHorizontalGroup(
            l4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        l4Layout.setVerticalGroup(
            l4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, 10, 510));

        javax.swing.GroupLayout l3Layout = new javax.swing.GroupLayout(l3);
        l3.setLayout(l3Layout);
        l3Layout.setHorizontalGroup(
            l3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        l3Layout.setVerticalGroup(
            l3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 10, 510));

        javax.swing.GroupLayout l6Layout = new javax.swing.GroupLayout(l6);
        l6.setLayout(l6Layout);
        l6Layout.setHorizontalGroup(
            l6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        l6Layout.setVerticalGroup(
            l6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 390, -1));

        javax.swing.GroupLayout l7Layout = new javax.swing.GroupLayout(l7);
        l7.setLayout(l7Layout);
        l7Layout.setHorizontalGroup(
            l7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        l7Layout.setVerticalGroup(
            l7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 390, -1));

        t1e1.setForeground(new java.awt.Color(204, 255, 255));
        t1e1.setText(" First name is requred");
        getContentPane().add(t1e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 140, -1));

        t2e1.setForeground(new java.awt.Color(204, 255, 255));
        t2e1.setText("  Last name is requred");
        getContentPane().add(t2e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 140, -1));

        t3e1.setForeground(new java.awt.Color(204, 255, 255));
        t3e1.setText("number is requred");
        getContentPane().add(t3e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 120, -1));

        t2e2.setForeground(new java.awt.Color(204, 255, 255));
        t2e2.setText("Last name just alphabets");
        getContentPane().add(t2e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 140, -1));

        t1e2.setForeground(new java.awt.Color(204, 255, 255));
        t1e2.setText("First name just alphabets");
        getContentPane().add(t1e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 150, -1));

        t3e2.setForeground(new java.awt.Color(204, 255, 255));
        t3e2.setText("Employee number is 4 numbers");
        getContentPane().add(t3e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 190, -1));

        t4e.setForeground(new java.awt.Color(204, 255, 255));
        t4e.setText("Amount is requred");
        getContentPane().add(t4e, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 120, -1));

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
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 260, 322, 70));

        t2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(204, 204, 204));
        t2.setText("Last name");
        t2.setBorder(null);
        t2.setOpaque(false);
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t2MouseExited(evt);
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
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 322, 70));

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
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 420, 322, 70));

        t4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(204, 204, 204));
        t4.setText("Amount paid");
        t4.setBorder(null);
        t4.setOpaque(false);
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t4MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                t4MouseReleased(evt);
            }
        });
        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t4KeyPressed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 500, 322, 70));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ppLayout.setVerticalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, 100, -1));

        javax.swing.GroupLayout back2Layout = new javax.swing.GroupLayout(back2);
        back2.setLayout(back2Layout);
        back2Layout.setHorizontalGroup(
            back2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        back2Layout.setVerticalGroup(
            back2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 680, 390, 80));

        javax.swing.GroupLayout back3Layout = new javax.swing.GroupLayout(back3);
        back3.setLayout(back3Layout);
        back3Layout.setHorizontalGroup(
            back3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        back3Layout.setVerticalGroup(
            back3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(back3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 130, 100));

        javax.swing.GroupLayout back1Layout = new javax.swing.GroupLayout(back1);
        back1.setLayout(back1Layout);
        back1Layout.setHorizontalGroup(
            back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        back1Layout.setVerticalGroup(
            back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 140, -1));

        javax.swing.GroupLayout back4Layout = new javax.swing.GroupLayout(back4);
        back4.setLayout(back4Layout);
        back4Layout.setHorizontalGroup(
            back4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        back4Layout.setVerticalGroup(
            back4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(back4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 120, 30));

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

        getContentPane().add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 610, -1, -1));

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

        getContentPane().add(pp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 670, -1, -1));

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

        getContentPane().add(pp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 610, -1, -1));

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

        getContentPane().add(pp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, -1, -1));

        redp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redpMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                redpMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/3.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout redpLayout = new javax.swing.GroupLayout(redp);
        redp.setLayout(redpLayout);
        redpLayout.setHorizontalGroup(
            redpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redpLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        redpLayout.setVerticalGroup(
            redpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redpLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(redp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 60, -1));

        blue.setLayout(null);

        pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/2.png"))); // NOI18N
        pi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                piMouseEntered(evt);
            }
        });
        blue.add(pi);
        pi.setBounds(0, 0, 60, 55);

        getContentPane().add(blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 60, 50));

        background.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/insurance/all.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
     
    }//GEN-LAST:event_t1ActionPerformed

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
 
    }//GEN-LAST:event_jLabel3KeyPressed

    private void ppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppMouseClicked
      boolean b1,b2,b3,b4;
      m1=m2=m3=m4=false;
        if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;}
        else if(this.t1.getText().equals("First name")){this.t1e1.setVisible(true);this.t1.setText("");b1=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++)if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
            if(number==this.t1.getText().length()){this.t1e2.setVisible(false);b1=true;}else{
            this.t1e2.setVisible(true);b1=false;}
           }
        
        if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;this.t2e2.setVisible(false);}
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
        else if(this.t4.getText().equals("Amount paid")){this.t4e.setVisible(true);this.t4.setText("");b4=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t4.getText().length();i++)if(Character.isDigit(this.t4.getText().charAt(i)))number++;
            if(number==this.t4.getText().length()){this.t4e.setVisible(false);b4=true;}else{
            this.t4e.setVisible(true);b4=false;}
         }
        
       //////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
      if(b1&&b2&&b3&&b4){
           ////////////////////////////////////////////////////
          
          
          //raed
          
          ///////////////////////////////////////////////////
          this.t1.setText("First name");
          this.t2.setText("Last name");
          this.t3.setText("Employee number");
          this.t4.setText("Amount paid");
         this.t1.requestFocus(rootPaneCheckingEnabled);
        this.t1e1.setVisible(false);
         this.t2e1.setVisible(false);
         this.t3e1.setVisible(false);
         this.t4e.setVisible(false);
         this.t1e2.setVisible(false);
         this.t2e2.setVisible(false);
         this.t3e2.setVisible(false);  m1=m2=m3=m4=false;
         click =true;
         JOptionPane.showMessageDialog(null," Succesd");
         
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

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
     
    }//GEN-LAST:event_t2ActionPerformed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
          if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
            this.t1e1.setVisible(false);m1=true;
            if(this.t1.getText().equals("First name"))
            this.t1.setText("");
        }
             else if(evt.getKeyCode()==KeyEvent.VK_UP){
                  this.t4.requestFocus(rootPaneCheckingEnabled);
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
             }}}
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
    }//GEN-LAST:event_t2KeyPressed

    private void t3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyPressed
      if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
              m3=true;this.t3e1.setVisible(false);
           
            if(this.t3.getText().equals("Employee number"))
            this.t3.setText("");
              int number=0;int length=0;
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
                 if(number==this.t3.getText().length()&&length==4){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
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
                 if(number==this.t3.getText().length()&&length==4){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
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
                 if(number==this.t3.getText().length()&&length==4){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
                } }
        }
    }//GEN-LAST:event_t3KeyPressed

    private void t4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyPressed
              if(evt.getKeyCode()!=KeyEvent.VK_ENTER&&evt.getKeyCode()!=KeyEvent.VK_UP&&
                   evt.getKeyCode()!=KeyEvent.VK_DOWN){
             m4=true;this.t4e.setVisible(false);
            if(this.t4.getText().equals("Amount paid"))
            this.t4.setText("");
        }
            else if(evt.getKeyCode()==KeyEvent.VK_UP){
                  this.t3.requestFocus(rootPaneCheckingEnabled);
                if(this.t4.getText().equals("")&&m4)
                {this.t4.setText("Amount paid");this.t4e.setVisible(false);this.t4e.setVisible(false);}
                else if(this.t4.getText().equals("Amount paid")&&m4)this.t4e.setVisible(false);
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
                {this.t4.setText("Amount paid");this.t4e.setVisible(false);this.t4e.setVisible(false);}
                else if(this.t4.getText().equals("Amount paid")&&m4)this.t4e.setVisible(false);
              else{
                    if(m4){
                  int number=0;
                 for(int i=0;i<this.t4.getText().length();i++)
                     if(Character.isDigit(this.t4.getText().charAt(i)))number++;
                 if(number==this.t4.getText().length()){this.t4e.setVisible(false);}else this.t4e.setVisible(true);}}}
          else{
                  
                         boolean b1,b2,b3,b4;
                          m1=m2=m3=m4=false;

        if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;}
        else if(this.t1.getText().equals("First name")){this.t1e1.setVisible(true);this.t1.setText("");b1=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++)if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
            if(number==this.t1.getText().length()){this.t1e2.setVisible(false);b1=true;}else{
            this.t1e2.setVisible(true);b1=false;}
           }
        
        if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;this.t2e2.setVisible(false);}
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
        else if(this.t4.getText().equals("Amount paid")){this.t4e.setVisible(true);this.t4.setText("");b4=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t4.getText().length();i++)if(Character.isDigit(this.t4.getText().charAt(i)))number++;
            if(number==this.t4.getText().length()){this.t4e.setVisible(false);b4=true;}else{
            this.t4e.setVisible(true);b4=false;}
           }
        
      //////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
      if(b1&&b2&&b3&&b4){
           ////////////////////////////////////////////////////
          
          
          //raed
          
          ///////////////////////////////////////////////////
          this.t1.setText("First name");
          this.t2.setText("Last name");
          this.t3.setText("Employee number");
          this.t4.setText("Amount paid");
         this.t1.requestFocus(rootPaneCheckingEnabled);
        this.t1e1.setVisible(false);
         this.t2e1.setVisible(false);
         this.t3e1.setVisible(false);
         this.t4e.setVisible(false);
         this.t1e2.setVisible(false);
         this.t2e2.setVisible(false);
         this.t3e2.setVisible(false);  m1=m2=m3=m4=false;
         click =true;
         JOptionPane.showMessageDialog(null," Succesd");
         
             
             }}
    }//GEN-LAST:event_t4KeyPressed

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
                    }  }    }//GEN-LAST:event_t1MouseExited

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
             }}    }//GEN-LAST:event_t2MouseExited

    private void t3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3MouseExited
  if(this.t3.getText().equals("")&&m3)
                {this.t3.setText("Employee number");this.t3e1.setVisible(false);this.t3e2.setVisible(false);}
                else if(this.t3.getText().equals("Employee number")&&m3)this.t3e2.setVisible(false);
              else{
                    if(m3){
                 int number=0;int length=0;
                 for(int i=0;i<this.t3.getText().length();i++){length++;
                     if(Character.isDigit(this.t3.getText().charAt(i)))number++;}
                 if(number==this.t3.getText().length()&&length==4){this.t3e2.setVisible(false);}else this.t3e2.setVisible(true);
             }}    }//GEN-LAST:event_t3MouseExited

    private void t4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4MouseExited
 if(this.t4.getText().equals("")&&m4)
                {this.t4.setText("Amount paid");this.t4e.setVisible(false);this.t4e.setVisible(false);}
                else if(this.t4.getText().equals("Amount paid")&&m4)this.t4e.setVisible(false);
             else{
                    if(m4){
                 int number=0;
                 for(int i=0;i<this.t4.getText().length();i++)
                     if(Character.isDigit(this.t4.getText().charAt(i)))number++;
                 if(number==this.t4.getText().length()){this.t4e.setVisible(false);}else this.t4e.setVisible(true);
             }}    }//GEN-LAST:event_t4MouseExited

    private void t4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4MouseReleased
        
    }//GEN-LAST:event_t4MouseReleased

    private void t4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4MouseEntered
      
    }//GEN-LAST:event_t4MouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
          boolean b1,b2,b3,b4;
         m1=m2=m3=m4=false;
        if(this.t1.getText().equals("")){this.t1e1.setVisible(true);b1=false;}
        else if(this.t1.getText().equals("First name")){this.t1e1.setVisible(true);this.t1.setText("");b1=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t1.getText().length();i++)if(Character.isAlphabetic(this.t1.getText().charAt(i)))number++;
            if(number==this.t1.getText().length()){this.t1e2.setVisible(false);b1=true;}else{
            this.t1e2.setVisible(true);b1=false;}
           }
        
        if(this.t2.getText().equals("")){this.t2e1.setVisible(true);b2=false;this.t2e2.setVisible(false);}
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
        else if(this.t4.getText().equals("Amount paid")){this.t4e.setVisible(true);this.t4.setText("");b4=false;}
        else{ 
            int number=0;
            for(int i=0;i<this.t4.getText().length();i++)if(Character.isDigit(this.t4.getText().charAt(i)))number++;
            if(number==this.t4.getText().length()){this.t4e.setVisible(false);b4=true;}else{
            this.t4e.setVisible(true);b4=false;}
            }
        
        //////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
      if(b1&&b2&&b3&&b4){
          
          
          ////////////////////////////////////////////////////
          
          
          //raed
          
          ///////////////////////////////////////////////////
          this.t1.setText("First name");
          this.t2.setText("Last name");
          this.t3.setText("Employee number");
          this.t4.setText("Amount paid");
         this.t1.requestFocus(rootPaneCheckingEnabled);
        this.t1e1.setVisible(false);
         this.t2e1.setVisible(false);
         this.t3e1.setVisible(false);
         this.t4e.setVisible(false);
         this.t1e2.setVisible(false);
         this.t2e2.setVisible(false);
         this.t3e2.setVisible(false);  m1=m2=m3=m4=false;
         click =true;
         JOptionPane.showMessageDialog(null," Succesd");
         
      }
    }//GEN-LAST:event_jLabel3MouseClicked

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
                new Pay_employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back1;
    private javax.swing.JPanel back2;
    private javax.swing.JPanel back3;
    private javax.swing.JPanel back4;
    private javax.swing.JLabel background;
    private javax.swing.JPanel blue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel l1;
    private javax.swing.JPanel l2;
    private javax.swing.JPanel l3;
    private javax.swing.JPanel l4;
    private javax.swing.JPanel l5;
    private javax.swing.JPanel l6;
    private javax.swing.JPanel l7;
    private javax.swing.JLabel pi;
    private javax.swing.JPanel pp;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JPanel pp3;
    private javax.swing.JPanel pp4;
    private javax.swing.JPanel redp;
    private javax.swing.JPanel s1;
    private javax.swing.JPanel s2;
    private javax.swing.JPanel s3;
    private javax.swing.JPanel s4;
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
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
