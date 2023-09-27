public class Objeto {
    private int id;
    private String descripcion;
    private String nombre;
    private String tipo;

    public Objeto(int id, String descripcion, String nombre, String tipo) {
        this.id = id;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.tipo = tipo;
    }

	@Override
	public String toString() {
		return "Objeto [id=" + id + ", descripcion=" + descripcion + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

 
}
