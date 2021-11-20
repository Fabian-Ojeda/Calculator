package view;

import controller.ControllerApp;
import model.Operation;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainView extends JFrame {

    private GridSystem gridSystem;

    public MainView(ControllerApp controllerApp, ArrayList<String> arrayOperations) {
        gridSystem = new GridSystem(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(500, 800));
        this.initComponents(controllerApp, arrayOperations);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

    private void initComponents(ControllerApp controllerApp, ArrayList<String> arrayOperations){
        for (int i = 0; i < arrayOperations.size(); i++) {
            JButton button = new JButton(arrayOperations.get(i));
            button.addActionListener(controllerApp);
            button.setActionCommand(arrayOperations.get(i));
            this.add(button, gridSystem.insertComponent(i, 0, 1, 1,1,1));
        }

    }
}
