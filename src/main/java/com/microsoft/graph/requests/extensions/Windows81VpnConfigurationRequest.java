// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows81VpnConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81Vpn Configuration Request.
 */
public class Windows81VpnConfigurationRequest extends BaseRequest implements IWindows81VpnConfigurationRequest {
	
    /**
     * The request for the Windows81VpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public Windows81VpnConfigurationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends Windows81VpnConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Windows81VpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows81VpnConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows81VpnConfiguration.class);
    }

    /**
     * Gets the Windows81VpnConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Windows81VpnConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows81VpnConfiguration from the service
     *
     * @return the Windows81VpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81VpnConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Windows81VpnConfiguration> callback) {
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
     * Patches this Windows81VpnConfiguration with a source
     *
     * @param sourceWindows81VpnConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows81VpnConfiguration sourceWindows81VpnConfiguration, final ICallback<Windows81VpnConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows81VpnConfiguration);
    }

    /**
     * Patches this Windows81VpnConfiguration with a source
     *
     * @param sourceWindows81VpnConfiguration the source object with updates
     * @return the updated Windows81VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81VpnConfiguration patch(final Windows81VpnConfiguration sourceWindows81VpnConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows81VpnConfiguration);
    }

    /**
     * Creates a Windows81VpnConfiguration with a new object
     *
     * @param newWindows81VpnConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows81VpnConfiguration newWindows81VpnConfiguration, final ICallback<Windows81VpnConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindows81VpnConfiguration);
    }

    /**
     * Creates a Windows81VpnConfiguration with a new object
     *
     * @param newWindows81VpnConfiguration the new object to create
     * @return the created Windows81VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81VpnConfiguration post(final Windows81VpnConfiguration newWindows81VpnConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows81VpnConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows81VpnConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows81VpnConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows81VpnConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows81VpnConfigurationRequest)this;
     }

}

