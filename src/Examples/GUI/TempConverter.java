package Examples.GUI;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.text.DecimalFormat;

/**
 * Demonstrate how to use a slider. This program illustrates:
 * (1) How to create a slider
 * (2) The event generated by a slider is to be handled by ChangeListener
 * (3) How to get the current value from the slider
 * 
 * @author Sherri Harms
 *
 */
public class TempConverter extends JFrame
{
	private JTextField fahrenheitTemp; 		// Fahrenheit temp
	private JTextField centigradeTemp; 		// Centigrade temp
	private JSlider slider;        			// Temperature adjuster

	/**
	 * Create Examples.GUI
	 */
	public TempConverter() {
		// Set the look and feel of the window
		
		try{
	//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
	//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		}catch(Exception e){
			e.getStackTrace();
		}
	
		// Set the title and close operation
		setTitle("Temperatures");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Build the panels
		JPanel fPanel = buildFPanel();
		JPanel cPanel = buildCPanel();
		JPanel sliderPanel = buildSliderPanel();
		
		// Create a GridLayout manager.
		setLayout(new GridLayout(3, 1));
	
		// Add the panels to the content pane.
		add(fPanel);
		add(cPanel);
		add(sliderPanel);
	
		// Show the window
		pack();
		setVisible(true);
	}

	/**
	 * Build the panel to hold the fahrenheit data
	 * 
	 * @return
	 */
	public JPanel buildFPanel() {
		// Create the panel
		JPanel panel = new JPanel();
		
		// Create the message labels.
		JLabel label = new JLabel("Fahrenheit: ");
		
		// Create the read-only text fields.
		fahrenheitTemp = new JTextField("32.0", 10);
		fahrenheitTemp.setEditable(false);
		
		// Put the label and the text field into the panel
		panel.add(label);
		panel.add(fahrenheitTemp);
		
		return panel;
	}

	/**
	 * Build the panel to hold the Celsius stuff
	 * 
	 * @return The created Panel
	 */
	public JPanel buildCPanel() {
		// Create the panel
		JPanel panel = new JPanel();
		
		// Create the message labels.
		JLabel label = new JLabel("Centigrade: ");
		
		// Create the read-only text fields.
		centigradeTemp = new JTextField("0.0", 10);
		centigradeTemp.setEditable(false);
		
		// Put the components above into the panel
		panel.add(label);
		panel.add(centigradeTemp);

		return panel;
	}

	/**
	 * Build the slider panel
	 * 
	 * @return The created panel
	 */
	public JPanel buildSliderPanel() {
		// Create the panel
		JPanel panel = new JPanel();
		
		// Create the slider.
		slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		slider.setMajorTickSpacing(20); // Major tick every 20
		slider.setMinorTickSpacing(5);  // Minor tick every 5
		slider.setPaintTicks(true);     // Display tick marks
		slider.setPaintLabels(true);    // Display numbers
		
		// Hook up the slider with the listener
		slider.addChangeListener(new SliderListener());
		
		// Put the slider into the panel
		panel.add(slider);
		
		return panel;
	}
	
	/**
	 * The event handler for the slider
	 */
	private class SliderListener implements ChangeListener {
		public void stateChanged(ChangeEvent e)
		{
			// Get the slider value, and set it to the Celsius temperature field
			double centigrade = slider.getValue();
			centigradeTemp.setText(String.valueOf(centigrade));
			
			// Convert the value to Fahrenheit, format it, and show it
			double fahrenheit = (9.0 / 5.0) * centigrade + 32.0;
			DecimalFormat fmt = new DecimalFormat("0.0");
			fahrenheitTemp.setText(fmt.format(fahrenheit));
		}
   }

	public static void main(String[] args) {
		TempConverter tc = new TempConverter();
	}
}
