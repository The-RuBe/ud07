package ejercicios07.basicos;

import java.util.function.Predicate;

import ejercicios07.dataset.Empleado;

public class FiltroIT implements Predicate<Empleado> {

	@Override
	public boolean test(Empleado t) {
		return t.getDepartamento().equals("IT");
	}

}
