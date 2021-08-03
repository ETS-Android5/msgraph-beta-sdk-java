// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceAppManagement;
import com.microsoft.graph.models.AndroidManagedAppProtection;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.models.ManagedMobileApp;
import com.microsoft.graph.models.TargetedManagedAppGroupType;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.AndroidManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.AndroidManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.AndroidManagedAppProtectionCollectionRequest;
import com.microsoft.graph.requests.AndroidManagedAppProtectionHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.AndroidManagedAppProtectionHasPayloadLinksParameterSet;
import com.microsoft.graph.models.TargetedManagedAppProtectionAssignParameterSet;
import com.microsoft.graph.models.TargetedManagedAppProtectionTargetAppsParameterSet;
import com.microsoft.graph.models.ManagedAppProtectionTargetAppsParameterSet;
import com.microsoft.graph.models.ManagedAppPolicyTargetAppsParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed App Protection Collection Request Builder.
 */
public class AndroidManagedAppProtectionCollectionRequestBuilder extends BaseCollectionRequestBuilder<AndroidManagedAppProtection, AndroidManagedAppProtectionRequestBuilder, AndroidManagedAppProtectionCollectionResponse, AndroidManagedAppProtectionCollectionPage, AndroidManagedAppProtectionCollectionRequest> {

    /**
     * The request builder for this collection of DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedAppProtectionCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidManagedAppProtectionRequestBuilder.class, AndroidManagedAppProtectionCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AndroidManagedAppProtectionHasPayloadLinksCollectionRequestBuilder hasPayloadLinks(@Nonnull final AndroidManagedAppProtectionHasPayloadLinksParameterSet parameters) {
        return new AndroidManagedAppProtectionHasPayloadLinksCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hasPayloadLinks"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
