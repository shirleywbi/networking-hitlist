package ui;

import ui.tabs.TabLayout;
import ui.tabs.ReminderTab;

import javax.swing.*;

public class NetworkHitlist extends JFrame {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 750;

    private static TabLayout ct = new TabLayout();
    private static ReminderTab rt = new ReminderTab();

    public NetworkHitlist() {
        setTitle("Network Hitlist");
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        NetworkHitlist nh = new NetworkHitlist();
        nh.setVisible(true);
        nh.add(ct.createContactsTab());
    }
}