// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.PolicySetAssignment;
import com.microsoft.graph.requests.PolicySetAssignmentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.PolicySetAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Set Assignment Collection Page.
 */
public class PolicySetAssignmentCollectionPage extends BaseCollectionPage<PolicySetAssignment, PolicySetAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for PolicySetAssignment
     *
     * @param response the serialized PolicySetAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PolicySetAssignmentCollectionPage(@Nonnull final PolicySetAssignmentCollectionResponse response, @Nonnull final PolicySetAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PolicySetAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PolicySetAssignmentCollectionPage(@Nonnull final java.util.List<PolicySetAssignment> pageContents, @Nullable final PolicySetAssignmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
