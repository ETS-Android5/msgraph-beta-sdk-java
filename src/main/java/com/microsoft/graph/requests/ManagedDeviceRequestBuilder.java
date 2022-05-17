// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.CloudPcBulkRemoteActionResult;
import com.microsoft.graph.models.RestoreTimeRange;
import com.microsoft.graph.models.CloudPcReviewStatus;
import com.microsoft.graph.models.ManagedDeviceRemoteAction;
import com.microsoft.graph.models.BulkManagedDeviceActionResult;
import com.microsoft.graph.models.AdministratorConfiguredDeviceComplianceState;
import com.microsoft.graph.models.DeviceLogCollectionRequest;
import com.microsoft.graph.models.DeviceLogCollectionResponse;
import com.microsoft.graph.models.ConfigurationManagerAction;
import com.microsoft.graph.models.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.models.CloudPcRemoteActionResult;
import com.microsoft.graph.models.DeviceCompliancePolicySettingState;
import com.microsoft.graph.models.OemWarranty;
import com.microsoft.graph.requests.AssignmentFilterEvaluationStatusDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.AssignmentFilterEvaluationStatusDetailsRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.SecurityBaselineStateCollectionRequestBuilder;
import com.microsoft.graph.requests.SecurityBaselineStateRequestBuilder;
import com.microsoft.graph.requests.DetectedAppCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.DetectedAppWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.DeviceLogCollectionResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceLogCollectionResponseRequestBuilder;
import com.microsoft.graph.requests.UserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.UserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.WindowsProtectionStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.ManagedDeviceResizeCloudPcParameterSet;
import com.microsoft.graph.models.ManagedDeviceRestoreCloudPcParameterSet;
import com.microsoft.graph.models.ManagedDeviceSetCloudPcReviewStatusParameterSet;
import com.microsoft.graph.models.ManagedDeviceOverrideComplianceStateParameterSet;
import com.microsoft.graph.models.ManagedDeviceActivateDeviceEsimParameterSet;
import com.microsoft.graph.models.ManagedDeviceCleanWindowsDeviceParameterSet;
import com.microsoft.graph.models.ManagedDeviceCreateDeviceLogCollectionRequestParameterSet;
import com.microsoft.graph.models.ManagedDeviceDeleteUserFromSharedAppleDeviceParameterSet;
import com.microsoft.graph.models.ManagedDeviceDeprovisionParameterSet;
import com.microsoft.graph.models.ManagedDeviceEnableLostModeParameterSet;
import com.microsoft.graph.models.ManagedDevicePlayLostModeSoundParameterSet;
import com.microsoft.graph.models.ManagedDeviceSendCustomNotificationToCompanyPortalParameterSet;
import com.microsoft.graph.models.ManagedDeviceSetDeviceNameParameterSet;
import com.microsoft.graph.models.ManagedDeviceTriggerConfigurationManagerActionParameterSet;
import com.microsoft.graph.models.ManagedDeviceUpdateWindowsDeviceAccountParameterSet;
import com.microsoft.graph.models.ManagedDeviceWindowsDefenderScanParameterSet;
import com.microsoft.graph.models.ManagedDeviceWipeParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Request Builder.
 */
public class ManagedDeviceRequestBuilder extends BaseRequestBuilder<ManagedDevice> {

    /**
     * The request builder for the ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ManagedDeviceRequest instance
     */
    @Nonnull
    public ManagedDeviceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ManagedDeviceRequest instance
     */
    @Nonnull
    public ManagedDeviceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ManagedDeviceRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AssignmentFilterEvaluationStatusDetails collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AssignmentFilterEvaluationStatusDetailsCollectionRequestBuilder assignmentFilterEvaluationStatusDetails() {
        return new AssignmentFilterEvaluationStatusDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentFilterEvaluationStatusDetails"), getClient(), null);
    }

