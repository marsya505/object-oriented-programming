public class PegawaiDemo11 {
    public static void main(String[] args) {
        Dosen11 dosen1 = new Dosen11("19940201", "Widia, S.Kom. M.Kom", "199420");
        
        Pegawai11 pegawai1 = dosen1;

        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        pegawai1.displayInfo();

        Dosen11 newDosen = (Dosen11) pegawai1;

        System.out.println(newDosen.nama);
        System.out.println(newDosen.nidn);
        newDosen.mengajar();
    }
}
