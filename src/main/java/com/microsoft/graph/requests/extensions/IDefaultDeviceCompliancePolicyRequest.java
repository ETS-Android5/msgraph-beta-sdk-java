// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DefaultDeviceCompliancePolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Default Device Compliance Policy Request.
 */
public interface IDefaultDeviceCompliancePolicyRequest extends IHttpRequest {

    /**
     * Gets the DefaultDeviceCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DefaultDeviceCompliancePolicy> callback);

    /**
     * Gets the DefaultDeviceCompliancePolicy from the service
     *
     * @return the DefaultDeviceCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DefaultDeviceCompliancePolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DefaultDeviceCompliancePolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DefaultDeviceCompliancePolicy with a source
     *
     * @param sourceDefaultDeviceCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DefaultDeviceCompliancePolicy sourceDefaultDeviceCompliancePolicy, final ICallback<? super DefaultDeviceCompliancePolicy> callback);

    /**
     * Patches this DefaultDeviceCompliancePolicy with a source
     *
     * @param sourceDefaultDeviceCompliancePolicy the source object with updates
     * @return the updated DefaultDeviceCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DefaultDeviceCompliancePolicy patch(final DefaultDeviceCompliancePolicy sourceDefaultDeviceCompliancePolicy) throws ClientException;

    /**
     * Posts a DefaultDeviceCompliancePolicy with a new object
     *
     * @param newDefaultDeviceCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DefaultDeviceCompliancePolicy newDefaultDeviceCompliancePolicy, final ICallback<? super DefaultDeviceCompliancePolicy> callback);

    /**
     * Posts a DefaultDeviceCompliancePolicy with a new object
     *
     * @param newDefaultDeviceCompliancePolicy the new object to create
     * @return the created DefaultDeviceCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DefaultDeviceCompliancePolicy post(final DefaultDeviceCompliancePolicy newDefaultDeviceCompliancePolicy) throws ClientException;

    /**
     * Posts a DefaultDeviceCompliancePolicy with a new object
     *
     * @param newDefaultDeviceCompliancePolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DefaultDeviceCompliancePolicy newDefaultDeviceCompliancePolicy, final ICallback<? super DefaultDeviceCompliancePolicy> callback);

    /**
     * Posts a DefaultDeviceCompliancePolicy with a new object
     *
     * @param newDefaultDeviceCompliancePolicy the object to create/update
     * @return the created DefaultDeviceCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DefaultDeviceCompliancePolicy put(final DefaultDeviceCompliancePolicy newDefaultDeviceCompliancePolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDefaultDeviceCompliancePolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDefaultDeviceCompliancePolicyRequest expand(final String value);

}

