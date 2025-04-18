public class Professor extends person {
    private int jalase;
    private double hogog;
    public Professor (String firstname, String lastname, int jalase, double hogog) {
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
    public double calculateSalary () {
        return this.hogog * this.jalase;
    }
}
