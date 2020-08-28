// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataClassificationService;
import com.microsoft.graph.models.extensions.ContentClassification;
import com.microsoft.graph.models.extensions.ExactMatchClassificationResult;
import com.microsoft.graph.requests.extensions.IExactMatchDataStoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchDataStoreRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitiveTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitiveTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IJobResponseBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IJobResponseBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.ITextClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITextClassificationRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileClassificationRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitivityLabelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitivityLabelRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchUploadAgentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchUploadAgentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Data Classification Service Request Builder.
 */
public interface IDataClassificationServiceRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDataClassificationServiceRequest instance
     */
    IDataClassificationServiceRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDataClassificationServiceRequest instance
     */
    IDataClassificationServiceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IExactMatchDataStoreCollectionRequestBuilder exactMatchDataStores();

    IExactMatchDataStoreRequestBuilder exactMatchDataStores(final String id);

    ISensitiveTypeCollectionRequestBuilder sensitiveTypes();

    ISensitiveTypeRequestBuilder sensitiveTypes(final String id);

    IJobResponseBaseCollectionRequestBuilder jobs();

    IJobResponseBaseRequestBuilder jobs(final String id);

    IJobResponseBaseCollectionRequestBuilder classifyFileJobs();

    IJobResponseBaseRequestBuilder classifyFileJobs(final String id);

    IJobResponseBaseCollectionRequestBuilder classifyTextJobs();

    IJobResponseBaseRequestBuilder classifyTextJobs(final String id);

    IJobResponseBaseCollectionRequestBuilder evaluateLabelJobs();

    IJobResponseBaseRequestBuilder evaluateLabelJobs(final String id);

    IJobResponseBaseCollectionRequestBuilder evaluateDlpPoliciesJobs();

    IJobResponseBaseRequestBuilder evaluateDlpPoliciesJobs(final String id);

    IJobResponseBaseCollectionRequestBuilder labelsAndPoliciesEvaluationJobs();

    IJobResponseBaseRequestBuilder labelsAndPoliciesEvaluationJobs(final String id);

    ITextClassificationRequestCollectionRequestBuilder classifyText();

    ITextClassificationRequestRequestBuilder classifyText(final String id);

    IFileClassificationRequestCollectionRequestBuilder classifyFile();

    IFileClassificationRequestRequestBuilder classifyFile(final String id);

    ISensitivityLabelCollectionRequestBuilder sensitivityLabels();

    ISensitivityLabelRequestBuilder sensitivityLabels(final String id);

    IExactMatchUploadAgentCollectionRequestBuilder exactMatchUploadAgents();

    IExactMatchUploadAgentRequestBuilder exactMatchUploadAgents(final String id);
    IDataClassificationServiceClassifyExactMatchesRequestBuilder classifyExactMatches(final String text, final String timeoutInMs, final java.util.List<String> sensitiveTypeIds, final java.util.List<ContentClassification> contentClassifications);

}