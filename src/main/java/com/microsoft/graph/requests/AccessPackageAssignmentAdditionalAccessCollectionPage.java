// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.AccessPackageAssignmentAdditionalAccessCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentAdditionalAccessCollectionPage;
import com.microsoft.graph.requests.AccessPackageAssignmentAdditionalAccessCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Additional Access Collection Page.
 */
public class AccessPackageAssignmentAdditionalAccessCollectionPage extends BaseCollectionPage<AccessPackageAssignment, AccessPackageAssignmentAdditionalAccessCollectionRequestBuilder> {

    /**
     * A collection page for AccessPackageAssignment.
     *
     * @param response The serialized AccessPackageAssignmentAdditionalAccessCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public AccessPackageAssignmentAdditionalAccessCollectionPage(@Nonnull final AccessPackageAssignmentAdditionalAccessCollectionResponse response, @Nonnull final AccessPackageAssignmentAdditionalAccessCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for AccessPackageAssignmentAdditionalAccess
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AccessPackageAssignmentAdditionalAccessCollectionPage(@Nonnull final java.util.List<AccessPackageAssignment> pageContents, @Nullable final AccessPackageAssignmentAdditionalAccessCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
