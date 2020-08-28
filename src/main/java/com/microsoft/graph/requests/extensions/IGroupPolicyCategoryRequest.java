// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyCategory;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Category Request.
 */
public interface IGroupPolicyCategoryRequest extends IHttpRequest {

    /**
     * Gets the GroupPolicyCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<GroupPolicyCategory> callback);

    /**
     * Gets the GroupPolicyCategory from the service
     *
     * @return the GroupPolicyCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyCategory get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<GroupPolicyCategory> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupPolicyCategory with a source
     *
     * @param sourceGroupPolicyCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupPolicyCategory sourceGroupPolicyCategory, final ICallback<GroupPolicyCategory> callback);

    /**
     * Patches this GroupPolicyCategory with a source
     *
     * @param sourceGroupPolicyCategory the source object with updates
     * @return the updated GroupPolicyCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyCategory patch(final GroupPolicyCategory sourceGroupPolicyCategory) throws ClientException;

    /**
     * Posts a GroupPolicyCategory with a new object
     *
     * @param newGroupPolicyCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupPolicyCategory newGroupPolicyCategory, final ICallback<GroupPolicyCategory> callback);

    /**
     * Posts a GroupPolicyCategory with a new object
     *
     * @param newGroupPolicyCategory the new object to create
     * @return the created GroupPolicyCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyCategory post(final GroupPolicyCategory newGroupPolicyCategory) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyCategoryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyCategoryRequest expand(final String value);

}

