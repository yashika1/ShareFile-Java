
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

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFSearchQuery extends SFODataObject {

	@SerializedName("Query")
	private SFQuery Query;
	@SerializedName("Paging")
	private SFQueryPaging Paging;
	@SerializedName("Sort")
	private SFQuerySorting Sort;
	@SerializedName("TimeoutInSeconds")
	private Integer TimeoutInSeconds;

	public SFQuery getQuery() {
		return this.Query;
	}

	public void setQuery(SFQuery query) {
		this.Query = query;
	}
	public SFQueryPaging getPaging() {
		return this.Paging;
	}

	public void setPaging(SFQueryPaging paging) {
		this.Paging = paging;
	}
	public SFQuerySorting getSort() {
		return this.Sort;
	}

	public void setSort(SFQuerySorting sort) {
		this.Sort = sort;
	}
	public Integer getTimeoutInSeconds() {
		return this.TimeoutInSeconds;
	}

	public void setTimeoutInSeconds(Integer timeoutinseconds) {
		this.TimeoutInSeconds = timeoutinseconds;
	}

}