// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;
import com.microsoft.graph.ediscovery.models.DataSource;
import com.microsoft.graph.ediscovery.requests.DataSourceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.ediscovery.requests.DataSourceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Source Collection Page.
 */
public class DataSourceCollectionPage extends BaseCollectionPage<DataSource, DataSourceCollectionRequestBuilder> {

    /**
     * A collection page for DataSource
     *
     * @param response the serialized DataSourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DataSourceCollectionPage(@Nonnull final DataSourceCollectionResponse response, @Nonnull final DataSourceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DataSource
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DataSourceCollectionPage(@Nonnull final java.util.List<DataSource> pageContents, @Nullable final DataSourceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
