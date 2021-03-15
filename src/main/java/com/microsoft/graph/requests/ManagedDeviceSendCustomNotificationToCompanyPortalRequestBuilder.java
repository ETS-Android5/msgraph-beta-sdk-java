// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ManagedDeviceSendCustomNotificationToCompanyPortalRequest;
import com.microsoft.graph.models.ManagedDevice;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ManagedDeviceSendCustomNotificationToCompanyPortalParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Send Custom Notification To Company Portal Request Builder.
 */
public class ManagedDeviceSendCustomNotificationToCompanyPortalRequestBuilder extends BaseActionRequestBuilder<ManagedDevice> {

    /**
     * The request builder for this ManagedDeviceSendCustomNotificationToCompanyPortal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceSendCustomNotificationToCompanyPortalRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private ManagedDeviceSendCustomNotificationToCompanyPortalParameterSet body;
    /**
     * The request builder for this ManagedDeviceSendCustomNotificationToCompanyPortal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ManagedDeviceSendCustomNotificationToCompanyPortalRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ManagedDeviceSendCustomNotificationToCompanyPortalParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ManagedDeviceSendCustomNotificationToCompanyPortalRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceSendCustomNotificationToCompanyPortalRequest instance
     */
    @Nonnull
    public ManagedDeviceSendCustomNotificationToCompanyPortalRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedDeviceSendCustomNotificationToCompanyPortalRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceSendCustomNotificationToCompanyPortalRequest instance
     */
    @Nonnull
    public ManagedDeviceSendCustomNotificationToCompanyPortalRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ManagedDeviceSendCustomNotificationToCompanyPortalRequest request = new ManagedDeviceSendCustomNotificationToCompanyPortalRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
