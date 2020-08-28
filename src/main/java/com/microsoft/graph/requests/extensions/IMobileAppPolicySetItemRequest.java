// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppPolicySetItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Policy Set Item Request.
 */
public interface IMobileAppPolicySetItemRequest extends IHttpRequest {

    /**
     * Gets the MobileAppPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MobileAppPolicySetItem> callback);

    /**
     * Gets the MobileAppPolicySetItem from the service
     *
     * @return the MobileAppPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppPolicySetItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MobileAppPolicySetItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MobileAppPolicySetItem with a source
     *
     * @param sourceMobileAppPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileAppPolicySetItem sourceMobileAppPolicySetItem, final ICallback<MobileAppPolicySetItem> callback);

    /**
     * Patches this MobileAppPolicySetItem with a source
     *
     * @param sourceMobileAppPolicySetItem the source object with updates
     * @return the updated MobileAppPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppPolicySetItem patch(final MobileAppPolicySetItem sourceMobileAppPolicySetItem) throws ClientException;

    /**
     * Posts a MobileAppPolicySetItem with a new object
     *
     * @param newMobileAppPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileAppPolicySetItem newMobileAppPolicySetItem, final ICallback<MobileAppPolicySetItem> callback);

    /**
     * Posts a MobileAppPolicySetItem with a new object
     *
     * @param newMobileAppPolicySetItem the new object to create
     * @return the created MobileAppPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppPolicySetItem post(final MobileAppPolicySetItem newMobileAppPolicySetItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMobileAppPolicySetItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMobileAppPolicySetItemRequest expand(final String value);

}

