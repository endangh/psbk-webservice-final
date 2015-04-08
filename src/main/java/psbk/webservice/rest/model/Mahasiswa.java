package psbk.webservice.rest.model;

public class Mahasiswa {

	private String nrp;
	private String nama;
	private String noTelp;

	public Mahasiswa(String nrp, String nama, String noTelp) {
		super();
		this.nrp = nrp;
		this.nama = nama;
		this.noTelp = noTelp;
	}

	public Mahasiswa() {
		super();
	}

	public String getNrp() {
		return nrp;
	}

	public void setNrp(String nrp) {
		this.nrp = nrp;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNoTelp() {
		return noTelp;
	}

	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
	}

}
