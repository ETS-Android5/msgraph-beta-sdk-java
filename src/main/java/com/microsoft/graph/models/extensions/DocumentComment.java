// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DocumentCommentReply;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DocumentCommentReplyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Document Comment.
 */
public class DocumentComment extends Entity implements IJsonBackedObject {


    /**
     * The Content.
     * 
     */
    @SerializedName(value = "content", alternate = {"Content"})
    @Expose
    public String content;

    /**
     * The Replies.
     * 
     */
    @SerializedName(value = "replies", alternate = {"Replies"})
    @Expose
    public DocumentCommentReplyCollectionPage replies;


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


        if (json.has("replies")) {
            replies = serializer.deserializeObject(json.get("replies").toString(), DocumentCommentReplyCollectionPage.class);
        }
    }
}
