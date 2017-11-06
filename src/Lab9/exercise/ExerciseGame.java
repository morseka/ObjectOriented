package Lab9.exercise;

/**
 * Created by Kolty on 11/1/17.
 */
public class ExerciseGame {

    private int circleX = 200;
    private int circleY = 100;
    private int MAXCIRCLES = 100;
    private int circleWidth = 50;
    private int circleHeight = 100;

    public int getCircleX() {return circleX;}
    public int getCircleY() {return circleY;}
    public int getCircleWidth() {return circleWidth;}
    public int getCircleHeight() {return circleHeight;}

    public void setCircleX(int circleX) {
        this.circleX = circleX;
    }

    public void setCircleY(int circleY) {
        this.circleY = circleY;
    }

    public void setCircleWidth(int circleWidth) {
        this.circleWidth = circleWidth;
    }

    public void setCircleHeight(int circleHeight) {
        this.circleHeight = circleHeight;
    }



    /**
     * sets the initial value for these two variables
     * @param x
     * @param y
     * @param wid
     * @param hei
     */
    public ExerciseGame(int x, int y, int wid, int hei)
    {
        setCircleX(x);
        setCircleY(y); setCircleWidth(wid); setCircleHeight(hei);
        FormCircleArray cirA = new FormCircleArray()

    }

    /**
     * communicates between the “Game” and the display of the game
     * @param x
     * @param y
     */
    public void processMove( int x, int y) {
        setCircleX(x);
        setCircleY(y);
    }
}
