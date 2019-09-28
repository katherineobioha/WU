package com.kobioha.tests;

/**
 *    Bash Script Class
 */
import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Bash_Test {
	
	

	@Test
	public void runbashfile() throws IOException
	{
		//String bashFile = new PropertyFile();
		System.out.println(new File("myScript.sh").getAbsolutePath());
		try{
			final ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", "-c", "/Users/kathe/workspace/com.kobioha.wheelsup/myScript.sh");
			processBuilder.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.assertFalse(true);
		}
	}
	
	@Test
	public void validateexistingfiles()
	{
		final ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", "-c", "/Users/kathe/workspace/com.kobioha.wheelsup/validatefiles.sh");
		processBuilder.redirectOutput(Redirect.INHERIT);
		try{
		Process p = processBuilder.start();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.assertFalse(true);
		}
	}
}
