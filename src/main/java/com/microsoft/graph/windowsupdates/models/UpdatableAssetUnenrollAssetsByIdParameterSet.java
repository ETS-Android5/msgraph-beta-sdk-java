// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;

import com.microsoft.graph.windowsupdates.models.UpdateCategory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Updatable Asset Unenroll Assets By Id Parameter Set.
 */
public class UpdatableAssetUnenrollAssetsByIdParameterSet {
    /**
     * The update Category.
     * 
     */
    @SerializedName(value = "updateCategory", alternate = {"UpdateCategory"})
    @Expose
	@Nullable
    public UpdateCategory updateCategory;

    /**
     * The member Entity Type.
     * 
     */
    @SerializedName(value = "memberEntityType", alternate = {"MemberEntityType"})
    @Expose
	@Nullable
    public String memberEntityType;

    /**
     * The ids.
     * 
     */
    @SerializedName(value = "ids", alternate = {"Ids"})
    @Expose
	@Nullable
    public java.util.List<String> ids;


    /**
     * Instiaciates a new UpdatableAssetUnenrollAssetsByIdParameterSet
     */
    public UpdatableAssetUnenrollAssetsByIdParameterSet() {}
    /**
     * Instiaciates a new UpdatableAssetUnenrollAssetsByIdParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected UpdatableAssetUnenrollAssetsByIdParameterSet(@Nonnull final UpdatableAssetUnenrollAssetsByIdParameterSetBuilder builder) {
        this.updateCategory = builder.updateCategory;
        this.memberEntityType = builder.memberEntityType;
        this.ids = builder.ids;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static UpdatableAssetUnenrollAssetsByIdParameterSetBuilder newBuilder() {
        return new UpdatableAssetUnenrollAssetsByIdParameterSetBuilder();
    }
    /**
     * Fluent builder for the UpdatableAssetUnenrollAssetsByIdParameterSet
     */
    public static final class UpdatableAssetUnenrollAssetsByIdParameterSetBuilder {
        /**
         * The updateCategory parameter value
         */
        @Nullable
        protected UpdateCategory updateCategory;
        /**
         * Sets the UpdateCategory
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UpdatableAssetUnenrollAssetsByIdParameterSetBuilder withUpdateCategory(@Nullable final UpdateCategory val) {
            this.updateCategory = val;
            return this;
        }
        /**
         * The memberEntityType parameter value
         */
        @Nullable
        protected String memberEntityType;
        /**
         * Sets the MemberEntityType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UpdatableAssetUnenrollAssetsByIdParameterSetBuilder withMemberEntityType(@Nullable final String val) {
            this.memberEntityType = val;
            return this;
        }
        /**
         * The ids parameter value
         */
        @Nullable
        protected java.util.List<String> ids;
        /**
         * Sets the Ids
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UpdatableAssetUnenrollAssetsByIdParameterSetBuilder withIds(@Nullable final java.util.List<String> val) {
            this.ids = val;
            return this;
        }
        /**
         * Instanciates a new UpdatableAssetUnenrollAssetsByIdParameterSetBuilder
         */
        @Nullable
        protected UpdatableAssetUnenrollAssetsByIdParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public UpdatableAssetUnenrollAssetsByIdParameterSet build() {
            return new UpdatableAssetUnenrollAssetsByIdParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.updateCategory != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("updateCategory", updateCategory));
        }
        if(this.memberEntityType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("memberEntityType", memberEntityType));
        }
        if(this.ids != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("ids", ids));
        }
        return result;
    }
}
