// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkEnterpriseWiFiConfiguration;
import com.microsoft.graph.requests.extensions.IAndroidForWorkTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkCertificateProfileBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkCertificateProfileBaseRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Enterprise Wi Fi Configuration Request.
 */
public class AndroidForWorkEnterpriseWiFiConfigurationRequest extends BaseRequest implements IAndroidForWorkEnterpriseWiFiConfigurationRequest {
	
    /**
     * The request for the AndroidForWorkEnterpriseWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkEnterpriseWiFiConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkEnterpriseWiFiConfiguration.class);
    }

    /**
     * Gets the AndroidForWorkEnterpriseWiFiConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidForWorkEnterpriseWiFiConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkEnterpriseWiFiConfiguration from the service
     *
     * @return the AndroidForWorkEnterpriseWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkEnterpriseWiFiConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidForWorkEnterpriseWiFiConfiguration> callback) {
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
     * Patches this AndroidForWorkEnterpriseWiFiConfiguration with a source
     *
     * @param sourceAndroidForWorkEnterpriseWiFiConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidForWorkEnterpriseWiFiConfiguration sourceAndroidForWorkEnterpriseWiFiConfiguration, final ICallback<AndroidForWorkEnterpriseWiFiConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkEnterpriseWiFiConfiguration);
    }

    /**
     * Patches this AndroidForWorkEnterpriseWiFiConfiguration with a source
     *
     * @param sourceAndroidForWorkEnterpriseWiFiConfiguration the source object with updates
     * @return the updated AndroidForWorkEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkEnterpriseWiFiConfiguration patch(final AndroidForWorkEnterpriseWiFiConfiguration sourceAndroidForWorkEnterpriseWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a AndroidForWorkEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkEnterpriseWiFiConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidForWorkEnterpriseWiFiConfiguration newAndroidForWorkEnterpriseWiFiConfiguration, final ICallback<AndroidForWorkEnterpriseWiFiConfiguration> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkEnterpriseWiFiConfiguration);
    }

    /**
     * Creates a AndroidForWorkEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkEnterpriseWiFiConfiguration the new object to create
     * @return the created AndroidForWorkEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkEnterpriseWiFiConfiguration post(final AndroidForWorkEnterpriseWiFiConfiguration newAndroidForWorkEnterpriseWiFiConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkEnterpriseWiFiConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidForWorkEnterpriseWiFiConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidForWorkEnterpriseWiFiConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidForWorkEnterpriseWiFiConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidForWorkEnterpriseWiFiConfigurationRequest)this;
     }

}

