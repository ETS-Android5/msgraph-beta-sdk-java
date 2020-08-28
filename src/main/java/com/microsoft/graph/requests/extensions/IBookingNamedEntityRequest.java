// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BookingNamedEntity;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Booking Named Entity Request.
 */
public interface IBookingNamedEntityRequest extends IHttpRequest {

    /**
     * Gets the BookingNamedEntity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<BookingNamedEntity> callback);

    /**
     * Gets the BookingNamedEntity from the service
     *
     * @return the BookingNamedEntity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingNamedEntity get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<BookingNamedEntity> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this BookingNamedEntity with a source
     *
     * @param sourceBookingNamedEntity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final BookingNamedEntity sourceBookingNamedEntity, final ICallback<BookingNamedEntity> callback);

    /**
     * Patches this BookingNamedEntity with a source
     *
     * @param sourceBookingNamedEntity the source object with updates
     * @return the updated BookingNamedEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingNamedEntity patch(final BookingNamedEntity sourceBookingNamedEntity) throws ClientException;

    /**
     * Posts a BookingNamedEntity with a new object
     *
     * @param newBookingNamedEntity the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final BookingNamedEntity newBookingNamedEntity, final ICallback<BookingNamedEntity> callback);

    /**
     * Posts a BookingNamedEntity with a new object
     *
     * @param newBookingNamedEntity the new object to create
     * @return the created BookingNamedEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingNamedEntity post(final BookingNamedEntity newBookingNamedEntity) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBookingNamedEntityRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBookingNamedEntityRequest expand(final String value);

}

