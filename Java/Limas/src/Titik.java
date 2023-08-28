// FAUZI IRFAN SYAPUTRA
// 21103071
class Titik {
    private double x1, y1;
    private double x2, y2;
    
    public Titik () {

    }

    public Titik (double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public String getKoordinatt1 () {
        return "(" + x1 + ", " + y1 + ")";
    }
    public String getKoordinatt2 () {
        return "(" + x2 + ", " + y2 + ")";
    }

    public static double hitJarak (Titik t2) {
        double dx = t2.x2 - t2.x1;
        double dy = t2.y2 - t2.y1;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public void tampilTitik () {
        System.out.println(getKoordinatt1());
        System.out.println(getKoordinatt2());
    }
}
