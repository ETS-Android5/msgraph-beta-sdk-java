// Template Source: IBaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.requests.extensions.IItemAnalyticsWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IBaseItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBaseItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IListRequestBuilder;
import com.microsoft.graph.requests.extensions.ISitePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISitePageRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Site;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Site Reference Request Builder.
 */
public interface ISiteReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISiteReferenceRequest instance
     */
    ISiteReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISiteReferenceRequest instance
     */
    ISiteReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
