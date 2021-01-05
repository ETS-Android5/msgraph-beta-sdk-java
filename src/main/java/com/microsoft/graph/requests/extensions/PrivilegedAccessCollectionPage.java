// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrivilegedAccess;
import com.microsoft.graph.requests.extensions.IPrivilegedAccessCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedAccessCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedAccessCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Collection Page.
 */
public class PrivilegedAccessCollectionPage extends BaseCollectionPage<PrivilegedAccess, IPrivilegedAccessCollectionRequestBuilder> implements IPrivilegedAccessCollectionPage {

    /**
     * A collection page for PrivilegedAccess
     *
     * @param response the serialized PrivilegedAccessCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrivilegedAccessCollectionPage(final PrivilegedAccessCollectionResponse response, final IPrivilegedAccessCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
