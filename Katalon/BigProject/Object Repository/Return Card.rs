<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Return Card</name>
   <tag></tag>
   <elementGuidId>fdb6af91-958f-40ee-b001-53f028ae28e8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;selector\&quot;: {\n        \&quot;boardId\&quot;: \&quot;${board}\&quot;\n    },\n    \&quot;data\&quot;: {\n        \&quot;draggableId\&quot;: \&quot;${cardId}\&quot;,\n        \&quot;source\&quot;: {\n            \&quot;droppableId\&quot;: \&quot;${listTo}\&quot;\n        },\n        \&quot;destination\&quot;: {\n            \&quot;droppableId\&quot;: \&quot;${listFrom}\&quot;,\n            \&quot;index\&quot;: 0\n        }\n    }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${token}</value>
   </httpHeaderProperties>
   <katalonVersion>8.1.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>https://${url}/api/v1/cards/position</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.url</defaultValue>
      <description></description>
      <id>8565e1f9-8e50-4944-b736-e65c674b0d0d</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.token</defaultValue>
      <description></description>
      <id>90b63776-de25-4bcc-8209-d0b3f01ba3f1</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.board</defaultValue>
      <description></description>
      <id>7e6b1ef0-171a-4fe3-87f1-9d7e5e57c3ee</id>
      <masked>false</masked>
      <name>board</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>89d7dd0d-e61d-4309-9fea-a55d2908a5e7</id>
      <masked>false</masked>
      <name>cardId</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.listFrom</defaultValue>
      <description></description>
      <id>0efd53f5-2057-4ae5-a56f-2c75c1c40e14</id>
      <masked>false</masked>
      <name>listFrom</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.listTo</defaultValue>
      <description></description>
      <id>1fbc7d1c-0feb-47d1-94e7-a87f3057ebdf</id>
      <masked>false</masked>
      <name>listTo</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
