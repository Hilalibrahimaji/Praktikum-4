package inheritance.hierarchical;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Staff staff = new Staff();

        manager.bekerja();
        manager.pimpinTim();

        staff.bekerja();
        staff.jalankanTugas();
    }
}
