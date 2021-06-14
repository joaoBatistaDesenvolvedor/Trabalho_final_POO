package apresentacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.JobAttributes;

import javax.swing.JTextField;

import negocio.IFachadaSistema;
import negocio.Video.anime.Anime;

import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAnime {

	private JFrame frame;
	private JTextField text_nome_anime;
	private JTextField text_duracao_anime;
	private JTextField text_anime_genero;
	private JTextField text_anime_ano_lacamento;
	private JTextField text_anime_n_Ep;
	private JTextField text_n_t_temporada;
	IFachadaSistema IF;
	Anime anime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAnime window = new TelaAnime();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAnime() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 656, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Animes");
		lblNewLabel.setBounds(47, 5, 387, 113);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 99));
		lblNewLabel.setForeground(Color.BLACK);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNomeDoAnime = new JLabel("Nome do anime");
		lblNomeDoAnime.setBounds(6, 125, 109, 15);
		frame.getContentPane().add(lblNomeDoAnime);
		
		text_nome_anime = new JTextField();
		text_nome_anime.setBounds(120, 123, 114, 19);
		frame.getContentPane().add(text_nome_anime);
		text_nome_anime.setColumns(10);
		
		JLabel lblDuracao = new JLabel("Duração");
		lblDuracao.setBounds(239, 125, 59, 15);
		frame.getContentPane().add(lblDuracao);
		
		text_duracao_anime = new JTextField();
		text_duracao_anime.setBounds(303, 123, 114, 19);
		frame.getContentPane().add(text_duracao_anime);
		text_duracao_anime.setColumns(10);
		
		JLabel lblGenero = new JLabel("Gênero");
		lblGenero.setBounds(422, 125, 52, 15);
		frame.getContentPane().add(lblGenero);
		
		text_anime_genero = new JTextField();
		text_anime_genero.setBounds(492, 123, 114, 19);
		frame.getContentPane().add(text_anime_genero);
		text_anime_genero.setColumns(10);
		
		JLabel lblAnoDeLanamento = new JLabel("Ano de Lançamento");
		lblAnoDeLanamento.setBounds(136, 149, 140, 15);
		frame.getContentPane().add(lblAnoDeLanamento);
		
		text_anime_ano_lacamento = new JTextField();
		text_anime_ano_lacamento.setBounds(281, 147, 114, 19);
		frame.getContentPane().add(text_anime_ano_lacamento);
		text_anime_ano_lacamento.setColumns(10);
		
		JLabel lblSinopse = new JLabel("Sinopse");
		lblSinopse.setBounds(417, 154, 57, 15);
		frame.getContentPane().add(lblSinopse);
		
		JTextArea text_anime_sinopse = new JTextArea();
		text_anime_sinopse.setBounds(492, 154, 140, 87);
		frame.getContentPane().add(text_anime_sinopse);
		
		JLabel lbl_n_t_ep = new JLabel("Número Total de Episódios");
		lbl_n_t_ep.setBounds(6, 176, 135, 15);
		frame.getContentPane().add(lbl_n_t_ep);
		
		text_anime_n_Ep = new JTextField();
		text_anime_n_Ep.setBounds(159, 174, 114, 19);
		frame.getContentPane().add(text_anime_n_Ep);
		text_anime_n_Ep.setColumns(10);
		
		JLabel lbl_n_t_ep_1 = new JLabel("Número Total de Temporadas");
		lbl_n_t_ep_1.setBounds(6, 224, 218, 15);
		frame.getContentPane().add(lbl_n_t_ep_1);
		
		text_n_t_temporada = new JTextField();
		text_n_t_temporada.setColumns(10);
		text_n_t_temporada.setBounds(220, 222, 114, 19);
		frame.getContentPane().add(text_n_t_temporada);
		
		JButton btnCadastrarAnime = new JButton("CADASTRAR ANIME");
		btnCadastrarAnime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Anime novo_anime= new Anime();
			try {
				novo_anime.setNome(text_nome_anime.getText());
				novo_anime.setDuracao(Double.parseDouble(text_duracao_anime.getText()));
				novo_anime.setAno(Integer.parseInt(text_anime_ano_lacamento.getText()));
				novo_anime.setGenero(text_anime_genero.getText());
				novo_anime.setSinopse(text_anime_sinopse.getText());
				novo_anime.setNumero_total_ep(Integer.parseInt(text_anime_n_Ep.getText()));
				novo_anime.setNumero_temporada(Integer.parseInt(text_n_t_temporada.getText()));
				IF.cadastrarAnime(novo_anime);
				
				//Obs criar a funçoes auxiliares sucesso erro aviso
				
				JOptionPane.showMessageDialog(btnCadastrarAnime, this, "Anime Cadastrado com sucesso",JOptionPane.INFORMATION_MESSAGE);
				text_nome_anime.setText("");
				text_duracao_anime.setText("");
				text_anime_ano_lacamento.setText("");
				text_anime_genero.setText("");
				text_anime_sinopse.setText("");
				text_anime_n_Ep.setText("");
				text_n_t_temporada.setText("");
				
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(btnCadastrarAnime, this, "nao possivel cadastrar o anime", 0);
				e.printStackTrace();
			}
			}
		});
		btnCadastrarAnime.setBounds(27, 285, 197, 25);
		frame.getContentPane().add(btnCadastrarAnime);
		
		JButton btnBuscarAnime = new JButton("BUSCAR ANIME");
		btnBuscarAnime.setBounds(255, 285, 160, 25);
		frame.getContentPane().add(btnBuscarAnime);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(453, 285, 117, 25);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setBounds(59, 322, 117, 25);
		frame.getContentPane().add(btnExcluir);
		
		JButton btnNewButton = new JButton("ATUALIZAR");
		btnNewButton.setBounds(278, 322, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setBounds(453, 322, 117, 25);
		frame.getContentPane().add(btnSair);
	}
	
}

