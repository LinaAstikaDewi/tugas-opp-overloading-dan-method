 public class penggajian {
        int gajipokok;
        int gajitunjanganjabatan;
        int gajilembur;

        penggajian( int gajitunjanganjabatan, int gajipokok, int gajilembur){

            this.gajipokok=gajipokok;
            this.gajitunjanganjabatan=gajitunjanganjabatan;
            this.gajilembur=gajilembur;

        }
        void cetakpenggajian( int gajilembur){

            System.out.println("\n gajipokok="+ gajipokok +
                    "\ngajitunjanganjabatan=" +gajitunjanganjabatan+
                    "\n gajilembur=" +gajilembur);
        }
    }
