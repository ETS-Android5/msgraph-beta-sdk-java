// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DeviceConfigurationState;
import com.microsoft.graph.requests.DeviceConfigurationStateCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DeviceConfigurationStateCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration State Collection Page.
 */
public class DeviceConfigurationStateCollectionPage extends BaseCollectionPage<DeviceConfigurationState, DeviceConfigurationStateCollectionRequestBuilder> {

    /**
     * A collection page for DeviceConfigurationState
     *
     * @param response the serialized DeviceConfigurationStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceConfigurationStateCollectionPage(@Nonnull final DeviceConfigurationStateCollectionResponse response, @Nonnull final DeviceConfigurationStateCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceConfigurationState
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceConfigurationStateCollectionPage(@Nonnull final java.util.List<DeviceConfigurationState> pageContents, @Nullable final DeviceConfigurationStateCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
