package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import cz.mg.vulkan.jna.flags.VkSampleCountFlags;
import cz.mg.vulkan.jna.types.*;
import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkPhysicalDeviceLimits {
 *      uint32_t              maxImageDimension1D;
 *      uint32_t              maxImageDimension2D;
 *      uint32_t              maxImageDimension3D;
 *      uint32_t              maxImageDimensionCube;
 *      uint32_t              maxImageArrayLayers;
 *      uint32_t              maxTexelBufferElements;
 *      uint32_t              maxUniformBufferRange;
 *      uint32_t              maxStorageBufferRange;
 *      uint32_t              maxPushConstantsSize;
 *      uint32_t              maxMemoryAllocationCount;
 *      uint32_t              maxSamplerAllocationCount;
 *      VkDeviceSize          bufferImageGranularity;
 *      VkDeviceSize          sparseAddressSpaceSize;
 *      uint32_t              maxBoundDescriptorSets;
 *      uint32_t              maxPerStageDescriptorSamplers;
 *      uint32_t              maxPerStageDescriptorUniformBuffers;
 *      uint32_t              maxPerStageDescriptorStorageBuffers;
 *      uint32_t              maxPerStageDescriptorSampledImages;
 *      uint32_t              maxPerStageDescriptorStorageImages;
 *      uint32_t              maxPerStageDescriptorInputAttachments;
 *      uint32_t              maxPerStageResources;
 *      uint32_t              maxDescriptorSetSamplers;
 *      uint32_t              maxDescriptorSetUniformBuffers;
 *      uint32_t              maxDescriptorSetUniformBuffersDynamic;
 *      uint32_t              maxDescriptorSetStorageBuffers;
 *      uint32_t              maxDescriptorSetStorageBuffersDynamic;
 *      uint32_t              maxDescriptorSetSampledImages;
 *      uint32_t              maxDescriptorSetStorageImages;
 *      uint32_t              maxDescriptorSetInputAttachments;
 *      uint32_t              maxVertexInputAttributes;
 *      uint32_t              maxVertexInputBindings;
 *      uint32_t              maxVertexInputAttributeOffset;
 *      uint32_t              maxVertexInputBindingStride;
 *      uint32_t              maxVertexOutputComponents;
 *      uint32_t              maxTessellationGenerationLevel;
 *      uint32_t              maxTessellationPatchSize;
 *      uint32_t              maxTessellationControlPerVertexInputComponents;
 *      uint32_t              maxTessellationControlPerVertexOutputComponents;
 *      uint32_t              maxTessellationControlPerPatchOutputComponents;
 *      uint32_t              maxTessellationControlTotalOutputComponents;
 *      uint32_t              maxTessellationEvaluationInputComponents;
 *      uint32_t              maxTessellationEvaluationOutputComponents;
 *      uint32_t              maxGeometryShaderInvocations;
 *      uint32_t              maxGeometryInputComponents;
 *      uint32_t              maxGeometryOutputComponents;
 *      uint32_t              maxGeometryOutputVertices;
 *      uint32_t              maxGeometryTotalOutputComponents;
 *      uint32_t              maxFragmentInputComponents;
 *      uint32_t              maxFragmentOutputAttachments;
 *      uint32_t              maxFragmentDualSrcAttachments;
 *      uint32_t              maxFragmentCombinedOutputResources;
 *      uint32_t              maxComputeSharedMemorySize;
 *      uint32_t              maxComputeWorkGroupCount[3];
 *      uint32_t              maxComputeWorkGroupInvocations;
 *      uint32_t              maxComputeWorkGroupSize[3];
 *      uint32_t              subPixelPrecisionBits;
 *      uint32_t              subTexelPrecisionBits;
 *      uint32_t              mipmapPrecisionBits;
 *      uint32_t              maxDrawIndexedIndexValue;
 *      uint32_t              maxDrawIndirectCount;
 *      float                 maxSamplerLodBias;
 *      float                 maxSamplerAnisotropy;
 *      uint32_t              maxViewports;
 *      uint32_t              maxViewportDimensions[2];
 *      float                 viewportBoundsRange[2];
 *      uint32_t              viewportSubPixelBits;
 *      size_t                minMemoryMapAlignment;
 *      VkDeviceSize          minTexelBufferOffsetAlignment;
 *      VkDeviceSize          minUniformBufferOffsetAlignment;
 *      VkDeviceSize          minStorageBufferOffsetAlignment;
 *      int32_t               minTexelOffset;
 *      uint32_t              maxTexelOffset;
 *      int32_t               minTexelGatherOffset;
 *      uint32_t              maxTexelGatherOffset;
 *      float                 minInterpolationOffset;
 *      float                 maxInterpolationOffset;
 *      uint32_t              subPixelInterpolationOffsetBits;
 *      uint32_t              maxFramebufferWidth;
 *      uint32_t              maxFramebufferHeight;
 *      uint32_t              maxFramebufferLayers;
 *      VkSampleCountFlags    framebufferColorSampleCounts;
 *      VkSampleCountFlags    framebufferDepthSampleCounts;
 *      VkSampleCountFlags    framebufferStencilSampleCounts;
 *      VkSampleCountFlags    framebufferNoAttachmentsSampleCounts;
 *      uint32_t              maxColorAttachments;
 *      VkSampleCountFlags    sampledImageColorSampleCounts;
 *      VkSampleCountFlags    sampledImageIntegerSampleCounts;
 *      VkSampleCountFlags    sampledImageDepthSampleCounts;
 *      VkSampleCountFlags    sampledImageStencilSampleCounts;
 *      VkSampleCountFlags    storageImageSampleCounts;
 *      uint32_t              maxSampleMaskWords;
 *      VkBool32              timestampComputeAndGraphics;
 *      float                 timestampPeriod;
 *      uint32_t              maxClipDistances;
 *      uint32_t              maxCullDistances;
 *      uint32_t              maxCombinedClipAndCullDistances;
 *      uint32_t              discreteQueuePriorities;
 *      float                 pointSizeRange[2];
 *      float                 lineWidthRange[2];
 *      float                 pointSizeGranularity;
 *      float                 lineWidthGranularity;
 *      VkBool32              strictLines;
 *      VkBool32              standardSampleLocations;
 *      VkDeviceSize          optimalBufferCopyOffsetAlignment;
 *      VkDeviceSize          optimalBufferCopyRowPitchAlignment;
 *      VkDeviceSize          nonCoherentAtomSize;
 *  } VkPhysicalDeviceLimits;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceLimits.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceLimits extends Structure {
    public uint32_t maxImageDimension1D;
    public uint32_t maxImageDimension2D;
    public uint32_t maxImageDimension3D;
    public uint32_t maxImageDimensionCube;
    public uint32_t maxImageArrayLayers;
    public uint32_t maxTexelBufferElements;
    public uint32_t maxUniformBufferRange;
    public uint32_t maxStorageBufferRange;
    public uint32_t maxPushConstantsSize;
    public uint32_t maxMemoryAllocationCount;
    public uint32_t maxSamplerAllocationCount;
    public VkDeviceSize bufferImageGranularity;
    public VkDeviceSize sparseAddressSpaceSize;
    public uint32_t maxBoundDescriptorSets;
    public uint32_t maxPerStageDescriptorSamplers;
    public uint32_t maxPerStageDescriptorUniformBuffers;
    public uint32_t maxPerStageDescriptorStorageBuffers;
    public uint32_t maxPerStageDescriptorSampledImages;
    public uint32_t maxPerStageDescriptorStorageImages;
    public uint32_t maxPerStageDescriptorInputAttachments;
    public uint32_t maxPerStageResources;
    public uint32_t maxDescriptorSetSamplers;
    public uint32_t maxDescriptorSetUniformBuffers;
    public uint32_t maxDescriptorSetUniformBuffersDynamic;
    public uint32_t maxDescriptorSetStorageBuffers;
    public uint32_t maxDescriptorSetStorageBuffersDynamic;
    public uint32_t maxDescriptorSetSampledImages;
    public uint32_t maxDescriptorSetStorageImages;
    public uint32_t maxDescriptorSetInputAttachments;
    public uint32_t maxVertexInputAttributes;
    public uint32_t maxVertexInputBindings;
    public uint32_t maxVertexInputAttributeOffset;
    public uint32_t maxVertexInputBindingStride;
    public uint32_t maxVertexOutputComponents;
    public uint32_t maxTessellationGenerationLevel;
    public uint32_t maxTessellationPatchSize;
    public uint32_t maxTessellationControlPerVertexInputComponents;
    public uint32_t maxTessellationControlPerVertexOutputComponents;
    public uint32_t maxTessellationControlPerPatchOutputComponents;
    public uint32_t maxTessellationControlTotalOutputComponents;
    public uint32_t maxTessellationEvaluationInputComponents;
    public uint32_t maxTessellationEvaluationOutputComponents;
    public uint32_t maxGeometryShaderInvocations;
    public uint32_t maxGeometryInputComponents;
    public uint32_t maxGeometryOutputComponents;
    public uint32_t maxGeometryOutputVertices;
    public uint32_t maxGeometryTotalOutputComponents;
    public uint32_t maxFragmentInputComponents;
    public uint32_t maxFragmentOutputAttachments;
    public uint32_t maxFragmentDualSrcAttachments;
    public uint32_t maxFragmentCombinedOutputResources;
    public uint32_t maxComputeSharedMemorySize;
    public uint32_t[] maxComputeWorkGroupCount = new uint32_t[3];
    public uint32_t maxComputeWorkGroupInvocations;
    public uint32_t[] maxComputeWorkGroupSize = new uint32_t[3];
    public uint32_t subPixelPrecisionBits;
    public uint32_t subTexelPrecisionBits;
    public uint32_t mipmapPrecisionBits;
    public uint32_t maxDrawIndexedIndexValue;
    public uint32_t maxDrawIndirectCount;
    public float maxSamplerLodBias;
    public float maxSamplerAnisotropy;
    public uint32_t maxViewports;
    public uint32_t[] maxViewportDimensions = new uint32_t[2];
    public float[] viewportBoundsRange = new float[2];
    public uint32_t viewportSubPixelBits;
    public size_t minMemoryMapAlignment;
    public VkDeviceSize minTexelBufferOffsetAlignment;
    public VkDeviceSize minUniformBufferOffsetAlignment;
    public VkDeviceSize minStorageBufferOffsetAlignment;
    public int32_t minTexelOffset;
    public uint32_t maxTexelOffset;
    public int32_t minTexelGatherOffset;
    public uint32_t maxTexelGatherOffset;
    public float minInterpolationOffset;
    public float maxInterpolationOffset;
    public uint32_t subPixelInterpolationOffsetBits;
    public uint32_t maxFramebufferWidth;
    public uint32_t maxFramebufferHeight;
    public uint32_t maxFramebufferLayers;
    public VkSampleCountFlags framebufferColorSampleCounts;
    public VkSampleCountFlags framebufferDepthSampleCounts;
    public VkSampleCountFlags framebufferStencilSampleCounts;
    public VkSampleCountFlags framebufferNoAttachmentsSampleCounts;
    public uint32_t maxColorAttachments;
    public VkSampleCountFlags sampledImageColorSampleCounts;
    public VkSampleCountFlags sampledImageIntegerSampleCounts;
    public VkSampleCountFlags sampledImageDepthSampleCounts;
    public VkSampleCountFlags sampledImageStencilSampleCounts;
    public VkSampleCountFlags storageImageSampleCounts;
    public uint32_t maxSampleMaskWords;
    public VkBool32 timestampComputeAndGraphics;
    public float timestampPeriod;
    public uint32_t maxClipDistances;
    public uint32_t maxCullDistances;
    public uint32_t maxCombinedClipAndCullDistances;
    public uint32_t discreteQueuePriorities;
    public float[] pointSizeRange = new float[2];
    public float[] lineWidthRange = new float[2];
    public float pointSizeGranularity;
    public float lineWidthGranularity;
    public VkBool32 strictLines;
    public VkBool32 standardSampleLocations;
    public VkDeviceSize optimalBufferCopyOffsetAlignment;
    public VkDeviceSize optimalBufferCopyRowPitchAlignment;
    public VkDeviceSize nonCoherentAtomSize;

    public VkPhysicalDeviceLimits() {
    }

    public VkPhysicalDeviceLimits(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "maxImageDimension1D",
                "maxImageDimension2D",
                "maxImageDimension3D",
                "maxImageDimensionCube",
                "maxImageArrayLayers",
                "maxTexelBufferElements",
                "maxUniformBufferRange",
                "maxStorageBufferRange",
                "maxPushConstantsSize",
                "maxMemoryAllocationCount",
                "maxSamplerAllocationCount",
                "bufferImageGranularity",
                "sparseAddressSpaceSize",
                "maxBoundDescriptorSets",
                "maxPerStageDescriptorSamplers",
                "maxPerStageDescriptorUniformBuffers",
                "maxPerStageDescriptorStorageBuffers",
                "maxPerStageDescriptorSampledImages",
                "maxPerStageDescriptorStorageImages",
                "maxPerStageDescriptorInputAttachments",
                "maxPerStageResources",
                "maxDescriptorSetSamplers",
                "maxDescriptorSetUniformBuffers",
                "maxDescriptorSetUniformBuffersDynamic",
                "maxDescriptorSetStorageBuffers",
                "maxDescriptorSetStorageBuffersDynamic",
                "maxDescriptorSetSampledImages",
                "maxDescriptorSetStorageImages",
                "maxDescriptorSetInputAttachments",
                "maxVertexInputAttributes",
                "maxVertexInputBindings",
                "maxVertexInputAttributeOffset",
                "maxVertexInputBindingStride",
                "maxVertexOutputComponents",
                "maxTessellationGenerationLevel",
                "maxTessellationPatchSize",
                "maxTessellationControlPerVertexInputComponents",
                "maxTessellationControlPerVertexOutputComponents",
                "maxTessellationControlPerPatchOutputComponents",
                "maxTessellationControlTotalOutputComponents",
                "maxTessellationEvaluationInputComponents",
                "maxTessellationEvaluationOutputComponents",
                "maxGeometryShaderInvocations",
                "maxGeometryInputComponents",
                "maxGeometryOutputComponents",
                "maxGeometryOutputVertices",
                "maxGeometryTotalOutputComponents",
                "maxFragmentInputComponents",
                "maxFragmentOutputAttachments",
                "maxFragmentDualSrcAttachments",
                "maxFragmentCombinedOutputResources",
                "maxComputeSharedMemorySize",
                "maxComputeWorkGroupCount",
                "maxComputeWorkGroupInvocations",
                "maxComputeWorkGroupSize",
                "subPixelPrecisionBits",
                "subTexelPrecisionBits",
                "mipmapPrecisionBits",
                "maxDrawIndexedIndexValue",
                "maxDrawIndirectCount",
                "maxSamplerLodBias",
                "maxSamplerAnisotropy",
                "maxViewports",
                "maxViewportDimensions",
                "viewportBoundsRange",
                "viewportSubPixelBits",
                "minMemoryMapAlignment",
                "minTexelBufferOffsetAlignment",
                "minUniformBufferOffsetAlignment",
                "minStorageBufferOffsetAlignment",
                "minTexelOffset",
                "maxTexelOffset",
                "minTexelGatherOffset",
                "maxTexelGatherOffset",
                "minInterpolationOffset",
                "maxInterpolationOffset",
                "subPixelInterpolationOffsetBits",
                "maxFramebufferWidth",
                "maxFramebufferHeight",
                "maxFramebufferLayers",
                "framebufferColorSampleCounts",
                "framebufferDepthSampleCounts",
                "framebufferStencilSampleCounts",
                "framebufferNoAttachmentsSampleCounts",
                "maxColorAttachments",
                "sampledImageColorSampleCounts",
                "sampledImageIntegerSampleCounts",
                "sampledImageDepthSampleCounts",
                "sampledImageStencilSampleCounts",
                "storageImageSampleCounts",
                "maxSampleMaskWords",
                "timestampComputeAndGraphics",
                "timestampPeriod",
                "maxClipDistances",
                "maxCullDistances",
                "maxCombinedClipAndCullDistances",
                "discreteQueuePriorities",
                "pointSizeRange",
                "lineWidthRange",
                "pointSizeGranularity",
                "lineWidthGranularity",
                "strictLines",
                "standardSampleLocations",
                "optimalBufferCopyOffsetAlignment",
                "optimalBufferCopyRowPitchAlignment",
                "nonCoherentAtomSize"
        });
    }

    public static class ByReference extends VkPhysicalDeviceLimits implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkPhysicalDeviceLimits implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
