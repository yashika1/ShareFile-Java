
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

public class SFAccessControl extends SFODataObject {

	private SFItem mItem;
	private SFPrincipal mPrincipal;
	private Boolean mCanUpload;
	private Boolean mCanDownload;
	private Boolean mCanView;
	private Boolean mCanDelete;
	private Boolean mCanManagePermissions;
	private Boolean mNotifyOnUpload;
	private Boolean mNotifyOnDownload;
	private Boolean mIsOwner;

		/**
		* Item that was given permission through this rule
		*/
	public SFItem getItem() {
		return mItem;
	}

		/**
		* Item that was given permission through this rule
		*/
	public void setItem(SFItem item) {
		mItem = item;
	}
	public SFPrincipal getPrincipal() {
		return mPrincipal;
	}

	public void setPrincipal(SFPrincipal principal) {
		mPrincipal = principal;
	}
		/**
		* Defines whether the principal can add files (upload) into the Item
		*/
	public Boolean getCanUpload() {
		return mCanUpload;
	}

		/**
		* Defines whether the principal can add files (upload) into the Item
		*/
	public void setCanUpload(Boolean canupload) {
		mCanUpload = canupload;
	}
		/**
		* Defines whether the principal can read file content (download) from this Item
		*/
	public Boolean getCanDownload() {
		return mCanDownload;
	}

		/**
		* Defines whether the principal can read file content (download) from this Item
		*/
	public void setCanDownload(Boolean candownload) {
		mCanDownload = candownload;
	}
		/**
		* Defines whether the principal can view items (browse) from this Item
		*/
	public Boolean getCanView() {
		return mCanView;
	}

		/**
		* Defines whether the principal can view items (browse) from this Item
		*/
	public void setCanView(Boolean canview) {
		mCanView = canview;
	}
		/**
		* Defines whether the principal can remove items from this Item
		*/
	public Boolean getCanDelete() {
		return mCanDelete;
	}

		/**
		* Defines whether the principal can remove items from this Item
		*/
	public void setCanDelete(Boolean candelete) {
		mCanDelete = candelete;
	}
		/**
		* Defines whether the principal can configure Access Controls in this Item
		*/
	public Boolean getCanManagePermissions() {
		return mCanManagePermissions;
	}

		/**
		* Defines whether the principal can configure Access Controls in this Item
		*/
	public void setCanManagePermissions(Boolean canmanagepermissions) {
		mCanManagePermissions = canmanagepermissions;
	}
		/**
		* Defines the notification preference for upload events. If set, the principal will receive
		* notifications when new files are uploaded into this Item
		*/
	public Boolean getNotifyOnUpload() {
		return mNotifyOnUpload;
	}

		/**
		* Defines the notification preference for upload events. If set, the principal will receive
		* notifications when new files are uploaded into this Item
		*/
	public void setNotifyOnUpload(Boolean notifyonupload) {
		mNotifyOnUpload = notifyonupload;
	}
		/**
		* Defines the notification preference for download events. If set, the principal will receive
		* notifiation when items are downloaded from this Item.
		*/
	public Boolean getNotifyOnDownload() {
		return mNotifyOnDownload;
	}

		/**
		* Defines the notification preference for download events. If set, the principal will receive
		* notifiation when items are downloaded from this Item.
		*/
	public void setNotifyOnDownload(Boolean notifyondownload) {
		mNotifyOnDownload = notifyondownload;
	}
		/**
		* Defines whether the principal is the owner of this Item
		*/
	public Boolean getIsOwner() {
		return mIsOwner;
	}

		/**
		* Defines whether the principal is the owner of this Item
		*/
	public void setIsOwner(Boolean isowner) {
		mIsOwner = isowner;
	}
}