package exercise_5;

public class Arac {
	// Instance variables
	String marka;
	String model;
	double gunlukUcret;
	boolean kiradaMi;
	// Constructor
	//Başlangıç verileri: arac1 → Toyota Corolla, 1500 TL, müsait; arac2 → Renault Clio, 1200 TL, müsait; arac3 → BMW 320i, 3000
	//TL, kirada.
		Arac(String marka,String model,	double gunlukUcret,boolean kiradaMi) {
			this.marka=marka;
			this.model=model;
			this.gunlukUcret=gunlukUcret;
			this.kiradaMi=kiradaMi;
		}

	void bilgileriGoster() {
		    System.out.println("Marka: " + marka);
		    System.out.println("Model: " + model);
		    System.out.println("Günlük Ücret: " + gunlukUcret);

		    if (kiradaMi) {
		        System.out.println("Durum: Kirada");
		    } else {
		        System.out.println("Durum: Müsait");
		    }
		    System.out.println("--------------------");
		}
	
	void kirala() {
		    if (kiradaMi == false) {
		        kiradaMi = true;
		        System.out.println(marka + " " + model
		                + " başarıyla kiralandı.");
		    } else {
		        System.out.println("Bu araç zaten kiralanmış!");
		    }
		}
	
	void teslimEt() {
		    if (kiradaMi == true) {
		        kiradaMi = false;
		        System.out.println(marka + " " + model
		                + " başarıyla teslim alındı.");
		    } else {
		        System.out.println("Bu araç zaten müsait!");
		    }
		}
	
	double kiraBedeliHesapla(int gun) {

	    if (gun <= 0) {
	        return 0;
	    }

	    return gunlukUcret * gun;
	}
}
	


