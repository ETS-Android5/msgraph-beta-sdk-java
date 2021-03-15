// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DeviceManagementIntentUpdateSettingsRequest;
import com.microsoft.graph.models.DeviceManagementIntent;
import com.microsoft.graph.models.DeviceManagementSettingInstance;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.DeviceManagementIntentUpdateSettingsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Update Settings Request Builder.
 */
public class DeviceManagementIntentUpdateSettingsRequestBuilder extends BaseActionRequestBuilder<DeviceManagementIntent> {

    /**
     * The request builder for this DeviceManagementIntentUpdateSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntentUpdateSettingsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private DeviceManagementIntentUpdateSettingsParameterSet body;
    /**
     * The request builder for this DeviceManagementIntentUpdateSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementIntentUpdateSettingsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementIntentUpdateSettingsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceManagementIntentUpdateSettingsRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementIntentUpdateSettingsRequest instance
     */
    @Nonnull
    public DeviceManagementIntentUpdateSettingsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceManagementIntentUpdateSettingsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementIntentUpdateSettingsRequest instance
     */
    @Nonnull
    public DeviceManagementIntentUpdateSettingsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceManagementIntentUpdateSettingsRequest request = new DeviceManagementIntentUpdateSettingsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
