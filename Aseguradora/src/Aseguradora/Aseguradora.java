//First challenge
//package Aseguradora;

import java.util.ArrayList;

public class Aseguradora {
	private ArrayList<Empleado> empleados = new ArrayList<>();
	
	
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}


	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}


	public static double liquidarPrestaciones(Empleado empleado, int diasTrabajados) {
		//double _2moreOfSalary = 908.526*2;
		if (empleado.getSalario() <= 2*908526 ) {
			
			int auxTransporte = 106454;
			double salario = empleado.getSalario() +auxTransporte;
			double prima = salario*diasTrabajados/360;
			double sesantias = salario*diasTrabajados/360;
			double interesesCesantias = sesantias*0.12;
			double vacaciones = (salario-auxTransporte)*diasTrabajados/720;
			double liquidacion = prima+sesantias+interesesCesantias+vacaciones;
			return liquidacion;
			
		}else {
				double prima = empleado.getSalario()*diasTrabajados/360;
				double sesantias = empleado.getSalario()*diasTrabajados/360;
				double interesesCesantias = sesantias*0.12;
				double vacaciones = empleado.getSalario()*diasTrabajados/720;
				double liquidacion = prima+sesantias+interesesCesantias+vacaciones;
				return liquidacion;
	
			}
		
			
		}

	
	public static double liquidarSegSocial(Empleado empleado, int diasTrabajados) {
		double salud = empleado.getSalario()/30*diasTrabajados*0.085;
		double pension = empleado.getSalario()/30*diasTrabajados*0.12;
		double riesgos_laborales =empleado.getSalario()/30*diasTrabajados*0.00522;
		double resultado = salud+pension+riesgos_laborales;
		return resultado;
	
	}
	
	public static double liquidarNomina(Empleado empleado, int diasTrabajados){
		double nomina;
		if(empleado.getSalario()<= 2*908526) {
			double auxTransporte = 106454;
			double salario = (empleado.getSalario()+ auxTransporte)/30*diasTrabajados;
			double salud = empleado.getSalario()*0.04/30*diasTrabajados;
			double pension = empleado.getSalario()*0.04/30*diasTrabajados;			
			nomina = salario - salud -pension;
			
		}
		else {
			
			double salud = empleado.getSalario()*0.04/30*diasTrabajados;
			double pension = empleado.getSalario()*0.04/30*diasTrabajados;
			double salario = empleado.getSalario()/30*diasTrabajados;
			nomina = salario - salud - pension;
			
		}
		return nomina;
	}

	public static double liquidarParafiscales(Empleado empleado, int diasTrabajados) {
		double aporteCaja = empleado.getSalario()*0.04/30*diasTrabajados;
		double aporteIcbf = empleado.getSalario()*0.03/30*diasTrabajados;
		double aporteSena = empleado.getSalario()*0.02/30*diasTrabajados;
		double Parafiscales = aporteCaja+aporteIcbf+aporteSena;
		return Parafiscales;
		
	}
}
