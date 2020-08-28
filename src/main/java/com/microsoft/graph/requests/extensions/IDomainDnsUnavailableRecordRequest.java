// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DomainDnsUnavailableRecord;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Domain Dns Unavailable Record Request.
 */
public interface IDomainDnsUnavailableRecordRequest extends IHttpRequest {

    /**
     * Gets the DomainDnsUnavailableRecord from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DomainDnsUnavailableRecord> callback);

    /**
     * Gets the DomainDnsUnavailableRecord from the service
     *
     * @return the DomainDnsUnavailableRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DomainDnsUnavailableRecord get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DomainDnsUnavailableRecord> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DomainDnsUnavailableRecord with a source
     *
     * @param sourceDomainDnsUnavailableRecord the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DomainDnsUnavailableRecord sourceDomainDnsUnavailableRecord, final ICallback<DomainDnsUnavailableRecord> callback);

    /**
     * Patches this DomainDnsUnavailableRecord with a source
     *
     * @param sourceDomainDnsUnavailableRecord the source object with updates
     * @return the updated DomainDnsUnavailableRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DomainDnsUnavailableRecord patch(final DomainDnsUnavailableRecord sourceDomainDnsUnavailableRecord) throws ClientException;

    /**
     * Posts a DomainDnsUnavailableRecord with a new object
     *
     * @param newDomainDnsUnavailableRecord the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DomainDnsUnavailableRecord newDomainDnsUnavailableRecord, final ICallback<DomainDnsUnavailableRecord> callback);

    /**
     * Posts a DomainDnsUnavailableRecord with a new object
     *
     * @param newDomainDnsUnavailableRecord the new object to create
     * @return the created DomainDnsUnavailableRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DomainDnsUnavailableRecord post(final DomainDnsUnavailableRecord newDomainDnsUnavailableRecord) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDomainDnsUnavailableRecordRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDomainDnsUnavailableRecordRequest expand(final String value);

}

