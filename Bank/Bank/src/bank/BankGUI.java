/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.awt.Color;

/**
 *
 * @author Shivam Agrawal
 */
public class BankGUI extends java.awt.Frame {

    /**
     * Creates new form BankGUI
     */
    public BankGUI() {
        initComponents();
        setThings();
    }

    void setThings()
    {
        gench.add("Male");
        gench.add("Female"); 
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sineupPanel = new java.awt.Panel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        fnm = new java.awt.TextField();
        lnm = new java.awt.TextField();
        age = new java.awt.TextField();
        pass = new java.awt.TextField();
        cpass = new java.awt.TextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        warning = new java.awt.Label();
        sineUp = new java.awt.Button();
        sineupreset = new java.awt.Button();
        sineupexit = new java.awt.Button();
        checkbox1 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        condition = new java.awt.Checkbox();
        label12 = new java.awt.Label();
        gender = new java.awt.Label();
        choice1 = new java.awt.Choice();
        gench = new java.awt.Choice();
        label13 = new java.awt.Label();
        loginPanel = new java.awt.Panel();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        lacno = new java.awt.TextField();
        lpass = new java.awt.TextField();
        login = new java.awt.Button();
        loginreset = new java.awt.Button();
        loginexit = new java.awt.Button();
        label11 = new java.awt.Label();
        warning1 = new java.awt.Label();
        button3 = new java.awt.Button();
        home = new java.awt.Panel();
        logout = new java.awt.Button();
        homeb = new java.awt.Button();
        homel = new java.awt.Label();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        amPanel = new java.awt.Panel();
        label15 = new java.awt.Label();
        label16 = new java.awt.Label();
        am = new java.awt.TextField();
        amb = new java.awt.Button();
        aml = new java.awt.Label();
        wmPanel = new java.awt.Panel();
        label18 = new java.awt.Label();
        label19 = new java.awt.Label();
        wm = new java.awt.TextField();
        wmb = new java.awt.Button();
        wml = new java.awt.Label();
        menuPanel = new java.awt.Panel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        cpPanel = new java.awt.Panel();
        label17 = new java.awt.Label();
        label20 = new java.awt.Label();
        label21 = new java.awt.Label();
        label22 = new java.awt.Label();
        cpop = new java.awt.TextField();
        cpnp = new java.awt.TextField();
        cpcp = new java.awt.TextField();
        cpb = new java.awt.Button();
        cpe = new java.awt.Button();
        cpl = new java.awt.Label();
        tmPanel = new java.awt.Panel();
        label23 = new java.awt.Label();
        label24 = new java.awt.Label();
        tmm = new java.awt.TextField();
        tmb = new java.awt.Button();
        tml = new java.awt.Label();
        label25 = new java.awt.Label();
        tmac = new java.awt.TextField();
        acinfoPanel = new java.awt.Panel();
        label14 = new java.awt.Label();
        infoname = new java.awt.Label();
        infoage = new java.awt.Label();
        infobal = new java.awt.Label();
        infogen = new java.awt.Label();
        button10 = new java.awt.Button();

        setBackground(new java.awt.Color(204, 102, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        sineupPanel.setBackground(new java.awt.Color(153, 153, 255));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 0, 51));
        label1.setFont(new java.awt.Font("Dialog", 1, 55)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 0));
        label1.setText("Bank of Java");

        label2.setBackground(new java.awt.Color(204, 0, 51));

