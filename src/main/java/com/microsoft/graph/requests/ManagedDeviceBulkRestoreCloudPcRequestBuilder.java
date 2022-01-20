// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ManagedDeviceBulkRestoreCloudPcRequest;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.RestoreTimeRange;
import com.microsoft.graph.models.CloudPcBulkRemoteActionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ManagedDeviceBulkRestoreCloudPcParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Bulk Restore Cloud Pc Request Builder.
 */
public class ManagedDeviceBulkRestoreCloudPcRequestBuilder extends BaseActionRequestBuilder<CloudPcBulkRemoteActionResult> {

    /**
     * The request builder for this ManagedDeviceBulkRestoreCloudPc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceBulkRestoreCloudPcRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private ManagedDeviceBulkRestoreCloudPcParameterSet body;
    /**
     * The request builder for this ManagedDeviceBulkRestoreCloudPc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ManagedDeviceBulkRestoreCloudPcRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ManagedDeviceBulkRestoreCloudPcParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ManagedDeviceBulkRestoreCloudPcRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceBulkRestoreCloudPcRequest instance
     */
    @Nonnull
    public ManagedDeviceBulkRestoreCloudPcRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedDeviceBulkRestoreCloudPcRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceBulkRestoreCloudPcRequest instance
     */
    @Nonnull
    public ManagedDeviceBulkRestoreCloudPcRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ManagedDeviceBulkRestoreCloudPcRequest request = new ManagedDeviceBulkRestoreCloudPcRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
