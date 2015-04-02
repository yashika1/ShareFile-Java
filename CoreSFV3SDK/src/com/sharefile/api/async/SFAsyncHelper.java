package com.sharefile.api.async;


import com.sharefile.api.exceptions.SFSDKException;
import com.sharefile.api.interfaces.ISFApiClient;
import com.sharefile.api.interfaces.ISFApiExecuteQuery;
import com.sharefile.api.interfaces.ISFApiResultCallback;
import com.sharefile.api.interfaces.ISFQuery;

public class SFAsyncHelper<T>
{
    private final ISFApiClient mApiClient;
    private final ISFQuery<T> mQuery;
    private final ISFApiResultCallback<T> mApiResultCallback;
    private ISFApiExecuteQuery mApiExecutor;
    private T mResult;
    private SFSDKException mException;

    public SFAsyncHelper(ISFApiClient apiClient, ISFQuery query, ISFApiResultCallback apiResultCallback)
    {
        this.mApiClient = apiClient;
        this.mQuery = query;
        this.mApiResultCallback = apiResultCallback;
    }

    public T doInBackground()
    {
        try
        {
            mApiExecutor = mApiClient.getExecutor(mQuery, mApiResultCallback, null);
            mResult = mApiExecutor.executeBlockingQuery();
        }
        catch (SFSDKException e)
        {
            mException = e;
        }

        return mResult;
    }

    public void onPostExecute()
    {
        if(mException !=null)
        {
            mApiResultCallback.onError(mException,mQuery);
            return;
        }

        mApiResultCallback.onSuccess(mResult);
    }
}