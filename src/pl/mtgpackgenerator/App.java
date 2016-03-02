package pl.mtgpackgenerator;

import java.io.IOException;

/**
 *
 * @author Tomek Ciborowski
 * @version 0.1
 *
 */
public class App {

	public static void main(String[] args) throws IOException {
		Engine engine = new Engine();
		engine.startNewGenerator();
	}

}
