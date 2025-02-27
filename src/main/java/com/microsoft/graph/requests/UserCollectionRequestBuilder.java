// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.AssignedLicense;
import com.microsoft.graph.models.AttendeeBase;
import com.microsoft.graph.models.LocationConstraint;
import com.microsoft.graph.models.TimeConstraint;
import com.microsoft.graph.models.MeetingTimeSuggestionsResult;
import com.microsoft.graph.models.MailTipsType;
import com.microsoft.graph.models.MailTips;
import java.util.EnumSet;
import com.microsoft.graph.models.Message;
import com.microsoft.graph.models.ExchangeIdFormat;
import com.microsoft.graph.models.ConvertIdResult;
import com.microsoft.graph.models.PasswordValidationInformation;
import com.microsoft.graph.models.EmailAddress;
import com.microsoft.graph.models.Reminder;
import com.microsoft.graph.models.DeviceAndAppManagementData;
import com.microsoft.graph.models.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.ManagedAppDiagnosticStatus;
import com.microsoft.graph.models.ManagedAppPolicy;
import com.microsoft.graph.models.ManagedDeviceSummarizedAppState;
import com.microsoft.graph.models.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.UserCollectionRequestBuilder;
import com.microsoft.graph.requests.UserRequestBuilder;
import com.microsoft.graph.requests.UserCollectionRequest;
import com.microsoft.graph.requests.UserValidatePasswordRequestBuilder;
import com.microsoft.graph.requests.UserDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.UserGetManagedAppBlockedUsersCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectValidatePropertiesRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectGetByIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectGetUserOwnedObjectsRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.UserActivateServicePlanParameterSet;
import com.microsoft.graph.models.UserAssignLicenseParameterSet;
import com.microsoft.graph.models.UserChangePasswordParameterSet;
import com.microsoft.graph.models.UserFindMeetingTimesParameterSet;
import com.microsoft.graph.models.UserGetMailTipsParameterSet;
import com.microsoft.graph.models.UserSendMailParameterSet;
import com.microsoft.graph.models.UserTranslateExchangeIdsParameterSet;
import com.microsoft.graph.models.UserWipeManagedAppRegistrationByDeviceTagParameterSet;
import com.microsoft.graph.models.UserWipeManagedAppRegistrationsByAzureAdDeviceIdParameterSet;
import com.microsoft.graph.models.UserWipeManagedAppRegistrationsByDeviceTagParameterSet;
import com.microsoft.graph.models.UserExportPersonalDataParameterSet;
import com.microsoft.graph.models.UserValidatePasswordParameterSet;
import com.microsoft.graph.models.UserFindRoomsParameterSet;
import com.microsoft.graph.models.UserReminderViewParameterSet;
import com.microsoft.graph.models.UserExportDeviceAndAppManagementDataParameterSet;
import com.microsoft.graph.models.DirectoryObjectValidatePropertiesParameterSet;
import com.microsoft.graph.models.DirectoryObjectCheckMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectCheckMemberObjectsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberObjectsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetByIdsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetUserOwnedObjectsParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Collection Request Builder.
 */
public class UserCollectionRequestBuilder extends BaseCollectionRequestBuilder<User, UserRequestBuilder, UserCollectionResponse, UserCollectionPage, UserCollectionRequest> {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserRequestBuilder.class, UserCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserValidatePasswordRequestBuilder validatePassword(@Nonnull final UserValidatePasswordParameterSet parameters) {
        return new UserValidatePasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validatePassword"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public UserDeltaCollectionRequestBuilder delta() {
        return new UserDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public UserGetManagedAppBlockedUsersCollectionRequestBuilder getManagedAppBlockedUsers() {
        return new UserGetManagedAppBlockedUsersCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedAppBlockedUsers"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectValidatePropertiesRequestBuilder validateProperties(@Nonnull final DirectoryObjectValidatePropertiesParameterSet parameters) {
        return new DirectoryObjectValidatePropertiesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validateProperties"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetByIdsCollectionRequestBuilder getByIds(@Nonnull final DirectoryObjectGetByIdsParameterSet parameters) {
        return new DirectoryObjectGetByIdsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getByIds"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetUserOwnedObjectsRequestBuilder getUserOwnedObjects(@Nonnull final DirectoryObjectGetUserOwnedObjectsParameterSet parameters) {
        return new DirectoryObjectGetUserOwnedObjectsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getUserOwnedObjects"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
