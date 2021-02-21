/**
*
*/
package fecha;

/**
 * @author José Antonio Del Rey Martínez
 *
 */
public class Fecha {
	public int dia;
	public int mes;
	public int ano;

	public Fecha(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
//	Determinamos si el dia o mes introducidos son validos.
	/**
	 * @deprecated Use {@link #validarFecha()} instead
	 */
	public boolean validar() {
		return validarFecha();
	}
	//	Determinamos si el dia o mes introducidos son validos.
	public boolean validarFecha() {
		if (dia < 1 || dia > 31)
			return false;
		if (mes < 1 || mes > 12)
			return false;
// Determinamos la cantidad de días del mes:
		int diasMes = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diasMes = 30;
			break;
		case 2: // Verificamos si el año es bisiesto
			if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
				diasMes = 29;
			else
				diasMes = 28;
			break;
		}
		return bisiesto(diasMes);
	}
	/**
	 * @param diasMes
	 * @return
	 */
	public boolean bisiesto(int diasMes) {
		if (dia > diasMes)
			return false;
		else
			return true;
	}
}