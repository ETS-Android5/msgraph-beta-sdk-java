// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WindowsDriverUpdateProfileExecuteActionRequest;
import com.microsoft.graph.models.WindowsDriverUpdateProfile;
import com.microsoft.graph.models.DriverApprovalAction;
import com.microsoft.graph.models.BulkDriverActionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.WindowsDriverUpdateProfileExecuteActionParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Driver Update Profile Execute Action Request Builder.
 */
public class WindowsDriverUpdateProfileExecuteActionRequestBuilder extends BaseActionRequestBuilder<BulkDriverActionResult> {

    /**
     * The request builder for this WindowsDriverUpdateProfileExecuteAction
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsDriverUpdateProfileExecuteActionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private WindowsDriverUpdateProfileExecuteActionParameterSet body;
    /**
     * The request builder for this WindowsDriverUpdateProfileExecuteAction
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WindowsDriverUpdateProfileExecuteActionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WindowsDriverUpdateProfileExecuteActionParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WindowsDriverUpdateProfileExecuteActionRequest
     *
     * @param requestOptions the options for the request
     * @return the WindowsDriverUpdateProfileExecuteActionRequest instance
     */
    @Nonnull
    public WindowsDriverUpdateProfileExecuteActionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WindowsDriverUpdateProfileExecuteActionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WindowsDriverUpdateProfileExecuteActionRequest instance
     */
    @Nonnull
    public WindowsDriverUpdateProfileExecuteActionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WindowsDriverUpdateProfileExecuteActionRequest request = new WindowsDriverUpdateProfileExecuteActionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
