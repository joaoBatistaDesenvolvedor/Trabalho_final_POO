package negocio.Video.filme;

import dados.CadastroGenerico;
import dados.RepositorioGenericoTXT;

public class FilmeDAO extends CadastroGenerico<Filme> {

	public FilmeDAO() {
		RepositorioGenericoTXT<Filme> r = new RepositorioFilmeTXT();
		r.setNomeArquivo("Filmes.txt");
		this.setRepo(r);
	}

	@Override
	public Filme busca(String chave) throws Exception {
		for (int i = 0; i < lista.size(); i++) {
			Filme f = lista.get(i);
			if (f.getNome().equals(chave))
				;
		}
		throw new Exception("Filme com o nome " + chave + " não encontrado!");

	}

	@Override
	public int buscaPosicao(Filme t) throws Exception {
		for (int i = 0; i < this.lista.size(); i++) {
			Filme f = lista.get(i);
			if (f == t) {
				return i;
			}
		}
		throw new Exception("Filme com " + t.getAno() + " não encontrado!");

	}

}