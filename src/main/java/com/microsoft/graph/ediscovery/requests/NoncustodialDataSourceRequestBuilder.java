// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.NoncustodialDataSource;
import com.microsoft.graph.ediscovery.requests.DataSourceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Noncustodial Data Source Request Builder.
 */
public class NoncustodialDataSourceRequestBuilder extends BaseRequestBuilder<NoncustodialDataSource> {

    /**
     * The request builder for the NoncustodialDataSource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NoncustodialDataSourceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the NoncustodialDataSourceRequest instance
     */
    @Nonnull
    public NoncustodialDataSourceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the NoncustodialDataSourceRequest instance
     */
    @Nonnull
    public NoncustodialDataSourceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.ediscovery.requests.NoncustodialDataSourceRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for CaseIndexOperation
     *
     * @return the CaseIndexOperationWithReferenceRequestBuilder instance
     */
    @Nonnull
    public CaseIndexOperationWithReferenceRequestBuilder lastIndexOperation() {
        return new CaseIndexOperationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastIndexOperation"), getClient(), null);
    }

    /**
     * Gets the request builder for DataSource
     *
     * @return the DataSourceRequestBuilder instance
     */
    @Nonnull
    public DataSourceRequestBuilder dataSource() {
        return new DataSourceRequestBuilder(getRequestUrlWithAdditionalSegment("dataSource"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public NoncustodialDataSourceReleaseRequestBuilder release() {
        return new NoncustodialDataSourceReleaseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.release"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public NoncustodialDataSourceUpdateIndexRequestBuilder updateIndex() {
        return new NoncustodialDataSourceUpdateIndexRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.updateIndex"), getClient(), null);
    }
}
