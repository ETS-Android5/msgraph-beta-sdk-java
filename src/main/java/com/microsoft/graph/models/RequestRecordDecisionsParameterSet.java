// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Request Record Decisions Parameter Set.
 */
public class RequestRecordDecisionsParameterSet {
    /**
     * The review Result.
     * 
     */
    @SerializedName(value = "reviewResult", alternate = {"ReviewResult"})
    @Expose
	@Nullable
    public String reviewResult;

    /**
     * The justification.
     * 
     */
    @SerializedName(value = "justification", alternate = {"Justification"})
    @Expose
	@Nullable
    public String justification;


    /**
     * Instiaciates a new RequestRecordDecisionsParameterSet
     */
    public RequestRecordDecisionsParameterSet() {}
    /**
     * Instiaciates a new RequestRecordDecisionsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected RequestRecordDecisionsParameterSet(@Nonnull final RequestRecordDecisionsParameterSetBuilder builder) {
        this.reviewResult = builder.reviewResult;
        this.justification = builder.justification;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static RequestRecordDecisionsParameterSetBuilder newBuilder() {
        return new RequestRecordDecisionsParameterSetBuilder();
    }
    /**
     * Fluent builder for the RequestRecordDecisionsParameterSet
     */
    public static final class RequestRecordDecisionsParameterSetBuilder {
        /**
         * The reviewResult parameter value
         */
        @Nullable
        protected String reviewResult;
        /**
         * Sets the ReviewResult
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public RequestRecordDecisionsParameterSetBuilder withReviewResult(@Nullable final String val) {
            this.reviewResult = val;
            return this;
        }
        /**
         * The justification parameter value
         */
        @Nullable
        protected String justification;
        /**
         * Sets the Justification
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public RequestRecordDecisionsParameterSetBuilder withJustification(@Nullable final String val) {
            this.justification = val;
            return this;
        }
        /**
         * Instanciates a new RequestRecordDecisionsParameterSetBuilder
         */
        @Nullable
        protected RequestRecordDecisionsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public RequestRecordDecisionsParameterSet build() {
            return new RequestRecordDecisionsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.reviewResult != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("reviewResult", reviewResult));
        }
        if(this.justification != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("justification", justification));
        }
        return result;
    }
}
