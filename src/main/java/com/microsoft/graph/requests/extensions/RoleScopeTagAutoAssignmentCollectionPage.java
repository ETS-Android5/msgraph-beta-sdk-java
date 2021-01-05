// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RoleScopeTagAutoAssignment;
import com.microsoft.graph.requests.extensions.IRoleScopeTagAutoAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.RoleScopeTagAutoAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.RoleScopeTagAutoAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag Auto Assignment Collection Page.
 */
public class RoleScopeTagAutoAssignmentCollectionPage extends BaseCollectionPage<RoleScopeTagAutoAssignment, IRoleScopeTagAutoAssignmentCollectionRequestBuilder> implements IRoleScopeTagAutoAssignmentCollectionPage {

    /**
     * A collection page for RoleScopeTagAutoAssignment
     *
     * @param response the serialized RoleScopeTagAutoAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RoleScopeTagAutoAssignmentCollectionPage(final RoleScopeTagAutoAssignmentCollectionResponse response, final IRoleScopeTagAutoAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
