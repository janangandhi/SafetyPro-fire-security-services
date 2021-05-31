package view;

import model.User;
import service.FireService;
import service.PanelMediator;
import service.SecurityService;

import javax.swing.*;
import java.awt.*;

public class CardPanel extends JPanel {

    private final CardLayout cardLayout;
    private final SecurityServicesPanel securityServicesPanel;
    private final FireServicesPanel fireServicesPanel;

    public CardPanel(User user) {
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        securityServicesPanel = new SecurityServicesPanel(this, new PanelMediator(new SecurityService(user)));
        fireServicesPanel = new FireServicesPanel(this, new PanelMediator(new FireService(user)));

        add(new SelectionPagePanel(this).getMainPanel(), "mainPanel");
        add(fireServicesPanel.generatePanel(), "firePanel");
        add(securityServicesPanel.generatePanel(), "securityPanel");
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public SecurityServicesPanel getSecurityServicesPanel() {
        return securityServicesPanel;
    }

    public FireServicesPanel getFireServicesPanel() {
        return fireServicesPanel;
    }


}
