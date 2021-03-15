// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SiteUsageStorage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetSharePointSiteUsageStorageCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetSharePointSiteUsageStorageCollectionPage;
import com.microsoft.graph.requests.ReportRootGetSharePointSiteUsageStorageCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Share Point Site Usage Storage Collection Page.
 */
public class ReportRootGetSharePointSiteUsageStorageCollectionPage extends BaseCollectionPage<SiteUsageStorage, ReportRootGetSharePointSiteUsageStorageCollectionRequestBuilder> {

    /**
     * A collection page for SiteUsageStorage.
     *
     * @param response The serialized ReportRootGetSharePointSiteUsageStorageCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetSharePointSiteUsageStorageCollectionPage(@Nonnull final ReportRootGetSharePointSiteUsageStorageCollectionResponse response, @Nonnull final ReportRootGetSharePointSiteUsageStorageCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetSharePointSiteUsageStorage
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetSharePointSiteUsageStorageCollectionPage(@Nonnull final java.util.List<SiteUsageStorage> pageContents, @Nullable final ReportRootGetSharePointSiteUsageStorageCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
