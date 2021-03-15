// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DeviceManagementConfigurationPolicy;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DeviceManagementConfigurationPolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Policy Collection Page.
 */
public class DeviceManagementConfigurationPolicyCollectionPage extends BaseCollectionPage<DeviceManagementConfigurationPolicy, DeviceManagementConfigurationPolicyCollectionRequestBuilder> {

    /**
     * A collection page for DeviceManagementConfigurationPolicy
     *
     * @param response the serialized DeviceManagementConfigurationPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementConfigurationPolicyCollectionPage(@Nonnull final DeviceManagementConfigurationPolicyCollectionResponse response, @Nonnull final DeviceManagementConfigurationPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceManagementConfigurationPolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceManagementConfigurationPolicyCollectionPage(@Nonnull final java.util.List<DeviceManagementConfigurationPolicy> pageContents, @Nullable final DeviceManagementConfigurationPolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
