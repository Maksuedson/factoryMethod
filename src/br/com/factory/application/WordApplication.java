package br.com.factory.application;

import br.com.factory.abstractDocument.Document;
import br.com.factory.office.Word;

public class WordApplication extends Application{
	

	@Override
	public Document createDocument() {
		return new Word();
	}

	@Override
	public Document saveDocument() {
		return new Word();
	}

	@Override
	public Document openDocument() {
		return new Word();
	}

	@Override
	public Document closeDocument() {
		return new Word();
	}

	@Override
	public Document revertDocument() {
		return new Word();
	}

}
