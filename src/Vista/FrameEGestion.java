package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class FrameEGestion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameEGestion frame = new FrameEGestion();
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
	public FrameEGestion() {
		setTitle("Menú Gestión");
		setResizable(false);
		setBackground(Color.MAGENTA);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 306);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblprincipal = new JLabel("¿Qué desea gestionar?");
		lblprincipal.setForeground(Color.WHITE);
		lblprincipal.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblprincipal.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblprincipal, BorderLayout.NORTH);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(Color.DARK_GRAY);
		contentPane.add(panelBotones, BorderLayout.CENTER);
		panelBotones.setLayout(null);
		
		JButton btnUsuarios = new JButton("Usuarios");
		btnUsuarios.setFont(new Font("Verdana", Font.BOLD, 17));
		btnUsuarios.setBounds(17, 80, 122, 52);
		panelBotones.add(btnUsuarios);
		
		JButton btnTareas = new JButton("Tareas");
		btnTareas.setFont(new Font("Verdana", Font.BOLD, 17));
		btnTareas.setBounds(149, 80, 112, 52);
		panelBotones.add(btnTareas);
		
		JButton btnEventos = new JButton("inscripciones");
		btnEventos.setFont(new Font("Verdana", Font.BOLD, 17));
		btnEventos.setBounds(271, 80, 160, 52);
		panelBotones.add(btnEventos);
		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
}