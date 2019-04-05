package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceFeatures extends VulkanObject {
    public VulkanPhysicalDeviceFeatures(){
        super(new VkPhysicalDeviceFeatures());
    }

    public VulkanPhysicalDeviceFeatures(VkPhysicalDeviceFeatures vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceFeatures getVk(){
        return (VkPhysicalDeviceFeatures) super.getVk();
    }

    public VulkanPhysicalDeviceFeatures(VulkanBool32 robustBufferAccess, VulkanBool32 fullDrawIndexUint32, VulkanBool32 imageCubeArray, VulkanBool32 independentBlend, VulkanBool32 geometryShader, VulkanBool32 tessellationShader, VulkanBool32 sampleRateShading, VulkanBool32 dualSrcBlend, VulkanBool32 logicOp, VulkanBool32 multiDrawIndirect, VulkanBool32 drawIndirectFirstInstance, VulkanBool32 depthClamp, VulkanBool32 depthBiasClamp, VulkanBool32 fillModeNonSolid, VulkanBool32 depthBounds, VulkanBool32 wideLines, VulkanBool32 largePoints, VulkanBool32 alphaToOne, VulkanBool32 multiViewport, VulkanBool32 samplerAnisotropy, VulkanBool32 textureCompressionETC2, VulkanBool32 textureCompressionASTC_LDR, VulkanBool32 textureCompressionBC, VulkanBool32 occlusionQueryPrecise, VulkanBool32 pipelineStatisticsQuery, VulkanBool32 vertexPipelineStoresAndAtomics, VulkanBool32 fragmentStoresAndAtomics, VulkanBool32 shaderTessellationAndGeometryPointSize, VulkanBool32 shaderImageGatherExtended, VulkanBool32 shaderStorageImageExtendedFormats, VulkanBool32 shaderStorageImageMultisample, VulkanBool32 shaderStorageImageReadWithoutFormat, VulkanBool32 shaderStorageImageWriteWithoutFormat, VulkanBool32 shaderUniformBufferArrayDynamicIndexing, VulkanBool32 shaderSampledImageArrayDynamicIndexing, VulkanBool32 shaderStorageBufferArrayDynamicIndexing, VulkanBool32 shaderStorageImageArrayDynamicIndexing, VulkanBool32 shaderClipDistance, VulkanBool32 shaderCullDistance, VulkanBool32 shaderFloat64, VulkanBool32 shaderInt64, VulkanBool32 shaderInt16, VulkanBool32 shaderResourceResidency, VulkanBool32 shaderResourceMinLod, VulkanBool32 sparseBinding, VulkanBool32 sparseResidencyBuffer, VulkanBool32 sparseResidencyImage2D, VulkanBool32 sparseResidencyImage3D, VulkanBool32 sparseResidency2Samples, VulkanBool32 sparseResidency4Samples, VulkanBool32 sparseResidency8Samples, VulkanBool32 sparseResidency16Samples, VulkanBool32 sparseResidencyAliased, VulkanBool32 variableMultisampleRate, VulkanBool32 inheritedQueries) {
        super(new VkPhysicalDeviceFeatures(robustBufferAccess.getVk(), fullDrawIndexUint32.getVk(), imageCubeArray.getVk(), independentBlend.getVk(), geometryShader.getVk(), tessellationShader.getVk(), sampleRateShading.getVk(), dualSrcBlend.getVk(), logicOp.getVk(), multiDrawIndirect.getVk(), drawIndirectFirstInstance.getVk(), depthClamp.getVk(), depthBiasClamp.getVk(), fillModeNonSolid.getVk(), depthBounds.getVk(), wideLines.getVk(), largePoints.getVk(), alphaToOne.getVk(), multiViewport.getVk(), samplerAnisotropy.getVk(), textureCompressionETC2.getVk(), textureCompressionASTC_LDR.getVk(), textureCompressionBC.getVk(), occlusionQueryPrecise.getVk(), pipelineStatisticsQuery.getVk(), vertexPipelineStoresAndAtomics.getVk(), fragmentStoresAndAtomics.getVk(), shaderTessellationAndGeometryPointSize.getVk(), shaderImageGatherExtended.getVk(), shaderStorageImageExtendedFormats.getVk(), shaderStorageImageMultisample.getVk(), shaderStorageImageReadWithoutFormat.getVk(), shaderStorageImageWriteWithoutFormat.getVk(), shaderUniformBufferArrayDynamicIndexing.getVk(), shaderSampledImageArrayDynamicIndexing.getVk(), shaderStorageBufferArrayDynamicIndexing.getVk(), shaderStorageImageArrayDynamicIndexing.getVk(), shaderClipDistance.getVk(), shaderCullDistance.getVk(), shaderFloat64.getVk(), shaderInt64.getVk(), shaderInt16.getVk(), shaderResourceResidency.getVk(), shaderResourceMinLod.getVk(), sparseBinding.getVk(), sparseResidencyBuffer.getVk(), sparseResidencyImage2D.getVk(), sparseResidencyImage3D.getVk(), sparseResidency2Samples.getVk(), sparseResidency4Samples.getVk(), sparseResidency8Samples.getVk(), sparseResidency16Samples.getVk(), sparseResidencyAliased.getVk(), variableMultisampleRate.getVk(), inheritedQueries.getVk()));
    }

    public VulkanBool32 getRobustBufferAccess() {
        return new VulkanBool32(getVk().getRobustBufferAccess());
    }

    public void setRobustBufferAccess(VulkanBool32 robustBufferAccess) {
        getVk().setRobustBufferAccess(robustBufferAccess.getVk());
    }

    public VulkanBool32 getFullDrawIndexUint32() {
        return new VulkanBool32(getVk().getFullDrawIndexUint32());
    }

    public void setFullDrawIndexUint32(VulkanBool32 fullDrawIndexUint32) {
        getVk().setFullDrawIndexUint32(fullDrawIndexUint32.getVk());
    }

    public VulkanBool32 getImageCubeArray() {
        return new VulkanBool32(getVk().getImageCubeArray());
    }

    public void setImageCubeArray(VulkanBool32 imageCubeArray) {
        getVk().setImageCubeArray(imageCubeArray.getVk());
    }

    public VulkanBool32 getIndependentBlend() {
        return new VulkanBool32(getVk().getIndependentBlend());
    }

    public void setIndependentBlend(VulkanBool32 independentBlend) {
        getVk().setIndependentBlend(independentBlend.getVk());
    }

    public VulkanBool32 getGeometryShader() {
        return new VulkanBool32(getVk().getGeometryShader());
    }

    public void setGeometryShader(VulkanBool32 geometryShader) {
        getVk().setGeometryShader(geometryShader.getVk());
    }

    public VulkanBool32 getTessellationShader() {
        return new VulkanBool32(getVk().getTessellationShader());
    }

    public void setTessellationShader(VulkanBool32 tessellationShader) {
        getVk().setTessellationShader(tessellationShader.getVk());
    }

    public VulkanBool32 getSampleRateShading() {
        return new VulkanBool32(getVk().getSampleRateShading());
    }

    public void setSampleRateShading(VulkanBool32 sampleRateShading) {
        getVk().setSampleRateShading(sampleRateShading.getVk());
    }

    public VulkanBool32 getDualSrcBlend() {
        return new VulkanBool32(getVk().getDualSrcBlend());
    }

    public void setDualSrcBlend(VulkanBool32 dualSrcBlend) {
        getVk().setDualSrcBlend(dualSrcBlend.getVk());
    }

    public VulkanBool32 getLogicOp() {
        return new VulkanBool32(getVk().getLogicOp());
    }

    public void setLogicOp(VulkanBool32 logicOp) {
        getVk().setLogicOp(logicOp.getVk());
    }

    public VulkanBool32 getMultiDrawIndirect() {
        return new VulkanBool32(getVk().getMultiDrawIndirect());
    }

    public void setMultiDrawIndirect(VulkanBool32 multiDrawIndirect) {
        getVk().setMultiDrawIndirect(multiDrawIndirect.getVk());
    }

    public VulkanBool32 getDrawIndirectFirstInstance() {
        return new VulkanBool32(getVk().getDrawIndirectFirstInstance());
    }

    public void setDrawIndirectFirstInstance(VulkanBool32 drawIndirectFirstInstance) {
        getVk().setDrawIndirectFirstInstance(drawIndirectFirstInstance.getVk());
    }

    public VulkanBool32 getDepthClamp() {
        return new VulkanBool32(getVk().getDepthClamp());
    }

    public void setDepthClamp(VulkanBool32 depthClamp) {
        getVk().setDepthClamp(depthClamp.getVk());
    }

    public VulkanBool32 getDepthBiasClamp() {
        return new VulkanBool32(getVk().getDepthBiasClamp());
    }

    public void setDepthBiasClamp(VulkanBool32 depthBiasClamp) {
        getVk().setDepthBiasClamp(depthBiasClamp.getVk());
    }

    public VulkanBool32 getFillModeNonSolid() {
        return new VulkanBool32(getVk().getFillModeNonSolid());
    }

    public void setFillModeNonSolid(VulkanBool32 fillModeNonSolid) {
        getVk().setFillModeNonSolid(fillModeNonSolid.getVk());
    }

    public VulkanBool32 getDepthBounds() {
        return new VulkanBool32(getVk().getDepthBounds());
    }

    public void setDepthBounds(VulkanBool32 depthBounds) {
        getVk().setDepthBounds(depthBounds.getVk());
    }

    public VulkanBool32 getWideLines() {
        return new VulkanBool32(getVk().getWideLines());
    }

    public void setWideLines(VulkanBool32 wideLines) {
        getVk().setWideLines(wideLines.getVk());
    }

    public VulkanBool32 getLargePoints() {
        return new VulkanBool32(getVk().getLargePoints());
    }

    public void setLargePoints(VulkanBool32 largePoints) {
        getVk().setLargePoints(largePoints.getVk());
    }

    public VulkanBool32 getAlphaToOne() {
        return new VulkanBool32(getVk().getAlphaToOne());
    }

    public void setAlphaToOne(VulkanBool32 alphaToOne) {
        getVk().setAlphaToOne(alphaToOne.getVk());
    }

    public VulkanBool32 getMultiViewport() {
        return new VulkanBool32(getVk().getMultiViewport());
    }

    public void setMultiViewport(VulkanBool32 multiViewport) {
        getVk().setMultiViewport(multiViewport.getVk());
    }

    public VulkanBool32 getSamplerAnisotropy() {
        return new VulkanBool32(getVk().getSamplerAnisotropy());
    }

    public void setSamplerAnisotropy(VulkanBool32 samplerAnisotropy) {
        getVk().setSamplerAnisotropy(samplerAnisotropy.getVk());
    }

    public VulkanBool32 getTextureCompressionETC2() {
        return new VulkanBool32(getVk().getTextureCompressionETC2());
    }

    public void setTextureCompressionETC2(VulkanBool32 textureCompressionETC2) {
        getVk().setTextureCompressionETC2(textureCompressionETC2.getVk());
    }

    public VulkanBool32 getTextureCompressionASTC_LDR() {
        return new VulkanBool32(getVk().getTextureCompressionASTC_LDR());
    }

    public void setTextureCompressionASTC_LDR(VulkanBool32 textureCompressionASTC_LDR) {
        getVk().setTextureCompressionASTC_LDR(textureCompressionASTC_LDR.getVk());
    }

    public VulkanBool32 getTextureCompressionBC() {
        return new VulkanBool32(getVk().getTextureCompressionBC());
    }

    public void setTextureCompressionBC(VulkanBool32 textureCompressionBC) {
        getVk().setTextureCompressionBC(textureCompressionBC.getVk());
    }

    public VulkanBool32 getOcclusionQueryPrecise() {
        return new VulkanBool32(getVk().getOcclusionQueryPrecise());
    }

    public void setOcclusionQueryPrecise(VulkanBool32 occlusionQueryPrecise) {
        getVk().setOcclusionQueryPrecise(occlusionQueryPrecise.getVk());
    }

    public VulkanBool32 getPipelineStatisticsQuery() {
        return new VulkanBool32(getVk().getPipelineStatisticsQuery());
    }

    public void setPipelineStatisticsQuery(VulkanBool32 pipelineStatisticsQuery) {
        getVk().setPipelineStatisticsQuery(pipelineStatisticsQuery.getVk());
    }

    public VulkanBool32 getVertexPipelineStoresAndAtomics() {
        return new VulkanBool32(getVk().getVertexPipelineStoresAndAtomics());
    }

    public void setVertexPipelineStoresAndAtomics(VulkanBool32 vertexPipelineStoresAndAtomics) {
        getVk().setVertexPipelineStoresAndAtomics(vertexPipelineStoresAndAtomics.getVk());
    }

    public VulkanBool32 getFragmentStoresAndAtomics() {
        return new VulkanBool32(getVk().getFragmentStoresAndAtomics());
    }

    public void setFragmentStoresAndAtomics(VulkanBool32 fragmentStoresAndAtomics) {
        getVk().setFragmentStoresAndAtomics(fragmentStoresAndAtomics.getVk());
    }

    public VulkanBool32 getShaderTessellationAndGeometryPointSize() {
        return new VulkanBool32(getVk().getShaderTessellationAndGeometryPointSize());
    }

    public void setShaderTessellationAndGeometryPointSize(VulkanBool32 shaderTessellationAndGeometryPointSize) {
        getVk().setShaderTessellationAndGeometryPointSize(shaderTessellationAndGeometryPointSize.getVk());
    }

    public VulkanBool32 getShaderImageGatherExtended() {
        return new VulkanBool32(getVk().getShaderImageGatherExtended());
    }

    public void setShaderImageGatherExtended(VulkanBool32 shaderImageGatherExtended) {
        getVk().setShaderImageGatherExtended(shaderImageGatherExtended.getVk());
    }

    public VulkanBool32 getShaderStorageImageExtendedFormats() {
        return new VulkanBool32(getVk().getShaderStorageImageExtendedFormats());
    }

    public void setShaderStorageImageExtendedFormats(VulkanBool32 shaderStorageImageExtendedFormats) {
        getVk().setShaderStorageImageExtendedFormats(shaderStorageImageExtendedFormats.getVk());
    }

    public VulkanBool32 getShaderStorageImageMultisample() {
        return new VulkanBool32(getVk().getShaderStorageImageMultisample());
    }

    public void setShaderStorageImageMultisample(VulkanBool32 shaderStorageImageMultisample) {
        getVk().setShaderStorageImageMultisample(shaderStorageImageMultisample.getVk());
    }

    public VulkanBool32 getShaderStorageImageReadWithoutFormat() {
        return new VulkanBool32(getVk().getShaderStorageImageReadWithoutFormat());
    }

    public void setShaderStorageImageReadWithoutFormat(VulkanBool32 shaderStorageImageReadWithoutFormat) {
        getVk().setShaderStorageImageReadWithoutFormat(shaderStorageImageReadWithoutFormat.getVk());
    }

    public VulkanBool32 getShaderStorageImageWriteWithoutFormat() {
        return new VulkanBool32(getVk().getShaderStorageImageWriteWithoutFormat());
    }

    public void setShaderStorageImageWriteWithoutFormat(VulkanBool32 shaderStorageImageWriteWithoutFormat) {
        getVk().setShaderStorageImageWriteWithoutFormat(shaderStorageImageWriteWithoutFormat.getVk());
    }

    public VulkanBool32 getShaderUniformBufferArrayDynamicIndexing() {
        return new VulkanBool32(getVk().getShaderUniformBufferArrayDynamicIndexing());
    }

    public void setShaderUniformBufferArrayDynamicIndexing(VulkanBool32 shaderUniformBufferArrayDynamicIndexing) {
        getVk().setShaderUniformBufferArrayDynamicIndexing(shaderUniformBufferArrayDynamicIndexing.getVk());
    }

    public VulkanBool32 getShaderSampledImageArrayDynamicIndexing() {
        return new VulkanBool32(getVk().getShaderSampledImageArrayDynamicIndexing());
    }

    public void setShaderSampledImageArrayDynamicIndexing(VulkanBool32 shaderSampledImageArrayDynamicIndexing) {
        getVk().setShaderSampledImageArrayDynamicIndexing(shaderSampledImageArrayDynamicIndexing.getVk());
    }

    public VulkanBool32 getShaderStorageBufferArrayDynamicIndexing() {
        return new VulkanBool32(getVk().getShaderStorageBufferArrayDynamicIndexing());
    }

    public void setShaderStorageBufferArrayDynamicIndexing(VulkanBool32 shaderStorageBufferArrayDynamicIndexing) {
        getVk().setShaderStorageBufferArrayDynamicIndexing(shaderStorageBufferArrayDynamicIndexing.getVk());
    }

    public VulkanBool32 getShaderStorageImageArrayDynamicIndexing() {
        return new VulkanBool32(getVk().getShaderStorageImageArrayDynamicIndexing());
    }

    public void setShaderStorageImageArrayDynamicIndexing(VulkanBool32 shaderStorageImageArrayDynamicIndexing) {
        getVk().setShaderStorageImageArrayDynamicIndexing(shaderStorageImageArrayDynamicIndexing.getVk());
    }

    public VulkanBool32 getShaderClipDistance() {
        return new VulkanBool32(getVk().getShaderClipDistance());
    }

    public void setShaderClipDistance(VulkanBool32 shaderClipDistance) {
        getVk().setShaderClipDistance(shaderClipDistance.getVk());
    }

    public VulkanBool32 getShaderCullDistance() {
        return new VulkanBool32(getVk().getShaderCullDistance());
    }

    public void setShaderCullDistance(VulkanBool32 shaderCullDistance) {
        getVk().setShaderCullDistance(shaderCullDistance.getVk());
    }

    public VulkanBool32 getShaderFloat64() {
        return new VulkanBool32(getVk().getShaderFloat64());
    }

    public void setShaderFloat64(VulkanBool32 shaderFloat64) {
        getVk().setShaderFloat64(shaderFloat64.getVk());
    }

    public VulkanBool32 getShaderInt64() {
        return new VulkanBool32(getVk().getShaderInt64());
    }

    public void setShaderInt64(VulkanBool32 shaderInt64) {
        getVk().setShaderInt64(shaderInt64.getVk());
    }

    public VulkanBool32 getShaderInt16() {
        return new VulkanBool32(getVk().getShaderInt16());
    }

    public void setShaderInt16(VulkanBool32 shaderInt16) {
        getVk().setShaderInt16(shaderInt16.getVk());
    }

    public VulkanBool32 getShaderResourceResidency() {
        return new VulkanBool32(getVk().getShaderResourceResidency());
    }

    public void setShaderResourceResidency(VulkanBool32 shaderResourceResidency) {
        getVk().setShaderResourceResidency(shaderResourceResidency.getVk());
    }

    public VulkanBool32 getShaderResourceMinLod() {
        return new VulkanBool32(getVk().getShaderResourceMinLod());
    }

    public void setShaderResourceMinLod(VulkanBool32 shaderResourceMinLod) {
        getVk().setShaderResourceMinLod(shaderResourceMinLod.getVk());
    }

    public VulkanBool32 getSparseBinding() {
        return new VulkanBool32(getVk().getSparseBinding());
    }

    public void setSparseBinding(VulkanBool32 sparseBinding) {
        getVk().setSparseBinding(sparseBinding.getVk());
    }

    public VulkanBool32 getSparseResidencyBuffer() {
        return new VulkanBool32(getVk().getSparseResidencyBuffer());
    }

    public void setSparseResidencyBuffer(VulkanBool32 sparseResidencyBuffer) {
        getVk().setSparseResidencyBuffer(sparseResidencyBuffer.getVk());
    }

    public VulkanBool32 getSparseResidencyImage2D() {
        return new VulkanBool32(getVk().getSparseResidencyImage2D());
    }

    public void setSparseResidencyImage2D(VulkanBool32 sparseResidencyImage2D) {
        getVk().setSparseResidencyImage2D(sparseResidencyImage2D.getVk());
    }

    public VulkanBool32 getSparseResidencyImage3D() {
        return new VulkanBool32(getVk().getSparseResidencyImage3D());
    }

    public void setSparseResidencyImage3D(VulkanBool32 sparseResidencyImage3D) {
        getVk().setSparseResidencyImage3D(sparseResidencyImage3D.getVk());
    }

    public VulkanBool32 getSparseResidency2Samples() {
        return new VulkanBool32(getVk().getSparseResidency2Samples());
    }

    public void setSparseResidency2Samples(VulkanBool32 sparseResidency2Samples) {
        getVk().setSparseResidency2Samples(sparseResidency2Samples.getVk());
    }

    public VulkanBool32 getSparseResidency4Samples() {
        return new VulkanBool32(getVk().getSparseResidency4Samples());
    }

    public void setSparseResidency4Samples(VulkanBool32 sparseResidency4Samples) {
        getVk().setSparseResidency4Samples(sparseResidency4Samples.getVk());
    }

    public VulkanBool32 getSparseResidency8Samples() {
        return new VulkanBool32(getVk().getSparseResidency8Samples());
    }

    public void setSparseResidency8Samples(VulkanBool32 sparseResidency8Samples) {
        getVk().setSparseResidency8Samples(sparseResidency8Samples.getVk());
    }

    public VulkanBool32 getSparseResidency16Samples() {
        return new VulkanBool32(getVk().getSparseResidency16Samples());
    }

    public void setSparseResidency16Samples(VulkanBool32 sparseResidency16Samples) {
        getVk().setSparseResidency16Samples(sparseResidency16Samples.getVk());
    }

    public VulkanBool32 getSparseResidencyAliased() {
        return new VulkanBool32(getVk().getSparseResidencyAliased());
    }

    public void setSparseResidencyAliased(VulkanBool32 sparseResidencyAliased) {
        getVk().setSparseResidencyAliased(sparseResidencyAliased.getVk());
    }

    public VulkanBool32 getVariableMultisampleRate() {
        return new VulkanBool32(getVk().getVariableMultisampleRate());
    }

    public void setVariableMultisampleRate(VulkanBool32 variableMultisampleRate) {
        getVk().setVariableMultisampleRate(variableMultisampleRate.getVk());
    }

    public VulkanBool32 getInheritedQueries() {
        return new VulkanBool32(getVk().getInheritedQueries());
    }

    public void setInheritedQueries(VulkanBool32 inheritedQueries) {
        getVk().setInheritedQueries(inheritedQueries.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceFeatures implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceFeatures> {
        public Array(VkPhysicalDeviceFeatures.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceFeatures.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceFeatures o){
            this(new VkPhysicalDeviceFeatures.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceFeatures.Array getVk(){
            return (VkPhysicalDeviceFeatures.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceFeatures get(int i){
            return new VulkanPhysicalDeviceFeatures(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceFeatures.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceFeatures.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceFeatures.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceFeatures.Pointer getVk(){
            return (VkPhysicalDeviceFeatures.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceFeatures.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceFeatures.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceFeatures.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceFeatures[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceFeatures.Pointer.Array getVk(){
                return (VkPhysicalDeviceFeatures.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceFeatures.Pointer get(int i){
                return new VulkanPhysicalDeviceFeatures.Pointer(getVk().get(i));
            }
        }
    }
}
