package polymorphism.runtime;

public class MainRunClass {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        Axis axis = new Axis();
        ICICI icici = new ICICI();

        System.out.println("SBI Rate of Interest "+sbi.getRateOfInterest());
        System.out.println("Axis Rate of Interest "+axis.getRateOfInterest());
        System.out.println("Icici Rate of Interest "+icici.getRateOfInterest());
    }
}
