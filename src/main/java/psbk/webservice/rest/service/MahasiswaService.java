package psbk.webservice.rest.service;

import java.sql.SQLException;

import psbk.webservice.rest.model.Mahasiswa;

public class MahasiswaService {
	
	public void insert(Mahasiswa m){
		String query = "insert into mahasiswa values('"+m.getNrp()+"','"+m.getNama()+"','"+m.getNoTelp()+"')";
		System.out.println(query);
		try {
			Koneksi.getInstance().getKoneksi().createStatement().execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
