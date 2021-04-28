// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DeviceManagementReusablePolicySetting;
import com.microsoft.graph.requests.DeviceManagementReusablePolicySettingCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DeviceManagementReusablePolicySettingCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reusable Policy Setting Collection Page.
 */
public class DeviceManagementReusablePolicySettingCollectionPage extends BaseCollectionPage<DeviceManagementReusablePolicySetting, DeviceManagementReusablePolicySettingCollectionRequestBuilder> {

    /**
     * A collection page for DeviceManagementReusablePolicySetting
     *
     * @param response the serialized DeviceManagementReusablePolicySettingCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementReusablePolicySettingCollectionPage(@Nonnull final DeviceManagementReusablePolicySettingCollectionResponse response, @Nonnull final DeviceManagementReusablePolicySettingCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceManagementReusablePolicySetting
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceManagementReusablePolicySettingCollectionPage(@Nonnull final java.util.List<DeviceManagementReusablePolicySetting> pageContents, @Nullable final DeviceManagementReusablePolicySettingCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
