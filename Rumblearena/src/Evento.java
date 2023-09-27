
public class Evento {
    private int idevento;
    private String nombre;
    private String tipo;
    private String descripcion;
    private String recompensa;
    private boolean completado;

    public Evento(int idevento, String nombre, String tipo, String descripcion, String recompensa, boolean completado) {
        this.idevento = idevento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.recompensa = recompensa;
        this.completado = completado;
    }

	public int getIdevento() {
		return idevento;
	}

	public void setIdevento(int idevento) {
		this.idevento = idevento;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRecompensa() {
		return recompensa;
	}

	public void setRecompensa(String recompensa) {
		this.recompensa = recompensa;
	}

	public boolean isCompletado() {
		return completado;
	}

	public void setCompletado(boolean completado) {
		this.completado = completado;
	}

	@Override
	public String toString() {
		return "Evento [idevento=" + idevento + ", nombre=" + nombre + ", tipo=" + tipo + ", descripcion=" + descripcion
				+ ", recompensa=" + recompensa + ", completado=" + completado + "]";
	}

   
}
