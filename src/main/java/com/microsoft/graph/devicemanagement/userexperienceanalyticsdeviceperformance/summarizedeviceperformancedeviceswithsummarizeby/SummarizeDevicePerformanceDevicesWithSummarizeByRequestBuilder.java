package microsoft.graph.devicemanagement.userexperienceanalyticsdeviceperformance.summarizedeviceperformancedeviceswithsummarizeby;

import com.microsoft.kiota.HttpMethod;
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
/** Provides operations to call the summarizeDevicePerformanceDevices method. */
public class SummarizeDevicePerformanceDevicesWithSummarizeByRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new SummarizeDevicePerformanceDevicesWithSummarizeByRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param summarizeBy Usage: summarizeBy='{summarizeBy}'
     * @return a void
     */
    public SummarizeDevicePerformanceDevicesWithSummarizeByRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter, @javax.annotation.Nullable final String summarizeBy) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/userExperienceAnalyticsDevicePerformance/microsoft.graph.summarizeDevicePerformanceDevices(summarizeBy='{summarizeBy}')";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        urlTplParams.put("", summarizeBy);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new SummarizeDevicePerformanceDevicesWithSummarizeByRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public SummarizeDevicePerformanceDevicesWithSummarizeByRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/userExperienceAnalyticsDevicePerformance/microsoft.graph.summarizeDevicePerformanceDevices(summarizeBy='{summarizeBy}')";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Invoke function summarizeDevicePerformanceDevices
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Invoke function summarizeDevicePerformanceDevices
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<SummarizeDevicePerformanceDevicesWithSummarizeByRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final SummarizeDevicePerformanceDevicesWithSummarizeByRequestBuilderGetRequestConfiguration requestConfig = new SummarizeDevicePerformanceDevicesWithSummarizeByRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Invoke function summarizeDevicePerformanceDevices
     * @return a CompletableFuture of summarizeDevicePerformanceDevicesWithSummarizeByResponse
     */
    public java.util.concurrent.CompletableFuture<SummarizeDevicePerformanceDevicesWithSummarizeByResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            return this.requestAdapter.sendAsync(requestInfo, SummarizeDevicePerformanceDevicesWithSummarizeByResponse::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke function summarizeDevicePerformanceDevices
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of summarizeDevicePerformanceDevicesWithSummarizeByResponse
     */
    public java.util.concurrent.CompletableFuture<SummarizeDevicePerformanceDevicesWithSummarizeByResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<SummarizeDevicePerformanceDevicesWithSummarizeByRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, SummarizeDevicePerformanceDevicesWithSummarizeByResponse::createFromDiscriminatorValue, null, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke function summarizeDevicePerformanceDevices
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of summarizeDevicePerformanceDevicesWithSummarizeByResponse
     */
    public java.util.concurrent.CompletableFuture<SummarizeDevicePerformanceDevicesWithSummarizeByResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<SummarizeDevicePerformanceDevicesWithSummarizeByRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            return this.requestAdapter.sendAsync(requestInfo, SummarizeDevicePerformanceDevicesWithSummarizeByResponse::createFromDiscriminatorValue, responseHandler, null);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class SummarizeDevicePerformanceDevicesWithSummarizeByRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new summarizeDevicePerformanceDevicesWithSummarizeByRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public SummarizeDevicePerformanceDevicesWithSummarizeByRequestBuilderGetRequestConfiguration() {
        }
    }
}
