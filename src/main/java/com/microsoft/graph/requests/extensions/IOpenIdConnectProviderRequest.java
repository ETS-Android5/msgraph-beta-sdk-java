// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OpenIdConnectProvider;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Open Id Connect Provider Request.
 */
public interface IOpenIdConnectProviderRequest extends IHttpRequest {

    /**
     * Gets the OpenIdConnectProvider from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<OpenIdConnectProvider> callback);

    /**
     * Gets the OpenIdConnectProvider from the service
     *
     * @return the OpenIdConnectProvider from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OpenIdConnectProvider get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<OpenIdConnectProvider> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OpenIdConnectProvider with a source
     *
     * @param sourceOpenIdConnectProvider the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OpenIdConnectProvider sourceOpenIdConnectProvider, final ICallback<OpenIdConnectProvider> callback);

    /**
     * Patches this OpenIdConnectProvider with a source
     *
     * @param sourceOpenIdConnectProvider the source object with updates
     * @return the updated OpenIdConnectProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OpenIdConnectProvider patch(final OpenIdConnectProvider sourceOpenIdConnectProvider) throws ClientException;

    /**
     * Posts a OpenIdConnectProvider with a new object
     *
     * @param newOpenIdConnectProvider the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OpenIdConnectProvider newOpenIdConnectProvider, final ICallback<OpenIdConnectProvider> callback);

    /**
     * Posts a OpenIdConnectProvider with a new object
     *
     * @param newOpenIdConnectProvider the new object to create
     * @return the created OpenIdConnectProvider
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OpenIdConnectProvider post(final OpenIdConnectProvider newOpenIdConnectProvider) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOpenIdConnectProviderRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOpenIdConnectProviderRequest expand(final String value);

}

