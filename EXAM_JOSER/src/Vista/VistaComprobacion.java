package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VistaComprobacion extends JPanel {
	private JTextField Id;
	private JTextField Apellidos;
	private JTextField Comprobar;
	VistaPrincipal Vapp;
	
	
	
	public VistaComprobacion(VistaPrincipal Vapp) {
		setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(36, 33, 46, 14);
		add(lblId);
		
		Id = new JTextField();
		
		Id.setBounds(36, 58, 86, 20);
		add(Id);
		Id.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellidos");
		lblApellido.setBounds(238, 33, 86, 14);
		add(lblApellido);
		
		Apellidos = new JTextField();
		Apellidos.setBounds(238, 58, 86, 20);
		add(Apellidos);
		Apellidos.setColumns(10);
		
		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.setBounds(99, 126, 225, 23);
		add(btnNewButton);
		
		Comprobar = new JTextField();
		Comprobar.setBounds(99, 181, 225, 20);
		add(Comprobar);
		Comprobar.setColumns(10);
		
		JButton atras = new JButton("<< Atras");
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Vapp.showVistaEquipo();
			}
		});
		atras.setBounds(36, 246, 89, 23);
		add(atras);

	}

}
