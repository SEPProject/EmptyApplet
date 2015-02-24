/*
 * Created by JFormDesigner on Sun Feb 22 17:37:23 CET 2015
 */

package view;

import controller.Controller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class View implements ViewBehaviour {

    Controller controller;

    public View() {
        System.out.println("*** View init ***");
        initComponents();
        System.out.println("*** setting main not visible ***");
        mainPage.setVisible(false);
        missionDialog.setVisible(false);
    }

    @Override
    public JFrame getFirstPage(){
        return firstPage;
    }

    @Override
    public void setController(Controller c) {
        this.controller=c;
    }

    @Override
    public Controller getController() {
        return controller;
    }


    private void beginButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        System.out.println("*** beginButton pressed ***");
        firstPage.setVisible(false);
        mainPage.setVisible(true);
    }

    private void missionButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
        System.out.println("*** missionButton pressed ***");
        missionDialog.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - fgd efeg
        missionDialog = new Dialog();
        missionPanel = new JPanel();
        missionLabel = new JLabel();
        missionAssessment = new JTextArea();
        missionDescriptionLabel = new JTextArea();
        mainPage = new JFrame();
        userPane = new JPanel();
        missionButton = new JToggleButton();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        scrollAttackpane = new JScrollPane();
        attackPane = new JTextPane();
        scrollInfoPane = new JScrollPane();
        infoPane = new JTextPane();
        attackLabel = new JLabel();
        infoLabel = new JLabel();
        firstPage = new JFrame();
        firstPagePane = new JPanel();
        descriptionLabel = new JTextArea();
        welcomeLabel = new JLabel();
        beginButton = new JButton();

        //======== missionDialog ========
        {
            missionDialog.setBackground(new Color(238, 238, 238));
            missionDialog.setLayout(new BorderLayout());

            //======== missionPanel ========
            {

                // JFormDesigner evaluation mark
                missionPanel.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), missionPanel.getBorder())); missionPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


                //---- missionLabel ----
                missionLabel.setText("Mission : ");

                //---- missionAssessment ----
                missionAssessment.setBackground(new Color(238, 238, 238));
                missionAssessment.setText("1) As you can see the passwordFile is unreadable. That's because the computer stores encrypted password. Hopefully you know the encryption algorithm, then you just need to try words, encrypt them then compare them to the stored encrypted password. Hopefully the encryption is made by the applet. The next step is to build a dictionnary. It's a file where every suggestion of password are stored and will be \"parcourue\" to be tried. Now add words that you think can be the password. ");
                missionAssessment.setLineWrap(true);
                missionAssessment.setWrapStyleWord(true);
                missionAssessment.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                missionAssessment.setFocusable(false);
                missionAssessment.setCaretColor(new Color(238, 238, 238));

                //---- missionDescriptionLabel ----
                missionDescriptionLabel.setBackground(new Color(238, 238, 238));
                missionDescriptionLabel.setText("We lost the password of our computer, but we have the file where it's stored in the computer that you can see clicking on the : passwordfile button. To retrieve it we propose to you to use a Brute force attack. ");
                missionDescriptionLabel.setLineWrap(true);
                missionDescriptionLabel.setWrapStyleWord(true);
                missionDescriptionLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                missionDescriptionLabel.setFocusable(false);
                missionDescriptionLabel.setCaretColor(new Color(238, 238, 238));

                GroupLayout missionPanelLayout = new GroupLayout(missionPanel);
                missionPanel.setLayout(missionPanelLayout);
                missionPanelLayout.setHorizontalGroup(
                    missionPanelLayout.createParallelGroup()
                        .addGroup(missionPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(missionPanelLayout.createParallelGroup()
                                .addComponent(missionAssessment)
                                .addComponent(missionDescriptionLabel))
                            .addContainerGap())
                        .addGroup(missionPanelLayout.createSequentialGroup()
                            .addGap(182, 182, 182)
                            .addComponent(missionLabel)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                missionPanelLayout.setVerticalGroup(
                    missionPanelLayout.createParallelGroup()
                        .addGroup(missionPanelLayout.createSequentialGroup()
                            .addContainerGap(17, Short.MAX_VALUE)
                            .addComponent(missionLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(missionDescriptionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(missionAssessment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                );
            }
            missionDialog.add(missionPanel, BorderLayout.CENTER);
            missionDialog.setSize(430, 295);
            missionDialog.setLocationRelativeTo(missionDialog.getOwner());
        }

        //======== mainPage ========
        {
            Container mainPageContentPane = mainPage.getContentPane();
            mainPageContentPane.setLayout(new BorderLayout());

            //======== userPane ========
            {

                // JFormDesigner evaluation mark
                userPane.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), userPane.getBorder())); userPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


                //---- missionButton ----
                missionButton.setText("Mission");
                missionButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        missionButtonMouseClicked(e);
                    }
                });

                //---- button1 ----
                button1.setText("add word to dictionnary");

                //---- button2 ----
                button2.setText("passwordFile");

                //======== scrollAttackpane ========
                {
                    scrollAttackpane.setViewportView(attackPane);
                }

                //======== scrollInfoPane ========
                {
                    scrollInfoPane.setViewportView(infoPane);
                }

                //---- attackLabel ----
                attackLabel.setText("Attacker view");

                //---- infoLabel ----
                infoLabel.setText("More information");

                GroupLayout userPaneLayout = new GroupLayout(userPane);
                userPane.setLayout(userPaneLayout);
                userPaneLayout.setHorizontalGroup(
                    userPaneLayout.createParallelGroup()
                        .addGroup(userPaneLayout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(attackLabel, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                            .addComponent(infoLabel, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                            .addGap(135, 135, 135))
                        .addGroup(GroupLayout.Alignment.TRAILING, userPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(userPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(userPaneLayout.createSequentialGroup()
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                                    .addComponent(missionButton, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                .addGroup(userPaneLayout.createSequentialGroup()
                                    .addComponent(scrollAttackpane, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                    .addComponent(scrollInfoPane, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)))
                            .addGap(24, 24, 24))
                        .addGroup(GroupLayout.Alignment.TRAILING, userPaneLayout.createSequentialGroup()
                            .addContainerGap(692, Short.MAX_VALUE)
                            .addComponent(button2)
                            .addGap(14, 14, 14))
                );
                userPaneLayout.setVerticalGroup(
                    userPaneLayout.createParallelGroup()
                        .addGroup(userPaneLayout.createSequentialGroup()
                            .addGroup(userPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(attackLabel)
                                .addComponent(infoLabel))
                            .addGap(2, 2, 2)
                            .addGroup(userPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(scrollInfoPane, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
                                .addComponent(scrollAttackpane, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE))
                            .addGroup(userPaneLayout.createParallelGroup()
                                .addGroup(userPaneLayout.createSequentialGroup()
                                    .addGroup(userPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button1))
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(userPaneLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(missionButton)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button2)
                                    .addGap(63, 63, 63))))
                );
            }
            mainPageContentPane.add(userPane, BorderLayout.CENTER);
            mainPage.setSize(820, 505);
            mainPage.setLocationRelativeTo(mainPage.getOwner());
        }

        //======== firstPage ========
        {
            Container firstPageContentPane = firstPage.getContentPane();
            firstPageContentPane.setLayout(new BorderLayout());

            //======== firstPagePane ========
            {

                // JFormDesigner evaluation mark
                firstPagePane.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), firstPagePane.getBorder())); firstPagePane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


                //---- descriptionLabel ----
                descriptionLabel.setBackground(new Color(238, 238, 238));
                descriptionLabel.setText("Through this applet, you will discover how \"Brute force\" attacks are performed by Hackers. You will also see how you can have a good password.");
                descriptionLabel.setLineWrap(true);
                descriptionLabel.setWrapStyleWord(true);
                descriptionLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                descriptionLabel.setFocusable(false);
                descriptionLabel.setCaretColor(new Color(238, 238, 238));

                //---- welcomeLabel ----
                welcomeLabel.setText("WELCOME TO THE BRUTE FORCE APPLET");
                welcomeLabel.setFont(new Font("Malayalam Sangam MN", Font.BOLD | Font.ITALIC, 13));

                //---- beginButton ----
                beginButton.setText("start");
                beginButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        beginButtonActionPerformed(e);
                    }
                });

                GroupLayout firstPagePaneLayout = new GroupLayout(firstPagePane);
                firstPagePane.setLayout(firstPagePaneLayout);
                firstPagePaneLayout.setHorizontalGroup(
                    firstPagePaneLayout.createParallelGroup()
                        .addGroup(firstPagePaneLayout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(firstPagePaneLayout.createParallelGroup()
                                .addGroup(firstPagePaneLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(descriptionLabel, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))
                                .addComponent(welcomeLabel, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
                                .addGroup(firstPagePaneLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(beginButton, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(51, Short.MAX_VALUE))
                );
                firstPagePaneLayout.setVerticalGroup(
                    firstPagePaneLayout.createParallelGroup()
                        .addGroup(firstPagePaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(welcomeLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(descriptionLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(beginButton)
                            .addContainerGap(13, Short.MAX_VALUE))
                );
            }
            firstPageContentPane.add(firstPagePane, BorderLayout.CENTER);
            firstPage.setSize(360, 225);
            firstPage.setLocationRelativeTo(firstPage.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - fgd efeg
    private Dialog missionDialog;
    private JPanel missionPanel;
    private JLabel missionLabel;
    private JTextArea missionAssessment;
    private JTextArea missionDescriptionLabel;
    private JFrame mainPage;
    private JPanel userPane;
    private JToggleButton missionButton;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JScrollPane scrollAttackpane;
    private JTextPane attackPane;
    private JScrollPane scrollInfoPane;
    private JTextPane infoPane;
    private JLabel attackLabel;
    private JLabel infoLabel;
    private JFrame firstPage;
    private JPanel firstPagePane;
    private JTextArea descriptionLabel;
    private JLabel welcomeLabel;
    private JButton beginButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
