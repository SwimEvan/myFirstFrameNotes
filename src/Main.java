import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        
        //1. create a frame
        JFrame frame = new JFrame();
        frame.setSize(500,500);


        //2. create a panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);


        //3. create components
        JLabel label = new JLabel("Hello World!");
        JButton button = new JButton("Push Me");
        JTextField textField = new JTextField(5);
// adding an image
        ImageIcon icon = new ImageIcon("Images/MyCards/2C.png");
        // Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        // Creating a Label with an icon on it
        JLabel picLabel = new JLabel(icon);



        //4. add components to panel
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(picLabel);


        //5. add the panel to the frame
frame.add(panel);


        //6. make the frame visible
frame.setVisible(true);
    }
}