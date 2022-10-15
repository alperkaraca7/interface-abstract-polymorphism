package Ödev3;

public class MongoDatabase implements IDatabase{

	@Override
	public void add() {
		System.out.println("veri eklendi : Mongo :) ");
	}

	@Override
	public void delete() {
		System.out.println("veri silindi : Mongo :) ");
		
	}

	@Override
	public void DatabaseName() {
		System.out.println("işi yapan veri tabanı ismi : Mongo");
	}
	
	

}
