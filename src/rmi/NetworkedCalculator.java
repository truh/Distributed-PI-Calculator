/*
  Copyright 2013: Ari Ayvazyan & Jakob Klepp

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */
package rmi;

import java.util.List;
import java.net.URI;
import java.math.BigDecimal;

public class NetworkedCalculator implements Calculator {

	private List servers;

	public void addServer(URI uri) {

	}


	/**
	 * @see rmi.Calculator#pi(int)
	 */
	public BigDecimal pi(int anzahlNachkommastellen) {
		return null;
	}

}
