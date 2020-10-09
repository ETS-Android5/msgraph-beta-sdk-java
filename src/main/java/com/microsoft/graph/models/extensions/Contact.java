// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.TypedEmailAddress;
import com.microsoft.graph.models.extensions.FollowupFlag;
import com.microsoft.graph.models.extensions.Phone;
import com.microsoft.graph.models.extensions.PhysicalAddress;
import com.microsoft.graph.models.extensions.Website;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.OutlookItem;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact.
 */
public class Contact extends OutlookItem implements IJsonBackedObject {


    /**
     * The Assistant Name.
     * The name of the contact's assistant.
     */
    @SerializedName(value = "assistantName", alternate = {"AssistantName"})
    @Expose
    public String assistantName;

    /**
     * The Birthday.
     * The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "birthday", alternate = {"Birthday"})
    @Expose
    public java.util.Calendar birthday;

    /**
     * The Children.
     * The names of the contact's children.
     */
    @SerializedName(value = "children", alternate = {"Children"})
    @Expose
    public java.util.List<String> children;

    /**
     * The Company Name.
     * The name of the contact's company.
     */
    @SerializedName(value = "companyName", alternate = {"CompanyName"})
    @Expose
    public String companyName;

    /**
     * The Department.
     * The contact's department.
     */
    @SerializedName(value = "department", alternate = {"Department"})
    @Expose
    public String department;

    /**
     * The Display Name.
     * The contact's display name. You can specify the display name in a create or update operation. Note that later updates to other properties may cause an automatically generated value to overwrite the displayName value you have specified. To preserve a pre-existing value, always include it as displayName in an update operation.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Email Addresses.
     * The contact's email addresses.
     */
    @SerializedName(value = "emailAddresses", alternate = {"EmailAddresses"})
    @Expose
    public java.util.List<TypedEmailAddress> emailAddresses;

    /**
     * The File As.
     * The name the contact is filed under.
     */
    @SerializedName(value = "fileAs", alternate = {"FileAs"})
    @Expose
    public String fileAs;

    /**
     * The Flag.
     * 
     */
    @SerializedName(value = "flag", alternate = {"Flag"})
    @Expose
    public FollowupFlag flag;

    /**
     * The Gender.
     * 
     */
    @SerializedName(value = "gender", alternate = {"Gender"})
    @Expose
    public String gender;

    /**
     * The Generation.
     * The contact's generation.
     */
    @SerializedName(value = "generation", alternate = {"Generation"})
    @Expose
    public String generation;

    /**
     * The Given Name.
     * The contact's given name.
     */
    @SerializedName(value = "givenName", alternate = {"GivenName"})
    @Expose
    public String givenName;

    /**
     * The Im Addresses.
     * The contact's instant messaging (IM) addresses.
     */
    @SerializedName(value = "imAddresses", alternate = {"ImAddresses"})
    @Expose
    public java.util.List<String> imAddresses;

    /**
     * The Initials.
     * The contact's initials.
     */
    @SerializedName(value = "initials", alternate = {"Initials"})
    @Expose
    public String initials;

    /**
     * The Is Favorite.
     * 
     */
    @SerializedName(value = "isFavorite", alternate = {"IsFavorite"})
    @Expose
    public Boolean isFavorite;

    /**
     * The Job Title.
     * The contact’s job title.
     */
    @SerializedName(value = "jobTitle", alternate = {"JobTitle"})
    @Expose
    public String jobTitle;

    /**
     * The Manager.
     * The name of the contact's manager.
     */
    @SerializedName(value = "manager", alternate = {"Manager"})
    @Expose
    public String manager;

    /**
     * The Middle Name.
     * The contact's middle name.
     */
    @SerializedName(value = "middleName", alternate = {"MiddleName"})
    @Expose
    public String middleName;

    /**
     * The Nick Name.
     * The contact's nickname.
     */
    @SerializedName(value = "nickName", alternate = {"NickName"})
    @Expose
    public String nickName;

    /**
     * The Office Location.
     * The location of the contact's office.
     */
    @SerializedName(value = "officeLocation", alternate = {"OfficeLocation"})
    @Expose
    public String officeLocation;

    /**
     * The Parent Folder Id.
     * The ID of the contact's parent folder.
     */
    @SerializedName(value = "parentFolderId", alternate = {"ParentFolderId"})
    @Expose
    public String parentFolderId;

    /**
     * The Personal Notes.
     * The user's notes about the contact.
     */
    @SerializedName(value = "personalNotes", alternate = {"PersonalNotes"})
    @Expose
    public String personalNotes;

    /**
     * The Phones.
     * 
     */
    @SerializedName(value = "phones", alternate = {"Phones"})
    @Expose
    public java.util.List<Phone> phones;

    /**
     * The Postal Addresses.
     * 
     */
    @SerializedName(value = "postalAddresses", alternate = {"PostalAddresses"})
    @Expose
    public java.util.List<PhysicalAddress> postalAddresses;

    /**
     * The Profession.
     * The contact's profession.
     */
    @SerializedName(value = "profession", alternate = {"Profession"})
    @Expose
    public String profession;

    /**
     * The Spouse Name.
     * The name of the contact's spouse/partner.
     */
    @SerializedName(value = "spouseName", alternate = {"SpouseName"})
    @Expose
    public String spouseName;

    /**
     * The Surname.
     * The contact's surname.
     */
    @SerializedName(value = "surname", alternate = {"Surname"})
    @Expose
    public String surname;

    /**
     * The Title.
     * The contact's title.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
    public String title;

    /**
     * The Websites.
     * 
     */
    @SerializedName(value = "websites", alternate = {"Websites"})
    @Expose
    public java.util.List<Website> websites;

    /**
     * The Wedding Anniversary.
     * 
     */
    @SerializedName(value = "weddingAnniversary", alternate = {"WeddingAnniversary"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly weddingAnniversary;

    /**
     * The Yomi Company Name.
     * The phonetic Japanese company name of the contact.
     */
    @SerializedName(value = "yomiCompanyName", alternate = {"YomiCompanyName"})
    @Expose
    public String yomiCompanyName;

    /**
     * The Yomi Given Name.
     * The phonetic Japanese given name (first name) of the contact.
     */
    @SerializedName(value = "yomiGivenName", alternate = {"YomiGivenName"})
    @Expose
    public String yomiGivenName;

    /**
     * The Yomi Surname.
     * The phonetic Japanese surname (last name)  of the contact.
     */
    @SerializedName(value = "yomiSurname", alternate = {"YomiSurname"})
    @Expose
    public String yomiSurname;

    /**
     * The Extensions.
     * The collection of open extensions defined for the contact. Read-only. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
    public ExtensionCollectionPage extensions;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
     */
    @SerializedName(value = "multiValueExtendedProperties", alternate = {"MultiValueExtendedProperties"})
    @Expose
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Photo.
     * Optional contact picture. You can get or set a photo for a contact.
     */
    @SerializedName(value = "photo", alternate = {"Photo"})
    @Expose
    public ProfilePhoto photo;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the contact. Read-only. Nullable.
     */
    @SerializedName(value = "singleValueExtendedProperties", alternate = {"SingleValueExtendedProperties"})
    @Expose
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;


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


        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions").toString(), ExtensionCollectionPage.class);
        }

        if (json.has("multiValueExtendedProperties")) {
            multiValueExtendedProperties = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), MultiValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("singleValueExtendedProperties")) {
            singleValueExtendedProperties = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), SingleValueLegacyExtendedPropertyCollectionPage.class);
        }
    }
}
