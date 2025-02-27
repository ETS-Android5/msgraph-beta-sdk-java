// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.SecurityBaselineDeviceState;
import com.microsoft.graph.requests.SecurityBaselineDeviceStateCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.SecurityBaselineDeviceStateCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline Device State Collection Page.
 */
public class SecurityBaselineDeviceStateCollectionPage extends BaseCollectionPage<SecurityBaselineDeviceState, SecurityBaselineDeviceStateCollectionRequestBuilder> {

    /**
     * A collection page for SecurityBaselineDeviceState
     *
     * @param response the serialized SecurityBaselineDeviceStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SecurityBaselineDeviceStateCollectionPage(@Nonnull final SecurityBaselineDeviceStateCollectionResponse response, @Nonnull final SecurityBaselineDeviceStateCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for SecurityBaselineDeviceState
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SecurityBaselineDeviceStateCollectionPage(@Nonnull final java.util.List<SecurityBaselineDeviceState> pageContents, @Nullable final SecurityBaselineDeviceStateCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
