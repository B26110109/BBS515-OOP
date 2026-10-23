package bbs515;
import java.util.Scanner;
public class OgrenciNotAnalizSistemi {

public static void notlariAl(int[] notlar) {

	Scanner scanner = new Scanner(System.in)
			;
//	int[] notlar = new int[5];
	
	for (int i = 0; i<5; i++) {
		System.out.print((i+1) + ". notu giriniz:");
		notlar[i] = scanner.nextInt();
	}}
// 2. Sinif ortalamasini hesapla
public static double ortalamaHesapla(int[] notlar) {
	
	return (notlar[0] + notlar[1] +notlar[2] + notlar[3]+notlar[4]) / 5.0
	;
	
}

// 3. En yuksek notu bul
public static int enYuksekNot(int[] notlar) {
	int enYuksekNot=notlar[0];
for (int i =1; i<5; i++) {
	if(notlar[i] > enYuksekNot) {
		enYuksekNot = notlar[i];
	}
}
return enYuksekNot;
}
// 4. Basarili ogrenci sayisini hesapla
public static int basariliSayisi(int[] notlar) {
	int sayac = 0;
	for (int i =0; i<5; i++) {
		if(notlar[i] > 50) {
			sayac++;
		}
	}
	return sayac;
	
}
// 5. Sonuclari ekrana yazdir
public static void sonuclariYazdir(double ortalama,
int enYuksek, int basarili) {

	System.out.println("");
	System.out.println("===== ANALIZ SONUCLARI =====");
	System.out.println("Sinif Ortalamasi: " + ortalama);
	System.out.println("En yuksek not: " + enYuksek);
	System.out.println("Basarili ogrenci sayisi: " + basarili);
			
}
public static void main(String[] args) {
int[] notlar = new int[5];
System.out.println("===== OGRENCI NOT ANALIZ SISTEMI =====");
notlariAl(notlar);
double ortalama = ortalamaHesapla(notlar);
int enYuksek = enYuksekNot(notlar);
int basarili = basariliSayisi(notlar);
sonuclariYazdir(ortalama, enYuksek, basarili);
}
}