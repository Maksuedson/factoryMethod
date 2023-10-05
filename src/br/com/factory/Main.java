package br.com.factory;

import br.com.factory.application.Application;
import br.com.factory.application.WordApplication;

public class Main {

	public static void main(String[] args) {

		Application app = new WordApplication();
		app.open();
		app.revert();
		app.save();
		app.newDocument();
		app.revert();
	}

}
