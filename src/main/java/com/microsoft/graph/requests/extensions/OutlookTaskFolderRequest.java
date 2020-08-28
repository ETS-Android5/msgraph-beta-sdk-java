// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OutlookTaskFolder;
import com.microsoft.graph.requests.extensions.IOutlookTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook Task Folder Request.
 */
public class OutlookTaskFolderRequest extends BaseRequest implements IOutlookTaskFolderRequest {
	
    /**
     * The request for the OutlookTaskFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookTaskFolderRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OutlookTaskFolder.class);
    }

    /**
     * Gets the OutlookTaskFolder from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<OutlookTaskFolder> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OutlookTaskFolder from the service
     *
     * @return the OutlookTaskFolder from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OutlookTaskFolder get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<OutlookTaskFolder> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OutlookTaskFolder with a source
     *
     * @param sourceOutlookTaskFolder the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final OutlookTaskFolder sourceOutlookTaskFolder, final ICallback<OutlookTaskFolder> callback) {
        send(HttpMethod.PATCH, callback, sourceOutlookTaskFolder);
    }

    /**
     * Patches this OutlookTaskFolder with a source
     *
     * @param sourceOutlookTaskFolder the source object with updates
     * @return the updated OutlookTaskFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OutlookTaskFolder patch(final OutlookTaskFolder sourceOutlookTaskFolder) throws ClientException {
        return send(HttpMethod.PATCH, sourceOutlookTaskFolder);
    }

    /**
     * Creates a OutlookTaskFolder with a new object
     *
     * @param newOutlookTaskFolder the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final OutlookTaskFolder newOutlookTaskFolder, final ICallback<OutlookTaskFolder> callback) {
        send(HttpMethod.POST, callback, newOutlookTaskFolder);
    }

    /**
     * Creates a OutlookTaskFolder with a new object
     *
     * @param newOutlookTaskFolder the new object to create
     * @return the created OutlookTaskFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OutlookTaskFolder post(final OutlookTaskFolder newOutlookTaskFolder) throws ClientException {
        return send(HttpMethod.POST, newOutlookTaskFolder);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOutlookTaskFolderRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OutlookTaskFolderRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOutlookTaskFolderRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OutlookTaskFolderRequest)this;
     }

}

