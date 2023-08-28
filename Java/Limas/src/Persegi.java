// FAUZI IRFAN SYAPUTRA
// 21103071
class Persegi extends Titik{
    private double sisiPSG = super.hitJarak(this); 
    
    Persegi () {

    }

    Persegi (double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    public void sisiPSG () {
        super.hitJarak(this);
    }

    public double hitungLuas () {
        return sisiPSG * sisiPSG;   
    }

    public void tampil () {
        System.out.println("== DATA Persegi ==");
        System.out.print("Point : ");
        tampilTitik ();
        System.out.println("Sisi Segitiga : " + sisiPSG);
        System.out.println("Luas Segitiga : " + hitungLuas());
        System.out.println(" ");
    }
}
