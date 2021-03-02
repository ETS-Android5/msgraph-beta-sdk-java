// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.ApprovalFilterByCurrentUserOptions;
import com.microsoft.graph.models.extensions.Approval;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IApprovalFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApprovalFilterByCurrentUserCollectionPage;
import com.microsoft.graph.requests.extensions.ApprovalFilterByCurrentUserCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Filter By Current User Collection Page.
 */
public class ApprovalFilterByCurrentUserCollectionPage extends BaseCollectionPage<Approval, IApprovalFilterByCurrentUserCollectionRequestBuilder> implements IApprovalFilterByCurrentUserCollectionPage {

    /**
     * A collection page for Approval.
     *
     * @param response The serialized ApprovalFilterByCurrentUserCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ApprovalFilterByCurrentUserCollectionPage(final ApprovalFilterByCurrentUserCollectionResponse response, final IApprovalFilterByCurrentUserCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
