package br.com.factory.application;

import br.com.factory.abstractDocument.Document;
import br.com.factory.office.PowerPoint;

public class PowerPointApplication extends Application{

	@Override
	public Document createDocument() {
		return new PowerPoint();
	}

	@Override
	public Document saveDocument() {
		return new PowerPoint();
	}

	@Override
	public Document openDocument() {
		return new PowerPoint();
	}

	@Override
	public Document closeDocument() {
		return new PowerPoint();
	}

	@Override
	public Document revertDocument() {
		return new PowerPoint();
	}

}
