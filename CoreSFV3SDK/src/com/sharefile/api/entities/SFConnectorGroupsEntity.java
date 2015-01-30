
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2015 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.sharefile.api.entities;

import com.sharefile.api.entities.*;
import com.sharefile.api.models.*;
import com.sharefile.api.models.internal.*;
import com.sharefile.api.SFApiQuery;
import com.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.enumerations.SFSafeEnumFlags;

public class SFConnectorGroupsEntity extends SFODataEntityBase
{
	public ISFQuery<SFODataFeed<SFConnectorGroup>> get()
	{
		SFApiQuery<SFODataFeed<SFConnectorGroup>> sfApiQuery = new SFApiQuery<SFODataFeed<SFConnectorGroup>>();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get all Connector Groups in the account
	* Retrieves a Connector Group
	* @param serviceid 	
	* @return A single ConnectorGroup object matching the query
    */
	public ISFQuery<SFConnectorGroup> get(URI url)
	{
		SFApiQuery<SFConnectorGroup> sfApiQuery = new SFApiQuery<SFConnectorGroup>();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get the Connector Group by Provider
	* @param provider 	
	* @return A single ConnectorGroup matching the query
    */
	public ISFQuery<SFConnectorGroup> byProvider(String provider)
	{
		SFApiQuery<SFConnectorGroup> sfApiQuery = new SFApiQuery<SFConnectorGroup>();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setAction("ByProvider");
		sfApiQuery.addQueryString("provider", provider);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get the Connector Group by Service ID
	* Retrieves a Connector Group
	* @param id 	
	* @return A single ConnectorGroup object matching the query
    */
	public ISFQuery<SFConnectorGroupZone> getZones(URI url, String id)
	{
		SFApiQuery<SFConnectorGroupZone> sfApiQuery = new SFApiQuery<SFConnectorGroupZone>();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setAction("Zones");
		sfApiQuery.addIds(url);
		sfApiQuery.addActionIds(id);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get an Access Control element
	* Retrieves a Connector Group Access Control of a given user
	* @param parentUrl 	
	* @param id 	
	* @return A single ConnectorGroup ACL object matching the query
    */
	public ISFQuery<SFConnectorGroupAccessControl> getAccessControls(URI parentUrl, String id)
	{
		SFApiQuery<SFConnectorGroupAccessControl> sfApiQuery = new SFApiQuery<SFConnectorGroupAccessControl>();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setAction("AccessControls");
		sfApiQuery.addIds(parentUrl);
		sfApiQuery.addActionIds(id);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Connector Groups in a Zone
	* Retrieves the Connector Groups defined in a Zone.
	* @param zoneid 	
	* @return Access Control List of the given object ID.
    */
	public ISFQuery<SFODataFeed<SFConnectorGroup>> getByZone(String zoneid)
	{
		SFApiQuery<SFODataFeed<SFConnectorGroup>> sfApiQuery = new SFApiQuery<SFODataFeed<SFConnectorGroup>>();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setAction("GetByZone");
		sfApiQuery.addActionIds(zoneid);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create a Connector Group associated with a Zone
    * {
    * "Zones":[
    * "Zone": {"Id":"ZoneId"},
    * "StorageCenter": [ { "Id":"StorageCenterId" }, { ... } ],
    * "ApiVersionMin":"v3",
    * "ApiVersionMax":"v3",
    * "IconUrl":"https://domain/icons",
    * "FormUrl":"https://domain/forms"
    * ],
    * "Id":"ServiceId",
    * "Name":""Name,
    * "Provider":"svc"
    * }
	* Creates a new Connector Group, or adds a Zone to an existing Connector Group if the Group is already associated
	* with another Zone. The caller doesn't have to check if the group exists or not - just call this API passing
	* the Service ID and the associated Zone information.
	* @param id 	
	* @param connectorGroup 	
	* @return the created or modified AccessControl instance
    */
	public ISFQuery<SFConnectorGroup> create(SFConnectorGroup connectorGroup)
	{
		SFApiQuery<SFConnectorGroup> sfApiQuery = new SFApiQuery<SFConnectorGroup>();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setBody(connectorGroup);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Associates a Zone to an existing Connecto Group
    * {
    * "Zone": {"Id":"ZoneId"},
    * "StorageCenter": [ { "Id":"StorageCenterId" }, { ... } ],
    * "ApiVersionMin":"v3",
    * "ApiVersionMax":"v3",
    * "IconUrl":"https://domain/icons",
    * "FormUrl":"https://domain/forms"
    * }
	* Adds a Zone to an existing Connector Group.
	* @param url 	
	* @param connectorGroupZone 	
	* @return the created or modified AccessControl instance
    */
	public ISFQuery<SFConnectorGroupZone> createZones(URI url, SFConnectorGroupZone connectorGroupZone)
	{
		SFApiQuery<SFConnectorGroupZone> sfApiQuery = new SFApiQuery<SFConnectorGroupZone>();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setAction("Zones");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(connectorGroupZone);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Adds a new principal to the Connector Group Access Control List
    * {
    * "Principal": {"Id":"PrincipalId"},
    * "CanCreate":"true",
    * "CanManage":"true"
    * }
	* @param url 	
	* @param connectorGroupAcl 	
	* @return The created access control list object
    */
	public ISFQuery<SFConnectorGroupAccessControl> createAccessControls(URI url, SFConnectorGroupAccessControl connectorGroupAcl)
	{
		SFApiQuery<SFConnectorGroupAccessControl> sfApiQuery = new SFApiQuery<SFConnectorGroupAccessControl>();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setAction("AccessControls");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(connectorGroupAcl);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Modifies the parameters of a Connector Group in associated with a Zone
    * {
    * "Zone": {"Id":"ZoneId"},
    * "ApiVersionMin":"v3",
    * "ApiVersionMax":"v3",
    * "IconUrl":"https://domain/icons",
    * "FormUrl":"https://domain/forms"
    * }
	* @param url 	
	* @param zoneId 	
	* @param connectorGroupZone 	
	* @return the created or modified AccessControl instance
    */
	public ISFQuery<SFConnectorGroupZone> updateZones(URI url, String zoneId, SFConnectorGroupZone connectorGroupZone)
	{
		SFApiQuery<SFConnectorGroupZone> sfApiQuery = new SFApiQuery<SFConnectorGroupZone>();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setAction("Zones");
		sfApiQuery.addIds(url);
		sfApiQuery.addActionIds(zoneId);
		sfApiQuery.setBody(connectorGroupZone);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Removes a Connector Group
	* Removes a Connector Group and all associations from Zones
	* @param url 	
    */
	public ISFQuery delete(URI url)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Removes a Connector Group association with a Zone
	* Removes a Connector Group association with a Zone. Connector Groups are automatically removed
	* once the groups is removed from all the Zones.
	* @param serviceUrl 	
	* @param zoneid 	
    */
	public ISFQuery deleteZones(URI serviceUrl, String zoneid)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setAction("Zones");
		sfApiQuery.addIds(serviceUrl);
		sfApiQuery.addActionIds(zoneid);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Removes a Connector Group Access Control object
	* Removes an Access Control object from the Connector Group ACL. This removes the permissions of
	* the affected principal to use the Connector Group.
	* @param serviceUrl 	
	* @param zoneid 	
    */
	public ISFQuery deleteAccessControls(URI serviceUrl, String zoneid)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setAction("AccessControls");
		sfApiQuery.addIds(serviceUrl);
		sfApiQuery.addActionIds(zoneid);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Retrieve the list of Storage Centers associated with a Connector Group
	* Retrieve the list of storage centers associated with a Connector Group.
	* @param url 	
	* @param zoneid 	
	* @return The modified Connector Group
    */
	public ISFQuery<SFODataFeed<SFStorageCenter>> getStorageCenters(URI url, String zoneid)
	{
		SFApiQuery<SFODataFeed<SFStorageCenter>> sfApiQuery = new SFApiQuery<SFODataFeed<SFStorageCenter>>();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setAction("Zones");
		sfApiQuery.addIds(url);
		sfApiQuery.addActionIds(zoneid);
		sfApiQuery.addSubAction("StorageCenters");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Adds a Connector Group to a Storage Center
    * {
    * "Id":"storageCenterId"
    * }
	* Associate a Connector Group with a Storage Center. The Connector Group has to be
	* associated with the Storage Center Zone.
	* @param url 	
	* @param zoneid 	
	* @return The modified Connector Group
    */
	public ISFQuery<SFODataFeed<SFStorageCenter>> createStorageCenters(URI url, String zoneid, SFStorageCenter storageCenter)
	{
		SFApiQuery<SFODataFeed<SFStorageCenter>> sfApiQuery = new SFApiQuery<SFODataFeed<SFStorageCenter>>();
		sfApiQuery.setFrom("ConnectorGroups");
		sfApiQuery.setAction("Zones");
		sfApiQuery.addIds(url);
		sfApiQuery.addActionIds(zoneid);
		sfApiQuery.addSubAction("StorageCenters");
		sfApiQuery.setBody(storageCenter);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

}

