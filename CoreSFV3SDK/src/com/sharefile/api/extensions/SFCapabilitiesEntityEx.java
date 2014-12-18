package com.sharefile.api.extensions;

import com.sharefile.api.entities.SFCapabilitiesEntity;
import com.sharefile.api.interfaces.ISFQuery;
import com.sharefile.api.models.SFCapability;
import com.sharefile.api.models.SFFolder;
import com.sharefile.api.models.SFItem;
import com.sharefile.api.models.SFODataFeed;
import com.sharefile.api.models.SFRedirection;
import com.sharefile.api.models.SFSymbolicLink;

import java.net.URI;
import java.net.URISyntaxException;

public class SFCapabilitiesEntityEx extends SFCapabilitiesEntity
{
    public ISFQuery<SFODataFeed<SFCapability>> get(SFItem item) throws URISyntaxException
    {
        if(item instanceof SFSymbolicLink)
        {
            return get(((SFSymbolicLink) item).getLink());
        }
        else if(item instanceof SFFolder)
        {
            SFFolder folder = (SFFolder) item;

            if(folder.getRedirection()!=null)
            {
                return get(folder.getRedirection().getUri());
            }
        }

        return get(item.geturl());
    }

    public ISFQuery<SFODataFeed<SFCapability>> get(URI uri) throws URISyntaxException
    {
        ISFQuery<SFODataFeed<SFCapability>> query = super.get();

        query.setBaseLink(uri);

        return query;
    }
}
