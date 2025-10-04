public class AkunBank{
    private int saldo;
    private static final int MIN_SALDO  = 0;

    public AkunBank(int saldo) {
        if (saldo >= MIN_SALDO) {
            this.saldo = saldo;
        } else {
            this.saldo = MIN_SALDO;
        }
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public int menabung(int saldo){
        return this.saldo += saldo;
    }

    public void tarikTunai(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan harus lebih besar dari 0.");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup untuk menarik Rp " + jumlah);
        } else {
            saldo -= jumlah;
            System.out.println("Berhasil menarik Rp " + jumlah);
        }
    }
}
