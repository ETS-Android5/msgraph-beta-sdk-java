// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PersonWebsite;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Person Website Request.
 */
public interface IPersonWebsiteRequest extends IHttpRequest {

    /**
     * Gets the PersonWebsite from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PersonWebsite> callback);

    /**
     * Gets the PersonWebsite from the service
     *
     * @return the PersonWebsite from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PersonWebsite get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PersonWebsite> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PersonWebsite with a source
     *
     * @param sourcePersonWebsite the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PersonWebsite sourcePersonWebsite, final ICallback<? super PersonWebsite> callback);

    /**
     * Patches this PersonWebsite with a source
     *
     * @param sourcePersonWebsite the source object with updates
     * @return the updated PersonWebsite
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PersonWebsite patch(final PersonWebsite sourcePersonWebsite) throws ClientException;

    /**
     * Posts a PersonWebsite with a new object
     *
     * @param newPersonWebsite the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PersonWebsite newPersonWebsite, final ICallback<? super PersonWebsite> callback);

    /**
     * Posts a PersonWebsite with a new object
     *
     * @param newPersonWebsite the new object to create
     * @return the created PersonWebsite
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PersonWebsite post(final PersonWebsite newPersonWebsite) throws ClientException;

    /**
     * Posts a PersonWebsite with a new object
     *
     * @param newPersonWebsite the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PersonWebsite newPersonWebsite, final ICallback<? super PersonWebsite> callback);

    /**
     * Posts a PersonWebsite with a new object
     *
     * @param newPersonWebsite the object to create/update
     * @return the created PersonWebsite
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PersonWebsite put(final PersonWebsite newPersonWebsite) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPersonWebsiteRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPersonWebsiteRequest expand(final String value);

}

