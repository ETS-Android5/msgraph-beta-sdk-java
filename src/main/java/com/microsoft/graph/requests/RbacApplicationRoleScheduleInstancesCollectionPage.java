// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleScheduleInstanceBase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.RbacApplicationRoleScheduleInstancesCollectionRequestBuilder;
import com.microsoft.graph.requests.RbacApplicationRoleScheduleInstancesCollectionPage;
import com.microsoft.graph.requests.RbacApplicationRoleScheduleInstancesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Rbac Application Role Schedule Instances Collection Page.
 */
public class RbacApplicationRoleScheduleInstancesCollectionPage extends BaseCollectionPage<UnifiedRoleScheduleInstanceBase, RbacApplicationRoleScheduleInstancesCollectionRequestBuilder> {

    /**
     * A collection page for UnifiedRoleScheduleInstanceBase.
     *
     * @param response The serialized RbacApplicationRoleScheduleInstancesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public RbacApplicationRoleScheduleInstancesCollectionPage(@Nonnull final RbacApplicationRoleScheduleInstancesCollectionResponse response, @Nonnull final RbacApplicationRoleScheduleInstancesCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for RbacApplicationRoleScheduleInstances
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public RbacApplicationRoleScheduleInstancesCollectionPage(@Nonnull final java.util.List<UnifiedRoleScheduleInstanceBase> pageContents, @Nullable final RbacApplicationRoleScheduleInstancesCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
