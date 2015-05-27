package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import model.Cadete;
import model.CadeteModel;
import model.IngresoLaby;

import javax.swing.JComboBox;


public class VistaUsuario extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	VistaPrincipal Vapp;
	
	
	public VistaUsuario(VistaPrincipal Vapp) {
		setLayout(null);
	
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					        
		    	Cadete C = (Cadete) comboBox.getSelectedItem();
		    	textField.setText(C.getNombre());	
		    	textField_4.setText(String.valueOf(C.getId()));
		    	textField_1.setText(C.getApellidos());
		    	textField_2.setText(String.valueOf(C.getEdad()));
		    	textField_3.setText(C.getNacionalidad());
		    	
		    	
		    }		 
		
		});
		comboBox.setBounds(10, 161, 128, 25);
		add(comboBox);
		
		
		
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/avatar.png")));
		label.setBounds(20, 11, 110, 139);
		add(label);
		
		textField = new JTextField();
		textField.setBounds(179, 49, 165, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(179, 24, 46, 14);
		add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 107, 165, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(179, 82, 46, 14);
		add(lblApellidos);
		
		textField_2 = new JTextField();
		textField_2.setBounds(179, 158, 165, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(179, 136, 46, 14);
		add(lblEdad);
		
		textField_3 = new JTextField();
		textField_3.setBounds(179, 214, 165, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(179, 189, 86, 14);
		add(lblNacionalidad);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(356, 24, 46, 14);
		add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(354, 49, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Vapp.showVistaEquipo();
			}
		});
		btnSiguiente.setBounds(293, 266, 123, 23);
		add(btnSiguiente);
		
	
		
		CadeteModel usuarios=new CadeteModel();
		
		Iterator<Cadete> it=usuarios.getJugones().iterator();
		while(it.hasNext()){
			comboBox.addItem(it.next());
		
		

	}
	
}
}
