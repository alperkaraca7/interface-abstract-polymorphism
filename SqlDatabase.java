package Ödev3;

public class SqlDatabase implements IDatabase{

	@Override
	public void add() {
		System.out.println("veri eklendi : SQl ");
		
	}

	@Override
	public void delete() {
		System.out.println("Veri silindi : SQl");		
	}

	@Override
	public void DatabaseName() {
		System.out.println("işi yapan veri tabanı ismi : sql");
		
		
	}

}
