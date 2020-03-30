package entities;

public class LogEntry {
	
	private Integer codigoUnico;

	public LogEntry(Integer codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public Integer getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(Integer codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	@Override
	public String toString() {
		return "LogEntry [codigoUnico=" + codigoUnico + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoUnico == null) ? 0 : codigoUnico.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		if (codigoUnico == null) {
			if (other.codigoUnico != null)
				return false;
		} else if (!codigoUnico.equals(other.codigoUnico))
			return false;
		return true;
	}
	
	
}
