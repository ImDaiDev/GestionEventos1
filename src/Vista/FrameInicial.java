package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FrameInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel PanelPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameInicial frame = new FrameInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameInicial() {
		setTitle("Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 300);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBackground(Color.MAGENTA);
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(Color.DARK_GRAY);
		PanelPrincipal.add(panelBotones, BorderLayout.CENTER);
		panelBotones.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 37));
		btnLogin.setBounds(32, 59, 159, 94);
		panelBotones.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameLogin log = new FrameLogin();
				dispose();
			}	
		});
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Times New Roman", Font.BOLD, 37));
		btnRegistrar.setBounds(218, 59, 179, 94);
		panelBotones.add(btnRegistrar);
		btnRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameRegistrar reg = new FrameRegistrar();
				dispose();
			}
		});
		
		JLabel lblBienvenido = new JLabel("Bienvenid@");
		lblBienvenido.setForeground(Color.WHITE);
		lblBienvenido.setBackground(Color.DARK_GRAY);
		lblBienvenido.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		PanelPrincipal.add(lblBienvenido, BorderLayout.NORTH);
		
		
		setLocationRelativeTo(null);
		setVisible(true);

	}

}
