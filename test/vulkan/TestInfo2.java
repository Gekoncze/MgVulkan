package test.vulkan;

import cz.mg.collections.array.ReadonlyArray;
import cz.mg.vulkan.*;
import cz.mg.vulkan.handles.VulkanInstance;
import cz.mg.vulkan.handles.VulkanPhysicalDevice;
import cz.mg.vulkan.structures.*;

import static cz.mg.vulkan.jna.utilities.ToString.*;


public class TestInfo2 {
    public static void printVulkanSupportedExtensions(Vulkan vulkan){
        ReadonlyArray<VulkanExtensionProperties> properties = vulkan.getExtensionProperties();
        System.out.println("found " + properties.count() + " vulkan extensions:");
        for(VulkanExtensionProperties property : properties){
            System.out.println("    " + property.getExtensionName() + " (version " + property.getSpecVersion() + ")");
        }
        System.out.println();
    }

    public static void printVulkanSupportedLayers(Vulkan vulkan){
        ReadonlyArray<VulkanLayerProperties> properties = vulkan.getLayerProperties();
        System.out.println("found " + properties.count() + " vulkan layers:");
        for(VulkanLayerProperties property : properties){
            System.out.println("    " + property.getLayerName() + " (version " + property.getSpecVersion() + ", " + property.getImplementationVersion() + ")");
            System.out.println("        " + property.getDescription());
        }
        System.out.println();
    }

    public static void printVulkanDevices(VulkanInstance instance, boolean details){
        ReadonlyArray<VulkanPhysicalDevice> physicalDevices = instance.getPhysicalDevices();
        System.out.println("found " + physicalDevices.count() + " devices:");
        for(VulkanPhysicalDevice physicalDevice : physicalDevices){
            printVulkanDevice(physicalDevice, details);
        }
    }

    private static void printVulkanDevice(VulkanPhysicalDevice device, boolean details){
        printVulkanDeviceProperties(device, details);
        if(details) printVulkanDeviceFeatures(device);
        if(details) printVulkanDeviceMemoryProperties(device);
        printVulkanDeviceQueueFamilyProperties(device);
    }

    private static void printVulkanDeviceProperties(VulkanPhysicalDevice device, boolean details){
        VulkanPhysicalDeviceProperties deviceProperties = device.getProperties();
        System.out.println("Device: " + deviceProperties.getDeviceName());
        System.out.println("    device id: " + deviceProperties.getDeviceID());
        System.out.println("    vendor id: " + deviceProperties.getVendorID() + " (" + deviceProperties.getVendor() + ")");
        System.out.println("    api version: " + deviceProperties.getApiVersion());
        System.out.println("    driver version: " + deviceProperties.getDriverVersion());
        System.out.println("    device type: " + deviceProperties.getDeviceType());
        if(details) System.out.println("    pipeline cache UUID: " + bytesToHexString(deviceProperties.getPipelineCacheUUID()));
        System.out.println();
        if(details) printVulkanDeviceSparseProperties(deviceProperties);
        if(details) printVulkanDeviceLimits(deviceProperties);
    }

    private static void printVulkanDeviceSparseProperties(VulkanPhysicalDeviceProperties deviceProperties){
        System.out.println("    sparse properties:");
        System.out.println("        residency aligned mip size: " + deviceProperties.getSparseProperties().isResidencyAlignedMipSize());
        System.out.println("        residency non resident strict: " + deviceProperties.getSparseProperties().isResidencyNonResidentStrict());
        System.out.println("        residency standard 2D block shape: " + deviceProperties.getSparseProperties().isResidencyStandard2DBlockShape());
        System.out.println("        residency standard 2D multisample block shape: " + deviceProperties.getSparseProperties().isResidencyStandard2DMultisampleBlockShape());
        System.out.println("        residency standard 3D block shape: " + deviceProperties.getSparseProperties().isResidencyStandard3DBlockShape());
        System.out.println();
    }

