public class Professor extends person {
    private int jalase;
    private long hogog;
    public Professor (String firstname, String lastname, int jalase, long hogog) {
        super(firstname, lastname);
        this.jalase = jalase;
        this.hogog = hogog;
    }
    public int getjalase () {
        return jalase ;
    }
    public double gethogog () {
        return hogog;
    }
    public long calculateSalary () {
        return this.hogog * this.jalase;
    }
}
