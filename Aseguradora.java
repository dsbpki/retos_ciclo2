//First challenge
package Aseguradora;
public class Aseguradora {
	public static double liquidarPrestaciones(int salario, int diasTrabajados) {
		
		double prima = salario*diasTrabajados/360;
		double sesantias = salario*diasTrabajados/360;
		double interesesCesantias = sesantias*0.12;
		double vacaciones = salario*diasTrabajados/720;
		double liquidacion = prima+sesantias+interesesCesantias+vacaciones;
		return liquidacion;
	}

}
