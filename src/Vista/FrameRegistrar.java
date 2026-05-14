package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;

public class FrameRegistrar extends JFrame {

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
					FrameRegistrar frame = new FrameRegistrar();
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
	public FrameRegistrar() {
		setTitle("Registro");
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
		lblUsuario.setBackground(Color.ORANGE);
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
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.setFont(new Font("Verdana", Font.BOLD, 20));
		panel_1.add(btnRegistro);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Verdana", Font.BOLD, 20));
		panel_1.add(btnVolver);
		
		
		setLocationRelativeTo(null);
		setVisible(true);

	}

}
