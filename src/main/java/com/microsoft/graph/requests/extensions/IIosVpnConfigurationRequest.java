// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IosVpnConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Vpn Configuration Request.
 */
public interface IIosVpnConfigurationRequest extends IHttpRequest {

    /**
     * Gets the IosVpnConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super IosVpnConfiguration> callback);

    /**
     * Gets the IosVpnConfiguration from the service
     *
     * @return the IosVpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVpnConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super IosVpnConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IosVpnConfiguration with a source
     *
     * @param sourceIosVpnConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosVpnConfiguration sourceIosVpnConfiguration, final ICallback<? super IosVpnConfiguration> callback);

    /**
     * Patches this IosVpnConfiguration with a source
     *
     * @param sourceIosVpnConfiguration the source object with updates
     * @return the updated IosVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVpnConfiguration patch(final IosVpnConfiguration sourceIosVpnConfiguration) throws ClientException;

    /**
     * Posts a IosVpnConfiguration with a new object
     *
     * @param newIosVpnConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosVpnConfiguration newIosVpnConfiguration, final ICallback<? super IosVpnConfiguration> callback);

    /**
     * Posts a IosVpnConfiguration with a new object
     *
     * @param newIosVpnConfiguration the new object to create
     * @return the created IosVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVpnConfiguration post(final IosVpnConfiguration newIosVpnConfiguration) throws ClientException;

    /**
     * Posts a IosVpnConfiguration with a new object
     *
     * @param newIosVpnConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final IosVpnConfiguration newIosVpnConfiguration, final ICallback<? super IosVpnConfiguration> callback);

    /**
     * Posts a IosVpnConfiguration with a new object
     *
     * @param newIosVpnConfiguration the object to create/update
     * @return the created IosVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosVpnConfiguration put(final IosVpnConfiguration newIosVpnConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIosVpnConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIosVpnConfigurationRequest expand(final String value);

}

