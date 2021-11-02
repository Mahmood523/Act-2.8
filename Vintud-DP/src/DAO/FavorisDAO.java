package DAO;

import java.sql.SQLException;

import entites.Announcement;

public interface FavorisDAO {
	
	public abstract void addAnnonce(Announcement A) throws SQLException;
	public abstract void DeleteAnnoce(Announcement A) throws SQLException;
	
	public abstract void ModifAnnonce(Announcement A) throws SQLException;

}
