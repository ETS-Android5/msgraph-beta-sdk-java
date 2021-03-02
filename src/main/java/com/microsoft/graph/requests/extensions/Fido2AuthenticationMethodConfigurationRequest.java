// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Fido2AuthenticationMethodConfiguration;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodTargetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodTargetRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationMethodTargetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationMethodTargetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Fido2Authentication Method Configuration Request.
 */
public class Fido2AuthenticationMethodConfigurationRequest extends BaseRequest implements IFido2AuthenticationMethodConfigurationRequest {
	
    /**
     * The request for the Fido2AuthenticationMethodConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Fido2AuthenticationMethodConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Fido2AuthenticationMethodConfiguration.class);
    }

    /**
     * Gets the Fido2AuthenticationMethodConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Fido2AuthenticationMethodConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Fido2AuthenticationMethodConfiguration from the service
     *
     * @return the Fido2AuthenticationMethodConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Fido2AuthenticationMethodConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Fido2AuthenticationMethodConfiguration> callback) {
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
     * Patches this Fido2AuthenticationMethodConfiguration with a source
     *
     * @param sourceFido2AuthenticationMethodConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Fido2AuthenticationMethodConfiguration sourceFido2AuthenticationMethodConfiguration, final ICallback<? super Fido2AuthenticationMethodConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceFido2AuthenticationMethodConfiguration);
    }

    /**
     * Patches this Fido2AuthenticationMethodConfiguration with a source
     *
     * @param sourceFido2AuthenticationMethodConfiguration the source object with updates
     * @return the updated Fido2AuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Fido2AuthenticationMethodConfiguration patch(final Fido2AuthenticationMethodConfiguration sourceFido2AuthenticationMethodConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceFido2AuthenticationMethodConfiguration);
    }

    /**
     * Creates a Fido2AuthenticationMethodConfiguration with a new object
     *
     * @param newFido2AuthenticationMethodConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Fido2AuthenticationMethodConfiguration newFido2AuthenticationMethodConfiguration, final ICallback<? super Fido2AuthenticationMethodConfiguration> callback) {
        send(HttpMethod.POST, callback, newFido2AuthenticationMethodConfiguration);
    }

    /**
     * Creates a Fido2AuthenticationMethodConfiguration with a new object
     *
     * @param newFido2AuthenticationMethodConfiguration the new object to create
     * @return the created Fido2AuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Fido2AuthenticationMethodConfiguration post(final Fido2AuthenticationMethodConfiguration newFido2AuthenticationMethodConfiguration) throws ClientException {
        return send(HttpMethod.POST, newFido2AuthenticationMethodConfiguration);
    }

    /**
     * Creates a Fido2AuthenticationMethodConfiguration with a new object
     *
     * @param newFido2AuthenticationMethodConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Fido2AuthenticationMethodConfiguration newFido2AuthenticationMethodConfiguration, final ICallback<? super Fido2AuthenticationMethodConfiguration> callback) {
        send(HttpMethod.PUT, callback, newFido2AuthenticationMethodConfiguration);
    }

    /**
     * Creates a Fido2AuthenticationMethodConfiguration with a new object
     *
     * @param newFido2AuthenticationMethodConfiguration the object to create/update
     * @return the created Fido2AuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Fido2AuthenticationMethodConfiguration put(final Fido2AuthenticationMethodConfiguration newFido2AuthenticationMethodConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newFido2AuthenticationMethodConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IFido2AuthenticationMethodConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Fido2AuthenticationMethodConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IFido2AuthenticationMethodConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Fido2AuthenticationMethodConfigurationRequest)this;
     }

}

