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
 * The class for the Cloud PCRename Parameter Set.
 */
public class CloudPCRenameParameterSet {
    /**
     * The display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;


    /**
     * Instiaciates a new CloudPCRenameParameterSet
     */
    public CloudPCRenameParameterSet() {}
    /**
     * Instiaciates a new CloudPCRenameParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected CloudPCRenameParameterSet(@Nonnull final CloudPCRenameParameterSetBuilder builder) {
        this.displayName = builder.displayName;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CloudPCRenameParameterSetBuilder newBuilder() {
        return new CloudPCRenameParameterSetBuilder();
    }
    /**
     * Fluent builder for the CloudPCRenameParameterSet
     */
    public static final class CloudPCRenameParameterSetBuilder {
        /**
         * The displayName parameter value
         */
        @Nullable
        protected String displayName;
        /**
         * Sets the DisplayName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CloudPCRenameParameterSetBuilder withDisplayName(@Nullable final String val) {
            this.displayName = val;
            return this;
        }
        /**
         * Instanciates a new CloudPCRenameParameterSetBuilder
         */
        @Nullable
        protected CloudPCRenameParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CloudPCRenameParameterSet build() {
            return new CloudPCRenameParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.displayName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("displayName", displayName));
        }
        return result;
    }
}
