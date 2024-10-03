public class Karyawan {
    public String nama;
    public String kodeKaryawan;

    Karyawan(String kodeKaryawan, String nama) {
        this.kodeKaryawan = kodeKaryawan;
        this.nama = nama;
    }
    public void getinfo() {
        System.out.println("Kode Karyawan : "+this.kodeKaryawan);
        System.out.println("Nama : "+this.nama);
    }
}
