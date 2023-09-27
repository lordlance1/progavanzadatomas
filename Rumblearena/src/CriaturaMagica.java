public class CriaturaMagica {
    private int idCriatura;
    private int nivel;
    private String nombre;
    private String habilidades;

    public CriaturaMagica(int idCriatura, int nivel, String nombre, String habilidades) {
        this.idCriatura = idCriatura;
        this.nivel = nivel;
        this.nombre = nombre;
        this.habilidades = habilidades;
    }

	public int getIdCriatura() {
		return idCriatura;
	}

	public void setIdCriatura(int idCriatura) {
		this.idCriatura = idCriatura;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	@Override
	public String toString() {
		return "CriaturaMagica [idCriatura=" + idCriatura + ", nivel=" + nivel + ", nombre=" + nombre + ", habilidades="
				+ habilidades + "]";
	}

    
}
