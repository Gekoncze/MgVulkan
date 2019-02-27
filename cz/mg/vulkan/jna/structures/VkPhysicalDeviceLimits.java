package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.flags.VkSampleCountFlags;
import cz.mg.vulkan.jna.types.size_t;
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
    public int maxImageDimension1D;
    public int maxImageDimension2D;
    public int maxImageDimension3D;
    public int maxImageDimensionCube;
    public int maxImageArrayLayers;
    public int maxTexelBufferElements;
    public int maxUniformBufferRange;
    public int maxStorageBufferRange;
    public int maxPushConstantsSize;
    public int maxMemoryAllocationCount;
    public int maxSamplerAllocationCount;
    public long bufferImageGranularity;
    public long sparseAddressSpaceSize;
    public int maxBoundDescriptorSets;
    public int maxPerStageDescriptorSamplers;
    public int maxPerStageDescriptorUniformBuffers;
    public int maxPerStageDescriptorStorageBuffers;
    public int maxPerStageDescriptorSampledImages;
    public int maxPerStageDescriptorStorageImages;
    public int maxPerStageDescriptorInputAttachments;
    public int maxPerStageResources;
    public int maxDescriptorSetSamplers;
    public int maxDescriptorSetUniformBuffers;
    public int maxDescriptorSetUniformBuffersDynamic;
    public int maxDescriptorSetStorageBuffers;
    public int maxDescriptorSetStorageBuffersDynamic;
    public int maxDescriptorSetSampledImages;
    public int maxDescriptorSetStorageImages;
    public int maxDescriptorSetInputAttachments;
    public int maxVertexInputAttributes;
    public int maxVertexInputBindings;
    public int maxVertexInputAttributeOffset;
    public int maxVertexInputBindingStride;
    public int maxVertexOutputComponents;
    public int maxTessellationGenerationLevel;
    public int maxTessellationPatchSize;
    public int maxTessellationControlPerVertexInputComponents;
    public int maxTessellationControlPerVertexOutputComponents;
    public int maxTessellationControlPerPatchOutputComponents;
    public int maxTessellationControlTotalOutputComponents;
    public int maxTessellationEvaluationInputComponents;
    public int maxTessellationEvaluationOutputComponents;
    public int maxGeometryShaderInvocations;
    public int maxGeometryInputComponents;
    public int maxGeometryOutputComponents;
    public int maxGeometryOutputVertices;
    public int maxGeometryTotalOutputComponents;
    public int maxFragmentInputComponents;
    public int maxFragmentOutputAttachments;
    public int maxFragmentDualSrcAttachments;
    public int maxFragmentCombinedOutputResources;
    public int maxComputeSharedMemorySize;
    public int[] maxComputeWorkGroupCount = new int[3];
    public int maxComputeWorkGroupInvocations;
    public int[] maxComputeWorkGroupSize = new int[3];
    public int subPixelPrecisionBits;
    public int subTexelPrecisionBits;
    public int mipmapPrecisionBits;
    public int maxDrawIndexedIndexValue;
    public int maxDrawIndirectCount;
    public float maxSamplerLodBias;
    public float maxSamplerAnisotropy;
    public int maxViewports;
    public int[] maxViewportDimensions = new int[2];
    public float[] viewportBoundsRange = new float[2];
    public int viewportSubPixelBits;
    public size_t minMemoryMapAlignment;
    public long minTexelBufferOffsetAlignment;
    public long minUniformBufferOffsetAlignment;
    public long minStorageBufferOffsetAlignment;
    public int minTexelOffset;
    public int maxTexelOffset;
    public int minTexelGatherOffset;
    public int maxTexelGatherOffset;
    public float minInterpolationOffset;
    public float maxInterpolationOffset;
    public int subPixelInterpolationOffsetBits;
    public int maxFramebufferWidth;
    public int maxFramebufferHeight;
    public int maxFramebufferLayers;
    public VkSampleCountFlags.ByValue framebufferColorSampleCounts;
    public VkSampleCountFlags.ByValue framebufferDepthSampleCounts;
    public VkSampleCountFlags.ByValue framebufferStencilSampleCounts;
    public VkSampleCountFlags.ByValue framebufferNoAttachmentsSampleCounts;
    public int maxColorAttachments;
    public VkSampleCountFlags.ByValue sampledImageColorSampleCounts;
    public VkSampleCountFlags.ByValue sampledImageIntegerSampleCounts;
    public VkSampleCountFlags.ByValue sampledImageDepthSampleCounts;
    public VkSampleCountFlags.ByValue sampledImageStencilSampleCounts;
    public VkSampleCountFlags.ByValue storageImageSampleCounts;
    public int maxSampleMaskWords;
    public int timestampComputeAndGraphics;
    public float timestampPeriod;
    public int maxClipDistances;
    public int maxCullDistances;
    public int maxCombinedClipAndCullDistances;
    public int discreteQueuePriorities;
    public float[] pointSizeRange = new float[2];
    public float[] lineWidthRange = new float[2];
    public float pointSizeGranularity;
    public float lineWidthGranularity;
    public int strictLines;
    public int standardSampleLocations;
    public long optimalBufferCopyOffsetAlignment;
    public long optimalBufferCopyRowPitchAlignment;
    public long nonCoherentAtomSize;

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

    public static class ByReference extends VkPhysicalDeviceLimits implements Structure.ByReference {}
    public static class ByValue extends VkPhysicalDeviceLimits implements Structure.ByValue {}
}
