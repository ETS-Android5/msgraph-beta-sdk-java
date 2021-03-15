
// Template Source: BaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageCatalog;
import com.microsoft.graph.requests.AccessPackageResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageResourceScopeRequestBuilder;
import com.microsoft.graph.requests.AccessPackageCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessPackageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Catalog Reference Request Builder.
 */
public class AccessPackageCatalogReferenceRequestBuilder extends BaseReferenceRequestBuilder<AccessPackageCatalog, AccessPackageCatalogReferenceRequest> {

    /**
     * The request builder for the AccessPackageCatalog
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageCatalogReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageCatalogReferenceRequest.class);
    }
}
