package ui.tabs;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TabFormat {
    private Font titleFont = new Font(null, Font.BOLD, 20);
    private Font subtitleFont = new Font(null, Font.PLAIN, 16);
    private Font buttonFont = new Font(null, Font.BOLD, 16);

    //EFFECTS: sets border of 10px around JComponent
    public void setInset(JComponent component) {
        component.setBorder(new EmptyBorder(10, 10, 10, 10));
    }

    public void setTopInset(JComponent component) {}

    //EFFECTS: sets field size to max-width, mid height
    public void setFieldSize(JComponent component) {
        component.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
    }

    //EFFECTS: sets field size to max-width, large height
    public void setLargeFieldSize(JComponent component) {
        component.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    //EFFECTS: creates edit button
    public Image setEditButton(JButton button) {
        try {
            Image img = ImageIO.read(getClass().getResource("/resources/edit-img.png"));
            img = img.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            button.setIcon(new ImageIcon(img));
        } catch (Exception e) {
        }
        return null;
    }

    //EFFECTS: sets large font
    public void setTitleFont(JComponent component) {
        component.setFont(titleFont);
    }

    //EFFECTS: sets mid font
    public void setSubtitleFont(JComponent component) {
        component.setFont(subtitleFont);
    }

    //EFFECTS: sets mid font
    public void setButtonFont(JComponent component) {
        component.setFont(buttonFont);
    }

    //EFFECTS: set invalid
    public void invalidSettings(JTextField field, String text) {
        field.setText("Invalid " + text);
        field.setForeground(Color.RED);
    }

    //EFFECTS: set valid
    public void validSettings(JTextField field) {
        field.setText("");
        field.setForeground(Color.BLACK);
    }

}
/*
References:
https://stackoverflow.com/questions/17925609/how-to-add-padding-to-a-jpanel-with-a-border/17925693
 */