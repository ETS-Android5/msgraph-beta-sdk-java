// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.requests.DeviceManagementScriptGroupAssignmentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DeviceManagementScriptGroupAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Group Assignment Collection Page.
 */
public class DeviceManagementScriptGroupAssignmentCollectionPage extends BaseCollectionPage<DeviceManagementScriptGroupAssignment, DeviceManagementScriptGroupAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for DeviceManagementScriptGroupAssignment
     *
     * @param response the serialized DeviceManagementScriptGroupAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementScriptGroupAssignmentCollectionPage(@Nonnull final DeviceManagementScriptGroupAssignmentCollectionResponse response, @Nonnull final DeviceManagementScriptGroupAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceManagementScriptGroupAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceManagementScriptGroupAssignmentCollectionPage(@Nonnull final java.util.List<DeviceManagementScriptGroupAssignment> pageContents, @Nullable final DeviceManagementScriptGroupAssignmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
