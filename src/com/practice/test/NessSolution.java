package test;

import java.io.Serializable;

public class NessSolution implements Serializable,Cloneable {

    private NessSolution() {
    }

    private static NessSolution INSTANCE;

    public static synchronized NessSolution getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new NessSolution();
            return INSTANCE;
        }
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return INSTANCE;
    }

    public static void main(String[] args) {
        NessSolution nessSolution1= NessSolution.getInstance();
        System.out.println("First Object : "+nessSolution1);
        NessSolution nessSolution2=NessSolution.getInstance();
        System.out.println("Second Object : "+nessSolution2);
    }


}
