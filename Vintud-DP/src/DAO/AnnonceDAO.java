package DAO;

import java.sql.SQLException;
import java.util.List;

import entites.Announcement;

public interface AnnonceDAO {
	
	public abstract List<Announcement> afficherAnnonces() throws SQLException ;
	public abstract void addAnnonce(Announcement A) throws SQLException;
	public abstract void DeleteAnnoce(Announcement A) throws SQLException;
	public abstract void ModifAnnonce(Announcement A) throws SQLException;
	
	

}
