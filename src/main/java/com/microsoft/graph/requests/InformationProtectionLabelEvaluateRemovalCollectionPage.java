// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ContentInfo;
import com.microsoft.graph.models.DowngradeJustification;
import com.microsoft.graph.models.InformationProtectionAction;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.InformationProtectionLabelEvaluateRemovalCollectionRequestBuilder;
import com.microsoft.graph.requests.InformationProtectionLabelEvaluateRemovalCollectionPage;
import com.microsoft.graph.requests.InformationProtectionLabelEvaluateRemovalCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Label Evaluate Removal Collection Page.
 * @deprecated This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs.
 */
@Deprecated
public class InformationProtectionLabelEvaluateRemovalCollectionPage extends BaseCollectionPage<InformationProtectionAction, InformationProtectionLabelEvaluateRemovalCollectionRequestBuilder> {

    /**
     * A collection page for InformationProtectionAction.
     *
     * @param response The serialized InformationProtectionLabelEvaluateRemovalCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public InformationProtectionLabelEvaluateRemovalCollectionPage(@Nonnull final InformationProtectionLabelEvaluateRemovalCollectionResponse response, @Nonnull final InformationProtectionLabelEvaluateRemovalCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for InformationProtectionLabelEvaluateRemoval
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public InformationProtectionLabelEvaluateRemovalCollectionPage(@Nonnull final java.util.List<InformationProtectionAction> pageContents, @Nullable final InformationProtectionLabelEvaluateRemovalCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
