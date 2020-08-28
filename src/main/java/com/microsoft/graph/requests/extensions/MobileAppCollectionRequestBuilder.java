// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.MobileAppAssignment;
import com.microsoft.graph.models.extensions.MobileAppRelationship;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.MobileAppRelationshipState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCollectionRequest;
import com.microsoft.graph.requests.extensions.IMobileAppValidateXmlRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppGetMobileAppCountRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppGetTopMobileAppsCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Collection Request Builder.
 */
public class MobileAppCollectionRequestBuilder extends BaseRequestBuilder implements IMobileAppCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IMobileAppCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IMobileAppCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new MobileAppCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMobileAppRequestBuilder byId(final String id) {
        return new MobileAppRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IMobileAppValidateXmlRequestBuilder validateXml(final byte[] officeConfigurationXml) {
        return new MobileAppValidateXmlRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validateXml"), getClient(), null, officeConfigurationXml);
    }

    public IMobileAppHasPayloadLinksCollectionRequestBuilder hasPayloadLinks(final java.util.List<String> payloadIds) {
        return new MobileAppHasPayloadLinksCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.hasPayloadLinks"), getClient(), null, payloadIds);
    }

    public IMobileAppGetMobileAppCountRequestBuilder getMobileAppCount(final String status) {
        return new MobileAppGetMobileAppCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMobileAppCount"), getClient(), null, status);
    }

    public IMobileAppGetTopMobileAppsCollectionRequestBuilder getTopMobileApps(final String status, final Long count) {
        return new MobileAppGetTopMobileAppsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getTopMobileApps"), getClient(), null, status, count);
    }
}
