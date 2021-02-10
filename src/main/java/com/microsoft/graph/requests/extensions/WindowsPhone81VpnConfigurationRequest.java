// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81VpnConfiguration;
import com.microsoft.graph.requests.extensions.IWindowsPhone81CertificateProfileBaseWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsPhone81CertificateProfileBaseWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Vpn Configuration Request.
 */
public class WindowsPhone81VpnConfigurationRequest extends BaseRequest implements IWindowsPhone81VpnConfigurationRequest {
	
    /**
     * The request for the WindowsPhone81VpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81VpnConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhone81VpnConfiguration.class);
    }

    /**
     * Gets the WindowsPhone81VpnConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsPhone81VpnConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsPhone81VpnConfiguration from the service
     *
     * @return the WindowsPhone81VpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81VpnConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsPhone81VpnConfiguration> callback) {
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
     * Patches this WindowsPhone81VpnConfiguration with a source
     *
     * @param sourceWindowsPhone81VpnConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsPhone81VpnConfiguration sourceWindowsPhone81VpnConfiguration, final ICallback<? super WindowsPhone81VpnConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsPhone81VpnConfiguration);
    }

    /**
     * Patches this WindowsPhone81VpnConfiguration with a source
     *
     * @param sourceWindowsPhone81VpnConfiguration the source object with updates
     * @return the updated WindowsPhone81VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81VpnConfiguration patch(final WindowsPhone81VpnConfiguration sourceWindowsPhone81VpnConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsPhone81VpnConfiguration);
    }

    /**
     * Creates a WindowsPhone81VpnConfiguration with a new object
     *
     * @param newWindowsPhone81VpnConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsPhone81VpnConfiguration newWindowsPhone81VpnConfiguration, final ICallback<? super WindowsPhone81VpnConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindowsPhone81VpnConfiguration);
    }

    /**
     * Creates a WindowsPhone81VpnConfiguration with a new object
     *
     * @param newWindowsPhone81VpnConfiguration the new object to create
     * @return the created WindowsPhone81VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81VpnConfiguration post(final WindowsPhone81VpnConfiguration newWindowsPhone81VpnConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsPhone81VpnConfiguration);
    }

    /**
     * Creates a WindowsPhone81VpnConfiguration with a new object
     *
     * @param newWindowsPhone81VpnConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsPhone81VpnConfiguration newWindowsPhone81VpnConfiguration, final ICallback<? super WindowsPhone81VpnConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindowsPhone81VpnConfiguration);
    }

    /**
     * Creates a WindowsPhone81VpnConfiguration with a new object
     *
     * @param newWindowsPhone81VpnConfiguration the object to create/update
     * @return the created WindowsPhone81VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81VpnConfiguration put(final WindowsPhone81VpnConfiguration newWindowsPhone81VpnConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindowsPhone81VpnConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsPhone81VpnConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsPhone81VpnConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsPhone81VpnConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsPhone81VpnConfigurationRequest)this;
     }

}

