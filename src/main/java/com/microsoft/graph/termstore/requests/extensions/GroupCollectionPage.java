// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;
import com.microsoft.graph.termstore.models.extensions.Group;
import com.microsoft.graph.termstore.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.termstore.requests.extensions.GroupCollectionPage;
import com.microsoft.graph.termstore.requests.extensions.GroupCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Collection Page.
 */
public class GroupCollectionPage extends BaseCollectionPage<Group, IGroupCollectionRequestBuilder> implements IGroupCollectionPage {

    /**
     * A collection page for Group
     *
     * @param response the serialized GroupCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupCollectionPage(final GroupCollectionResponse response, final IGroupCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
