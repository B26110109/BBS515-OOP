package bbs515;

public class KargoDagitim {

    public static void main(String[] args) {
int i = 5;
double toplamGelir= 0;

for (int j = 1; j <= 10; j++) {

    double ucret;

    if (i <= 10) {
        ucret = 50;
    } else if (i <= 30) {
        ucret = 80;
    } else {
        ucret = 120;
    }

    if (j % 3 == 0) {
        ucret = ucret + 20;
    }

    if (i >= 40) {
        ucret = ucret * 0.90;
    }

    System.out.println(j + ". Teslimat - Mesafe: "
            + i + " km - Ücret: " + ucret + " TL");

    toplamGelir = toplamGelir + ucret;

    i = i + 5;
}

System.out.println("Toplam Gelir: " + toplamGelir + " TL");
}
}