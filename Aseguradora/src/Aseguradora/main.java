// First challenge
package Aseguradora;

public class main {

	public static void main(String[] args) {
		int workedDays= 149;
		Empleado empleado1 = new Empleado("sara",1810050);
		Empleado empleado2 = new Empleado("juan", 2000000);
		
		
		
		System.out.println("El empleado "+ empleado1.getNombre()+ " gana: "+ empleado1.getSalario());
		
		System.out.println("las prestaciones de "+ empleado1.getNombre()+" son: "+ Aseguradora.liquidarPrestaciones(empleado1, workedDays));
		System.out.println("La seguridad social de "+ empleado1.getNombre()+" son: "+Aseguradora.liquidarSegSocial(empleado1, workedDays));
		System.out.println("La nomina de "+ empleado1.getNombre()+" es: "+ Aseguradora.liquidarNomina(empleado1, workedDays));
		System.out.println("Los parafiscales de  "+ empleado1.getNombre()+" son: "+ Aseguradora.liquidarParafiscales(empleado1, workedDays));
	
		
	}

}
