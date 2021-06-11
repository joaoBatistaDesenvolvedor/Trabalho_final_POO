package negocio.Video;

public class Estrutura_videos {
	private String nome;
	private double duracao;
	private String genero;
	private int ano;
	private String sinopse;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if (nome.equals(null)) {
			throw new Exception("Nome invalido");
		}
		this.nome = nome;

	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) throws Exception {
		if (duracao < 0 || duracao == 0) {
			throw new Exception("duracao invalida INFORME UMA DURACAO MAIOR 0");
		}
		this.duracao = duracao;
	}

	public String getGenero() {

		return genero;
	}

	public void setGenero(String genero) throws Exception {
		if (genero.equals(null)) {
			throw new Exception("genero nao informado");
		}
		this.genero = genero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) throws Exception {
		if (ano < 0 || ano == 0) {
			throw new Exception("ano ivalido informe um ano maior que zero");
		}
		this.ano = ano;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) throws Exception {
		if (sinopse.equals(null)) {
			throw new Exception("sinopse  nao informada");
		}
		this.sinopse = sinopse;
	}

}