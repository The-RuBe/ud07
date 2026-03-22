package ejercicios07.avanzados;

import java.util.List;

import ejercicios07.dataset.Dataset;
import ejercicios07.dataset.Empleado;

public class Main {

	public static void main(String[] args) {
		
	}
	
	// Contar cuántos departamentos distintos existen en la empresa basándose en la lista de empleados.
	public static long ejercicio25() {
		return Dataset.getEmpleados().stream()
				.map(e -> e.getDepartamento())
				.distinct()
				.count();
	}

	// Obtener una lista con los 3 empleados que tienen el salario más alto. (Pista: Ordena y limita).
	public static List<Empleado> ejercicio26() {
		return Dataset.getEmpleados().stream()
				.sorted((e1,e2) -> Double.compare(e2.getSalario(), e1.getSalario()))
				.limit(3)
				.toList();
	}
	
	// Obtener los nombres de los 2 productos más baratos, pero ignora el primer producto más
	// barato absoluto de toda la tienda. (Pista: Ordena, salta y limita).
	public static List<String> ejercicio27() {
		return Dataset.getProductos().stream()
				.sorted((p1,p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()))
				.skip(1)
				.limit(2)
				.map(p -> p.getNombre())
				.toList();
	}
	
	// Obtener una lista con los nombres únicos de los clientes que tienen al menos un pedido en
	// estado "PENDIENTE", ordenados alfabéticamente.

	public static List<String> ejercicio28() {
		return Dataset.getPedidos().stream()
				.filter(p -> p.getEstado().equals("PENDIENTE"))
				.map(p -> p.getCliente())
				.distinct()
				.sorted((p1,p2) -> p1.compareTo(p2))
				.toList();
	}
	
	// Obtener una lista que contenga únicamente el nombre del producto más caro que empieza por
	// la letra "A".
	public static List<String> ejercicio29() {
		return Dataset.getProductos().stream()
				.filter(p -> p.getNombre().startsWith("A"))
				.sorted((p1,p2) -> Double.compare(p2.getPrecio(), p1.getPrecio()))
				.limit(1)
				.map(p -> p.getNombre())
				.toList();
	}
	
}