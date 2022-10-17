public class statuspendidikan {

    String SMP;

    String SMA;


    statuspendidikan(String SMP,String SMA) {
        this.SMP = SMP;
        this.SMA = SMA;


    }
    void cetakstatuspendidikan(String kelas){

        System.out.println("\nSMP=" +SMP+ "\n SMA=" +SMA);
    }
}
