// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.ContentType;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type Add Copy Parameter Set.
 */
public class ContentTypeAddCopyParameterSet {
    /**
     * The content Type.
     * 
     */
    @SerializedName(value = "contentType", alternate = {"ContentType"})
    @Expose
	@Nullable
    public String contentType;


    /**
     * Instiaciates a new ContentTypeAddCopyParameterSet
     */
    public ContentTypeAddCopyParameterSet() {}
    /**
     * Instiaciates a new ContentTypeAddCopyParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ContentTypeAddCopyParameterSet(@Nonnull final ContentTypeAddCopyParameterSetBuilder builder) {
        this.contentType = builder.contentType;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ContentTypeAddCopyParameterSetBuilder newBuilder() {
        return new ContentTypeAddCopyParameterSetBuilder();
    }
    /**
     * Fluent builder for the ContentTypeAddCopyParameterSet
     */
    public static final class ContentTypeAddCopyParameterSetBuilder {
        /**
         * The contentType parameter value
         */
        @Nullable
        protected String contentType;
        /**
         * Sets the ContentType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ContentTypeAddCopyParameterSetBuilder withContentType(@Nullable final String val) {
            this.contentType = val;
            return this;
        }
        /**
         * Instanciates a new ContentTypeAddCopyParameterSetBuilder
         */
        @Nullable
        protected ContentTypeAddCopyParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ContentTypeAddCopyParameterSet build() {
            return new ContentTypeAddCopyParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.contentType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("contentType", contentType));
        }
        return result;
    }
}
