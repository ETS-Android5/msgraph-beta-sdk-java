// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Policy Assignment Collection Page.
 */
public class TargetedManagedAppPolicyAssignmentCollectionPage extends BaseCollectionPage<TargetedManagedAppPolicyAssignment, TargetedManagedAppPolicyAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for TargetedManagedAppPolicyAssignment
     *
     * @param response the serialized TargetedManagedAppPolicyAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TargetedManagedAppPolicyAssignmentCollectionPage(@Nonnull final TargetedManagedAppPolicyAssignmentCollectionResponse response, @Nonnull final TargetedManagedAppPolicyAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for TargetedManagedAppPolicyAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TargetedManagedAppPolicyAssignmentCollectionPage(@Nonnull final java.util.List<TargetedManagedAppPolicyAssignment> pageContents, @Nullable final TargetedManagedAppPolicyAssignmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
