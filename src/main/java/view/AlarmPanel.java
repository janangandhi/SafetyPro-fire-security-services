package view;

import controller.ActiveTextField;
import controller.ConnectDB;
import controller.FileUtil;
import model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;

/**
 * UI frame to show popup.
 *
 */
public class AlarmPanel extends JFrame {

    private JLabel imageLabel;
    private JLabel label;
    private JPasswordField passwordField;
    private JButton enterButton;
    private JPanel topImagePanel;
    private JPanel bottomInputPanel;
    private JLabel callingPhoneNumberLabel;

    private String phoneNumber;
    private User user;
    private String masterCode;


    public AlarmPanel(String fileName, User user){

        this.user = user;
        phoneNumber = null;
        masterCode = null;
        //System.out.println(phoneNumber  +  masterCode  + "");

        getUserPhoneAndMasterCode();
        initializeComponents(fileName);
        addComponentsToPanel();
        setLayout(new GridLayout(0, 1));

        registerActionListeners();

        add(topImagePanel);
        add(bottomInputPanel);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    //frame to pop up when the sensors are triggered
    private void initializeComponents(String fileName){
        ImageIcon icon = new ImageIcon(FileUtil.getPathWithName(fileName));
        //image = FileUtil.getImageWithName("buildingLayout.jpg");
        imageLabel = new JLabel();
        imageLabel.setIcon(icon);
        callingPhoneNumberLabel = new JLabel();
        callingPhoneNumberLabel.setText("Calling Phone Number: " + phoneNumber + "...");
        label = new JLabel(" Enter password to disarm system: ");
        passwordField = new JPasswordField();
        enterButton = new JButton("Disarm");
        topImagePanel = new JPanel();
        bottomInputPanel = new JPanel();
    }

    //make the panel
    private void addComponentsToPanel(){
        topImagePanel.setLayout(new GridLayout(0, 1));
        topImagePanel.setPreferredSize(new Dimension(300, 350));
        topImagePanel.add(imageLabel);
        topImagePanel.add(callingPhoneNumberLabel);
        bottomInputPanel.setLayout(new GridLayout(0, 1, 8, 10));
        bottomInputPanel.add(label);
        bottomInputPanel.add(passwordField);
        bottomInputPanel.add(enterButton);
    }

    //master word
    private void registerActionListeners(){
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actualPassword = masterCode;
                String userEnterPassword = String.valueOf(passwordField.getPassword());
                if (actualPassword.length() == 0 || actualPassword.equals(userEnterPassword)){
                    dispose(); // close the pop up frame
                } else {
                    JOptionPane.showMessageDialog(getParent(),
                            "The password is not correct",
                            "Wrong password",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        passwordField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                ActiveTextField.getInstance().setActiveTextField(passwordField);
            }
            @Override
            public void focusLost(FocusEvent e) {

            }
        });
    }

    private void getUserPhoneAndMasterCode() {
        phoneNumber = user.getPhoneNumber();
        masterCode = user.getMasterPassword();
    }
}