    /**
     * Gets a request builder for the AssignmentFilterEvaluationStatusDetails item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AssignmentFilterEvaluationStatusDetailsRequestBuilder assignmentFilterEvaluationStatusDetails(@Nonnull final String id) {
        return new AssignmentFilterEvaluationStatusDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentFilterEvaluationStatusDetails") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceCompliancePolicyState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCompliancePolicyStateCollectionRequestBuilder deviceCompliancePolicyStates() {
        return new DeviceCompliancePolicyStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicyStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCompliancePolicyState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceCompliancePolicyStateRequestBuilder deviceCompliancePolicyStates(@Nonnull final String id) {
        return new DeviceCompliancePolicyStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicyStates") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceConfigurationState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceConfigurationStateCollectionRequestBuilder deviceConfigurationStates() {
        return new DeviceConfigurationStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceConfigurationStateRequestBuilder deviceConfigurationStates(@Nonnull final String id) {
        return new DeviceConfigurationStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationStates") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDeviceMobileAppConfigurationState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder managedDeviceMobileAppConfigurationStates() {
        return new ManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceMobileAppConfigurationStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDeviceMobileAppConfigurationState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationStateRequestBuilder managedDeviceMobileAppConfigurationStates(@Nonnull final String id) {
        return new ManagedDeviceMobileAppConfigurationStateRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceMobileAppConfigurationStates") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SecurityBaselineState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SecurityBaselineStateCollectionRequestBuilder securityBaselineStates() {
        return new SecurityBaselineStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("securityBaselineStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the SecurityBaselineState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SecurityBaselineStateRequestBuilder securityBaselineStates(@Nonnull final String id) {
        return new SecurityBaselineStateRequestBuilder(getRequestUrlWithAdditionalSegment("securityBaselineStates") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DetectedApp collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DetectedAppCollectionWithReferencesRequestBuilder detectedApps() {
        return new DetectedAppCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("detectedApps"), getClient(), null);
    }

    /**
     * Gets a request builder for the DetectedApp item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DetectedAppWithReferenceRequestBuilder detectedApps(@Nonnull final String id) {
        return new DetectedAppWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("detectedApps") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceCategory
     *
     * @return the DeviceCategoryRequestBuilder instance
     */
    @Nonnull
    public DeviceCategoryRequestBuilder deviceCategory() {
        return new DeviceCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCategory"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceLogCollectionResponse collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceLogCollectionResponseCollectionRequestBuilder logCollectionRequests() {
        return new DeviceLogCollectionResponseCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("logCollectionRequests"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceLogCollectionResponse item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceLogCollectionResponseRequestBuilder logCollectionRequests(@Nonnull final String id) {
        return new DeviceLogCollectionResponseRequestBuilder(getRequestUrlWithAdditionalSegment("logCollectionRequests") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the User collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserCollectionWithReferencesRequestBuilder users() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("users"), getClient(), null);
    }

    /**
     * Gets a request builder for the User item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserWithReferenceRequestBuilder users(@Nonnull final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("users") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WindowsProtectionState
     *
     * @return the WindowsProtectionStateRequestBuilder instance
     */
    @Nonnull
    public WindowsProtectionStateRequestBuilder windowsProtectionState() {
        return new WindowsProtectionStateRequestBuilder(getRequestUrlWithAdditionalSegment("windowsProtectionState"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceReprovisionCloudPcRequestBuilder reprovisionCloudPc() {
        return new ManagedDeviceReprovisionCloudPcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reprovisionCloudPc"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceResizeCloudPcRequestBuilder resizeCloudPc(@Nonnull final ManagedDeviceResizeCloudPcParameterSet parameters) {
        return new ManagedDeviceResizeCloudPcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.resizeCloudPc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceRestoreCloudPcRequestBuilder restoreCloudPc(@Nonnull final ManagedDeviceRestoreCloudPcParameterSet parameters) {
        return new ManagedDeviceRestoreCloudPcRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restoreCloudPc"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceSetCloudPcReviewStatusRequestBuilder setCloudPcReviewStatus(@Nonnull final ManagedDeviceSetCloudPcReviewStatusParameterSet parameters) {
        return new ManagedDeviceSetCloudPcReviewStatusRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setCloudPcReviewStatus"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceOverrideComplianceStateRequestBuilder overrideComplianceState(@Nonnull final ManagedDeviceOverrideComplianceStateParameterSet parameters) {
        return new ManagedDeviceOverrideComplianceStateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.overrideComplianceState"), getClient(), null, parameters);
    }

    /**
     * Activate eSIM on the device.
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceActivateDeviceEsimRequestBuilder activateDeviceEsim(@Nonnull final ManagedDeviceActivateDeviceEsimParameterSet parameters) {
        return new ManagedDeviceActivateDeviceEsimRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.activateDeviceEsim"), getClient(), null, parameters);
    }

    /**
     * Bypass activation lock
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceBypassActivationLockRequestBuilder bypassActivationLock() {
        return new ManagedDeviceBypassActivationLockRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bypassActivationLock"), getClient(), null);
    }

    /**
     * Clean Windows device
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceCleanWindowsDeviceRequestBuilder cleanWindowsDevice(@Nonnull final ManagedDeviceCleanWindowsDeviceParameterSet parameters) {
        return new ManagedDeviceCleanWindowsDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cleanWindowsDevice"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceCreateDeviceLogCollectionRequestRequestBuilder createDeviceLogCollectionRequest(@Nonnull final ManagedDeviceCreateDeviceLogCollectionRequestParameterSet parameters) {
        return new ManagedDeviceCreateDeviceLogCollectionRequestRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createDeviceLogCollectionRequest"), getClient(), null, parameters);
    }

    /**
     * Delete user from shared Apple device
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder deleteUserFromSharedAppleDevice(@Nonnull final ManagedDeviceDeleteUserFromSharedAppleDeviceParameterSet parameters) {
        return new ManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deleteUserFromSharedAppleDevice"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceDeprovisionRequestBuilder deprovision(@Nonnull final ManagedDeviceDeprovisionParameterSet parameters) {
        return new ManagedDeviceDeprovisionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deprovision"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceDisableRequestBuilder disable() {
        return new ManagedDeviceDisableRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.disable"), getClient(), null);
    }

    /**
     * Disable lost mode
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceDisableLostModeRequestBuilder disableLostMode() {
        return new ManagedDeviceDisableLostModeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.disableLostMode"), getClient(), null);
    }

    /**
     * Enable lost mode
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceEnableLostModeRequestBuilder enableLostMode(@Nonnull final ManagedDeviceEnableLostModeParameterSet parameters) {
        return new ManagedDeviceEnableLostModeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.enableLostMode"), getClient(), null, parameters);
    }

    /**
     * Locate a device
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceLocateDeviceRequestBuilder locateDevice() {
        return new ManagedDeviceLocateDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.locateDevice"), getClient(), null);
    }

    /**
     * Logout shared Apple device active user
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder logoutSharedAppleDeviceActiveUser() {
        return new ManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.logoutSharedAppleDeviceActiveUser"), getClient(), null);
    }

    /**
     * Play lost mode sound
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDevicePlayLostModeSoundRequestBuilder playLostModeSound(@Nonnull final ManagedDevicePlayLostModeSoundParameterSet parameters) {
        return new ManagedDevicePlayLostModeSoundRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.playLostModeSound"), getClient(), null, parameters);
    }

    /**
     * Reboot device
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRebootNowRequestBuilder rebootNow() {
        return new ManagedDeviceRebootNowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rebootNow"), getClient(), null);
    }

    /**
     * Recover passcode
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRecoverPasscodeRequestBuilder recoverPasscode() {
        return new ManagedDeviceRecoverPasscodeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.recoverPasscode"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceReenableRequestBuilder reenable() {
        return new ManagedDeviceReenableRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reenable"), getClient(), null);
    }

    /**
     * Remote lock
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRemoteLockRequestBuilder remoteLock() {
        return new ManagedDeviceRemoteLockRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.remoteLock"), getClient(), null);
    }

    /**
     * Request remote assistance
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRequestRemoteAssistanceRequestBuilder requestRemoteAssistance() {
        return new ManagedDeviceRequestRemoteAssistanceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.requestRemoteAssistance"), getClient(), null);
    }

    /**
     * Reset passcode
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceResetPasscodeRequestBuilder resetPasscode() {
        return new ManagedDeviceResetPasscodeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.resetPasscode"), getClient(), null);
    }

    /**
     * Retire a device
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRetireRequestBuilder retire() {
        return new ManagedDeviceRetireRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.retire"), getClient(), null);
    }

    /**
     * Revoke all Apple Vpp licenses for a device
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRevokeAppleVppLicensesRequestBuilder revokeAppleVppLicenses() {
        return new ManagedDeviceRevokeAppleVppLicensesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.revokeAppleVppLicenses"), getClient(), null);
    }

    /**
     * Rotate BitLockerKeys
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRotateBitLockerKeysRequestBuilder rotateBitLockerKeys() {
        return new ManagedDeviceRotateBitLockerKeysRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rotateBitLockerKeys"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRotateFileVaultKeyRequestBuilder rotateFileVaultKey() {
        return new ManagedDeviceRotateFileVaultKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rotateFileVaultKey"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceSendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal(@Nonnull final ManagedDeviceSendCustomNotificationToCompanyPortalParameterSet parameters) {
        return new ManagedDeviceSendCustomNotificationToCompanyPortalRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendCustomNotificationToCompanyPortal"), getClient(), null, parameters);
    }

    /**
     * Set device name of the device.
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceSetDeviceNameRequestBuilder setDeviceName(@Nonnull final ManagedDeviceSetDeviceNameParameterSet parameters) {
        return new ManagedDeviceSetDeviceNameRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setDeviceName"), getClient(), null, parameters);
    }

    /**
     * Shut down device
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceShutDownRequestBuilder shutDown() {
        return new ManagedDeviceShutDownRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.shutDown"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceSyncDeviceRequestBuilder syncDevice() {
        return new ManagedDeviceSyncDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.syncDevice"), getClient(), null);
    }

    /**
     * Trigger action on ConfigurationManager client
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceTriggerConfigurationManagerActionRequestBuilder triggerConfigurationManagerAction(@Nonnull final ManagedDeviceTriggerConfigurationManagerActionParameterSet parameters) {
        return new ManagedDeviceTriggerConfigurationManagerActionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.triggerConfigurationManagerAction"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceUpdateWindowsDeviceAccountRequestBuilder updateWindowsDeviceAccount(@Nonnull final ManagedDeviceUpdateWindowsDeviceAccountParameterSet parameters) {
        return new ManagedDeviceUpdateWindowsDeviceAccountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateWindowsDeviceAccount"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceWindowsDefenderScanRequestBuilder windowsDefenderScan(@Nonnull final ManagedDeviceWindowsDefenderScanParameterSet parameters) {
        return new ManagedDeviceWindowsDefenderScanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.windowsDefenderScan"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder windowsDefenderUpdateSignatures() {
        return new ManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.windowsDefenderUpdateSignatures"), getClient(), null);
    }

    /**
     * Wipe a device
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceWipeRequestBuilder wipe(@Nonnull final ManagedDeviceWipeParameterSet parameters) {
        return new ManagedDeviceWipeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.wipe"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public ManagedDeviceGetCloudPcRemoteActionResultsCollectionRequestBuilder getCloudPcRemoteActionResults() {
        return new ManagedDeviceGetCloudPcRemoteActionResultsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCloudPcRemoteActionResults"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceGetCloudPcReviewStatusRequestBuilder getCloudPcReviewStatus() {
        return new ManagedDeviceGetCloudPcReviewStatusRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCloudPcReviewStatus"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public ManagedDeviceGetNonCompliantSettingsCollectionRequestBuilder getNonCompliantSettings() {
        return new ManagedDeviceGetNonCompliantSettingsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getNonCompliantSettings"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceGetFileVaultKeyRequestBuilder getFileVaultKey() {
        return new ManagedDeviceGetFileVaultKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getFileVaultKey"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceGetOemWarrantyRequestBuilder getOemWarranty() {
        return new ManagedDeviceGetOemWarrantyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOemWarranty"), getClient(), null);
    }
}
