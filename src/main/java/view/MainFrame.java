package view;

import model.User;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(User user) {
        setLayout(new BorderLayout());
        add(BorderLayout.CENTER, DisplayPanel.getDisplayPanel(user));
    }
}
