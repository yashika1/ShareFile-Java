
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

package com.citrix.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.enumerations.*;
import com.citrix.sharefile.api.models.*;

public class SFEnsSubscriptionRequest extends SFODataObject {

	@SerializedName("EnsServerUrl")
	private String EnsServerUrl;
	@SerializedName("ClientId")
	private String ClientId;
	@SerializedName("Entity")
	private SFODataObject Entity;
	@SerializedName("EventTypes")
	private SFSafeEnumFlags<SFEnsEventType> EventTypes;
	@SerializedName("IncludeProgeny")
	private Boolean IncludeProgeny;

	public String getEnsServerUrl() {
		return this.EnsServerUrl;
	}

	public void setEnsServerUrl(String ensserverurl) {
		this.EnsServerUrl = ensserverurl;
	}
	public String getClientId() {
		return this.ClientId;
	}

	public void setClientId(String clientid) {
		this.ClientId = clientid;
	}
	public SFODataObject getEntity() {
		return this.Entity;
	}

	public void setEntity(SFODataObject entity) {
		this.Entity = entity;
	}
	public SFSafeEnumFlags<SFEnsEventType> getEventTypes() {
		return this.EventTypes;
	}

	public void setEventTypes(SFSafeEnumFlags<SFEnsEventType> eventtypes) {
		this.EventTypes = eventtypes;
	}
	public Boolean getIncludeProgeny() {
		return this.IncludeProgeny;
	}

	public void setIncludeProgeny(Boolean includeprogeny) {
		this.IncludeProgeny = includeprogeny;
	}

}