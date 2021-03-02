// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SmsAuthenticationMethodTarget;
import com.microsoft.graph.requests.extensions.ISmsAuthenticationMethodTargetCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SmsAuthenticationMethodTargetCollectionPage;
import com.microsoft.graph.requests.extensions.SmsAuthenticationMethodTargetCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sms Authentication Method Target Collection Page.
 */
public class SmsAuthenticationMethodTargetCollectionPage extends BaseCollectionPage<SmsAuthenticationMethodTarget, ISmsAuthenticationMethodTargetCollectionRequestBuilder> implements ISmsAuthenticationMethodTargetCollectionPage {

    /**
     * A collection page for SmsAuthenticationMethodTarget
     *
     * @param response the serialized SmsAuthenticationMethodTargetCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SmsAuthenticationMethodTargetCollectionPage(final SmsAuthenticationMethodTargetCollectionResponse response, final ISmsAuthenticationMethodTargetCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
