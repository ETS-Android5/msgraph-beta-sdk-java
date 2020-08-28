// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkCustomConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Custom Configuration Request.
 */
public class AndroidForWorkCustomConfigurationRequest extends BaseRequest implements IAndroidForWorkCustomConfigurationRequest {
	
    /**
     * The request for the AndroidForWorkCustomConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkCustomConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkCustomConfiguration.class);
    }

    /**
     * Gets the AndroidForWorkCustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidForWorkCustomConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkCustomConfiguration from the service
     *
     * @return the AndroidForWorkCustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkCustomConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidForWorkCustomConfiguration> callback) {
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
     * Patches this AndroidForWorkCustomConfiguration with a source
     *
     * @param sourceAndroidForWorkCustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidForWorkCustomConfiguration sourceAndroidForWorkCustomConfiguration, final ICallback<AndroidForWorkCustomConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkCustomConfiguration);
    }

    /**
     * Patches this AndroidForWorkCustomConfiguration with a source
     *
     * @param sourceAndroidForWorkCustomConfiguration the source object with updates
     * @return the updated AndroidForWorkCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkCustomConfiguration patch(final AndroidForWorkCustomConfiguration sourceAndroidForWorkCustomConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkCustomConfiguration);
    }

    /**
     * Creates a AndroidForWorkCustomConfiguration with a new object
     *
     * @param newAndroidForWorkCustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidForWorkCustomConfiguration newAndroidForWorkCustomConfiguration, final ICallback<AndroidForWorkCustomConfiguration> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkCustomConfiguration);
    }

    /**
     * Creates a AndroidForWorkCustomConfiguration with a new object
     *
     * @param newAndroidForWorkCustomConfiguration the new object to create
     * @return the created AndroidForWorkCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkCustomConfiguration post(final AndroidForWorkCustomConfiguration newAndroidForWorkCustomConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkCustomConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidForWorkCustomConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidForWorkCustomConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidForWorkCustomConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidForWorkCustomConfigurationRequest)this;
     }

}

