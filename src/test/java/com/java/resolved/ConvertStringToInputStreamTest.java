package com.java.resolved;

import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class ConvertStringToInputStreamTest {

	@Test
	public void shouldConvertStringToInputStream() throws Exception {
		String text = "My awesome text";

		InputStream inputStream = new ByteArrayInputStream(text.getBytes());

		assertNotNull(inputStream);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void shouldConvertStringToInputStreamUsingApacheCommons() throws Exception {
		String text = "My awesome text";

		InputStream inputStream = IOUtils.toInputStream(text);

		assertNotNull(inputStream);
	}

	@Test
	public void shouldConvertStringToInputStreamUsingApacheCommonsWithEncoding() throws Exception {
		String text = "My awesome text";

		InputStream inputStream = IOUtils.toInputStream(text, "UTF-8");

		assertNotNull(inputStream);
	}

}
