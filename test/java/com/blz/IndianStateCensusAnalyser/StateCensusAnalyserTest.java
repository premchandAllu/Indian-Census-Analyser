package com.blz.IndianStateCensusAnalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StateCensusAnalyserTest {
	private static String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\premc\\eclipse-workspace\\IndianStateCensusAnalyser\\src\\test\\resources\\IndianStateCensusData.csv";
	private static String WRONG_CSV_FILE_PATH = "C:\\Users\\premc\\eclipse-workspace\\IndianStateCensusAnalyser\\IndianStateCensusData.csv";

	@Test
	public void givenIndianCensusCSVFile_ShouldReturnCorrectNumberOfRecordTest() {
		try {
			StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
			int numOfRecords = censusAnalyser.readCensusData(INDIA_CENSUS_CSV_FILE_PATH);
			Assert.assertEquals(29, numOfRecords);
		} catch (CensusAnalyserException e) {
		}
	}

	@Test
	public void givenWrongIndianCensusCSVFile_ShouldReturnCustomExceptionTest() {
		try {
			StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
			// Allow us to verify the Exception thrown
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			censusAnalyser.readCensusData(WRONG_CSV_FILE_PATH);
		} catch (CensusAnalyserException e) {
			Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_EXCEPTION, e.type);
		}

	}
}