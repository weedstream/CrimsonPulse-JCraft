// FAUZI IRFAN SYAPUTRA
// 21103071
class SgtSamaSisi extends Titik {
    private double sisiSGT = super.hitJarak(this);

    SgtSamaSisi () {

    }

    SgtSamaSisi (double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    public void sisiSGT () {
        super.hitJarak(this);
    }

    public double hitungLuas () {
        return 0.5 * sisiSGT * Math.cbrt(3);   
    }

    public void tampil () {
        System.out.println("== DATA Segitiga ==");
        System.out.print("Point : ");
        tampilTitik ();
        System.out.println("Sisi Segitiga : " + sisiSGT);
        System.out.println("Luas Segitiga : " + hitungLuas());
        System.out.println(" ");
    }
    
}
