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

package com.aliyuncs.gpdb;

import java.util.HashMap;

public class Endpoint {
    public static HashMap<String, String> endpointMap = new HashMap<String, String>() {
        {
            endpointMap.put("cn-shenzhen", "gpdb.aliyuncs.com");
            endpointMap.put("cn-qingdao", "gpdb.aliyuncs.com");
            endpointMap.put("cn-beijing", "gpdb.aliyuncs.com");
            endpointMap.put("cn-shanghai", "gpdb.aliyuncs.com");
            endpointMap.put("cn-hongkong", "gpdb.aliyuncs.com");
            endpointMap.put("ap-southeast-1", "gpdb.aliyuncs.com");
            endpointMap.put("us-east-1", "gpdb.aliyuncs.com");
            endpointMap.put("us-west-1", "gpdb.aliyuncs.com");
            endpointMap.put("cn-hangzhou", "gpdb.aliyuncs.com");
        }
    };

    public static String endpointRegionalType = "regional";
}
