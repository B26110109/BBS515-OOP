package exercise_5;

public class Main {
	

	  public static void main(String[] args) {

	        // 1. Nesneleri oluştur
	        Arac arac1 = new Arac("Toyota", "Corolla", 1500, false);
	        Arac arac2 = new Arac("Renault", "Clio", 1200, false);
	        Arac arac3 = new Arac("BMW", "320i", 3000, true);


	        // 2. Başlangıç bilgilerini yazdır
	        System.out.println("=== ARAÇ KİRALAMA SİSTEMİ ===");

	        arac1.bilgileriGoster();
	        arac2.bilgileriGoster();
	        arac3.bilgileriGoster();


	        // 3. arac1'i kirala
	        arac1.kirala();


	        // 4. arac1'i tekrar kiralamayı dene
	        arac1.kirala();


	        // 5. arac2 için 5 günlük kira bedeli hesapla
	        double bedel = arac2.kiraBedeliHesapla(5);

	        System.out.println("5 günlük kiralama bedeli: "
	                + bedel + " TL");


	        // 6. arac3'ü teslim al
	        arac3.teslimEt();


	        // 7. Güncel araç durumlarını yazdır
	        System.out.println("\n=== GÜNCEL ARAÇ DURUMLARI ===");

	        arac1.bilgileriGoster();
	        arac2.bilgileriGoster();
	        arac3.bilgileriGoster();

	    }
	}
