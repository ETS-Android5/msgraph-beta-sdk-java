// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ArchivedPrintJob;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetGroupArchivedPrintJobsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetGroupArchivedPrintJobsCollectionRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetGroupArchivedPrintJobsCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Group Archived Print Jobs Collection Request Builder.
 */
public class ReportRootGetGroupArchivedPrintJobsCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetGroupArchivedPrintJobsCollectionRequestBuilder {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param groupId the groupId
     * @param periodStart the periodStart
     * @param periodEnd the periodEnd
     */
    public ReportRootGetGroupArchivedPrintJobsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String groupId, final java.util.Calendar periodStart, final java.util.Calendar periodEnd) {
        super(requestUrl, client, requestOptions);
     	 if(groupId!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("groupId", groupId));
		}
       	 if(periodStart!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("periodStart", periodStart));
		}
       	 if(periodEnd!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("periodEnd", periodEnd));
		}
      }

    public IReportRootGetGroupArchivedPrintJobsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IReportRootGetGroupArchivedPrintJobsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetGroupArchivedPrintJobsCollectionRequest request = new ReportRootGetGroupArchivedPrintJobsCollectionRequest(
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
