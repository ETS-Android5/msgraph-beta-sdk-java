// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageAssignmentRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestMyCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestMyCollectionPage;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestMyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Request My Collection Page.
 */
public class AccessPackageAssignmentRequestMyCollectionPage extends BaseCollectionPage<AccessPackageAssignmentRequest, AccessPackageAssignmentRequestMyCollectionRequestBuilder> {

    /**
     * A collection page for AccessPackageAssignmentRequest.
     *
     * @param response The serialized AccessPackageAssignmentRequestMyCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public AccessPackageAssignmentRequestMyCollectionPage(@Nonnull final AccessPackageAssignmentRequestMyCollectionResponse response, @Nonnull final AccessPackageAssignmentRequestMyCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for AccessPackageAssignmentRequestMy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AccessPackageAssignmentRequestMyCollectionPage(@Nonnull final java.util.List<AccessPackageAssignmentRequest> pageContents, @Nullable final AccessPackageAssignmentRequestMyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
