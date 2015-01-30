package org.subins.webmvc.controller;

import org.junit.Before;
import org.junit.Test;
import org.subins.webmvc.controller.TillController;

public class TillControllerTest {
	
	private TillController underTest;
	private String testData;

	@Test
	public void testUploadData() {
        Boolean response = underTest.uploadData(testData);
	    assert response;
    }
	
	@Before
	public void setup() {
		underTest = new TillController();
	}

}
