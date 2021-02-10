// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.SourceCollection;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.DataSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.DataSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IAddToReviewSetOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.AddToReviewSetOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.DataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.DataSourceWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IEstimateStatisticsOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.EstimateStatisticsOperationWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Source Collection Request Builder.
 */
public class SourceCollectionRequestBuilder extends BaseRequestBuilder implements ISourceCollectionRequestBuilder {

    /**
     * The request builder for the SourceCollection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SourceCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISourceCollectionRequest instance
     */
    public ISourceCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISourceCollectionRequest instance
     */
    public ISourceCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.ediscovery.requests.extensions.SourceCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDataSourceCollectionRequestBuilder additionalSources() {
        return new DataSourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("additionalSources"), getClient(), null);
    }

    public IDataSourceRequestBuilder additionalSources(final String id) {
        return new DataSourceRequestBuilder(getRequestUrlWithAdditionalSegment("additionalSources") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AddToReviewSetOperation
     *
     * @return the IAddToReviewSetOperationWithReferenceRequestBuilder instance
     */
    public IAddToReviewSetOperationWithReferenceRequestBuilder addToReviewSetOperation() {
        return new AddToReviewSetOperationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("addToReviewSetOperation"), getClient(), null);
    }
    public IDataSourceCollectionWithReferencesRequestBuilder custodianSources() {
        return new DataSourceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("custodianSources"), getClient(), null);
    }

    public IDataSourceWithReferenceRequestBuilder custodianSources(final String id) {
        return new DataSourceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("custodianSources") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EstimateStatisticsOperation
     *
     * @return the IEstimateStatisticsOperationWithReferenceRequestBuilder instance
     */
    public IEstimateStatisticsOperationWithReferenceRequestBuilder lastEstimateStatisticsOperation() {
        return new EstimateStatisticsOperationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastEstimateStatisticsOperation"), getClient(), null);
    }
    public IDataSourceCollectionWithReferencesRequestBuilder noncustodialSources() {
        return new DataSourceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("noncustodialSources"), getClient(), null);
    }

    public IDataSourceWithReferenceRequestBuilder noncustodialSources(final String id) {
        return new DataSourceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("noncustodialSources") + "/" + id, getClient(), null);
    }

    public ISourceCollectionEstimateStatisticsRequestBuilder estimateStatistics() {
        return new SourceCollectionEstimateStatisticsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.estimateStatistics"), getClient(), null);
    }
}
