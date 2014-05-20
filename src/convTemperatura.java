import javax.swing.JOptionPane;


public class convTemperatura {

	/** Programa: projeto feito converter temperatura fahrenheit para celsius feita em Java 
	@author Odair UNIPE
	@version 1.0
	*
	*/
	public static void main(String[] args) {
		double vtemp = 0;
		
		vtemp = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em fohrenheit:"));
		JOptionPane.showMessageDialog(null,"A tempera em graus celsius é " + fahrenheit(vtemp)  );
		
	}
	
	/** Classe  fahrenheit
	@param F  - Parametro passado com código fohrenheit
	@return C - retorno calculado para celsius
	*
	*/
	public static double fahrenheit(double F){
		double C = (F-32)*5/9;
		return C;
	}

}
