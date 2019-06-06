/*
 * Developed by <Yogesh Chacherkar/>
 * All rights reserved ©ysoft
 * 
 * enjoy programming ;)
 */
/* edited by Yogesh */
/* edit by Poonam*/


package com.ysoft;

import java.util.HashMap;
import java.util.Scanner;

public class StringToMap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		HashMap<String, String> map = new HashMap<String, String>();
		
		//Get sentence as a string
		System.out.print("Enter your string: ");
		str = scan.nextLine();
		
		//Split sentence and store in array
		String[] arrOfStr = str.split(" ", 0);
		
		//Put array values in map by generating keys
		int i=0;
		for (String string : arrOfStr) {
			map.put("string"+i, string);
			i++;
		}
		
		
		//Display result
		for(int j=0;j<i;j++)
			System.out.println("string"+ j +" : " + map.get("string"+j));
	}

}
