// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.HardwareConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.HardwareConfigurationAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.HardwareConfigurationAssignCollectionPage;
import com.microsoft.graph.requests.HardwareConfigurationAssignCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Hardware Configuration Assign Collection Page.
 */
public class HardwareConfigurationAssignCollectionPage extends BaseCollectionPage<HardwareConfigurationAssignment, HardwareConfigurationAssignCollectionRequestBuilder> {

    /**
     * A collection page for HardwareConfigurationAssignment.
     *
     * @param response The serialized HardwareConfigurationAssignCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public HardwareConfigurationAssignCollectionPage(@Nonnull final HardwareConfigurationAssignCollectionResponse response, @Nonnull final HardwareConfigurationAssignCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for HardwareConfigurationAssign
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public HardwareConfigurationAssignCollectionPage(@Nonnull final java.util.List<HardwareConfigurationAssignment> pageContents, @Nullable final HardwareConfigurationAssignCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
