public class Campaña {
    private int id;
    private String nombre;
    private String descripcion;
    private double progreso;

    public Campaña(int id, String nombre, String descripcion, double progreso) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.progreso = progreso;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getProgreso() {
		return progreso;
	}

	public void setProgreso(double progreso) {
		this.progreso = progreso;
	}

	@Override
	public String toString() {
		return "Campaña [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", progreso=" + progreso
				+ "]";
	}

  
}
