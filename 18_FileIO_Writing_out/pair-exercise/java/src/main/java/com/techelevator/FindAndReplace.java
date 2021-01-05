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
		
		
		// logic 
		
		
		
		//if(aliceText.exists())
		//{
			//aliceText.();
			
			//System.out.println("Replacing " );
		//}
		
		try
		{
			
			
			System.out.print("Enter word to search for: ");
			String enteredWord = userInput.nextLine();
			
			System.out.println("Enter replacement word: ");
			String replacementWord = userInput.nextLine();
			
			
			FileOutputStream fileStream = new FileOutputStream(aliceText, true);
			PrintStream fileWriter = new PrintStream(fileStream);
			
			fileWriter.println(replacementWord);
			fileWriter.close();

			Scanner scanner = new Scanner(aliceText.getAbsoluteFile());
			
			while (scanner.hasNextLine())
			{
				String newTextLine = scanner.nextLine();
				fileWriter.println(newTextLine.replaceAll(enteredWord, replacementWord));
				
			}
			
			
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
