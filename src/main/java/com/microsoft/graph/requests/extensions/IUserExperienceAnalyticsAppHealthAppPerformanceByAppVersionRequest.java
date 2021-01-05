// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics App Health App Performance By App Version Request.
 */
public interface IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> callback);

    /**
     * Gets the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion from the service
     *
     * @return the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion, final ICallback<? super UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> callback);

    /**
     * Patches this UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion the source object with updates
     * @return the updated UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion patch(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion, final ICallback<? super UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> callback);

    /**
     * Posts a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion the new object to create
     * @return the created UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion post(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion, final ICallback<? super UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> callback);

    /**
     * Posts a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion the object to create/update
     * @return the created UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion put(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequest expand(final String value);

}

