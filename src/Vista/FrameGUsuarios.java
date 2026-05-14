package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Color;

public class FrameGUsuarios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameGUsuarios frame = new FrameGUsuarios();
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
	public FrameGUsuarios() {
		setTitle("Gestion Users");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane Scp_Tabla = new JScrollPane();
		Scp_Tabla.setViewportBorder(new EmptyBorder(35, 65, 35, 65));
		contentPane.add(Scp_Tabla, BorderLayout.CENTER);
		
		table = new JTable();
		table.setBorder(new EmptyBorder(35, 65, 35, 65));
		Scp_Tabla.setViewportView(table);
		
		JPanel panelbtn = new JPanel();
		panelbtn.setBackground(Color.DARK_GRAY);
		contentPane.add(panelbtn, BorderLayout.SOUTH);
		
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelbtn.add(btnAñadir);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelbtn.add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelbtn.add(btnModificar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelbtn.add(btnVolver);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.MAGENTA);
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.MAGENTA);
		contentPane.add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.MAGENTA);
		contentPane.add(panel_3, BorderLayout.WEST);
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
