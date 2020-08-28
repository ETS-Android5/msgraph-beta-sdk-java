// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceLogCollectionResponseCreateDownloadUrlRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Log Collection Response Create Download Url Request.
 */
public interface IDeviceLogCollectionResponseCreateDownloadUrlRequest {

    /**
     * Creates the DeviceLogCollectionResponseCreateDownloadUrl
     *
     * @param callback the callback to be called after success or failure
     */
    void post(final ICallback<String> callback);

    /**
     * Creates the DeviceLogCollectionResponseCreateDownloadUrl
     *
     * @return the String
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    String post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceLogCollectionResponseCreateDownloadUrlRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceLogCollectionResponseCreateDownloadUrlRequest expand(final String value);

}
