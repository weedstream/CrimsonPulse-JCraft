import java.io.BufferedReader;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(System.in);
        Scanner input = new Scanner(System.in);
        Pendapatan mhsas = new AsistenPrak();
        Pendapatan mhsstu = new StudentStaff();

        Mahasiswa asprak = new Mahasiswa(AsistenPrak);
        Mahasiswa stustaff = new Mahasiswa(StudentStaff);
        


    }
}
