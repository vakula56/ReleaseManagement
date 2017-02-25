package org.RDMS.springbootstarter.releaseDataseSystem;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RDBController {
	@Autowired
	private RDSService rdsService;

	@RequestMapping("/RDB")
	public List<RDSModel> geAllData() {
		return rdsService.geAllData();
	}
	
	

}
