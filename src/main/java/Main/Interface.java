package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.TextArea;

public class Interface {

	private JFrame frame;
	private JTextField txt_peleador1;
	private JTextField txt_peleador2;
	private JTextField txt_Cuota1;
	private JTextField txt_Couta2;
	private JTextField txt_NombreApostador;
	private JTextField txt_CantidadApostada;
	private JTextField txt_ApuestaTotal2;
	private JTextField txt_ApuestaTotal1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	double dineroLuchador1 = 0;
	double dineroLuchador2 = 0;
	List<String[]> apuestas = new ArrayList<>();
	double cuotaMax = 2.8;
	double cuotaMin = 0.9;
	boolean cerrarApuestas = false;
	double dineroApostado = 0;
	double dineroDescontado = 0;
	String apostador;
	char luchadorElegido;
	double cuotaLuchador1 = 0;
	double cuotaLuchador2 = 0;
	double premio;
	DefaultListModel<String> ganadoresListModel;
	DecimalFormat df = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 854, 783);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Jpanel_Premios = new JPanel();
		Jpanel_Premios.setVisible(false);
		Jpanel_Premios.setBounds(0, 263, 838, 399);
		frame.getContentPane().add(Jpanel_Premios);
		Jpanel_Premios.setLayout(null);
		
		JTextArea txtArea_Ganadores = new JTextArea();
		txtArea_Ganadores.setFont(new Font("Bookman Old Style", Font.BOLD, 19));
		txtArea_Ganadores.setBounds(52, 33, 696, 342);
		Jpanel_Premios.add(txtArea_Ganadores);
		
		ganadoresListModel = new DefaultListModel<>();
	
		
		
		JLabel lblNewLabel = new JLabel("CALCULADORA DE CUOTAS 1V1");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(257, 11, 315, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PELEADOR 1:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(46, 139, 200, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PELEADOR 2:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(545, 144, 200, 50);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("VS");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(356, 171, 69, 50);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		txt_peleador1 = new JTextField();
		txt_peleador1.setBounds(33, 183, 200, 33);
		frame.getContentPane().add(txt_peleador1);
		txt_peleador1.setColumns(10);
		
		txt_peleador2 = new JTextField();
		txt_peleador2.setColumns(10);
		txt_peleador2.setBounds(573, 188, 200, 33);
		frame.getContentPane().add(txt_peleador2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 349, 838, 15);
		frame.getContentPane().add(separator);
		
		JButton btn_OK = new JButton("OK");
		
		btn_OK.setBounds(356, 287, 86, 33);
		frame.getContentPane().add(btn_OK);
		
		JLabel lblNewLabel_2 = new JLabel("Cuota:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(48, 228, 69, 50);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cuota:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(562, 228, 61, 50);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		txt_Cuota1 = new JTextField();
		txt_Cuota1.setText("1.0");
		txt_Cuota1.setEditable(false);
		txt_Cuota1.setFont(new Font("Tahoma", Font.BOLD, 17));
		txt_Cuota1.setHorizontalAlignment(SwingConstants.CENTER);
		txt_Cuota1.setBounds(127, 236, 86, 33);
		frame.getContentPane().add(txt_Cuota1);
		txt_Cuota1.setColumns(10);
		
		txt_Couta2 = new JTextField();
		txt_Couta2.setText("1.0");
		txt_Couta2.setHorizontalAlignment(SwingConstants.CENTER);
		txt_Couta2.setFont(new Font("Tahoma", Font.BOLD, 17));
		txt_Couta2.setEditable(false);
		txt_Couta2.setColumns(10);
		txt_Couta2.setBounds(633, 239, 86, 33);
		frame.getContentPane().add(txt_Couta2);
		
		JButton btn_NuevoApostador = new JButton("Nuevo Apostador");
		
		btn_NuevoApostador.setEnabled(false);
		btn_NuevoApostador.setBounds(296, 375, 200, 50);
		frame.getContentPane().add(btn_NuevoApostador);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(65, 446, 86, 50);
		frame.getContentPane().add(lblNewLabel_3);
		
		txt_NombreApostador = new JTextField();
		txt_NombreApostador.setEditable(false);
		txt_NombreApostador.setBounds(154, 458, 112, 33);
		frame.getContentPane().add(txt_NombreApostador);
		txt_NombreApostador.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Cantidad:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(290, 446, 102, 50);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		txt_CantidadApostada = new JTextField();
		txt_CantidadApostada.setEditable(false);
		txt_CantidadApostada.setColumns(10);
		txt_CantidadApostada.setBounds(397, 458, 124, 33);
		frame.getContentPane().add(txt_CantidadApostada);
		
		JRadioButton rb_peleador1 = new JRadioButton("");
		rb_peleador1.setEnabled(false);
		buttonGroup_1.add(rb_peleador1);
		rb_peleador1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb_peleador1.setBounds(536, 446, 132, 50);
		frame.getContentPane().add(rb_peleador1);
		
		JRadioButton rb_peleador2 = new JRadioButton("");
		rb_peleador2.setEnabled(false);
		buttonGroup_1.add(rb_peleador2);
		rb_peleador2.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb_peleador2.setBounds(670, 446, 141, 50);
		frame.getContentPane().add(rb_peleador2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Apuestas ($):");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(33, 93, 124, 50);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Apuestas ($):");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2_1.setBounds(582, 93, 124, 50);
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		txt_ApuestaTotal2 = new JTextField();
		txt_ApuestaTotal2.setText("0");
		txt_ApuestaTotal2.setHorizontalAlignment(SwingConstants.CENTER);
		txt_ApuestaTotal2.setFont(new Font("Tahoma", Font.BOLD, 17));
		txt_ApuestaTotal2.setEditable(false);
		txt_ApuestaTotal2.setColumns(10);
		txt_ApuestaTotal2.setBounds(704, 100, 86, 33);
		frame.getContentPane().add(txt_ApuestaTotal2);
		
		txt_ApuestaTotal1 = new JTextField();
		txt_ApuestaTotal1.setText("0");
		txt_ApuestaTotal1.setHorizontalAlignment(SwingConstants.CENTER);
		txt_ApuestaTotal1.setFont(new Font("Tahoma", Font.BOLD, 17));
		txt_ApuestaTotal1.setEditable(false);
		txt_ApuestaTotal1.setColumns(10);
		txt_ApuestaTotal1.setBounds(146, 101, 86, 33);
		frame.getContentPane().add(txt_ApuestaTotal1);
		
		JLabel lblNewLabel_4 = new JLabel("(Dinero total apostado a cada luchador)");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(269, 95, 266, 50);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lbl_NombrePeleador1 = new JLabel("");
		lbl_NombrePeleador1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lbl_NombrePeleador1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_NombrePeleador1.setBounds(243, 177, 118, 44);
		frame.getContentPane().add(lbl_NombrePeleador1);
		
		JLabel lbl_NombrePeleador2 = new JLabel("");
		lbl_NombrePeleador2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lbl_NombrePeleador2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_NombrePeleador2.setBounds(423, 177, 118, 44);
		frame.getContentPane().add(lbl_NombrePeleador2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 67, 838, 15);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 623, 838, 15);
		frame.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Ganador:");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_2.setBounds(257, 649, 112, 79);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JRadioButton rb_ganador1 = new JRadioButton("Peleador 1");
		rb_ganador1.setEnabled(false);
		buttonGroup.add(rb_ganador1);
		rb_ganador1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb_ganador1.setBounds(359, 661, 102, 50);
		frame.getContentPane().add(rb_ganador1);
		
		JRadioButton rb_ganador2 = new JRadioButton("Peleador 2");
		rb_ganador2.setEnabled(false);
		buttonGroup.add(rb_ganador2);
		rb_ganador2.setFont(new Font("Tahoma", Font.BOLD, 13));
		rb_ganador2.setBounds(480, 661, 112, 50);
		frame.getContentPane().add(rb_ganador2);
		
		JButton btn_CerrarApuestas = new JButton("Cerrar Apuestas");
		
		btn_CerrarApuestas.setEnabled(false);
		btn_CerrarApuestas.setBounds(46, 656, 200, 50);
		frame.getContentPane().add(btn_CerrarApuestas);
		
		JButton btn_ConfirmarApuesta = new JButton("Confirmar Apuesta");
		
		btn_ConfirmarApuesta.setEnabled(false);
		btn_ConfirmarApuesta.setBounds(296, 538, 200, 50);
		frame.getContentPane().add(btn_ConfirmarApuesta);
		
		JButton btn_verPremios = new JButton("Ver Premios");
		
		btn_verPremios.setEnabled(false);
		btn_verPremios.setBounds(611, 661, 200, 50);
		frame.getContentPane().add(btn_verPremios);
		
		btn_OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!txt_peleador1.getText().isEmpty() && !txt_peleador2.getText().isEmpty()) { //Boton OK a los peleadores
					txt_peleador1.setEditable(false);
					txt_peleador2.setEditable(false);
					lbl_NombrePeleador1.setText(txt_peleador1.getText());
					lbl_NombrePeleador2.setText(txt_peleador2.getText());
					
					btn_NuevoApostador.setEnabled(true);
					
					rb_peleador1.setText(lbl_NombrePeleador1.getText());
					rb_peleador2.setText(lbl_NombrePeleador2.getText());
					
					btn_CerrarApuestas.setEnabled(true);
					btn_OK.setEnabled(false);
					
					
					
					
				}
			}
		});
		
		btn_NuevoApostador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_NombreApostador.setEditable(true);
				txt_CantidadApostada.setEditable(true);
				rb_peleador1.setEnabled(true);
				rb_peleador2.setEnabled(true);
				
				btn_ConfirmarApuesta.setEnabled(true);
				btn_NuevoApostador.setEnabled(false);
			}
		});
		
		
		btn_ConfirmarApuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pasamos los datos del apostador a las variables.
				apostador = txt_NombreApostador.getText();
				dineroApostado = Double.parseDouble(txt_CantidadApostada.getText()); 
				///descontamos el 10%
				dineroDescontado = dineroApostado * 0.1;
				dineroApostado -= dineroDescontado;
				
				//acumulamos el dinero de los luchadores
				if (rb_peleador1.isSelected()) {
					dineroLuchador1 += dineroApostado;
				} else {
					dineroLuchador2 += dineroApostado;
				}
				if (rb_peleador1.isSelected()) {
					luchadorElegido = 'A';
				} else {
					luchadorElegido = 'B';
				}
				//almacenamos todos los datos en una lista
				String[] apuesta = {apostador,String.valueOf(dineroApostado),String.valueOf(luchadorElegido)};
				apuestas.add(apuesta);
				
				//calcular y mostrar el dinero acumulado de cada luchador
				cuotaLuchador1 = calcularCuota(dineroLuchador1, dineroLuchador2, cuotaMax, cuotaMin);
				cuotaLuchador2 = calcularCuota(dineroLuchador2, dineroLuchador1, cuotaMax, cuotaMin);
				

				txt_Cuota1.setText(df.format(cuotaLuchador1));
				txt_Couta2.setText(df.format(cuotaLuchador2));
				
				txt_ApuestaTotal1.setText(df.format(dineroLuchador1));
				txt_ApuestaTotal2.setText(df.format(dineroLuchador2));
				
				txt_NombreApostador.setText(null);
				txt_CantidadApostada.setText(null);
				rb_peleador1.setSelected(false);
				rb_peleador2.setSelected(false);
				btn_NuevoApostador.setEnabled(true);
				
				txt_NombreApostador.setEditable(false);
				txt_CantidadApostada.setEditable(false);
				
				rb_peleador1.setEnabled(false);
				rb_peleador2.setEnabled(false);
				
				
				
				
			}
		});
		
		btn_CerrarApuestas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rb_ganador1.setEnabled(true);
				rb_ganador2.setEnabled(true);
				btn_verPremios.setEnabled(true);
				btn_CerrarApuestas.setEnabled(false);
			}
			
		});
		
		btn_verPremios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dineroTotal = 0;
				StringBuilder mensaje = new StringBuilder();
				
				for (String[] apuesta : apuestas) {
					double premioIndividual=0;
					double dineroApostado = Double.parseDouble(apuesta[1]);
					char luchadorElegido = apuesta[2].charAt(0);
					System.out.println("premioindividual: "+premioIndividual);
					System.out.println("dineroApostado: "+dineroApostado);
					System.out.println(String.valueOf(luchadorElegido));
					if (luchadorElegido == 'A' && rb_ganador1.isSelected()) {
		                premioIndividual = dineroApostado * calcularCuota(dineroLuchador1, dineroLuchador2, cuotaMax, cuotaMin);
		            } else if (luchadorElegido == 'B' && rb_ganador2.isSelected()){
		            	premioIndividual = dineroApostado * calcularCuota(dineroLuchador2, dineroLuchador1, cuotaMax, cuotaMin);
		            }else {
		                premioIndividual = 0; // Si el apostador no ganó según su elección, no hay premio
		            }
					System.out.println("Premio despues de verificar ganador: "+premioIndividual);
					/*if (rb_ganador1.isSelected() && luchadorElegido == '1') {
						premioIndividual = dineroApostado * calcularCuota(dineroLuchador1, dineroLuchador2, cuotaMax, cuotaMin);
					} else if (rb_ganador2.isSelected() && luchadorElegido == '2') {
						premioIndividual = dineroApostado * calcularCuota(dineroLuchador2, dineroLuchador1, cuotaMax, cuotaMin);
					}else {
						premioIndividual=0;
					}*/
					dineroTotal += premioIndividual;
					
					mensaje.append(apuesta[0]).append(": ").append(df.format(premioIndividual)).append("\n");
					
					//if (apuesta[2] ==)
					txtArea_Ganadores.setText(mensaje.toString());
					txtArea_Ganadores.setEditable(false);
					
					
					
				}
				Jpanel_Premios.setVisible(true);
				btn_CerrarApuestas.setEnabled(false);
				rb_ganador1.setEnabled(false);
				rb_ganador2.setEnabled(false);
				
				
			}
		});
		
		
	}
	public static double calcularCuota(double dineroApostado, double dineroRival, double cuotaMaxima, double cuotaMinima) {
        double proporcion = dineroApostado / (dineroApostado + dineroRival);
        double cuota = 1 / proporcion;
        cuota = Math.max(cuota, cuotaMinima);
        cuota = Math.min(cuota, cuotaMaxima);
        return cuota;
    }
}
