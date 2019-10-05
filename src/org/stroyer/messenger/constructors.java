package org.stroyer.messenger;

import javax.swing.*;
import java.awt.*;

class constructors {


    public static JFrame frame(String title, int x, int y){
        JFrame f = new JFrame(title);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(x,y);

        return f;
    }

    public static JLabel label(String text, String toolTip){
        JLabel l = new JLabel(text);
        l.setToolTipText(toolTip);

        return l;
    }

    public static JTextField inputText(String value, int length){
        JTextField t = new JTextField(value, length);

        return t;
    }

        }