// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContentInfo;
import com.microsoft.graph.models.extensions.ClassificationResult;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IInformationProtectionLabelEvaluateClassificationResultsCollectionRequestBuilder;
import com.google.gson.JsonObject;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Information Protection Label Evaluate Classification Results Collection Page.
 */
public interface IInformationProtectionLabelEvaluateClassificationResultsCollectionPage extends IBaseCollectionPage<InformationProtectionAction, IInformationProtectionLabelEvaluateClassificationResultsCollectionRequestBuilder> {
}
