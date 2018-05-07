//You live in the city of Cartesia where all roads are laid out in a perfect grid. 
//You arrived ten minutes too early to an appointment, so you decided to take the
//opportunity to go for a short walk. The city provides its citizens with a Walk 
//Generating App on their phones -- everytime you press the button it sends you an
//array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']).
//You always walk only a single block in a direction and you know it takes you one minute
//to traverse one city block, so create a function that will return true if the walk the
//		app gives you will take you exactly ten minutes (you don't want to be early or late!)
//				and will, of course, return you to your starting point. Return false otherwise.


package com.maria.rajeev;

import java.util.ArrayList;
import java.util.List;

public class TenMinWalk {
	public static void main(String[] args) {
		char[] walk = {'n','n','n','s','n','s','n','s','n','s'};
		System.out.println(isValid(walk));
	}

	public static boolean isValid(char[] walk) {
		int count = 0;
		if (walk.length==10) {
			for (int i = 0; i < walk.length; i++) {
				for (int j = i + 1; i < walk.length; i++) {

					if (walk[i] != walk[j]) {
						count++;}
				}
			}
			if(count/5!=1)
				count=-1;
		}
		else count=-1;

		if (count != -1)
			return true;
		else
			return false;

	}
}