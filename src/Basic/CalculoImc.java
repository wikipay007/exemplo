package Basic;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CalculoImc implements ActionListener{

	private JTextField campoNome;
	private JTextField campoVendas;
	private JTextField campoValorComissao;
	
	private JTextField campoSalario;
	private JLabel labelResultado;
	private JRadioButton um;
	private JRadioButton dois;
	private JRadioButton tres;
	private JRadioButton quatro;
	
	
	public static void main(String[] args) {
		new CalculoImc();

	}
	
	public CalculoImc() {
		JFrame frame = new JFrame("CalculadoraIMC");
		frame.setSize(300,200);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(9,2,10,10)); // 4 linhas, 2 colunas, tamanho, tamanho
		JLabel labelPeso = new JLabel("Nome do funcionario");
		campoNome = new JTextField();
		JLabel labelAltura = new JLabel("Total de vendas");
		campoVendas = new JTextField();
		JLabel labelComissao = new JLabel("Comissao");
		um = new JRadioButton("1%", false);
		dois = new JRadioButton("2%", false);
		tres = new JRadioButton("3%", false);
		quatro = new JRadioButton("4%", false);
		
		JLabel labelValorComissao = new JLabel("Valor da Comissao");
		campoValorComissao = new JTextField();
		JLabel labelCampoSalario = new JLabel("Valor do salario");
		campoSalario = new JTextField();
		
		
		JButton calcular = new JButton("Calcular");
		calcular.addActionListener(this);
		labelResultado = new JLabel("Salario + comissao:");
		
		// adiciona os componetes do panel
		panel.add(labelPeso);
		panel.add(campoNome);
		panel.add(labelAltura);
		panel.add(campoVendas);
		panel.add(labelComissao);
		panel.add(new JLabel(""));
		panel.add(um);
		panel.add(dois);
		panel.add(tres);
		panel.add(quatro);
		panel.add(labelValorComissao);
		panel.add(campoValorComissao);
		panel.add(labelCampoSalario);
		panel.add(campoSalario);
		panel.add(new JLabel(""));
		panel.add(calcular);
		panel.add(labelResultado);
		panel.add(new JLabel(""));
		
		// adicona o painel ao frame
		frame.add(panel);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double peso = Double.parseDouble(campoNome.getText());
		double altura = Double.parseDouble(campoVendas.getText());
		//calcular o imc
		double imc = peso / (altura*altura);
		if (imc < 18.5) {
			labelResultado.setText(String.format("Abaixo do peso - IMC: %.2f", imc));
        } else if (imc >= 18.5 && imc <= 24.9) {
        	labelResultado.setText(String.format("Peso ideal - IMC: %.2f", imc));
        } else if(imc >= 25.0 && imc <= 29.9) {
        	labelResultado.setText(String.format("Levemente acima do peso - IMC: %.2f", imc));
        } else if(imc >= 30.0 && imc <= 34.9){
        	labelResultado.setText(String.format("Obesidade grau I - IMC: %.2f", imc));
        } else if(imc >= 35.0 && imc <= 39.9){
        	labelResultado.setText(String.format("Obesidade grau II - IMC: %.2f", imc));
        } else if(imc >= 40.0){
        	labelResultado.setText(String.format("Obesidade grau III - IMC: %.2f", imc));
        }
    }
		// exibindo resultado final
		
		
		
	}


