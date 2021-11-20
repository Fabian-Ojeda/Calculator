package model;

public class Suma extends Operation{
    public Suma(String name) {
        super(name);
    }

    @Override
    public Integer operate(int a, int b) {
        return a+b;
    }
}
