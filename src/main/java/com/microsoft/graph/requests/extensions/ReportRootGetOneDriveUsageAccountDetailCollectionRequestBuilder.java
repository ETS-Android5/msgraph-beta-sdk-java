// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OneDriveUsageAccountDetail;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountDetailCollectionRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageAccountDetailCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get One Drive Usage Account Detail Collection Request Builder.
 */
public class ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param date the date
     */
    public ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.microsoft.graph.models.extensions.DateOnly date) {
        super(requestUrl, client, requestOptions);
     	 if(date!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("date", date));
		}
      }
    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
     	 if(period!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IReportRootGetOneDriveUsageAccountDetailCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IReportRootGetOneDriveUsageAccountDetailCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetOneDriveUsageAccountDetailCollectionRequest request = new ReportRootGetOneDriveUsageAccountDetailCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
