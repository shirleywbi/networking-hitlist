package ui;

import ui.tabs.TabLayout;

import javax.swing.*;

public class NetworkHitlist extends JFrame {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 750;


    public NetworkHitlist() {
        setTitle("Network Hitlist");
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        NetworkHitlist networkHitlist = new NetworkHitlist();
        TabLayout tabs = new TabLayout();
        networkHitlist.setVisible(true);
        networkHitlist.add(tabs);
    }
}