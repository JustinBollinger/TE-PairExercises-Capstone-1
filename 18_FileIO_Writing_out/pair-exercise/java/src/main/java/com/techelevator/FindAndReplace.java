package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import javax.print.event.PrintServiceAttributeEvent;

public class FindAndReplace
{

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner (System.in);
		System.out.print("Enter file name: ");
		String path = userInput.nextLine();
		
		File aliceText = new File(path);
		
		System.out.println(aliceText);
		System.out.println(aliceText.getAbsolutePath());
		
		// logic 
		
		
		
		if(aliceText.exists())
		{
			aliceText.delete();
			System.out.println("deleting file");
		}
		
		try
		{
			System.out.print("Enter word to search for: ");
			String enteredWord = userInput.nextLine();
			
			System.out.println("Enter replacement word: ");
			String replacementWord = userInput.nextLine();
			
			
			FileOutputStream fileStream = new FileOutputStream(aliceText, true);
			PrintStream fileWriter = new PrintStream(fileStream);
			
			fileWriter.println(enteredWord);
			fileWriter.close();

			
			
			
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
