// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PolicyRoot;
import com.microsoft.graph.models.HomeRealmDiscoveryPolicy;
import com.microsoft.graph.models.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionRequest;
import com.microsoft.graph.requests.DirectoryObjectValidatePropertiesRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectGetByIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectGetUserOwnedObjectsRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.DirectoryObjectValidatePropertiesParameterSet;
import com.microsoft.graph.models.DirectoryObjectCheckMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectCheckMemberObjectsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberObjectsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetByIdsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetUserOwnedObjectsParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Home Realm Discovery Policy Collection Request Builder.
 */
public class HomeRealmDiscoveryPolicyCollectionRequestBuilder extends BaseCollectionRequestBuilder<HomeRealmDiscoveryPolicy, HomeRealmDiscoveryPolicyRequestBuilder, HomeRealmDiscoveryPolicyCollectionResponse, HomeRealmDiscoveryPolicyCollectionPage, HomeRealmDiscoveryPolicyCollectionRequest> {

    /**
     * The request builder for this collection of PolicyRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HomeRealmDiscoveryPolicyCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, HomeRealmDiscoveryPolicyRequestBuilder.class, HomeRealmDiscoveryPolicyCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectValidatePropertiesRequestBuilder validateProperties(@Nonnull final DirectoryObjectValidatePropertiesParameterSet parameters) {
        return new DirectoryObjectValidatePropertiesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validateProperties"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetByIdsCollectionRequestBuilder getByIds(@Nonnull final DirectoryObjectGetByIdsParameterSet parameters) {
        return new DirectoryObjectGetByIdsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getByIds"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetUserOwnedObjectsRequestBuilder getUserOwnedObjects(@Nonnull final DirectoryObjectGetUserOwnedObjectsParameterSet parameters) {
        return new DirectoryObjectGetUserOwnedObjectsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getUserOwnedObjects"), getClient(), null, parameters);
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
