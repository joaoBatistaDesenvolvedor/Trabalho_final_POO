package apresentacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class TelaSeries {

	private JFrame frame;
	private JTextField text_nome_serie;
	private JTextField text_duracao_serie;
	private JTextField text_genero_serie;
	private JTextField text_ano_serie_lancamento;
	private JTextField text_numero_total_ep_serie;
	private JTextField text_numero_total_temporadas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSeries window = new TelaSeries();
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
	public TelaSeries() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 804, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSerie = new JLabel("Serie");
		lblSerie.setFont(new Font("Georgia", Font.BOLD, 99));
		lblSerie.setBounds(159, 0, 334, 119);
		frame.getContentPane().add(lblSerie);
		
		text_nome_serie = new JTextField();
		text_nome_serie.setColumns(10);
		text_nome_serie.setBounds(126, 165, 114, 19);
		frame.getContentPane().add(text_nome_serie);
		
		JLabel lblNomeDaSerie = new JLabel("Nome da Serie");
		lblNomeDaSerie.setBounds(12, 167, 109, 15);
		frame.getContentPane().add(lblNomeDaSerie);
		
		JLabel lblDuracao = new JLabel("Duracao");
		lblDuracao.setBounds(252, 167, 59, 15);
		frame.getContentPane().add(lblDuracao);
		
		text_duracao_serie = new JTextField();
		text_duracao_serie.setColumns(10);
		text_duracao_serie.setBounds(316, 165, 114, 19);
		frame.getContentPane().add(text_duracao_serie);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(452, 167, 52, 15);
		frame.getContentPane().add(lblGenero);
		
		text_genero_serie = new JTextField();
		text_genero_serie.setColumns(10);
		text_genero_serie.setBounds(522, 165, 114, 19);
		frame.getContentPane().add(text_genero_serie);
		
		JLabel lblAnoDeLanamento = new JLabel("Ano de Lançamento");
		lblAnoDeLanamento.setBounds(12, 190, 140, 15);
		frame.getContentPane().add(lblAnoDeLanamento);
		
		text_ano_serie_lancamento = new JTextField();
		text_ano_serie_lancamento.setColumns(10);
		text_ano_serie_lancamento.setBounds(157, 188, 114, 19);
		frame.getContentPane().add(text_ano_serie_lancamento);
		
		JLabel lblSinopse = new JLabel("Sinopse");
		lblSinopse.setBounds(283, 190, 57, 15);
		frame.getContentPane().add(lblSinopse);
		
		JTextArea text_serie_sinopse = new JTextArea();
		text_serie_sinopse.setBounds(358, 190, 140, 87);
		frame.getContentPane().add(text_serie_sinopse);
		
		JLabel lbl_n_t_ep = new JLabel("total de Ep");
		lbl_n_t_ep.setBounds(522, 213, 135, 15);
		frame.getContentPane().add(lbl_n_t_ep);
		
		text_numero_total_ep_serie = new JTextField();
		text_numero_total_ep_serie.setColumns(10);
		text_numero_total_ep_serie.setBounds(604, 209, 114, 19);
		frame.getContentPane().add(text_numero_total_ep_serie);
		
		JLabel lbl_n_t_ep_1 = new JLabel("numero total de temporadas");
		lbl_n_t_ep_1.setBounds(26, 302, 218, 15);
		frame.getContentPane().add(lbl_n_t_ep_1);
		
		text_numero_total_temporadas = new JTextField();
		text_numero_total_temporadas.setColumns(10);
		text_numero_total_temporadas.setBounds(240, 300, 114, 19);
		frame.getContentPane().add(text_numero_total_temporadas);
		
		JButton btn_cadastrar_Serie = new JButton("CADASTRAR SERIE");
		btn_cadastrar_Serie.setBounds(12, 383, 197, 25);
		frame.getContentPane().add(btn_cadastrar_Serie);
		
		JButton btnBuscarSerie = new JButton("BUSCAR SERIE");
		btnBuscarSerie.setBounds(240, 383, 160, 25);
		frame.getContentPane().add(btnBuscarSerie);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(424, 383, 117, 25);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setBounds(-137, 437, 117, 25);
		frame.getContentPane().add(btnExcluir);
		
		JButton btnatualizarserie = new JButton("ATUALIZAR");
		btnatualizarserie.setBounds(252, 420, 117, 25);
		frame.getContentPane().add(btnatualizarserie);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setBounds(434, 420, 101, 25);
		frame.getContentPane().add(btnSair);
		
		JButton btn_serie = new JButton("EXCLUIR");
		btn_serie.setBounds(45, 420, 117, 25);
		frame.getContentPane().add(btn_serie);
	}

}
