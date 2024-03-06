package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import java.awt.TextField;

import javax.swing.JRadioButton;
import javax.print.attribute.SupportedValuesAttribute;
import javax.print.attribute.standard.Media;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.IllegalFormatFlagsException;
import java.util.Map;
import java.util.TimeZone;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class MainInterface {

	private JFrame frmCalculadoraYellowJack;
	private JTextField CantidadMediaLuna;
	private JTextField CantidadPapasFritas;
	private JTextField PrecioLunas;
	private JTextField textField_7;
	private JTextField PrecioLunasPapas;
	private JTextField textField_9;
	private JButton Boton3Lunas;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton Boton1Papas;
	private JButton Boton3Papas;
	private JTextField CantidadLimonada;
	private JTextField PrecioLunasLimonada;
	private JTextField textField_4;
	private JLabel lblNewLabel_3;
	private JButton Boton1Limonada;
	private JButton Boton3Limonada;
	private JTextField CantidadWhisCola;
	private JTextField PrecioWhisCola;
	private JTextField textField_11;
	private JLabel lblNewLabel_4;
	private JButton Boton1WhisCola;
	private JButton Boton3WhisCola;
	private JLabel lblNewLabel_5;
	private JTextField CantidadMezcal;
	private JButton Boton1Mezcal;
	private JButton Boton3Mezcal;
	private JTextField PrecioMezcal;
	private JTextField textField_14;
	private JLabel lblNewLabel_6;
	private JTextField CantidadCorona;
	private JButton Boton1Corona;
	private JButton Boton3Corona;
	private JTextField PrecioCorona;
	private JTextField textField_17;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JTextField PrecioCliente;
	private JTextField txtFacturaTotal;
	private JTextField textField_19;
	private JTextField txtMotivo;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JTextField TextoMotivoFactura;
	private JPanel panel_1;
	private JRadioButton DescuentoMoteros;
	private JRadioButton DescuentoNorteños;
	private JRadioButton DescuentoCombos;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSeparator separator_6;
	private JComboBox SeleccionAlcohol;
	private JLabel lblNewLabel_7;
	private JComboBox SeleccionDroga;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JRadioButton TragoDelViejo;
	private JButton BotonEditar;
	private JButton BotonLimiar;
	private JButton BotonMe;
	private JButton BotonDo;
	private JPanel panel_do;
	private JTextField txtmeSacaUn;
	private JRadioButton DescuentosNo;
	private JPanel panel_me;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JButton BotonAnuncio;
	private JTextField txtFacturaTotalD;
	private JTextField PrecioTotal;
	private JTextField textField_25;
	private JTextField RelojArgentina;
	private JTextField RelojEEUU;
	private JTextField RelojSpain;
	private JButton BotonCobrar;
	private JPanel panel_Anuncio;
	private Map<String, Integer> productosMap = new HashMap<>();
	private boolean activadoTrago = false;
	
	//PRECIO DE LOS PRODUCTOS: TODO
	private int  precioLuna=16;
	private int  precioPapas=20;
	private int  precioLimonada=15;
	private int  precioWhisCola=40;
	private int  precioMezcal=50;
	private int  precioCorona=25;
	private int  precioSuperVozka=100;
	
	//FACTURACION:
	private int  precioTotalCliente;
	private int facturacionDia;
	private String textoFactura;
	private int precioTragoViejo;
	
	private double descuentoMotero=0.8;
	private double descuentoNorte=0.9;
	private double descuentoCombo=0.95;
	
	
	//CANTIDAD DE PRODUCTOS QUE PIDE EL CLIENTE:
	private int  cantidadLuna;
	private int  cantidadPapas;
	private int  cantidadLimonada;
	private int  cantidadWhisCola;
	private int  cantidadMezcal;
	private int  cantidadCorona;
	private int  cantidadTragosViejo;
	private int  cantidadSuperVozka;
	//PRECIO DE LAS DROGAS:
	private int  precioMetaAnfeta = 90;
	private int  precioCocaina = 85;
	private int  precioCrack = 80;
	private Map<String, Integer> productos = new HashMap<>();

	
	private JButton btnCleanLunas;
	private JButton btnCleanPapas;
	private JButton btnCleanLimonada;
	private JButton btnCleanWhisCola;
	private JButton btnCleanMezcal;
	private JButton btnCleanCorona;
	private JTextField PrecioTragoViejo;
	private JTextField textField_1;
	private JTextField CantidadTragosViejo;
	private JTextField SuperVozka;
	private JButton btnCleanSuperVozka;
	private JButton Boton1SuperVozka;
	private JLabel lblNewLabel_10;
	private JButton Boton3SuperVozka;
	private JTextField PrecioSuperVozka;
	private JTextField textField_3;
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////TODO METODOS
	
	public int calculo(int lunas, int papas, int limonada, int whisky, int mezcal, int corona, int superVozka) {
		int resultado=0;
		resultado = (lunas*precioLuna)+(papas*precioPapas)+(limonada*precioLimonada)+(whisky*precioWhisCola)+(mezcal*precioMezcal)+(corona*precioCorona)+(superVozka*precioSuperVozka);

		if (DescuentoMoteros.isSelected()) {
			resultado*=descuentoMotero;
		}
		else if (DescuentoNorteños.isSelected()) {
			resultado *= descuentoNorte;
		}
		else if (DescuentoCombos.isSelected()) {
			resultado *= descuentoCombo;
		}
		if (TragoDelViejo.isSelected()) {
			calcularTragoViejo();
		}
		if (resultado < 0) {
			resultado = 0;
		}
		resultado += precioTragoViejo;
		return resultado;
	}
	
	public int borrarCantidad(int cantidad,int precio,JTextField Cantidad) {
		if (cantidad >= 0) {
		precioTotalCliente -= (cantidad*precio);
		if (precioTotalCliente < 0) {
			precioTotalCliente = 0;
		}
		PrecioCliente.setText(String.valueOf(precioTotalCliente));
		cantidad = 0;
		Cantidad.setText(String.valueOf(cantidad));
		}
		return cantidad;
	}
	
	private void actualizarInterfazUsuario() {
	    // Actualizar campos de texto con valores iniciales
	    PrecioCliente.setText("0");
	    PrecioTragoViejo.setText("0");
	    TextoMotivoFactura.setText("-"); // O cualquier valor que signifique 'vacío' o 'estado inicial'
	    CantidadCorona.setText("0");
	    CantidadMediaLuna.setText("0");
	    CantidadPapasFritas.setText("0");
	    CantidadLimonada.setText("0");
	    CantidadWhisCola.setText("0");
	    CantidadMezcal.setText("0");
	    SuperVozka.setText("0");

	    // Restablecer la selección de cualquier JComboBox, si aplica
	    if (SeleccionAlcohol != null) {
	        SeleccionAlcohol.setSelectedIndex(0); // Asumiendo que el primer ítem es el valor por defecto
	    }
	    if (SeleccionDroga != null) {
	        SeleccionDroga.setSelectedIndex(0); // Asumiendo que el primer ítem es el valor por defecto
	    }

	    // Desmarcar todos los botones de radio de descuento y seleccionar "Sin Descuento", si aplica
	    DescuentoCombos.setSelected(false);
	    DescuentoMoteros.setSelected(false);
	    DescuentoNorteños.setSelected(false);
	    DescuentosNo.setSelected(true); // Asumiendo que este es el botón de radio para "Sin Descuento"

	    // Si hay otros componentes visuales que necesitan ser reseteados, hazlo aquí
	    // Por ejemplo, resetear cualquier indicador visual, gráfico o tabla presente en la interfaz

	    // Finalmente, si tienes algún mecanismo de log o consola en la UI, también podría ser limpiado
	    // LogConsola.setText(""); // Ejemplo para limpiar una consola de log dentro de la UI
	}
	
	public void mostrarMotivo(String txt, int cantidad) {
	    // Verificar si el producto ya existe y actualizar su cantidad
	    if (productos.containsKey(txt)) {
	        productos.put(txt, productos.get(txt) + cantidad); // Actualiza la cantidad si el producto ya existe
	    } else {
	        productos.put(txt, cantidad); // Agrega el producto si no existe
	    }
	    
	    // Reconstruir textoFactura basado en el mapa actualizado de productos
	    textoFactura = "";
	    int i = 0;
	    for (Map.Entry<String, Integer> entry : productos.entrySet()) {
	        textoFactura += entry.getValue() + " " + entry.getKey(); // Construye la cadena con la cantidad actualizada y el nombre del producto
	        if (i < productos.size() - 1) {
	            textoFactura += " + ";
	        }
	        i++;
	    }
	    
	    // Actualizar el campo de texto en la GUI
	    TextoMotivoFactura.setText(textoFactura);
	}
	
	public void borrarMotivo(String nombreProducto) {
	    // Eliminar el producto del mapa
	    productos.remove(nombreProducto);

	    // Reconstruir textoFactura basado en el mapa actualizado de productos
	    textoFactura = "";
	    int i = 0;
	    for (Map.Entry<String, Integer> entry : productos.entrySet()) {
	        textoFactura += entry.getValue() + " " + entry.getKey();
	        if (i < productos.size() - 1) {
	            textoFactura += " + ";
	        }
	        i++;
	    }

	    // Actualizar el campo de texto en la GUI
	    TextoMotivoFactura.setText(textoFactura);
	}
	
	public void calcularTragoViejo() {

			int selectAlcohol = SeleccionAlcohol.getSelectedIndex();
			int selectDroga = SeleccionDroga.getSelectedIndex();
			if (precioTragoViejo < 0) {
				precioTragoViejo = 0;
			}
		
			if (selectAlcohol == 0 && selectDroga == 0) {
				precioTragoViejo = (precioWhisCola+precioMetaAnfeta)*cantidadTragosViejo;
				if (precioTragoViejo < 0) {
					precioTragoViejo = 0;
				}
				PrecioTragoViejo.setText(String.valueOf(precioTragoViejo));
			}else if(selectAlcohol == 0 && selectDroga == 1) {
				precioTragoViejo = (precioWhisCola+precioCrack)*cantidadTragosViejo;
				if (precioTragoViejo < 0) {
					precioTragoViejo = 0;
				}
				PrecioTragoViejo.setText(String.valueOf(precioTragoViejo));	
			}else if (selectAlcohol == 0 && selectDroga == 2) {
				precioTragoViejo = (precioWhisCola+precioCocaina)*cantidadTragosViejo;
				if (precioTragoViejo < 0) {
					precioTragoViejo = 0;
				}
				PrecioTragoViejo.setText(String.valueOf(precioTragoViejo));
			}else if (selectAlcohol == 1 && selectDroga == 0) {
				precioTragoViejo = (precioMezcal+precioMetaAnfeta)*cantidadTragosViejo;
				if (precioTragoViejo < 0) {
					precioTragoViejo = 0;
				}
				PrecioTragoViejo.setText(String.valueOf(precioTragoViejo));
			}else if (selectAlcohol == 1 && selectDroga == 1) {
				precioTragoViejo = (precioMezcal+precioCrack)*cantidadTragosViejo;
				if (precioTragoViejo < 0) {
					precioTragoViejo = 0;
				}
				PrecioTragoViejo.setText(String.valueOf(precioTragoViejo));
			}else if (selectAlcohol == 1 && selectDroga == 2) {
				precioTragoViejo = (precioMezcal+precioCocaina)*cantidadTragosViejo;
				if (precioTragoViejo < 0) {
					precioTragoViejo = 0;
				}
				PrecioTragoViejo.setText(String.valueOf(precioTragoViejo));
			}else {
				precioTragoViejo = 0;
				PrecioTragoViejo.setText(String.valueOf(precioTragoViejo));
			}
			int sumaPrecio=precioTragoViejo + precioTotalCliente;
			CantidadTragosViejo.setText(String.valueOf(cantidadTragosViejo));
			PrecioCliente.setText(String.valueOf(sumaPrecio));
			panel_do.setVisible(false);
			panel_me.setVisible(false);
			panel_Anuncio.setVisible(false);
		
	}
	
	  

	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface window = new MainInterface();
					window.frmCalculadoraYellowJack.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraYellowJack = new JFrame();
		frmCalculadoraYellowJack.setTitle("CALCULADORA YELLOW JACK");
		frmCalculadoraYellowJack.setBounds(100, 100, 1328, 937);
		frmCalculadoraYellowJack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraYellowJack.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("CALCULADORA YELLOW JACK");
		lblNewLabel.setForeground(new Color(255, 102, 0));
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 1323, 50);
		frmCalculadoraYellowJack.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(476, 48, 386, 14);
		frmCalculadoraYellowJack.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(0, 73, 1350, 834);
		frmCalculadoraYellowJack.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton Boton1Lunas = new JButton("+1");
		
		Boton1Lunas.setBounds(86, 109, 95, 50);
		panel.add(Boton1Lunas);
		Boton1Lunas.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		
		CantidadMediaLuna = new JTextField();
		CantidadMediaLuna.setEditable(false);
		CantidadMediaLuna.setText("0");
		CantidadMediaLuna.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadMediaLuna.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		CantidadMediaLuna.setBounds(10, 109, 66, 50);
		panel.add(CantidadMediaLuna);
		CantidadMediaLuna.setColumns(10);
		
		CantidadPapasFritas = new JTextField();
		CantidadPapasFritas.setEditable(false);
		CantidadPapasFritas.setText("0");
		CantidadPapasFritas.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadPapasFritas.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		CantidadPapasFritas.setColumns(10);
		CantidadPapasFritas.setBounds(10, 205, 66, 50);
		panel.add(CantidadPapasFritas);
		
		PrecioLunas = new JTextField();
		PrecioLunas.setEditable(false);
		PrecioLunas.setBackground(SystemColor.info);
		PrecioLunas.setText("16");
		PrecioLunas.setHorizontalAlignment(SwingConstants.CENTER);
		PrecioLunas.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		PrecioLunas.setColumns(10);
		PrecioLunas.setBounds(292, 109, 66, 50);
		panel.add(PrecioLunas);
		
		textField_7 = new JTextField();
		textField_7.setText("$");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(SystemColor.info);
		textField_7.setBounds(357, 109, 35, 50);
		panel.add(textField_7);
		
		PrecioLunasPapas = new JTextField();
		PrecioLunasPapas.setText("20");
		PrecioLunasPapas.setHorizontalAlignment(SwingConstants.CENTER);
		PrecioLunasPapas.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		PrecioLunasPapas.setEditable(false);
		PrecioLunasPapas.setColumns(10);
		PrecioLunasPapas.setBackground(SystemColor.info);
		PrecioLunasPapas.setBounds(292, 205, 66, 50);
		panel.add(PrecioLunasPapas);
		
		textField_9 = new JTextField();
		textField_9.setText("$");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(SystemColor.info);
		textField_9.setBounds(357, 205, 35, 50);
		panel.add(textField_9);
		
		Boton3Lunas = new JButton("+3");
		
		Boton3Lunas.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton3Lunas.setBounds(191, 109, 95, 50);
		panel.add(Boton3Lunas);
		
		lblNewLabel_1 = new JLabel("Media Lunas");
		lblNewLabel_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(86, 70, 200, 33);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Papas Fritas");
		lblNewLabel_2.setForeground(new Color(0, 128, 0));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		lblNewLabel_2.setBounds(86, 170, 200, 24);
		panel.add(lblNewLabel_2);
		
		Boton1Papas = new JButton("+1");
		
		Boton1Papas.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton1Papas.setBounds(86, 205, 95, 50);
		panel.add(Boton1Papas);
		
		Boton3Papas = new JButton("+3");
		Boton3Papas.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton3Papas.setBounds(191, 205, 95, 50);
		panel.add(Boton3Papas);
		
		CantidadLimonada = new JTextField();
		CantidadLimonada.setText("0");
		CantidadLimonada.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadLimonada.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		CantidadLimonada.setEditable(false);
		CantidadLimonada.setColumns(10);
		CantidadLimonada.setBounds(10, 311, 66, 50);
		panel.add(CantidadLimonada);
		
		PrecioLunasLimonada = new JTextField();
		PrecioLunasLimonada.setText("15");
		PrecioLunasLimonada.setHorizontalAlignment(SwingConstants.CENTER);
		PrecioLunasLimonada.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		PrecioLunasLimonada.setEditable(false);
		PrecioLunasLimonada.setColumns(10);
		PrecioLunasLimonada.setBackground(SystemColor.info);
		PrecioLunasLimonada.setBounds(292, 311, 66, 50);
		panel.add(PrecioLunasLimonada);
		
		textField_4 = new JTextField();
		textField_4.setText("$");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(SystemColor.info);
		textField_4.setBounds(357, 311, 35, 50);
		panel.add(textField_4);
		
		lblNewLabel_3 = new JLabel("Limonada");
		lblNewLabel_3.setForeground(new Color(0, 128, 0));
		lblNewLabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		lblNewLabel_3.setBounds(86, 276, 200, 24);
		panel.add(lblNewLabel_3);
		
		Boton1Limonada = new JButton("+1");
		
		Boton1Limonada.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton1Limonada.setBounds(86, 311, 95, 50);
		panel.add(Boton1Limonada);
		
		Boton3Limonada = new JButton("+3");
		Boton3Limonada.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton3Limonada.setBounds(191, 311, 95, 50);
		panel.add(Boton3Limonada);
		
		CantidadWhisCola = new JTextField();
		CantidadWhisCola.setText("0");
		CantidadWhisCola.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadWhisCola.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		CantidadWhisCola.setEditable(false);
		CantidadWhisCola.setColumns(10);
		CantidadWhisCola.setBounds(10, 424, 66, 50);
		panel.add(CantidadWhisCola);
		
		PrecioWhisCola = new JTextField();
		PrecioWhisCola.setText("40");
		PrecioWhisCola.setHorizontalAlignment(SwingConstants.CENTER);
		PrecioWhisCola.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		PrecioWhisCola.setEditable(false);
		PrecioWhisCola.setColumns(10);
		PrecioWhisCola.setBackground(SystemColor.info);
		PrecioWhisCola.setBounds(292, 424, 66, 50);
		panel.add(PrecioWhisCola);
		
		textField_11 = new JTextField();
		textField_11.setText("$");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBackground(SystemColor.info);
		textField_11.setBounds(357, 424, 35, 50);
		panel.add(textField_11);
		
		lblNewLabel_4 = new JLabel("WhisCola");
		lblNewLabel_4.setForeground(new Color(0, 128, 0));
		lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		lblNewLabel_4.setBounds(86, 389, 200, 24);
		panel.add(lblNewLabel_4);
		
		Boton1WhisCola = new JButton("+1");
		Boton1WhisCola.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton1WhisCola.setBounds(86, 424, 95, 50);
		panel.add(Boton1WhisCola);
		
		Boton3WhisCola = new JButton("+3");
		Boton3WhisCola.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton3WhisCola.setBounds(191, 424, 95, 50);
		panel.add(Boton3WhisCola);
		
		lblNewLabel_5 = new JLabel("Mezcal");
		lblNewLabel_5.setForeground(new Color(0, 128, 0));
		lblNewLabel_5.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		lblNewLabel_5.setBounds(86, 485, 200, 24);
		panel.add(lblNewLabel_5);
		
		CantidadMezcal = new JTextField();
		CantidadMezcal.setText("0");
		CantidadMezcal.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadMezcal.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		CantidadMezcal.setEditable(false);
		CantidadMezcal.setColumns(10);
		CantidadMezcal.setBounds(10, 520, 66, 50);
		panel.add(CantidadMezcal);
		
		Boton1Mezcal = new JButton("+1");
		Boton1Mezcal.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton1Mezcal.setBounds(86, 520, 95, 50);
		panel.add(Boton1Mezcal);
		
		Boton3Mezcal = new JButton("+3");
		Boton3Mezcal.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton3Mezcal.setBounds(191, 520, 95, 50);
		panel.add(Boton3Mezcal);
		
		PrecioMezcal = new JTextField();
		PrecioMezcal.setText("50");
		PrecioMezcal.setHorizontalAlignment(SwingConstants.CENTER);
		PrecioMezcal.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		PrecioMezcal.setEditable(false);
		PrecioMezcal.setColumns(10);
		PrecioMezcal.setBackground(SystemColor.info);
		PrecioMezcal.setBounds(292, 520, 66, 50);
		panel.add(PrecioMezcal);
		
		textField_14 = new JTextField();
		textField_14.setText("$");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBackground(SystemColor.info);
		textField_14.setBounds(357, 520, 35, 50);
		panel.add(textField_14);
		
		lblNewLabel_6 = new JLabel("Corona");
		lblNewLabel_6.setForeground(new Color(0, 128, 0));
		lblNewLabel_6.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		lblNewLabel_6.setBounds(86, 581, 200, 24);
		panel.add(lblNewLabel_6);
		
		CantidadCorona = new JTextField();
		CantidadCorona.setText("0");
		CantidadCorona.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadCorona.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		CantidadCorona.setEditable(false);
		CantidadCorona.setColumns(10);
		CantidadCorona.setBounds(10, 611, 66, 50);
		panel.add(CantidadCorona);
		
		Boton1Corona = new JButton("+1");
		Boton1Corona.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton1Corona.setBounds(86, 611, 95, 50);
		panel.add(Boton1Corona);
		
		Boton3Corona = new JButton("+3");
		Boton3Corona.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton3Corona.setBounds(191, 611, 95, 50);
		panel.add(Boton3Corona);
		
		PrecioCorona = new JTextField();
		PrecioCorona.setText("25");
		PrecioCorona.setHorizontalAlignment(SwingConstants.CENTER);
		PrecioCorona.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		PrecioCorona.setEditable(false);
		PrecioCorona.setColumns(10);
		PrecioCorona.setBackground(SystemColor.info);
		PrecioCorona.setBounds(292, 611, 66, 50);
		panel.add(PrecioCorona);
		
		textField_17 = new JTextField();
		textField_17.setText("$");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBackground(SystemColor.info);
		textField_17.setBounds(357, 611, 35, 50);
		panel.add(textField_17);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(10, 367, 408, 11);
		panel.add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(10, 261, 408, 11);
		panel.add(separator_2);
		
		PrecioCliente = new JTextField();
		PrecioCliente.setHorizontalAlignment(SwingConstants.CENTER);
		PrecioCliente.setText("0");
		PrecioCliente.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		PrecioCliente.setEditable(false);
		PrecioCliente.setColumns(10);
		PrecioCliente.setBackground(SystemColor.info);
		PrecioCliente.setBounds(795, 154, 156, 50);
		panel.add(PrecioCliente);
		
		txtFacturaTotal = new JTextField();
		txtFacturaTotal.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		txtFacturaTotal.setText("FACTURA TOTAL:");
		txtFacturaTotal.setHorizontalAlignment(SwingConstants.TRAILING);
		txtFacturaTotal.setEditable(false);
		txtFacturaTotal.setBounds(569, 154, 216, 50);
		panel.add(txtFacturaTotal);
		txtFacturaTotal.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setText("$");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBackground(SystemColor.info);
		textField_19.setBounds(950, 154, 35, 50);
		panel.add(textField_19);
		
		txtMotivo = new JTextField();
		txtMotivo.setText("MOTIVO:");
		txtMotivo.setHorizontalAlignment(SwingConstants.TRAILING);
		txtMotivo.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		txtMotivo.setEditable(false);
		txtMotivo.setColumns(10);
		txtMotivo.setBounds(453, 93, 110, 50);
		panel.add(txtMotivo);
		
		separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(417, 70, 26, 753);
		panel.add(separator_4);
		
		separator_5 = new JSeparator();
		separator_5.setBounds(10, 70, 408, 11);
		panel.add(separator_5);
		
		TextoMotivoFactura = new JTextField();
		TextoMotivoFactura.setEditable(false);
		TextoMotivoFactura.setText("-");
		TextoMotivoFactura.setHorizontalAlignment(SwingConstants.CENTER);
		TextoMotivoFactura.setFont(new Font("Rockwell Condensed", Font.BOLD, 14));
		TextoMotivoFactura.setBounds(569, 93, 734, 50);
		panel.add(TextoMotivoFactura);
		TextoMotivoFactura.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBounds(453, 218, 850, 92);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		DescuentoMoteros = new JRadioButton("MOTEROS (20%)");
		
		buttonGroup.add(DescuentoMoteros);
		DescuentoMoteros.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		DescuentoMoteros.setBounds(20, 21, 200, 50);
		panel_1.add(DescuentoMoteros);
		
		DescuentoNorteños = new JRadioButton("NORTEÑOS (10%)");
		
		buttonGroup.add(DescuentoNorteños);
		DescuentoNorteños.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		DescuentoNorteños.setBounds(245, 21, 200, 50);
		panel_1.add(DescuentoNorteños);
		
		DescuentoCombos = new JRadioButton("COMBOS (5%)");
		
		buttonGroup.add(DescuentoCombos);
		DescuentoCombos.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		DescuentoCombos.setBounds(484, 21, 165, 50);
		panel_1.add(DescuentoCombos);
		
		DescuentosNo = new JRadioButton("SIN DESCUENTO");
		
		buttonGroup.add(DescuentosNo);
		DescuentosNo.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		DescuentosNo.setBounds(675, 21, 165, 50);
		panel_1.add(DescuentosNo);
		
		JTextArea TextoCartaMenu = new JTextArea();
		TextoCartaMenu.setFont(new Font("Monospaced", Font.PLAIN, 20));
		TextoCartaMenu.setEditable(false);
		TextoCartaMenu.setText("Carba:\r\nMedias lunes: 16 $\r\npatas frytas: 20 $\r\nLimomado: 15 $\r\nUiscola 40 $\r\nMercal 50 $\r\nCerberza 25 $");
		TextoCartaMenu.setBounds(428, 348, 217, 257);
		panel.add(TextoCartaMenu);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(655, 348, 648, 194);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		panel_Anuncio = new JPanel();
		panel_Anuncio.setBounds(655, 611, 661, 194);
		panel.add(panel_Anuncio);
		panel_Anuncio.setLayout(null);
		panel_Anuncio.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_Anuncio.setVisible(false);
		
		JTextArea AnuncioTexto1 = new JTextArea();
		AnuncioTexto1.setEditable(false);
		AnuncioTexto1.setText("/anuncio 🍺 El viejo Yellow Jack abren sus puertas para que puedan disfrutar de un buen trago 🍺\r\n");
		AnuncioTexto1.setLineWrap(true);
		AnuncioTexto1.setBounds(10, 21, 641, 47);
		panel_Anuncio.add(AnuncioTexto1);
		
		JTextArea AnuncioTexto2 = new JTextArea();
		AnuncioTexto2.setEditable(false);
		AnuncioTexto2.setText("/anuncio 🐍 Lamentamos cerrar el Yellow Jack durante un rato, hasta que consigamos hacer devolver la comida a Petra 🐍");
		AnuncioTexto2.setLineWrap(true);
		AnuncioTexto2.setBounds(10, 79, 641, 47);
		panel_Anuncio.add(AnuncioTexto2);
		
		JTextArea AnuncioTexto3 = new JTextArea();
		AnuncioTexto3.setEditable(false);
		AnuncioTexto3.setText("/anuncio Crrerrado Egghtamossss deemaasfsiado brrraahccos cmoo pa aatendrr a ndiee 🤢");
		AnuncioTexto3.setLineWrap(true);
		AnuncioTexto3.setBounds(10, 137, 641, 47);
		panel_Anuncio.add(AnuncioTexto3);
		
		separator_6 = new JSeparator();
		separator_6.setBounds(16, 91, 617, 8);
		panel_2.add(separator_6);
		
		SeleccionAlcohol = new JComboBox();
		SeleccionAlcohol.setModel(new DefaultComboBoxModel(new String[] {"WhisCola", "Mezcal"}));
		SeleccionAlcohol.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		SeleccionAlcohol.setBounds(16, 133, 258, 50);
		panel_2.add(SeleccionAlcohol);
		
		lblNewLabel_7 = new JLabel("Alcohol");
		lblNewLabel_7.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(new Color(0, 128, 0));
		lblNewLabel_7.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		lblNewLabel_7.setBounds(16, 103, 258, 24);
		panel_2.add(lblNewLabel_7);
		
		SeleccionDroga = new JComboBox();
		SeleccionDroga.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		SeleccionDroga.setModel(new DefaultComboBoxModel(new String[] {"MetaAnfeta", "Crack", "Cocaína"}));
		SeleccionDroga.setBounds(345, 133, 288, 50);
		panel_2.add(SeleccionDroga);
		
		lblNewLabel_8 = new JLabel("Droga");
		lblNewLabel_8.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(new Color(0, 128, 0));
		lblNewLabel_8.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		lblNewLabel_8.setBounds(345, 100, 288, 24);
		panel_2.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("+");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setForeground(new Color(0, 128, 0));
		lblNewLabel_9.setFont(new Font("Rockwell Condensed", Font.BOLD, 30));
		lblNewLabel_9.setBounds(284, 133, 51, 46);
		panel_2.add(lblNewLabel_9);
		
		TragoDelViejo = new JRadioButton("TRAGO DEL VIEJO :");
		
		TragoDelViejo.setVerticalAlignment(SwingConstants.BOTTOM);
		TragoDelViejo.setForeground(new Color(0, 128, 0));
		TragoDelViejo.setHorizontalAlignment(SwingConstants.TRAILING);
		TragoDelViejo.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		TragoDelViejo.setBounds(261, 38, 207, 46);
		panel_2.add(TragoDelViejo);
		
		PrecioTragoViejo = new JTextField();
		PrecioTragoViejo.setText("0");
		PrecioTragoViejo.setHorizontalAlignment(SwingConstants.CENTER);
		PrecioTragoViejo.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		PrecioTragoViejo.setEditable(false);
		PrecioTragoViejo.setColumns(10);
		PrecioTragoViejo.setBackground(SystemColor.info);
		PrecioTragoViejo.setBounds(474, 48, 104, 30);
		panel_2.add(PrecioTragoViejo);
		
		textField_1 = new JTextField();
		textField_1.setText("$");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.info);
		textField_1.setBounds(576, 48, 35, 30);
		panel_2.add(textField_1);
		
		JButton Boton1TragoViejo = new JButton("+1");
		
		Boton1TragoViejo.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton1TragoViejo.setBounds(181, 43, 74, 37);
		panel_2.add(Boton1TragoViejo);
		
		CantidadTragosViejo = new JTextField();
		CantidadTragosViejo.setText("0");
		CantidadTragosViejo.setHorizontalAlignment(SwingConstants.CENTER);
		CantidadTragosViejo.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		CantidadTragosViejo.setEditable(false);
		CantidadTragosViejo.setColumns(10);
		CantidadTragosViejo.setBounds(119, 43, 52, 37);
		panel_2.add(CantidadTragosViejo);
		
		JButton btnCleanTragoViejo = new JButton("Clean");
		
		btnCleanTragoViejo.setBounds(43, 44, 66, 36);
		panel_2.add(btnCleanTragoViejo);
		btnCleanTragoViejo.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		
		JLabel lblNewLabel_7_1 = new JLabel("Cantidad:");
		lblNewLabel_7_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_7_1.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		lblNewLabel_7_1.setBounds(16, 10, 258, 24);
		panel_2.add(lblNewLabel_7_1);
		
		BotonEditar = new JButton("EDITAR");
		BotonEditar.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		BotonEditar.setBounds(228, 767, 171, 50);
		panel.add(BotonEditar);
		
		BotonLimiar = new JButton("LIMPIAR");
		
		BotonLimiar.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		BotonLimiar.setBounds(12, 767, 171, 50);
		panel.add(BotonLimiar);
		
		panel_do = new JPanel();
		panel_do.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_do.setBounds(655, 611, 648, 50);
		panel.add(panel_do);
		panel_do.setLayout(null);
		panel_do.setVisible(false);
		
		txtmeSacaUn = new JTextField();
		txtmeSacaUn.setText("/do La mezcla sería inapreciable y solo sabría a alcohol");
		txtmeSacaUn.setHorizontalAlignment(SwingConstants.CENTER);
		txtmeSacaUn.setEditable(false);
		txtmeSacaUn.setBounds(10, 10, 628, 30);
		panel_do.add(txtmeSacaUn);
		txtmeSacaUn.setColumns(10);
		
		panel_me = new JPanel();
		panel_me.setBounds(655, 611, 648, 194);
		panel.add(panel_me);
		panel_me.setLayout(null);
		panel_me.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_me.setVisible(false);
		
		textField_20 = new JTextField();
		textField_20.setText("/me Saca un vaso y sirve el alcohol en él");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(10, 10, 628, 30);
		panel_me.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setText("/me  Abre un sobre de \"azucar especial\" y lo echa a la bebida. Remueve la bebida para que se mezcle todo");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(10, 46, 628, 30);
		panel_me.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setText("/me coloca el pedido sobre la barra");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(10, 82, 628, 30);
		panel_me.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText("/me Saca la facturadora y le envia la factura al cliente");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(10, 118, 628, 30);
		panel_me.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText("/me Saca un trapo y limpiaría la zona");
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(10, 154, 628, 30);
		panel_me.add(textField_24);
		
		txtFacturaTotalD = new JTextField();
		txtFacturaTotalD.setText("FACTURACIÓN TOTAL DEL DIA:");
		txtFacturaTotalD.setHorizontalAlignment(SwingConstants.TRAILING);
		txtFacturaTotalD.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		txtFacturaTotalD.setEditable(false);
		txtFacturaTotalD.setColumns(10);
		txtFacturaTotalD.setBounds(333, 10, 336, 50);
		panel.add(txtFacturaTotalD);
		
		PrecioTotal = new JTextField();
		PrecioTotal.setText("0");
		PrecioTotal.setHorizontalAlignment(SwingConstants.CENTER);
		PrecioTotal.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		PrecioTotal.setEditable(false);
		PrecioTotal.setColumns(10);
		PrecioTotal.setBackground(SystemColor.info);
		PrecioTotal.setBounds(679, 10, 306, 50);
		panel.add(PrecioTotal);
		
		textField_25 = new JTextField();
		textField_25.setText("$");
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBackground(SystemColor.info);
		textField_25.setBounds(983, 10, 35, 50);
		panel.add(textField_25);
		
		RelojArgentina = new JTextField();
		RelojArgentina.setHorizontalAlignment(SwingConstants.CENTER);
		RelojArgentina.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		RelojArgentina.setEditable(false);
		RelojArgentina.setColumns(10);
		RelojArgentina.setBounds(429, 611, 216, 50);
		panel.add(RelojArgentina);
		
		RelojEEUU = new JTextField();
		RelojEEUU.setHorizontalAlignment(SwingConstants.CENTER);
		RelojEEUU.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		RelojEEUU.setEditable(false);
		RelojEEUU.setColumns(10);
		RelojEEUU.setBounds(428, 682, 216, 50);
		panel.add(RelojEEUU);
		
		RelojSpain = new JTextField();
		RelojSpain.setHorizontalAlignment(SwingConstants.CENTER);
		RelojSpain.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		RelojSpain.setEditable(false);
		RelojSpain.setColumns(10);
		RelojSpain.setBounds(428, 755, 217, 50);
		panel.add(RelojSpain);
		
		BotonCobrar = new JButton("COBRAR");
		
		BotonCobrar.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		BotonCobrar.setBounds(1013, 154, 171, 50);
		panel.add(BotonCobrar);
		
		btnCleanLunas = new JButton("Clean");
		
		btnCleanLunas.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		btnCleanLunas.setBounds(10, 76, 66, 33);
		panel.add(btnCleanLunas);
		
		btnCleanPapas = new JButton("Clean");
		
		btnCleanPapas.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		btnCleanPapas.setBounds(10, 171, 66, 33);
		panel.add(btnCleanPapas);
		
		btnCleanLimonada = new JButton("Clean");
		btnCleanLimonada.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		btnCleanLimonada.setBounds(10, 277, 66, 33);
		panel.add(btnCleanLimonada);
		
		btnCleanWhisCola = new JButton("Clean");
		btnCleanWhisCola.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		btnCleanWhisCola.setBounds(10, 389, 66, 33);
		panel.add(btnCleanWhisCola);
		
		btnCleanMezcal = new JButton("Clean");
		btnCleanMezcal.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		btnCleanMezcal.setBounds(10, 481, 66, 33);
		panel.add(btnCleanMezcal);
		
		btnCleanCorona = new JButton("Clean");
		btnCleanCorona.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		btnCleanCorona.setBounds(10, 576, 66, 33);
		panel.add(btnCleanCorona);
		
		BotonMe = new JButton("/me");
		BotonMe.setBounds(655, 553, 171, 50);
		panel.add(BotonMe);
		BotonMe.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		
		BotonDo = new JButton("/do");
		BotonDo.setBounds(899, 553, 171, 50);
		panel.add(BotonDo);
		
		BotonDo.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		
		BotonAnuncio = new JButton("/anuncio");
		BotonAnuncio.setBounds(1132, 553, 171, 50);
		panel.add(BotonAnuncio);
		
		BotonAnuncio.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		
		SuperVozka = new JTextField();
		SuperVozka.setText("0");
		SuperVozka.setHorizontalAlignment(SwingConstants.CENTER);
		SuperVozka.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		SuperVozka.setEditable(false);
		SuperVozka.setColumns(10);
		SuperVozka.setBounds(10, 702, 66, 50);
		panel.add(SuperVozka);
		
		btnCleanSuperVozka = new JButton("Clean");
		
		btnCleanSuperVozka.setFont(new Font("Rockwell Condensed", Font.BOLD, 15));
		btnCleanSuperVozka.setBounds(10, 667, 66, 33);
		panel.add(btnCleanSuperVozka);
		
		Boton1SuperVozka = new JButton("+1");
		
		Boton1SuperVozka.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton1SuperVozka.setBounds(86, 702, 95, 50);
		panel.add(Boton1SuperVozka);
		
		lblNewLabel_10 = new JLabel("Super Vozka");
		lblNewLabel_10.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setForeground(new Color(0, 128, 0));
		lblNewLabel_10.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		lblNewLabel_10.setBounds(86, 672, 200, 24);
		panel.add(lblNewLabel_10);
		
		Boton3SuperVozka = new JButton("+3");
		Boton3SuperVozka.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		Boton3SuperVozka.setBounds(191, 702, 95, 50);
		panel.add(Boton3SuperVozka);
		
		PrecioSuperVozka = new JTextField();
		PrecioSuperVozka.setText("100");
		PrecioSuperVozka.setHorizontalAlignment(SwingConstants.CENTER);
		PrecioSuperVozka.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		PrecioSuperVozka.setEditable(false);
		PrecioSuperVozka.setColumns(10);
		PrecioSuperVozka.setBackground(SystemColor.info);
		PrecioSuperVozka.setBounds(292, 702, 66, 50);
		panel.add(PrecioSuperVozka);
		
		textField_3 = new JTextField();
		textField_3.setText("$");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.info);
		textField_3.setBounds(357, 702, 35, 50);
		panel.add(textField_3);
		
		BotonAnuncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_me.setVisible(false);
				panel_do.setVisible(false);
				panel_Anuncio.setVisible(true);
			}
		});
		
		BotonDo.addActionListener(new ActionListener() { ///// BOTON PARA /DO
			public void actionPerformed(ActionEvent e) {
				panel_me.setVisible(false);
				panel_do.setVisible(true);
				panel_Anuncio.setVisible(false);
			}
		});
		
		
		BotonMe.addActionListener(new ActionListener() {  ///// BOTON PARA /ME
			public void actionPerformed(ActionEvent e) {
				panel_me.setVisible(true);
				panel_do.setVisible(false);
				panel_Anuncio.setVisible(false);
				
			}
		});
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////BOTONES PARA AGREGAR TODO
		Boton1TragoViejo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TragoDelViejo.isSelected()) {
				cantidadTragosViejo += 1;
				calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				mostrarMotivo("Trago/s",cantidadTragosViejo);
				}
			}
		});
		
		Boton1Lunas.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				cantidadLuna += 1;
				CantidadMediaLuna.setText(String.valueOf(cantidadLuna));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("Media Luna/s",cantidadLuna);
			}
			
		});Boton3Lunas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadLuna += 3;
				CantidadMediaLuna.setText(String.valueOf(cantidadLuna));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				mostrarMotivo("Media Luna/s",cantidadLuna);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
			}
		});
		
		Boton1Papas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadPapas += 1;
				CantidadPapasFritas.setText(String.valueOf(cantidadPapas));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("Patatas Fritas",cantidadPapas);
			}
		});
		
		Boton3Papas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadPapas += 3;
				CantidadPapasFritas.setText(String.valueOf(cantidadPapas));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("Patatas Fritas",cantidadPapas);
			}
		});
		
		Boton1Limonada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadLimonada += 1;
				CantidadLimonada.setText(String.valueOf(cantidadLimonada));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("Limonada/s",cantidadLimonada);
			}
		});
		
		Boton3Limonada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadLimonada += 3;
				CantidadLimonada.setText(String.valueOf(cantidadLimonada));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("Limonada/s",cantidadLimonada);
			}
		});
		
		Boton1WhisCola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadWhisCola += 1;
				CantidadWhisCola.setText(String.valueOf(cantidadWhisCola));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("WhisCola/s",cantidadWhisCola);
			}
		});
		
		Boton3WhisCola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadWhisCola += 3;
				CantidadWhisCola.setText(String.valueOf(cantidadWhisCola));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("WhisCola/s",cantidadWhisCola);
			}
		});
		
		Boton1Mezcal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadMezcal += 1;
				CantidadMezcal.setText(String.valueOf(cantidadMezcal));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("Mezcal/es",cantidadMezcal);
			}
		});
		
		Boton3Mezcal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadMezcal += 3;
				CantidadMezcal.setText(String.valueOf(cantidadMezcal));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("Mezcal/es",cantidadMezcal);
			}
		});
		
		Boton1Corona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadCorona += 1;
				CantidadCorona.setText(String.valueOf(cantidadCorona));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("Corona/s", cantidadCorona);
			}
		});
		Boton3Corona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadCorona += 3;
				CantidadCorona.setText(String.valueOf(cantidadCorona));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("Coronas/s", cantidadCorona);
			}
		});
		Boton1SuperVozka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadSuperVozka += 1;
				SuperVozka.setText(String.valueOf(cantidadSuperVozka));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("Super Vozka/s", cantidadSuperVozka);
			}
		});
		Boton3SuperVozka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadSuperVozka += 3;
				SuperVozka.setText(String.valueOf(cantidadSuperVozka));
				precioTotalCliente = calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
				mostrarMotivo("Super Vozka/s", cantidadSuperVozka);
			}
		});
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////	RADIOBUTONS DESCUENTOS TODO 
		DescuentoCombos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				precioTotalCliente=calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
			}
		});
		DescuentoNorteños.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				precioTotalCliente=calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
			}
		});
		DescuentoMoteros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				precioTotalCliente=calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
			}
		});
		
		DescuentosNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				precioTotalCliente=calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
				PrecioCliente.setText(String.valueOf(precioTotalCliente));
			}
		});
		
		
		////////////////////////////////////////////////////////////////////////////////// BOTONES DE LIMPIAR
		
		btnCleanTragoViejo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				precioTragoViejo = Integer.valueOf(PrecioTragoViejo.getText());
				
					calcularTragoViejo();
					precioTotalCliente -= (precioTragoViejo);
					if (precioTotalCliente < 0) {
						precioTotalCliente = 0;
					}
					PrecioCliente.setText(String.valueOf(precioTotalCliente));
					cantidadTragosViejo = 0;
					precioTragoViejo=0;
					CantidadTragosViejo.setText("0");
					PrecioTragoViejo.setText(String.valueOf(precioTragoViejo));
					borrarMotivo("Trago/s");
				
			}
		});
		
		btnCleanLunas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadLuna=borrarCantidad(cantidadLuna,precioLuna, CantidadMediaLuna);
				borrarMotivo("Media Luna/s");
				
			}
		});
		btnCleanPapas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadPapas=borrarCantidad(cantidadPapas,precioPapas,CantidadPapasFritas);
				borrarMotivo("Patatas Fritas");
			}
		});
		btnCleanLimonada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadLimonada=borrarCantidad(cantidadLimonada,precioLimonada,CantidadLimonada);
				borrarMotivo("Limonada/s");
			}
		});
		btnCleanWhisCola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadWhisCola=borrarCantidad(cantidadWhisCola,precioWhisCola,CantidadWhisCola);
				borrarMotivo("WhisCola/s");
			}
		});
		btnCleanMezcal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadMezcal=borrarCantidad(cantidadMezcal,precioMezcal,CantidadMezcal);
				borrarMotivo("Mezcal/es");
			}
		});
		btnCleanCorona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadCorona=borrarCantidad(cantidadCorona,precioCorona,CantidadCorona);
				borrarMotivo("Corona/s");
			}
		});
		btnCleanSuperVozka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadSuperVozka=borrarCantidad(cantidadSuperVozka,precioSuperVozka,SuperVozka);
				borrarMotivo("Super Vozka/s");
			}
		});
		BotonLimiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        // Resetear los totales y cantidades
		        precioTotalCliente = 0;
		        textoFactura = "-";
		        precioTragoViejo = 0;
		        cantidadLuna = 0;
		        cantidadPapas = 0;
		        cantidadLimonada = 0;
		        cantidadWhisCola = 0;
		        cantidadMezcal = 0;
		        cantidadCorona = 0;
		        cantidadTragosViejo = 0;
		        cantidadSuperVozka = 0;

		        // Limpiar los campos de texto en la interfaz
		        CantidadCorona.setText("0");
		        CantidadMediaLuna.setText("0");
		        CantidadPapasFritas.setText("0");
		        CantidadLimonada.setText("0");
		        CantidadWhisCola.setText("0");
		        CantidadMezcal.setText("0");
		        CantidadCorona.setText("0"); // Repetido, revisar si es necesario o si fue un error
		        SuperVozka.setText("0");
		        PrecioCliente.setText("0");
		        TextoMotivoFactura.setText(textoFactura); // Asegura que el campo de texto de motivos también se resetea
		        
		        // Resetear la selección de descuentos
		        DescuentoCombos.setSelected(false);
		        DescuentoMoteros.setSelected(false);
		        DescuentoNorteños.setSelected(false);
		        DescuentosNo.setSelected(true); // Asumiendo que tienes un botón de radio para "Sin Descuento"

		        // Si estás usando un HashMap o alguna colección para manejar los productos, también deberías limpiarlo
		        productos.clear();

		        // Actualizar la interfaz para reflejar estos cambios
		        actualizarInterfazUsuario();
		    }
		});
		///////////////////////////////////////////////////////////////////////////////////////////////// TRAGO DEL VIEJO TODO
		TragoDelViejo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);
			}
		});
		SeleccionAlcohol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);	
			}
		});
		SeleccionDroga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculo(cantidadLuna, cantidadPapas, cantidadLimonada, cantidadWhisCola, cantidadMezcal, cantidadCorona, cantidadSuperVozka);	
			}
		});
		
		BotonCobrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facturacionDia += precioTotalCliente;
				PrecioTotal.setText(String.valueOf(facturacionDia));
				precioTotalCliente = 0;
		        textoFactura = "-";
		        precioTragoViejo = 0;
		        cantidadLuna = 0;
		        cantidadPapas = 0;
		        cantidadLimonada = 0;
		        cantidadWhisCola = 0;
		        cantidadMezcal = 0;
		        cantidadCorona = 0;
		        cantidadTragosViejo = 0;
		        cantidadSuperVozka = 0;
		        
		        CantidadCorona.setText("0");
		        CantidadMediaLuna.setText("0");
		        CantidadPapasFritas.setText("0");
		        CantidadLimonada.setText("0");
		        CantidadWhisCola.setText("0");
		        CantidadMezcal.setText("0");
		        CantidadCorona.setText("0"); // Repetido, revisar si es necesario o si fue un error
		        SuperVozka.setText("0");
		        PrecioCliente.setText(String.valueOf(facturacionDia));
		        TextoMotivoFactura.setText(textoFactura); // Asegura que el campo de texto de motivos también se resetea
		        
		        // Resetear la selección de descuentos
		        DescuentoCombos.setSelected(false);
		        DescuentoMoteros.setSelected(false);
		        DescuentoNorteños.setSelected(false);
		        DescuentosNo.setSelected(true); // Asumiendo que tienes un botón de radio para "Sin Descuento"

		        // Si estás usando un HashMap o alguna colección para manejar los productos, también deberías limpiarlo
		        productos.clear();

		        // Actualizar la interfaz para reflejar estos cambios
		        actualizarInterfazUsuario();
			}
		});
		
		Timer timer = new Timer(1000, e -> {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

            // Zona horaria de España (UTC+1)
            sdf.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
            RelojSpain.setText("España: " + sdf.format(cal.getTime()));

            // Zona horaria de Argentina (UTC-3)
            sdf.setTimeZone(TimeZone.getTimeZone("America/Argentina/Buenos_Aires"));
            RelojArgentina.setText("Argentina: " + sdf.format(cal.getTime()));

            // Zona horaria de Miami (UTC-5)
            sdf.setTimeZone(TimeZone.getTimeZone("America/New_York"));
            RelojEEUU.setText("Miami: " + sdf.format(cal.getTime()));
        });
        timer.start();
	}
}
