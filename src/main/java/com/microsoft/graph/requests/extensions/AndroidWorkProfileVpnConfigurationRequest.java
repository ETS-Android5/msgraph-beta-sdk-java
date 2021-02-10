// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidWorkProfileVpnConfiguration;
import com.microsoft.graph.requests.extensions.IAndroidWorkProfileCertificateProfileBaseWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidWorkProfileCertificateProfileBaseWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Vpn Configuration Request.
 */
public class AndroidWorkProfileVpnConfigurationRequest extends BaseRequest implements IAndroidWorkProfileVpnConfigurationRequest {
	
    /**
     * The request for the AndroidWorkProfileVpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileVpnConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileVpnConfiguration.class);
    }

    /**
     * Gets the AndroidWorkProfileVpnConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidWorkProfileVpnConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidWorkProfileVpnConfiguration from the service
     *
     * @return the AndroidWorkProfileVpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileVpnConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidWorkProfileVpnConfiguration> callback) {
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
     * Patches this AndroidWorkProfileVpnConfiguration with a source
     *
     * @param sourceAndroidWorkProfileVpnConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidWorkProfileVpnConfiguration sourceAndroidWorkProfileVpnConfiguration, final ICallback<? super AndroidWorkProfileVpnConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidWorkProfileVpnConfiguration);
    }

    /**
     * Patches this AndroidWorkProfileVpnConfiguration with a source
     *
     * @param sourceAndroidWorkProfileVpnConfiguration the source object with updates
     * @return the updated AndroidWorkProfileVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileVpnConfiguration patch(final AndroidWorkProfileVpnConfiguration sourceAndroidWorkProfileVpnConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfileVpnConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileVpnConfiguration with a new object
     *
     * @param newAndroidWorkProfileVpnConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidWorkProfileVpnConfiguration newAndroidWorkProfileVpnConfiguration, final ICallback<? super AndroidWorkProfileVpnConfiguration> callback) {
        send(HttpMethod.POST, callback, newAndroidWorkProfileVpnConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileVpnConfiguration with a new object
     *
     * @param newAndroidWorkProfileVpnConfiguration the new object to create
     * @return the created AndroidWorkProfileVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileVpnConfiguration post(final AndroidWorkProfileVpnConfiguration newAndroidWorkProfileVpnConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfileVpnConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileVpnConfiguration with a new object
     *
     * @param newAndroidWorkProfileVpnConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidWorkProfileVpnConfiguration newAndroidWorkProfileVpnConfiguration, final ICallback<? super AndroidWorkProfileVpnConfiguration> callback) {
        send(HttpMethod.PUT, callback, newAndroidWorkProfileVpnConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileVpnConfiguration with a new object
     *
     * @param newAndroidWorkProfileVpnConfiguration the object to create/update
     * @return the created AndroidWorkProfileVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileVpnConfiguration put(final AndroidWorkProfileVpnConfiguration newAndroidWorkProfileVpnConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidWorkProfileVpnConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidWorkProfileVpnConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidWorkProfileVpnConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidWorkProfileVpnConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidWorkProfileVpnConfigurationRequest)this;
     }

}

