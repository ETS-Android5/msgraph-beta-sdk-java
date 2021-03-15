// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageAssignmentResourceRole;
import com.microsoft.graph.models.AccessPackageAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.AccessPackageAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentRequestBuilder;
import com.microsoft.graph.requests.AccessPackageAssignmentCollectionRequest;
import com.microsoft.graph.requests.AccessPackageAssignmentMyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Collection Request Builder.
 */
public class AccessPackageAssignmentCollectionRequestBuilder extends BaseCollectionRequestBuilder<AccessPackageAssignment, AccessPackageAssignmentRequestBuilder, AccessPackageAssignmentCollectionResponse, AccessPackageAssignmentCollectionPage, AccessPackageAssignmentCollectionRequest> {

    /**
     * The request builder for this collection of AccessPackageAssignmentResourceRole
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageAssignmentRequestBuilder.class, AccessPackageAssignmentCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public AccessPackageAssignmentMyCollectionRequestBuilder my() {
        return new AccessPackageAssignmentMyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.My"), getClient(), null);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
