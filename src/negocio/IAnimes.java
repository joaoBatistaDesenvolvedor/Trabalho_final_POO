package negocio;

import negocio.Video.anime.Anime;
import negocio.Video.filme.Filme;

public interface IAnimes {
	public void cadastrar_anime(Anime a) throws Exception;

	public Filme buscarAnime(String nome) throws Exception;

	public void excluirAnime(String nome) throws Exception;

	public void atualizarAnime(Anime a) throws Exception;

}
