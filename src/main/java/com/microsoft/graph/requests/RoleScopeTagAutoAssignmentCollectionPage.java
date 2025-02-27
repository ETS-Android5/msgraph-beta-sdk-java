// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.RoleScopeTagAutoAssignment;
import com.microsoft.graph.requests.RoleScopeTagAutoAssignmentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.RoleScopeTagAutoAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag Auto Assignment Collection Page.
 */
public class RoleScopeTagAutoAssignmentCollectionPage extends BaseCollectionPage<RoleScopeTagAutoAssignment, RoleScopeTagAutoAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for RoleScopeTagAutoAssignment
     *
     * @param response the serialized RoleScopeTagAutoAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RoleScopeTagAutoAssignmentCollectionPage(@Nonnull final RoleScopeTagAutoAssignmentCollectionResponse response, @Nonnull final RoleScopeTagAutoAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for RoleScopeTagAutoAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public RoleScopeTagAutoAssignmentCollectionPage(@Nonnull final java.util.List<RoleScopeTagAutoAssignment> pageContents, @Nullable final RoleScopeTagAutoAssignmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
