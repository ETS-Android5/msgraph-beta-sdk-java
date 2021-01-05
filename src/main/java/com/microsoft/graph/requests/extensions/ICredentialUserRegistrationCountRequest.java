// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CredentialUserRegistrationCount;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Credential User Registration Count Request.
 */
public interface ICredentialUserRegistrationCountRequest extends IHttpRequest {

    /**
     * Gets the CredentialUserRegistrationCount from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super CredentialUserRegistrationCount> callback);

    /**
     * Gets the CredentialUserRegistrationCount from the service
     *
     * @return the CredentialUserRegistrationCount from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CredentialUserRegistrationCount get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super CredentialUserRegistrationCount> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this CredentialUserRegistrationCount with a source
     *
     * @param sourceCredentialUserRegistrationCount the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final CredentialUserRegistrationCount sourceCredentialUserRegistrationCount, final ICallback<? super CredentialUserRegistrationCount> callback);

    /**
     * Patches this CredentialUserRegistrationCount with a source
     *
     * @param sourceCredentialUserRegistrationCount the source object with updates
     * @return the updated CredentialUserRegistrationCount
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CredentialUserRegistrationCount patch(final CredentialUserRegistrationCount sourceCredentialUserRegistrationCount) throws ClientException;

    /**
     * Posts a CredentialUserRegistrationCount with a new object
     *
     * @param newCredentialUserRegistrationCount the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final CredentialUserRegistrationCount newCredentialUserRegistrationCount, final ICallback<? super CredentialUserRegistrationCount> callback);

    /**
     * Posts a CredentialUserRegistrationCount with a new object
     *
     * @param newCredentialUserRegistrationCount the new object to create
     * @return the created CredentialUserRegistrationCount
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CredentialUserRegistrationCount post(final CredentialUserRegistrationCount newCredentialUserRegistrationCount) throws ClientException;

    /**
     * Posts a CredentialUserRegistrationCount with a new object
     *
     * @param newCredentialUserRegistrationCount the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final CredentialUserRegistrationCount newCredentialUserRegistrationCount, final ICallback<? super CredentialUserRegistrationCount> callback);

    /**
     * Posts a CredentialUserRegistrationCount with a new object
     *
     * @param newCredentialUserRegistrationCount the object to create/update
     * @return the created CredentialUserRegistrationCount
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CredentialUserRegistrationCount put(final CredentialUserRegistrationCount newCredentialUserRegistrationCount) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICredentialUserRegistrationCountRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICredentialUserRegistrationCountRequest expand(final String value);

}

