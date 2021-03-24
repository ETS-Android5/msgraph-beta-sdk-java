// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.GroupPolicyUploadedLanguageFile;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Uploaded Definition File Remove Language Files Parameter Set.
 */
public class GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSet {
    /**
     * The group Policy Uploaded Language Files.
     * 
     */
    @SerializedName(value = "groupPolicyUploadedLanguageFiles", alternate = {"GroupPolicyUploadedLanguageFiles"})
    @Expose
	@Nullable
    public java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles;


    /**
     * Instiaciates a new GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSet
     */
    public GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSet() {}
    /**
     * Instiaciates a new GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSet(@Nonnull final GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSetBuilder builder) {
        this.groupPolicyUploadedLanguageFiles = builder.groupPolicyUploadedLanguageFiles;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSetBuilder newBuilder() {
        return new GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSetBuilder();
    }
    /**
     * Fluent builder for the GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSet
     */
    public static final class GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSetBuilder {
        /**
         * The groupPolicyUploadedLanguageFiles parameter value
         */
        @Nullable
        protected java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles;
        /**
         * Sets the GroupPolicyUploadedLanguageFiles
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSetBuilder withGroupPolicyUploadedLanguageFiles(@Nullable final java.util.List<GroupPolicyUploadedLanguageFile> val) {
            this.groupPolicyUploadedLanguageFiles = val;
            return this;
        }
        /**
         * Instanciates a new GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSetBuilder
         */
        @Nullable
        protected GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSet build() {
            return new GroupPolicyUploadedDefinitionFileRemoveLanguageFilesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.groupPolicyUploadedLanguageFiles != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("groupPolicyUploadedLanguageFiles", groupPolicyUploadedLanguageFiles));
        }
        return result;
    }
}
