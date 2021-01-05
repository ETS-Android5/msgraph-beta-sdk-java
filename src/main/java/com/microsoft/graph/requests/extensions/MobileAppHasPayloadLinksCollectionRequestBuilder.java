// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IMobileAppHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppHasPayloadLinksCollectionRequest;
import com.microsoft.graph.requests.extensions.MobileAppHasPayloadLinksCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Has Payload Links Collection Request Builder.
 */
public class MobileAppHasPayloadLinksCollectionRequestBuilder extends BaseActionRequestBuilder implements IMobileAppHasPayloadLinksCollectionRequestBuilder {

    /**
     * The request builder for this collection of MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param payloadIds the payloadIds
     */
    public MobileAppHasPayloadLinksCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<String> payloadIds) {
        super(requestUrl, client, requestOptions);
  	 if(payloadIds!=null){
			bodyParams.put("payloadIds", payloadIds);
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMobileAppHasPayloadLinksCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMobileAppHasPayloadLinksCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MobileAppHasPayloadLinksCollectionRequest request = new MobileAppHasPayloadLinksCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("payloadIds")) {
            request.body.payloadIds = getParameter("payloadIds");
        }
  
        return request;
    }
}
