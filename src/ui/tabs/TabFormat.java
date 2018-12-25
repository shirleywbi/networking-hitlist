package ui.tabs;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TabFormat {
    private Font titleFont = new Font(null, Font.BOLD, 20);
    private Font subtitleFont = new Font(null, Font.PLAIN,16);

    //EFFECTS: sets border of 10px around JComponent
    public void setInset(JComponent component) {
        component.setBorder(new EmptyBorder(10,10,10,10));
    }

    //EFFECTS: sets field size to max-width, mid height
    public void setFieldSize(JComponent component) {
        component.setMaximumSize(new Dimension(Integer.MAX_VALUE,40));
    }

    //EFFECTS: sets field size to max-width, large height
    public void setLargeFieldSize(JComponent component) {
        component.setMaximumSize(new Dimension(Integer.MAX_VALUE,100));
    }

    //getters
    public Font getTitleFont() {
        return titleFont;
    }
    public Font getSubtitleFont() {return subtitleFont;}

}
/*
References:
https://stackoverflow.com/questions/17925609/how-to-add-padding-to-a-jpanel-with-a-border/17925693
 */