import User.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


public class GUI implements ActionListener {

    User temp = new User();

    JTextField fname_field = new JTextField();
    JTextField lname_field = new JTextField();
    JTextField genderField = new JTextField();
    JTextField heightIn_field = new JTextField();
    JTextField heightFt_field = new JTextField();
    JTextField weight_field = new JTextField();
    JTextField age_field = new JTextField();
    JTextField availability_field = new JTextField();
    JTextField walk_time_field = new JTextField();
    JTextField heartRateField = new JTextField();
    JTextField exp_field = new JTextField();
    JTextField bodyFatField = new JTextField();
    JTextField goal_field = new JTextField();
    public GUI() {
        JFrame frame = new JFrame();

        JLabel fname = new JLabel("First Name");
        JLabel lname = new JLabel("Last Name");
        JLabel gender = new JLabel("Gender");
        JLabel heightFt = new JLabel("Height Feet");
        JLabel heightIn = new JLabel("Height In");
        JLabel weight = new JLabel("Weight");
        JLabel age = new JLabel("Age");
        JLabel goal = new JLabel("Goal");
        JLabel bodyFat = new JLabel("Body Fat");
        JLabel availability = new JLabel("Availability");
        JLabel walk_time = new JLabel("Walk Time");
        JLabel heart_rate = new JLabel("Heart Rate");
        JLabel experience = new JLabel("Experience");

        JButton button = new JButton("Submit");
        button.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 2));
        panel.setBackground(new Color(150, 150 , 255));
        panel.add(fname);
        panel.add(fname_field);
        panel.add(lname);
        panel.add(lname_field);
        panel.add(gender);
        panel.add(genderField);
        panel.add(heightFt);
        panel.add(heightFt_field);
        panel.add(heightIn);
        panel.add(heightIn_field);
        panel.add(weight);
        panel.add(weight_field);
        panel.add(age);
        panel.add(age_field);
        panel.add(goal);
        panel.add(goal_field);
        panel.add(bodyFat);
        panel.add(bodyFatField);
        panel.add(availability);
        panel.add(availability_field);
        panel.add(walk_time);
        panel.add(walk_time_field);
        panel.add(heart_rate);
        panel.add(heartRateField);
        panel.add(experience);
        panel.add(exp_field);
        panel.add(button);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SDP");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double heightConv = 0.0;
        temp = new User(
                parseInt(age_field.getText()),
                parseDouble(weight_field.getText()),
                heightConv,
                parseDouble(bodyFatField.getText()),
                goal_field.getText(),
                genderField.getText(),
                parseDouble(walk_time_field.getText()),
                parseDouble(heartRateField.getText())
        );
        System.out.println(temp.getfitLevel());
    }
}
