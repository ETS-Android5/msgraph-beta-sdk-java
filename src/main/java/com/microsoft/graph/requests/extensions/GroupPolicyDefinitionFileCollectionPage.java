// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionFile;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition File Collection Page.
 */
public class GroupPolicyDefinitionFileCollectionPage extends BaseCollectionPage<GroupPolicyDefinitionFile, IGroupPolicyDefinitionFileCollectionRequestBuilder> implements IGroupPolicyDefinitionFileCollectionPage {

    /**
     * A collection page for GroupPolicyDefinitionFile
     *
     * @param response the serialized GroupPolicyDefinitionFileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicyDefinitionFileCollectionPage(final GroupPolicyDefinitionFileCollectionResponse response, final IGroupPolicyDefinitionFileCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
