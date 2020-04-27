package javabasics;

public class Spacesremoving {
	
	//trim()
	//strip()
	//stripLeading()
	//stripTrailing()
	//replaceAll()

	public static void main(String[] args) {
		String name = "    Rachit Saurabh       ";
        System.out.println(name.replaceAll("\\s+", " ").trim());
	}
}
