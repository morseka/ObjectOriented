package lab0;import javax.swing.*;
/**
 * Created by harmssk on 8/21/2017.
 */
public class breakLoops {

    public static void main(String[] args) throws Exception {


        String introduction = "This program will perform various tasks\n"
                + "associated with numbers. "
                + "\nYou should enter the letter corresponding to \n" +
                "the task you would like to do and then click on OK. \n\n"
                + "You will be given additional instructions to follow \n" +
                "and when they are done, the results will be displayed\n." +
                "\nThe program will always return to the menu.\n\n";
        String menu = "Enter the Letter corresponding to the task \n" +
                "you would like to complete, or Q to quit!\n" +
                "\nA - Find the first five multiples of an integer." +
                "\nB - Find the square root of a number." +
                "\nC - Find the first four powers of a number." +
                "\n\nQ - to quit.";
        do {
            String response = JOptionPane.showInputDialog(null,
                    introduction + menu, "Menu", 1);
            char letter = response.toUpperCase().charAt(0);
            switch (letter) {
                case 'A':
                    JOptionPane.showMessageDialog(null, "You chose A", "Chose A", 1);
                    break;
                case 'B':
                    JOptionPane.showMessageDialog(null, "You chose B", "Chose B", 1);
                    break;
                case 'C':
                    JOptionPane.showMessageDialog(null, "You chose C", "Chose C", 1);
                    break;
                case 'Q':
                    JOptionPane.showMessageDialog(null, "Program terminating",
                            "Ending", 1);
                    System.exit(0);
                    break;
            }
            introduction = "";
        } while (true);
    }
}