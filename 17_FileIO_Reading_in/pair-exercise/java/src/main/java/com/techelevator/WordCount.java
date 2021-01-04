package com.techelevator;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount
{

	public static void main(String[] args)
	{
		readAliceInWonderlandTextFile();
	}
	
	private static void readAliceInWonderlandTextFile() {
		// TODO Auto-generated method stub
		
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
		
		// process all lines
		//for (int i = 0; i < 10; i++) // for loop not  a good idea because we don't know how many lines there are
		while(scanner.hasNextLine()) // when should we stop looping? when there are no more lines
		{
			String aliceAdventures = scanner.nextLine();
			System.out.println(aliceAdventures);
			
			// split the text line into different parts
			String[] words = aliceAdventures.split(" "); 
			
			// convert the string parts into the correct data type
			String aliceWords = words[0];
			int numberOfWords = Integer.parseInt(words[1]);
			int numberOfSentences = Integer.parseInt(words[2]);
			
			
			
			displayString(aliceAdventures, numberOfWords, numberOfSentences);
			
		}
	} 
	catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		System.out.println("File: " + filePath + " was not found.");
	}
	}

	private static void displayString(String aliceAdventures, int numberOfWords, int numberOfSentences) {
		// TODO Auto-generated method stub
		
	}
}