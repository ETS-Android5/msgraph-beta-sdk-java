// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MicrosoftAuthenticatorAuthenticationMethodConfiguration;
import com.microsoft.graph.requests.extensions.IMicrosoftAuthenticatorAuthenticationMethodTargetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMicrosoftAuthenticatorAuthenticationMethodTargetRequestBuilder;
import com.microsoft.graph.requests.extensions.MicrosoftAuthenticatorAuthenticationMethodTargetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MicrosoftAuthenticatorAuthenticationMethodTargetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Authenticator Authentication Method Configuration Request.
 */
public class MicrosoftAuthenticatorAuthenticationMethodConfigurationRequest extends BaseRequest implements IMicrosoftAuthenticatorAuthenticationMethodConfigurationRequest {
	
    /**
     * The request for the MicrosoftAuthenticatorAuthenticationMethodConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MicrosoftAuthenticatorAuthenticationMethodConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MicrosoftAuthenticatorAuthenticationMethodConfiguration.class);
    }

    /**
     * Gets the MicrosoftAuthenticatorAuthenticationMethodConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MicrosoftAuthenticatorAuthenticationMethodConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MicrosoftAuthenticatorAuthenticationMethodConfiguration from the service
     *
     * @return the MicrosoftAuthenticatorAuthenticationMethodConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MicrosoftAuthenticatorAuthenticationMethodConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MicrosoftAuthenticatorAuthenticationMethodConfiguration> callback) {
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
     * Patches this MicrosoftAuthenticatorAuthenticationMethodConfiguration with a source
     *
     * @param sourceMicrosoftAuthenticatorAuthenticationMethodConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MicrosoftAuthenticatorAuthenticationMethodConfiguration sourceMicrosoftAuthenticatorAuthenticationMethodConfiguration, final ICallback<? super MicrosoftAuthenticatorAuthenticationMethodConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceMicrosoftAuthenticatorAuthenticationMethodConfiguration);
    }

    /**
     * Patches this MicrosoftAuthenticatorAuthenticationMethodConfiguration with a source
     *
     * @param sourceMicrosoftAuthenticatorAuthenticationMethodConfiguration the source object with updates
     * @return the updated MicrosoftAuthenticatorAuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MicrosoftAuthenticatorAuthenticationMethodConfiguration patch(final MicrosoftAuthenticatorAuthenticationMethodConfiguration sourceMicrosoftAuthenticatorAuthenticationMethodConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceMicrosoftAuthenticatorAuthenticationMethodConfiguration);
    }

    /**
     * Creates a MicrosoftAuthenticatorAuthenticationMethodConfiguration with a new object
     *
     * @param newMicrosoftAuthenticatorAuthenticationMethodConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MicrosoftAuthenticatorAuthenticationMethodConfiguration newMicrosoftAuthenticatorAuthenticationMethodConfiguration, final ICallback<? super MicrosoftAuthenticatorAuthenticationMethodConfiguration> callback) {
        send(HttpMethod.POST, callback, newMicrosoftAuthenticatorAuthenticationMethodConfiguration);
    }

    /**
     * Creates a MicrosoftAuthenticatorAuthenticationMethodConfiguration with a new object
     *
     * @param newMicrosoftAuthenticatorAuthenticationMethodConfiguration the new object to create
     * @return the created MicrosoftAuthenticatorAuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MicrosoftAuthenticatorAuthenticationMethodConfiguration post(final MicrosoftAuthenticatorAuthenticationMethodConfiguration newMicrosoftAuthenticatorAuthenticationMethodConfiguration) throws ClientException {
        return send(HttpMethod.POST, newMicrosoftAuthenticatorAuthenticationMethodConfiguration);
    }

    /**
     * Creates a MicrosoftAuthenticatorAuthenticationMethodConfiguration with a new object
     *
     * @param newMicrosoftAuthenticatorAuthenticationMethodConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MicrosoftAuthenticatorAuthenticationMethodConfiguration newMicrosoftAuthenticatorAuthenticationMethodConfiguration, final ICallback<? super MicrosoftAuthenticatorAuthenticationMethodConfiguration> callback) {
        send(HttpMethod.PUT, callback, newMicrosoftAuthenticatorAuthenticationMethodConfiguration);
    }

    /**
     * Creates a MicrosoftAuthenticatorAuthenticationMethodConfiguration with a new object
     *
     * @param newMicrosoftAuthenticatorAuthenticationMethodConfiguration the object to create/update
     * @return the created MicrosoftAuthenticatorAuthenticationMethodConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MicrosoftAuthenticatorAuthenticationMethodConfiguration put(final MicrosoftAuthenticatorAuthenticationMethodConfiguration newMicrosoftAuthenticatorAuthenticationMethodConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newMicrosoftAuthenticatorAuthenticationMethodConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMicrosoftAuthenticatorAuthenticationMethodConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MicrosoftAuthenticatorAuthenticationMethodConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMicrosoftAuthenticatorAuthenticationMethodConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MicrosoftAuthenticatorAuthenticationMethodConfigurationRequest)this;
     }

}

