// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ManagedDeviceBulkSetCloudPcReviewStatusRequest;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.CloudPcReviewStatus;
import com.microsoft.graph.models.CloudPcBulkRemoteActionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ManagedDeviceBulkSetCloudPcReviewStatusParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Bulk Set Cloud Pc Review Status Request Builder.
 */
public class ManagedDeviceBulkSetCloudPcReviewStatusRequestBuilder extends BaseActionRequestBuilder<CloudPcBulkRemoteActionResult> {

    /**
     * The request builder for this ManagedDeviceBulkSetCloudPcReviewStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceBulkSetCloudPcReviewStatusRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private ManagedDeviceBulkSetCloudPcReviewStatusParameterSet body;
    /**
     * The request builder for this ManagedDeviceBulkSetCloudPcReviewStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ManagedDeviceBulkSetCloudPcReviewStatusRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ManagedDeviceBulkSetCloudPcReviewStatusParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ManagedDeviceBulkSetCloudPcReviewStatusRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceBulkSetCloudPcReviewStatusRequest instance
     */
    @Nonnull
    public ManagedDeviceBulkSetCloudPcReviewStatusRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedDeviceBulkSetCloudPcReviewStatusRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceBulkSetCloudPcReviewStatusRequest instance
     */
    @Nonnull
    public ManagedDeviceBulkSetCloudPcReviewStatusRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ManagedDeviceBulkSetCloudPcReviewStatusRequest request = new ManagedDeviceBulkSetCloudPcReviewStatusRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
