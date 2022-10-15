package Ödev3;

public class Main {

	public static void main(String[] args) {
		
		
		IDatabase[] databaseManager = {new MongoDatabase(),new SqlDatabase()};
		
		// yani interface onu implemente eden class'ın referansını tutabilir
		// bu aynı  zamanda polymorphism'e de girmektedir 
		
		
		  for (IDatabase databases : databaseManager) { 
		  databases.add();
		  databases.delete();
		  databases.DatabaseName();
		  }
		 
		  
		  // ALPER KARACA 21410051022
		
		
		
		
	}

}
