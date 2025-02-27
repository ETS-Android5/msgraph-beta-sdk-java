// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageAssignmentPolicy;
import com.microsoft.graph.requests.AccessPackageWithReferenceRequestBuilder;
import com.microsoft.graph.requests.AccessPackageCatalogRequestBuilder;
import com.microsoft.graph.requests.CustomExtensionHandlerCollectionRequestBuilder;
import com.microsoft.graph.requests.CustomExtensionHandlerRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Policy Request Builder.
 */
public class AccessPackageAssignmentPolicyRequestBuilder extends BaseRequestBuilder<AccessPackageAssignmentPolicy> {

    /**
     * The request builder for the AccessPackageAssignmentPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentPolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AccessPackageAssignmentPolicyRequest instance
     */
    @Nonnull
    public AccessPackageAssignmentPolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AccessPackageAssignmentPolicyRequest instance
     */
    @Nonnull
    public AccessPackageAssignmentPolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AccessPackageAssignmentPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AccessPackage
     *
     * @return the AccessPackageWithReferenceRequestBuilder instance
     */
    @Nonnull
    public AccessPackageWithReferenceRequestBuilder accessPackage() {
        return new AccessPackageWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackage"), getClient(), null);
    }

    /**
     * Gets the request builder for AccessPackageCatalog
     *
     * @return the AccessPackageCatalogRequestBuilder instance
     */
    @Nonnull
    public AccessPackageCatalogRequestBuilder accessPackageCatalog() {
        return new AccessPackageCatalogRequestBuilder(getRequestUrlWithAdditionalSegment("accessPackageCatalog"), getClient(), null);
    }
    /**
     *  Gets a request builder for the CustomExtensionHandler collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CustomExtensionHandlerCollectionRequestBuilder customExtensionHandlers() {
        return new CustomExtensionHandlerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("customExtensionHandlers"), getClient(), null);
    }

    /**
     * Gets a request builder for the CustomExtensionHandler item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CustomExtensionHandlerRequestBuilder customExtensionHandlers(@Nonnull final String id) {
        return new CustomExtensionHandlerRequestBuilder(getRequestUrlWithAdditionalSegment("customExtensionHandlers") + "/" + id, getClient(), null);
    }
}
