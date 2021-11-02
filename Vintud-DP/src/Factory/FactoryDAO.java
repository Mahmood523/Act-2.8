package Factory;

import java.sql.Connection;

import DAO.AnnonceDAO;
import DAO.AnnonceDAOImpl;
import DAO.FavorisDAO;
import DAO.FavorisDAOImpl;
import DAO.RechercheDAO;
import DAO.RechercheDAOImpl;
import DAO.UtilisateurDAO;
import DAO.UtilisateurDAOImpl;
import Utils.ConnectionManager;

public class FactoryDAO {

	
	public static AnnonceDAO getAnnonceDAO() {
		return new AnnonceDAOImpl();
	}
	
	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOImpl();
	}
	
	public static FavorisDAO getFavorisDAO() {
		return new FavorisDAOImpl();
	}
	
	public static RechercheDAO getRechercheDAO() {
		return new RechercheDAOImpl();
	}
	
	
	
	
	public static Connection connect () {
		return ConnectionManager.getInstance().getConnection() ;
		
	}
}
