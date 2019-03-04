package test.vk;

import cz.mg.vulkan.jna.arrays.VkExtensionPropertiesArray;
import cz.mg.vulkan.jna.arrays.VkLayerPropertiesArray;
import cz.mg.vulkan.jna.arrays.VkPhysicalDeviceArray;
import cz.mg.vulkan.jna.arrays.VkQueueFamilyPropertiesArray;
import cz.mg.vulkan.jna.handles.VkPhysicalDevice;
import cz.mg.vulkan.jna.structures.*;

import static cz.mg.vulkan.jna.utilities.ToString.*;
import static test.vk.Test.vks;


public class TestInfo {
    public static void printVulkanSupportedExtensions(){
        VkExtensionPropertiesArray properties = vks.vkEnumerateInstanceExtensionProperties();
        System.out.println("found " + properties.count() + " vulkan extensions:");
        for(VkExtensionProperties property : properties){
            System.out.println("    " + textToString(property.extensionName) + " (version " + versionToString(property.specVersion) + ")");
        }
        System.out.println();
    }

    public static void printVulkanSupportedLayers(){
        VkLayerPropertiesArray properties = vks.vkEnumerateInstanceLayerProperties();
        System.out.println("found " + properties.count() + " vulkan layers:");
        for(VkLayerProperties property : properties){
            System.out.println("    " + textToString(property.layerName) + " (version " + versionToString(property.specVersion) + ", " + versionToString(property.implementationVersion) + ")");
            System.out.println("        " + textToString(property.description));
        }
        System.out.println();
    }

    public static void printVulkanDevices(VkPhysicalDeviceArray physicalDevices, boolean details){
        System.out.println("found " + physicalDevices.count() + " devices:");
        for(VkPhysicalDevice physicalDevice : physicalDevices){
            printVulkanDevice(physicalDevice.byValue(true, true), details);
        }
    }

    private static void printVulkanDevice(VkPhysicalDevice.ByValue device, boolean details){
        printVulkanDeviceProperties(device, details);
        if(details) printVulkanDeviceFeatures(device);
        if(details) printVulkanDeviceMemoryProperties(device);
        printVulkanDeviceQueueFamilyProperties(device);
    }

    private static void printVulkanDeviceProperties(VkPhysicalDevice.ByValue device, boolean details){
        VkPhysicalDeviceProperties.ByReference deviceProperties = vks.vkGetPhysicalDeviceProperties(device);
        System.out.println("Device: " + textToString(deviceProperties.deviceName));
        System.out.println("    device id: " + deviceProperties.deviceID);
        System.out.println("    vendor id: " + deviceProperties.vendorID + " (" + vendorToString(deviceProperties.vendorID) + ")");
        System.out.println("    api version: " + versionToString(deviceProperties.apiVersion));
        System.out.println("    driver version: " + versionToString(deviceProperties.driverVersion));
        System.out.println("    device type: " + constantToString(deviceProperties.deviceType.value, deviceProperties.deviceType.getClass()));
        if(details) System.out.println("    pipeline cache UUID: " + bytesToHexString(deviceProperties.pipelineCacheUUID));
        System.out.println();
        if(details) printVulkanDeviceSparseProperties(deviceProperties);
        if(details) printVulkanDeviceLimits(deviceProperties);
        printVulkanDeviceImageProperties(device);
    }

    private static void printVulkanDeviceSparseProperties(VkPhysicalDeviceProperties deviceProperties){
        System.out.println("    sparse properties:");
        System.out.println("        residency aligned mip size: " + deviceProperties.sparseProperties.residencyAlignedMipSize);
        System.out.println("        residency non resident strict: " + deviceProperties.sparseProperties.residencyNonResidentStrict);
        System.out.println("        residency standard 2D block shape: " + deviceProperties.sparseProperties.residencyStandard2DBlockShape);
        System.out.println("        residency standard 2D multisample block shape: " + deviceProperties.sparseProperties.residencyStandard2DMultisampleBlockShape);
        System.out.println("        residency standard 3D block shape: " + deviceProperties.sparseProperties.residencyStandard3DBlockShape);
        System.out.println();
    }

