
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

public class SFShare extends SFODataObject {

	private String mAliasID;
	private SFShareType mShareType;
	private String mTitle;
	private Boolean mHasSentMessage;
	private String mSentMessageTitle;
	private Boolean mRequireLogin;
	private Boolean mRequireUserInfo;
	private SFItem mParent;
	private SFUser mCreator;
	private SFUser mUser;
	private ArrayList<SFItem> mItems;
	private Date mCreationDate;
	private Date mExpirationDate;
	private Integer mMaxDownloads;
	private Integer mTotalDownloads;
	private Boolean mIsViewOnly;
	private Date mTrackUntilDate;
	private Integer mSendFrequency;
	private Integer mSendInterval;
	private Date mLastDateSent;
	private Boolean mIsConsumed;
	private Boolean mIsRead;
	private Boolean mIsArchived;
	private String mSendTool;
	private String mSendMethod;
	private Boolean mUsesStreamIDs;
	private URI mUri;
	private ArrayList<SFShareAlias> mRecipients;

		/**
		* When a Share is sent to multiple users, with RequireLogin or RequireUserInfo set, then a different
		* Share Alias is created for each user. The email ShareFile sends to these users will contain different
		* AliasIDs, allowing ShareFile to track the user activity on the share.
		* For anonymous Shares, the AliasID will be the same as the Share ID.
		*/
	public String getAliasID() {
		return mAliasID;
	}

		/**
		* When a Share is sent to multiple users, with RequireLogin or RequireUserInfo set, then a different
		* Share Alias is created for each user. The email ShareFile sends to these users will contain different
		* AliasIDs, allowing ShareFile to track the user activity on the share.
		* For anonymous Shares, the AliasID will be the same as the Share ID.
		*/
	public void setAliasID(String aliasid) {
		mAliasID = aliasid;
	}
		/**
		* Either "Send" or "Request". Send Shares are used to Send files and folders to the specified users. Request
		* shares are used to allow users to upload files to the share owner chosen location.
		*/
	public SFShareType getShareType() {
		return mShareType;
	}

		/**
		* Either "Send" or "Request". Send Shares are used to Send files and folders to the specified users. Request
		* shares are used to allow users to upload files to the share owner chosen location.
		*/
	public void setShareType(SFShareType sharetype) {
		mShareType = sharetype;
	}
		/**
		* Share title
		*/
	public String getTitle() {
		return mTitle;
	}

		/**
		* Share title
		*/
	public void setTitle(String title) {
		mTitle = title;
	}
		/**
		* Flag to indicate if ShareFile has sent email messages for this Share
		*/
	public Boolean getHasSentMessage() {
		return mHasSentMessage;
	}

		/**
		* Flag to indicate if ShareFile has sent email messages for this Share
		*/
	public void setHasSentMessage(Boolean hassentmessage) {
		mHasSentMessage = hassentmessage;
	}
		/**
		* Subject of Share email message
		*/
	public String getSentMessageTitle() {
		return mSentMessageTitle;
	}

		/**
		* Subject of Share email message
		*/
	public void setSentMessageTitle(String sentmessagetitle) {
		mSentMessageTitle = sentmessagetitle;
	}
		/**
		* If set, only authenticated users can download files from this share.
		*/
	public Boolean getRequireLogin() {
		return mRequireLogin;
	}

		/**
		* If set, only authenticated users can download files from this share.
		*/
	public void setRequireLogin(Boolean requirelogin) {
		mRequireLogin = requirelogin;
	}
		/**
		* If set, users must provide Name, Email and Company information to download files from the share.
		*/
	public Boolean getRequireUserInfo() {
		return mRequireUserInfo;
	}

		/**
		* If set, users must provide Name, Email and Company information to download files from the share.
		*/
	public void setRequireUserInfo(Boolean requireuserinfo) {
		mRequireUserInfo = requireuserinfo;
	}
		/**
		* Folder location that contain the share files (Send); or the folder were files will be uploaded to
		* (Request).
		*/
	public SFItem getParent() {
		return mParent;
	}

		/**
		* Folder location that contain the share files (Send); or the folder were files will be uploaded to
		* (Request).
		*/
	public void setParent(SFItem parent) {
		mParent = parent;
	}
		/**
		* User that created this Share.
		*/
	public SFUser getCreator() {
		return mCreator;
	}

		/**
		* User that created this Share.
		*/
	public void setCreator(SFUser creator) {
		mCreator = creator;
	}
		/**
		* User given permission to use this share - used for Aliases.
		*/
	public SFUser getUser() {
		return mUser;
	}

