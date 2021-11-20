package view;

import controller.ControllerApp;
import model.Operation;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainView extends JFrame {

    public MainView(ControllerApp controllerApp, ArrayList<String> arrayOperations) {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(400, 600));
        this.initComponents(controllerApp, arrayOperations);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

    private void initComponents(ControllerApp controllerApp, ArrayList<String> arrayOperations){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout((arrayOperations.size()+1),1,4,20));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30,10, 30) );
        JLabel labelInfo = new JLabel("<HTML><CENTER>CALCULADORA<BR><BR>Para comenzar seleccione una operación</CENTER></HTML>");
        panel.add(labelInfo);
        for (int i = 0; i < arrayOperations.size(); i++) {
            JButton button = new JButton(arrayOperations.get(i));
            button.setPreferredSize(new Dimension(150,40));
            button.addActionListener(controllerApp);
            button.setActionCommand(arrayOperations.get(i));
            panel.add(button);
        }
        this.add(panel);

    }
}
