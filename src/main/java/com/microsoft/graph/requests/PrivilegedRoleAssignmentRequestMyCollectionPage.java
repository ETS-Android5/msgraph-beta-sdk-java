// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PrivilegedRoleAssignmentRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.PrivilegedRoleAssignmentRequestMyCollectionRequestBuilder;
import com.microsoft.graph.requests.PrivilegedRoleAssignmentRequestMyCollectionPage;
import com.microsoft.graph.requests.PrivilegedRoleAssignmentRequestMyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Request My Collection Page.
 */
public class PrivilegedRoleAssignmentRequestMyCollectionPage extends BaseCollectionPage<PrivilegedRoleAssignmentRequest, PrivilegedRoleAssignmentRequestMyCollectionRequestBuilder> {

    /**
     * A collection page for PrivilegedRoleAssignmentRequest.
     *
     * @param response The serialized PrivilegedRoleAssignmentRequestMyCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public PrivilegedRoleAssignmentRequestMyCollectionPage(@Nonnull final PrivilegedRoleAssignmentRequestMyCollectionResponse response, @Nonnull final PrivilegedRoleAssignmentRequestMyCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for PrivilegedRoleAssignmentRequestMy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PrivilegedRoleAssignmentRequestMyCollectionPage(@Nonnull final java.util.List<PrivilegedRoleAssignmentRequest> pageContents, @Nullable final PrivilegedRoleAssignmentRequestMyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
