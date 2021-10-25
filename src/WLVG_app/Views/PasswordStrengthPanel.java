/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WLVG_app.Views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/**
 *
 * @author eugene
 */
public class PasswordStrengthPanel extends JPanel {

    private JTextField passwordField;
    private JTextField passwordConfirm;
    private JButton createAccount;
    private JProgressBar progressBar;

    public PasswordStrengthPanel() {

//        GridLayout gr = new GridLayout(2,2);
//        this.setLayout(gr);
//        
        this.setBackground(Color.decode("#F9FBB2"));
//        this.setSize(550, 900);

        initButtonsAndFields();

    }

    private void initButtonsAndFields() {

        passwordField = new JTextField("enter pw");
        passwordConfirm = new JTextField("confirm your password");
        createAccount = new JButton("create your account!");

        JButton checkStrength = new JButton("check pw strength");

        checkStrength.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //LISTENER THAT CHECKS PW STRENGTH 
                String firstPw = passwordField.getText();
                String secondPw = passwordConfirm.getText();

                boolean pwMatch = false;
                boolean pwLength = false;
                boolean specialCharacters = false;

                //check if passwords match 
                if (!firstPw.equals(secondPw)) {
                    System.out.println("passwords do not match");

                } else {
                    System.out.println("passwords match");
                    pwMatch = true;

                }

                //if they are equal, see if conform to policy
                if (pwMatch == true) {

                    //length
                    if (firstPw.length() > 7) {
                        pwLength = true;
                        progressBar.setValue(25);

                        if (firstPw.length() > 15) {
                            progressBar.setValue(50);

                        }

                    }

                    //special characters 
                    String[] spChrList = {"!", "@", "#", "$", "%", "^", "&", "*",};
                    for (int i = 0; i < spChrList.length; i++) {
                        String toCheck = spChrList[i];

                        if (firstPw.contains(toCheck)) {
                            specialCharacters = true;
                        }
                    }

                }

                if (pwMatch && pwLength && specialCharacters) {
                    progressBar.setValue(75);
                }
            }

        });

        progressBar = new JProgressBar(0, 100);
        //when the task of (initially) unknown length begins:
        progressBar.setIndeterminate(true);
        //do some work; get length of task...
//        progressBar.setValue(50);
        progressBar.setIndeterminate(false);

        this.add(getPasswordField());
        this.add(getPasswordConfirm());
        this.add(getProgressBar());
        this.add(checkStrength);
        this.add(getCreateAccount());

    }

    /**
     * @return the passwordField
     */
    public JTextField getPasswordField() {
        return passwordField;
    }

    /**
     * @param passwordField the passwordField to set
     */
    public void setPasswordField(JTextField passwordField) {
        this.passwordField = passwordField;
    }

    /**
     * @return the passwordConfirm
     */
    public JTextField getPasswordConfirm() {
        return passwordConfirm;
    }

    /**
     * @param passwordConfirm the passwordConfirm to set
     */
    public void setPasswordConfirm(JTextField passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    /**
     * @return the createAccount
     */
    public JButton getCreateAccount() {
        return createAccount;
    }

    /**
     * @param createAccount the createAccount to set
     */
    public void setCreateAccount(JButton createAccount) {
        this.createAccount = createAccount;
    }

    /**
     * @return the progressBar
     */
    public JProgressBar getProgressBar() {
        return progressBar;
    }

    /**
     * @param progressBar the progressBar to set
     */
    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

}
