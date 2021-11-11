package org.itstep;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.Arrays;

/* История посещений.
В историю посещений заносятся сайты (не более 5).
При внесении проверяется, есть ли строка в списке.
Если число превышает 5, последняя строка удаляется.
 */

public class BrowserHistory extends JFrame {
    private final String[] urls = {"google.com", "youtube.com", "facebook.com", "github.com", "wikipedia.org",
            "yahoo.com", "gmail.com", "yandex.ru", "javarush.ru", "instagram.com"};
    private ArrayDeque<String> history = new ArrayDeque<>();

    BrowserHistory() {
        setVisible(true);
        setTitle("Browser History");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        for (int i = 0; i < urls.length; i++) {
            JButton button = new JButton();
            button.setText(urls[i]);
            button.setBounds(10, 20 + i * 30, 200, 25);            
            add(button);
        }        
        setLayout(null);
    }

    public static void main(String[] args) {
        BrowserHistory main = new BrowserHistory();
        main.setVisible(true);
    }
}


