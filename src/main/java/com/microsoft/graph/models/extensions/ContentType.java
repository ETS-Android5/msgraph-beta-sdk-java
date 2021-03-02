// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DocumentSet;
import com.microsoft.graph.models.extensions.DocumentSetContent;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.models.extensions.ContentTypeOrder;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.models.extensions.ColumnLink;
import com.microsoft.graph.models.extensions.ColumnDefinition;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionPage;
import com.microsoft.graph.requests.extensions.ColumnLinkCollectionPage;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type.
 */
public class ContentType extends Entity implements IJsonBackedObject {


    /**
     * The Associated Hubs Urls.
     * 
     */
    @SerializedName(value = "associatedHubsUrls", alternate = {"AssociatedHubsUrls"})
    @Expose
    public java.util.List<String> associatedHubsUrls;

    /**
     * The Description.
     * The descriptive text for the item.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Document Set.
     * 
     */
    @SerializedName(value = "documentSet", alternate = {"DocumentSet"})
    @Expose
    public DocumentSet documentSet;

    /**
     * The Document Template.
     * 
     */
    @SerializedName(value = "documentTemplate", alternate = {"DocumentTemplate"})
    @Expose
    public DocumentSetContent documentTemplate;

    /**
     * The Group.
     * The name of the group this content type belongs to. Helps organize related content types.
     */
    @SerializedName(value = "group", alternate = {"Group"})
    @Expose
    public String group;

    /**
     * The Hidden.
     * Indicates whether the content type is hidden in the list's 'New' menu.
     */
    @SerializedName(value = "hidden", alternate = {"Hidden"})
    @Expose
    public Boolean hidden;

    /**
     * The Inherited From.
     * If this content type is inherited from another scope (like a site), provides a reference to the item where the content type is defined.
     */
    @SerializedName(value = "inheritedFrom", alternate = {"InheritedFrom"})
    @Expose
    public ItemReference inheritedFrom;

    /**
     * The Is Built In.
     * 
     */
    @SerializedName(value = "isBuiltIn", alternate = {"IsBuiltIn"})
    @Expose
    public Boolean isBuiltIn;

    /**
     * The Name.
     * The name of the content type.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Order.
     * Specifies the order in which the content type appears in the selection UI.
     */
    @SerializedName(value = "order", alternate = {"Order"})
    @Expose
    public ContentTypeOrder order;

    /**
     * The Parent Id.
     * The unique identifier of the content type.
     */
    @SerializedName(value = "parentId", alternate = {"ParentId"})
    @Expose
    public String parentId;

    /**
     * The Propagate Changes.
     * 
     */
    @SerializedName(value = "propagateChanges", alternate = {"PropagateChanges"})
    @Expose
    public Boolean propagateChanges;

    /**
     * The Read Only.
     * If true, the content type cannot be modified unless this value is first set to false.
     */
    @SerializedName(value = "readOnly", alternate = {"ReadOnly"})
    @Expose
    public Boolean readOnly;

    /**
     * The Sealed.
     * If true, the content type cannot be modified by users or through push-down operations. Only site collection administrators can seal or unseal content types.
     */
    @SerializedName(value = "sealed", alternate = {"Sealed"})
    @Expose
    public Boolean sealed;

    /**
     * The Base.
     * 
     */
    @SerializedName(value = "base", alternate = {"Base"})
    @Expose
    public ContentType base;

    /**
     * The Base Types.
     * 
     */
    public ContentTypeCollectionPage baseTypes;

    /**
     * The Column Links.
     * The collection of columns that are required by this content type
     */
    @SerializedName(value = "columnLinks", alternate = {"ColumnLinks"})
    @Expose
    public ColumnLinkCollectionPage columnLinks;

    /**
     * The Column Positions.
     * 
     */
    public ColumnDefinitionCollectionPage columnPositions;

    /**
     * The Columns.
     * 
     */
    @SerializedName(value = "columns", alternate = {"Columns"})
    @Expose
    public ColumnDefinitionCollectionPage columns;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("baseTypes")) {
            baseTypes = serializer.deserializeObject(json.get("baseTypes").toString(), ContentTypeCollectionPage.class);
        }

        if (json.has("columnLinks")) {
            columnLinks = serializer.deserializeObject(json.get("columnLinks").toString(), ColumnLinkCollectionPage.class);
        }

        if (json.has("columnPositions")) {
            columnPositions = serializer.deserializeObject(json.get("columnPositions").toString(), ColumnDefinitionCollectionPage.class);
        }

        if (json.has("columns")) {
            columns = serializer.deserializeObject(json.get("columns").toString(), ColumnDefinitionCollectionPage.class);
        }
    }
}
