package com.blz.IndianStateCensusAnalyser;

public class CensusAnalyserException extends Exception {

	private static final long serialVersionUID = 1L;

	public CensusAnalyserException(String message, String name) {
		super(message);
		this.type = ExceptionType.valueOf(name);
	}

	enum ExceptionType {
		CENSUS_FILE_PROBLEM, CENSUS_FILE_EXCEPTION
	}

	ExceptionType type;

	public CensusAnalyserException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}

	public CensusAnalyserException(String message, ExceptionType type, Throwable cause) {
		super(message, cause);
		this.type = type;
	}
}
