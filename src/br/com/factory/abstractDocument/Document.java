package br.com.factory.abstractDocument;

public abstract class Document {

	public abstract void open();
	public abstract void close();
	public abstract void newDoc();
	public abstract void save();
	public abstract void revert();
}
