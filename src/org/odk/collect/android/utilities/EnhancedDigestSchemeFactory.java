/*
 * Copyright (C) 2011 University of Washington
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.odk.collect.android.utilities;

import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.params.HttpParams;

/**
 * Boilerplate needed to update to version 4.1.2 of the DigestScheme class
 * (copied and renamed to EnhancedDigestScheme).
 * 
 * @author mitchellsundt@gmail.com
 *
 */
public class EnhancedDigestSchemeFactory implements AuthSchemeFactory {

	@Override
	public AuthScheme newInstance(HttpParams params) {
		return new EnhancedDigestScheme();
	}
	
}