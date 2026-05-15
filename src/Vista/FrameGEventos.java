package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Color;

public class FrameGEventos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel modelo= new DefaultTableModel();
	private String[] ids= {"ID", "MaxAssist", "Nombre", "Fecha","RutaImg"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameGEventos frame = new FrameGEventos();
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
	public FrameGEventos() {
		setTitle("Gestion Eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		modelo.setColumnIdentifiers(ids);
		
		
		JScrollPane Scp_Tabla = new JScrollPane();
		Scp_Tabla.setViewportBorder(new EmptyBorder(0, 0, 0, 0));
		
		
		table = new JTable(modelo);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		Scp_Tabla.setViewportView(table);

		
		
		contentPane.add(Scp_Tabla, BorderLayout.CENTER);
		
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
		panel_1.setBackground(new Color(220, 20, 60));
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(220, 20, 60));
		contentPane.add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(220, 20, 60));
		contentPane.add(panel_3, BorderLayout.WEST);
		
		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