    private static void printVulkanDeviceLimits(VkPhysicalDeviceProperties deviceProperties){
        System.out.println("    limits:");
        System.out.println("        maxImageDimension1D: " + deviceProperties.limits.maxImageDimension1D);
        System.out.println("        maxImageDimension2D: " + deviceProperties.limits.maxImageDimension2D);
        System.out.println("        maxImageDimension3D: " + deviceProperties.limits.maxImageDimension3D);
        System.out.println("        maxImageDimensionCube: " + deviceProperties.limits.maxImageDimensionCube);
        System.out.println("        maxImageArrayLayers: " + deviceProperties.limits.maxImageArrayLayers);
        System.out.println("        maxTexelBufferElements: " + deviceProperties.limits.maxTexelBufferElements);
        System.out.println("        maxUniformBufferRange: " + deviceProperties.limits.maxUniformBufferRange);
        System.out.println("        maxStorageBufferRange: " + deviceProperties.limits.maxStorageBufferRange);
        System.out.println("        maxPushConstantsSize: " + deviceProperties.limits.maxPushConstantsSize);
        System.out.println("        maxMemoryAllocationCount: " + deviceProperties.limits.maxMemoryAllocationCount);
        System.out.println("        maxSamplerAllocationCount: " + deviceProperties.limits.maxSamplerAllocationCount);
        System.out.println("        bufferImageGranularity: " + deviceProperties.limits.bufferImageGranularity);
        System.out.println("        sparseAddressSpaceSize: " + deviceProperties.limits.sparseAddressSpaceSize);
        System.out.println("        maxBoundDescriptorSets: " + deviceProperties.limits.maxBoundDescriptorSets);
        System.out.println("        maxPerStageDescriptorSamplers: " + deviceProperties.limits.maxPerStageDescriptorSamplers);
        System.out.println("        maxPerStageDescriptorUniformBuffers: " + deviceProperties.limits.maxPerStageDescriptorUniformBuffers);
        System.out.println("        maxPerStageDescriptorStorageBuffers: " + deviceProperties.limits.maxPerStageDescriptorStorageBuffers);
        System.out.println("        maxPerStageDescriptorSampledImages: " + deviceProperties.limits.maxPerStageDescriptorSampledImages);
        System.out.println("        maxPerStageDescriptorStorageImages: " + deviceProperties.limits.maxPerStageDescriptorStorageImages);
        System.out.println("        maxPerStageDescriptorInputAttachments: " + deviceProperties.limits.maxPerStageDescriptorInputAttachments);
        System.out.println("        maxPerStageResources: " + deviceProperties.limits.maxPerStageResources);
        System.out.println("        maxDescriptorSetSamplers: " + deviceProperties.limits.maxDescriptorSetSamplers);
        System.out.println("        maxDescriptorSetUniformBuffers: " + deviceProperties.limits.maxDescriptorSetUniformBuffers);
        System.out.println("        maxDescriptorSetUniformBuffersDynamic: " + deviceProperties.limits.maxDescriptorSetUniformBuffersDynamic);
        System.out.println("        maxDescriptorSetStorageBuffers: " + deviceProperties.limits.maxDescriptorSetStorageBuffers);
        System.out.println("        maxDescriptorSetStorageBuffersDynamic: " + deviceProperties.limits.maxDescriptorSetStorageBuffersDynamic);
        System.out.println("        maxDescriptorSetSampledImages: " + deviceProperties.limits.maxDescriptorSetSampledImages);
        System.out.println("        maxDescriptorSetStorageImages: " + deviceProperties.limits.maxDescriptorSetStorageImages);
        System.out.println("        maxDescriptorSetInputAttachments: " + deviceProperties.limits.maxDescriptorSetInputAttachments);
        System.out.println("        maxVertexInputAttributes: " + deviceProperties.limits.maxVertexInputAttributes);
        System.out.println("        maxVertexInputBindings: " + deviceProperties.limits.maxVertexInputBindings);
        System.out.println("        maxVertexInputAttributeOffset: " + deviceProperties.limits.maxVertexInputAttributeOffset);
        System.out.println("        maxVertexInputBindingStride: " + deviceProperties.limits.maxVertexInputBindingStride);
        System.out.println("        maxVertexOutputComponents: " + deviceProperties.limits.maxVertexOutputComponents);
        System.out.println("        maxTessellationGenerationLevel: " + deviceProperties.limits.maxTessellationGenerationLevel);
        System.out.println("        maxTessellationPatchSize: " + deviceProperties.limits.maxTessellationPatchSize);
        System.out.println("        maxTessellationControlPerVertexInputComponents: " + deviceProperties.limits.maxTessellationControlPerVertexInputComponents);
        System.out.println("        maxTessellationControlPerVertexOutputComponents: " + deviceProperties.limits.maxTessellationControlPerVertexOutputComponents);
        System.out.println("        maxTessellationControlPerPatchOutputComponents: " + deviceProperties.limits.maxTessellationControlPerPatchOutputComponents);
        System.out.println("        maxTessellationControlTotalOutputComponents: " + deviceProperties.limits.maxTessellationControlTotalOutputComponents);
        System.out.println("        maxTessellationEvaluationInputComponents: " + deviceProperties.limits.maxTessellationEvaluationInputComponents);
        System.out.println("        maxTessellationEvaluationOutputComponents: " + deviceProperties.limits.maxTessellationEvaluationOutputComponents);
        System.out.println("        maxGeometryShaderInvocations: " + deviceProperties.limits.maxGeometryShaderInvocations);
        System.out.println("        maxGeometryInputComponents: " + deviceProperties.limits.maxGeometryInputComponents);
        System.out.println("        maxGeometryOutputComponents: " + deviceProperties.limits.maxGeometryOutputComponents);
        System.out.println("        maxGeometryOutputVertices: " + deviceProperties.limits.maxGeometryOutputVertices);
        System.out.println("        maxGeometryTotalOutputComponents: " + deviceProperties.limits.maxGeometryTotalOutputComponents);
        System.out.println("        maxFragmentInputComponents: " + deviceProperties.limits.maxFragmentInputComponents);
        System.out.println("        maxFragmentOutputAttachments: " + deviceProperties.limits.maxFragmentOutputAttachments);
        System.out.println("        maxFragmentDualSrcAttachments: " + deviceProperties.limits.maxFragmentDualSrcAttachments);
        System.out.println("        maxFragmentCombinedOutputResources: " + deviceProperties.limits.maxFragmentCombinedOutputResources);
        System.out.println("        maxComputeSharedMemorySize: " + deviceProperties.limits.maxComputeSharedMemorySize);
        System.out.println("        maxComputeWorkGroupCount[0]: " + deviceProperties.limits.maxComputeWorkGroupCount[0]);
        System.out.println("        maxComputeWorkGroupCount[1]: " + deviceProperties.limits.maxComputeWorkGroupCount[1]);
        System.out.println("        maxComputeWorkGroupCount[2]: " + deviceProperties.limits.maxComputeWorkGroupCount[2]);
        System.out.println("        maxComputeWorkGroupInvocations: " + deviceProperties.limits.maxComputeWorkGroupInvocations);
        System.out.println("        maxComputeWorkGroupSize[0]: " + deviceProperties.limits.maxComputeWorkGroupSize[0]);
        System.out.println("        maxComputeWorkGroupSize[1]: " + deviceProperties.limits.maxComputeWorkGroupSize[1]);
        System.out.println("        maxComputeWorkGroupSize[2]: " + deviceProperties.limits.maxComputeWorkGroupSize[2]);
        System.out.println("        subPixelPrecisionBits: " + deviceProperties.limits.subPixelPrecisionBits);
        System.out.println("        subTexelPrecisionBits: " + deviceProperties.limits.subTexelPrecisionBits);
        System.out.println("        mipmapPrecisionBits: " + deviceProperties.limits.mipmapPrecisionBits);
        System.out.println("        maxDrawIndexedIndexValue: " + deviceProperties.limits.maxDrawIndexedIndexValue);
        System.out.println("        maxDrawIndirectCount: " + deviceProperties.limits.maxDrawIndirectCount);
        System.out.println("        maxSamplerLodBias: " + deviceProperties.limits.maxSamplerLodBias);
        System.out.println("        maxSamplerAnisotropy: " + deviceProperties.limits.maxSamplerAnisotropy);
        System.out.println("        maxViewports: " + deviceProperties.limits.maxViewports);
        System.out.println("        maxViewportDimensions[0]: " + deviceProperties.limits.maxViewportDimensions[0]);
        System.out.println("        maxViewportDimensions[1]: " + deviceProperties.limits.maxViewportDimensions[1]);
        System.out.println("        viewportBoundsRange[0]: " + deviceProperties.limits.viewportBoundsRange[0]);
        System.out.println("        viewportBoundsRange[1]: " + deviceProperties.limits.viewportBoundsRange[1]);
        System.out.println("        viewportSubPixelBits: " + deviceProperties.limits.viewportSubPixelBits);
        System.out.println("        minMemoryMapAlignment: " + deviceProperties.limits.minMemoryMapAlignment.longValue());
        System.out.println("        minTexelBufferOffsetAlignment: " + deviceProperties.limits.minTexelBufferOffsetAlignment);
        System.out.println("        minUniformBufferOffsetAlignment: " + deviceProperties.limits.minUniformBufferOffsetAlignment);
        System.out.println("        minStorageBufferOffsetAlignment: " + deviceProperties.limits.minStorageBufferOffsetAlignment);
        System.out.println("        minTexelOffset: " + deviceProperties.limits.minTexelOffset);
        System.out.println("        maxTexelOffset: " + deviceProperties.limits.maxTexelOffset);
        System.out.println("        minTexelGatherOffset: " + deviceProperties.limits.minTexelGatherOffset);
        System.out.println("        maxTexelGatherOffset: " + deviceProperties.limits.maxTexelGatherOffset);
        System.out.println("        minInterpolationOffset: " + deviceProperties.limits.minInterpolationOffset);
        System.out.println("        maxInterpolationOffset: " + deviceProperties.limits.maxInterpolationOffset);
        System.out.println("        subPixelInterpolationOffsetBits: " + deviceProperties.limits.subPixelInterpolationOffsetBits);
        System.out.println("        maxFramebufferWidth: " + deviceProperties.limits.maxFramebufferWidth);
        System.out.println("        maxFramebufferHeight: " + deviceProperties.limits.maxFramebufferHeight);
        System.out.println("        maxFramebufferLayers: " + deviceProperties.limits.maxFramebufferLayers);
        System.out.println("        framebufferColorSampleCounts: " + deviceProperties.limits.framebufferColorSampleCounts.value);
        System.out.println("        framebufferDepthSampleCounts: " + deviceProperties.limits.framebufferDepthSampleCounts.value);
        System.out.println("        framebufferStencilSampleCounts: " + deviceProperties.limits.framebufferStencilSampleCounts.value);
        System.out.println("        framebufferNoAttachmentsSampleCounts: " + deviceProperties.limits.framebufferNoAttachmentsSampleCounts.value);
        System.out.println("        maxColorAttachments: " + deviceProperties.limits.maxColorAttachments);
        System.out.println("        sampledImageColorSampleCounts: " + deviceProperties.limits.sampledImageColorSampleCounts.value);
        System.out.println("        sampledImageIntegerSampleCounts: " + deviceProperties.limits.sampledImageIntegerSampleCounts.value);
        System.out.println("        sampledImageDepthSampleCounts: " + deviceProperties.limits.sampledImageDepthSampleCounts.value);
        System.out.println("        sampledImageStencilSampleCounts: " + deviceProperties.limits.sampledImageStencilSampleCounts.value);
        System.out.println("        storageImageSampleCounts: " + deviceProperties.limits.storageImageSampleCounts.value);
        System.out.println("        maxSampleMaskWords: " + deviceProperties.limits.maxSampleMaskWords);
        System.out.println("        timestampComputeAndGraphics: " + deviceProperties.limits.timestampComputeAndGraphics);
        System.out.println("        timestampPeriod: " + deviceProperties.limits.timestampPeriod);
        System.out.println("        maxClipDistances: " + deviceProperties.limits.maxClipDistances);
        System.out.println("        maxCullDistances: " + deviceProperties.limits.maxCullDistances);
        System.out.println("        maxCombinedClipAndCullDistances: " + deviceProperties.limits.maxCombinedClipAndCullDistances);
        System.out.println("        discreteQueuePriorities: " + deviceProperties.limits.discreteQueuePriorities);
        System.out.println("        pointSizeRange[0]: " + deviceProperties.limits.pointSizeRange[0]);
        System.out.println("        pointSizeRange[1]: " + deviceProperties.limits.pointSizeRange[1]);
        System.out.println("        lineWidthRange[0]: " + deviceProperties.limits.lineWidthRange[0]);
        System.out.println("        lineWidthRange[1]: " + deviceProperties.limits.lineWidthRange[1]);
        System.out.println("        pointSizeGranularity: " + deviceProperties.limits.pointSizeGranularity);
        System.out.println("        lineWidthGranularity: " + deviceProperties.limits.lineWidthGranularity);
        System.out.println("        strictLines: " + deviceProperties.limits.strictLines);
        System.out.println("        standardSampleLocations: " + deviceProperties.limits.standardSampleLocations);
        System.out.println("        optimalBufferCopyOffsetAlignment: " + deviceProperties.limits.optimalBufferCopyOffsetAlignment);
        System.out.println("        optimalBufferCopyRowPitchAlignment: " + deviceProperties.limits.optimalBufferCopyRowPitchAlignment);
        System.out.println("        nonCoherentAtomSize: " + deviceProperties.limits.nonCoherentAtomSize);
        System.out.println();
    }

