package ejercicios07.basicos;

import java.util.function.Function;

import ejercicios07.dataset.Producto;

public class TransformacionMayus implements Function<Producto, String> {

	@Override
	public String apply(Producto t) {
		return t.getNombre().toUpperCase();
	}

}