package com.java.resolved;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class ReadInputStreamToStringTest {

	@SuppressWarnings("deprecation")
	@Test
	public void shouldReadInputStreamValueToString() throws Exception {
		InputStream inputStream = new FileInputStream(new File("my_file.txt"));
		StringWriter writer = new StringWriter();
		IOUtils.copy(inputStream, writer);

		assertEquals("My file transformed to an InputStream and then to a String", writer.toString());
	}

	@Test
	public void shouldReadInputStreamValueToStringUsingEncoding() throws Exception {
		InputStream inputStream = new FileInputStream(new File("my_file.txt"));
		StringWriter writer = new StringWriter();
		IOUtils.copy(inputStream, writer, "UTF-8");

		assertEquals("My file transformed to an InputStream and then to a String", writer.toString());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldReadInputStreamValueToStringUsingToStringMethod() throws Exception {
		InputStream inputStream = new FileInputStream(new File("my_file.txt"));
		String value = IOUtils.toString(inputStream);

		assertEquals("My file transformed to an InputStream and then to a String", value.toString());
	}

}
