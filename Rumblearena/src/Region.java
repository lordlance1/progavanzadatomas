public class Region {
    private int idRegion;
    private String nombre;
    private int nivelRequerido;
    private String descripcion;

    public Region(int idRegion, String nombre, int nivelRequerido, String descripcion) {
        this.idRegion = idRegion;
        this.nombre = nombre;
        this.nivelRequerido = nivelRequerido;
        this.descripcion = descripcion;
    }

	public int getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivelRequerido() {
		return nivelRequerido;
	}

	public void setNivelRequerido(int nivelRequerido) {
		this.nivelRequerido = nivelRequerido;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Region [idRegion=" + idRegion + ", nombre=" + nombre + ", nivelRequerido=" + nivelRequerido
				+ ", descripcion=" + descripcion + "]";
	}

}
