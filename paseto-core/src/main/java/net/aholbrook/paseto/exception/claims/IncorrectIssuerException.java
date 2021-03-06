package net.aholbrook.paseto.exception.claims;

import net.aholbrook.paseto.service.Token;
import net.aholbrook.paseto.util.StringUtils;

public class IncorrectIssuerException extends ClaimException {
	private final String expected, issuer;

	public IncorrectIssuerException(String expected, String issuer, String ruleName, Token token) {
		super(message(expected, issuer), ruleName, token);
		this.expected = expected;
		this.issuer = issuer;
	}

	public String getExpected() {
		return expected;
	}

	public String getIssuer() {
		return issuer;
	}

	private static String message(String expected, String issuer) {
		return "Token issued by \"" + StringUtils.ntes(issuer) + "\", required: \"" + expected + '"';
	}
}
