package exercise_6;

public class Main {
	public static void main(String[] args) {
		 Product product1 =
		            new Product("Laptop", 25000, 10);

		 Product product2 =
		            new Product("Mouse", 500, 20);

		 ProductManager manager = new ProductManager();

		 System.out.println("=== BAŞLANGIÇ BİLGİLERİ ===");

		 manager.urunBilgileriniGoster(product1);
		 manager.urunBilgileriniGoster(product2);
		 manager.satisYap(product1, 3);
		 manager.satisYap(product2, 25);
		 manager.stokEkle(product2, 10);
		 product1.setPrice(-500);
		 
		 System.out.println("\n=== GÜNCEL BİLGİLER ===");
		 manager.urunBilgileriniGoster(product1);
		 manager.urunBilgileriniGoster(product2);
		    }
}
