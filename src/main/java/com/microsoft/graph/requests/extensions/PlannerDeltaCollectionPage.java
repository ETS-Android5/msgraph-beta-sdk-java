// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerDelta;
import com.microsoft.graph.requests.extensions.IPlannerDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Delta Collection Page.
 */
public class PlannerDeltaCollectionPage extends BaseCollectionPage<PlannerDelta, IPlannerDeltaCollectionRequestBuilder> implements IPlannerDeltaCollectionPage {

    /**
     * A collection page for PlannerDelta
     *
     * @param response the serialized PlannerDeltaCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PlannerDeltaCollectionPage(final PlannerDeltaCollectionResponse response, final IPlannerDeltaCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