    private static void printVulkanDeviceFeatures(VkPhysicalDevice.ByValue vDevice){
        VkPhysicalDeviceFeatures.ByReference deviceFeatures = vks.vkGetPhysicalDeviceFeatures(vDevice);
        System.out.println("    features:");
        System.out.println("        robustBufferAccess: " + booleanToString(deviceFeatures.robustBufferAccess));
        System.out.println("        fullDrawIndexUint32: " + booleanToString(deviceFeatures.fullDrawIndexUint32));
        System.out.println("        imageCubeArray: " + booleanToString(deviceFeatures.imageCubeArray));
        System.out.println("        independentBlend: " + booleanToString(deviceFeatures.independentBlend));
        System.out.println("        geometryShader: " + booleanToString(deviceFeatures.geometryShader));
        System.out.println("        tessellationShader: " + booleanToString(deviceFeatures.tessellationShader));
        System.out.println("        sampleRateShading: " + booleanToString(deviceFeatures.sampleRateShading));
        System.out.println("        dualSrcBlend: " + booleanToString(deviceFeatures.dualSrcBlend));
        System.out.println("        logicOp: " + booleanToString(deviceFeatures.logicOp));
        System.out.println("        multiDrawIndirect: " + booleanToString(deviceFeatures.multiDrawIndirect));
        System.out.println("        drawIndirectFirstInstance: " + booleanToString(deviceFeatures.drawIndirectFirstInstance));
        System.out.println("        depthClamp: " + booleanToString(deviceFeatures.depthClamp));
        System.out.println("        depthBiasClamp: " + booleanToString(deviceFeatures.depthBiasClamp));
        System.out.println("        fillModeNonSolid: " + booleanToString(deviceFeatures.fillModeNonSolid));
        System.out.println("        depthBounds: " + booleanToString(deviceFeatures.depthBounds));
        System.out.println("        wideLines: " + booleanToString(deviceFeatures.wideLines));
        System.out.println("        largePoints: " + booleanToString(deviceFeatures.largePoints));
        System.out.println("        alphaToOne: " + booleanToString(deviceFeatures.alphaToOne));
        System.out.println("        multiViewport: " + booleanToString(deviceFeatures.multiViewport));
        System.out.println("        samplerAnisotropy: " + booleanToString(deviceFeatures.samplerAnisotropy));
        System.out.println("        textureCompressionETC2: " + booleanToString(deviceFeatures.textureCompressionETC2));
        System.out.println("        textureCompressionASTC_LDR: " + booleanToString(deviceFeatures.textureCompressionASTC_LDR));
        System.out.println("        textureCompressionBC: " + booleanToString(deviceFeatures.textureCompressionBC));
        System.out.println("        occlusionQueryPrecise: " + booleanToString(deviceFeatures.occlusionQueryPrecise));
        System.out.println("        pipelineStatisticsQuery: " + booleanToString(deviceFeatures.pipelineStatisticsQuery));
        System.out.println("        vertexPipelineStoresAndAtomics: " + booleanToString(deviceFeatures.vertexPipelineStoresAndAtomics));
        System.out.println("        fragmentStoresAndAtomics: " + booleanToString(deviceFeatures.fragmentStoresAndAtomics));
        System.out.println("        shaderTessellationAndGeometryPointSize: " + booleanToString(deviceFeatures.shaderTessellationAndGeometryPointSize));
        System.out.println("        shaderImageGatherExtended: " + booleanToString(deviceFeatures.shaderImageGatherExtended));
        System.out.println("        shaderStorageImageExtendedFormats: " + booleanToString(deviceFeatures.shaderStorageImageExtendedFormats));
        System.out.println("        shaderStorageImageMultisample: " + booleanToString(deviceFeatures.shaderStorageImageMultisample));
        System.out.println("        shaderStorageImageReadWithoutFormat: " + booleanToString(deviceFeatures.shaderStorageImageReadWithoutFormat));
        System.out.println("        shaderStorageImageWriteWithoutFormat: " + booleanToString(deviceFeatures.shaderStorageImageWriteWithoutFormat));
        System.out.println("        shaderUniformBufferArrayDynamicIndexing: " + booleanToString(deviceFeatures.shaderUniformBufferArrayDynamicIndexing));
        System.out.println("        shaderSampledImageArrayDynamicIndexing: " + booleanToString(deviceFeatures.shaderSampledImageArrayDynamicIndexing));
        System.out.println("        shaderStorageBufferArrayDynamicIndexing: " + booleanToString(deviceFeatures.shaderStorageBufferArrayDynamicIndexing));
        System.out.println("        shaderStorageImageArrayDynamicIndexing: " + booleanToString(deviceFeatures.shaderStorageImageArrayDynamicIndexing));
        System.out.println("        shaderClipDistance: " + booleanToString(deviceFeatures.shaderClipDistance));
        System.out.println("        shaderCullDistance: " + booleanToString(deviceFeatures.shaderCullDistance));
        System.out.println("        shaderFloat64: " + booleanToString(deviceFeatures.shaderFloat64));
        System.out.println("        shaderInt64: " + booleanToString(deviceFeatures.shaderInt64));
        System.out.println("        shaderInt16: " + booleanToString(deviceFeatures.shaderInt16));
        System.out.println("        shaderResourceResidency: " + booleanToString(deviceFeatures.shaderResourceResidency));
        System.out.println("        shaderResourceMinLod: " + booleanToString(deviceFeatures.shaderResourceMinLod));
        System.out.println("        sparseBinding: " + booleanToString(deviceFeatures.sparseBinding));
        System.out.println("        sparseResidencyBuffer: " + booleanToString(deviceFeatures.sparseResidencyBuffer));
        System.out.println("        sparseResidencyImage2D: " + booleanToString(deviceFeatures.sparseResidencyImage2D));
        System.out.println("        sparseResidencyImage3D: " + booleanToString(deviceFeatures.sparseResidencyImage3D));
        System.out.println("        sparseResidency2Samples: " + booleanToString(deviceFeatures.sparseResidency2Samples));
        System.out.println("        sparseResidency4Samples: " + booleanToString(deviceFeatures.sparseResidency4Samples));
        System.out.println("        sparseResidency8Samples: " + booleanToString(deviceFeatures.sparseResidency8Samples));
        System.out.println("        sparseResidency16Samples: " + booleanToString(deviceFeatures.sparseResidency16Samples));
        System.out.println("        sparseResidencyAliased: " + booleanToString(deviceFeatures.sparseResidencyAliased));
        System.out.println("        variableMultisampleRate: " + booleanToString(deviceFeatures.variableMultisampleRate));
        System.out.println("        inheritedQueries: " + booleanToString(deviceFeatures.inheritedQueries));
        System.out.println();
    }

