package negocio.Video.serie;

import dados.CadastroGenerico;

public class SeriesDAO extends CadastroGenerico<Series> {

	@Override
	public Series busca(String chave) throws Exception {
		for (int i = 0; i < lista.size(); i++) {
			Series s = lista.get(i);
			if (s.getNome().equals(chave))
				;
		}
		throw new Exception("serie com o nome " + chave + " não encontrado!");
	}

	@Override
	public int buscaPosicao(Series t) throws Exception {
		for (int i = 0; i < this.lista.size(); i++) {
			Series s = lista.get(i);
			if (s == t) {
				return i;
			}
		}
		throw new Exception("serie com " + t.getAno() + " não encontrado!");
	}

}
