// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ApprovalWorkflowProvider;
import com.microsoft.graph.requests.ApprovalWorkflowProviderCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ApprovalWorkflowProviderCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Workflow Provider Collection Page.
 */
public class ApprovalWorkflowProviderCollectionPage extends BaseCollectionPage<ApprovalWorkflowProvider, ApprovalWorkflowProviderCollectionRequestBuilder> {

    /**
     * A collection page for ApprovalWorkflowProvider
     *
     * @param response the serialized ApprovalWorkflowProviderCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ApprovalWorkflowProviderCollectionPage(@Nonnull final ApprovalWorkflowProviderCollectionResponse response, @Nonnull final ApprovalWorkflowProviderCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ApprovalWorkflowProvider
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ApprovalWorkflowProviderCollectionPage(@Nonnull final java.util.List<ApprovalWorkflowProvider> pageContents, @Nullable final ApprovalWorkflowProviderCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
