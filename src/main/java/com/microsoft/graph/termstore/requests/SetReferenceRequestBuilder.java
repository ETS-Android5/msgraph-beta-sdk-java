
// Template Source: BaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.termstore.models.Set;
import com.microsoft.graph.termstore.requests.TermCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.TermRequestBuilder;
import com.microsoft.graph.termstore.requests.GroupRequestBuilder;
import com.microsoft.graph.termstore.requests.RelationCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.RelationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Set Reference Request Builder.
 */
public class SetReferenceRequestBuilder extends BaseReferenceRequestBuilder<Set, SetReferenceRequest> {

    /**
     * The request builder for the Set
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SetReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SetReferenceRequest.class);
    }
}
