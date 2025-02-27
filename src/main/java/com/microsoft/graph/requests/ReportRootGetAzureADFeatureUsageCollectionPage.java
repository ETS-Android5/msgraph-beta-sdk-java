// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AzureADFeatureUsage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetAzureADFeatureUsageCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetAzureADFeatureUsageCollectionPage;
import com.microsoft.graph.requests.ReportRootGetAzureADFeatureUsageCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Azure ADFeature Usage Collection Page.
 */
public class ReportRootGetAzureADFeatureUsageCollectionPage extends BaseCollectionPage<AzureADFeatureUsage, ReportRootGetAzureADFeatureUsageCollectionRequestBuilder> {

    /**
     * A collection page for AzureADFeatureUsage.
     *
     * @param response The serialized ReportRootGetAzureADFeatureUsageCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetAzureADFeatureUsageCollectionPage(@Nonnull final ReportRootGetAzureADFeatureUsageCollectionResponse response, @Nonnull final ReportRootGetAzureADFeatureUsageCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetAzureADFeatureUsage
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetAzureADFeatureUsageCollectionPage(@Nonnull final java.util.List<AzureADFeatureUsage> pageContents, @Nullable final ReportRootGetAzureADFeatureUsageCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
