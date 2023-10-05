package br.com.factory.application;

import br.com.factory.abstractDocument.Document;
import br.com.factory.office.Excel;

public class ExcelApplication extends Application{

	@Override
	public Document createDocument() {
		return new Excel();
	}

	@Override
	public Document saveDocument() {
		return new Excel();
	}

	@Override
	public Document openDocument() {
		return new Excel();
	}

	@Override
	public Document closeDocument() {
		return new Excel();
	}

	@Override
	public Document revertDocument() {
		return new Excel();
	}

}
