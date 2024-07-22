public class Es3 {
    public static void main(String[] args) {

        System.out.println("Perimetro rettangolo = "+perimetroRettangolo(2.2,3));

        System.out.println("Il numero è "+ pariDispari(3));

        System.out.println("Area rettangolo = " + perimetroTriangolo(5.0,10.0,12.0));
    }

    public static double perimetroRettangolo(double lato1, double lato2) {
        return (lato1 + lato2) * 2;
    }

    public static int pariDispari(int num) {
        if (num %2 == 0) {
            return 0;
        }else {
            return 1;
        }

    }

    public static double perimetroTriangolo(double l1, double l2, double l3) {
    double p = (l1+l2+l3) / 2 ;
    double a = p * (p-l1) * (p-l2) * (p-l3);
    return Math.sqrt(a);
    }
}
