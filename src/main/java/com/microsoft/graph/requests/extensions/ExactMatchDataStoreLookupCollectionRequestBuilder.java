// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IExactMatchDataStoreLookupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchDataStoreLookupCollectionRequest;
import com.microsoft.graph.requests.extensions.ExactMatchDataStoreLookupCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Data Store Lookup Collection Request Builder.
 */
public class ExactMatchDataStoreLookupCollectionRequestBuilder extends BaseActionRequestBuilder implements IExactMatchDataStoreLookupCollectionRequestBuilder {

    /**
     * The request builder for this collection of ExactMatchDataStore
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param key the key
     * @param values the values
     * @param resultColumnNames the resultColumnNames
     */
    public ExactMatchDataStoreLookupCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String key, final java.util.List<String> values, final java.util.List<String> resultColumnNames) {
        super(requestUrl, client, requestOptions);
  	 if(key!=null){
			bodyParams.put("key", key);
		}
    	 if(values!=null){
			bodyParams.put("values", values);
		}
    	 if(resultColumnNames!=null){
			bodyParams.put("resultColumnNames", resultColumnNames);
		}
      }

    public IExactMatchDataStoreLookupCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IExactMatchDataStoreLookupCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ExactMatchDataStoreLookupCollectionRequest request = new ExactMatchDataStoreLookupCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("key")) {
            request.body.key = getParameter("key");
        }
        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }
        if (hasParameter("resultColumnNames")) {
            request.body.resultColumnNames = getParameter("resultColumnNames");
        }
  
        return request;
    }
}
