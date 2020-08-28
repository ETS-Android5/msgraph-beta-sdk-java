// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsBaseline;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Baseline Request.
 */
public interface IUserExperienceAnalyticsBaselineRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsBaseline from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<UserExperienceAnalyticsBaseline> callback);

    /**
     * Gets the UserExperienceAnalyticsBaseline from the service
     *
     * @return the UserExperienceAnalyticsBaseline from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsBaseline get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<UserExperienceAnalyticsBaseline> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsBaseline with a source
     *
     * @param sourceUserExperienceAnalyticsBaseline the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsBaseline sourceUserExperienceAnalyticsBaseline, final ICallback<UserExperienceAnalyticsBaseline> callback);

    /**
     * Patches this UserExperienceAnalyticsBaseline with a source
     *
     * @param sourceUserExperienceAnalyticsBaseline the source object with updates
     * @return the updated UserExperienceAnalyticsBaseline
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsBaseline patch(final UserExperienceAnalyticsBaseline sourceUserExperienceAnalyticsBaseline) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsBaseline with a new object
     *
     * @param newUserExperienceAnalyticsBaseline the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsBaseline newUserExperienceAnalyticsBaseline, final ICallback<UserExperienceAnalyticsBaseline> callback);

    /**
     * Posts a UserExperienceAnalyticsBaseline with a new object
     *
     * @param newUserExperienceAnalyticsBaseline the new object to create
     * @return the created UserExperienceAnalyticsBaseline
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsBaseline post(final UserExperienceAnalyticsBaseline newUserExperienceAnalyticsBaseline) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsBaselineRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsBaselineRequest expand(final String value);

}

