package guru.springframework;

import java.util.Objects;

public class Pair {
	private final String from;
	private final String to;
	
	public Pair(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}

	@Override
	public int hashCode() {
		return Objects.hash(from, to);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		return Objects.equals(from, other.from) && Objects.equals(to, other.to);
	}
	
	
	
	

}