    private static void printVulkanDeviceMemoryProperties(VkPhysicalDevice.ByValue vDevice){
        VkPhysicalDeviceMemoryProperties.ByReference deviceMemoryProperties = vks.vkGetPhysicalDeviceMemoryProperties(vDevice);
        System.out.println("    memory properties:");
        System.out.println("        memory type count: " + deviceMemoryProperties.memoryTypeCount); // TODO - print more info
        System.out.println("        memory heap count: " + deviceMemoryProperties.memoryHeapCount); // TODO - print more info
        System.out.println();
    }

    private static void printVulkanDeviceQueueFamilyProperties(VkPhysicalDevice.ByValue vDevice){
        VkQueueFamilyPropertiesArray queueFamilyProperties = vks.vkGetPhysicalDeviceQueueFamilyProperties(vDevice);
        System.out.println("    found " + queueFamilyProperties.count() + " queue families:");
        for(VkQueueFamilyProperties p : queueFamilyProperties){ // TODO - print more info
            System.out.println("        queue count: " + p.queueCount);
            System.out.println("        flags: " + flagsToString(p.queueFlags.value, p.queueFlags.getClass()));
        }
        System.out.println();
    }

    private static void printVulkanDeviceImageProperties(VkPhysicalDevice.ByValue device){
//        System.out.println("    supported formats:");
//        Class c = VkFormat.class;
//        for(Field field : c.getFields()){
//            if(Modifier.isStatic(field.getModifiers())){
//                if(field.getType() == int.class){
//                    try {
//                        VkFormat.ByValue format = new VkFormat.ByValue(field.getInt(null));
//                        VkImageFormatProperties properties = vks.vkGetPhysicalDeviceImageFormatProperties(
//                                device, format,
//                                new VkImageType.ByValue(VkImageType.VK_IMAGE_TYPE_2D),
//                                new VkImageTiling.ByValue(VkImageTiling.VK_IMAGE_TILING_OPTIMAL),
//                                new VkImageUsageFlags.ByValue(VkImageUsageFlags.VK_IMAGE_USAGE_TRANSFER_DST_BIT | VkImageUsageFlags.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT),
//                                new VkImageCreateFlags.ByValue(0)
//                        );
//                        System.out.println("        " + field.getName());
//                    } catch (Exception e){}
//                }
//            }
//        }
//        System.out.println();
    }
}
