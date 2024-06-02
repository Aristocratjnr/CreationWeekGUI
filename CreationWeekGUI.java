import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreationWeekGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Creation Week");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Enter a day (1-7):");
        userLabel.setBounds(10, 20, 160, 25);
        panel.add(userLabel);

        JTextField dayText = new JTextField(20);
        dayText.setBounds(180, 20, 165, 25);
        panel.add(dayText);

        JButton enterButton = new JButton("Enter");
        enterButton.setBounds(10, 80, 80, 25);
        panel.add(enterButton);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(10, 110, 350, 40);
        panel.add(resultArea);

        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dayStr = dayText.getText();
                try {
                    int day = Integer.parseInt(dayStr);
                    String result = "";
                    switch (day) {
                        case 1:
                            result = "Day 1: Light created, separated from darkness. ('Genesis 1:3-5')";
                            break;
                        case 2:
                            result = "Day 2: Sky created, waters above separated from waters below. ('Genesis 1:6-8')";
                            break;
                        case 3:
                            result = "Day 3: Dry ground and seas created, vegetation created. ('Genesis 1:9-13')";
                            break;
                        case 4:
                            result = "Day 4: Sun, moon, and stars created to separate day and night. ('Genesis 1:14-19')";
                            break;
                        case 5:
                            result = "Day 5: Sea creatures and birds created. ('Genesis 1:20-23')";
                            break;
                        case 6:
                            result = "Day 6: Land animals and humans created. ('Genesis 1:24-31')";
                            break;
                        case 7:
                            result = "Day 7: God rested, blessing and sanctifying the day. ('Genesis 2:1-3')";
                            break;
                        default:
                            result = "Invalid day. Please enter a number between 1 and 7.";
                            break;
                    }
                    resultArea.setText(result);
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input. Please enter a number between 1 and 7.");
                }
            }
        });
    }
}