    private static void printVulkanDeviceLimits(VulkanPhysicalDeviceProperties deviceProperties){
        System.out.println("    limits:");
        System.out.println("        maxImageDimension1D: " + deviceProperties.getLimits().getMaxImageDimension1D());
        System.out.println("        maxImageDimension2D: " + deviceProperties.getLimits().getMaxImageDimension2D());
        System.out.println("        maxImageDimension3D: " + deviceProperties.getLimits().getMaxImageDimension3D());
        System.out.println("        maxImageDimensionCube: " + deviceProperties.getLimits().getMaxImageDimensionCube());
        System.out.println("        maxImageArrayLayers: " + deviceProperties.getLimits().getMaxImageArrayLayers());
        System.out.println("        maxTexelBufferElements: " + deviceProperties.getLimits().getMaxTexelBufferElements());
        System.out.println("        maxUniformBufferRange: " + deviceProperties.getLimits().getMaxUniformBufferRange());
        System.out.println("        maxStorageBufferRange: " + deviceProperties.getLimits().getMaxStorageBufferRange());
        System.out.println("        maxPushConstantsSize: " + deviceProperties.getLimits().getMaxPushConstantsSize());
        System.out.println("        maxMemoryAllocationCount: " + deviceProperties.getLimits().getMaxMemoryAllocationCount());
        System.out.println("        maxSamplerAllocationCount: " + deviceProperties.getLimits().getMaxSamplerAllocationCount());
        System.out.println("        bufferImageGranularity: " + deviceProperties.getLimits().getBufferImageGranularity());
        System.out.println("        sparseAddressSpaceSize: " + deviceProperties.getLimits().getSparseAddressSpaceSize());
        System.out.println("        maxBoundDescriptorSets: " + deviceProperties.getLimits().getMaxBoundDescriptorSets());
        System.out.println("        maxPerStageDescriptorSamplers: " + deviceProperties.getLimits().getMaxPerStageDescriptorSamplers());
        System.out.println("        maxPerStageDescriptorUniformBuffers: " + deviceProperties.getLimits().getMaxPerStageDescriptorUniformBuffers());
        System.out.println("        maxPerStageDescriptorStorageBuffers: " + deviceProperties.getLimits().getMaxPerStageDescriptorStorageBuffers());
        System.out.println("        maxPerStageDescriptorSampledImages: " + deviceProperties.getLimits().getMaxPerStageDescriptorSampledImages());
        System.out.println("        maxPerStageDescriptorStorageImages: " + deviceProperties.getLimits().getMaxPerStageDescriptorStorageImages());
        System.out.println("        maxPerStageDescriptorInputAttachments: " + deviceProperties.getLimits().getMaxPerStageDescriptorInputAttachments());
        System.out.println("        maxPerStageResources: " + deviceProperties.getLimits().getMaxPerStageResources());
        System.out.println("        maxDescriptorSetSamplers: " + deviceProperties.getLimits().getMaxDescriptorSetSamplers());
        System.out.println("        maxDescriptorSetUniformBuffers: " + deviceProperties.getLimits().getMaxDescriptorSetUniformBuffers());
        System.out.println("        maxDescriptorSetUniformBuffersDynamic: " + deviceProperties.getLimits().getMaxDescriptorSetUniformBuffersDynamic());
        System.out.println("        maxDescriptorSetStorageBuffers: " + deviceProperties.getLimits().getMaxDescriptorSetStorageBuffers());
        System.out.println("        maxDescriptorSetStorageBuffersDynamic: " + deviceProperties.getLimits().getMaxDescriptorSetStorageBuffersDynamic());
        System.out.println("        maxDescriptorSetSampledImages: " + deviceProperties.getLimits().getMaxDescriptorSetSampledImages());
        System.out.println("        maxDescriptorSetStorageImages: " + deviceProperties.getLimits().getMaxDescriptorSetStorageImages());
        System.out.println("        maxDescriptorSetInputAttachments: " + deviceProperties.getLimits().getMaxDescriptorSetInputAttachments());
        System.out.println("        maxVertexInputAttributes: " + deviceProperties.getLimits().getMaxVertexInputAttributes());
        System.out.println("        maxVertexInputBindings: " + deviceProperties.getLimits().getMaxVertexInputBindings());
        System.out.println("        maxVertexInputAttributeOffset: " + deviceProperties.getLimits().getMaxVertexInputAttributeOffset());
        System.out.println("        maxVertexInputBindingStride: " + deviceProperties.getLimits().getMaxVertexInputBindingStride());
        System.out.println("        maxVertexOutputComponents: " + deviceProperties.getLimits().getMaxVertexOutputComponents());
        System.out.println("        maxTessellationGenerationLevel: " + deviceProperties.getLimits().getMaxTessellationGenerationLevel());
        System.out.println("        maxTessellationPatchSize: " + deviceProperties.getLimits().getMaxTessellationPatchSize());
        System.out.println("        maxTessellationControlPerVertexInputComponents: " + deviceProperties.getLimits().getMaxTessellationControlPerVertexInputComponents());
        System.out.println("        maxTessellationControlPerVertexOutputComponents: " + deviceProperties.getLimits().getMaxTessellationControlPerVertexOutputComponents());
        System.out.println("        maxTessellationControlPerPatchOutputComponents: " + deviceProperties.getLimits().getMaxTessellationControlPerPatchOutputComponents());
        System.out.println("        maxTessellationControlTotalOutputComponents: " + deviceProperties.getLimits().getMaxTessellationControlTotalOutputComponents());
        System.out.println("        maxTessellationEvaluationInputComponents: " + deviceProperties.getLimits().getMaxTessellationEvaluationInputComponents());
        System.out.println("        maxTessellationEvaluationOutputComponents: " + deviceProperties.getLimits().getMaxTessellationEvaluationOutputComponents());
        System.out.println("        maxGeometryShaderInvocations: " + deviceProperties.getLimits().getMaxGeometryShaderInvocations());
        System.out.println("        maxGeometryInputComponents: " + deviceProperties.getLimits().getMaxGeometryInputComponents());
        System.out.println("        maxGeometryOutputComponents: " + deviceProperties.getLimits().getMaxGeometryOutputComponents());
        System.out.println("        maxGeometryOutputVertices: " + deviceProperties.getLimits().getMaxGeometryOutputVertices());
        System.out.println("        maxGeometryTotalOutputComponents: " + deviceProperties.getLimits().getMaxGeometryTotalOutputComponents());
        System.out.println("        maxFragmentInputComponents: " + deviceProperties.getLimits().getMaxFragmentInputComponents());
        System.out.println("        maxFragmentOutputAttachments: " + deviceProperties.getLimits().getMaxFragmentOutputAttachments());
        System.out.println("        maxFragmentDualSrcAttachments: " + deviceProperties.getLimits().getMaxFragmentDualSrcAttachments());
        System.out.println("        maxFragmentCombinedOutputResources: " + deviceProperties.getLimits().getMaxFragmentCombinedOutputResources());
        System.out.println("        maxComputeSharedMemorySize: " + deviceProperties.getLimits().getMaxComputeSharedMemorySize());
        System.out.println("        maxComputeWorkGroupCount[0]: " + deviceProperties.getLimits().getMaxComputeWorkGroupCount()[0]);
        System.out.println("        maxComputeWorkGroupCount[1]: " + deviceProperties.getLimits().getMaxComputeWorkGroupCount()[1]);
        System.out.println("        maxComputeWorkGroupCount[2]: " + deviceProperties.getLimits().getMaxComputeWorkGroupCount()[2]);
        System.out.println("        maxComputeWorkGroupInvocations: " + deviceProperties.getLimits().getMaxComputeWorkGroupInvocations());
        System.out.println("        maxComputeWorkGroupSize[0]: " + deviceProperties.getLimits().getMaxComputeWorkGroupSize()[0]);
        System.out.println("        maxComputeWorkGroupSize[1]: " + deviceProperties.getLimits().getMaxComputeWorkGroupSize()[1]);
        System.out.println("        maxComputeWorkGroupSize[2]: " + deviceProperties.getLimits().getMaxComputeWorkGroupSize()[2]);
        System.out.println("        subPixelPrecisionBits: " + deviceProperties.getLimits().getSubPixelPrecisionBits());
        System.out.println("        subTexelPrecisionBits: " + deviceProperties.getLimits().getSubTexelPrecisionBits());
        System.out.println("        mipmapPrecisionBits: " + deviceProperties.getLimits().getMipmapPrecisionBits());
        System.out.println("        maxDrawIndexedIndexValue: " + deviceProperties.getLimits().getMaxDrawIndexedIndexValue());
        System.out.println("        maxDrawIndirectCount: " + deviceProperties.getLimits().getMaxDrawIndirectCount());
        System.out.println("        maxSamplerLodBias: " + deviceProperties.getLimits().getMaxSamplerLodBias());
        System.out.println("        maxSamplerAnisotropy: " + deviceProperties.getLimits().getMaxSamplerAnisotropy());
        System.out.println("        maxViewports: " + deviceProperties.getLimits().getMaxViewports());
        System.out.println("        maxViewportDimensions[0]: " + deviceProperties.getLimits().getMaxViewportDimensions()[0]);
        System.out.println("        maxViewportDimensions[1]: " + deviceProperties.getLimits().getMaxViewportDimensions()[1]);
        System.out.println("        viewportBoundsRange[0]: " + deviceProperties.getLimits().getViewportBoundsRange()[0]);
        System.out.println("        viewportBoundsRange[1]: " + deviceProperties.getLimits().getViewportBoundsRange()[1]);
        System.out.println("        viewportSubPixelBits: " + deviceProperties.getLimits().getViewportSubPixelBits());
        System.out.println("        minMemoryMapAlignment: " + deviceProperties.getLimits().getMinMemoryMapAlignment());
        System.out.println("        minTexelBufferOffsetAlignment: " + deviceProperties.getLimits().getMinTexelBufferOffsetAlignment());
        System.out.println("        minUniformBufferOffsetAlignment: " + deviceProperties.getLimits().getMinUniformBufferOffsetAlignment());
        System.out.println("        minStorageBufferOffsetAlignment: " + deviceProperties.getLimits().getMinStorageBufferOffsetAlignment());
        System.out.println("        minTexelOffset: " + deviceProperties.getLimits().getMinTexelOffset());
        System.out.println("        maxTexelOffset: " + deviceProperties.getLimits().getMaxTexelOffset());
        System.out.println("        minTexelGatherOffset: " + deviceProperties.getLimits().getMinTexelGatherOffset());
        System.out.println("        maxTexelGatherOffset: " + deviceProperties.getLimits().getMaxTexelGatherOffset());
        System.out.println("        minInterpolationOffset: " + deviceProperties.getLimits().getMinInterpolationOffset());
        System.out.println("        maxInterpolationOffset: " + deviceProperties.getLimits().getMaxInterpolationOffset());
        System.out.println("        subPixelInterpolationOffsetBits: " + deviceProperties.getLimits().getSubPixelInterpolationOffsetBits());
        System.out.println("        maxFramebufferWidth: " + deviceProperties.getLimits().getMaxFramebufferWidth());
        System.out.println("        maxFramebufferHeight: " + deviceProperties.getLimits().getMaxFramebufferHeight());
        System.out.println("        maxFramebufferLayers: " + deviceProperties.getLimits().getMaxFramebufferLayers());
        System.out.println("        framebufferColorSampleCounts: " + deviceProperties.getLimits().getFramebufferColorSampleCounts());
        System.out.println("        framebufferDepthSampleCounts: " + deviceProperties.getLimits().getFramebufferDepthSampleCounts());
        System.out.println("        framebufferStencilSampleCounts: " + deviceProperties.getLimits().getFramebufferStencilSampleCounts());
        System.out.println("        framebufferNoAttachmentsSampleCounts: " + deviceProperties.getLimits().getFramebufferNoAttachmentsSampleCounts());
        System.out.println("        maxColorAttachments: " + deviceProperties.getLimits().getMaxColorAttachments());
        System.out.println("        sampledImageColorSampleCounts: " + deviceProperties.getLimits().getSampledImageColorSampleCounts());
        System.out.println("        sampledImageIntegerSampleCounts: " + deviceProperties.getLimits().getSampledImageIntegerSampleCounts());
        System.out.println("        sampledImageDepthSampleCounts: " + deviceProperties.getLimits().getSampledImageDepthSampleCounts());
        System.out.println("        sampledImageStencilSampleCounts: " + deviceProperties.getLimits().getSampledImageStencilSampleCounts());
        System.out.println("        storageImageSampleCounts: " + deviceProperties.getLimits().getStorageImageSampleCounts());
        System.out.println("        maxSampleMaskWords: " + deviceProperties.getLimits().getMaxSampleMaskWords());
        System.out.println("        timestampComputeAndGraphics: " + deviceProperties.getLimits().isTimestampComputeAndGraphics());
        System.out.println("        timestampPeriod: " + deviceProperties.getLimits().getTimestampPeriod());
        System.out.println("        maxClipDistances: " + deviceProperties.getLimits().getMaxClipDistances());
        System.out.println("        maxCullDistances: " + deviceProperties.getLimits().getMaxCullDistances());
        System.out.println("        maxCombinedClipAndCullDistances: " + deviceProperties.getLimits().getMaxCombinedClipAndCullDistances());
        System.out.println("        discreteQueuePriorities: " + deviceProperties.getLimits().getDiscreteQueuePriorities());
        System.out.println("        pointSizeRange[0]: " + deviceProperties.getLimits().getPointSizeRange()[0]);
        System.out.println("        pointSizeRange[1]: " + deviceProperties.getLimits().getPointSizeRange()[1]);
        System.out.println("        lineWidthRange[0]: " + deviceProperties.getLimits().getLineWidthRange()[0]);
        System.out.println("        lineWidthRange[1]: " + deviceProperties.getLimits().getLineWidthRange()[1]);
        System.out.println("        pointSizeGranularity: " + deviceProperties.getLimits().getPointSizeGranularity());
        System.out.println("        lineWidthGranularity: " + deviceProperties.getLimits().getLineWidthGranularity());
        System.out.println("        strictLines: " + deviceProperties.getLimits().isStrictLines());
        System.out.println("        standardSampleLocations: " + deviceProperties.getLimits().isStandardSampleLocations());
        System.out.println("        optimalBufferCopyOffsetAlignment: " + deviceProperties.getLimits().getOptimalBufferCopyOffsetAlignment());
        System.out.println("        optimalBufferCopyRowPitchAlignment: " + deviceProperties.getLimits().getOptimalBufferCopyRowPitchAlignment());
        System.out.println("        nonCoherentAtomSize: " + deviceProperties.getLimits().getNonCoherentAtomSize());
        System.out.println();
    }

