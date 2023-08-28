public class CommissionEmployee extends Employee {
  public float Komisi_3071;
  public float TotalPenjualan_3071;
  public float Totalgaji_3071;
    
  public CommissionEmployee(){
        
  }
    
  public float TotalGaji_3071(){
    Totalgaji_3071 = GajiPokok_3071 + (Komisi_3071 * TotalPenjualan_3071);
    return Totalgaji_3071;
  }
    
  public void TampilData_3071(){
    System.out.println("Commission Employee");
    Tampil_3071();
    System.out.println("Total Gaji: " + Totalgaji_3071);
  }
}
