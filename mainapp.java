public class mainapp {
    public static void main(String[]args) {
        karyawan karyawan=new karyawan("lina astika dewi", "praya","24 april 1999");
        karyawan.cetakkaryawan(karyawan.nama);

        penggajian penggajian = new penggajian(200,4000000,100);
        penggajian.cetakpenggajian(penggajian.gajipokok);


        statuspendidikan statuspendidikan= new statuspendidikan("smpn 2 praya ","SMKN 1 PRAYA TENGAH");
        statuspendidikan.cetakstatuspendidikan(statuspendidikan.SMA);

        jabatan jabatan= new jabatan("angkasa pura 1 airport", "shared devartement head");
        jabatan.cetakjabatan(jabatan.mananger);




    }
}
