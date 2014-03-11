
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

/**
 *  A principal object represents some authority in the ShareFile system, 
 *  that can login and/or be given AccessControl permissions to Items. 
 *  Principals include Users, Groups and Zones. Groups cannot authenticate, 
 *  but can be part of Items Access Control lists. Zones can authenticate 
 *  to perform zone management operations - such as copying items to another 
 *  zone. Users are the typical users, represented by email and domain.
 */
public class SFPrincipal extends SFODataObject {

	private String mName;
	private String mEmail;
	private String mUsername;
	private String mDomain;

		/**
		* User name
		*/
	public String getName() {
		return mName;
	}

		/**
		* User name
		*/
	public void setName(String name) {
		mName = name;
	}
		/**
		* Email address
		*/
	public String getEmail() {
		return mEmail;
	}

		/**
		* Email address
		*/
	public void setEmail(String email) {
		mEmail = email;
	}
		/**
		* Username for the account - the value used for login. This is the same as Email for ShareFile accounts, but
		* may be different on Connectors
		*/
	public String getUsername() {
		return mUsername;
	}

		/**
		* Username for the account - the value used for login. This is the same as Email for ShareFile accounts, but
		* may be different on Connectors
		*/
	public void setUsername(String username) {
		mUsername = username;
	}
		/**
		* Account domain
		*/
	public String getDomain() {
		return mDomain;
	}

		/**
		* Account domain
		*/
	public void setDomain(String domain) {
		mDomain = domain;
	}
}