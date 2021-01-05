// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.termstore.models.extensions.Set;
import com.microsoft.graph.termstore.requests.extensions.ITermCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ITermRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IGroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Set Request Builder.
 */
public interface ISetRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISetRequest instance
     */
    ISetRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISetRequest instance
     */
    ISetRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ITermCollectionRequestBuilder children();

    ITermRequestBuilder children(final String id);

    /**
     * Gets the request builder for Group
     *
     * @return the IGroupRequestBuilder instance
     */
    IGroupRequestBuilder parentGroup();

    IRelationCollectionRequestBuilder relations();

    IRelationRequestBuilder relations(final String id);

    ITermCollectionRequestBuilder terms();

    ITermRequestBuilder terms(final String id);

}