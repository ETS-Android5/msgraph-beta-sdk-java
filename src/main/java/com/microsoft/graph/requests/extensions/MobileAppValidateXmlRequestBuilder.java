// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMobileAppValidateXmlRequest;
import com.microsoft.graph.requests.extensions.MobileAppValidateXmlRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Validate Xml Request Builder.
 */
public class MobileAppValidateXmlRequestBuilder extends BaseActionRequestBuilder implements IMobileAppValidateXmlRequestBuilder {

    /**
     * The request builder for this MobileAppValidateXml
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param officeConfigurationXml the officeConfigurationXml
     */
    public MobileAppValidateXmlRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final byte[] officeConfigurationXml) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("officeConfigurationXml", officeConfigurationXml);
    }

    /**
     * Creates the IMobileAppValidateXmlRequest
     *
     * @return the IMobileAppValidateXmlRequest instance
     */
    public IMobileAppValidateXmlRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMobileAppValidateXmlRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMobileAppValidateXmlRequest instance
     */
    public IMobileAppValidateXmlRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MobileAppValidateXmlRequest request = new MobileAppValidateXmlRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("officeConfigurationXml")) {
            request.body.officeConfigurationXml = getParameter("officeConfigurationXml");
        }

        return request;
    }
}
