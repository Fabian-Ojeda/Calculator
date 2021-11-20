package view;

import controller.ControllerApp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class OperationView extends JFrame {

    private GridSystem gridSystem;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JLabel frameNameOperation;
    public OperationView (ControllerApp controllerApp){
        gridSystem = new GridSystem(this);
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(300, 400));
        this.initComponents(controllerApp);
        this.pack();
        this.setResizable(false);
        this.setVisible(false);
    }
    private void initComponents (ControllerApp controllerApp){
        frameNameOperation = new JLabel();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7,1,4,20));
        panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        panel.add(frameNameOperation, gridSystem.insertComponent(0, 1, 1, 1));

        JLabel labelValueA = new JLabel("Por favor ingrese el primer valor");
        panel.add(labelValueA);

        textFieldA  = new JTextField();
        panel.add(textFieldA);

        JLabel labelValueB = new JLabel("Por favor ingrese el segundo valor");
        panel.add(labelValueB);

        textFieldB = new JTextField();
        panel.add(textFieldB);

        JButton buttonOperate = new JButton("Operar");
        buttonOperate.setPreferredSize(new Dimension(100, 40));
        buttonOperate.addActionListener(controllerApp);
        buttonOperate.setActionCommand("operation");

        panel.add(buttonOperate);
        this.add(panel,gridSystem.insertComponent(1,1,1,1));

    }
    public void changeOperation(String nameOperation){
        this.frameNameOperation.setText("<HTML><CENTER>"+nameOperation+"</CENTER></HTML>");
    }

    public String getValueA() {
        return textFieldA.getText();
    }

    public String getValueB() {
        return textFieldB.getText();
    }
}
