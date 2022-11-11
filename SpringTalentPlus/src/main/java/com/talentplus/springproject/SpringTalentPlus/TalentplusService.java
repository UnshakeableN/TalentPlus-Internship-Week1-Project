package com.talentplus.springproject.SpringTalentPlus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class TalentplusService {
	@RequestMapping("/")
	public String index() {
	      return ("TALENT PLUS");

	}

}
