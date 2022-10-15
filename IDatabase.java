package Ödev3;

public abstract interface IDatabase {			// // ALPER KARACA 21410051022
	
	void add();  
	
	void delete();
	
	/*
	 * DatabaseManager adında oluşturduğum bu interface bi çok sınıfın yapacağı
	 * ortak işi-operasyonu barındırmakta.Bu operasyonları kullanacak olan sınıflar
	 * bu interface'i implemente ederek kendilerine göre doldurmak zorundalar
	 * 
	 * önemli bir özelliği ve amacı da diyecek olursak interface'ler 
	 * diğer sınıfların referansını tutabilir. Main sınıfında örnek olarak belirttim.
	 */

	public abstract void DatabaseName();
	
	/*
	 *IDatabase interface'sine abstract ekleyerek Idatabase'den implemente eden
	 * sınıflara veritabanı ismini kendilerine göre yazmalarını da mecbur kıldım.
	 * eğer değiştirmelerine izin vermek istemeseydik DatabaseName metoduna 
	 * final kavramını ekleyerek bunu halledebilirdik
	 * 
	 *bu örnekte direkt abstract class oluşturmak yerine interface e ekledim ve orda da çalıştığını
	 * görmüş oldum
	 */
	
	

}
