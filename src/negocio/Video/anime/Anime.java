package negocio.Video.anime;

import java.util.StringTokenizer;

import dados.Gravavel;
import negocio.Video.serie.Series;

public class Anime extends Series implements Gravavel {
	static final String SEPARADOR = "#";

	@Override
	public String getRegistro() {
		StringBuffer reg = new StringBuffer();
		reg.append(this.getNome());
		reg.append(SEPARADOR);
		reg.append(this.getDuracao());
		reg.append(SEPARADOR);
		reg.append(this.getGenero());
		reg.append(SEPARADOR);
		reg.append(this.getAno());
		reg.append(SEPARADOR);
		reg.append(this.getSinopse());
		reg.append("\n");

		return reg.toString();
	}

	@Override
	public void setRegistro(String reg) throws Exception {
		StringTokenizer st = new StringTokenizer(reg, SEPARADOR);
		this.setNome(st.nextToken());
		this.setDuracao(Double.parseDouble(st.nextToken()));
		this.setGenero(st.nextToken());
		this.setAno(Integer.parseInt(st.nextToken()));
		this.setSinopse(st.nextToken());

	}

	@Override
	public String toString() {
		return "Anime [nome: " + this.getNome() + ", genero: " + this.getGenero() + ", sinopse: " + this.getSinopse() + ", duracao: "
				+ this.getDuracao() + ", ano: " + this.getAno() + "]";
	}

}
