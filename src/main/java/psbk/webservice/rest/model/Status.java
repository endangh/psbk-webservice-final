package psbk.webservice.rest.model;

public class Status {

	private String kode;
	private String pesan;

	public Status(String kode, String pesan) {
		super();
		this.kode = kode;
		this.pesan = pesan;
	}

	public Status() {
		super();
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getPesan() {
		return pesan;
	}

	public void setPesan(String pesan) {
		this.pesan = pesan;
	}

	// konstruktor kosong dan penuh
	// metode setter dan getter

}
