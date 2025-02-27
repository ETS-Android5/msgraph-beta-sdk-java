// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.CloudPcUserSetting;
import com.microsoft.graph.requests.CloudPcUserSettingCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.CloudPcUserSettingCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc User Setting Collection Page.
 */
public class CloudPcUserSettingCollectionPage extends BaseCollectionPage<CloudPcUserSetting, CloudPcUserSettingCollectionRequestBuilder> {

    /**
     * A collection page for CloudPcUserSetting
     *
     * @param response the serialized CloudPcUserSettingCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CloudPcUserSettingCollectionPage(@Nonnull final CloudPcUserSettingCollectionResponse response, @Nonnull final CloudPcUserSettingCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for CloudPcUserSetting
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CloudPcUserSettingCollectionPage(@Nonnull final java.util.List<CloudPcUserSetting> pageContents, @Nullable final CloudPcUserSettingCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
