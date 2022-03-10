package magacin;

public class Artikal {
	private String naziv;
	private Long sifra;
	private String opis;
	private int kolicina;
	
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public Long getSifra() {
		return sifra;
	}
	public void setSifra(Long sifra) {
		this.sifra = sifra;
	}
	
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
}
