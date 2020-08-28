// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GovernanceResource;
import com.microsoft.graph.requests.extensions.IGovernanceResourceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.GovernanceResourceCollectionPage;
import com.microsoft.graph.requests.extensions.GovernanceResourceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Resource Collection Page.
 */
public class GovernanceResourceCollectionPage extends BaseCollectionPage<GovernanceResource, IGovernanceResourceCollectionRequestBuilder> implements IGovernanceResourceCollectionPage {

    /**
     * A collection page for GovernanceResource
     *
     * @param response the serialized GovernanceResourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GovernanceResourceCollectionPage(final GovernanceResourceCollectionResponse response, final IGovernanceResourceCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
