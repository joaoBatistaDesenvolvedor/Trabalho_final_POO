package apresentacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class TelaFilmes {

	private JFrame frame;
	private JTextField text_nome_filme;
	private JTextField text_duracao_filme;
	private JTextField text_genero_filme;
	private JTextField text_ano_lancamento_filme;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFilmes window = new TelaFilmes();
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
	public TelaFilmes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFilmes = new JLabel("Filmes");
		lblFilmes.setFont(new Font("Georgia", Font.BOLD, 99));
		lblFilmes.setBounds(24, 0, 450, 119);
		frame.getContentPane().add(lblFilmes);
		
		text_nome_filme = new JTextField();
		text_nome_filme.setColumns(10);
		text_nome_filme.setBounds(126, 131, 114, 19);
		frame.getContentPane().add(text_nome_filme);
		
		JLabel lblNomeDaSerie = new JLabel("Nome do Filme");
		lblNomeDaSerie.setBounds(12, 133, 109, 15);
		frame.getContentPane().add(lblNomeDaSerie);
		
		JLabel lblDuracao = new JLabel("Duracao");
		lblDuracao.setBounds(250, 133, 59, 15);
		frame.getContentPane().add(lblDuracao);
		
		text_duracao_filme = new JTextField();
		text_duracao_filme.setColumns(10);
		text_duracao_filme.setBounds(314, 131, 114, 19);
		frame.getContentPane().add(text_duracao_filme);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(432, 133, 52, 15);
		frame.getContentPane().add(lblGenero);
		
		text_genero_filme = new JTextField();
		text_genero_filme.setColumns(10);
		text_genero_filme.setBounds(502, 131, 114, 19);
		frame.getContentPane().add(text_genero_filme);
		
		JLabel lblAnoDeLanamento = new JLabel("Ano de Lançamento");
		lblAnoDeLanamento.setBounds(34, 164, 140, 15);
		frame.getContentPane().add(lblAnoDeLanamento);
		
		text_ano_lancamento_filme = new JTextField();
		text_ano_lancamento_filme.setColumns(10);
		text_ano_lancamento_filme.setBounds(179, 162, 114, 19);
		frame.getContentPane().add(text_ano_lancamento_filme);
		
		JLabel lblSinopse = new JLabel("Sinopse");
		lblSinopse.setBounds(305, 164, 57, 15);
		frame.getContentPane().add(lblSinopse);
		
		JTextArea text_filme_sinopse = new JTextArea();
		text_filme_sinopse.setBounds(380, 164, 140, 87);
		frame.getContentPane().add(text_filme_sinopse);
		
		JButton btn_cadastrar_Filme = new JButton("CADASTRAR FILME");
		btn_cadastrar_Filme.setBounds(12, 348, 197, 25);
		frame.getContentPane().add(btn_cadastrar_Filme);
		
		JButton btnBuscarFilme = new JButton("BUSCAR FILME");
		btnBuscarFilme.setBounds(240, 348, 160, 25);
		frame.getContentPane().add(btnBuscarFilme);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(424, 348, 117, 25);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.setBounds(434, 385, 101, 25);
		frame.getContentPane().add(btnSair);
		
		JButton btnAtualizar_Filme = new JButton("ATUALIZAR");
		btnAtualizar_Filme.setBounds(252, 385, 117, 25);
		frame.getContentPane().add(btnAtualizar_Filme);
		
		JButton btn_excluir_filme = new JButton("EXCLUIR");
		btn_excluir_filme.setBounds(45, 385, 117, 25);
		frame.getContentPane().add(btn_excluir_filme);
	}

}
