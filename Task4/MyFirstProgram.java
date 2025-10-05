class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass();
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.setI(i);
                o.setJ(j);
                System.out.print(o.multiplicationIByJ());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class MySecondClass {
    private int i, j;

    MySecondClass () {
        i = 0;
        j = 0;
    }

    MySecondClass (int i, int j) {
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