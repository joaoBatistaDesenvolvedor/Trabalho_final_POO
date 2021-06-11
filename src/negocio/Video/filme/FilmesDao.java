package negocio.video.filme;

import dados.CadastroGenerico;
import negocio.video.Estrutura_videos;

public class FilmesDao extends CadastroGenerico<negocio.video.filme.Filme> {

	@Override
	public Filme busca(String chave) throws Exception {
		for (int i = 0; i < lista.size(); i++) {
			Filme f = lista.get(i);
				if(f.getNome().equals(chave));
		}
		throw new Exception("filme com o nome " + chave + " não encontrado!");

	}

	@Override
	public int buscaPosicao(Filme t) throws Exception {
		for (int i = 0; i < this.lista.size(); i++) {
			Filme f = lista.get(i);
			if (f == t) {
				return i;
			}
		}
		throw new Exception("filme com " + t.getAno() + " não encontrado!");

	}

}
