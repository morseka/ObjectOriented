package Lab9.exercise;

import javax.swing.*;

/**
 * Created by Kolty on 11/1/17.
 */
public class ExerciseWindow extends JFrame {
    public ExerciseWindow() {

        this.setTitle("Exercise Window");
        this.setSize(win_width,win_height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {

        ExerciseWindow ew = new ExerciseWindow();

    }
}
