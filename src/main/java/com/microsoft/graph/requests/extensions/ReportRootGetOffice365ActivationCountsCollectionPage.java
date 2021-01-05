// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365ActivationCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Activation Counts Collection Page.
 */
public class ReportRootGetOffice365ActivationCountsCollectionPage extends BaseCollectionPage<Office365ActivationCounts, IReportRootGetOffice365ActivationCountsCollectionRequestBuilder> implements IReportRootGetOffice365ActivationCountsCollectionPage {

    /**
     * A collection page for Office365ActivationCounts.
     *
     * @param response The serialized ReportRootGetOffice365ActivationCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetOffice365ActivationCountsCollectionPage(final ReportRootGetOffice365ActivationCountsCollectionResponse response, final IReportRootGetOffice365ActivationCountsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
