// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CredentialUserRegistrationDetails;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Credential User Registration Details Request.
 */
public interface ICredentialUserRegistrationDetailsRequest extends IHttpRequest {

    /**
     * Gets the CredentialUserRegistrationDetails from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<CredentialUserRegistrationDetails> callback);

    /**
     * Gets the CredentialUserRegistrationDetails from the service
     *
     * @return the CredentialUserRegistrationDetails from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CredentialUserRegistrationDetails get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<CredentialUserRegistrationDetails> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this CredentialUserRegistrationDetails with a source
     *
     * @param sourceCredentialUserRegistrationDetails the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final CredentialUserRegistrationDetails sourceCredentialUserRegistrationDetails, final ICallback<CredentialUserRegistrationDetails> callback);

    /**
     * Patches this CredentialUserRegistrationDetails with a source
     *
     * @param sourceCredentialUserRegistrationDetails the source object with updates
     * @return the updated CredentialUserRegistrationDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CredentialUserRegistrationDetails patch(final CredentialUserRegistrationDetails sourceCredentialUserRegistrationDetails) throws ClientException;

    /**
     * Posts a CredentialUserRegistrationDetails with a new object
     *
     * @param newCredentialUserRegistrationDetails the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final CredentialUserRegistrationDetails newCredentialUserRegistrationDetails, final ICallback<CredentialUserRegistrationDetails> callback);

    /**
     * Posts a CredentialUserRegistrationDetails with a new object
     *
     * @param newCredentialUserRegistrationDetails the new object to create
     * @return the created CredentialUserRegistrationDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CredentialUserRegistrationDetails post(final CredentialUserRegistrationDetails newCredentialUserRegistrationDetails) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICredentialUserRegistrationDetailsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICredentialUserRegistrationDetailsRequest expand(final String value);

}

