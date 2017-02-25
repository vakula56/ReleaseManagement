/**Making changes in feature branch**/
package org.RDMS.springbootstarter.releaseDataseSystem;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RDSService {
	public List<RDSModel> geAllData() {
		return Arrays.asList(new RDSModel(1.1, "app1"), new RDSModel(1.1, "app2"), new RDSModel(1.1, "app3")

		);
	}
	

}
