package test;

import junit.framework.TestCase;
import model.Suma;

public class TestSuma extends TestCase {
    private Suma suma;

    public void initScene (){
        suma = new Suma("suma");
    }
    public void testOperate() {
        initScene();
        assertEquals((Integer) 8,suma.operate(6,2));
    }
}
