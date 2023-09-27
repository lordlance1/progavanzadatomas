
public class Jugador {
    private int idNombreUsuario;
    private int nivel;
    private String equipamiento;
    private String habilidades;
    private String avatar;

    public Jugador(int idNombreUsuario, int nivel, String equipamiento, String habilidades, String avatar) {
        this.idNombreUsuario = idNombreUsuario;
        this.nivel = nivel;
        this.equipamiento = equipamiento;
        this.habilidades = habilidades;
        this.avatar = avatar;
    }

	public int getIdNombreUsuario() {
		return idNombreUsuario;
	}

	public void setIdNombreUsuario(int idNombreUsuario) {
		this.idNombreUsuario = idNombreUsuario;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getEquipamiento() {
		return equipamiento;
	}

	public void setEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "Jugador [idNombreUsuario=" + idNombreUsuario + ", nivel=" + nivel + ", equipamiento=" + equipamiento
				+ ", habilidades=" + habilidades + ", avatar=" + avatar + "]";
	}

  
}
