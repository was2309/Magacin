package magacin;

import java.util.LinkedList;
import java.util.List;

import magacinInterfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs {
	
	private List<Artikal> artikli = new LinkedList<>();

	@Override
	public void dodajArtikal(Artikal artikal) {

		for(Artikal a:artikli) {
			if(a.getSifra().equals(artikal.getSifra())) {
				a.setKolicina(a.getKolicina()+1);
				break;
			}
			else {
				artikli.add(artikal);
				break;
			}
		}

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		
		for(Artikal a:artikli) {
			if(a.getSifra().equals(artikal.getSifra()) && a.getKolicina()>0 ) {
				a.setKolicina(a.getKolicina()-1);
				break;
			}
			else {
				artikli.remove(artikal);
				break;
			}
		}
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
