package tugas3_pemlan;

public class classHero {
    private String Nama;
    private double hp;
    private double serangan;
    private double pertahanan;
    private boolean kemampuan;

    public classHero(String nama, double hp, double serangan, double pertahanan) {
        this.Nama = nama;
        this.hp = hp;
        this.serangan = serangan;
        this.pertahanan = pertahanan;
        this.kemampuan = false;
    }

    public void kemampuan(String namaKemampuan) {
        if (!kemampuan && namaKemampuan.equals("Immunity")) {
            System.out.println(this.Nama + " menggunakan kemampuan " + namaKemampuan + "!");
            kemampuan = true;
        } else {
            System.out.println("Kemampuan tidak tersedia atau sudah digunakan!");
        }
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getSerangan() {
        return serangan;
    }

    public void setSerangan(double serangan) {
        this.serangan = serangan;
    }

    public double getPertahanan() {
        return pertahanan;
    }

    public void setPertahanan(double pertahanan) {
        this.pertahanan = pertahanan;
    }

    public void serangan(classHero musuh) {
        System.out.println(this.Nama + " menyerang " + musuh.getNama());
        double kerusakan = this.serangan - musuh.pertahanan;
        if (kerusakan < 0) {
            kerusakan = 0;
        }
        musuh.hp -= kerusakan;
        System.out.println(this.Nama + " menyerang sebesar " + this.serangan);
        System.out.println(musuh.getNama() + " memiliki pertahanan sebesar " + musuh.pertahanan);
        System.out.println("Health " + musuh.getNama() + " saat ini " + musuh.hp);
    }

}
