// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.SynchronizationRule;
import com.microsoft.graph.models.DirectoryDefinition;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.DirectoryDefinitionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Schema.
 */
public class SynchronizationSchema extends Entity implements IJsonBackedObject {


    /**
     * The Synchronization Rules.
     * A collection of synchronization rules configured for the synchronizationJob or synchronizationTemplate.
     */
    @SerializedName(value = "synchronizationRules", alternate = {"SynchronizationRules"})
    @Expose
	@Nullable
    public java.util.List<SynchronizationRule> synchronizationRules;

    /**
     * The Version.
     * The version of the schema, updated automatically with every schema change.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public String version;

    /**
     * The Directories.
     * Contains the collection of directories and all of their objects.
     */
    @SerializedName(value = "directories", alternate = {"Directories"})
    @Expose
	@Nullable
    public DirectoryDefinitionCollectionPage directories;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("directories")) {
            directories = serializer.deserializeObject(json.get("directories"), DirectoryDefinitionCollectionPage.class);
        }
    }
}
