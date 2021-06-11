package negocio.Video.anime;

import dados.CadastroGenerico;

public class AnimeDAO extends CadastroGenerico<Anime> {

	@Override
	public Anime busca(String chave) throws Exception {
		for (int i = 0; i < lista.size(); i++) {
			Anime a = lista.get(i);
			if (a.getNome().equals(chave))
				return a;
		}
		throw new Exception("anime com o nome " + chave + " não encontrado!");
	}

	@Override
	public int buscaPosicao(Anime t) throws Exception {
		for (int i = 0; i < this.lista.size(); i++) {
			Anime a = lista.get(i);
			if (a == t) {
				return i;
			}
		}
		throw new Exception("anime com " + t.getAno() + " não encontrado!");
	}
}
