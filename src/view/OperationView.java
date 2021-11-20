package view;

import controller.ControllerApp;

import javax.swing.*;
import java.awt.*;

public class OperationView extends JFrame {

    private GridSystem gridSystem;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JLabel frameNameOperation;
    public OperationView (ControllerApp controllerApp){
        gridSystem = new GridSystem(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(400, 700));
        this.initComponents(controllerApp);
        this.pack();
        this.setResizable(false);
        this.setVisible(false);
    }
    private void initComponents (ControllerApp controllerApp){
        frameNameOperation = new JLabel();
        this.add(frameNameOperation, gridSystem.insertComponent(0, 0, 1, 1,1,1));

        JLabel labelValueA = new JLabel("Por favor ingrese el primer valor");
        this.add(labelValueA, gridSystem.insertComponent(1, 0, 1, 1,1,1));

        textFieldA  = new JTextField();
        this.add(textFieldA, gridSystem.insertComponent(2, 0, 1, 1,1,1));

        JLabel labelValueB = new JLabel("Por favor ingrese el valor de B");
        this.add(labelValueB, gridSystem.insertComponent(3, 0, 1, 1,1,1));

        textFieldB = new JTextField();
        this.add(textFieldB, gridSystem.insertComponent(4, 0, 1, 1,1,1));

        JButton buttonOperate = new JButton("Operar");
        buttonOperate.addActionListener(controllerApp);
        buttonOperate.setActionCommand("operation");
        this.add(buttonOperate, gridSystem.insertComponent(5, 0, 1, 1,1,1));

    }
    public void changeOperation(String nameOperation){
        this.frameNameOperation.setText(nameOperation);
    }

    public String getValueA() {
        return textFieldA.getText();
    }

    public String getValueB() {
        return textFieldB.getText();
    }
}