        fnm.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lnm.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnmActionPerformed(evt);
            }
        });

        age.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        age.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageFocusLost(evt);
            }
        });

        pass.setEchoChar('*');
        pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        cpass.setEchoChar('*');
        cpass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpassFocusLost(evt);
            }
        });

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setText("First name");

        label4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label4.setText("Last name");

        label5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label5.setText("Age");

        label6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label6.setText("Password");

        label7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label7.setText("Confirm Password");

        warning.setBackground(new java.awt.Color(153, 153, 255));
        warning.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        sineUp.setBackground(new java.awt.Color(0, 0, 102));
        sineUp.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sineUp.setForeground(new java.awt.Color(255, 255, 255));
        sineUp.setLabel("SinUp");
        sineUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sineUpActionPerformed(evt);
            }
        });

        sineupreset.setBackground(new java.awt.Color(0, 0, 102));
        sineupreset.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sineupreset.setForeground(new java.awt.Color(255, 255, 255));
        sineupreset.setLabel("Reset");
        sineupreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sineupresetActionPerformed(evt);
            }
        });

        sineupexit.setBackground(new java.awt.Color(0, 0, 102));
        sineupexit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sineupexit.setForeground(new java.awt.Color(255, 255, 255));
        sineupexit.setLabel("Exit");
        sineupexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sineupexitActionPerformed(evt);
            }
        });

        checkbox1.setLabel("checkbox1");

        checkbox2.setLabel("checkbox2");

        condition.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        condition.setLabel("I accept terms and conditions");

        label12.setText("label12");

        gender.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        gender.setText("Gender");

        gench.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                genchFocusGained(evt);
            }
        });

        label13.setBackground(new java.awt.Color(102, 0, 153));

        javax.swing.GroupLayout sineupPanelLayout = new javax.swing.GroupLayout(sineupPanel);
        sineupPanel.setLayout(sineupPanelLayout);
        sineupPanelLayout.setHorizontalGroup(
            sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sineupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sineupPanelLayout.createSequentialGroup()
                                .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lnm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gench, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                        .addGroup(sineupPanelLayout.createSequentialGroup()
                            .addComponent(sineUp, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(sineupreset, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(sineupexit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(warning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(condition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sineupPanelLayout.setVerticalGroup(
            sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sineupPanelLayout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lnm, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(gench, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sineupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sineupexit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sineUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sineupreset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        loginPanel.setBackground(new java.awt.Color(0, 204, 204));

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setBackground(new java.awt.Color(102, 0, 102));
        label8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 204));
        label8.setText("Login ");

        label9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label9.setText("Account No.");

        label10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label10.setText("Password");

        lacno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lacno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lacnoFocusLost(evt);
            }
        });
        lacno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lacnoActionPerformed(evt);
            }
        });

        lpass.setEchoChar('*');
        lpass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        login.setBackground(new java.awt.Color(51, 0, 102));
        login.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setLabel("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        loginreset.setBackground(new java.awt.Color(51, 0, 102));
        loginreset.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        loginreset.setForeground(new java.awt.Color(255, 255, 255));
        loginreset.setLabel("Reset");
        loginreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginresetActionPerformed(evt);
            }
        });

        loginexit.setBackground(new java.awt.Color(51, 0, 102));
        loginexit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        loginexit.setForeground(new java.awt.Color(255, 255, 255));
        loginexit.setLabel("Exit");
        loginexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginexitActionPerformed(evt);
            }
        });

        label11.setBackground(new java.awt.Color(255, 0, 0));

        warning1.setBackground(new java.awt.Color(102, 255, 102));
        warning1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        button3.setLabel("(0)");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button3MouseReleased(evt);
            }
        });
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lacno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lpass, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(warning1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(loginreset, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(loginexit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lacno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(warning1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginexit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(498, 498, 498))
        );

        home.setBackground(new java.awt.Color(102, 255, 204));

        logout.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        logout.setLabel("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        homeb.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        homeb.setLabel("Home");

        homel.setAlignment(java.awt.Label.CENTER);
        homel.setBackground(new java.awt.Color(102, 0, 51));
        homel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        homel.setForeground(new java.awt.Color(153, 255, 255));

        button4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button4.setLabel("Account Information");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button5.setLabel("Withdraw Money");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button6.setLabel("Add Money");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button7.setLabel("Change Password");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button8.setLabel("Exit");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button9.setLabel("Transfer Money");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addComponent(homeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homeb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        amPanel.setBackground(new java.awt.Color(204, 255, 102));

        label15.setAlignment(java.awt.Label.CENTER);
        label15.setBackground(new java.awt.Color(51, 51, 51));
        label15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label15.setForeground(new java.awt.Color(153, 255, 204));
        label15.setText("Add Money");

        label16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label16.setText("Ammount");

        am.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        am.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amActionPerformed(evt);
            }
        });

        amb.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        amb.setLabel("Submit");
        amb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambActionPerformed(evt);
            }
        });

        aml.setBackground(new java.awt.Color(153, 255, 204));
        aml.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        javax.swing.GroupLayout amPanelLayout = new javax.swing.GroupLayout(amPanel);
        amPanel.setLayout(amPanelLayout);
        amPanelLayout.setHorizontalGroup(
            amPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(amb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, amPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(amPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aml, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, amPanelLayout.createSequentialGroup()
                        .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(am, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        amPanelLayout.setVerticalGroup(
            amPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amPanelLayout.createSequentialGroup()
                .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(amPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(am, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(label16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        wmPanel.setBackground(new java.awt.Color(204, 255, 102));

        label18.setAlignment(java.awt.Label.CENTER);
        label18.setBackground(new java.awt.Color(51, 51, 51));
        label18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label18.setForeground(new java.awt.Color(153, 255, 204));
        label18.setText("Withdraw Money");

        label19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label19.setText("Ammount");

        wm.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        wm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wmActionPerformed(evt);
            }
        });

        wmb.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        wmb.setLabel("Submit");
        wmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wmbActionPerformed(evt);
            }
        });

        wml.setBackground(new java.awt.Color(153, 255, 204));
        wml.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        javax.swing.GroupLayout wmPanelLayout = new javax.swing.GroupLayout(wmPanel);
        wmPanel.setLayout(wmPanelLayout);
        wmPanelLayout.setHorizontalGroup(
            wmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wmPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(wmb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wmPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(wmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wml, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label18, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, wmPanelLayout.createSequentialGroup()
                        .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        wmPanelLayout.setVerticalGroup(
            wmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wmPanelLayout.createSequentialGroup()
                .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(wmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(wm, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(label19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.setBackground(new java.awt.Color(153, 255, 153));

        button1.setLabel("Sineup");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setLabel("Login");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        cpPanel.setBackground(new java.awt.Color(255, 153, 0));

        label17.setAlignment(java.awt.Label.CENTER);
        label17.setBackground(new java.awt.Color(102, 0, 102));
        label17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label17.setForeground(new java.awt.Color(255, 255, 255));
        label17.setText("Change Password");

        label20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label20.setText("Old Password");

        label21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label21.setText("New Password");

        label22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label22.setText("Comfirm Password");

        cpop.setEchoChar('*');
        cpop.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cpnp.setEchoChar('*');
        cpnp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cpcp.setEchoChar('*');
        cpcp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cpcp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpcpFocusLost(evt);
            }
        });

        cpb.setLabel("Submit");
        cpb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpbActionPerformed(evt);
            }
        });

        cpe.setLabel("Back");
        cpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpeActionPerformed(evt);
            }
        });

        cpl.setBackground(new java.awt.Color(255, 153, 255));
        cpl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        javax.swing.GroupLayout cpPanelLayout = new javax.swing.GroupLayout(cpPanel);
        cpPanel.setLayout(cpPanelLayout);
        cpPanelLayout.setHorizontalGroup(
            cpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cpPanelLayout.createSequentialGroup()
                        .addGroup(cpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(cpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpcp, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(cpnp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cpop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cpl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cpPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cpb, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cpe, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        cpPanelLayout.setVerticalGroup(
            cpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(cpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cpop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cpPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cpnp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpcp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tmPanel.setBackground(new java.awt.Color(204, 255, 102));

        label23.setAlignment(java.awt.Label.CENTER);
        label23.setBackground(new java.awt.Color(51, 51, 51));
        label23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label23.setForeground(new java.awt.Color(153, 255, 204));
        label23.setText("Transfer Money");

        label24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label24.setText("Ammount");

        tmm.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmmActionPerformed(evt);
            }
        });

        tmb.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tmb.setLabel("Submit");
        tmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbActionPerformed(evt);
            }
        });

        tml.setBackground(new java.awt.Color(153, 255, 204));
        tml.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        label25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label25.setText("Account no.");

        tmac.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tmac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tmacFocusLost(evt);
            }
        });

        javax.swing.GroupLayout tmPanelLayout = new javax.swing.GroupLayout(tmPanel);
        tmPanel.setLayout(tmPanelLayout);
        tmPanelLayout.setHorizontalGroup(
            tmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tmPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tmPanelLayout.createSequentialGroup()
                        .addComponent(label24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tmm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tmPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(tmb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tml, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tmPanelLayout.createSequentialGroup()
                        .addComponent(label25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tmac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(8, 8, 8))
        );
        tmPanelLayout.setVerticalGroup(
            tmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tmPanelLayout.createSequentialGroup()
                .addComponent(label23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(tmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tmac, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(tmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tmm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        acinfoPanel.setBackground(new java.awt.Color(153, 153, 255));

        label14.setAlignment(java.awt.Label.CENTER);
        label14.setBackground(new java.awt.Color(51, 0, 51));
        label14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label14.setForeground(new java.awt.Color(255, 255, 255));
        label14.setText("Account Information");

        infoname.setBackground(new java.awt.Color(204, 204, 255));
        infoname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        infoage.setBackground(new java.awt.Color(204, 204, 255));
        infoage.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        infobal.setBackground(new java.awt.Color(204, 204, 255));
        infobal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        infogen.setBackground(new java.awt.Color(204, 204, 255));
        infogen.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        button10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button10.setLabel("Back");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout acinfoPanelLayout = new javax.swing.GroupLayout(acinfoPanel);
        acinfoPanel.setLayout(acinfoPanelLayout);
        acinfoPanelLayout.setHorizontalGroup(
            acinfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acinfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acinfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infogen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infobal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(acinfoPanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        acinfoPanelLayout.setVerticalGroup(
            acinfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acinfoPanelLayout.createSequentialGroup()
                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(infoname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(infoage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(infogen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(infobal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sineupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tmPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acinfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(sineupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acinfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void lnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnmActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void sineupexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sineupexitActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_sineupexitActionPerformed

    private void cpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpassFocusLost
        if(!cpass.getText().equals(pass.getText()))
        {
            warning.setBackground(java.awt.Color.red);
            warning.setText("Password doesn't match");
        }
        else
        {
            warning.setBackground(new java.awt.Color(153, 153, 255));
            warning.setText("");
        }
            
    }//GEN-LAST:event_cpassFocusLost

    
    boolean isAge()
    {
        try{int a=Integer.parseInt(age.getText());
        return true;}
        catch(Exception e){
            warning.setBackground(java.awt.Color.red);
            warning.setText("integer value required");
            return false;}
    }
        boolean isCondition()
    {
            if(!condition.getState())
            {
            warning.setBackground(java.awt.Color.red);
            warning.setText("Condition must be accepeted");
            return false;
            }
            else
            {
                return true;
            }
    }
    
        boolean isPassword()
        {
            if(pass.getText().equals(cpass.getText()))
            {
                return true;
            }
            else
            {
                warning.setBackground(java.awt.Color.red);
                warning.setText("Password doesn't match");
                return false;
            }
             
                
        }
    

        
        
        
        
    private void sineUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sineUpActionPerformed
            
        
        if(isAge()&&isCondition()&&isPassword())
        {
            int aage=Integer.parseInt(age.getText());
            int acn=Bank.creatAc(fnm.getText(),lnm.getText(),aage,pass.getText(),gench.getSelectedItem());
            warning.setBackground(java.awt.Color.green);
            warning.setText("Your AC no. is "+acn);            
        }
            



    }//GEN-LAST:event_sineUpActionPerformed

    private void sineupresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sineupresetActionPerformed
        fnm.setText("");
        lnm.setText("");
        age.setText("");
        pass.setText("");
        cpass.setText("");
        warning.setText("");
        warning.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_sineupresetActionPerformed

    private void ageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFocusLost
        try{int a=Integer.parseInt(age.getText());
        warning.setBackground(new java.awt.Color(153, 153, 255));
        warning.setText("");}
        catch(Exception e) { 
            warning.setBackground(java.awt.Color.red);
            warning.setText("integer value required");}
        
    }//GEN-LAST:event_ageFocusLost

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        sineupPanel.setVisible(true);
        loginPanel.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        sineupPanel.setVisible(false);
        loginPanel.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void loginresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginresetActionPerformed
        lacno.setText("");
        lpass.setText("");
        warning1.setText("");
        warning1.setBackground(java.awt.Color.green);        
    }//GEN-LAST:event_loginresetActionPerformed

    private void loginexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_loginexitActionPerformed

    private void lacnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lacnoFocusLost
        try{int ac=Integer.parseInt(lacno.getText());
        if(!Bank.isAc(ac))
        {
            warning1.setText("Account doesn't exist.");
            warning1.setBackground(Color.red);
        }
        else
        {
            warning1.setText("");
            warning1.setBackground(java.awt.Color.green);
        }}
        catch(Exception e){
            warning1.setText("AC no. must be Integer");
            warning1.setBackground(java.awt.Color.red);
        }
            
    }//GEN-LAST:event_lacnoFocusLost

    private void genchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genchFocusGained
    }//GEN-LAST:event_genchFocusGained

    int cuser=0;
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if(Bank.login(Integer.parseInt(lacno.getText()),lpass.getText()))
        {
            cuser=Integer.parseInt(lacno.getText());
            home.setVisible(true);
            warning1.setText("Login Successfull");
            warning1.setBackground(java.awt.Color.green);
            
            homel.setText(Bank.rfnm+" "+Bank.rlnm);
            //homel.setText(Bank.getInfo(Integer.parseInt(lacno.getText())));
            
        }
        else
        {
            warning1.setText("Incurrect Ac no or password");
            warning1.setBackground(java.awt.Color.red);            
        }
    }//GEN-LAST:event_loginActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

    }//GEN-LAST:event_button3ActionPerformed

    private void button3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MousePressed
          lpass.setEchoChar('\u0000');        // TODO add your handling code here:
    }//GEN-LAST:event_button3MousePressed

    private void button3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseReleased
          lpass.setEchoChar('*');         // TODO add your handling code here:
    }//GEN-LAST:event_button3MouseReleased

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        home.setVisible(false);
        cuser=0;
    }//GEN-LAST:event_logoutActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        wmPanel.setVisible(false);
        amPanel.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        wmPanel.setVisible(true);
        amPanel.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_button5ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        cpPanel.setVisible(true);
    }//GEN-LAST:event_button7ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        acinfoPanel.setVisible(true);
        Bank.readInfo(cuser);
        infoname.setText("Name : "+Bank.rfnm+" "+Bank.rlnm);
        infoage.setText("Age :  "+Bank.rage);
        infogen.setText("Gender : "+Bank.rgen);
        infobal.setText("Ac Balance : "+Bank.rbal);
    }//GEN-LAST:event_button4ActionPerformed

    private void lacnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lacnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lacnoActionPerformed

    private void amActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amActionPerformed

    private void wmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wmActionPerformed

    private void ambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambActionPerformed
        try{
            int a=Integer.parseInt(am.getText());
            Bank.readInfo(cuser);
            Bank.rbal+=a;
            Bank.writeInfo(cuser);
            aml.setBackground(java.awt.Color.green);
            aml.setText("Money Added");            
        }catch(Exception e){
            aml.setBackground(java.awt.Color.red);
            aml.setText("Integer Value required");}
        
    }//GEN-LAST:event_ambActionPerformed

    private void wmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wmbActionPerformed
        try{
            int a=Integer.parseInt(wm.getText());
            Bank.readInfo(cuser);
            if((Bank.rbal-a)>=1000&&a<=10000)
            {
                Bank.rbal-=a;
                Bank.writeInfo(cuser);
                wml.setBackground(java.awt.Color.green);
                wml.setText("Tranjection Successful");}
            else
            {
                wml.setBackground(java.awt.Color.red);
                wml.setText("Invalid Trajiction");                
            }
        }catch(Exception e){
            wml.setBackground(java.awt.Color.red);
            wml.setText("Integer Value required");}
    }//GEN-LAST:event_wmbActionPerformed

    private void cpcpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpcpFocusLost
        if(!cpcp.getText().equals(cpnp.getText()))
                {
                    cpl.setBackground(java.awt.Color.red);
                    cpl.setText("Password doesn't match");
                }
    }//GEN-LAST:event_cpcpFocusLost

    private void cpbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpbActionPerformed
 
        Bank.readInfo(cuser);
            if(cpop.getText().equals(Bank.rpass)&&cpnp.getText().equals(cpcp.getText()))
            {
                Bank.rpass=cpnp.getText();
                Bank.writeInfo(cuser);
                cpl.setBackground(java.awt.Color.green);
                cpl.setText("Password Changed Successful");}
            else
            {
                cpl.setBackground(java.awt.Color.red);
                cpl.setText("Wrong Old password"); 
            }
    }//GEN-LAST:event_cpbActionPerformed

    private void cpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpeActionPerformed
        cpPanel.setVisible(false);
    }//GEN-LAST:event_cpeActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button8ActionPerformed

    private void tmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmmActionPerformed

    private void tmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbActionPerformed
        Bank.readInfo(cuser);
        int mon=Bank.rbal;
        if(!Bank.isAc(Integer.parseInt(tmac.getText())))
        {
                tml.setBackground(java.awt.Color.red);
                tml.setText("Account doesn't exists.");            
        }
        else if(Integer.parseInt(tmm.getText())>mon-10000)
        {
                tml.setBackground(java.awt.Color.red);
                tml.setText("Limit exceed");             
        }
        else
        {            
        try{
            Bank.readInfo(Integer.parseInt(tmac.getText()));
            Bank.rbal+=Integer.parseInt(tmm.getText()); 
            Bank.writeInfo(Integer.parseInt(tmac.getText()));            
            Bank.readInfo(cuser);
            Bank.rbal-=Integer.parseInt(tmm.getText());
            Bank.writeInfo(cuser);
            Bank.readInfo(cuser);
            tml.setText("Money Transfered");
            tml.setBackground(java.awt.Color.green);

        }catch(Exception e){tml.setText("Not an integer value");
        tml.setBackground(java.awt.Color.red);}
        }
    }//GEN-LAST:event_tmbActionPerformed

    private void tmacFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tmacFocusLost
        if(!Bank.isAc(Integer.parseInt(tmac.getText())))
        {
                tml.setBackground(java.awt.Color.red);
                tml.setText("Account doesn't exists.");            
        }
    }//GEN-LAST:event_tmacFocusLost

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        acinfoPanel.setVisible(false);
    }//GEN-LAST:event_button10ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankGUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel acinfoPanel;
    private java.awt.TextField age;
    private java.awt.TextField am;
    private java.awt.Panel amPanel;
    private java.awt.Button amb;
    private java.awt.Label aml;
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private java.awt.Choice choice1;
    private java.awt.Checkbox condition;
    private java.awt.Panel cpPanel;
    private java.awt.TextField cpass;
    private java.awt.Button cpb;
    private java.awt.TextField cpcp;
    private java.awt.Button cpe;
    private java.awt.Label cpl;
    private java.awt.TextField cpnp;
    private java.awt.TextField cpop;
    private java.awt.TextField fnm;
    private java.awt.Choice gench;
    private java.awt.Label gender;
    private java.awt.Panel home;
    private java.awt.Button homeb;
    private java.awt.Label homel;
    private java.awt.Label infoage;
    private java.awt.Label infobal;
    private java.awt.Label infogen;
    private java.awt.Label infoname;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private java.awt.Label label2;
    private java.awt.Label label20;
    private java.awt.Label label21;
    private java.awt.Label label22;
    private java.awt.Label label23;
    private java.awt.Label label24;
    private java.awt.Label label25;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.TextField lacno;
    private java.awt.TextField lnm;
    private java.awt.Button login;
    private java.awt.Panel loginPanel;
    private java.awt.Button loginexit;
    private java.awt.Button loginreset;
    private java.awt.Button logout;
    private java.awt.TextField lpass;
    private java.awt.Panel menuPanel;
    private java.awt.TextField pass;
    private java.awt.Button sineUp;
    private java.awt.Panel sineupPanel;
    private java.awt.Button sineupexit;
    private java.awt.Button sineupreset;
    private java.awt.Panel tmPanel;
    private java.awt.TextField tmac;
    private java.awt.Button tmb;
    private java.awt.Label tml;
    private java.awt.TextField tmm;
    private java.awt.Label warning;
    private java.awt.Label warning1;
    private java.awt.TextField wm;
    private java.awt.Panel wmPanel;
    private java.awt.Button wmb;
    private java.awt.Label wml;
    // End of variables declaration//GEN-END:variables
}
