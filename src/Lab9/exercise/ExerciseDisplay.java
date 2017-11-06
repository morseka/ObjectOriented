package Lab9.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Kolty on 11/1/17.
 */
public class ExerciseDisplay extends JPanel {

    private ExerciseGame game;
    private final int START_X = 200;
    private final int START_Y = 100;
    private final int START_Width = 50;
    private final int START_Height= 100;

    public void paintComponent(Graphics g) {
        //super.paintComponent(g);
        g.setColor(Color.GREEN);
        //g.fillOval(circleX, circleY, circleWidth,
        //        circleHeight);

        //This replaces g.fillOval right above
        g.fillOval(game.getCircleX(), game.getCircleY(),
                game.getCircleWidth(), game.getCircleHeight());
        g.setColor(Color.BLACK);
        //g.drawOval(circleX, circleY, circleWidth, circleHeight);

        //This replaces g.drawOval right above
        g.drawOval(game.getCircleX(), game.getCircleY(),
                game.getCircleWidth(), game.getCircleHeight());
    }

    public ExerciseDisplay() {
        game = new ExerciseGame(START_X,START_Y ,START_Width,START_Height );
        this.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent me) {

                //circleX = me.getX() - circleWidth / 2;
                //circleY = me.getY() - circleHeight / 2;

                //This replaces circleX and circleY right above.
                game.processMove(me.getX()-50,me.getY()-50);
                System.err.print("\n mouse clicked");
                repaint();
            }

            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
        });
    }
}
