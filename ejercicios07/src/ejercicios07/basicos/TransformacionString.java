package ejercicios07.basicos;

import java.util.function.Function;

import ejercicios07.dataset.Empleado;

public class TransformacionString implements Function<Empleado, String> {

	@Override
	public String apply(Empleado t) 
	{ return t.getNombre();	}

}
