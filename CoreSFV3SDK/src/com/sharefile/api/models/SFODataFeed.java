






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


public class SFODataFeed<T> extends SFODataObject {



	@SerializedName("odata.count")

	private Integer count;


	@SerializedName("value")

	private ArrayList<SFT> Feed;


	@SerializedName("odata.nextLink")

	private String NextLink;




	public Integer getcount() {
		return count;
	}


	public void setcount(Integer count) {
		count = count;
	}


	public ArrayList<SFT> getFeed() {
		return Feed;
	}


	public void setFeed(ArrayList<SFT> feed) {
		Feed = feed;
	}


	public String getNextLink() {
		return NextLink;
	}


	public void setNextLink(String nextlink) {
		NextLink = nextlink;
	}

}