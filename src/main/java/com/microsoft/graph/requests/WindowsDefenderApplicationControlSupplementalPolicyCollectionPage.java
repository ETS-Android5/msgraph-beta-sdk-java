// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WindowsDefenderApplicationControlSupplementalPolicy;
import com.microsoft.graph.requests.WindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.WindowsDefenderApplicationControlSupplementalPolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Collection Page.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyCollectionPage extends BaseCollectionPage<WindowsDefenderApplicationControlSupplementalPolicy, WindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder> {

    /**
     * A collection page for WindowsDefenderApplicationControlSupplementalPolicy
     *
     * @param response the serialized WindowsDefenderApplicationControlSupplementalPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsDefenderApplicationControlSupplementalPolicyCollectionPage(@Nonnull final WindowsDefenderApplicationControlSupplementalPolicyCollectionResponse response, @Nonnull final WindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WindowsDefenderApplicationControlSupplementalPolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WindowsDefenderApplicationControlSupplementalPolicyCollectionPage(@Nonnull final java.util.List<WindowsDefenderApplicationControlSupplementalPolicy> pageContents, @Nullable final WindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
