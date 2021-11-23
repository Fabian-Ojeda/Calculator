package model;

public class Multiplicacion extends Operation{
    public Multiplicacion(String name) {
        super(name);
    }

    @Override
    public Integer operate(int a, int b) {
        return a*b;
    }
}
