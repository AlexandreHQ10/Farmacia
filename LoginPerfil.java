package farmacia;
	
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class LoginPerfil extends JFrame implements ActionListener {
		//declaração dos componentes
		JLabel lblUsuario, lblSenha, lblMensagem;
		JTextField txtUsuario;
		JPasswordField txtSenha;
		JButton btnEntrar, btnSair;
		
		//construtor
		public LoginPerfil(){
			//configuração da janela
			super("Tela de LoginPerfil");
			this.setSize(400, 300);
			this.setLayout(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//instanciação dos componentes
			lblUsuario = new JLabel("Usuário:");
			lblUsuario.setBounds(50, 50, 100, 25);
			
			txtUsuario = new JTextField();
			txtUsuario.setBounds(110, 50, 200, 25);
			
			lblSenha = new JLabel("Senha:");
			lblSenha.setBounds(50, 80, 100, 25);
			
			txtSenha = new JPasswordField();
			txtSenha.setBounds(110, 80, 200, 25);
			
			btnEntrar = new JButton("Entrar");
			btnEntrar.setBounds(50, 120, 100, 25);
			btnEntrar.addActionListener(this);
			
			btnSair = new JButton("Sair");
			btnSair.setBounds(200, 120, 100, 25);
			btnSair.addActionListener(this);
			
			lblMensagem = new JLabel("");
			lblMensagem.setBounds(50, 160, 200, 25);
			
			//adicionando os componentes na janela
			this.add(lblUsuario);
			this.add(txtUsuario);
			this.add(lblSenha);
			this.add(txtSenha);
			this.add(btnEntrar);
			this.add(btnSair);
			this.add(lblMensagem);
		}
		
		//método que verifica o login
		public void verificaLoginPerfil(){
			String usuario = txtUsuario.getText();
			String senha = new String(txtSenha.getPassword());
			
			//verificando se o usuário é um administrador
			if(usuario.equals("admin") && senha.equals("123")){
				lblMensagem.setText("Seja bem-vindo, administrador!");
				lblMensagem.setForeground(Color.blue);
			}
			//verificando se o usuário é um usuário comum
			else if(usuario.equals("user") && senha.equals("123")){
				lblMensagem.setText("Seja bem-vindo!"+"Erick Red Ballon");
				lblMensagem.setForeground(Color.red);
			}
			//caso as credenciais estejam incorretas
			else{
				lblMensagem.setText("Usuário ou senha incorretos!");
				lblMensagem.setForeground(Color.red);
			}
		}
		
		//método que trata os eventos dos botões
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnEntrar){
				verificaLoginPerfil();
			}
			else if(e.getSource() == btnSair){
				System.exit(0);
			}
		}
		
		//método principal
		public static void main(String[] args) {
			JFrame janela = new LoginPerfil();
			janela.setVisible(true);
		}
	}
