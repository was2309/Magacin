package magacin;

import java.util.LinkedList;
import java.util.List;

import magacinInterfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {
	
	private List<Artikal> artikli = new LinkedList<>();

	@Override
	public void dodajArtikal(Artikal artikal) {
		artikli.add(artikal);

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		artikli.remove(artikal);

	}

	@Override
	public Artikal vratiArtikal(Long sifra) {
		if(sifra!=null) {
			for(Artikal a:artikli) {
				if(a.getSifra().equals(sifra)) {
					return a;
				}
			}
		}
		
		return null;
	}

}
