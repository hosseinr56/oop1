import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("نام استاد را وارد کنید");
        String firsname = sc.nextLine();
        System.out.println("نام خانوادگی استاد را وارد کنید");
        String lastname = sc.nextLine();
        System.out.println("تعداد جلسات رو وارد کنید");
        int jalase = sc.nextInt();
        System.out.println("حقوق هر جلسه رو وارد کنید");
        double hogog = sc.nextDouble();
        Professor ps = new Professor(firsname, lastname,jalase,hogog);
        System.out.println("حقوق استاد "+ps.getFirstName()+" "+ ps.getLastName()+":"+ps.calculateSalary());
        sc.nextLine();
        System.out.println("نام دانش آموز را وارد کنید");
        String firsname2 = sc.nextLine();
        System.out.println("نام خانوادگی دانش آموز را وارد کنید");
        String lastname2 = sc.nextLine();
        student st = new student(firsname2,lastname2);
        System.out.println("تعداد درس هارو وارد کنید");
        int dars = sc.nextInt();
        for(int i=0;i<dars;i++){
            System.out.println("تعداد واحد درس"+(i+1)+"وارد کنید");
            int vahed= sc.nextInt();
            System.out.println("نمره درس"+(i+1)+"وارد کنید");
            double nomre = sc.nextDouble();
            st.adding(vahed,nomre);
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println("معدل دانشجو"+st.getFirstName()+" "+st.getLastName()+":"+st.average());
        sc.close();
    }
}