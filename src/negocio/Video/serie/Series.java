package negocio.Video.serie;

import negocio.Video.Estrutura_videos;

public class Series extends Estrutura_videos {
	private int numero_temporada, numero_total_ep;

	public Series(String nome, double duracao, String genero, int ano, String sinopse) throws Exception {
		super(nome, duracao, genero, ano, sinopse);
		// TODO Auto-generated constructor stub
	}

	public int getNumero_temporada() {
		return numero_temporada;
	}

	public void setNumero_temporada(int numero_temporada) throws Exception {
		if (numero_temporada <= 0) {
			throw new Exception("numero de temporadas negativo ou zero");
		}
		this.numero_temporada = numero_temporada;
	}

	public int getNumero_total_ep() {
		return numero_total_ep;
	}

	public void setNumero_total_ep(int numero_total_ep) throws Exception {
		if (numero_total_ep <= 0) {
			throw new Exception("numero total de ep negativo ou zero");
		}
		this.numero_total_ep = numero_total_ep;
	}

}