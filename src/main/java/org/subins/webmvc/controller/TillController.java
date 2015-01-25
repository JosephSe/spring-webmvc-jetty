package org.subins.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class TillController {

	@RequestMapping(value = "/till", method = RequestMethod.POST)
	public Boolean uploadData(@RequestBody String csvContent) {
		return false;
	}
}
