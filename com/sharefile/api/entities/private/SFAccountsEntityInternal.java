
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


import java.util.stream;

public class SFAccountsEntityInternal extends SFAccountsEntity
{
    /**
	* Get Outlook Information
	* @return OutlookInformation
    */
	public SFApiQuery<SFOutlookInformation> getOutlookInformation()
	{
		SFApiQuery<SFOutlookInformation> sfApiQuery = new SFApiQuery<SFOutlookInformation>();
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("OutlookInformation");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

}
