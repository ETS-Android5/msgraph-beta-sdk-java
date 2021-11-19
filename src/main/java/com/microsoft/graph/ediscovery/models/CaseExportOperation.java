// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.ediscovery.models.ExportOptions;
import com.microsoft.graph.ediscovery.models.ExportFileStructure;
import com.microsoft.graph.ediscovery.models.ReviewSet;
import com.microsoft.graph.ediscovery.models.CaseOperation;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Case Export Operation.
 */
public class CaseExportOperation extends CaseOperation implements IJsonBackedObject {


    /**
     * The Azure Blob Container.
     * 
     */
    @SerializedName(value = "azureBlobContainer", alternate = {"AzureBlobContainer"})
    @Expose
	@Nullable
    public String azureBlobContainer;

    /**
     * The Azure Blob Token.
     * 
     */
    @SerializedName(value = "azureBlobToken", alternate = {"AzureBlobToken"})
    @Expose
	@Nullable
    public String azureBlobToken;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Export Options.
     * 
     */
    @SerializedName(value = "exportOptions", alternate = {"ExportOptions"})
    @Expose
	@Nullable
    public EnumSet<ExportOptions> exportOptions;

    /**
     * The Export Structure.
     * 
     */
    @SerializedName(value = "exportStructure", alternate = {"ExportStructure"})
    @Expose
	@Nullable
    public ExportFileStructure exportStructure;

    /**
     * The Output Folder Id.
     * 
     */
    @SerializedName(value = "outputFolderId", alternate = {"OutputFolderId"})
    @Expose
	@Nullable
    public String outputFolderId;

    /**
     * The Output Name.
     * 
     */
    @SerializedName(value = "outputName", alternate = {"OutputName"})
    @Expose
	@Nullable
    public String outputName;

    /**
     * The Review Set.
     * 
     */
    @SerializedName(value = "reviewSet", alternate = {"ReviewSet"})
    @Expose
	@Nullable
    public ReviewSet reviewSet;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