		/**
		* User given permission to use this share - used for Aliases.
		*/
	public void setUser(SFUser user) {
		mUser = user;
	}
		/**
		* List of shared Items (for Send Shares only)
		*/
	public ArrayList<SFItem> getItems() {
		return mItems;
	}

		/**
		* List of shared Items (for Send Shares only)
		*/
	public void setItems(ArrayList<SFItem> items) {
		mItems = items;
	}
		/**
		* Date the share was created
		*/
	public Date getCreationDate() {
		return mCreationDate;
	}

		/**
		* Date the share was created
		*/
	public void setCreationDate(Date creationdate) {
		mCreationDate = creationdate;
	}
		/**
		* Date the share expires
		*/
	public Date getExpirationDate() {
		return mExpirationDate;
	}

		/**
		* Date the share expires
		*/
	public void setExpirationDate(Date expirationdate) {
		mExpirationDate = expirationdate;
	}
		/**
		* Maximum number of downloads each user can perform.
		*/
	public Integer getMaxDownloads() {
		return mMaxDownloads;
	}

		/**
		* Maximum number of downloads each user can perform.
		*/
	public void setMaxDownloads(Integer maxdownloads) {
		mMaxDownloads = maxdownloads;
	}
	public Integer getTotalDownloads() {
		return mTotalDownloads;
	}

	public void setTotalDownloads(Integer totaldownloads) {
		mTotalDownloads = totaldownloads;
	}
		/**
		* Used for Virtual Data Room accounts - indicates the files in the share can only be
		* downloaded with an applied watermark.
		*/
	public Boolean getIsViewOnly() {
		return mIsViewOnly;
	}

		/**
		* Used for Virtual Data Room accounts - indicates the files in the share can only be
		* downloaded with an applied watermark.
		*/
	public void setIsViewOnly(Boolean isviewonly) {
		mIsViewOnly = isviewonly;
	}
		/**
		* User activity on this share will be tracked up to this date.
		*/
	public Date getTrackUntilDate() {
		return mTrackUntilDate;
	}

		/**
		* User activity on this share will be tracked up to this date.
		*/
	public void setTrackUntilDate(Date trackuntildate) {
		mTrackUntilDate = trackuntildate;
	}
	public Integer getSendFrequency() {
		return mSendFrequency;
	}

	public void setSendFrequency(Integer sendfrequency) {
		mSendFrequency = sendfrequency;
	}
	public Integer getSendInterval() {
		return mSendInterval;
	}

	public void setSendInterval(Integer sendinterval) {
		mSendInterval = sendinterval;
	}
	public Date getLastDateSent() {
		return mLastDateSent;
	}

	public void setLastDateSent(Date lastdatesent) {
		mLastDateSent = lastdatesent;
	}
	public Boolean getIsConsumed() {
		return mIsConsumed;
	}

	public void setIsConsumed(Boolean isconsumed) {
		mIsConsumed = isconsumed;
	}
	public Boolean getIsRead() {
		return mIsRead;
	}

	public void setIsRead(Boolean isread) {
		mIsRead = isread;
	}
	public Boolean getIsArchived() {
		return mIsArchived;
	}

	public void setIsArchived(Boolean isarchived) {
		mIsArchived = isarchived;
	}
	public String getSendTool() {
		return mSendTool;
	}

	public void setSendTool(String sendtool) {
		mSendTool = sendtool;
	}
	public String getSendMethod() {
		return mSendMethod;
	}

	public void setSendMethod(String sendmethod) {
		mSendMethod = sendmethod;
	}
		/**
		* When enabled the items are identified by stream IDs instead of item IDs.
		* Applies to Send Shares only.
		*/
	public Boolean getUsesStreamIDs() {
		return mUsesStreamIDs;
	}

		/**
		* When enabled the items are identified by stream IDs instead of item IDs.
		* Applies to Send Shares only.
		*/
	public void setUsesStreamIDs(Boolean usesstreamids) {
		mUsesStreamIDs = usesstreamids;
	}
		/**
		* Uri to access the share through the Web portal
		*/
	public URI getUri() {
		return mUri;
	}

		/**
		* Uri to access the share through the Web portal
		*/
	public void setUri(URI uri) {
		mUri = uri;
	}
		/**
		* List of users that have access to this share.
		*/
	public ArrayList<SFShareAlias> getRecipients() {
		return mRecipients;
	}

		/**
		* List of users that have access to this share.
		*/
	public void setRecipients(ArrayList<SFShareAlias> recipients) {
		mRecipients = recipients;
	}
}