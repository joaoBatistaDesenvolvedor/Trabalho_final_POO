package negocio;

import negocio.Video.filme.Filme;

public interface IFilmes {
	public void cadastrar_Filme(Filme f) throws Exception;
	public Filme buscarFilme(String nome) throws Exception;

	public void excluirFilme(String nome) throws Exception;

	public void atualizarFilme(Filme f) throws Exception;

}
