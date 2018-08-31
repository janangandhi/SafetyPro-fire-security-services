package controller;

import javax.swing.*;

public class ActiveTextField {

    private static ActiveTextField activeTextField;

    private JTextField currentTextField;

    private ActiveTextField(){}

    public static ActiveTextField getInstance(){
        if (activeTextField == null){
            activeTextField = new ActiveTextField();
        }
        return activeTextField;
    }

    public void setActiveTextField(JTextField currentTextField){
        this.currentTextField = currentTextField;
    }

    public JTextField getActiveTextField() {
        return this.currentTextField;
    }
}