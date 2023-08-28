// import java.util.Scanner;
public class AsistenPrak extends Mahasiswa implements Pendapatan {
  String mkAsistensi;
  int jmlPertemuan;
  int totalPdpt;


  double totalPendapatan () {
    totalPdpt = jmlPertemuan * 50000;
  }
  void tampilData () {
    System.out.println("Nama : " + nama);
    System.out.println("NIM : " + nim);
    System.out.println("Jurusan : " + jurusan);
    System.out.println("IPK : " + ipk);
  }
}
