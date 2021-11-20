package model;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Operation> arrayOperations;
    public Calculator (){
        arrayOperations = new ArrayList<>();
        this.setOperations();
    }
    private void setOperations(){
        Suma suma = new Suma("suma");
        arrayOperations.add(suma);
    }
    public ArrayList<String> getOperations (){
        ArrayList<String> arrayToReturn = new ArrayList<>();
        for (Operation iterator: arrayOperations){
            arrayToReturn.add(iterator.getName());
        }
        return arrayToReturn;
    }
    public Integer operate(String operation, int a, int b){
        for (Operation iterator: arrayOperations){
            if(iterator.getName()==operation){
                return iterator.operate(a,b);
            }
        }
        return null;
    }
}
