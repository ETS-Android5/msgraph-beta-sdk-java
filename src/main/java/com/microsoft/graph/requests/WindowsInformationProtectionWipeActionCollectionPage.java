// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WindowsInformationProtectionWipeAction;
import com.microsoft.graph.requests.WindowsInformationProtectionWipeActionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.WindowsInformationProtectionWipeActionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Wipe Action Collection Page.
 */
public class WindowsInformationProtectionWipeActionCollectionPage extends BaseCollectionPage<WindowsInformationProtectionWipeAction, WindowsInformationProtectionWipeActionCollectionRequestBuilder> {

    /**
     * A collection page for WindowsInformationProtectionWipeAction
     *
     * @param response the serialized WindowsInformationProtectionWipeActionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsInformationProtectionWipeActionCollectionPage(@Nonnull final WindowsInformationProtectionWipeActionCollectionResponse response, @Nonnull final WindowsInformationProtectionWipeActionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WindowsInformationProtectionWipeAction
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WindowsInformationProtectionWipeActionCollectionPage(@Nonnull final java.util.List<WindowsInformationProtectionWipeAction> pageContents, @Nullable final WindowsInformationProtectionWipeActionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
