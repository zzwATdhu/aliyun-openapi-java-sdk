/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBInstanceConnectionStringRequest extends RpcAcsRequest<ModifyDBInstanceConnectionStringResponse> {
	
	public ModifyDBInstanceConnectionStringRequest() {
		super("gpdb", "2016-05-03", "ModifyDBInstanceConnectionString", "gpdb");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String connectionStringPrefix;

	private String port;

	private String dBInstanceId;

	private String currentConnectionString;

	public String getConnectionStringPrefix() {
		return this.connectionStringPrefix;
	}

	public void setConnectionStringPrefix(String connectionStringPrefix) {
		this.connectionStringPrefix = connectionStringPrefix;
		if(connectionStringPrefix != null){
			putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
		}
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getCurrentConnectionString() {
		return this.currentConnectionString;
	}

	public void setCurrentConnectionString(String currentConnectionString) {
		this.currentConnectionString = currentConnectionString;
		if(currentConnectionString != null){
			putQueryParameter("CurrentConnectionString", currentConnectionString);
		}
	}

	@Override
	public Class<ModifyDBInstanceConnectionStringResponse> getResponseClass() {
		return ModifyDBInstanceConnectionStringResponse.class;
	}

}
