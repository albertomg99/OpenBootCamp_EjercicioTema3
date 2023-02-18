public class coche {
    protected int numPuertas;

    public int getNumPuertas() {
        return numPuertas;
    }

    public coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public coche() {
        this.numPuertas = 4;
    }

    public void addPuertas() {
        this.numPuertas++;
    }
}
