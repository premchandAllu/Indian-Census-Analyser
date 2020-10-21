package com.blz.IndianStateCensusAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {
	private static String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\premc\\eclipse-workspace\\IndianStateCensusAnalyser\\src\\test\\resources\\IndianStateCensusData.csv";

	@Test
	public void givenIndianCensusCSVFile_ShouldReturnCorrectNumberOfRecordTest() {
		try {
			StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
			int numOfRecords = censusAnalyser.readCensusData(INDIA_CENSUS_CSV_FILE_PATH);
			Assert.assertEquals(29, numOfRecords);
		} catch (CensusAnalyserException e) {
		}
	}
}