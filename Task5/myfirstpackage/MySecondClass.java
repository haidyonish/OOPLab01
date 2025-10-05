package myfirstpackage;

public class MySecondClass {
    private int i, j;

    public MySecondClass () {
        i = 0;
        j = 0;
    }

    public MySecondClass (int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int multiplicationIByJ() {
        return i*j;
    }
}