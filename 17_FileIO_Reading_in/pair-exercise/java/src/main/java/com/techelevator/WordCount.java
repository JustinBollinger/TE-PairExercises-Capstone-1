package com.techelevator;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class WordCount
{

	public static void main(String[] args)
	{
		readAlicesAdventuresInWonderlandFile();
	}
	
	
	public static void readAlicesAdventuresInWonderlandFile()
	{
		String filePath = "alices_adventures_in_wonderland.txt";
		File alicesAdventuresFile = new File(filePath);
	

	Scanner scanner;
	try
	{
		// this is the manual way to create the file stream
//		FileInputStream in = new FileInputStream(zipCodeFile);
//		InputStreamReader reader = new InputStreamReader(in);
//		scanner = new Scanner(reader);
		
		scanner = new Scanner(alicesAdventuresFile.getAbsoluteFile());
		int counter = 0;
		int counterSentence = 0;
		// process all lines
		//for (int i = 0; i < 10; i++) // for loop not  a good idea because we don't know how many lines there are
		while(scanner.hasNextLine()) // when should we stop looping? when there are no more lines
		{
			
			String aliceAdventures = scanner.nextLine();
			//System.out.println(aliceAdventures);
			
			// split the text line into different parts
			String[] words = aliceAdventures.split(" "); 
			counter += words.length -1;
			
			
			String[] sentences = aliceAdventures.split("\\.");
			counterSentence += sentences.length-1;
			
			String[] sentences1 = aliceAdventures.split("\\?");
			counterSentence += sentences1.length-1;
			
			String[] sentences2 = aliceAdventures.split("!");
			counterSentence += sentences2.length-1;
			// convert the string parts into the correct data type
			
			
			
		}
		
		displayString(counter, counterSentence);
	} 
	catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		System.out.println("File: " + filePath + " was not found.");
	}
	}

	private static void displayString(int numberOfWords, int numberOfSentences) 
	{
		System.out.println("Word Count: " + numberOfWords);
		System.out.println("Sentence Count: " + numberOfSentences);
	}
}