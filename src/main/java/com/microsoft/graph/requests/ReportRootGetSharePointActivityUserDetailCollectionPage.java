// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SharePointActivityUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetSharePointActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetSharePointActivityUserDetailCollectionPage;
import com.microsoft.graph.requests.ReportRootGetSharePointActivityUserDetailCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Share Point Activity User Detail Collection Page.
 */
public class ReportRootGetSharePointActivityUserDetailCollectionPage extends BaseCollectionPage<SharePointActivityUserDetail, ReportRootGetSharePointActivityUserDetailCollectionRequestBuilder> {

    /**
     * A collection page for SharePointActivityUserDetail.
     *
     * @param response The serialized ReportRootGetSharePointActivityUserDetailCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetSharePointActivityUserDetailCollectionPage(@Nonnull final ReportRootGetSharePointActivityUserDetailCollectionResponse response, @Nonnull final ReportRootGetSharePointActivityUserDetailCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetSharePointActivityUserDetail
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetSharePointActivityUserDetailCollectionPage(@Nonnull final java.util.List<SharePointActivityUserDetail> pageContents, @Nullable final ReportRootGetSharePointActivityUserDetailCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
