package net.aholbrook.paseto.time;

public class Duration {
	private final java.time.Duration duration;

	private Duration(java.time.Duration duration) {
		this.duration = duration;
	}

	java.time.Duration raw() {
		return duration;
	}

	public static Duration ofSeconds(long l) {
		return new Duration(java.time.Duration.ofSeconds(l));
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Duration that = (Duration) o;
		return duration.equals(that.duration);
	}

	@Override
	public int hashCode() {
		return duration.hashCode();
	}

	@Override
	public String toString() {
		return duration.toString();
	}
}
