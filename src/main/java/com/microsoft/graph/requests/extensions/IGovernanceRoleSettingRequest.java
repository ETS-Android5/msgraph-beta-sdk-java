// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GovernanceRoleSetting;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Governance Role Setting Request.
 */
public interface IGovernanceRoleSettingRequest extends IHttpRequest {

    /**
     * Gets the GovernanceRoleSetting from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<GovernanceRoleSetting> callback);

    /**
     * Gets the GovernanceRoleSetting from the service
     *
     * @return the GovernanceRoleSetting from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GovernanceRoleSetting get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<GovernanceRoleSetting> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GovernanceRoleSetting with a source
     *
     * @param sourceGovernanceRoleSetting the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GovernanceRoleSetting sourceGovernanceRoleSetting, final ICallback<GovernanceRoleSetting> callback);

    /**
     * Patches this GovernanceRoleSetting with a source
     *
     * @param sourceGovernanceRoleSetting the source object with updates
     * @return the updated GovernanceRoleSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GovernanceRoleSetting patch(final GovernanceRoleSetting sourceGovernanceRoleSetting) throws ClientException;

    /**
     * Posts a GovernanceRoleSetting with a new object
     *
     * @param newGovernanceRoleSetting the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GovernanceRoleSetting newGovernanceRoleSetting, final ICallback<GovernanceRoleSetting> callback);

    /**
     * Posts a GovernanceRoleSetting with a new object
     *
     * @param newGovernanceRoleSetting the new object to create
     * @return the created GovernanceRoleSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GovernanceRoleSetting post(final GovernanceRoleSetting newGovernanceRoleSetting) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGovernanceRoleSettingRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGovernanceRoleSettingRequest expand(final String value);

}

