// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Office365ActiveUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetOffice365ActiveUserDetailCollectionPage;
import com.microsoft.graph.requests.ReportRootGetOffice365ActiveUserDetailCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Active User Detail Collection Page.
 */
public class ReportRootGetOffice365ActiveUserDetailCollectionPage extends BaseCollectionPage<Office365ActiveUserDetail, ReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder> {

    /**
     * A collection page for Office365ActiveUserDetail.
     *
     * @param response The serialized ReportRootGetOffice365ActiveUserDetailCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetOffice365ActiveUserDetailCollectionPage(@Nonnull final ReportRootGetOffice365ActiveUserDetailCollectionResponse response, @Nonnull final ReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetOffice365ActiveUserDetail
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetOffice365ActiveUserDetailCollectionPage(@Nonnull final java.util.List<Office365ActiveUserDetail> pageContents, @Nullable final ReportRootGetOffice365ActiveUserDetailCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
