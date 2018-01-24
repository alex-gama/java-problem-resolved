package com.java.resolved;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class ConvertStringDateToLocalDateTest {

	@Test
	public void shouldConvertAStringDateToLocalDate() throws Exception {
		String stringDate = "2018-02-25";

		LocalDate date = LocalDate.parse(stringDate);

		assertTrue(date.equals(LocalDate.of(2018, 02, 25)));
	}

	@Test
	public void shouldConvertAStringDateToLocalDateUsingPattern() throws Exception {
	    String stringDate = "25-02-2018";

	    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(stringDate, pattern);

		assertTrue(date.equals(LocalDate.of(2018, 02, 25)));
	}

}
