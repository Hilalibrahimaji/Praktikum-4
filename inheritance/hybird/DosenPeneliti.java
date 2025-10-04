package inheritance.hybird;

interface Peneliti {
    void meneliti();
}

public class DosenPeneliti extends Dosen implements Peneliti {
    public void meneliti() {
        System.out.println("Dosen peneliti sedang meneliti.");
    }
    
}
