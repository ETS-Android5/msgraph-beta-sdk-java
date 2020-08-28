// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionValueCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition Value Collection Page.
 */
public class GroupPolicyDefinitionValueCollectionPage extends BaseCollectionPage<GroupPolicyDefinitionValue, IGroupPolicyDefinitionValueCollectionRequestBuilder> implements IGroupPolicyDefinitionValueCollectionPage {

    /**
     * A collection page for GroupPolicyDefinitionValue
     *
     * @param response the serialized GroupPolicyDefinitionValueCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicyDefinitionValueCollectionPage(final GroupPolicyDefinitionValueCollectionResponse response, final IGroupPolicyDefinitionValueCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
