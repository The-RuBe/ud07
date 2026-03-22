package ejercicios07.basicos;

import java.util.Comparator;

import ejercicios07.dataset.Empleado;

public class ComparaEmpleados implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return Double.compare(o2.getSalario(), o1.getSalario());
	}

}