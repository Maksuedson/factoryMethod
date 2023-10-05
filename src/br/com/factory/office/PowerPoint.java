package br.com.factory.office;

import br.com.factory.abstractDocument.Document;

public class PowerPoint extends Document{

	@Override
	public void open() {
		System.out.println("Open a PowerPoint document!");
	}

	@Override
	public void close() {
		System.out.println("Close a PowerPoint document!");
	}

	@Override
	public void save() {
		System.out.println("Save a PowerPoint document!");
	}

	@Override
	public void revert() {
		System.out.println("Revert a PowerPoint document!");
	}
	
	@Override
	public void newDoc() {
		System.out.println("New PowerPoint document!");
	}	

}
