// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SectionGroup;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Section Group Request.
 */
public interface ISectionGroupRequest extends IHttpRequest {

    /**
     * Gets the SectionGroup from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<SectionGroup> callback);

    /**
     * Gets the SectionGroup from the service
     *
     * @return the SectionGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SectionGroup get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<SectionGroup> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SectionGroup with a source
     *
     * @param sourceSectionGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SectionGroup sourceSectionGroup, final ICallback<SectionGroup> callback);

    /**
     * Patches this SectionGroup with a source
     *
     * @param sourceSectionGroup the source object with updates
     * @return the updated SectionGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SectionGroup patch(final SectionGroup sourceSectionGroup) throws ClientException;

    /**
     * Posts a SectionGroup with a new object
     *
     * @param newSectionGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SectionGroup newSectionGroup, final ICallback<SectionGroup> callback);

    /**
     * Posts a SectionGroup with a new object
     *
     * @param newSectionGroup the new object to create
     * @return the created SectionGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SectionGroup post(final SectionGroup newSectionGroup) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISectionGroupRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISectionGroupRequest expand(final String value);

}

