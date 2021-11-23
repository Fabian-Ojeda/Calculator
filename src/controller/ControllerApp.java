package controller;

import model.Calculator;
import view.MainView;
import view.OperationView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerApp implements ActionListener {

    private Calculator calculator;
    private MainView mainView;
    private OperationView operationView;
    private String operationActive;
    public ControllerApp(){
        this.calculator= new Calculator();
        mainView = new MainView(this, this.calculator.getOperations());
        operationView = new OperationView(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()){
            case "suma":
                operationActive="suma";
                operationView.changeOperation("SUMA");
                operationView.setVisible(true);
                break;
            case "resta":
                operationActive="resta";
                operationView.changeOperation("RESTA");
                operationView.setVisible(true);
                break;
            case "Multiplicacion":
                operationActive="Multiplicacion";
                operationView.changeOperation("MULTIPLICACIÓN");
                operationView.setVisible(true);
                break;
            case "operation":
                this.operate();
                break;

            default:
                JOptionPane.showMessageDialog(null,"nada");
                break;
        }
    }
    private void operate(){
        JOptionPane.showMessageDialog(null,"La respuesta de la "+operationActive+" es: "+
                calculator.operate(operationActive, Integer.parseInt(operationView.getValueA()), Integer.parseInt(operationView.getValueB())));
    }
}
