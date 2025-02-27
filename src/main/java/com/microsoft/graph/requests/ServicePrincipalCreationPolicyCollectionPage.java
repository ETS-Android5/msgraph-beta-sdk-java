// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ServicePrincipalCreationPolicy;
import com.microsoft.graph.requests.ServicePrincipalCreationPolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ServicePrincipalCreationPolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Creation Policy Collection Page.
 */
public class ServicePrincipalCreationPolicyCollectionPage extends BaseCollectionPage<ServicePrincipalCreationPolicy, ServicePrincipalCreationPolicyCollectionRequestBuilder> {

    /**
     * A collection page for ServicePrincipalCreationPolicy
     *
     * @param response the serialized ServicePrincipalCreationPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ServicePrincipalCreationPolicyCollectionPage(@Nonnull final ServicePrincipalCreationPolicyCollectionResponse response, @Nonnull final ServicePrincipalCreationPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ServicePrincipalCreationPolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ServicePrincipalCreationPolicyCollectionPage(@Nonnull final java.util.List<ServicePrincipalCreationPolicy> pageContents, @Nullable final ServicePrincipalCreationPolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
