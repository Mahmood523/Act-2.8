package Factory;

import java.sql.Connection;

import Utils.ConnectionManager;

public class FactoryDAO {

	
	
	
	
	
	
	public static Connection connect () {
		return ConnectionManager.getInstance().getConnection() ;
		
	}
}
