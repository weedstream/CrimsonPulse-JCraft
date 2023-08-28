public class StudentStaff extends Mahasiswa implements Pendapatan {
  int unitKerja;
  int jamKerja;
  int totalPdpt;

  double totalPendapatan () {
    totalPdpt = jamKerja * 30000;
  }

  void tampilData () {
    System.out.println("Nama : " + nama);
    System.out.println("NIM : " + nim);
    System.out.println("Jurusan : " + jurusan);
    System.out.println("IPK : " + ipk);
  }
}
