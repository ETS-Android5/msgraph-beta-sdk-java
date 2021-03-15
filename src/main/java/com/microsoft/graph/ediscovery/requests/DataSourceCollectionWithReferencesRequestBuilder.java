// Template Source: BaseEntityCollectionWithReferencesRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.SourceCollection;
import com.microsoft.graph.ediscovery.models.DataSource;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Source Collection With References Request Builder.
 */
public class DataSourceCollectionWithReferencesRequestBuilder extends BaseCollectionWithReferencesRequestBuilder<DataSource, DataSourceWithReferenceRequest, DataSourceReferenceRequestBuilder, DataSourceWithReferenceRequestBuilder, DataSourceCollectionResponse, DataSourceCollectionWithReferencesPage, DataSourceCollectionReferenceRequest, DataSourceCollectionReferenceRequestBuilder> {

    /**
     * The request builder for this collection of SourceCollection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataSourceCollectionWithReferencesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataSourceReferenceRequestBuilder.class, DataSourceCollectionReferenceRequest.class, DataSourceCollectionReferenceRequestBuilder.class);
    }
}
