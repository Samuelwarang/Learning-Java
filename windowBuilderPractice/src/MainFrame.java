import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Comfortaa Bold", Font.BOLD, 18);
    final private Font secFont = new Font("Verdana", Font.PLAIN, 18);
    JTextField tffirstName, tfLastName;


    public void initialize(){
        
        //Components of the form Panel
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);
        lbFirstName.setForeground(new Color(255, 255, 255)); //Text Color

        tffirstName = new JTextField();
        tffirstName.setFont(secFont);

        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);
        lbLastName.setForeground(new Color(255, 255, 255)); //Text Color

        tfLastName = new JTextField();
        tfLastName.setFont(secFont);

        //Welcome Label
        JLabel lbWelcome = new JLabel("Welcome");
        lbWelcome.setFont(mainFont);
        lbWelcome.setForeground(new Color(255, 255, 255)); //Text Color
        

        //Buttons
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String firstName = tffirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Hello" + " " +  firstName + " " + lastName);
                lbWelcome.setForeground(new Color(86, 227, 187)); //Text Color
   
            }

        });

        //Clear Button
        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tffirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }

        });

        //Form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5)); //panel using gridlayout
        formPanel.setOpaque(false);
        formPanel.add(lbFirstName);
        formPanel.add(tffirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        //Button Panel
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        //Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        //mainPanel.;
        mainPanel.setBackground(new Color(61, 65, 71)); //Background Color
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);
        
        setTitle("Welcome"); //Title of the frame
        setSize(500, 600); //Size of the frame
        setMinimumSize(new Dimension(300,600)); //Minimum size of the frame
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Exit function for the window
        setLocationRelativeTo(null); //To generate the window in the center
        setVisible(true); 
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }

}
