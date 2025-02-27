// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.MacOSSoftwareUpdateStateSummary;
import com.microsoft.graph.requests.MacOSSoftwareUpdateStateSummaryCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.MacOSSoftwareUpdateStateSummaryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update State Summary Collection Page.
 */
public class MacOSSoftwareUpdateStateSummaryCollectionPage extends BaseCollectionPage<MacOSSoftwareUpdateStateSummary, MacOSSoftwareUpdateStateSummaryCollectionRequestBuilder> {

    /**
     * A collection page for MacOSSoftwareUpdateStateSummary
     *
     * @param response the serialized MacOSSoftwareUpdateStateSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MacOSSoftwareUpdateStateSummaryCollectionPage(@Nonnull final MacOSSoftwareUpdateStateSummaryCollectionResponse response, @Nonnull final MacOSSoftwareUpdateStateSummaryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MacOSSoftwareUpdateStateSummary
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MacOSSoftwareUpdateStateSummaryCollectionPage(@Nonnull final java.util.List<MacOSSoftwareUpdateStateSummary> pageContents, @Nullable final MacOSSoftwareUpdateStateSummaryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
