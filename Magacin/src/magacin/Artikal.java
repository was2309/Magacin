package magacin;

import java.util.Objects;

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
	
	
	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& Objects.equals(sifra, other.sifra);
	}
	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}
	
	
	
	
}
