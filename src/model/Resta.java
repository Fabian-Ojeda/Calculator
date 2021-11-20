package model;

public class Resta extends Operation{

    public Resta(String name) {
        super(name);
    }

    @Override
    public Integer operate(int a, int b) {
        return a-b;
    }
}
