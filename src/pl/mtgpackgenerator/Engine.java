package pl.mtgpackgenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Engine {
/**
 * Metoda startujaca program
 * @throws IOException
 */
	public void startNewGenerator() throws IOException {
		System.out.println("Witaj w generatorze paczek Magic the Gathering dodatku Future Sight.");
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//String tmpField = reader.readLine();
		rollNewPack();

	}


/**
 * Metoda uruchamiajaca losowanie kart
 * @throws IOException
 */
	public void rollNewPack() throws FileNotFoundException {
		System.out.println("");
		System.out.println("Nowa paczka: ");
		System.out.println("");
		rollNewCommon();
		rollNewUnCommon();
		rollNewRare();
	}

	/**
	 * Metoda losujaca commony
	 */
	public void rollNewCommon() throws FileNotFoundException {

		Scanner sc = new Scanner(new File("Common.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (sc.hasNextLine()) {
        	String element = sc.nextLine();
        	list.add(element);
        }

        Collections.shuffle(list);
        System.out.println("LISTA COMMONOW:");
        System.out.println("**************");

        for (int i = 0; i <= 10; i++) {
        	System.out.println(list.get(i));
        }
	}

	/**
	 * Metoda losujaca uncommony
	 */
	public void rollNewUnCommon() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Uncommon.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (sc.hasNextLine()) {
        	String element = sc.nextLine();
        	list.add(element);
        }

        Collections.shuffle(list);
        System.out.println("");
        System.out.println("LISTA UNCOMMONOW:");
        System.out.println("**************");

        for (int i = 0; i <= 2; i++) {
        	System.out.println(list.get(i));
        }
	}

	/**
	 * Metoda losujaca rary
	 */
	public void rollNewRare() throws FileNotFoundException {

		Scanner sc = new Scanner(new File("Rare.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (sc.hasNextLine()) {
        	String element = sc.nextLine();
        	list.add(element);
        }

        Collections.shuffle(list);
        System.out.println("");
        System.out.println("LISTA RARE'OW:");
        System.out.println("**************");

        for (int i = 0; i <= 1-1; i++) {
        	System.out.println(list.get(i));
        }
	}
}
