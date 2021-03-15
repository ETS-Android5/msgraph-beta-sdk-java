// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.ContentClassification;
import com.microsoft.graph.models.ExactMatchClassificationResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Classification Service Classify Exact Matches Parameter Set.
 */
public class DataClassificationServiceClassifyExactMatchesParameterSet {
    /**
     * The text.
     * 
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public String text;

    /**
     * The timeout In Ms.
     * 
     */
    @SerializedName(value = "timeoutInMs", alternate = {"TimeoutInMs"})
    @Expose
	@Nullable
    public String timeoutInMs;

    /**
     * The sensitive Type Ids.
     * 
     */
    @SerializedName(value = "sensitiveTypeIds", alternate = {"SensitiveTypeIds"})
    @Expose
	@Nullable
    public java.util.List<String> sensitiveTypeIds;

    /**
     * The content Classifications.
     * 
     */
    @SerializedName(value = "contentClassifications", alternate = {"ContentClassifications"})
    @Expose
	@Nullable
    public java.util.List<ContentClassification> contentClassifications;


    /**
     * Instiaciates a new DataClassificationServiceClassifyExactMatchesParameterSet
     */
    public DataClassificationServiceClassifyExactMatchesParameterSet() {}
    /**
     * Instiaciates a new DataClassificationServiceClassifyExactMatchesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DataClassificationServiceClassifyExactMatchesParameterSet(@Nonnull final DataClassificationServiceClassifyExactMatchesParameterSetBuilder builder) {
        this.text = builder.text;
        this.timeoutInMs = builder.timeoutInMs;
        this.sensitiveTypeIds = builder.sensitiveTypeIds;
        this.contentClassifications = builder.contentClassifications;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DataClassificationServiceClassifyExactMatchesParameterSetBuilder newBuilder() {
        return new DataClassificationServiceClassifyExactMatchesParameterSetBuilder();
    }
    /**
     * Fluent builder for the DataClassificationServiceClassifyExactMatchesParameterSet
     */
    public static final class DataClassificationServiceClassifyExactMatchesParameterSetBuilder {
        /**
         * The text parameter value
         */
        @Nullable
        protected String text;
        /**
         * Sets the Text
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DataClassificationServiceClassifyExactMatchesParameterSetBuilder withText(@Nullable final String val) {
            this.text = val;
            return this;
        }
        /**
         * The timeoutInMs parameter value
         */
        @Nullable
        protected String timeoutInMs;
        /**
         * Sets the TimeoutInMs
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DataClassificationServiceClassifyExactMatchesParameterSetBuilder withTimeoutInMs(@Nullable final String val) {
            this.timeoutInMs = val;
            return this;
        }
        /**
         * The sensitiveTypeIds parameter value
         */
        @Nullable
        protected java.util.List<String> sensitiveTypeIds;
        /**
         * Sets the SensitiveTypeIds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DataClassificationServiceClassifyExactMatchesParameterSetBuilder withSensitiveTypeIds(@Nullable final java.util.List<String> val) {
            this.sensitiveTypeIds = val;
            return this;
        }
        /**
         * The contentClassifications parameter value
         */
        @Nullable
        protected java.util.List<ContentClassification> contentClassifications;
        /**
         * Sets the ContentClassifications
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DataClassificationServiceClassifyExactMatchesParameterSetBuilder withContentClassifications(@Nullable final java.util.List<ContentClassification> val) {
            this.contentClassifications = val;
            return this;
        }
        /**
         * Instanciates a new DataClassificationServiceClassifyExactMatchesParameterSetBuilder
         */
        @Nullable
        protected DataClassificationServiceClassifyExactMatchesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DataClassificationServiceClassifyExactMatchesParameterSet build() {
            return new DataClassificationServiceClassifyExactMatchesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.text != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("text", text));
        }
        if(this.timeoutInMs != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("timeoutInMs", timeoutInMs));
        }
        if(this.sensitiveTypeIds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("sensitiveTypeIds", sensitiveTypeIds));
        }
        if(this.contentClassifications != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("contentClassifications", contentClassifications));
        }
        return result;
    }
}
