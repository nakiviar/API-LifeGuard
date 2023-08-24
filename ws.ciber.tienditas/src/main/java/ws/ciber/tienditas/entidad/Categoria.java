package ws.ciber.tienditas.entidad;

public class Categoria {
	private double mango;
	private int id_categoria;
	private String descripcion;

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria(int id_categoria, String descripcion) {
		this.id_categoria = id_categoria;
		this.descripcion = descripcion;
	}

	public Categoria() {

	}

}
