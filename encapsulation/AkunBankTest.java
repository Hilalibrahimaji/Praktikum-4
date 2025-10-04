public class AkunBankTest {
    public static void main(String[] args) {
        AkunBank akun1 = new AkunBank(10);
        AkunBank akun2 = new AkunBank(10);
        AkunBank akun3 = new AkunBank(10);
        System.out.println("Saldo awal: Rp." + akun1.getSaldo());
        System.out.println("Saldo awal: Rp." + akun2.getSaldo());
        System.out.println("Saldo awal: Rp." + akun3.getSaldo());

        akun1.setSaldo(20);
        akun2.setSaldo(30);
        akun3.setSaldo(40);
        System.out.println("Saldo setelah diubah: " + akun1.getSaldo());
        System.out.println("Saldo setelah diubah: " + akun2.getSaldo());
        System.out.println("Saldo setelah diubah: " + akun3.getSaldo());

        akun1.menabung(50);
        akun2.menabung(60);
        akun3.menabung(70);
        System.out.println("Saldo setelah menabung: " + akun1.getSaldo());
        System.out.println("Saldo setelah menabung: " + akun2.getSaldo());
        System.out.println("Saldo setelah menabung: " + akun3.getSaldo());

        akun1.tarikTunai(80);
        akun2.tarikTunai(90);
        akun3.tarikTunai(100);
        System.out.println("Saldo setelah tarik tunai: " + akun1.getSaldo());
        System.out.println("Saldo setelah tarik tunai: " + akun2.getSaldo());
        System.out.println("Saldo setelah tarik tunai: " + akun3.getSaldo());
    }
}
