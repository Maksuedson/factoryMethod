package br.com.factory.office;

import br.com.factory.abstractDocument.Document;

public class Word extends Document{

	@Override
	public void open() {
		System.out.println("Open a Word document!");
	}

	@Override
	public void close() {
		System.out.println("Close a Word document!");
	}

	@Override
	public void save() {
		System.out.println("Save a Word document!");
	}

	@Override
	public void revert() {
		System.out.println("Revert a Word document!");
	}
	
	@Override
	public void newDoc() {
		System.out.println("New Word document!");
	}	

}
