// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSEndpointProtectionConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSEndpoint Protection Configuration Request.
 */
public class MacOSEndpointProtectionConfigurationRequest extends BaseRequest implements IMacOSEndpointProtectionConfigurationRequest {
	
    /**
     * The request for the MacOSEndpointProtectionConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSEndpointProtectionConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSEndpointProtectionConfiguration.class);
    }

    /**
     * Gets the MacOSEndpointProtectionConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MacOSEndpointProtectionConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSEndpointProtectionConfiguration from the service
     *
     * @return the MacOSEndpointProtectionConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSEndpointProtectionConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MacOSEndpointProtectionConfiguration> callback) {
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
     * Patches this MacOSEndpointProtectionConfiguration with a source
     *
     * @param sourceMacOSEndpointProtectionConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSEndpointProtectionConfiguration sourceMacOSEndpointProtectionConfiguration, final ICallback<MacOSEndpointProtectionConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSEndpointProtectionConfiguration);
    }

    /**
     * Patches this MacOSEndpointProtectionConfiguration with a source
     *
     * @param sourceMacOSEndpointProtectionConfiguration the source object with updates
     * @return the updated MacOSEndpointProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSEndpointProtectionConfiguration patch(final MacOSEndpointProtectionConfiguration sourceMacOSEndpointProtectionConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSEndpointProtectionConfiguration);
    }

    /**
     * Creates a MacOSEndpointProtectionConfiguration with a new object
     *
     * @param newMacOSEndpointProtectionConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSEndpointProtectionConfiguration newMacOSEndpointProtectionConfiguration, final ICallback<MacOSEndpointProtectionConfiguration> callback) {
        send(HttpMethod.POST, callback, newMacOSEndpointProtectionConfiguration);
    }

    /**
     * Creates a MacOSEndpointProtectionConfiguration with a new object
     *
     * @param newMacOSEndpointProtectionConfiguration the new object to create
     * @return the created MacOSEndpointProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSEndpointProtectionConfiguration post(final MacOSEndpointProtectionConfiguration newMacOSEndpointProtectionConfiguration) throws ClientException {
        return send(HttpMethod.POST, newMacOSEndpointProtectionConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSEndpointProtectionConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSEndpointProtectionConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSEndpointProtectionConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSEndpointProtectionConfigurationRequest)this;
     }

}

