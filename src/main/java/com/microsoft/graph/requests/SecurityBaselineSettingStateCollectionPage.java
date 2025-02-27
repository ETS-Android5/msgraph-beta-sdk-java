// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.SecurityBaselineSettingState;
import com.microsoft.graph.requests.SecurityBaselineSettingStateCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.SecurityBaselineSettingStateCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline Setting State Collection Page.
 */
public class SecurityBaselineSettingStateCollectionPage extends BaseCollectionPage<SecurityBaselineSettingState, SecurityBaselineSettingStateCollectionRequestBuilder> {

    /**
     * A collection page for SecurityBaselineSettingState
     *
     * @param response the serialized SecurityBaselineSettingStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SecurityBaselineSettingStateCollectionPage(@Nonnull final SecurityBaselineSettingStateCollectionResponse response, @Nonnull final SecurityBaselineSettingStateCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for SecurityBaselineSettingState
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SecurityBaselineSettingStateCollectionPage(@Nonnull final java.util.List<SecurityBaselineSettingState> pageContents, @Nullable final SecurityBaselineSettingStateCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
