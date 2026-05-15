package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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

public class FrameRegistrar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_Nombre, tf_Edad, tf_Email;
	private JPasswordField pf_contraseña, pf_contraseñaRep;

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
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBackground(Color.ORANGE);
		lblUsuario.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		panel.add(lblUsuario);
		
		tf_Nombre = new JTextField();
		tf_Nombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(tf_Nombre);
		tf_Nombre.setColumns(15);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBackground(Color.ORANGE);
		lblEmail.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		panel.add(lblEmail);
		
		tf_Email = new JTextField();
		tf_Email.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(tf_Email);
		tf_Email.setColumns(15);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBackground(Color.ORANGE);
		lblEdad.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		panel.add(lblEdad);
		
		tf_Edad = new JTextField();
		tf_Edad.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(tf_Edad);
		tf_Edad.setColumns(15);
		
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
		btnRegistro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(comprobarCampos()) { //Devuelve TRUE si no hay campos en blanco, la contraseña no es igual  ni el email es repetido
					Usuario us = new Usuario(Integer.parseInt(tf_Edad.getText()), tf_Nombre.getText(), false, tf_Email.getText(), new String(pf_contraseña.getPassword()));
					List<Usuario> temp = Utils.getListaUsuarios();
					temp.add(us);
					Utils.setListaUsuarios(temp);
					JOptionPane.showMessageDialog(null, "Registro correcto.");
					FrameLogin log = new FrameLogin();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Hay campos erróneos en el registro.");
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
	
	public boolean comprobarCampos() {
		if(tf_Nombre.getText().isBlank() || tf_Edad.getText().isBlank() || tf_Email.getText().isBlank() || pf_contraseña.getPassword().toString().isBlank())
			return false;
		else {
			for (Usuario user: Utils.getListaUsuarios()) {
				if(user.getEmail().equals(tf_Email))
					return false;
			}
			return true;
		}
	}

}
