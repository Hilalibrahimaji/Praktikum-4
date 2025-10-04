package inheritance.hybird;

public class Main {
    public static void main(String[] args) {
        MahasiswaMagang mhsMagang = new MahasiswaMagang();
        mhsMagang.bernapas();  
        mhsMagang.belajar();  
        mhsMagang.magang();   

        DosenPeneliti dosen = new DosenPeneliti();
        dosen.bernapas();  
        dosen.mengajar();  
        dosen.meneliti();  
}
}
