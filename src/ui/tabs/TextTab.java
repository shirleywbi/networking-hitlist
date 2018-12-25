package ui.tabs;

import javax.swing.*;

public class TextTab extends JPanel {
    JLabel textLabel = new JLabel("Text Contacts");

    TabFormat format = new TabFormat();

    public TextTab() {
        format.setInset(this);
    }
}
