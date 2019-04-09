package cz.mg.vulkan;

public class VkPhysicalDeviceFeatures extends VkObject {
    public VkPhysicalDeviceFeatures() {
        super(sizeof());
    }

    public VkPhysicalDeviceFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPhysicalDeviceFeatures(VkBool32 robustBufferAccess, VkBool32 fullDrawIndexUint32, VkBool32 imageCubeArray, VkBool32 independentBlend, VkBool32 geometryShader, VkBool32 tessellationShader, VkBool32 sampleRateShading, VkBool32 dualSrcBlend, VkBool32 logicOp, VkBool32 multiDrawIndirect, VkBool32 drawIndirectFirstInstance, VkBool32 depthClamp, VkBool32 depthBiasClamp, VkBool32 fillModeNonSolid, VkBool32 depthBounds, VkBool32 wideLines, VkBool32 largePoints, VkBool32 alphaToOne, VkBool32 multiViewport, VkBool32 samplerAnisotropy, VkBool32 textureCompressionETC2, VkBool32 textureCompressionASTC_LDR, VkBool32 textureCompressionBC, VkBool32 occlusionQueryPrecise, VkBool32 pipelineStatisticsQuery, VkBool32 vertexPipelineStoresAndAtomics, VkBool32 fragmentStoresAndAtomics, VkBool32 shaderTessellationAndGeometryPointSize, VkBool32 shaderImageGatherExtended, VkBool32 shaderStorageImageExtendedFormats, VkBool32 shaderStorageImageMultisample, VkBool32 shaderStorageImageReadWithoutFormat, VkBool32 shaderStorageImageWriteWithoutFormat, VkBool32 shaderUniformBufferArrayDynamicIndexing, VkBool32 shaderSampledImageArrayDynamicIndexing, VkBool32 shaderStorageBufferArrayDynamicIndexing, VkBool32 shaderStorageImageArrayDynamicIndexing, VkBool32 shaderClipDistance, VkBool32 shaderCullDistance, VkBool32 shaderFloat64, VkBool32 shaderInt64, VkBool32 shaderInt16, VkBool32 shaderResourceResidency, VkBool32 shaderResourceMinLod, VkBool32 sparseBinding, VkBool32 sparseResidencyBuffer, VkBool32 sparseResidencyImage2D, VkBool32 sparseResidencyImage3D, VkBool32 sparseResidency2Samples, VkBool32 sparseResidency4Samples, VkBool32 sparseResidency8Samples, VkBool32 sparseResidency16Samples, VkBool32 sparseResidencyAliased, VkBool32 variableMultisampleRate, VkBool32 inheritedQueries) {
        super(sizeof());
        setRobustBufferAccess(robustBufferAccess);
        setFullDrawIndexUint32(fullDrawIndexUint32);
        setImageCubeArray(imageCubeArray);
        setIndependentBlend(independentBlend);
        setGeometryShader(geometryShader);
        setTessellationShader(tessellationShader);
        setSampleRateShading(sampleRateShading);
        setDualSrcBlend(dualSrcBlend);
        setLogicOp(logicOp);
        setMultiDrawIndirect(multiDrawIndirect);
        setDrawIndirectFirstInstance(drawIndirectFirstInstance);
        setDepthClamp(depthClamp);
        setDepthBiasClamp(depthBiasClamp);
        setFillModeNonSolid(fillModeNonSolid);
        setDepthBounds(depthBounds);
        setWideLines(wideLines);
        setLargePoints(largePoints);
        setAlphaToOne(alphaToOne);
        setMultiViewport(multiViewport);
        setSamplerAnisotropy(samplerAnisotropy);
        setTextureCompressionETC2(textureCompressionETC2);
        setTextureCompressionASTC_LDR(textureCompressionASTC_LDR);
        setTextureCompressionBC(textureCompressionBC);
        setOcclusionQueryPrecise(occlusionQueryPrecise);
        setPipelineStatisticsQuery(pipelineStatisticsQuery);
        setVertexPipelineStoresAndAtomics(vertexPipelineStoresAndAtomics);
        setFragmentStoresAndAtomics(fragmentStoresAndAtomics);
        setShaderTessellationAndGeometryPointSize(shaderTessellationAndGeometryPointSize);
        setShaderImageGatherExtended(shaderImageGatherExtended);
        setShaderStorageImageExtendedFormats(shaderStorageImageExtendedFormats);
        setShaderStorageImageMultisample(shaderStorageImageMultisample);
        setShaderStorageImageReadWithoutFormat(shaderStorageImageReadWithoutFormat);
        setShaderStorageImageWriteWithoutFormat(shaderStorageImageWriteWithoutFormat);
        setShaderUniformBufferArrayDynamicIndexing(shaderUniformBufferArrayDynamicIndexing);
        setShaderSampledImageArrayDynamicIndexing(shaderSampledImageArrayDynamicIndexing);
        setShaderStorageBufferArrayDynamicIndexing(shaderStorageBufferArrayDynamicIndexing);
        setShaderStorageImageArrayDynamicIndexing(shaderStorageImageArrayDynamicIndexing);
        setShaderClipDistance(shaderClipDistance);
        setShaderCullDistance(shaderCullDistance);
        setShaderFloat64(shaderFloat64);
        setShaderInt64(shaderInt64);
        setShaderInt16(shaderInt16);
        setShaderResourceResidency(shaderResourceResidency);
        setShaderResourceMinLod(shaderResourceMinLod);
        setSparseBinding(sparseBinding);
        setSparseResidencyBuffer(sparseResidencyBuffer);
        setSparseResidencyImage2D(sparseResidencyImage2D);
        setSparseResidencyImage3D(sparseResidencyImage3D);
        setSparseResidency2Samples(sparseResidency2Samples);
        setSparseResidency4Samples(sparseResidency4Samples);
        setSparseResidency8Samples(sparseResidency8Samples);
        setSparseResidency16Samples(sparseResidency16Samples);
        setSparseResidencyAliased(sparseResidencyAliased);
        setVariableMultisampleRate(variableMultisampleRate);
        setInheritedQueries(inheritedQueries);
    }

