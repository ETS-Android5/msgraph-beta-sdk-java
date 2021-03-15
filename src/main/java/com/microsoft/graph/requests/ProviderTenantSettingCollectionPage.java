// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ProviderTenantSetting;
import com.microsoft.graph.requests.ProviderTenantSettingCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ProviderTenantSettingCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Provider Tenant Setting Collection Page.
 */
public class ProviderTenantSettingCollectionPage extends BaseCollectionPage<ProviderTenantSetting, ProviderTenantSettingCollectionRequestBuilder> {

    /**
     * A collection page for ProviderTenantSetting
     *
     * @param response the serialized ProviderTenantSettingCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ProviderTenantSettingCollectionPage(@Nonnull final ProviderTenantSettingCollectionResponse response, @Nonnull final ProviderTenantSettingCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ProviderTenantSetting
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ProviderTenantSettingCollectionPage(@Nonnull final java.util.List<ProviderTenantSetting> pageContents, @Nullable final ProviderTenantSettingCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
