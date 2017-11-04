package lab3; /**
 * Race class used to simulate a race of cars
 * the cars are stored in an array
 * Uses a dice to decide which car and what action to take as the race progresses
 *
 * CSIT 150 lab 3 spring 2017
 *
 * @author Kolton Morse
 */

public class Race {
    private static final double DEFAULTRACEDISTANCE = 500;
    private Car[] raceCars;
    private double distance;
    private String raceType;
    private Car winner;
    private int carCount;

    /**
     *
     * @param numCars
     */
    public Race(int numCars) {
        carCount = 0;

        raceCars = new Car[numCars];
    }
    public Race() {
        carCount = 0;

        raceCars = new Car[2];
    }

    /**
     *
     * @param inDistance
     */
    public void setDistance(double inDistance) { distance = inDistance; }

    /**
     *
     * @param inType
     */
    public void setRaceType(String inType) { raceType = inType; }

    /** this is a private method only called from other methods in this class
     *
     * @param winningCarNumber
     */
    private void setWinner(int winningCarNumber) { winner = raceCars[winningCarNumber];}

    /**
     *
     * @return
     */
    public String getWinner() {
        String value = "";
        if(winner == null){
            System.out.println("Race winner is unknown at this time.");
        }else{
            value = winner.toString();
        }
        return value;
    }

    /**
     *
     * @return
     */
    public int getCarCount() { return carCount; }

    /**
     *
     *
     */
    public void addCar(Car newCar) {
        if (raceCars == null || carCount == raceCars.length)
            increaseSize();
        //put the new car in the next open spot
        raceCars[carCount] = new Car(newCar);
        carCount++;
    }

    /**
     *
     * @return
     */
    public double getDistance() { return distance; }

    /**
     *
     * @return
     */
    public String getRaceType() { return raceType; }

    /** DEEP copy
     */
    public Car[] getCars() {

        Car[] temp = new Car[carCount];

        for (int car = 0; car < carCount; car++)
            temp[car] = raceCars[car];

        return temp;
    }

    /**
     *
     * @return
     */
    public String toString() {
        String description;

        description = raceType + "\t" + distance + "\t" + winner;

        return description;
    }

    /**
     *
     */
    public void runRace() {
        //Create an object for the car
        Dice raceDice = new Dice(carCount*3);

        boolean raceOver = false;
        int diceRoll = 0;
        int carToMove = 0;
        int action = 0;

        while(!(raceOver)) {
            diceRoll = (raceDice.roll());
            carToMove = (diceRoll -1)/3;
            action = (diceRoll -1)%3;

            if (action == 0) {
                raceCars[carToMove].move();
                if (raceCars[carToMove].getdistanceTraveled() >= distance)
                    raceOver = true;
            } else if (action == 1) {
                raceCars[carToMove].brake();
            } else if (action == 2) {
                raceCars[carToMove].accelerate();
            } else {
                System.out.println("error");
            }
        }

        setWinner(carToMove);
    }
    /**-----------------------------------------------------------------
     //  Doubles the size of the collection by creating a larger array
     //  and copying the existing collection into it.
     //-----------------------------------------------------------------*/
    private void increaseSize ()
    {
        if (raceCars == null)
        {
            raceCars = new Car[2]; //double the size from 0 to 2
      //      for (int i = 0; i<2; i++)
      //          raceCars[i] = new Car();
        }
        else
        {
            Car[] temp = new Car[raceCars.length * 2];

            for (int car = 0; car < raceCars.length; car++)
                temp[car] = raceCars[car];

            raceCars = temp;
        }
    }
}
