// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.IosManagedAppProtection;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Managed App Protection Collection Request.
 */
public interface IIosManagedAppProtectionCollectionRequest {

    void get(final ICallback<IIosManagedAppProtectionCollectionPage> callback);

    IIosManagedAppProtectionCollectionPage get() throws ClientException;

    void post(final IosManagedAppProtection newIosManagedAppProtection, final ICallback<IosManagedAppProtection> callback);

    IosManagedAppProtection post(final IosManagedAppProtection newIosManagedAppProtection) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIosManagedAppProtectionCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIosManagedAppProtectionCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IIosManagedAppProtectionCollectionRequest top(final int value);

}
