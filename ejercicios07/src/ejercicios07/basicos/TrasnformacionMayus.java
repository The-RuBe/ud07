package ejercicios07.basicos;

import java.util.function.Function;

import ejercicios07.dataset.Producto;

public class TrasnformacionMayus implements Function<Producto, String> {

	@Override
	public String apply(Producto t) {
		return t.getNombre().toUpperCase();
	}

}
