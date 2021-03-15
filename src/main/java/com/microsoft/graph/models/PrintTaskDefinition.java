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
import com.microsoft.graph.models.AppIdentity;
import com.microsoft.graph.models.PrintTask;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.PrintTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Task Definition.
 */
public class PrintTaskDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Created By.
     * The application that created the printTaskDefinition. Read-only.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public AppIdentity createdBy;

    /**
     * The Display Name.
     * The name of the printTaskDefinition.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Tasks.
     * A list of tasks that have been created based on this definition. The list includes currently running tasks and recently completed tasks. Read-only.
     */
    @SerializedName(value = "tasks", alternate = {"Tasks"})
    @Expose
	@Nullable
    public PrintTaskCollectionPage tasks;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("tasks")) {
            tasks = serializer.deserializeObject(json.get("tasks"), PrintTaskCollectionPage.class);
        }
    }
}
