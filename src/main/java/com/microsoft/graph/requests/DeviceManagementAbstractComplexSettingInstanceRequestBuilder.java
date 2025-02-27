// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementAbstractComplexSettingInstance;
import com.microsoft.graph.requests.DeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementSettingInstanceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Abstract Complex Setting Instance Request Builder.
 */
public class DeviceManagementAbstractComplexSettingInstanceRequestBuilder extends BaseRequestBuilder<DeviceManagementAbstractComplexSettingInstance> {

    /**
     * The request builder for the DeviceManagementAbstractComplexSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementAbstractComplexSettingInstanceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementAbstractComplexSettingInstanceRequest instance
     */
    @Nonnull
    public DeviceManagementAbstractComplexSettingInstanceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementAbstractComplexSettingInstanceRequest instance
     */
    @Nonnull
    public DeviceManagementAbstractComplexSettingInstanceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DeviceManagementAbstractComplexSettingInstanceRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DeviceManagementSettingInstance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementSettingInstanceCollectionRequestBuilder value() {
        return new DeviceManagementSettingInstanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("value"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementSettingInstance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementSettingInstanceRequestBuilder value(@Nonnull final String id) {
        return new DeviceManagementSettingInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("value") + "/" + id, getClient(), null);
    }
}
