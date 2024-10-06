import java.util.Scanner;
public class tinh {
    public static void main(String[] args) {
        // tao doi tuong de nhap du lieu
        Scanner Scanner = new Scanner(System.in);
        // nhap chieu dai
        System.out.println("chieu dai:");
        int chieudai = Scanner.nextInt();
        // nhap chieu rong
        System.out.println("chieu rong:");
        int chieurong = Scanner.nextInt();
        // chu vi
        int chuvi = (chieudai+chieurong)*2;
        System.out.println("chu vi hcn"+ chuvi);
        int dientich = chieudai*chieurong;
        System.out.println("dien tich hcn:"+dientich);
        int a = 900;
        int b = 700;
        int c = 30;
        int d = 1000;
        int lonnhat =Math.max( Math.max(Math.max(a, b), c),d);
        System.out.println("so lon nhat la"+lonnhat);
        



    }
}
