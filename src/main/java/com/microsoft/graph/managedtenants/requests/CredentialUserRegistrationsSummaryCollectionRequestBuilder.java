// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.managedtenants.models.ManagedTenant;
import com.microsoft.graph.managedtenants.models.CredentialUserRegistrationsSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryCollectionRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryRequestBuilder;
import com.microsoft.graph.managedtenants.requests.CredentialUserRegistrationsSummaryCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Credential User Registrations Summary Collection Request Builder.
 */
public class CredentialUserRegistrationsSummaryCollectionRequestBuilder extends BaseCollectionRequestBuilder<CredentialUserRegistrationsSummary, CredentialUserRegistrationsSummaryRequestBuilder, CredentialUserRegistrationsSummaryCollectionResponse, CredentialUserRegistrationsSummaryCollectionPage, CredentialUserRegistrationsSummaryCollectionRequest> {

    /**
     * The request builder for this collection of ManagedTenant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CredentialUserRegistrationsSummaryCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CredentialUserRegistrationsSummaryRequestBuilder.class, CredentialUserRegistrationsSummaryCollectionRequest.class);
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
