package com.config.helper;

import java.io.IOException;

public class fileReaderManager {

	private fileReaderManager() {

	}

	public static fileReaderManager getinstanceFRM() {
		fileReaderManager frm = new fileReaderManager();
		return frm;
	}

	public configrationReader getInstanceCR() throws IOException {
		configrationReader cr = new configrationReader();
		return cr;
	}
}
