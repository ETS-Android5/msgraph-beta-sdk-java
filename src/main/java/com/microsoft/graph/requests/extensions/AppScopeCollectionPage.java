// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AppScope;
import com.microsoft.graph.requests.extensions.IAppScopeCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AppScopeCollectionPage;
import com.microsoft.graph.requests.extensions.AppScopeCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Scope Collection Page.
 */
public class AppScopeCollectionPage extends BaseCollectionPage<AppScope, IAppScopeCollectionRequestBuilder> implements IAppScopeCollectionPage {

    /**
     * A collection page for AppScope
     *
     * @param response the serialized AppScopeCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AppScopeCollectionPage(final AppScopeCollectionResponse response, final IAppScopeCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
