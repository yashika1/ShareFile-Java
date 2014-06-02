






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


package com.sharefile.api.models;


public class SFAccessControlDomains extends SFODataObject {



	@SerializedName("AccessControlType")

	private SFSafeEnum<SFAccessControlFilter> AccessControlType;


	@SerializedName("Domains")

	private ArrayList<String> Domains;




		/**

		* Specifies that the list is interpreted as a list of allowed or disallowed domains

		*/

	public SFSafeEnum<SFAccessControlFilter> getAccessControlType() {
		return AccessControlType;
	}


		/**

		* Specifies that the list is interpreted as a list of allowed or disallowed domains

		*/

	public void setAccessControlType(SFSafeEnum<SFAccessControlFilter> accesscontroltype) {
		AccessControlType = accesscontroltype;
	}


		/**

		* A list of domain names

		*/

	public ArrayList<String> getDomains() {
		return Domains;
	}


		/**

		* A list of domain names

		*/

	public void setDomains(ArrayList<String> domains) {
		Domains = domains;
	}

}