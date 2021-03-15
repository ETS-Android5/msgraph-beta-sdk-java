// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OneDriveUsageAccountDetail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetOneDriveUsageAccountDetailCollectionPage;
import com.microsoft.graph.requests.ReportRootGetOneDriveUsageAccountDetailCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get One Drive Usage Account Detail Collection Page.
 */
public class ReportRootGetOneDriveUsageAccountDetailCollectionPage extends BaseCollectionPage<OneDriveUsageAccountDetail, ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder> {

    /**
     * A collection page for OneDriveUsageAccountDetail.
     *
     * @param response The serialized ReportRootGetOneDriveUsageAccountDetailCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetOneDriveUsageAccountDetailCollectionPage(@Nonnull final ReportRootGetOneDriveUsageAccountDetailCollectionResponse response, @Nonnull final ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetOneDriveUsageAccountDetail
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetOneDriveUsageAccountDetailCollectionPage(@Nonnull final java.util.List<OneDriveUsageAccountDetail> pageContents, @Nullable final ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
