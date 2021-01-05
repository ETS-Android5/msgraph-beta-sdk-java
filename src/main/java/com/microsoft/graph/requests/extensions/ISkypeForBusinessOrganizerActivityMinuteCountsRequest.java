// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityMinuteCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Skype For Business Organizer Activity Minute Counts Request.
 */
public interface ISkypeForBusinessOrganizerActivityMinuteCountsRequest extends IHttpRequest {

    /**
     * Gets the SkypeForBusinessOrganizerActivityMinuteCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SkypeForBusinessOrganizerActivityMinuteCounts> callback);

    /**
     * Gets the SkypeForBusinessOrganizerActivityMinuteCounts from the service
     *
     * @return the SkypeForBusinessOrganizerActivityMinuteCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessOrganizerActivityMinuteCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SkypeForBusinessOrganizerActivityMinuteCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SkypeForBusinessOrganizerActivityMinuteCounts with a source
     *
     * @param sourceSkypeForBusinessOrganizerActivityMinuteCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SkypeForBusinessOrganizerActivityMinuteCounts sourceSkypeForBusinessOrganizerActivityMinuteCounts, final ICallback<? super SkypeForBusinessOrganizerActivityMinuteCounts> callback);

    /**
     * Patches this SkypeForBusinessOrganizerActivityMinuteCounts with a source
     *
     * @param sourceSkypeForBusinessOrganizerActivityMinuteCounts the source object with updates
     * @return the updated SkypeForBusinessOrganizerActivityMinuteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessOrganizerActivityMinuteCounts patch(final SkypeForBusinessOrganizerActivityMinuteCounts sourceSkypeForBusinessOrganizerActivityMinuteCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessOrganizerActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityMinuteCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SkypeForBusinessOrganizerActivityMinuteCounts newSkypeForBusinessOrganizerActivityMinuteCounts, final ICallback<? super SkypeForBusinessOrganizerActivityMinuteCounts> callback);

    /**
     * Posts a SkypeForBusinessOrganizerActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityMinuteCounts the new object to create
     * @return the created SkypeForBusinessOrganizerActivityMinuteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessOrganizerActivityMinuteCounts post(final SkypeForBusinessOrganizerActivityMinuteCounts newSkypeForBusinessOrganizerActivityMinuteCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessOrganizerActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityMinuteCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SkypeForBusinessOrganizerActivityMinuteCounts newSkypeForBusinessOrganizerActivityMinuteCounts, final ICallback<? super SkypeForBusinessOrganizerActivityMinuteCounts> callback);

    /**
     * Posts a SkypeForBusinessOrganizerActivityMinuteCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityMinuteCounts the object to create/update
     * @return the created SkypeForBusinessOrganizerActivityMinuteCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessOrganizerActivityMinuteCounts put(final SkypeForBusinessOrganizerActivityMinuteCounts newSkypeForBusinessOrganizerActivityMinuteCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISkypeForBusinessOrganizerActivityMinuteCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISkypeForBusinessOrganizerActivityMinuteCountsRequest expand(final String value);

}

