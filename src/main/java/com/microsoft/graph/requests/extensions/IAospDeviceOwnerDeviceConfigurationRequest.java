// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AospDeviceOwnerDeviceConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Aosp Device Owner Device Configuration Request.
 */
public interface IAospDeviceOwnerDeviceConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AospDeviceOwnerDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AospDeviceOwnerDeviceConfiguration> callback);

    /**
     * Gets the AospDeviceOwnerDeviceConfiguration from the service
     *
     * @return the AospDeviceOwnerDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AospDeviceOwnerDeviceConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AospDeviceOwnerDeviceConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AospDeviceOwnerDeviceConfiguration with a source
     *
     * @param sourceAospDeviceOwnerDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AospDeviceOwnerDeviceConfiguration sourceAospDeviceOwnerDeviceConfiguration, final ICallback<? super AospDeviceOwnerDeviceConfiguration> callback);

    /**
     * Patches this AospDeviceOwnerDeviceConfiguration with a source
     *
     * @param sourceAospDeviceOwnerDeviceConfiguration the source object with updates
     * @return the updated AospDeviceOwnerDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AospDeviceOwnerDeviceConfiguration patch(final AospDeviceOwnerDeviceConfiguration sourceAospDeviceOwnerDeviceConfiguration) throws ClientException;

    /**
     * Posts a AospDeviceOwnerDeviceConfiguration with a new object
     *
     * @param newAospDeviceOwnerDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AospDeviceOwnerDeviceConfiguration newAospDeviceOwnerDeviceConfiguration, final ICallback<? super AospDeviceOwnerDeviceConfiguration> callback);

    /**
     * Posts a AospDeviceOwnerDeviceConfiguration with a new object
     *
     * @param newAospDeviceOwnerDeviceConfiguration the new object to create
     * @return the created AospDeviceOwnerDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AospDeviceOwnerDeviceConfiguration post(final AospDeviceOwnerDeviceConfiguration newAospDeviceOwnerDeviceConfiguration) throws ClientException;

    /**
     * Posts a AospDeviceOwnerDeviceConfiguration with a new object
     *
     * @param newAospDeviceOwnerDeviceConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AospDeviceOwnerDeviceConfiguration newAospDeviceOwnerDeviceConfiguration, final ICallback<? super AospDeviceOwnerDeviceConfiguration> callback);

    /**
     * Posts a AospDeviceOwnerDeviceConfiguration with a new object
     *
     * @param newAospDeviceOwnerDeviceConfiguration the object to create/update
     * @return the created AospDeviceOwnerDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AospDeviceOwnerDeviceConfiguration put(final AospDeviceOwnerDeviceConfiguration newAospDeviceOwnerDeviceConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAospDeviceOwnerDeviceConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAospDeviceOwnerDeviceConfigurationRequest expand(final String value);

}

