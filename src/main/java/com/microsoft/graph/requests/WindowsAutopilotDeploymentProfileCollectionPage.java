// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WindowsAutopilotDeploymentProfile;
import com.microsoft.graph.requests.WindowsAutopilotDeploymentProfileCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.WindowsAutopilotDeploymentProfileCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Deployment Profile Collection Page.
 */
public class WindowsAutopilotDeploymentProfileCollectionPage extends BaseCollectionPage<WindowsAutopilotDeploymentProfile, WindowsAutopilotDeploymentProfileCollectionRequestBuilder> {

    /**
     * A collection page for WindowsAutopilotDeploymentProfile
     *
     * @param response the serialized WindowsAutopilotDeploymentProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsAutopilotDeploymentProfileCollectionPage(@Nonnull final WindowsAutopilotDeploymentProfileCollectionResponse response, @Nonnull final WindowsAutopilotDeploymentProfileCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WindowsAutopilotDeploymentProfile
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WindowsAutopilotDeploymentProfileCollectionPage(@Nonnull final java.util.List<WindowsAutopilotDeploymentProfile> pageContents, @Nullable final WindowsAutopilotDeploymentProfileCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
