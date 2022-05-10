package microsoft.graph.rolemanagement.entitlementmanagement;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.models.RbacApplication;
import microsoft.graph.rolemanagement.entitlementmanagement.resourcenamespaces.item.UnifiedRbacResourceNamespaceItemRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.resourcenamespaces.ResourceNamespacesRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentapprovals.item.ApprovalItemRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentapprovals.RoleAssignmentApprovalsRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleassignments.RoleAssignmentsRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentscheduleinstances.item.UnifiedRoleAssignmentScheduleInstanceItemRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentscheduleinstances.RoleAssignmentScheduleInstancesRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentschedulerequests.item.UnifiedRoleAssignmentScheduleRequestItemRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentschedulerequests.RoleAssignmentScheduleRequestsRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentschedules.item.UnifiedRoleAssignmentScheduleItemRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleassignmentschedules.RoleAssignmentSchedulesRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roledefinitions.item.UnifiedRoleDefinitionItemRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roledefinitions.RoleDefinitionsRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityscheduleinstances.item.UnifiedRoleEligibilityScheduleInstanceItemRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityscheduleinstances.RoleEligibilityScheduleInstancesRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedulerequests.item.UnifiedRoleEligibilityScheduleRequestItemRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedulerequests.RoleEligibilityScheduleRequestsRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedules.item.UnifiedRoleEligibilityScheduleItemRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.roleeligibilityschedules.RoleEligibilitySchedulesRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.rolescheduleinstanceswithdirectoryscopeidwithappscopeidwithprincipalidwithroledefinitionid.RoleScheduleInstancesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.rolescheduleswithdirectoryscopeidwithappscopeidwithprincipalidwithroledefinitionid.RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder;
import microsoft.graph.rolemanagement.entitlementmanagement.transitiveroleassignments.TransitiveRoleAssignmentsRequestBuilder;
/** Provides operations to manage the entitlementManagement property of the microsoft.graph.roleManagement entity. */
public class EntitlementManagementRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The resourceNamespaces property */
    @javax.annotation.Nonnull
    public ResourceNamespacesRequestBuilder resourceNamespaces() {
        return new ResourceNamespacesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleAssignmentApprovals property */
    @javax.annotation.Nonnull
    public RoleAssignmentApprovalsRequestBuilder roleAssignmentApprovals() {
        return new RoleAssignmentApprovalsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleAssignments property */
    @javax.annotation.Nonnull
    public RoleAssignmentsRequestBuilder roleAssignments() {
        return new RoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleAssignmentScheduleInstances property */
    @javax.annotation.Nonnull
    public RoleAssignmentScheduleInstancesRequestBuilder roleAssignmentScheduleInstances() {
        return new RoleAssignmentScheduleInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleAssignmentScheduleRequests property */
    @javax.annotation.Nonnull
    public RoleAssignmentScheduleRequestsRequestBuilder roleAssignmentScheduleRequests() {
        return new RoleAssignmentScheduleRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleAssignmentSchedules property */
    @javax.annotation.Nonnull
    public RoleAssignmentSchedulesRequestBuilder roleAssignmentSchedules() {
        return new RoleAssignmentSchedulesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleDefinitions property */
    @javax.annotation.Nonnull
    public RoleDefinitionsRequestBuilder roleDefinitions() {
        return new RoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleEligibilityScheduleInstances property */
    @javax.annotation.Nonnull
    public RoleEligibilityScheduleInstancesRequestBuilder roleEligibilityScheduleInstances() {
        return new RoleEligibilityScheduleInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleEligibilityScheduleRequests property */
    @javax.annotation.Nonnull
    public RoleEligibilityScheduleRequestsRequestBuilder roleEligibilityScheduleRequests() {
        return new RoleEligibilityScheduleRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The roleEligibilitySchedules property */
    @javax.annotation.Nonnull
    public RoleEligibilitySchedulesRequestBuilder roleEligibilitySchedules() {
        return new RoleEligibilitySchedulesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The transitiveRoleAssignments property */
    @javax.annotation.Nonnull
    public TransitiveRoleAssignmentsRequestBuilder transitiveRoleAssignments() {
        return new TransitiveRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new EntitlementManagementRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public EntitlementManagementRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/roleManagement/entitlementManagement{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new EntitlementManagementRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public EntitlementManagementRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/roleManagement/entitlementManagement{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final EntitlementManagementRequestBuilderDeleteRequestConfiguration requestConfig = new EntitlementManagementRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Container for roles and assignments for entitlement management resources.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Container for roles and assignments for entitlement management resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final EntitlementManagementRequestBuilderGetRequestConfiguration requestConfig = new EntitlementManagementRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final RbacApplication body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final RbacApplication body, @javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final EntitlementManagementRequestBuilderPatchRequestConfiguration requestConfig = new EntitlementManagementRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property entitlementManagement for roleManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Container for roles and assignments for entitlement management resources.
     * @return a CompletableFuture of rbacApplication
     */
    public java.util.concurrent.CompletableFuture<RbacApplication> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, RbacApplication::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Container for roles and assignments for entitlement management resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of rbacApplication
     */
    public java.util.concurrent.CompletableFuture<RbacApplication> get(@javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, RbacApplication::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Container for roles and assignments for entitlement management resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of rbacApplication
     */
    public java.util.concurrent.CompletableFuture<RbacApplication> get(@javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, RbacApplication::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final RbacApplication body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final RbacApplication body, @javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property entitlementManagement in roleManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final RbacApplication body, @javax.annotation.Nullable final java.util.function.Consumer<EntitlementManagementRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.entitlementManagement.resourceNamespaces.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRbacResourceNamespaceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRbacResourceNamespaceItemRequestBuilder resourceNamespaces(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRbacResourceNamespace%2Did", id);
        return new UnifiedRbacResourceNamespaceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.entitlementManagement.roleAssignmentApprovals.item collection
     * @param id Unique identifier of the item
     * @return a approvalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ApprovalItemRequestBuilder roleAssignmentApprovals(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("approval%2Did", id);
        return new ApprovalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.entitlementManagement.roleAssignments.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.rolemanagement.entitlementmanagement.roleassignments.item.UnifiedRoleAssignmentItemRequestBuilder roleAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleAssignment%2Did", id);
        return new microsoft.graph.rolemanagement.entitlementmanagement.roleassignments.item.UnifiedRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.entitlementManagement.roleAssignmentScheduleInstances.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleAssignmentScheduleInstanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleAssignmentScheduleInstanceItemRequestBuilder roleAssignmentScheduleInstances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleAssignmentScheduleInstance%2Did", id);
        return new UnifiedRoleAssignmentScheduleInstanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.entitlementManagement.roleAssignmentScheduleRequests.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleAssignmentScheduleRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleAssignmentScheduleRequestItemRequestBuilder roleAssignmentScheduleRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleAssignmentScheduleRequest%2Did", id);
        return new UnifiedRoleAssignmentScheduleRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.entitlementManagement.roleAssignmentSchedules.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleAssignmentScheduleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleAssignmentScheduleItemRequestBuilder roleAssignmentSchedules(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleAssignmentSchedule%2Did", id);
        return new UnifiedRoleAssignmentScheduleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.entitlementManagement.roleDefinitions.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleDefinitionItemRequestBuilder roleDefinitions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleDefinition%2Did", id);
        return new UnifiedRoleDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.entitlementManagement.roleEligibilityScheduleInstances.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleEligibilityScheduleInstanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleEligibilityScheduleInstanceItemRequestBuilder roleEligibilityScheduleInstances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleEligibilityScheduleInstance%2Did", id);
        return new UnifiedRoleEligibilityScheduleInstanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.entitlementManagement.roleEligibilityScheduleRequests.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleEligibilityScheduleRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleEligibilityScheduleRequestItemRequestBuilder roleEligibilityScheduleRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleEligibilityScheduleRequest%2Did", id);
        return new UnifiedRoleEligibilityScheduleRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.entitlementManagement.roleEligibilitySchedules.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleEligibilityScheduleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UnifiedRoleEligibilityScheduleItemRequestBuilder roleEligibilitySchedules(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleEligibilitySchedule%2Did", id);
        return new UnifiedRoleEligibilityScheduleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to call the roleScheduleInstances method.
     * @return a roleScheduleInstancesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder
     */
    @javax.annotation.Nonnull
    public RoleScheduleInstancesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder roleScheduleInstancesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionId() {
        return new RoleScheduleInstancesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the roleSchedules method.
     * @return a roleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder
     */
    @javax.annotation.Nonnull
    public RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder roleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionId() {
        return new RoleSchedulesWithDirectoryScopeIdWithAppScopeIdWithPrincipalIdWithRoleDefinitionIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.roleManagement.entitlementManagement.transitiveRoleAssignments.item collection
     * @param id Unique identifier of the item
     * @return a unifiedRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.rolemanagement.entitlementmanagement.transitiveroleassignments.item.UnifiedRoleAssignmentItemRequestBuilder transitiveRoleAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleAssignment%2Did", id);
        return new microsoft.graph.rolemanagement.entitlementmanagement.transitiveroleassignments.item.UnifiedRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EntitlementManagementRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new entitlementManagementRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public EntitlementManagementRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Container for roles and assignments for entitlement management resources. */
    public class EntitlementManagementRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EntitlementManagementRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public EntitlementManagementRequestBuilderGetQueryParameters queryParameters = new EntitlementManagementRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new entitlementManagementRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public EntitlementManagementRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class EntitlementManagementRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new entitlementManagementRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public EntitlementManagementRequestBuilderPatchRequestConfiguration() {
        }
    }
}
