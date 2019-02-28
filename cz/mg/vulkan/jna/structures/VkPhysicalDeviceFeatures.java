package cz.mg.vulkan.jna.structures;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import cz.mg.vulkan.jna.types.VkBool32;
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
    public VkBool32 robustBufferAccess;
    public VkBool32 fullDrawIndexUint32;
    public VkBool32 imageCubeArray;
    public VkBool32 independentBlend;
    public VkBool32 geometryShader;
    public VkBool32 tessellationShader;
    public VkBool32 sampleRateShading;
    public VkBool32 dualSrcBlend;
    public VkBool32 logicOp;
    public VkBool32 multiDrawIndirect;
    public VkBool32 drawIndirectFirstInstance;
    public VkBool32 depthClamp;
    public VkBool32 depthBiasClamp;
    public VkBool32 fillModeNonSolid;
    public VkBool32 depthBounds;
    public VkBool32 wideLines;
    public VkBool32 largePoints;
    public VkBool32 alphaToOne;
    public VkBool32 multiViewport;
    public VkBool32 samplerAnisotropy;
    public VkBool32 textureCompressionETC2;
    public VkBool32 textureCompressionASTC_LDR;
    public VkBool32 textureCompressionBC;
    public VkBool32 occlusionQueryPrecise;
    public VkBool32 pipelineStatisticsQuery;
    public VkBool32 vertexPipelineStoresAndAtomics;
    public VkBool32 fragmentStoresAndAtomics;
    public VkBool32 shaderTessellationAndGeometryPointSize;
    public VkBool32 shaderImageGatherExtended;
    public VkBool32 shaderStorageImageExtendedFormats;
    public VkBool32 shaderStorageImageMultisample;
    public VkBool32 shaderStorageImageReadWithoutFormat;
    public VkBool32 shaderStorageImageWriteWithoutFormat;
    public VkBool32 shaderUniformBufferArrayDynamicIndexing;
    public VkBool32 shaderSampledImageArrayDynamicIndexing;
    public VkBool32 shaderStorageBufferArrayDynamicIndexing;
    public VkBool32 shaderStorageImageArrayDynamicIndexing;
    public VkBool32 shaderClipDistance;
    public VkBool32 shaderCullDistance;
    public VkBool32 shaderFloat64;
    public VkBool32 shaderInt64;
    public VkBool32 shaderInt16;
    public VkBool32 shaderResourceResidency;
    public VkBool32 shaderResourceMinLod;
    public VkBool32 sparseBinding;
    public VkBool32 sparseResidencyBuffer;
    public VkBool32 sparseResidencyImage2D;
    public VkBool32 sparseResidencyImage3D;
    public VkBool32 sparseResidency2Samples;
    public VkBool32 sparseResidency4Samples;
    public VkBool32 sparseResidency8Samples;
    public VkBool32 sparseResidency16Samples;
    public VkBool32 sparseResidencyAliased;
    public VkBool32 variableMultisampleRate;
    public VkBool32 inheritedQueries;

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

    public ByReference byReference(boolean write, boolean read){
        if(write) write();
        ByReference reference = new ByReference(getPointer());
        if(read) reference.read();
        return reference;
    }

    public ByValue byValue(boolean write, boolean read){
        if(write) write();
        ByValue value = new ByValue(getPointer());
        if(read) value.read();
        return value;
    }

    public static class ByReference extends VkPhysicalDeviceFeatures implements Structure.ByReference {
        public ByReference() {
        }

        public ByReference(Pointer p) {
            super(p);
        }
    }

    public static class ByValue extends VkPhysicalDeviceFeatures implements Structure.ByValue {
        public ByValue() {
        }

        public ByValue(Pointer p) {
            super(p);
        }
    }
}
