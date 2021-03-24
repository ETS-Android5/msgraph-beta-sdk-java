// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.ContentInfo;
import com.microsoft.graph.models.LabelingOptions;
import com.microsoft.graph.models.InformationProtectionAction;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Label Evaluate Application Parameter Set.
 */
public class InformationProtectionLabelEvaluateApplicationParameterSet {
    /**
     * The content Info.
     * 
     */
    @SerializedName(value = "contentInfo", alternate = {"ContentInfo"})
    @Expose
	@Nullable
    public ContentInfo contentInfo;

    /**
     * The labeling Options.
     * 
     */
    @SerializedName(value = "labelingOptions", alternate = {"LabelingOptions"})
    @Expose
	@Nullable
    public LabelingOptions labelingOptions;


    /**
     * Instiaciates a new InformationProtectionLabelEvaluateApplicationParameterSet
     */
    public InformationProtectionLabelEvaluateApplicationParameterSet() {}
    /**
     * Instiaciates a new InformationProtectionLabelEvaluateApplicationParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected InformationProtectionLabelEvaluateApplicationParameterSet(@Nonnull final InformationProtectionLabelEvaluateApplicationParameterSetBuilder builder) {
        this.contentInfo = builder.contentInfo;
        this.labelingOptions = builder.labelingOptions;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static InformationProtectionLabelEvaluateApplicationParameterSetBuilder newBuilder() {
        return new InformationProtectionLabelEvaluateApplicationParameterSetBuilder();
    }
    /**
     * Fluent builder for the InformationProtectionLabelEvaluateApplicationParameterSet
     */
    public static final class InformationProtectionLabelEvaluateApplicationParameterSetBuilder {
        /**
         * The contentInfo parameter value
         */
        @Nullable
        protected ContentInfo contentInfo;
        /**
         * Sets the ContentInfo
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public InformationProtectionLabelEvaluateApplicationParameterSetBuilder withContentInfo(@Nullable final ContentInfo val) {
            this.contentInfo = val;
            return this;
        }
        /**
         * The labelingOptions parameter value
         */
        @Nullable
        protected LabelingOptions labelingOptions;
        /**
         * Sets the LabelingOptions
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public InformationProtectionLabelEvaluateApplicationParameterSetBuilder withLabelingOptions(@Nullable final LabelingOptions val) {
            this.labelingOptions = val;
            return this;
        }
        /**
         * Instanciates a new InformationProtectionLabelEvaluateApplicationParameterSetBuilder
         */
        @Nullable
        protected InformationProtectionLabelEvaluateApplicationParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public InformationProtectionLabelEvaluateApplicationParameterSet build() {
            return new InformationProtectionLabelEvaluateApplicationParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.contentInfo != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("contentInfo", contentInfo));
        }
        if(this.labelingOptions != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("labelingOptions", labelingOptions));
        }
        return result;
    }
}
