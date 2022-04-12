// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AuditLogRoot;
import com.microsoft.graph.models.RestrictedSignIn;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.RestrictedSignInCollectionRequestBuilder;
import com.microsoft.graph.requests.RestrictedSignInRequestBuilder;
import com.microsoft.graph.requests.RestrictedSignInCollectionRequest;
import com.microsoft.graph.requests.SignInConfirmCompromisedRequestBuilder;
import com.microsoft.graph.requests.SignInConfirmSafeRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.SignInConfirmCompromisedParameterSet;
import com.microsoft.graph.models.SignInConfirmSafeParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Restricted Sign In Collection Request Builder.
 */
public class RestrictedSignInCollectionRequestBuilder extends BaseCollectionRequestBuilder<RestrictedSignIn, RestrictedSignInRequestBuilder, RestrictedSignInCollectionResponse, RestrictedSignInCollectionPage, RestrictedSignInCollectionRequest> {

    /**
     * The request builder for this collection of AuditLogRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RestrictedSignInCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RestrictedSignInRequestBuilder.class, RestrictedSignInCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public SignInConfirmCompromisedRequestBuilder confirmCompromised(@Nonnull final SignInConfirmCompromisedParameterSet parameters) {
        return new SignInConfirmCompromisedRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.confirmCompromised"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public SignInConfirmSafeRequestBuilder confirmSafe(@Nonnull final SignInConfirmSafeParameterSet parameters) {
        return new SignInConfirmSafeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.confirmSafe"), getClient(), null, parameters);
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
