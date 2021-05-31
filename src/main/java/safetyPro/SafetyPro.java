package safetyPro;

import view.SignInPage;

public class SafetyPro {
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            SignInPage frame = new SignInPage();
            frame.launchFrame();
        });
    }
}
