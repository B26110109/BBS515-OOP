package exercise_6;

public class ProductManager {
	public void urunBilgileriniGoster(Product product) {
	    System.out.println("Ürün: " + product.getName());
        System.out.println("Fiyat: " + product.getPrice());
        System.out.println("Stok: " + product.getStock());
        System.out.println("------------------------");
		}
	
		public void satisYap(Product product, int adet) {
			if (adet > 0 && product.getStock() >= adet) {
		        product.setStock(product.getStock() - adet);
		        System.out.println(adet + " adet "
		                + product.getName() + " satıldı.");
		    } else {
		        System.out.println("Yetersiz stok!");
		    }
		}
		
		public void stokEkle(Product product, int adet) {

		    if (adet > 0) {
		        product.setStock(product.getStock() + adet);
		        System.out.println(adet + " adet "
		                + product.getName() + " stoka eklendi.");
		    } else {
		        System.out.println("Eklenecek adet pozitif olmalıdır!");
		    }
		}
	
}
