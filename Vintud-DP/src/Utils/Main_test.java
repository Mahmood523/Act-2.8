package Utils;

import java.sql.SQLException;

import DAO.AnnonceDAO;
import DAO.AnnonceDAOImpl;
import DAO.UtilisateurDAOImpl;
import entites.Announcement;
import entites.User;

public class Main_test {

	public static void main(String[] args) throws SQLException {
		AnnonceDAOImpl Dao1 = new AnnonceDAOImpl();
		UtilisateurDAOImpl Dao2 = new UtilisateurDAOImpl();
		User U = new User();
		Announcement A = new Announcement();
		Dao1.afficherAnnonces();
	//	Dao2.afficherVendeur(A);
		

	}

}