    private static void printVulkanDeviceFeatures(VulkanPhysicalDevice vDevice){
        VulkanPhysicalDeviceFeatures features = vDevice.getFeatures();
        System.out.println("    features:");
        System.out.println("        robustBufferAccess: " + features.isRobustBufferAccess());
        System.out.println("        fullDrawIndexUint32: " + features.isFullDrawIndexUint32());
        System.out.println("        imageCubeArray: " + features.isImageCubeArray());
        System.out.println("        independentBlend: " + features.isIndependentBlend());
        System.out.println("        geometryShader: " + features.isGeometryShader());
        System.out.println("        tessellationShader: " + features.isTessellationShader());
        System.out.println("        sampleRateShading: " + features.isSampleRateShading());
        System.out.println("        dualSrcBlend: " + features.isDualSrcBlend());
        System.out.println("        logicOp: " + features.isLogicOp());
        System.out.println("        multiDrawIndirect: " + features.isMultiDrawIndirect());
        System.out.println("        drawIndirectFirstInstance: " + features.isDrawIndirectFirstInstance());
        System.out.println("        depthClamp: " + features.isDepthClamp());
        System.out.println("        depthBiasClamp: " + features.isDepthBiasClamp());
        System.out.println("        fillModeNonSolid: " + features.isFillModeNonSolid());
        System.out.println("        depthBounds: " + features.isDepthBounds());
        System.out.println("        wideLines: " + features.isWideLines());
        System.out.println("        largePoints: " + features.isLargePoints());
        System.out.println("        alphaToOne: " + features.isAlphaToOne());
        System.out.println("        multiViewport: " + features.isMultiViewport());
        System.out.println("        samplerAnisotropy: " + features.isSamplerAnisotropy());
        System.out.println("        textureCompressionETC2: " + features.isTextureCompressionETC2());
        System.out.println("        textureCompressionASTC_LDR: " + features.isTextureCompressionASTC_LDR());
        System.out.println("        textureCompressionBC: " + features.isTextureCompressionBC());
        System.out.println("        occlusionQueryPrecise: " + features.isOcclusionQueryPrecise());
        System.out.println("        pipelineStatisticsQuery: " + features.isPipelineStatisticsQuery());
        System.out.println("        vertexPipelineStoresAndAtomics: " + features.isVertexPipelineStoresAndAtomics());
        System.out.println("        fragmentStoresAndAtomics: " + features.isFragmentStoresAndAtomics());
        System.out.println("        shaderTessellationAndGeometryPointSize: " + features.isShaderTessellationAndGeometryPointSize());
        System.out.println("        shaderImageGatherExtended: " + features.isShaderImageGatherExtended());
        System.out.println("        shaderStorageImageExtendedFormats: " + features.isShaderStorageImageExtendedFormats());
        System.out.println("        shaderStorageImageMultisample: " + features.isShaderStorageImageMultisample());
        System.out.println("        shaderStorageImageReadWithoutFormat: " + features.isShaderStorageImageReadWithoutFormat());
        System.out.println("        shaderStorageImageWriteWithoutFormat: " + features.isShaderStorageImageWriteWithoutFormat());
        System.out.println("        shaderUniformBufferArrayDynamicIndexing: " + features.isShaderUniformBufferArrayDynamicIndexing());
        System.out.println("        shaderSampledImageArrayDynamicIndexing: " + features.isShaderSampledImageArrayDynamicIndexing());
        System.out.println("        shaderStorageBufferArrayDynamicIndexing: " + features.isShaderStorageBufferArrayDynamicIndexing());
        System.out.println("        shaderStorageImageArrayDynamicIndexing: " + features.isShaderStorageImageArrayDynamicIndexing());
        System.out.println("        shaderClipDistance: " + features.isShaderClipDistance());
        System.out.println("        shaderCullDistance: " + features.isShaderCullDistance());
        System.out.println("        shaderFloat64: " + features.isShaderFloat64());
        System.out.println("        shaderInt64: " + features.isShaderInt64());
        System.out.println("        shaderInt16: " + features.isShaderInt16());
        System.out.println("        shaderResourceResidency: " + features.isShaderResourceResidency());
        System.out.println("        shaderResourceMinLod: " + features.isShaderResourceMinLod());
        System.out.println("        sparseBinding: " + features.isSparseBinding());
        System.out.println("        sparseResidencyBuffer: " + features.isSparseResidencyBuffer());
        System.out.println("        sparseResidencyImage2D: " + features.isSparseResidencyImage2D());
        System.out.println("        sparseResidencyImage3D: " + features.isSparseResidencyImage3D());
        System.out.println("        sparseResidency2Samples: " + features.isSparseResidency2Samples());
        System.out.println("        sparseResidency4Samples: " + features.isSparseResidency4Samples());
        System.out.println("        sparseResidency8Samples: " + features.isSparseResidency8Samples());
        System.out.println("        sparseResidency16Samples: " + features.isSparseResidency16Samples());
        System.out.println("        sparseResidencyAliased: " + features.isSparseResidencyAliased());
        System.out.println("        variableMultisampleRate: " + features.isVariableMultisampleRate());
        System.out.println("        inheritedQueries: " + features.isInheritedQueries());
        System.out.println();
    }

    private static void printVulkanDeviceMemoryProperties(VulkanPhysicalDevice device){
        VulkanPhysicalDeviceMemoryProperties deviceMemoryProperties = device.getMemoryProperties();
        System.out.println("    memory properties:");
        System.out.println("        memory type count: " + deviceMemoryProperties.getMemoryTypeCount()); // TODO - print more info
        System.out.println("        memory heap count: " + deviceMemoryProperties.getMemoryHeapCount()); // TODO - print more info
        System.out.println();
    }

    private static void printVulkanDeviceQueueFamilyProperties(VulkanPhysicalDevice device){
        ReadonlyArray<VulkanQueueFamilyProperties> queueFamilyProperties = device.getQueueFamilyProperties();
        System.out.println("    found " + queueFamilyProperties.count() + " queue families:");
        for(VulkanQueueFamilyProperties p : queueFamilyProperties){ // TODO - print more info
            System.out.println("        queue count: " + p.getQueueCount());
            System.out.println("        flags: " + p.getQueueFlags());
        }
        System.out.println();
    }
}
