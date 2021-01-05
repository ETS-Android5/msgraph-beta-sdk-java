// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateCategorySummary;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateStateSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update Category Summary Request.
 */
public class MacOSSoftwareUpdateCategorySummaryRequest extends BaseRequest implements IMacOSSoftwareUpdateCategorySummaryRequest {
	
    /**
     * The request for the MacOSSoftwareUpdateCategorySummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSSoftwareUpdateCategorySummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSSoftwareUpdateCategorySummary.class);
    }

    /**
     * Gets the MacOSSoftwareUpdateCategorySummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MacOSSoftwareUpdateCategorySummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSSoftwareUpdateCategorySummary from the service
     *
     * @return the MacOSSoftwareUpdateCategorySummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSSoftwareUpdateCategorySummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MacOSSoftwareUpdateCategorySummary> callback) {
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
     * Patches this MacOSSoftwareUpdateCategorySummary with a source
     *
     * @param sourceMacOSSoftwareUpdateCategorySummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSSoftwareUpdateCategorySummary sourceMacOSSoftwareUpdateCategorySummary, final ICallback<? super MacOSSoftwareUpdateCategorySummary> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSSoftwareUpdateCategorySummary);
    }

    /**
     * Patches this MacOSSoftwareUpdateCategorySummary with a source
     *
     * @param sourceMacOSSoftwareUpdateCategorySummary the source object with updates
     * @return the updated MacOSSoftwareUpdateCategorySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSSoftwareUpdateCategorySummary patch(final MacOSSoftwareUpdateCategorySummary sourceMacOSSoftwareUpdateCategorySummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSSoftwareUpdateCategorySummary);
    }

    /**
     * Creates a MacOSSoftwareUpdateCategorySummary with a new object
     *
     * @param newMacOSSoftwareUpdateCategorySummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSSoftwareUpdateCategorySummary newMacOSSoftwareUpdateCategorySummary, final ICallback<? super MacOSSoftwareUpdateCategorySummary> callback) {
        send(HttpMethod.POST, callback, newMacOSSoftwareUpdateCategorySummary);
    }

    /**
     * Creates a MacOSSoftwareUpdateCategorySummary with a new object
     *
     * @param newMacOSSoftwareUpdateCategorySummary the new object to create
     * @return the created MacOSSoftwareUpdateCategorySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSSoftwareUpdateCategorySummary post(final MacOSSoftwareUpdateCategorySummary newMacOSSoftwareUpdateCategorySummary) throws ClientException {
        return send(HttpMethod.POST, newMacOSSoftwareUpdateCategorySummary);
    }

    /**
     * Creates a MacOSSoftwareUpdateCategorySummary with a new object
     *
     * @param newMacOSSoftwareUpdateCategorySummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MacOSSoftwareUpdateCategorySummary newMacOSSoftwareUpdateCategorySummary, final ICallback<? super MacOSSoftwareUpdateCategorySummary> callback) {
        send(HttpMethod.PUT, callback, newMacOSSoftwareUpdateCategorySummary);
    }

    /**
     * Creates a MacOSSoftwareUpdateCategorySummary with a new object
     *
     * @param newMacOSSoftwareUpdateCategorySummary the object to create/update
     * @return the created MacOSSoftwareUpdateCategorySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSSoftwareUpdateCategorySummary put(final MacOSSoftwareUpdateCategorySummary newMacOSSoftwareUpdateCategorySummary) throws ClientException {
        return send(HttpMethod.PUT, newMacOSSoftwareUpdateCategorySummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSSoftwareUpdateCategorySummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSSoftwareUpdateCategorySummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSSoftwareUpdateCategorySummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSSoftwareUpdateCategorySummaryRequest)this;
     }

}

