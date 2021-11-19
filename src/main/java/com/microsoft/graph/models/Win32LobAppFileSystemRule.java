// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Win32LobAppFileSystemOperationType;
import com.microsoft.graph.models.Win32LobAppRuleOperator;
import com.microsoft.graph.models.Win32LobAppRule;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App File System Rule.
 */
public class Win32LobAppFileSystemRule extends Win32LobAppRule implements IJsonBackedObject {


    /**
     * The Check32Bit On64System.
     * A value indicating whether to expand environment variables in the 32-bit context on 64-bit systems.
     */
    @SerializedName(value = "check32BitOn64System", alternate = {"Check32BitOn64System"})
    @Expose
	@Nullable
    public Boolean check32BitOn64System;

    /**
     * The Comparison Value.
     * The file or folder comparison value.
     */
    @SerializedName(value = "comparisonValue", alternate = {"ComparisonValue"})
    @Expose
	@Nullable
    public String comparisonValue;

    /**
     * The File Or Folder Name.
     * The file or folder name to look up.
     */
    @SerializedName(value = "fileOrFolderName", alternate = {"FileOrFolderName"})
    @Expose
	@Nullable
    public String fileOrFolderName;

    /**
     * The Operation Type.
     * The file system operation type.
     */
    @SerializedName(value = "operationType", alternate = {"OperationType"})
    @Expose
	@Nullable
    public Win32LobAppFileSystemOperationType operationType;

    /**
     * The Operator.
     * The operator for file or folder detection.
     */
    @SerializedName(value = "operator", alternate = {"Operator"})
    @Expose
	@Nullable
    public Win32LobAppRuleOperator operator;

    /**
     * The Path.
     * The file or folder path to look up.
     */
    @SerializedName(value = "path", alternate = {"Path"})
    @Expose
	@Nullable
    public String path;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
