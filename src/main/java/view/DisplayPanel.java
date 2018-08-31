package view;

import model.User;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel{

    private static DisplayPanel displayPanel;

    // set the card layout of the different panel
    private  CardLayout cards = new CardLayout();
    private  JPanel fireAlarmPanel;
    private  JPanel mainPanel;
    private  JPanel securityPanel;
    // private  JPanel userPanel;
    // private  JPanel signInPanel;
    // private User user;



    DisplayPanel(User user) {
        setLayout(cards);
     //   user = User.getInstance();
     //   signInPanel = new SignInPanel(user);
        mainPanel = new MainPanel(user);
       // userPanel = new UserPanel(user);
        fireAlarmPanel = new FireAlarmPanel(user);
        securityPanel = new SecurityPanel(user);


        addPanels();
    }

    private void addPanels() {
        // add(signInPanel, "signInPanel");
        add(mainPanel, "mainPanel");
        add(fireAlarmPanel, "fireAlarmPanel");
        add(securityPanel, "securityPanel");
        // add(userPanel, "userPanel");
    }

    public static DisplayPanel getDisplayPanel(User user) {
        if (displayPanel == null) {
            displayPanel = new DisplayPanel(user);
        }
        return displayPanel;
    }

    public CardLayout getCards() {
        return cards;
    }
}
