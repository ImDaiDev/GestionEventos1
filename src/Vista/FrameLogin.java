package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Modelo.Usuario;
import Modelo.Utils;

public class FrameLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_Nombre;
	private JPasswordField pf_contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
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
	public FrameLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 306);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBackground(Color.MAGENTA);
		lblUsuario.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		panel.add(lblUsuario);
		
		tf_Nombre = new JTextField();
		tf_Nombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(tf_Nombre);
		tf_Nombre.setColumns(15);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setBackground(Color.ORANGE);
		lblContraseña.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		panel.add(lblContraseña);
		
		pf_contraseña = new JPasswordField();
		pf_contraseña.setFont(new Font("Tahoma", Font.BOLD, 20));
		pf_contraseña.setColumns(15);
		panel.add(pf_contraseña);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Verdana", Font.BOLD, 20));
		panel_1.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (Usuario user: Utils.getListaUsuarios()) {
					if(user.getNombre().equals(tf_Nombre.getText()) && user.getPassw().equals(new String(pf_contraseña.getPassword()))) {
						JOptionPane.showMessageDialog(null, "Inición sesiada");
						if(user.getAdmin()) {
							FrameEGestion eg = new FrameEGestion();
							dispose();
						} else {
							FrameGEventos ev = new FrameGEventos();
							dispose();
						}
					} else {
						JOptionPane.showInternalMessageDialog(null, "Credenciales erróneas");
					}
				}
				
			}
			
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Verdana", Font.BOLD, 20));
		panel_1.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameInicial back = new FrameInicial();
				dispose();
			}
		});
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
