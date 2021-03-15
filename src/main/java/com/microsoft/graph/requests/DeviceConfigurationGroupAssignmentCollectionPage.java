// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.requests.DeviceConfigurationGroupAssignmentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DeviceConfigurationGroupAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Group Assignment Collection Page.
 */
public class DeviceConfigurationGroupAssignmentCollectionPage extends BaseCollectionPage<DeviceConfigurationGroupAssignment, DeviceConfigurationGroupAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for DeviceConfigurationGroupAssignment
     *
     * @param response the serialized DeviceConfigurationGroupAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceConfigurationGroupAssignmentCollectionPage(@Nonnull final DeviceConfigurationGroupAssignmentCollectionResponse response, @Nonnull final DeviceConfigurationGroupAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceConfigurationGroupAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceConfigurationGroupAssignmentCollectionPage(@Nonnull final java.util.List<DeviceConfigurationGroupAssignment> pageContents, @Nullable final DeviceConfigurationGroupAssignmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
