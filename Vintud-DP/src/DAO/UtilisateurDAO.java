package DAO;

import java.sql.SQLException;
import java.util.List;

import entites.Announcement;
import entites.User;

public interface UtilisateurDAO {

	public abstract void addUser(User U) throws SQLException;
	public abstract void seConnecter (User U) throws SQLException;
	public abstract void ModifUser(User U) throws SQLException; 
	public abstract List<User> afficherVendeur(Announcement A) throws SQLException;
	
	
	
	
}
