// Template Source: IBaseEntityReferenceRequestBuilder.java.tt
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
import com.microsoft.graph.requests.extensions.IContentTypeCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnLinkCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnLinkRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ContentType;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Content Type Reference Request Builder.
 */
public interface IContentTypeReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IContentTypeReferenceRequest instance
     */
    IContentTypeReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IContentTypeReferenceRequest instance
     */
    IContentTypeReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
