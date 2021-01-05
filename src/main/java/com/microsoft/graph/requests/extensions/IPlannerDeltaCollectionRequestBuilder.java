// Template Source: IBaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerUser;
import com.microsoft.graph.models.extensions.PlannerDelta;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPlannerDeltaRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.IPlannerDeltaDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Delta Collection Request Builder.
 */
public interface IPlannerDeltaCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IPlannerDeltaCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IPlannerDeltaCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IPlannerDeltaRequestBuilder byId(final String id);


    IPlannerDeltaDeltaCollectionRequestBuilder delta();

	IPlannerDeltaDeltaCollectionRequestBuilder delta(final String deltaLink);
}
