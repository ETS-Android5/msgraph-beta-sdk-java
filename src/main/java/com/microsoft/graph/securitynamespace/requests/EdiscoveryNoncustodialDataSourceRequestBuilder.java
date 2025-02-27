// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryNoncustodialDataSource;
import com.microsoft.graph.security.requests.DataSourceRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryIndexOperationWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Noncustodial Data Source Request Builder.
 */
public class EdiscoveryNoncustodialDataSourceRequestBuilder extends BaseRequestBuilder<EdiscoveryNoncustodialDataSource> {

    /**
     * The request builder for the EdiscoveryNoncustodialDataSource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryNoncustodialDataSourceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EdiscoveryNoncustodialDataSourceRequest instance
     */
    @Nonnull
    public EdiscoveryNoncustodialDataSourceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EdiscoveryNoncustodialDataSourceRequest instance
     */
    @Nonnull
    public EdiscoveryNoncustodialDataSourceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceRequest(getRequestUrl(), getClient(), requestOptions);
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
     * Gets the request builder for EdiscoveryIndexOperation
     *
     * @return the EdiscoveryIndexOperationWithReferenceRequestBuilder instance
     */
    @Nonnull
    public EdiscoveryIndexOperationWithReferenceRequestBuilder lastIndexOperation() {
        return new EdiscoveryIndexOperationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastIndexOperation"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EdiscoveryNoncustodialDataSourceApplyHoldRequestBuilder applyHold() {
        return new EdiscoveryNoncustodialDataSourceApplyHoldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.applyHold"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EdiscoveryNoncustodialDataSourceReleaseRequestBuilder release() {
        return new EdiscoveryNoncustodialDataSourceReleaseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.release"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EdiscoveryNoncustodialDataSourceRemoveHoldRequestBuilder removeHold() {
        return new EdiscoveryNoncustodialDataSourceRemoveHoldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.removeHold"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EdiscoveryNoncustodialDataSourceUpdateIndexRequestBuilder updateIndex() {
        return new EdiscoveryNoncustodialDataSourceUpdateIndexRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.updateIndex"), getClient(), null);
    }
}
