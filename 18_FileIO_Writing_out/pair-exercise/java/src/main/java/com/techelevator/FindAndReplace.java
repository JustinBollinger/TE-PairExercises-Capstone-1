package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
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
		
		//String filePath = "alices_adventures_in_wonderland.txt";
		File alicesAdventuresFile = new File("test.txt");

		Scanner scanner;
		// logic 
		
		
		
		//if(aliceText.exists())
		//{
			//aliceText.();
			
			//System.out.println("Replacing " );
		//}
		
		try (FileWriter fileStream = new FileWriter(alicesAdventuresFile);
			PrintWriter fileWriter = new PrintWriter(fileStream);
			)
		{
			
			
			System.out.print("Enter word to search for: ");
			String enteredWord = userInput.nextLine();
			
			System.out.println("Enter replacement word: ");
			String replacementWord = userInput.nextLine();
			
			
			
			fileWriter.println(replacementWord);
			fileWriter.close();

			Scanner lineScanner = new Scanner(aliceText.getAbsoluteFile());
			
			while (lineScanner.hasNextLine())
			{
				String newTextLine = lineScanner.nextLine();
				fileWriter.println(newTextLine.replaceAll(enteredWord, replacementWord));
				
			}
			lineScanner.close();
			
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
