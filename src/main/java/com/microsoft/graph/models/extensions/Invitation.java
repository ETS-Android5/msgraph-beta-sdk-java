// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.InvitedUserMessageInfo;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Invitation.
 */
public class Invitation extends Entity implements IJsonBackedObject {


    /**
     * The Invited User Display Name.
     * The display name of the user being invited.
     */
    @SerializedName(value = "invitedUserDisplayName", alternate = {"InvitedUserDisplayName"})
    @Expose
    public String invitedUserDisplayName;

    /**
     * The Invited User Email Address.
     * The email address of the user being invited. Required. The following special characters are not permitted in the email address:Tilde (~)Exclamation point (!)At sign (@)Number sign (#)Dollar sign ($)Percent (%)Circumflex (^)Ampersand (&amp;)Asterisk (*)Parentheses (( ))Hyphen (-)Plus sign (+)Equal sign (=)Brackets ([ ])Braces ({ })Backslash (/)Slash mark (/)Pipe (`
     */
    @SerializedName(value = "invitedUserEmailAddress", alternate = {"InvitedUserEmailAddress"})
    @Expose
    public String invitedUserEmailAddress;

    /**
     * The Invited User Message Info.
     * Additional configuration for the message being sent to the invited user, including customizing message text, language and cc recipient list.
     */
    @SerializedName(value = "invitedUserMessageInfo", alternate = {"InvitedUserMessageInfo"})
    @Expose
    public InvitedUserMessageInfo invitedUserMessageInfo;

    /**
     * The Invited User Type.
     * The userType of the user being invited. By default, this is Guest. You can invite as Member if you're are company administrator.
     */
    @SerializedName(value = "invitedUserType", alternate = {"InvitedUserType"})
    @Expose
    public String invitedUserType;

    /**
     * The Invite Redeem Url.
     * The URL the user can use to redeem their invitation. Read-only.
     */
    @SerializedName(value = "inviteRedeemUrl", alternate = {"InviteRedeemUrl"})
    @Expose
    public String inviteRedeemUrl;

    /**
     * The Invite Redirect Url.
     * The URL user should be redirected to once the invitation is redeemed. Required.
     */
    @SerializedName(value = "inviteRedirectUrl", alternate = {"InviteRedirectUrl"})
    @Expose
    public String inviteRedirectUrl;

    /**
     * The Reset Redemption.
     * 
     */
    @SerializedName(value = "resetRedemption", alternate = {"ResetRedemption"})
    @Expose
    public Boolean resetRedemption;

    /**
     * The Send Invitation Message.
     * Indicates whether an email should be sent to the user being invited or not. The default is false.
     */
    @SerializedName(value = "sendInvitationMessage", alternate = {"SendInvitationMessage"})
    @Expose
    public Boolean sendInvitationMessage;

    /**
     * The Status.
     * The status of the invitation. Possible values: PendingAcceptance, Completed, InProgress, and Error
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public String status;

    /**
     * The Invited User.
     * The user created as part of the invitation creation. Read-Only
     */
    @SerializedName(value = "invitedUser", alternate = {"InvitedUser"})
    @Expose
    public User invitedUser;


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

    }
}
