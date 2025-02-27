// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.SourceCollection;
import com.microsoft.graph.ediscovery.requests.DataSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.DataSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.AddToReviewSetOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.DataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.DataSourceWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.EstimateStatisticsOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.NoncustodialDataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.NoncustodialDataSourceWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Source Collection Request Builder.
 */
public class SourceCollectionRequestBuilder extends BaseRequestBuilder<SourceCollection> {

    /**
     * The request builder for the SourceCollection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SourceCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SourceCollectionRequest instance
     */
    @Nonnull
    public SourceCollectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SourceCollectionRequest instance
     */
    @Nonnull
    public SourceCollectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.ediscovery.requests.SourceCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DataSource collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DataSourceCollectionRequestBuilder additionalSources() {
        return new DataSourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("additionalSources"), getClient(), null);
    }

    /**
     * Gets a request builder for the DataSource item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DataSourceRequestBuilder additionalSources(@Nonnull final String id) {
        return new DataSourceRequestBuilder(getRequestUrlWithAdditionalSegment("additionalSources") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AddToReviewSetOperation
     *
     * @return the AddToReviewSetOperationWithReferenceRequestBuilder instance
     */
    @Nonnull
    public AddToReviewSetOperationWithReferenceRequestBuilder addToReviewSetOperation() {
        return new AddToReviewSetOperationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("addToReviewSetOperation"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DataSource collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DataSourceCollectionWithReferencesRequestBuilder custodianSources() {
        return new DataSourceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("custodianSources"), getClient(), null);
    }

    /**
     * Gets a request builder for the DataSource item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DataSourceWithReferenceRequestBuilder custodianSources(@Nonnull final String id) {
        return new DataSourceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("custodianSources") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EstimateStatisticsOperation
     *
     * @return the EstimateStatisticsOperationWithReferenceRequestBuilder instance
     */
    @Nonnull
    public EstimateStatisticsOperationWithReferenceRequestBuilder lastEstimateStatisticsOperation() {
        return new EstimateStatisticsOperationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastEstimateStatisticsOperation"), getClient(), null);
    }
    /**
     *  Gets a request builder for the NoncustodialDataSource collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public NoncustodialDataSourceCollectionWithReferencesRequestBuilder noncustodialSources() {
        return new NoncustodialDataSourceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("noncustodialSources"), getClient(), null);
    }

    /**
     * Gets a request builder for the NoncustodialDataSource item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public NoncustodialDataSourceWithReferenceRequestBuilder noncustodialSources(@Nonnull final String id) {
        return new NoncustodialDataSourceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("noncustodialSources") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public SourceCollectionEstimateStatisticsRequestBuilder estimateStatistics() {
        return new SourceCollectionEstimateStatisticsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.estimateStatistics"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public SourceCollectionPurgeDataRequestBuilder purgeData() {
        return new SourceCollectionPurgeDataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.purgeData"), getClient(), null);
    }
}
