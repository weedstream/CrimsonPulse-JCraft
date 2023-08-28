public class Bus implements InterfaceBus {
  protected int KapasitasPenumpang;
    protected int KapasitasBagasi;
    protected float TotalPajak;
    
    public Bus(){
        
    }
    
    // @Override
    public float HitungPajakBus(){
        TotalPajak = (float) (Pajak + (Pajak * KapasitasPenumpang * KapasitasBagasi * 0.00005));
        return TotalPajak;
    }
    
    // @Override
    public void tampilInfo(){
        TampilInfo();
    }
    
    // @Override
    public void InfoBus(){
        System.out.println("Kapasitas penumpang: " + KapasitasPenumpang);
        System.out.println("Kapasitas bagasi: " + KapasitasBagasi);
        System.out.println("Total Pajak: " + TotalPajak);
    }
}
