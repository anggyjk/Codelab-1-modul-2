import java.util.Scanner;

class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }

    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    public void tarikUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        } else {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        }
    }
}

 class account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Rekening Anda: ");
        String nimAnda = scanner.nextLine();
        System.out.print("Masukkan Nama Anda: ");
        String namaAnda = scanner.nextLine();
        System.out.print("Masukkan Saldo Awal Anda: ");
        double saldoAnda = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Masukkan Rekening Teman Anda: ");
        String nimTeman = scanner.nextLine();
        System.out.print("Masukkan Nama Teman Anda: ");
        String namaTeman = scanner.nextLine();
        System.out.print("Masukkan Saldo Awal Teman Anda: ");
        double saldoTeman = scanner.nextDouble();

        RekeningBank rekening1 = new RekeningBank(nimAnda, namaAnda, saldoAnda);
        RekeningBank rekening2 = new RekeningBank(nimTeman, namaTeman, saldoTeman);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        System.out.print("Masukkan jumlah setor untuk " + namaAnda + ": ");
        double setorAnda = scanner.nextDouble();
        rekening1.setorUang(setorAnda);

        System.out.print("Masukkan jumlah setor untuk " + namaTeman + ": ");
        double setorTeman = scanner.nextDouble();
        rekening2.setorUang(setorTeman);

        System.out.print("Masukkan jumlah tarik untuk " + namaAnda + ": ");
        double tarikAnda = scanner.nextDouble();
        rekening1.tarikUang(tarikAnda);

        System.out.print("Masukkan jumlah tarik untuk " + namaTeman + ": ");
        double tarikTeman = scanner.nextDouble();
        rekening2.tarikUang(tarikTeman);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        scanner.close();
    }
}
