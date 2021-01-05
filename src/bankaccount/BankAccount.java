package bankaccount;

import javax.swing.JFrame;

/**
 *
 * @author khali
 */
public class BankAccount {

    // Main class to initialize the GUI
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.setTitle("LonMet Banking App");
        mainMenu.setResizable(true);
        mainMenu.setVisible(true);
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
