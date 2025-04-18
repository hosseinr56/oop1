public class student extends person {
    public student (String firstname, String lastname) {
        super(firstname, lastname);
    }
    private int index = 0;
    private int [] vahed = new int[100];
    private double [] nomre = new double[100];

    public void addingstudent (int vahed, double nomre) {
        this.vahed[index] = vahed;
        this.nomre[index] = nomre;
        this.index++;
    }

    public double average (){
        double total = 0.0;
        int vahed = 0;
        for (int i = 0; i <= index-1; i++) {
            total += this.vahed[i]*this.nomre[i];
            vahed +=  this.vahed[i];
        }
        if (total == 0.0) {
            return 0.0;
        }
        else {
            return total/vahed;
        }
    }
}
