// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;

import com.microsoft.graph.windowsupdates.models.UpdateCategory;
import com.microsoft.graph.windowsupdates.models.UpdatableAsset;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Updatable Asset Unenroll Assets Parameter Set.
 */
public class UpdatableAssetUnenrollAssetsParameterSet {
    /**
     * The update Category.
     * 
     */
    @SerializedName(value = "updateCategory", alternate = {"UpdateCategory"})
    @Expose
	@Nullable
    public UpdateCategory updateCategory;

    /**
     * The assets.
     * 
     */
    @SerializedName(value = "assets", alternate = {"Assets"})
    @Expose
	@Nullable
    public java.util.List<UpdatableAsset> assets;


    /**
     * Instiaciates a new UpdatableAssetUnenrollAssetsParameterSet
     */
    public UpdatableAssetUnenrollAssetsParameterSet() {}
    /**
     * Instiaciates a new UpdatableAssetUnenrollAssetsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected UpdatableAssetUnenrollAssetsParameterSet(@Nonnull final UpdatableAssetUnenrollAssetsParameterSetBuilder builder) {
        this.updateCategory = builder.updateCategory;
        this.assets = builder.assets;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static UpdatableAssetUnenrollAssetsParameterSetBuilder newBuilder() {
        return new UpdatableAssetUnenrollAssetsParameterSetBuilder();
    }
    /**
     * Fluent builder for the UpdatableAssetUnenrollAssetsParameterSet
     */
    public static final class UpdatableAssetUnenrollAssetsParameterSetBuilder {
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
        public UpdatableAssetUnenrollAssetsParameterSetBuilder withUpdateCategory(@Nullable final UpdateCategory val) {
            this.updateCategory = val;
            return this;
        }
        /**
         * The assets parameter value
         */
        @Nullable
        protected java.util.List<UpdatableAsset> assets;
        /**
         * Sets the Assets
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UpdatableAssetUnenrollAssetsParameterSetBuilder withAssets(@Nullable final java.util.List<UpdatableAsset> val) {
            this.assets = val;
            return this;
        }
        /**
         * Instanciates a new UpdatableAssetUnenrollAssetsParameterSetBuilder
         */
        @Nullable
        protected UpdatableAssetUnenrollAssetsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public UpdatableAssetUnenrollAssetsParameterSet build() {
            return new UpdatableAssetUnenrollAssetsParameterSet(this);
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
        if(this.assets != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("assets", assets));
        }
        return result;
    }
}
