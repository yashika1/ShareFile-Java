
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

public class SFZoneUsageBreakdown extends SFODataObject {

	@SerializedName("ZonesToUsage")
	private Map<String, SFAccountZoneUsage> ZonesToUsage;

	public Map<String, SFAccountZoneUsage> getZonesToUsage() {
		return this.ZonesToUsage;
	}

	public void setZonesToUsage(Map<String, SFAccountZoneUsage> zonestousage) {
		this.ZonesToUsage = zonestousage;
	}

}