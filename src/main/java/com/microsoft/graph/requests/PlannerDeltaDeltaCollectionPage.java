// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PlannerDelta;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.PlannerDeltaDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.PlannerDeltaDeltaCollectionPage;
import com.microsoft.graph.requests.PlannerDeltaDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Delta Delta Collection Page.
 */
public class PlannerDeltaDeltaCollectionPage extends DeltaCollectionPage<PlannerDelta, PlannerDeltaDeltaCollectionRequestBuilder> {

    /**
     * A collection page for PlannerDelta.
     *
     * @param response The serialized PlannerDeltaDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public PlannerDeltaDeltaCollectionPage(@Nonnull final PlannerDeltaDeltaCollectionResponse response, @Nonnull final PlannerDeltaDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for PlannerDeltaDelta
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PlannerDeltaDeltaCollectionPage(@Nonnull final java.util.List<PlannerDelta> pageContents, @Nullable final PlannerDeltaDeltaCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
