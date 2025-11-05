public class PegawaiDemo11 {
    public static void main(String[] args) {
        Dosen11 dosen1 = new Dosen11("19940201", "Widia, S.Kom. M.Kom", "199420");
        TenagaKependidikan11 tendik1 = new TenagaKependidikan11("19750301", "Aida, A.Md.", "Tenaga Administrasi");

        train(dosen1);
        train(tendik1);
    }

    public static void train(Pegawai11 pegawai) {
        pegawai.displayInfo();
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");

        if (pegawai instanceof Dosen11) {
            System.out.println("Memberikan pelatihan pedagogik");
        }
    }
}
