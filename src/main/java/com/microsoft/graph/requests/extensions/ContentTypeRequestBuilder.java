// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.requests.extensions.IContentTypeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnLinkCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnLinkRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnLinkCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnLinkRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type Request Builder.
 */
public class ContentTypeRequestBuilder extends BaseRequestBuilder implements IContentTypeRequestBuilder {

    /**
     * The request builder for the ContentType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContentTypeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IContentTypeRequest instance
     */
    public IContentTypeRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IContentTypeRequest instance
     */
    public IContentTypeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ContentTypeRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for ContentType
     *
     * @return the IContentTypeWithReferenceRequestBuilder instance
     */
    public IContentTypeWithReferenceRequestBuilder base() {
        return new ContentTypeWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("base"), getClient(), null);
    }
    public IContentTypeCollectionWithReferencesRequestBuilder baseTypes() {
        return new ContentTypeCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("baseTypes"), getClient(), null);
    }

    public IContentTypeWithReferenceRequestBuilder baseTypes(final String id) {
        return new ContentTypeWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("baseTypes") + "/" + id, getClient(), null);
    }
    public IColumnLinkCollectionRequestBuilder columnLinks() {
        return new ColumnLinkCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("columnLinks"), getClient(), null);
    }

    public IColumnLinkRequestBuilder columnLinks(final String id) {
        return new ColumnLinkRequestBuilder(getRequestUrlWithAdditionalSegment("columnLinks") + "/" + id, getClient(), null);
    }
    public IColumnDefinitionCollectionWithReferencesRequestBuilder columnPositions() {
        return new ColumnDefinitionCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("columnPositions"), getClient(), null);
    }

    public IColumnDefinitionWithReferenceRequestBuilder columnPositions(final String id) {
        return new ColumnDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("columnPositions") + "/" + id, getClient(), null);
    }
    public IColumnDefinitionCollectionRequestBuilder columns() {
        return new ColumnDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("columns"), getClient(), null);
    }

    public IColumnDefinitionRequestBuilder columns(final String id) {
        return new ColumnDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("columns") + "/" + id, getClient(), null);
    }

    public IContentTypePublishRequestBuilder publish() {
        return new ContentTypePublishRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.publish"), getClient(), null);
    }

    public IContentTypeUnpublishRequestBuilder unpublish() {
        return new ContentTypeUnpublishRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unpublish"), getClient(), null);
    }

    public IContentTypeAssociateWithHubSitesRequestBuilder associateWithHubSites(final java.util.List<String> hubSiteUrls, final Boolean propagateToExistingLists) {
        return new ContentTypeAssociateWithHubSitesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.associateWithHubSites"), getClient(), null, hubSiteUrls, propagateToExistingLists);
    }

    public IContentTypeCopyToDefaultContentLocationRequestBuilder copyToDefaultContentLocation(final ItemReference sourceFile, final String destinationFileName) {
        return new ContentTypeCopyToDefaultContentLocationRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copyToDefaultContentLocation"), getClient(), null, sourceFile, destinationFileName);
    }

    public IContentTypeIsPublishedRequestBuilder isPublished() {
        return new ContentTypeIsPublishedRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isPublished"), getClient(), null);
    }
}
