package magacinInterfejs;

import magacin.Artikal;

public interface MagacinInterfejs {
	public void dodajArtikal(Artikal artikal);
	public void izbaciArtikal(Artikal artikal);
	public Artikal vratiArtikal(Long sifra);
}
