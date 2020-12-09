// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Case;
import com.microsoft.graph.requests.extensions.ICaseCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.CaseCollectionPage;
import com.microsoft.graph.requests.extensions.CaseCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Case Collection Page.
 */
public class CaseCollectionPage extends BaseCollectionPage<Case, ICaseCollectionRequestBuilder> implements ICaseCollectionPage {

    /**
     * A collection page for Case
     *
     * @param response the serialized CaseCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CaseCollectionPage(final CaseCollectionResponse response, final ICaseCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
