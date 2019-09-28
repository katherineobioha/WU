package com.kobioha.tests;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import org.testng.annotations.Test;

public class Scenario1 {
	
	

	@Test
	public void runbashfile() throws IOException
	{
		try{
			final ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", "-c", "/myScript.sh");
			processBuilder.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void validateexistingfiles()
	{
		final ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", "-c", "/validatefiles.sh");
		processBuilder.redirectOutput(Redirect.INHERIT);
		try{
		Process p = processBuilder.start();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