    public VkBool32 getRobustBufferAccess() {
        return new VkBool32(getVkMemory(), getRobustBufferAccess(getVkAddress()));
    }

    
    public void setRobustBufferAccess(VkBool32 robustBufferAccess) {
        setRobustBufferAccess(getVkAddress(), robustBufferAccess != null ? robustBufferAccess.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getRobustBufferAccess(long address);
    private static native void setRobustBufferAccess(long address, long robustBufferAccess);

    public VkBool32 getFullDrawIndexUint32() {
        return new VkBool32(getVkMemory(), getFullDrawIndexUint32(getVkAddress()));
    }

    
    public void setFullDrawIndexUint32(VkBool32 fullDrawIndexUint32) {
        setFullDrawIndexUint32(getVkAddress(), fullDrawIndexUint32 != null ? fullDrawIndexUint32.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFullDrawIndexUint32(long address);
    private static native void setFullDrawIndexUint32(long address, long fullDrawIndexUint32);

    public VkBool32 getImageCubeArray() {
        return new VkBool32(getVkMemory(), getImageCubeArray(getVkAddress()));
    }

    
    public void setImageCubeArray(VkBool32 imageCubeArray) {
        setImageCubeArray(getVkAddress(), imageCubeArray != null ? imageCubeArray.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getImageCubeArray(long address);
    private static native void setImageCubeArray(long address, long imageCubeArray);

    public VkBool32 getIndependentBlend() {
        return new VkBool32(getVkMemory(), getIndependentBlend(getVkAddress()));
    }

    
    public void setIndependentBlend(VkBool32 independentBlend) {
        setIndependentBlend(getVkAddress(), independentBlend != null ? independentBlend.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getIndependentBlend(long address);
    private static native void setIndependentBlend(long address, long independentBlend);

    public VkBool32 getGeometryShader() {
        return new VkBool32(getVkMemory(), getGeometryShader(getVkAddress()));
    }

    
    public void setGeometryShader(VkBool32 geometryShader) {
        setGeometryShader(getVkAddress(), geometryShader != null ? geometryShader.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getGeometryShader(long address);
    private static native void setGeometryShader(long address, long geometryShader);

    public VkBool32 getTessellationShader() {
        return new VkBool32(getVkMemory(), getTessellationShader(getVkAddress()));
    }

    
    public void setTessellationShader(VkBool32 tessellationShader) {
        setTessellationShader(getVkAddress(), tessellationShader != null ? tessellationShader.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getTessellationShader(long address);
    private static native void setTessellationShader(long address, long tessellationShader);

    public VkBool32 getSampleRateShading() {
        return new VkBool32(getVkMemory(), getSampleRateShading(getVkAddress()));
    }

    
    public void setSampleRateShading(VkBool32 sampleRateShading) {
        setSampleRateShading(getVkAddress(), sampleRateShading != null ? sampleRateShading.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSampleRateShading(long address);
    private static native void setSampleRateShading(long address, long sampleRateShading);

    public VkBool32 getDualSrcBlend() {
        return new VkBool32(getVkMemory(), getDualSrcBlend(getVkAddress()));
    }

    
    public void setDualSrcBlend(VkBool32 dualSrcBlend) {
        setDualSrcBlend(getVkAddress(), dualSrcBlend != null ? dualSrcBlend.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDualSrcBlend(long address);
    private static native void setDualSrcBlend(long address, long dualSrcBlend);

    public VkBool32 getLogicOp() {
        return new VkBool32(getVkMemory(), getLogicOp(getVkAddress()));
    }

    
    public void setLogicOp(VkBool32 logicOp) {
        setLogicOp(getVkAddress(), logicOp != null ? logicOp.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getLogicOp(long address);
    private static native void setLogicOp(long address, long logicOp);

    public VkBool32 getMultiDrawIndirect() {
        return new VkBool32(getVkMemory(), getMultiDrawIndirect(getVkAddress()));
    }

    
    public void setMultiDrawIndirect(VkBool32 multiDrawIndirect) {
        setMultiDrawIndirect(getVkAddress(), multiDrawIndirect != null ? multiDrawIndirect.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMultiDrawIndirect(long address);
    private static native void setMultiDrawIndirect(long address, long multiDrawIndirect);

    public VkBool32 getDrawIndirectFirstInstance() {
        return new VkBool32(getVkMemory(), getDrawIndirectFirstInstance(getVkAddress()));
    }

    
    public void setDrawIndirectFirstInstance(VkBool32 drawIndirectFirstInstance) {
        setDrawIndirectFirstInstance(getVkAddress(), drawIndirectFirstInstance != null ? drawIndirectFirstInstance.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDrawIndirectFirstInstance(long address);
    private static native void setDrawIndirectFirstInstance(long address, long drawIndirectFirstInstance);

    public VkBool32 getDepthClamp() {
        return new VkBool32(getVkMemory(), getDepthClamp(getVkAddress()));
    }

    
    public void setDepthClamp(VkBool32 depthClamp) {
        setDepthClamp(getVkAddress(), depthClamp != null ? depthClamp.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDepthClamp(long address);
    private static native void setDepthClamp(long address, long depthClamp);

    public VkBool32 getDepthBiasClamp() {
        return new VkBool32(getVkMemory(), getDepthBiasClamp(getVkAddress()));
    }

    
    public void setDepthBiasClamp(VkBool32 depthBiasClamp) {
        setDepthBiasClamp(getVkAddress(), depthBiasClamp != null ? depthBiasClamp.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDepthBiasClamp(long address);
    private static native void setDepthBiasClamp(long address, long depthBiasClamp);

    public VkBool32 getFillModeNonSolid() {
        return new VkBool32(getVkMemory(), getFillModeNonSolid(getVkAddress()));
    }

    
    public void setFillModeNonSolid(VkBool32 fillModeNonSolid) {
        setFillModeNonSolid(getVkAddress(), fillModeNonSolid != null ? fillModeNonSolid.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFillModeNonSolid(long address);
    private static native void setFillModeNonSolid(long address, long fillModeNonSolid);

    public VkBool32 getDepthBounds() {
        return new VkBool32(getVkMemory(), getDepthBounds(getVkAddress()));
    }

    
    public void setDepthBounds(VkBool32 depthBounds) {
        setDepthBounds(getVkAddress(), depthBounds != null ? depthBounds.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDepthBounds(long address);
    private static native void setDepthBounds(long address, long depthBounds);

    public VkBool32 getWideLines() {
        return new VkBool32(getVkMemory(), getWideLines(getVkAddress()));
    }

    
    public void setWideLines(VkBool32 wideLines) {
        setWideLines(getVkAddress(), wideLines != null ? wideLines.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getWideLines(long address);
    private static native void setWideLines(long address, long wideLines);

    public VkBool32 getLargePoints() {
        return new VkBool32(getVkMemory(), getLargePoints(getVkAddress()));
    }

    
    public void setLargePoints(VkBool32 largePoints) {
        setLargePoints(getVkAddress(), largePoints != null ? largePoints.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getLargePoints(long address);
    private static native void setLargePoints(long address, long largePoints);

    public VkBool32 getAlphaToOne() {
        return new VkBool32(getVkMemory(), getAlphaToOne(getVkAddress()));
    }

    
    public void setAlphaToOne(VkBool32 alphaToOne) {
        setAlphaToOne(getVkAddress(), alphaToOne != null ? alphaToOne.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getAlphaToOne(long address);
    private static native void setAlphaToOne(long address, long alphaToOne);

    public VkBool32 getMultiViewport() {
        return new VkBool32(getVkMemory(), getMultiViewport(getVkAddress()));
    }

    
    public void setMultiViewport(VkBool32 multiViewport) {
        setMultiViewport(getVkAddress(), multiViewport != null ? multiViewport.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMultiViewport(long address);
    private static native void setMultiViewport(long address, long multiViewport);

    public VkBool32 getSamplerAnisotropy() {
        return new VkBool32(getVkMemory(), getSamplerAnisotropy(getVkAddress()));
    }

    
    public void setSamplerAnisotropy(VkBool32 samplerAnisotropy) {
        setSamplerAnisotropy(getVkAddress(), samplerAnisotropy != null ? samplerAnisotropy.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSamplerAnisotropy(long address);
    private static native void setSamplerAnisotropy(long address, long samplerAnisotropy);

    public VkBool32 getTextureCompressionETC2() {
        return new VkBool32(getVkMemory(), getTextureCompressionETC2(getVkAddress()));
    }

    
    public void setTextureCompressionETC2(VkBool32 textureCompressionETC2) {
        setTextureCompressionETC2(getVkAddress(), textureCompressionETC2 != null ? textureCompressionETC2.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getTextureCompressionETC2(long address);
    private static native void setTextureCompressionETC2(long address, long textureCompressionETC2);

    public VkBool32 getTextureCompressionASTC_LDR() {
        return new VkBool32(getVkMemory(), getTextureCompressionASTC_LDR(getVkAddress()));
    }

    
    public void setTextureCompressionASTC_LDR(VkBool32 textureCompressionASTC_LDR) {
        setTextureCompressionASTC_LDR(getVkAddress(), textureCompressionASTC_LDR != null ? textureCompressionASTC_LDR.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getTextureCompressionASTC_LDR(long address);
    private static native void setTextureCompressionASTC_LDR(long address, long textureCompressionASTC_LDR);

    public VkBool32 getTextureCompressionBC() {
        return new VkBool32(getVkMemory(), getTextureCompressionBC(getVkAddress()));
    }

    
    public void setTextureCompressionBC(VkBool32 textureCompressionBC) {
        setTextureCompressionBC(getVkAddress(), textureCompressionBC != null ? textureCompressionBC.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getTextureCompressionBC(long address);
    private static native void setTextureCompressionBC(long address, long textureCompressionBC);

    public VkBool32 getOcclusionQueryPrecise() {
        return new VkBool32(getVkMemory(), getOcclusionQueryPrecise(getVkAddress()));
    }

    
    public void setOcclusionQueryPrecise(VkBool32 occlusionQueryPrecise) {
        setOcclusionQueryPrecise(getVkAddress(), occlusionQueryPrecise != null ? occlusionQueryPrecise.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getOcclusionQueryPrecise(long address);
    private static native void setOcclusionQueryPrecise(long address, long occlusionQueryPrecise);

    public VkBool32 getPipelineStatisticsQuery() {
        return new VkBool32(getVkMemory(), getPipelineStatisticsQuery(getVkAddress()));
    }

    
    public void setPipelineStatisticsQuery(VkBool32 pipelineStatisticsQuery) {
        setPipelineStatisticsQuery(getVkAddress(), pipelineStatisticsQuery != null ? pipelineStatisticsQuery.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPipelineStatisticsQuery(long address);
    private static native void setPipelineStatisticsQuery(long address, long pipelineStatisticsQuery);

    public VkBool32 getVertexPipelineStoresAndAtomics() {
        return new VkBool32(getVkMemory(), getVertexPipelineStoresAndAtomics(getVkAddress()));
    }

    
    public void setVertexPipelineStoresAndAtomics(VkBool32 vertexPipelineStoresAndAtomics) {
        setVertexPipelineStoresAndAtomics(getVkAddress(), vertexPipelineStoresAndAtomics != null ? vertexPipelineStoresAndAtomics.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getVertexPipelineStoresAndAtomics(long address);
    private static native void setVertexPipelineStoresAndAtomics(long address, long vertexPipelineStoresAndAtomics);

    public VkBool32 getFragmentStoresAndAtomics() {
        return new VkBool32(getVkMemory(), getFragmentStoresAndAtomics(getVkAddress()));
    }

    
    public void setFragmentStoresAndAtomics(VkBool32 fragmentStoresAndAtomics) {
        setFragmentStoresAndAtomics(getVkAddress(), fragmentStoresAndAtomics != null ? fragmentStoresAndAtomics.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFragmentStoresAndAtomics(long address);
    private static native void setFragmentStoresAndAtomics(long address, long fragmentStoresAndAtomics);

    public VkBool32 getShaderTessellationAndGeometryPointSize() {
        return new VkBool32(getVkMemory(), getShaderTessellationAndGeometryPointSize(getVkAddress()));
    }

    
    public void setShaderTessellationAndGeometryPointSize(VkBool32 shaderTessellationAndGeometryPointSize) {
        setShaderTessellationAndGeometryPointSize(getVkAddress(), shaderTessellationAndGeometryPointSize != null ? shaderTessellationAndGeometryPointSize.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderTessellationAndGeometryPointSize(long address);
    private static native void setShaderTessellationAndGeometryPointSize(long address, long shaderTessellationAndGeometryPointSize);

    public VkBool32 getShaderImageGatherExtended() {
        return new VkBool32(getVkMemory(), getShaderImageGatherExtended(getVkAddress()));
    }

    
    public void setShaderImageGatherExtended(VkBool32 shaderImageGatherExtended) {
        setShaderImageGatherExtended(getVkAddress(), shaderImageGatherExtended != null ? shaderImageGatherExtended.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderImageGatherExtended(long address);
    private static native void setShaderImageGatherExtended(long address, long shaderImageGatherExtended);

    public VkBool32 getShaderStorageImageExtendedFormats() {
        return new VkBool32(getVkMemory(), getShaderStorageImageExtendedFormats(getVkAddress()));
    }

    
    public void setShaderStorageImageExtendedFormats(VkBool32 shaderStorageImageExtendedFormats) {
        setShaderStorageImageExtendedFormats(getVkAddress(), shaderStorageImageExtendedFormats != null ? shaderStorageImageExtendedFormats.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStorageImageExtendedFormats(long address);
    private static native void setShaderStorageImageExtendedFormats(long address, long shaderStorageImageExtendedFormats);

    public VkBool32 getShaderStorageImageMultisample() {
        return new VkBool32(getVkMemory(), getShaderStorageImageMultisample(getVkAddress()));
    }

    
    public void setShaderStorageImageMultisample(VkBool32 shaderStorageImageMultisample) {
        setShaderStorageImageMultisample(getVkAddress(), shaderStorageImageMultisample != null ? shaderStorageImageMultisample.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStorageImageMultisample(long address);
    private static native void setShaderStorageImageMultisample(long address, long shaderStorageImageMultisample);

    public VkBool32 getShaderStorageImageReadWithoutFormat() {
        return new VkBool32(getVkMemory(), getShaderStorageImageReadWithoutFormat(getVkAddress()));
    }

    
    public void setShaderStorageImageReadWithoutFormat(VkBool32 shaderStorageImageReadWithoutFormat) {
        setShaderStorageImageReadWithoutFormat(getVkAddress(), shaderStorageImageReadWithoutFormat != null ? shaderStorageImageReadWithoutFormat.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStorageImageReadWithoutFormat(long address);
    private static native void setShaderStorageImageReadWithoutFormat(long address, long shaderStorageImageReadWithoutFormat);

    public VkBool32 getShaderStorageImageWriteWithoutFormat() {
        return new VkBool32(getVkMemory(), getShaderStorageImageWriteWithoutFormat(getVkAddress()));
    }

    
    public void setShaderStorageImageWriteWithoutFormat(VkBool32 shaderStorageImageWriteWithoutFormat) {
        setShaderStorageImageWriteWithoutFormat(getVkAddress(), shaderStorageImageWriteWithoutFormat != null ? shaderStorageImageWriteWithoutFormat.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStorageImageWriteWithoutFormat(long address);
    private static native void setShaderStorageImageWriteWithoutFormat(long address, long shaderStorageImageWriteWithoutFormat);

    public VkBool32 getShaderUniformBufferArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderUniformBufferArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderUniformBufferArrayDynamicIndexing(VkBool32 shaderUniformBufferArrayDynamicIndexing) {
        setShaderUniformBufferArrayDynamicIndexing(getVkAddress(), shaderUniformBufferArrayDynamicIndexing != null ? shaderUniformBufferArrayDynamicIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderUniformBufferArrayDynamicIndexing(long address);
    private static native void setShaderUniformBufferArrayDynamicIndexing(long address, long shaderUniformBufferArrayDynamicIndexing);

    public VkBool32 getShaderSampledImageArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderSampledImageArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderSampledImageArrayDynamicIndexing(VkBool32 shaderSampledImageArrayDynamicIndexing) {
        setShaderSampledImageArrayDynamicIndexing(getVkAddress(), shaderSampledImageArrayDynamicIndexing != null ? shaderSampledImageArrayDynamicIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderSampledImageArrayDynamicIndexing(long address);
    private static native void setShaderSampledImageArrayDynamicIndexing(long address, long shaderSampledImageArrayDynamicIndexing);

    public VkBool32 getShaderStorageBufferArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageBufferArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderStorageBufferArrayDynamicIndexing(VkBool32 shaderStorageBufferArrayDynamicIndexing) {
        setShaderStorageBufferArrayDynamicIndexing(getVkAddress(), shaderStorageBufferArrayDynamicIndexing != null ? shaderStorageBufferArrayDynamicIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStorageBufferArrayDynamicIndexing(long address);
    private static native void setShaderStorageBufferArrayDynamicIndexing(long address, long shaderStorageBufferArrayDynamicIndexing);

    public VkBool32 getShaderStorageImageArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageImageArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderStorageImageArrayDynamicIndexing(VkBool32 shaderStorageImageArrayDynamicIndexing) {
        setShaderStorageImageArrayDynamicIndexing(getVkAddress(), shaderStorageImageArrayDynamicIndexing != null ? shaderStorageImageArrayDynamicIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStorageImageArrayDynamicIndexing(long address);
    private static native void setShaderStorageImageArrayDynamicIndexing(long address, long shaderStorageImageArrayDynamicIndexing);

    public VkBool32 getShaderClipDistance() {
        return new VkBool32(getVkMemory(), getShaderClipDistance(getVkAddress()));
    }

    
    public void setShaderClipDistance(VkBool32 shaderClipDistance) {
        setShaderClipDistance(getVkAddress(), shaderClipDistance != null ? shaderClipDistance.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderClipDistance(long address);
    private static native void setShaderClipDistance(long address, long shaderClipDistance);

    public VkBool32 getShaderCullDistance() {
        return new VkBool32(getVkMemory(), getShaderCullDistance(getVkAddress()));
    }

    
    public void setShaderCullDistance(VkBool32 shaderCullDistance) {
        setShaderCullDistance(getVkAddress(), shaderCullDistance != null ? shaderCullDistance.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderCullDistance(long address);
    private static native void setShaderCullDistance(long address, long shaderCullDistance);

    public VkBool32 getShaderFloat64() {
        return new VkBool32(getVkMemory(), getShaderFloat64(getVkAddress()));
    }

    
    public void setShaderFloat64(VkBool32 shaderFloat64) {
        setShaderFloat64(getVkAddress(), shaderFloat64 != null ? shaderFloat64.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderFloat64(long address);
    private static native void setShaderFloat64(long address, long shaderFloat64);

    public VkBool32 getShaderInt64() {
        return new VkBool32(getVkMemory(), getShaderInt64(getVkAddress()));
    }

    
    public void setShaderInt64(VkBool32 shaderInt64) {
        setShaderInt64(getVkAddress(), shaderInt64 != null ? shaderInt64.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderInt64(long address);
    private static native void setShaderInt64(long address, long shaderInt64);

    public VkBool32 getShaderInt16() {
        return new VkBool32(getVkMemory(), getShaderInt16(getVkAddress()));
    }

    
    public void setShaderInt16(VkBool32 shaderInt16) {
        setShaderInt16(getVkAddress(), shaderInt16 != null ? shaderInt16.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderInt16(long address);
    private static native void setShaderInt16(long address, long shaderInt16);

    public VkBool32 getShaderResourceResidency() {
        return new VkBool32(getVkMemory(), getShaderResourceResidency(getVkAddress()));
    }

    
    public void setShaderResourceResidency(VkBool32 shaderResourceResidency) {
        setShaderResourceResidency(getVkAddress(), shaderResourceResidency != null ? shaderResourceResidency.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderResourceResidency(long address);
    private static native void setShaderResourceResidency(long address, long shaderResourceResidency);

    public VkBool32 getShaderResourceMinLod() {
        return new VkBool32(getVkMemory(), getShaderResourceMinLod(getVkAddress()));
    }

    
    public void setShaderResourceMinLod(VkBool32 shaderResourceMinLod) {
        setShaderResourceMinLod(getVkAddress(), shaderResourceMinLod != null ? shaderResourceMinLod.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderResourceMinLod(long address);
    private static native void setShaderResourceMinLod(long address, long shaderResourceMinLod);

    public VkBool32 getSparseBinding() {
        return new VkBool32(getVkMemory(), getSparseBinding(getVkAddress()));
    }

    
    public void setSparseBinding(VkBool32 sparseBinding) {
        setSparseBinding(getVkAddress(), sparseBinding != null ? sparseBinding.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSparseBinding(long address);
    private static native void setSparseBinding(long address, long sparseBinding);

    public VkBool32 getSparseResidencyBuffer() {
        return new VkBool32(getVkMemory(), getSparseResidencyBuffer(getVkAddress()));
    }

    
    public void setSparseResidencyBuffer(VkBool32 sparseResidencyBuffer) {
        setSparseResidencyBuffer(getVkAddress(), sparseResidencyBuffer != null ? sparseResidencyBuffer.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSparseResidencyBuffer(long address);
    private static native void setSparseResidencyBuffer(long address, long sparseResidencyBuffer);

    public VkBool32 getSparseResidencyImage2D() {
        return new VkBool32(getVkMemory(), getSparseResidencyImage2D(getVkAddress()));
    }

    
    public void setSparseResidencyImage2D(VkBool32 sparseResidencyImage2D) {
        setSparseResidencyImage2D(getVkAddress(), sparseResidencyImage2D != null ? sparseResidencyImage2D.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSparseResidencyImage2D(long address);
    private static native void setSparseResidencyImage2D(long address, long sparseResidencyImage2D);

    public VkBool32 getSparseResidencyImage3D() {
        return new VkBool32(getVkMemory(), getSparseResidencyImage3D(getVkAddress()));
    }

    
    public void setSparseResidencyImage3D(VkBool32 sparseResidencyImage3D) {
        setSparseResidencyImage3D(getVkAddress(), sparseResidencyImage3D != null ? sparseResidencyImage3D.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSparseResidencyImage3D(long address);
    private static native void setSparseResidencyImage3D(long address, long sparseResidencyImage3D);

    public VkBool32 getSparseResidency2Samples() {
        return new VkBool32(getVkMemory(), getSparseResidency2Samples(getVkAddress()));
    }

    
    public void setSparseResidency2Samples(VkBool32 sparseResidency2Samples) {
        setSparseResidency2Samples(getVkAddress(), sparseResidency2Samples != null ? sparseResidency2Samples.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSparseResidency2Samples(long address);
    private static native void setSparseResidency2Samples(long address, long sparseResidency2Samples);

    public VkBool32 getSparseResidency4Samples() {
        return new VkBool32(getVkMemory(), getSparseResidency4Samples(getVkAddress()));
    }

    
    public void setSparseResidency4Samples(VkBool32 sparseResidency4Samples) {
        setSparseResidency4Samples(getVkAddress(), sparseResidency4Samples != null ? sparseResidency4Samples.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSparseResidency4Samples(long address);
    private static native void setSparseResidency4Samples(long address, long sparseResidency4Samples);

    public VkBool32 getSparseResidency8Samples() {
        return new VkBool32(getVkMemory(), getSparseResidency8Samples(getVkAddress()));
    }

    
    public void setSparseResidency8Samples(VkBool32 sparseResidency8Samples) {
        setSparseResidency8Samples(getVkAddress(), sparseResidency8Samples != null ? sparseResidency8Samples.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSparseResidency8Samples(long address);
    private static native void setSparseResidency8Samples(long address, long sparseResidency8Samples);

    public VkBool32 getSparseResidency16Samples() {
        return new VkBool32(getVkMemory(), getSparseResidency16Samples(getVkAddress()));
    }

    
    public void setSparseResidency16Samples(VkBool32 sparseResidency16Samples) {
        setSparseResidency16Samples(getVkAddress(), sparseResidency16Samples != null ? sparseResidency16Samples.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSparseResidency16Samples(long address);
    private static native void setSparseResidency16Samples(long address, long sparseResidency16Samples);

    public VkBool32 getSparseResidencyAliased() {
        return new VkBool32(getVkMemory(), getSparseResidencyAliased(getVkAddress()));
    }

    
    public void setSparseResidencyAliased(VkBool32 sparseResidencyAliased) {
        setSparseResidencyAliased(getVkAddress(), sparseResidencyAliased != null ? sparseResidencyAliased.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSparseResidencyAliased(long address);
    private static native void setSparseResidencyAliased(long address, long sparseResidencyAliased);

    public VkBool32 getVariableMultisampleRate() {
        return new VkBool32(getVkMemory(), getVariableMultisampleRate(getVkAddress()));
    }

    
    public void setVariableMultisampleRate(VkBool32 variableMultisampleRate) {
        setVariableMultisampleRate(getVkAddress(), variableMultisampleRate != null ? variableMultisampleRate.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getVariableMultisampleRate(long address);
    private static native void setVariableMultisampleRate(long address, long variableMultisampleRate);

    public VkBool32 getInheritedQueries() {
        return new VkBool32(getVkMemory(), getInheritedQueries(getVkAddress()));
    }

    
    public void setInheritedQueries(VkBool32 inheritedQueries) {
        setInheritedQueries(getVkAddress(), inheritedQueries != null ? inheritedQueries.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getInheritedQueries(long address);
    private static native void setInheritedQueries(long address, long inheritedQueries);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceFeatures> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceFeatures.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceFeatures o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPhysicalDeviceFeatures get(int i){
            return new VkPhysicalDeviceFeatures(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkPhysicalDeviceFeatures.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceFeatures.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
                this.count = count;
            }

            public Array(VkMemory vkmemory, int count) {
                super(vkmemory);
                this.count = count;
            }

            public Array(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress);
                this.count = count;
            }

            public Array(VkPhysicalDeviceFeatures[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceFeatures.Pointer get(int i){
                return new VkPhysicalDeviceFeatures.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
