// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DelegatedAdminCustomer;
import com.microsoft.graph.requests.DelegatedAdminServiceManagementDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.DelegatedAdminServiceManagementDetailRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Delegated Admin Customer Request Builder.
 */
public class DelegatedAdminCustomerRequestBuilder extends BaseRequestBuilder<DelegatedAdminCustomer> {

    /**
     * The request builder for the DelegatedAdminCustomer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DelegatedAdminCustomerRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DelegatedAdminCustomerRequest instance
     */
    @Nonnull
    public DelegatedAdminCustomerRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DelegatedAdminCustomerRequest instance
     */
    @Nonnull
    public DelegatedAdminCustomerRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DelegatedAdminCustomerRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DelegatedAdminServiceManagementDetail collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DelegatedAdminServiceManagementDetailCollectionRequestBuilder serviceManagementDetails() {
        return new DelegatedAdminServiceManagementDetailCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("serviceManagementDetails"), getClient(), null);
    }

    /**
     * Gets a request builder for the DelegatedAdminServiceManagementDetail item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DelegatedAdminServiceManagementDetailRequestBuilder serviceManagementDetails(@Nonnull final String id) {
        return new DelegatedAdminServiceManagementDetailRequestBuilder(getRequestUrlWithAdditionalSegment("serviceManagementDetails") + "/" + id, getClient(), null);
    }
}
