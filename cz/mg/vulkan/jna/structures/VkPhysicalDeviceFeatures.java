package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;


/**
 *  typedef struct VkPhysicalDeviceFeatures {
 *      VkBool32    robustBufferAccess;
 *      VkBool32    fullDrawIndexUint32;
 *      VkBool32    imageCubeArray;
 *      VkBool32    independentBlend;
 *      VkBool32    geometryShader;
 *      VkBool32    tessellationShader;
 *      VkBool32    sampleRateShading;
 *      VkBool32    dualSrcBlend;
 *      VkBool32    logicOp;
 *      VkBool32    multiDrawIndirect;
 *      VkBool32    drawIndirectFirstInstance;
 *      VkBool32    depthClamp;
 *      VkBool32    depthBiasClamp;
 *      VkBool32    fillModeNonSolid;
 *      VkBool32    depthBounds;
 *      VkBool32    wideLines;
 *      VkBool32    largePoints;
 *      VkBool32    alphaToOne;
 *      VkBool32    multiViewport;
 *      VkBool32    samplerAnisotropy;
 *      VkBool32    textureCompressionETC2;
 *      VkBool32    textureCompressionASTC_LDR;
 *      VkBool32    textureCompressionBC;
 *      VkBool32    occlusionQueryPrecise;
 *      VkBool32    pipelineStatisticsQuery;
 *      VkBool32    vertexPipelineStoresAndAtomics;
 *      VkBool32    fragmentStoresAndAtomics;
 *      VkBool32    shaderTessellationAndGeometryPointSize;
 *      VkBool32    shaderImageGatherExtended;
 *      VkBool32    shaderStorageImageExtendedFormats;
 *      VkBool32    shaderStorageImageMultisample;
 *      VkBool32    shaderStorageImageReadWithoutFormat;
 *      VkBool32    shaderStorageImageWriteWithoutFormat;
 *      VkBool32    shaderUniformBufferArrayDynamicIndexing;
 *      VkBool32    shaderSampledImageArrayDynamicIndexing;
 *      VkBool32    shaderStorageBufferArrayDynamicIndexing;
 *      VkBool32    shaderStorageImageArrayDynamicIndexing;
 *      VkBool32    shaderClipDistance;
 *      VkBool32    shaderCullDistance;
 *      VkBool32    shaderFloat64;
 *      VkBool32    shaderInt64;
 *      VkBool32    shaderInt16;
 *      VkBool32    shaderResourceResidency;
 *      VkBool32    shaderResourceMinLod;
 *      VkBool32    sparseBinding;
 *      VkBool32    sparseResidencyBuffer;
 *      VkBool32    sparseResidencyImage2D;
 *      VkBool32    sparseResidencyImage3D;
 *      VkBool32    sparseResidency2Samples;
 *      VkBool32    sparseResidency4Samples;
 *      VkBool32    sparseResidency8Samples;
 *      VkBool32    sparseResidency16Samples;
 *      VkBool32    sparseResidencyAliased;
 *      VkBool32    variableMultisampleRate;
 *      VkBool32    inheritedQueries;
 *  } VkPhysicalDeviceFeatures;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceFeatures.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceFeatures extends Structure {
    public int robustBufferAccess;
    public int fullDrawIndexUint32;
    public int imageCubeArray;
    public int independentBlend;
    public int geometryShader;
    public int tessellationShader;
    public int sampleRateShading;
    public int dualSrcBlend;
    public int logicOp;
    public int multiDrawIndirect;
    public int drawIndirectFirstInstance;
    public int depthClamp;
    public int depthBiasClamp;
    public int fillModeNonSolid;
    public int depthBounds;
    public int wideLines;
    public int largePoints;
    public int alphaToOne;
    public int multiViewport;
    public int samplerAnisotropy;
    public int textureCompressionETC2;
    public int textureCompressionASTC_LDR;
    public int textureCompressionBC;
    public int occlusionQueryPrecise;
    public int pipelineStatisticsQuery;
    public int vertexPipelineStoresAndAtomics;
    public int fragmentStoresAndAtomics;
    public int shaderTessellationAndGeometryPointSize;
    public int shaderImageGatherExtended;
    public int shaderStorageImageExtendedFormats;
    public int shaderStorageImageMultisample;
    public int shaderStorageImageReadWithoutFormat;
    public int shaderStorageImageWriteWithoutFormat;
    public int shaderUniformBufferArrayDynamicIndexing;
    public int shaderSampledImageArrayDynamicIndexing;
    public int shaderStorageBufferArrayDynamicIndexing;
    public int shaderStorageImageArrayDynamicIndexing;
    public int shaderClipDistance;
    public int shaderCullDistance;
    public int shaderFloat64;
    public int shaderInt64;
    public int shaderInt16;
    public int shaderResourceResidency;
    public int shaderResourceMinLod;
    public int sparseBinding;
    public int sparseResidencyBuffer;
    public int sparseResidencyImage2D;
    public int sparseResidencyImage3D;
    public int sparseResidency2Samples;
    public int sparseResidency4Samples;
    public int sparseResidency8Samples;
    public int sparseResidency16Samples;
    public int sparseResidencyAliased;
    public int variableMultisampleRate;
    public int inheritedQueries;

    public VkPhysicalDeviceFeatures() {
    }

    public VkPhysicalDeviceFeatures(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "robustBufferAccess",
                "fullDrawIndexUint32",
                "imageCubeArray",
                "independentBlend",
                "geometryShader",
                "tessellationShader",
                "sampleRateShading",
                "dualSrcBlend",
                "logicOp",
                "multiDrawIndirect",
                "drawIndirectFirstInstance",
                "depthClamp",
                "depthBiasClamp",
                "fillModeNonSolid",
                "depthBounds",
                "wideLines",
                "largePoints",
                "alphaToOne",
                "multiViewport",
                "samplerAnisotropy",
                "textureCompressionETC2",
                "textureCompressionASTC_LDR",
                "textureCompressionBC",
                "occlusionQueryPrecise",
                "pipelineStatisticsQuery",
                "vertexPipelineStoresAndAtomics",
                "fragmentStoresAndAtomics",
                "shaderTessellationAndGeometryPointSize",
                "shaderImageGatherExtended",
                "shaderStorageImageExtendedFormats",
                "shaderStorageImageMultisample",
                "shaderStorageImageReadWithoutFormat",
                "shaderStorageImageWriteWithoutFormat",
                "shaderUniformBufferArrayDynamicIndexing",
                "shaderSampledImageArrayDynamicIndexing",
                "shaderStorageBufferArrayDynamicIndexing",
                "shaderStorageImageArrayDynamicIndexing",
                "shaderClipDistance",
                "shaderCullDistance",
                "shaderFloat64",
                "shaderInt64",
                "shaderInt16",
                "shaderResourceResidency",
                "shaderResourceMinLod",
                "sparseBinding",
                "sparseResidencyBuffer",
                "sparseResidencyImage2D",
                "sparseResidencyImage3D",
                "sparseResidency2Samples",
                "sparseResidency4Samples",
                "sparseResidency8Samples",
                "sparseResidency16Samples",
                "sparseResidencyAliased",
                "variableMultisampleRate",
                "inheritedQueries"
        });
    }

    public static class ByReference extends VkPhysicalDeviceFeatures implements Structure.ByReference {}
    public static class ByValue extends VkPhysicalDeviceFeatures implements Structure.ByValue {}
}
