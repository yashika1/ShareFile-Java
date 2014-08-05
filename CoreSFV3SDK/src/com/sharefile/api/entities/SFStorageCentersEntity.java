
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2014 Citrix ShareFile. All rights reserved.
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

public class SFStorageCentersEntity extends SFODataEntityBase
{
    /**
	* Get Storage Center
	* @param url 	
	* @return A single Storage Center
    */
	public ISFQuery<SFStorageCenter> get(URI url)
	{
		SFApiQuery<SFStorageCenter> sfApiQuery = new SFApiQuery<SFStorageCenter>();
		sfApiQuery.setFrom("StorageCenters");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Patch Storage Center
    * {
    * "ExternalAddress":"https://server/",
    * "Version":"4.12.20",
    * "HostName":"hostname" }
	* @param url 	
	* @param sc 	
	* @return Modified Storage Center
    */
	public ISFQuery<SFStorageCenter> update(URI url, SFStorageCenter sc)
	{
		SFApiQuery<SFStorageCenter> sfApiQuery = new SFApiQuery<SFStorageCenter>();
		sfApiQuery.setFrom("StorageCenters");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(sc);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Delete Storage Center
	* @param url 	
    */
	public ISFQuery delete(URI url)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("StorageCenters");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Get List of StorageCenters from Zone
	* Lists Storage Centers of a given Zone
	* @param url 	
	* @return A list of Storage Centers associated with the provided zone
    */
	public ISFQuery<SFODataFeed<SFStorageCenter>> getByZone(URI url)
	{
		SFApiQuery<SFODataFeed<SFStorageCenter>> sfApiQuery = new SFApiQuery<SFODataFeed<SFStorageCenter>>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create StorageCenter
    * {
    * "ExternalAddress":"https://server/",
    * "Version":"4.12.20",
    * "HostName":"hostname"
    * }
	* Creates a new Storage Center associated with a specific zone
	* @param url 	
	* @param storageCenter 	
	* @return The new storage center
    */
	public ISFQuery<SFStorageCenter> createByZone(URI url, SFStorageCenter storageCenter)
	{
		SFApiQuery<SFStorageCenter> sfApiQuery = new SFApiQuery<SFStorageCenter>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(storageCenter);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Update StorageCenter
    * {
    * "ExternalAddress":"https://server/",
    * "Version":"4.12.20",
    * "HostName":"hostname"
    * }
	* Updates an existing Storage Center
	* @param zUrl 	
	* @param scid 	
	* @param storageCenter 	
	* @return the modified storage center
    */
	public ISFQuery<SFStorageCenter> updateByZone(URI zUrl, String scid, SFStorageCenter storageCenter)
	{
		SFApiQuery<SFStorageCenter> sfApiQuery = new SFApiQuery<SFStorageCenter>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(zUrl);
		sfApiQuery.addActionIds(scid);
		sfApiQuery.setBody(storageCenter);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Delete StorageCenter
	* Removes an existing storage center
	* @param zUrl 	
	* @param scid 	
    */
	public ISFQuery deleteByZone(URI zUrl, String scid)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(zUrl);
		sfApiQuery.addActionIds(scid);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Get StorageCenter Metadata
	* Gets metadata associated with the specified storage center
	* @param zUrl 	
	* @param scid 	
	* @return the storage center metadata feed
    */
	public ISFQuery<SFODataFeed<SFMetadata>> getMetadata(URI zUrl, String scid)
	{
		SFApiQuery<SFODataFeed<SFMetadata>> sfApiQuery = new SFApiQuery<SFODataFeed<SFMetadata>>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(zUrl);
		sfApiQuery.addActionIds(scid);
		sfApiQuery.addSubAction("Metadata");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create or update StorageCenter Metadata
    * [
    * {"Name":"metadataName1", "Value":"metadataValue1", "IsPublic":"true"},
    * {"Name":"metadataName2", "Value":"metadataValue2", "IsPublic":"false"},
    * ...
    * ]
	* Creates or updates Metadata entries associated with the specified storage center
	* @param zUrl 	
	* @param scid 	
	* @param metadata 	
	* @return the storage center metadata feed
    */
	public ISFQuery<SFODataFeed<SFMetadata>> createMetadata(URI zUrl, String scid, ArrayList<SFMetadata> metadata)
	{
		SFApiQuery<SFODataFeed<SFMetadata>> sfApiQuery = new SFApiQuery<SFODataFeed<SFMetadata>>();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(zUrl);
		sfApiQuery.addActionIds(scid);
		sfApiQuery.addSubAction("Metadata");
		sfApiQuery.setBody(metadata);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Delete StorageCenter Metadata
	* Delete the Metadata entry associated with the specified storage center
	* @param zUrl 	
	* @param scid 	
	* @param name 	
	* @return no data on success
    */
	public ISFQuery deleteMetadata(URI zUrl, String scid, String name)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Zones");
		sfApiQuery.setAction("StorageCenters");
		sfApiQuery.addIds(zUrl);
		sfApiQuery.addActionIds(scid);
		sfApiQuery.addSubAction("Metadata");
		sfApiQuery.addQueryString("name", name);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

}

