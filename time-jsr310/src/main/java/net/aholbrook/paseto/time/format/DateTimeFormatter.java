package net.aholbrook.paseto.time.format;

import net.aholbrook.paseto.time.OffsetDateTime;

public class DateTimeFormatter {
	private final java.time.format.DateTimeFormatter dateTimeFormatter;

	private DateTimeFormatter(java.time.format.DateTimeFormatter dateTimeFormatter) {
		this.dateTimeFormatter = dateTimeFormatter;
	}

	public static DateTimeFormatter ofPattern(String s) {
		return new DateTimeFormatter(java.time.format.DateTimeFormatter.ofPattern(s));
	}

	public java.time.format.DateTimeFormatter raw() {
		return dateTimeFormatter;
	}


	public OffsetDateTime parse(CharSequence charSequence) {
		return new OffsetDateTime(dateTimeFormatter.parse(charSequence, java.time.OffsetDateTime::from));
	}

	public String format(OffsetDateTime value) {
		return dateTimeFormatter.format(value.raw());
	}
}
