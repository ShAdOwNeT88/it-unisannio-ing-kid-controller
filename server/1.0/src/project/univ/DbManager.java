package project.univ;

import java.sql.SQLException;

public class DbManager {
	Db db=new Db();
	public DbManager() throws SQLException{
		db=new Db();
	}
	
	public boolean trova(String email, String password, String imei) {
		
		return false;
	}

	public boolean trovaemail(String email) {

		return false;
	}

	public void creauser(String email, String password, String imei, String preferenze, String campo) {
		
	}

	public void insertPreference(String email, String latitudine, String longitudine, int raggio) {
			
	}
	
	public void changePreferenceSms(String email, int num){
		
	}

	public void changePreferenceEmail(String email, String sms_email) {
		
	}

	public void insertCoordinate(String lat, String lng, String imei) {
		
	}

	public Posizione coordinateImpostate(String imei) {
		return null;
	}

	public void setStato(String imei, String string) {
		
	}
	
	
	


}