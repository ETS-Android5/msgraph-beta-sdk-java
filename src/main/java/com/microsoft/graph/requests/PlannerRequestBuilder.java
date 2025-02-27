// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Planner;
import com.microsoft.graph.requests.PlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.PlannerBucketRequestBuilder;
import com.microsoft.graph.requests.PlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.PlannerPlanRequestBuilder;
import com.microsoft.graph.requests.PlannerRosterCollectionRequestBuilder;
import com.microsoft.graph.requests.PlannerRosterRequestBuilder;
import com.microsoft.graph.requests.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.PlannerTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Request Builder.
 */
public class PlannerRequestBuilder extends BaseRequestBuilder<Planner> {

    /**
     * The request builder for the Planner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PlannerRequest instance
     */
    @Nonnull
    public PlannerRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PlannerRequest instance
     */
    @Nonnull
    public PlannerRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.PlannerRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the PlannerBucket collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PlannerBucketCollectionRequestBuilder buckets() {
        return new PlannerBucketCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("buckets"), getClient(), null);
    }

    /**
     * Gets a request builder for the PlannerBucket item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PlannerBucketRequestBuilder buckets(@Nonnull final String id) {
        return new PlannerBucketRequestBuilder(getRequestUrlWithAdditionalSegment("buckets") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PlannerPlan collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PlannerPlanCollectionRequestBuilder plans() {
        return new PlannerPlanCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("plans"), getClient(), null);
    }

    /**
     * Gets a request builder for the PlannerPlan item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PlannerPlanRequestBuilder plans(@Nonnull final String id) {
        return new PlannerPlanRequestBuilder(getRequestUrlWithAdditionalSegment("plans") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PlannerRoster collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PlannerRosterCollectionRequestBuilder rosters() {
        return new PlannerRosterCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rosters"), getClient(), null);
    }

    /**
     * Gets a request builder for the PlannerRoster item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PlannerRosterRequestBuilder rosters(@Nonnull final String id) {
        return new PlannerRosterRequestBuilder(getRequestUrlWithAdditionalSegment("rosters") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the PlannerTask collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PlannerTaskCollectionRequestBuilder tasks() {
        return new PlannerTaskCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tasks"), getClient(), null);
    }

    /**
     * Gets a request builder for the PlannerTask item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PlannerTaskRequestBuilder tasks(@Nonnull final String id) {
        return new PlannerTaskRequestBuilder(getRequestUrlWithAdditionalSegment("tasks") + "/" + id, getClient(), null);
    }
}
