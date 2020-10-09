// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRbacResourceAction;
import com.microsoft.graph.requests.extensions.IUnifiedRbacResourceActionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRbacResourceActionCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRbacResourceActionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Rbac Resource Action Collection Page.
 */
public class UnifiedRbacResourceActionCollectionPage extends BaseCollectionPage<UnifiedRbacResourceAction, IUnifiedRbacResourceActionCollectionRequestBuilder> implements IUnifiedRbacResourceActionCollectionPage {

    /**
     * A collection page for UnifiedRbacResourceAction
     *
     * @param response the serialized UnifiedRbacResourceActionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UnifiedRbacResourceActionCollectionPage(final UnifiedRbacResourceActionCollectionResponse response, final IUnifiedRbacResourceActionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
