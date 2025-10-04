package inheritance.multiple;

interface HidupkanMesin {
    void hidup();
}
interface HidupkanLampu {
    void nyala();
}

public class Motor implements HidupkanMesin, HidupkanLampu {
    String merk;
    public void hidup() {
        System.out.println("Mesin " + merk + " dihidupkan.");
    }
    public void nyala() {
        System.out.println("Lampu " + merk + " dinyalakan.");
    }

}

