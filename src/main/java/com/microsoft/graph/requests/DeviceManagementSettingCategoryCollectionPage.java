// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DeviceManagementSettingCategory;
import com.microsoft.graph.requests.DeviceManagementSettingCategoryCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DeviceManagementSettingCategoryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Setting Category Collection Page.
 */
public class DeviceManagementSettingCategoryCollectionPage extends BaseCollectionPage<DeviceManagementSettingCategory, DeviceManagementSettingCategoryCollectionRequestBuilder> {

    /**
     * A collection page for DeviceManagementSettingCategory
     *
     * @param response the serialized DeviceManagementSettingCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementSettingCategoryCollectionPage(@Nonnull final DeviceManagementSettingCategoryCollectionResponse response, @Nonnull final DeviceManagementSettingCategoryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceManagementSettingCategory
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceManagementSettingCategoryCollectionPage(@Nonnull final java.util.List<DeviceManagementSettingCategory> pageContents, @Nullable final DeviceManagementSettingCategoryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
