// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;
import com.microsoft.graph.managedtenants.models.AggregatedPolicyCompliance;
import com.microsoft.graph.managedtenants.requests.AggregatedPolicyComplianceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.managedtenants.requests.AggregatedPolicyComplianceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Aggregated Policy Compliance Collection Page.
 */
public class AggregatedPolicyComplianceCollectionPage extends BaseCollectionPage<AggregatedPolicyCompliance, AggregatedPolicyComplianceCollectionRequestBuilder> {

    /**
     * A collection page for AggregatedPolicyCompliance
     *
     * @param response the serialized AggregatedPolicyComplianceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AggregatedPolicyComplianceCollectionPage(@Nonnull final AggregatedPolicyComplianceCollectionResponse response, @Nonnull final AggregatedPolicyComplianceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AggregatedPolicyCompliance
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AggregatedPolicyComplianceCollectionPage(@Nonnull final java.util.List<AggregatedPolicyCompliance> pageContents, @Nullable final AggregatedPolicyComplianceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
