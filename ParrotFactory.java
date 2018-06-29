package com.singtel.assignment;

public class ParrotFactory {
	public static Parrot getParrotLivingWith(String livingWith) {
		if("dogs".equals(livingWith)) {
			return new ParrotWithDogs();
		} else if("cats".equals(livingWith)) {
			return new ParrotWithCats();
		} else if("roosters".equals(livingWith)) {
			return new ParrotWithRoosters();
		}
		return null;
	}
}
