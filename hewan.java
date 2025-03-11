class Hewan {
    String nama;
    String jenis;
    String suara;

    Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println();
    }
}

 class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan anjing = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        kucing.tampilkanInfo();
        anjing.tampilkanInfo();
    }
}
