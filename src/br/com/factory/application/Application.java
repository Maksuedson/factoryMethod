package br.com.factory.application;

import br.com.factory.abstractDocument.Document;

public abstract class Application {
	
	protected abstract Document createDocument();
	protected abstract Document saveDocument();
	protected abstract Document openDocument();
	protected abstract Document closeDocument();
	protected abstract Document revertDocument();
	

	public void newDocument() {
		Document doc = createDocument();
		doc.newDoc();
	}
	
	public void save() {
		Document doc = saveDocument();
		doc.save();
	}
	
	public void open() {
		Document doc = openDocument();
		doc.open();
	}
	
	public void close() {
		Document doc = closeDocument();
		doc.close();
	}	
	
	public void revert() {
		Document doc = revertDocument();
		doc.revert();
	}	
}
