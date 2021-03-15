// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.GroupPolicyOperation;
import com.microsoft.graph.requests.GroupPolicyOperationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.GroupPolicyOperationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Operation Collection Page.
 */
public class GroupPolicyOperationCollectionPage extends BaseCollectionPage<GroupPolicyOperation, GroupPolicyOperationCollectionRequestBuilder> {

    /**
     * A collection page for GroupPolicyOperation
     *
     * @param response the serialized GroupPolicyOperationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicyOperationCollectionPage(@Nonnull final GroupPolicyOperationCollectionResponse response, @Nonnull final GroupPolicyOperationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for GroupPolicyOperation
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public GroupPolicyOperationCollectionPage(@Nonnull final java.util.List<GroupPolicyOperation> pageContents, @Nullable final GroupPolicyOperationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
