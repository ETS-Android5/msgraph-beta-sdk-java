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

import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequest;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Lob App Provisioning Configuration Has Payload Links Collection Request Builder.
 */
public class IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder extends BaseActionRequestBuilder implements IIosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder {

    /**
     * The request builder for this collection of IosLobAppProvisioningConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param payloadIds the payloadIds
     */
    public IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<String> payloadIds) {
        super(requestUrl, client, requestOptions);
  	 if(payloadIds!=null){
			bodyParams.put("payloadIds", payloadIds);
		}
      }

    public IIosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IIosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequest request = new IosLobAppProvisioningConfigurationHasPayloadLinksCollectionRequest(
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
