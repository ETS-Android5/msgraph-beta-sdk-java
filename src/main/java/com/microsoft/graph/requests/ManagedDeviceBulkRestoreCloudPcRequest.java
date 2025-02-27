// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.CloudPcBulkRemoteActionResult;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.requests.ManagedDeviceBulkRestoreCloudPcRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.ManagedDeviceBulkRestoreCloudPcParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Bulk Restore Cloud Pc Request.
 */
public class ManagedDeviceBulkRestoreCloudPcRequest extends BaseRequest<CloudPcBulkRemoteActionResult> {
    /**
     * The request for this ManagedDeviceBulkRestoreCloudPc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceBulkRestoreCloudPcRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CloudPcBulkRemoteActionResult.class);
    }

	/** The body for the method */
    @Nullable
    public ManagedDeviceBulkRestoreCloudPcParameterSet body;
    /**
     * Invokes the method and returns a future with the result
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcBulkRemoteActionResult> postAsync() {
        return sendAsync(HttpMethod.POST, body);
    }

    /**
     * Invokes the method and returns the result
     * @return result of the method invocation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public CloudPcBulkRemoteActionResult post() throws ClientException {
       return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceBulkRestoreCloudPcRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceBulkRestoreCloudPcRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
