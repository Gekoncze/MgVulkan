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



    public VkBool32 getRobustBufferAccess() {
        return new VkBool32(getVkMemory(), getRobustBufferAccess(getVkAddress()));
    }

    
    public void setRobustBufferAccess(VkBool32 robustBufferAccess) {
        setRobustBufferAccess(getVkAddress(), robustBufferAccess != null ? robustBufferAccess.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRobustBufferAccessQ() {
        return getRobustBufferAccess().getValue();
    }

    public void setRobustBufferAccess(int robustBufferAccess) {
        getRobustBufferAccess().setValue(robustBufferAccess);
    }

    protected static native long getRobustBufferAccess(long address);
    protected static native void setRobustBufferAccess(long address, long robustBufferAccess);

    public VkBool32 getFullDrawIndexUint32() {
        return new VkBool32(getVkMemory(), getFullDrawIndexUint32(getVkAddress()));
    }

    
    public void setFullDrawIndexUint32(VkBool32 fullDrawIndexUint32) {
        setFullDrawIndexUint32(getVkAddress(), fullDrawIndexUint32 != null ? fullDrawIndexUint32.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFullDrawIndexUint32Q() {
        return getFullDrawIndexUint32().getValue();
    }

    public void setFullDrawIndexUint32(int fullDrawIndexUint32) {
        getFullDrawIndexUint32().setValue(fullDrawIndexUint32);
    }

    protected static native long getFullDrawIndexUint32(long address);
    protected static native void setFullDrawIndexUint32(long address, long fullDrawIndexUint32);

    public VkBool32 getImageCubeArray() {
        return new VkBool32(getVkMemory(), getImageCubeArray(getVkAddress()));
    }

    
    public void setImageCubeArray(VkBool32 imageCubeArray) {
        setImageCubeArray(getVkAddress(), imageCubeArray != null ? imageCubeArray.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageCubeArrayQ() {
        return getImageCubeArray().getValue();
    }

    public void setImageCubeArray(int imageCubeArray) {
        getImageCubeArray().setValue(imageCubeArray);
    }

    protected static native long getImageCubeArray(long address);
    protected static native void setImageCubeArray(long address, long imageCubeArray);

    public VkBool32 getIndependentBlend() {
        return new VkBool32(getVkMemory(), getIndependentBlend(getVkAddress()));
    }

    
    public void setIndependentBlend(VkBool32 independentBlend) {
        setIndependentBlend(getVkAddress(), independentBlend != null ? independentBlend.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getIndependentBlendQ() {
        return getIndependentBlend().getValue();
    }

    public void setIndependentBlend(int independentBlend) {
        getIndependentBlend().setValue(independentBlend);
    }

    protected static native long getIndependentBlend(long address);
    protected static native void setIndependentBlend(long address, long independentBlend);

    public VkBool32 getGeometryShader() {
        return new VkBool32(getVkMemory(), getGeometryShader(getVkAddress()));
    }

    
    public void setGeometryShader(VkBool32 geometryShader) {
        setGeometryShader(getVkAddress(), geometryShader != null ? geometryShader.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getGeometryShaderQ() {
        return getGeometryShader().getValue();
    }

    public void setGeometryShader(int geometryShader) {
        getGeometryShader().setValue(geometryShader);
    }

    protected static native long getGeometryShader(long address);
    protected static native void setGeometryShader(long address, long geometryShader);

    public VkBool32 getTessellationShader() {
        return new VkBool32(getVkMemory(), getTessellationShader(getVkAddress()));
    }

    
    public void setTessellationShader(VkBool32 tessellationShader) {
        setTessellationShader(getVkAddress(), tessellationShader != null ? tessellationShader.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTessellationShaderQ() {
        return getTessellationShader().getValue();
    }

    public void setTessellationShader(int tessellationShader) {
        getTessellationShader().setValue(tessellationShader);
    }

    protected static native long getTessellationShader(long address);
    protected static native void setTessellationShader(long address, long tessellationShader);

    public VkBool32 getSampleRateShading() {
        return new VkBool32(getVkMemory(), getSampleRateShading(getVkAddress()));
    }

    
    public void setSampleRateShading(VkBool32 sampleRateShading) {
        setSampleRateShading(getVkAddress(), sampleRateShading != null ? sampleRateShading.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleRateShadingQ() {
        return getSampleRateShading().getValue();
    }

    public void setSampleRateShading(int sampleRateShading) {
        getSampleRateShading().setValue(sampleRateShading);
    }

    protected static native long getSampleRateShading(long address);
    protected static native void setSampleRateShading(long address, long sampleRateShading);

    public VkBool32 getDualSrcBlend() {
        return new VkBool32(getVkMemory(), getDualSrcBlend(getVkAddress()));
    }

    
    public void setDualSrcBlend(VkBool32 dualSrcBlend) {
        setDualSrcBlend(getVkAddress(), dualSrcBlend != null ? dualSrcBlend.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDualSrcBlendQ() {
        return getDualSrcBlend().getValue();
    }

    public void setDualSrcBlend(int dualSrcBlend) {
        getDualSrcBlend().setValue(dualSrcBlend);
    }

    protected static native long getDualSrcBlend(long address);
    protected static native void setDualSrcBlend(long address, long dualSrcBlend);

    public VkBool32 getLogicOp() {
        return new VkBool32(getVkMemory(), getLogicOp(getVkAddress()));
    }

    
    public void setLogicOp(VkBool32 logicOp) {
        setLogicOp(getVkAddress(), logicOp != null ? logicOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLogicOpQ() {
        return getLogicOp().getValue();
    }

    public void setLogicOp(int logicOp) {
        getLogicOp().setValue(logicOp);
    }

    protected static native long getLogicOp(long address);
    protected static native void setLogicOp(long address, long logicOp);

    public VkBool32 getMultiDrawIndirect() {
        return new VkBool32(getVkMemory(), getMultiDrawIndirect(getVkAddress()));
    }

    
    public void setMultiDrawIndirect(VkBool32 multiDrawIndirect) {
        setMultiDrawIndirect(getVkAddress(), multiDrawIndirect != null ? multiDrawIndirect.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMultiDrawIndirectQ() {
        return getMultiDrawIndirect().getValue();
    }

    public void setMultiDrawIndirect(int multiDrawIndirect) {
        getMultiDrawIndirect().setValue(multiDrawIndirect);
    }

    protected static native long getMultiDrawIndirect(long address);
    protected static native void setMultiDrawIndirect(long address, long multiDrawIndirect);

    public VkBool32 getDrawIndirectFirstInstance() {
        return new VkBool32(getVkMemory(), getDrawIndirectFirstInstance(getVkAddress()));
    }

    
    public void setDrawIndirectFirstInstance(VkBool32 drawIndirectFirstInstance) {
        setDrawIndirectFirstInstance(getVkAddress(), drawIndirectFirstInstance != null ? drawIndirectFirstInstance.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDrawIndirectFirstInstanceQ() {
        return getDrawIndirectFirstInstance().getValue();
    }

    public void setDrawIndirectFirstInstance(int drawIndirectFirstInstance) {
        getDrawIndirectFirstInstance().setValue(drawIndirectFirstInstance);
    }

    protected static native long getDrawIndirectFirstInstance(long address);
    protected static native void setDrawIndirectFirstInstance(long address, long drawIndirectFirstInstance);

    public VkBool32 getDepthClamp() {
        return new VkBool32(getVkMemory(), getDepthClamp(getVkAddress()));
    }

    
    public void setDepthClamp(VkBool32 depthClamp) {
        setDepthClamp(getVkAddress(), depthClamp != null ? depthClamp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthClampQ() {
        return getDepthClamp().getValue();
    }

    public void setDepthClamp(int depthClamp) {
        getDepthClamp().setValue(depthClamp);
    }

    protected static native long getDepthClamp(long address);
    protected static native void setDepthClamp(long address, long depthClamp);

    public VkBool32 getDepthBiasClamp() {
        return new VkBool32(getVkMemory(), getDepthBiasClamp(getVkAddress()));
    }

    
    public void setDepthBiasClamp(VkBool32 depthBiasClamp) {
        setDepthBiasClamp(getVkAddress(), depthBiasClamp != null ? depthBiasClamp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthBiasClampQ() {
        return getDepthBiasClamp().getValue();
    }

    public void setDepthBiasClamp(int depthBiasClamp) {
        getDepthBiasClamp().setValue(depthBiasClamp);
    }

    protected static native long getDepthBiasClamp(long address);
    protected static native void setDepthBiasClamp(long address, long depthBiasClamp);

    public VkBool32 getFillModeNonSolid() {
        return new VkBool32(getVkMemory(), getFillModeNonSolid(getVkAddress()));
    }

    
    public void setFillModeNonSolid(VkBool32 fillModeNonSolid) {
        setFillModeNonSolid(getVkAddress(), fillModeNonSolid != null ? fillModeNonSolid.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFillModeNonSolidQ() {
        return getFillModeNonSolid().getValue();
    }

    public void setFillModeNonSolid(int fillModeNonSolid) {
        getFillModeNonSolid().setValue(fillModeNonSolid);
    }

    protected static native long getFillModeNonSolid(long address);
    protected static native void setFillModeNonSolid(long address, long fillModeNonSolid);

    public VkBool32 getDepthBounds() {
        return new VkBool32(getVkMemory(), getDepthBounds(getVkAddress()));
    }

    
    public void setDepthBounds(VkBool32 depthBounds) {
        setDepthBounds(getVkAddress(), depthBounds != null ? depthBounds.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthBoundsQ() {
        return getDepthBounds().getValue();
    }

    public void setDepthBounds(int depthBounds) {
        getDepthBounds().setValue(depthBounds);
    }

    protected static native long getDepthBounds(long address);
    protected static native void setDepthBounds(long address, long depthBounds);

    public VkBool32 getWideLines() {
        return new VkBool32(getVkMemory(), getWideLines(getVkAddress()));
    }

    
    public void setWideLines(VkBool32 wideLines) {
        setWideLines(getVkAddress(), wideLines != null ? wideLines.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWideLinesQ() {
        return getWideLines().getValue();
    }

    public void setWideLines(int wideLines) {
        getWideLines().setValue(wideLines);
    }

    protected static native long getWideLines(long address);
    protected static native void setWideLines(long address, long wideLines);

    public VkBool32 getLargePoints() {
        return new VkBool32(getVkMemory(), getLargePoints(getVkAddress()));
    }

    
    public void setLargePoints(VkBool32 largePoints) {
        setLargePoints(getVkAddress(), largePoints != null ? largePoints.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLargePointsQ() {
        return getLargePoints().getValue();
    }

    public void setLargePoints(int largePoints) {
        getLargePoints().setValue(largePoints);
    }

    protected static native long getLargePoints(long address);
    protected static native void setLargePoints(long address, long largePoints);

    public VkBool32 getAlphaToOne() {
        return new VkBool32(getVkMemory(), getAlphaToOne(getVkAddress()));
    }

    
    public void setAlphaToOne(VkBool32 alphaToOne) {
        setAlphaToOne(getVkAddress(), alphaToOne != null ? alphaToOne.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAlphaToOneQ() {
        return getAlphaToOne().getValue();
    }

    public void setAlphaToOne(int alphaToOne) {
        getAlphaToOne().setValue(alphaToOne);
    }

    protected static native long getAlphaToOne(long address);
    protected static native void setAlphaToOne(long address, long alphaToOne);

    public VkBool32 getMultiViewport() {
        return new VkBool32(getVkMemory(), getMultiViewport(getVkAddress()));
    }

    
    public void setMultiViewport(VkBool32 multiViewport) {
        setMultiViewport(getVkAddress(), multiViewport != null ? multiViewport.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMultiViewportQ() {
        return getMultiViewport().getValue();
    }

    public void setMultiViewport(int multiViewport) {
        getMultiViewport().setValue(multiViewport);
    }

    protected static native long getMultiViewport(long address);
    protected static native void setMultiViewport(long address, long multiViewport);

    public VkBool32 getSamplerAnisotropy() {
        return new VkBool32(getVkMemory(), getSamplerAnisotropy(getVkAddress()));
    }

    
    public void setSamplerAnisotropy(VkBool32 samplerAnisotropy) {
        setSamplerAnisotropy(getVkAddress(), samplerAnisotropy != null ? samplerAnisotropy.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSamplerAnisotropyQ() {
        return getSamplerAnisotropy().getValue();
    }

    public void setSamplerAnisotropy(int samplerAnisotropy) {
        getSamplerAnisotropy().setValue(samplerAnisotropy);
    }

    protected static native long getSamplerAnisotropy(long address);
    protected static native void setSamplerAnisotropy(long address, long samplerAnisotropy);

    public VkBool32 getTextureCompressionETC2() {
        return new VkBool32(getVkMemory(), getTextureCompressionETC2(getVkAddress()));
    }

    
    public void setTextureCompressionETC2(VkBool32 textureCompressionETC2) {
        setTextureCompressionETC2(getVkAddress(), textureCompressionETC2 != null ? textureCompressionETC2.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTextureCompressionETC2Q() {
        return getTextureCompressionETC2().getValue();
    }

    public void setTextureCompressionETC2(int textureCompressionETC2) {
        getTextureCompressionETC2().setValue(textureCompressionETC2);
    }

    protected static native long getTextureCompressionETC2(long address);
    protected static native void setTextureCompressionETC2(long address, long textureCompressionETC2);

    public VkBool32 getTextureCompressionASTC_LDR() {
        return new VkBool32(getVkMemory(), getTextureCompressionASTC_LDR(getVkAddress()));
    }

    
    public void setTextureCompressionASTC_LDR(VkBool32 textureCompressionASTC_LDR) {
        setTextureCompressionASTC_LDR(getVkAddress(), textureCompressionASTC_LDR != null ? textureCompressionASTC_LDR.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTextureCompressionASTC_LDRQ() {
        return getTextureCompressionASTC_LDR().getValue();
    }

    public void setTextureCompressionASTC_LDR(int textureCompressionASTC_LDR) {
        getTextureCompressionASTC_LDR().setValue(textureCompressionASTC_LDR);
    }

    protected static native long getTextureCompressionASTC_LDR(long address);
    protected static native void setTextureCompressionASTC_LDR(long address, long textureCompressionASTC_LDR);

    public VkBool32 getTextureCompressionBC() {
        return new VkBool32(getVkMemory(), getTextureCompressionBC(getVkAddress()));
    }

    
    public void setTextureCompressionBC(VkBool32 textureCompressionBC) {
        setTextureCompressionBC(getVkAddress(), textureCompressionBC != null ? textureCompressionBC.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTextureCompressionBCQ() {
        return getTextureCompressionBC().getValue();
    }

    public void setTextureCompressionBC(int textureCompressionBC) {
        getTextureCompressionBC().setValue(textureCompressionBC);
    }

    protected static native long getTextureCompressionBC(long address);
    protected static native void setTextureCompressionBC(long address, long textureCompressionBC);

    public VkBool32 getOcclusionQueryPrecise() {
        return new VkBool32(getVkMemory(), getOcclusionQueryPrecise(getVkAddress()));
    }

    
    public void setOcclusionQueryPrecise(VkBool32 occlusionQueryPrecise) {
        setOcclusionQueryPrecise(getVkAddress(), occlusionQueryPrecise != null ? occlusionQueryPrecise.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getOcclusionQueryPreciseQ() {
        return getOcclusionQueryPrecise().getValue();
    }

    public void setOcclusionQueryPrecise(int occlusionQueryPrecise) {
        getOcclusionQueryPrecise().setValue(occlusionQueryPrecise);
    }

    protected static native long getOcclusionQueryPrecise(long address);
    protected static native void setOcclusionQueryPrecise(long address, long occlusionQueryPrecise);

    public VkBool32 getPipelineStatisticsQuery() {
        return new VkBool32(getVkMemory(), getPipelineStatisticsQuery(getVkAddress()));
    }

    
    public void setPipelineStatisticsQuery(VkBool32 pipelineStatisticsQuery) {
        setPipelineStatisticsQuery(getVkAddress(), pipelineStatisticsQuery != null ? pipelineStatisticsQuery.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPipelineStatisticsQueryQ() {
        return getPipelineStatisticsQuery().getValue();
    }

    public void setPipelineStatisticsQuery(int pipelineStatisticsQuery) {
        getPipelineStatisticsQuery().setValue(pipelineStatisticsQuery);
    }

    protected static native long getPipelineStatisticsQuery(long address);
    protected static native void setPipelineStatisticsQuery(long address, long pipelineStatisticsQuery);

    public VkBool32 getVertexPipelineStoresAndAtomics() {
        return new VkBool32(getVkMemory(), getVertexPipelineStoresAndAtomics(getVkAddress()));
    }

    
    public void setVertexPipelineStoresAndAtomics(VkBool32 vertexPipelineStoresAndAtomics) {
        setVertexPipelineStoresAndAtomics(getVkAddress(), vertexPipelineStoresAndAtomics != null ? vertexPipelineStoresAndAtomics.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVertexPipelineStoresAndAtomicsQ() {
        return getVertexPipelineStoresAndAtomics().getValue();
    }

    public void setVertexPipelineStoresAndAtomics(int vertexPipelineStoresAndAtomics) {
        getVertexPipelineStoresAndAtomics().setValue(vertexPipelineStoresAndAtomics);
    }

    protected static native long getVertexPipelineStoresAndAtomics(long address);
    protected static native void setVertexPipelineStoresAndAtomics(long address, long vertexPipelineStoresAndAtomics);

    public VkBool32 getFragmentStoresAndAtomics() {
        return new VkBool32(getVkMemory(), getFragmentStoresAndAtomics(getVkAddress()));
    }

    
    public void setFragmentStoresAndAtomics(VkBool32 fragmentStoresAndAtomics) {
        setFragmentStoresAndAtomics(getVkAddress(), fragmentStoresAndAtomics != null ? fragmentStoresAndAtomics.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFragmentStoresAndAtomicsQ() {
        return getFragmentStoresAndAtomics().getValue();
    }

    public void setFragmentStoresAndAtomics(int fragmentStoresAndAtomics) {
        getFragmentStoresAndAtomics().setValue(fragmentStoresAndAtomics);
    }

    protected static native long getFragmentStoresAndAtomics(long address);
    protected static native void setFragmentStoresAndAtomics(long address, long fragmentStoresAndAtomics);

    public VkBool32 getShaderTessellationAndGeometryPointSize() {
        return new VkBool32(getVkMemory(), getShaderTessellationAndGeometryPointSize(getVkAddress()));
    }

    
    public void setShaderTessellationAndGeometryPointSize(VkBool32 shaderTessellationAndGeometryPointSize) {
        setShaderTessellationAndGeometryPointSize(getVkAddress(), shaderTessellationAndGeometryPointSize != null ? shaderTessellationAndGeometryPointSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderTessellationAndGeometryPointSizeQ() {
        return getShaderTessellationAndGeometryPointSize().getValue();
    }

    public void setShaderTessellationAndGeometryPointSize(int shaderTessellationAndGeometryPointSize) {
        getShaderTessellationAndGeometryPointSize().setValue(shaderTessellationAndGeometryPointSize);
    }

    protected static native long getShaderTessellationAndGeometryPointSize(long address);
    protected static native void setShaderTessellationAndGeometryPointSize(long address, long shaderTessellationAndGeometryPointSize);

    public VkBool32 getShaderImageGatherExtended() {
        return new VkBool32(getVkMemory(), getShaderImageGatherExtended(getVkAddress()));
    }

    
    public void setShaderImageGatherExtended(VkBool32 shaderImageGatherExtended) {
        setShaderImageGatherExtended(getVkAddress(), shaderImageGatherExtended != null ? shaderImageGatherExtended.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderImageGatherExtendedQ() {
        return getShaderImageGatherExtended().getValue();
    }

    public void setShaderImageGatherExtended(int shaderImageGatherExtended) {
        getShaderImageGatherExtended().setValue(shaderImageGatherExtended);
    }

    protected static native long getShaderImageGatherExtended(long address);
    protected static native void setShaderImageGatherExtended(long address, long shaderImageGatherExtended);

    public VkBool32 getShaderStorageImageExtendedFormats() {
        return new VkBool32(getVkMemory(), getShaderStorageImageExtendedFormats(getVkAddress()));
    }

    
    public void setShaderStorageImageExtendedFormats(VkBool32 shaderStorageImageExtendedFormats) {
        setShaderStorageImageExtendedFormats(getVkAddress(), shaderStorageImageExtendedFormats != null ? shaderStorageImageExtendedFormats.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageExtendedFormatsQ() {
        return getShaderStorageImageExtendedFormats().getValue();
    }

    public void setShaderStorageImageExtendedFormats(int shaderStorageImageExtendedFormats) {
        getShaderStorageImageExtendedFormats().setValue(shaderStorageImageExtendedFormats);
    }

    protected static native long getShaderStorageImageExtendedFormats(long address);
    protected static native void setShaderStorageImageExtendedFormats(long address, long shaderStorageImageExtendedFormats);

    public VkBool32 getShaderStorageImageMultisample() {
        return new VkBool32(getVkMemory(), getShaderStorageImageMultisample(getVkAddress()));
    }

    
    public void setShaderStorageImageMultisample(VkBool32 shaderStorageImageMultisample) {
        setShaderStorageImageMultisample(getVkAddress(), shaderStorageImageMultisample != null ? shaderStorageImageMultisample.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageMultisampleQ() {
        return getShaderStorageImageMultisample().getValue();
    }

    public void setShaderStorageImageMultisample(int shaderStorageImageMultisample) {
        getShaderStorageImageMultisample().setValue(shaderStorageImageMultisample);
    }

    protected static native long getShaderStorageImageMultisample(long address);
    protected static native void setShaderStorageImageMultisample(long address, long shaderStorageImageMultisample);

    public VkBool32 getShaderStorageImageReadWithoutFormat() {
        return new VkBool32(getVkMemory(), getShaderStorageImageReadWithoutFormat(getVkAddress()));
    }

    
    public void setShaderStorageImageReadWithoutFormat(VkBool32 shaderStorageImageReadWithoutFormat) {
        setShaderStorageImageReadWithoutFormat(getVkAddress(), shaderStorageImageReadWithoutFormat != null ? shaderStorageImageReadWithoutFormat.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageReadWithoutFormatQ() {
        return getShaderStorageImageReadWithoutFormat().getValue();
    }

    public void setShaderStorageImageReadWithoutFormat(int shaderStorageImageReadWithoutFormat) {
        getShaderStorageImageReadWithoutFormat().setValue(shaderStorageImageReadWithoutFormat);
    }

    protected static native long getShaderStorageImageReadWithoutFormat(long address);
    protected static native void setShaderStorageImageReadWithoutFormat(long address, long shaderStorageImageReadWithoutFormat);

    public VkBool32 getShaderStorageImageWriteWithoutFormat() {
        return new VkBool32(getVkMemory(), getShaderStorageImageWriteWithoutFormat(getVkAddress()));
    }

    
    public void setShaderStorageImageWriteWithoutFormat(VkBool32 shaderStorageImageWriteWithoutFormat) {
        setShaderStorageImageWriteWithoutFormat(getVkAddress(), shaderStorageImageWriteWithoutFormat != null ? shaderStorageImageWriteWithoutFormat.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageWriteWithoutFormatQ() {
        return getShaderStorageImageWriteWithoutFormat().getValue();
    }

    public void setShaderStorageImageWriteWithoutFormat(int shaderStorageImageWriteWithoutFormat) {
        getShaderStorageImageWriteWithoutFormat().setValue(shaderStorageImageWriteWithoutFormat);
    }

    protected static native long getShaderStorageImageWriteWithoutFormat(long address);
    protected static native void setShaderStorageImageWriteWithoutFormat(long address, long shaderStorageImageWriteWithoutFormat);

    public VkBool32 getShaderUniformBufferArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderUniformBufferArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderUniformBufferArrayDynamicIndexing(VkBool32 shaderUniformBufferArrayDynamicIndexing) {
        setShaderUniformBufferArrayDynamicIndexing(getVkAddress(), shaderUniformBufferArrayDynamicIndexing != null ? shaderUniformBufferArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderUniformBufferArrayDynamicIndexingQ() {
        return getShaderUniformBufferArrayDynamicIndexing().getValue();
    }

    public void setShaderUniformBufferArrayDynamicIndexing(int shaderUniformBufferArrayDynamicIndexing) {
        getShaderUniformBufferArrayDynamicIndexing().setValue(shaderUniformBufferArrayDynamicIndexing);
    }

    protected static native long getShaderUniformBufferArrayDynamicIndexing(long address);
    protected static native void setShaderUniformBufferArrayDynamicIndexing(long address, long shaderUniformBufferArrayDynamicIndexing);

    public VkBool32 getShaderSampledImageArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderSampledImageArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderSampledImageArrayDynamicIndexing(VkBool32 shaderSampledImageArrayDynamicIndexing) {
        setShaderSampledImageArrayDynamicIndexing(getVkAddress(), shaderSampledImageArrayDynamicIndexing != null ? shaderSampledImageArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderSampledImageArrayDynamicIndexingQ() {
        return getShaderSampledImageArrayDynamicIndexing().getValue();
    }

    public void setShaderSampledImageArrayDynamicIndexing(int shaderSampledImageArrayDynamicIndexing) {
        getShaderSampledImageArrayDynamicIndexing().setValue(shaderSampledImageArrayDynamicIndexing);
    }

    protected static native long getShaderSampledImageArrayDynamicIndexing(long address);
    protected static native void setShaderSampledImageArrayDynamicIndexing(long address, long shaderSampledImageArrayDynamicIndexing);

    public VkBool32 getShaderStorageBufferArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageBufferArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderStorageBufferArrayDynamicIndexing(VkBool32 shaderStorageBufferArrayDynamicIndexing) {
        setShaderStorageBufferArrayDynamicIndexing(getVkAddress(), shaderStorageBufferArrayDynamicIndexing != null ? shaderStorageBufferArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageBufferArrayDynamicIndexingQ() {
        return getShaderStorageBufferArrayDynamicIndexing().getValue();
    }

    public void setShaderStorageBufferArrayDynamicIndexing(int shaderStorageBufferArrayDynamicIndexing) {
        getShaderStorageBufferArrayDynamicIndexing().setValue(shaderStorageBufferArrayDynamicIndexing);
    }

    protected static native long getShaderStorageBufferArrayDynamicIndexing(long address);
    protected static native void setShaderStorageBufferArrayDynamicIndexing(long address, long shaderStorageBufferArrayDynamicIndexing);

    public VkBool32 getShaderStorageImageArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageImageArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderStorageImageArrayDynamicIndexing(VkBool32 shaderStorageImageArrayDynamicIndexing) {
        setShaderStorageImageArrayDynamicIndexing(getVkAddress(), shaderStorageImageArrayDynamicIndexing != null ? shaderStorageImageArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageArrayDynamicIndexingQ() {
        return getShaderStorageImageArrayDynamicIndexing().getValue();
    }

    public void setShaderStorageImageArrayDynamicIndexing(int shaderStorageImageArrayDynamicIndexing) {
        getShaderStorageImageArrayDynamicIndexing().setValue(shaderStorageImageArrayDynamicIndexing);
    }

    protected static native long getShaderStorageImageArrayDynamicIndexing(long address);
    protected static native void setShaderStorageImageArrayDynamicIndexing(long address, long shaderStorageImageArrayDynamicIndexing);

    public VkBool32 getShaderClipDistance() {
        return new VkBool32(getVkMemory(), getShaderClipDistance(getVkAddress()));
    }

    
    public void setShaderClipDistance(VkBool32 shaderClipDistance) {
        setShaderClipDistance(getVkAddress(), shaderClipDistance != null ? shaderClipDistance.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderClipDistanceQ() {
        return getShaderClipDistance().getValue();
    }

    public void setShaderClipDistance(int shaderClipDistance) {
        getShaderClipDistance().setValue(shaderClipDistance);
    }

    protected static native long getShaderClipDistance(long address);
    protected static native void setShaderClipDistance(long address, long shaderClipDistance);

    public VkBool32 getShaderCullDistance() {
        return new VkBool32(getVkMemory(), getShaderCullDistance(getVkAddress()));
    }

    
    public void setShaderCullDistance(VkBool32 shaderCullDistance) {
        setShaderCullDistance(getVkAddress(), shaderCullDistance != null ? shaderCullDistance.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderCullDistanceQ() {
        return getShaderCullDistance().getValue();
    }

    public void setShaderCullDistance(int shaderCullDistance) {
        getShaderCullDistance().setValue(shaderCullDistance);
    }

    protected static native long getShaderCullDistance(long address);
    protected static native void setShaderCullDistance(long address, long shaderCullDistance);

    public VkBool32 getShaderFloat64() {
        return new VkBool32(getVkMemory(), getShaderFloat64(getVkAddress()));
    }

    
    public void setShaderFloat64(VkBool32 shaderFloat64) {
        setShaderFloat64(getVkAddress(), shaderFloat64 != null ? shaderFloat64.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderFloat64Q() {
        return getShaderFloat64().getValue();
    }

    public void setShaderFloat64(int shaderFloat64) {
        getShaderFloat64().setValue(shaderFloat64);
    }

    protected static native long getShaderFloat64(long address);
    protected static native void setShaderFloat64(long address, long shaderFloat64);

    public VkBool32 getShaderInt64() {
        return new VkBool32(getVkMemory(), getShaderInt64(getVkAddress()));
    }

    
    public void setShaderInt64(VkBool32 shaderInt64) {
        setShaderInt64(getVkAddress(), shaderInt64 != null ? shaderInt64.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderInt64Q() {
        return getShaderInt64().getValue();
    }

    public void setShaderInt64(int shaderInt64) {
        getShaderInt64().setValue(shaderInt64);
    }

    protected static native long getShaderInt64(long address);
    protected static native void setShaderInt64(long address, long shaderInt64);

    public VkBool32 getShaderInt16() {
        return new VkBool32(getVkMemory(), getShaderInt16(getVkAddress()));
    }

    
    public void setShaderInt16(VkBool32 shaderInt16) {
        setShaderInt16(getVkAddress(), shaderInt16 != null ? shaderInt16.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderInt16Q() {
        return getShaderInt16().getValue();
    }

    public void setShaderInt16(int shaderInt16) {
        getShaderInt16().setValue(shaderInt16);
    }

    protected static native long getShaderInt16(long address);
    protected static native void setShaderInt16(long address, long shaderInt16);

    public VkBool32 getShaderResourceResidency() {
        return new VkBool32(getVkMemory(), getShaderResourceResidency(getVkAddress()));
    }

    
    public void setShaderResourceResidency(VkBool32 shaderResourceResidency) {
        setShaderResourceResidency(getVkAddress(), shaderResourceResidency != null ? shaderResourceResidency.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderResourceResidencyQ() {
        return getShaderResourceResidency().getValue();
    }

    public void setShaderResourceResidency(int shaderResourceResidency) {
        getShaderResourceResidency().setValue(shaderResourceResidency);
    }

    protected static native long getShaderResourceResidency(long address);
    protected static native void setShaderResourceResidency(long address, long shaderResourceResidency);

    public VkBool32 getShaderResourceMinLod() {
        return new VkBool32(getVkMemory(), getShaderResourceMinLod(getVkAddress()));
    }

    
    public void setShaderResourceMinLod(VkBool32 shaderResourceMinLod) {
        setShaderResourceMinLod(getVkAddress(), shaderResourceMinLod != null ? shaderResourceMinLod.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderResourceMinLodQ() {
        return getShaderResourceMinLod().getValue();
    }

    public void setShaderResourceMinLod(int shaderResourceMinLod) {
        getShaderResourceMinLod().setValue(shaderResourceMinLod);
    }

    protected static native long getShaderResourceMinLod(long address);
    protected static native void setShaderResourceMinLod(long address, long shaderResourceMinLod);

    public VkBool32 getSparseBinding() {
        return new VkBool32(getVkMemory(), getSparseBinding(getVkAddress()));
    }

    
    public void setSparseBinding(VkBool32 sparseBinding) {
        setSparseBinding(getVkAddress(), sparseBinding != null ? sparseBinding.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseBindingQ() {
        return getSparseBinding().getValue();
    }

    public void setSparseBinding(int sparseBinding) {
        getSparseBinding().setValue(sparseBinding);
    }

    protected static native long getSparseBinding(long address);
    protected static native void setSparseBinding(long address, long sparseBinding);

    public VkBool32 getSparseResidencyBuffer() {
        return new VkBool32(getVkMemory(), getSparseResidencyBuffer(getVkAddress()));
    }

    
    public void setSparseResidencyBuffer(VkBool32 sparseResidencyBuffer) {
        setSparseResidencyBuffer(getVkAddress(), sparseResidencyBuffer != null ? sparseResidencyBuffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidencyBufferQ() {
        return getSparseResidencyBuffer().getValue();
    }

    public void setSparseResidencyBuffer(int sparseResidencyBuffer) {
        getSparseResidencyBuffer().setValue(sparseResidencyBuffer);
    }

    protected static native long getSparseResidencyBuffer(long address);
    protected static native void setSparseResidencyBuffer(long address, long sparseResidencyBuffer);

    public VkBool32 getSparseResidencyImage2D() {
        return new VkBool32(getVkMemory(), getSparseResidencyImage2D(getVkAddress()));
    }

    
    public void setSparseResidencyImage2D(VkBool32 sparseResidencyImage2D) {
        setSparseResidencyImage2D(getVkAddress(), sparseResidencyImage2D != null ? sparseResidencyImage2D.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidencyImage2DQ() {
        return getSparseResidencyImage2D().getValue();
    }

    public void setSparseResidencyImage2D(int sparseResidencyImage2D) {
        getSparseResidencyImage2D().setValue(sparseResidencyImage2D);
    }

    protected static native long getSparseResidencyImage2D(long address);
    protected static native void setSparseResidencyImage2D(long address, long sparseResidencyImage2D);

    public VkBool32 getSparseResidencyImage3D() {
        return new VkBool32(getVkMemory(), getSparseResidencyImage3D(getVkAddress()));
    }

    
    public void setSparseResidencyImage3D(VkBool32 sparseResidencyImage3D) {
        setSparseResidencyImage3D(getVkAddress(), sparseResidencyImage3D != null ? sparseResidencyImage3D.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidencyImage3DQ() {
        return getSparseResidencyImage3D().getValue();
    }

    public void setSparseResidencyImage3D(int sparseResidencyImage3D) {
        getSparseResidencyImage3D().setValue(sparseResidencyImage3D);
    }

    protected static native long getSparseResidencyImage3D(long address);
    protected static native void setSparseResidencyImage3D(long address, long sparseResidencyImage3D);

    public VkBool32 getSparseResidency2Samples() {
        return new VkBool32(getVkMemory(), getSparseResidency2Samples(getVkAddress()));
    }

    
    public void setSparseResidency2Samples(VkBool32 sparseResidency2Samples) {
        setSparseResidency2Samples(getVkAddress(), sparseResidency2Samples != null ? sparseResidency2Samples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidency2SamplesQ() {
        return getSparseResidency2Samples().getValue();
    }

    public void setSparseResidency2Samples(int sparseResidency2Samples) {
        getSparseResidency2Samples().setValue(sparseResidency2Samples);
    }

    protected static native long getSparseResidency2Samples(long address);
    protected static native void setSparseResidency2Samples(long address, long sparseResidency2Samples);

    public VkBool32 getSparseResidency4Samples() {
        return new VkBool32(getVkMemory(), getSparseResidency4Samples(getVkAddress()));
    }

    
    public void setSparseResidency4Samples(VkBool32 sparseResidency4Samples) {
        setSparseResidency4Samples(getVkAddress(), sparseResidency4Samples != null ? sparseResidency4Samples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidency4SamplesQ() {
        return getSparseResidency4Samples().getValue();
    }

    public void setSparseResidency4Samples(int sparseResidency4Samples) {
        getSparseResidency4Samples().setValue(sparseResidency4Samples);
    }

    protected static native long getSparseResidency4Samples(long address);
    protected static native void setSparseResidency4Samples(long address, long sparseResidency4Samples);

    public VkBool32 getSparseResidency8Samples() {
        return new VkBool32(getVkMemory(), getSparseResidency8Samples(getVkAddress()));
    }

    
    public void setSparseResidency8Samples(VkBool32 sparseResidency8Samples) {
        setSparseResidency8Samples(getVkAddress(), sparseResidency8Samples != null ? sparseResidency8Samples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidency8SamplesQ() {
        return getSparseResidency8Samples().getValue();
    }

    public void setSparseResidency8Samples(int sparseResidency8Samples) {
        getSparseResidency8Samples().setValue(sparseResidency8Samples);
    }

    protected static native long getSparseResidency8Samples(long address);
    protected static native void setSparseResidency8Samples(long address, long sparseResidency8Samples);

    public VkBool32 getSparseResidency16Samples() {
        return new VkBool32(getVkMemory(), getSparseResidency16Samples(getVkAddress()));
    }

    
    public void setSparseResidency16Samples(VkBool32 sparseResidency16Samples) {
        setSparseResidency16Samples(getVkAddress(), sparseResidency16Samples != null ? sparseResidency16Samples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidency16SamplesQ() {
        return getSparseResidency16Samples().getValue();
    }

    public void setSparseResidency16Samples(int sparseResidency16Samples) {
        getSparseResidency16Samples().setValue(sparseResidency16Samples);
    }

    protected static native long getSparseResidency16Samples(long address);
    protected static native void setSparseResidency16Samples(long address, long sparseResidency16Samples);

    public VkBool32 getSparseResidencyAliased() {
        return new VkBool32(getVkMemory(), getSparseResidencyAliased(getVkAddress()));
    }

    
    public void setSparseResidencyAliased(VkBool32 sparseResidencyAliased) {
        setSparseResidencyAliased(getVkAddress(), sparseResidencyAliased != null ? sparseResidencyAliased.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidencyAliasedQ() {
        return getSparseResidencyAliased().getValue();
    }

    public void setSparseResidencyAliased(int sparseResidencyAliased) {
        getSparseResidencyAliased().setValue(sparseResidencyAliased);
    }

    protected static native long getSparseResidencyAliased(long address);
    protected static native void setSparseResidencyAliased(long address, long sparseResidencyAliased);

    public VkBool32 getVariableMultisampleRate() {
        return new VkBool32(getVkMemory(), getVariableMultisampleRate(getVkAddress()));
    }

    
    public void setVariableMultisampleRate(VkBool32 variableMultisampleRate) {
        setVariableMultisampleRate(getVkAddress(), variableMultisampleRate != null ? variableMultisampleRate.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVariableMultisampleRateQ() {
        return getVariableMultisampleRate().getValue();
    }

    public void setVariableMultisampleRate(int variableMultisampleRate) {
        getVariableMultisampleRate().setValue(variableMultisampleRate);
    }

    protected static native long getVariableMultisampleRate(long address);
    protected static native void setVariableMultisampleRate(long address, long variableMultisampleRate);

    public VkBool32 getInheritedQueries() {
        return new VkBool32(getVkMemory(), getInheritedQueries(getVkAddress()));
    }

    
    public void setInheritedQueries(VkBool32 inheritedQueries) {
        setInheritedQueries(getVkAddress(), inheritedQueries != null ? inheritedQueries.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInheritedQueriesQ() {
        return getInheritedQueries().getValue();
    }

    public void setInheritedQueries(int inheritedQueries) {
        getInheritedQueries().setValue(inheritedQueries);
    }

    protected static native long getInheritedQueries(long address);
    protected static native void setInheritedQueries(long address, long inheritedQueries);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceFeatures> {
        private final int count;

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
            return new VkPhysicalDeviceFeatures(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
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

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceFeatures.Pointer get(int i){
                return new VkPhysicalDeviceFeatures.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
