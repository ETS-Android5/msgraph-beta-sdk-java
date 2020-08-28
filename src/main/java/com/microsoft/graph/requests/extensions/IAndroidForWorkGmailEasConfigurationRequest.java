// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidForWorkGmailEasConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android For Work Gmail Eas Configuration Request.
 */
public interface IAndroidForWorkGmailEasConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidForWorkGmailEasConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidForWorkGmailEasConfiguration> callback);

    /**
     * Gets the AndroidForWorkGmailEasConfiguration from the service
     *
     * @return the AndroidForWorkGmailEasConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkGmailEasConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidForWorkGmailEasConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidForWorkGmailEasConfiguration with a source
     *
     * @param sourceAndroidForWorkGmailEasConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidForWorkGmailEasConfiguration sourceAndroidForWorkGmailEasConfiguration, final ICallback<AndroidForWorkGmailEasConfiguration> callback);

    /**
     * Patches this AndroidForWorkGmailEasConfiguration with a source
     *
     * @param sourceAndroidForWorkGmailEasConfiguration the source object with updates
     * @return the updated AndroidForWorkGmailEasConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkGmailEasConfiguration patch(final AndroidForWorkGmailEasConfiguration sourceAndroidForWorkGmailEasConfiguration) throws ClientException;

    /**
     * Posts a AndroidForWorkGmailEasConfiguration with a new object
     *
     * @param newAndroidForWorkGmailEasConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidForWorkGmailEasConfiguration newAndroidForWorkGmailEasConfiguration, final ICallback<AndroidForWorkGmailEasConfiguration> callback);

    /**
     * Posts a AndroidForWorkGmailEasConfiguration with a new object
     *
     * @param newAndroidForWorkGmailEasConfiguration the new object to create
     * @return the created AndroidForWorkGmailEasConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkGmailEasConfiguration post(final AndroidForWorkGmailEasConfiguration newAndroidForWorkGmailEasConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidForWorkGmailEasConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidForWorkGmailEasConfigurationRequest expand(final String value);

}

