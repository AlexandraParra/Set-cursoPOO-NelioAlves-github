package entidades;

import java.util.Date;
import java.util.Objects;

public class Login {
	private String usuario;
	private Date momento;
	
	public Login(String usuario, Date momento) {
		this.usuario = usuario;
		this.momento = momento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(usuario, other.usuario);
	}
}
