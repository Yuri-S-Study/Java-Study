import javax.swing.*;
import java.awt.*;

public class Chapter18 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("はじめての画面");

        JLabel label = new JLabel("こんにちは！");
        JButton button = new JButton("押してね");

        button.addActionListener(e -> {
            label.setText("ボタンが押されたよ！");
        });

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}