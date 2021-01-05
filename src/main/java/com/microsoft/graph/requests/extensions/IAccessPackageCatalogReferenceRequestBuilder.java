// Template Source: IBaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageCatalog;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AccessPackageCatalog;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Catalog Reference Request Builder.
 */
public interface IAccessPackageCatalogReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAccessPackageCatalogReferenceRequest instance
     */
    IAccessPackageCatalogReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAccessPackageCatalogReferenceRequest instance
     */
    IAccessPackageCatalogReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
