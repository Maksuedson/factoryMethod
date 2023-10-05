package br.com.factory.office;

import br.com.factory.abstractDocument.Document;

public class Excel extends Document{

	@Override
	public void open() {
		System.out.println("Open a Excel document!");
	}

	@Override
	public void close() {
		System.out.println("Close a Excel document!");
	}

	@Override
	public void save() {
		System.out.println("Save a Excel document!");
	}

	@Override
	public void revert() {
		System.out.println("Revert a Excel document!");
	}

	@Override
	public void newDoc() {
		System.out.println("New Excel document!");
	}

}
