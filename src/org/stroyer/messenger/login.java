package org.stroyer.messenger;

import javax.swing.*;
import java.awt.*;

class login{
    public login(){
        JPanel main = new JPanel();
        JPanel tbar = new JPanel();
        JPanel inputFields = new JPanel();
        JFrame f = constructors.frame("uMsg - Login", 350, 650);


        f.setContentPane(main);


        JLabel title = constructors.label("<html><h1 style='color: white'>uMsg</h1></html>", "Made by Angus");
        JTextField inUser = constructors.inputText("Username", 10);


        tbar.add(title);
        tbar.setBackground(Color.lightGray);

        inputFields.add(inUser);

        main.add(tbar);
        main.add(inputFields);

        main.setBackground(Color.LIGHT_GRAY);
        f.setVisible(true);
    }
}