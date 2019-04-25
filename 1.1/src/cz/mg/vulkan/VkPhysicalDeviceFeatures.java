package cz.mg.vulkan;

public class VkPhysicalDeviceFeatures extends VkObject {
    public VkPhysicalDeviceFeatures() {
        super(sizeof());
    }

    protected VkPhysicalDeviceFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceFeatures(VkPointer pointer) {
        super(pointer);
    }



    public VkBool32 getRobustBufferAccess() {
        return new VkBool32(getVkMemory(), getRobustBufferAccessNative(getVkAddress()));
    }

    
    public void setRobustBufferAccess(VkBool32 robustBufferAccess) {
        setRobustBufferAccessNative(getVkAddress(), robustBufferAccess != null ? robustBufferAccess.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRobustBufferAccessQ() {
        return getRobustBufferAccess().getValue();
    }

    public void setRobustBufferAccess(int robustBufferAccess) {
        getRobustBufferAccess().setValue(robustBufferAccess);
    }

    protected static native long getRobustBufferAccessNative(long address);
    protected static native void setRobustBufferAccessNative(long address, long robustBufferAccess);

    public VkBool32 getFullDrawIndexUint32() {
        return new VkBool32(getVkMemory(), getFullDrawIndexUint32Native(getVkAddress()));
    }

    
    public void setFullDrawIndexUint32(VkBool32 fullDrawIndexUint32) {
        setFullDrawIndexUint32Native(getVkAddress(), fullDrawIndexUint32 != null ? fullDrawIndexUint32.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFullDrawIndexUint32Q() {
        return getFullDrawIndexUint32().getValue();
    }

    public void setFullDrawIndexUint32(int fullDrawIndexUint32) {
        getFullDrawIndexUint32().setValue(fullDrawIndexUint32);
    }

    protected static native long getFullDrawIndexUint32Native(long address);
    protected static native void setFullDrawIndexUint32Native(long address, long fullDrawIndexUint32);

    public VkBool32 getImageCubeArray() {
        return new VkBool32(getVkMemory(), getImageCubeArrayNative(getVkAddress()));
    }

    
    public void setImageCubeArray(VkBool32 imageCubeArray) {
        setImageCubeArrayNative(getVkAddress(), imageCubeArray != null ? imageCubeArray.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageCubeArrayQ() {
        return getImageCubeArray().getValue();
    }

    public void setImageCubeArray(int imageCubeArray) {
        getImageCubeArray().setValue(imageCubeArray);
    }

    protected static native long getImageCubeArrayNative(long address);
    protected static native void setImageCubeArrayNative(long address, long imageCubeArray);

    public VkBool32 getIndependentBlend() {
        return new VkBool32(getVkMemory(), getIndependentBlendNative(getVkAddress()));
    }

    
    public void setIndependentBlend(VkBool32 independentBlend) {
        setIndependentBlendNative(getVkAddress(), independentBlend != null ? independentBlend.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getIndependentBlendQ() {
        return getIndependentBlend().getValue();
    }

    public void setIndependentBlend(int independentBlend) {
        getIndependentBlend().setValue(independentBlend);
    }

    protected static native long getIndependentBlendNative(long address);
    protected static native void setIndependentBlendNative(long address, long independentBlend);

    public VkBool32 getGeometryShader() {
        return new VkBool32(getVkMemory(), getGeometryShaderNative(getVkAddress()));
    }

    
    public void setGeometryShader(VkBool32 geometryShader) {
        setGeometryShaderNative(getVkAddress(), geometryShader != null ? geometryShader.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getGeometryShaderQ() {
        return getGeometryShader().getValue();
    }

    public void setGeometryShader(int geometryShader) {
        getGeometryShader().setValue(geometryShader);
    }

    protected static native long getGeometryShaderNative(long address);
    protected static native void setGeometryShaderNative(long address, long geometryShader);

    public VkBool32 getTessellationShader() {
        return new VkBool32(getVkMemory(), getTessellationShaderNative(getVkAddress()));
    }

    
    public void setTessellationShader(VkBool32 tessellationShader) {
        setTessellationShaderNative(getVkAddress(), tessellationShader != null ? tessellationShader.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTessellationShaderQ() {
        return getTessellationShader().getValue();
    }

    public void setTessellationShader(int tessellationShader) {
        getTessellationShader().setValue(tessellationShader);
    }

    protected static native long getTessellationShaderNative(long address);
    protected static native void setTessellationShaderNative(long address, long tessellationShader);

    public VkBool32 getSampleRateShading() {
        return new VkBool32(getVkMemory(), getSampleRateShadingNative(getVkAddress()));
    }

    
    public void setSampleRateShading(VkBool32 sampleRateShading) {
        setSampleRateShadingNative(getVkAddress(), sampleRateShading != null ? sampleRateShading.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleRateShadingQ() {
        return getSampleRateShading().getValue();
    }

    public void setSampleRateShading(int sampleRateShading) {
        getSampleRateShading().setValue(sampleRateShading);
    }

    protected static native long getSampleRateShadingNative(long address);
    protected static native void setSampleRateShadingNative(long address, long sampleRateShading);

    public VkBool32 getDualSrcBlend() {
        return new VkBool32(getVkMemory(), getDualSrcBlendNative(getVkAddress()));
    }

    
    public void setDualSrcBlend(VkBool32 dualSrcBlend) {
        setDualSrcBlendNative(getVkAddress(), dualSrcBlend != null ? dualSrcBlend.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDualSrcBlendQ() {
        return getDualSrcBlend().getValue();
    }

    public void setDualSrcBlend(int dualSrcBlend) {
        getDualSrcBlend().setValue(dualSrcBlend);
    }

    protected static native long getDualSrcBlendNative(long address);
    protected static native void setDualSrcBlendNative(long address, long dualSrcBlend);

    public VkBool32 getLogicOp() {
        return new VkBool32(getVkMemory(), getLogicOpNative(getVkAddress()));
    }

    
    public void setLogicOp(VkBool32 logicOp) {
        setLogicOpNative(getVkAddress(), logicOp != null ? logicOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLogicOpQ() {
        return getLogicOp().getValue();
    }

    public void setLogicOp(int logicOp) {
        getLogicOp().setValue(logicOp);
    }

    protected static native long getLogicOpNative(long address);
    protected static native void setLogicOpNative(long address, long logicOp);

    public VkBool32 getMultiDrawIndirect() {
        return new VkBool32(getVkMemory(), getMultiDrawIndirectNative(getVkAddress()));
    }

    
    public void setMultiDrawIndirect(VkBool32 multiDrawIndirect) {
        setMultiDrawIndirectNative(getVkAddress(), multiDrawIndirect != null ? multiDrawIndirect.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMultiDrawIndirectQ() {
        return getMultiDrawIndirect().getValue();
    }

    public void setMultiDrawIndirect(int multiDrawIndirect) {
        getMultiDrawIndirect().setValue(multiDrawIndirect);
    }

    protected static native long getMultiDrawIndirectNative(long address);
    protected static native void setMultiDrawIndirectNative(long address, long multiDrawIndirect);

    public VkBool32 getDrawIndirectFirstInstance() {
        return new VkBool32(getVkMemory(), getDrawIndirectFirstInstanceNative(getVkAddress()));
    }

    
    public void setDrawIndirectFirstInstance(VkBool32 drawIndirectFirstInstance) {
        setDrawIndirectFirstInstanceNative(getVkAddress(), drawIndirectFirstInstance != null ? drawIndirectFirstInstance.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDrawIndirectFirstInstanceQ() {
        return getDrawIndirectFirstInstance().getValue();
    }

    public void setDrawIndirectFirstInstance(int drawIndirectFirstInstance) {
        getDrawIndirectFirstInstance().setValue(drawIndirectFirstInstance);
    }

    protected static native long getDrawIndirectFirstInstanceNative(long address);
    protected static native void setDrawIndirectFirstInstanceNative(long address, long drawIndirectFirstInstance);

    public VkBool32 getDepthClamp() {
        return new VkBool32(getVkMemory(), getDepthClampNative(getVkAddress()));
    }

    
    public void setDepthClamp(VkBool32 depthClamp) {
        setDepthClampNative(getVkAddress(), depthClamp != null ? depthClamp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthClampQ() {
        return getDepthClamp().getValue();
    }

    public void setDepthClamp(int depthClamp) {
        getDepthClamp().setValue(depthClamp);
    }

    protected static native long getDepthClampNative(long address);
    protected static native void setDepthClampNative(long address, long depthClamp);

    public VkBool32 getDepthBiasClamp() {
        return new VkBool32(getVkMemory(), getDepthBiasClampNative(getVkAddress()));
    }

    
    public void setDepthBiasClamp(VkBool32 depthBiasClamp) {
        setDepthBiasClampNative(getVkAddress(), depthBiasClamp != null ? depthBiasClamp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthBiasClampQ() {
        return getDepthBiasClamp().getValue();
    }

    public void setDepthBiasClamp(int depthBiasClamp) {
        getDepthBiasClamp().setValue(depthBiasClamp);
    }

    protected static native long getDepthBiasClampNative(long address);
    protected static native void setDepthBiasClampNative(long address, long depthBiasClamp);

    public VkBool32 getFillModeNonSolid() {
        return new VkBool32(getVkMemory(), getFillModeNonSolidNative(getVkAddress()));
    }

    
    public void setFillModeNonSolid(VkBool32 fillModeNonSolid) {
        setFillModeNonSolidNative(getVkAddress(), fillModeNonSolid != null ? fillModeNonSolid.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFillModeNonSolidQ() {
        return getFillModeNonSolid().getValue();
    }

    public void setFillModeNonSolid(int fillModeNonSolid) {
        getFillModeNonSolid().setValue(fillModeNonSolid);
    }

    protected static native long getFillModeNonSolidNative(long address);
    protected static native void setFillModeNonSolidNative(long address, long fillModeNonSolid);

    public VkBool32 getDepthBounds() {
        return new VkBool32(getVkMemory(), getDepthBoundsNative(getVkAddress()));
    }

    
    public void setDepthBounds(VkBool32 depthBounds) {
        setDepthBoundsNative(getVkAddress(), depthBounds != null ? depthBounds.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthBoundsQ() {
        return getDepthBounds().getValue();
    }

    public void setDepthBounds(int depthBounds) {
        getDepthBounds().setValue(depthBounds);
    }

    protected static native long getDepthBoundsNative(long address);
    protected static native void setDepthBoundsNative(long address, long depthBounds);

    public VkBool32 getWideLines() {
        return new VkBool32(getVkMemory(), getWideLinesNative(getVkAddress()));
    }

    
    public void setWideLines(VkBool32 wideLines) {
        setWideLinesNative(getVkAddress(), wideLines != null ? wideLines.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWideLinesQ() {
        return getWideLines().getValue();
    }

    public void setWideLines(int wideLines) {
        getWideLines().setValue(wideLines);
    }

    protected static native long getWideLinesNative(long address);
    protected static native void setWideLinesNative(long address, long wideLines);

    public VkBool32 getLargePoints() {
        return new VkBool32(getVkMemory(), getLargePointsNative(getVkAddress()));
    }

    
    public void setLargePoints(VkBool32 largePoints) {
        setLargePointsNative(getVkAddress(), largePoints != null ? largePoints.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLargePointsQ() {
        return getLargePoints().getValue();
    }

    public void setLargePoints(int largePoints) {
        getLargePoints().setValue(largePoints);
    }

    protected static native long getLargePointsNative(long address);
    protected static native void setLargePointsNative(long address, long largePoints);

    public VkBool32 getAlphaToOne() {
        return new VkBool32(getVkMemory(), getAlphaToOneNative(getVkAddress()));
    }

    
    public void setAlphaToOne(VkBool32 alphaToOne) {
        setAlphaToOneNative(getVkAddress(), alphaToOne != null ? alphaToOne.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAlphaToOneQ() {
        return getAlphaToOne().getValue();
    }

    public void setAlphaToOne(int alphaToOne) {
        getAlphaToOne().setValue(alphaToOne);
    }

    protected static native long getAlphaToOneNative(long address);
    protected static native void setAlphaToOneNative(long address, long alphaToOne);

    public VkBool32 getMultiViewport() {
        return new VkBool32(getVkMemory(), getMultiViewportNative(getVkAddress()));
    }

    
    public void setMultiViewport(VkBool32 multiViewport) {
        setMultiViewportNative(getVkAddress(), multiViewport != null ? multiViewport.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMultiViewportQ() {
        return getMultiViewport().getValue();
    }

    public void setMultiViewport(int multiViewport) {
        getMultiViewport().setValue(multiViewport);
    }

    protected static native long getMultiViewportNative(long address);
    protected static native void setMultiViewportNative(long address, long multiViewport);

    public VkBool32 getSamplerAnisotropy() {
        return new VkBool32(getVkMemory(), getSamplerAnisotropyNative(getVkAddress()));
    }

    
    public void setSamplerAnisotropy(VkBool32 samplerAnisotropy) {
        setSamplerAnisotropyNative(getVkAddress(), samplerAnisotropy != null ? samplerAnisotropy.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSamplerAnisotropyQ() {
        return getSamplerAnisotropy().getValue();
    }

    public void setSamplerAnisotropy(int samplerAnisotropy) {
        getSamplerAnisotropy().setValue(samplerAnisotropy);
    }

    protected static native long getSamplerAnisotropyNative(long address);
    protected static native void setSamplerAnisotropyNative(long address, long samplerAnisotropy);

    public VkBool32 getTextureCompressionETC2() {
        return new VkBool32(getVkMemory(), getTextureCompressionETC2Native(getVkAddress()));
    }

    
    public void setTextureCompressionETC2(VkBool32 textureCompressionETC2) {
        setTextureCompressionETC2Native(getVkAddress(), textureCompressionETC2 != null ? textureCompressionETC2.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTextureCompressionETC2Q() {
        return getTextureCompressionETC2().getValue();
    }

    public void setTextureCompressionETC2(int textureCompressionETC2) {
        getTextureCompressionETC2().setValue(textureCompressionETC2);
    }

    protected static native long getTextureCompressionETC2Native(long address);
    protected static native void setTextureCompressionETC2Native(long address, long textureCompressionETC2);

    public VkBool32 getTextureCompressionASTC_LDR() {
        return new VkBool32(getVkMemory(), getTextureCompressionASTC_LDRNative(getVkAddress()));
    }

    
    public void setTextureCompressionASTC_LDR(VkBool32 textureCompressionASTC_LDR) {
        setTextureCompressionASTC_LDRNative(getVkAddress(), textureCompressionASTC_LDR != null ? textureCompressionASTC_LDR.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTextureCompressionASTC_LDRQ() {
        return getTextureCompressionASTC_LDR().getValue();
    }

    public void setTextureCompressionASTC_LDR(int textureCompressionASTC_LDR) {
        getTextureCompressionASTC_LDR().setValue(textureCompressionASTC_LDR);
    }

    protected static native long getTextureCompressionASTC_LDRNative(long address);
    protected static native void setTextureCompressionASTC_LDRNative(long address, long textureCompressionASTC_LDR);

    public VkBool32 getTextureCompressionBC() {
        return new VkBool32(getVkMemory(), getTextureCompressionBCNative(getVkAddress()));
    }

    
    public void setTextureCompressionBC(VkBool32 textureCompressionBC) {
        setTextureCompressionBCNative(getVkAddress(), textureCompressionBC != null ? textureCompressionBC.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTextureCompressionBCQ() {
        return getTextureCompressionBC().getValue();
    }

    public void setTextureCompressionBC(int textureCompressionBC) {
        getTextureCompressionBC().setValue(textureCompressionBC);
    }

    protected static native long getTextureCompressionBCNative(long address);
    protected static native void setTextureCompressionBCNative(long address, long textureCompressionBC);

    public VkBool32 getOcclusionQueryPrecise() {
        return new VkBool32(getVkMemory(), getOcclusionQueryPreciseNative(getVkAddress()));
    }

    
    public void setOcclusionQueryPrecise(VkBool32 occlusionQueryPrecise) {
        setOcclusionQueryPreciseNative(getVkAddress(), occlusionQueryPrecise != null ? occlusionQueryPrecise.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getOcclusionQueryPreciseQ() {
        return getOcclusionQueryPrecise().getValue();
    }

    public void setOcclusionQueryPrecise(int occlusionQueryPrecise) {
        getOcclusionQueryPrecise().setValue(occlusionQueryPrecise);
    }

    protected static native long getOcclusionQueryPreciseNative(long address);
    protected static native void setOcclusionQueryPreciseNative(long address, long occlusionQueryPrecise);

    public VkBool32 getPipelineStatisticsQuery() {
        return new VkBool32(getVkMemory(), getPipelineStatisticsQueryNative(getVkAddress()));
    }

    
    public void setPipelineStatisticsQuery(VkBool32 pipelineStatisticsQuery) {
        setPipelineStatisticsQueryNative(getVkAddress(), pipelineStatisticsQuery != null ? pipelineStatisticsQuery.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPipelineStatisticsQueryQ() {
        return getPipelineStatisticsQuery().getValue();
    }

    public void setPipelineStatisticsQuery(int pipelineStatisticsQuery) {
        getPipelineStatisticsQuery().setValue(pipelineStatisticsQuery);
    }

    protected static native long getPipelineStatisticsQueryNative(long address);
    protected static native void setPipelineStatisticsQueryNative(long address, long pipelineStatisticsQuery);

    public VkBool32 getVertexPipelineStoresAndAtomics() {
        return new VkBool32(getVkMemory(), getVertexPipelineStoresAndAtomicsNative(getVkAddress()));
    }

    
    public void setVertexPipelineStoresAndAtomics(VkBool32 vertexPipelineStoresAndAtomics) {
        setVertexPipelineStoresAndAtomicsNative(getVkAddress(), vertexPipelineStoresAndAtomics != null ? vertexPipelineStoresAndAtomics.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVertexPipelineStoresAndAtomicsQ() {
        return getVertexPipelineStoresAndAtomics().getValue();
    }

    public void setVertexPipelineStoresAndAtomics(int vertexPipelineStoresAndAtomics) {
        getVertexPipelineStoresAndAtomics().setValue(vertexPipelineStoresAndAtomics);
    }

    protected static native long getVertexPipelineStoresAndAtomicsNative(long address);
    protected static native void setVertexPipelineStoresAndAtomicsNative(long address, long vertexPipelineStoresAndAtomics);

    public VkBool32 getFragmentStoresAndAtomics() {
        return new VkBool32(getVkMemory(), getFragmentStoresAndAtomicsNative(getVkAddress()));
    }

    
    public void setFragmentStoresAndAtomics(VkBool32 fragmentStoresAndAtomics) {
        setFragmentStoresAndAtomicsNative(getVkAddress(), fragmentStoresAndAtomics != null ? fragmentStoresAndAtomics.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFragmentStoresAndAtomicsQ() {
        return getFragmentStoresAndAtomics().getValue();
    }

    public void setFragmentStoresAndAtomics(int fragmentStoresAndAtomics) {
        getFragmentStoresAndAtomics().setValue(fragmentStoresAndAtomics);
    }

    protected static native long getFragmentStoresAndAtomicsNative(long address);
    protected static native void setFragmentStoresAndAtomicsNative(long address, long fragmentStoresAndAtomics);

    public VkBool32 getShaderTessellationAndGeometryPointSize() {
        return new VkBool32(getVkMemory(), getShaderTessellationAndGeometryPointSizeNative(getVkAddress()));
    }

    
    public void setShaderTessellationAndGeometryPointSize(VkBool32 shaderTessellationAndGeometryPointSize) {
        setShaderTessellationAndGeometryPointSizeNative(getVkAddress(), shaderTessellationAndGeometryPointSize != null ? shaderTessellationAndGeometryPointSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderTessellationAndGeometryPointSizeQ() {
        return getShaderTessellationAndGeometryPointSize().getValue();
    }

    public void setShaderTessellationAndGeometryPointSize(int shaderTessellationAndGeometryPointSize) {
        getShaderTessellationAndGeometryPointSize().setValue(shaderTessellationAndGeometryPointSize);
    }

    protected static native long getShaderTessellationAndGeometryPointSizeNative(long address);
    protected static native void setShaderTessellationAndGeometryPointSizeNative(long address, long shaderTessellationAndGeometryPointSize);

    public VkBool32 getShaderImageGatherExtended() {
        return new VkBool32(getVkMemory(), getShaderImageGatherExtendedNative(getVkAddress()));
    }

    
    public void setShaderImageGatherExtended(VkBool32 shaderImageGatherExtended) {
        setShaderImageGatherExtendedNative(getVkAddress(), shaderImageGatherExtended != null ? shaderImageGatherExtended.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderImageGatherExtendedQ() {
        return getShaderImageGatherExtended().getValue();
    }

    public void setShaderImageGatherExtended(int shaderImageGatherExtended) {
        getShaderImageGatherExtended().setValue(shaderImageGatherExtended);
    }

    protected static native long getShaderImageGatherExtendedNative(long address);
    protected static native void setShaderImageGatherExtendedNative(long address, long shaderImageGatherExtended);

    public VkBool32 getShaderStorageImageExtendedFormats() {
        return new VkBool32(getVkMemory(), getShaderStorageImageExtendedFormatsNative(getVkAddress()));
    }

    
    public void setShaderStorageImageExtendedFormats(VkBool32 shaderStorageImageExtendedFormats) {
        setShaderStorageImageExtendedFormatsNative(getVkAddress(), shaderStorageImageExtendedFormats != null ? shaderStorageImageExtendedFormats.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageExtendedFormatsQ() {
        return getShaderStorageImageExtendedFormats().getValue();
    }

    public void setShaderStorageImageExtendedFormats(int shaderStorageImageExtendedFormats) {
        getShaderStorageImageExtendedFormats().setValue(shaderStorageImageExtendedFormats);
    }

    protected static native long getShaderStorageImageExtendedFormatsNative(long address);
    protected static native void setShaderStorageImageExtendedFormatsNative(long address, long shaderStorageImageExtendedFormats);

    public VkBool32 getShaderStorageImageMultisample() {
        return new VkBool32(getVkMemory(), getShaderStorageImageMultisampleNative(getVkAddress()));
    }

    
    public void setShaderStorageImageMultisample(VkBool32 shaderStorageImageMultisample) {
        setShaderStorageImageMultisampleNative(getVkAddress(), shaderStorageImageMultisample != null ? shaderStorageImageMultisample.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageMultisampleQ() {
        return getShaderStorageImageMultisample().getValue();
    }

    public void setShaderStorageImageMultisample(int shaderStorageImageMultisample) {
        getShaderStorageImageMultisample().setValue(shaderStorageImageMultisample);
    }

    protected static native long getShaderStorageImageMultisampleNative(long address);
    protected static native void setShaderStorageImageMultisampleNative(long address, long shaderStorageImageMultisample);

    public VkBool32 getShaderStorageImageReadWithoutFormat() {
        return new VkBool32(getVkMemory(), getShaderStorageImageReadWithoutFormatNative(getVkAddress()));
    }

    
    public void setShaderStorageImageReadWithoutFormat(VkBool32 shaderStorageImageReadWithoutFormat) {
        setShaderStorageImageReadWithoutFormatNative(getVkAddress(), shaderStorageImageReadWithoutFormat != null ? shaderStorageImageReadWithoutFormat.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageReadWithoutFormatQ() {
        return getShaderStorageImageReadWithoutFormat().getValue();
    }

    public void setShaderStorageImageReadWithoutFormat(int shaderStorageImageReadWithoutFormat) {
        getShaderStorageImageReadWithoutFormat().setValue(shaderStorageImageReadWithoutFormat);
    }

    protected static native long getShaderStorageImageReadWithoutFormatNative(long address);
    protected static native void setShaderStorageImageReadWithoutFormatNative(long address, long shaderStorageImageReadWithoutFormat);

    public VkBool32 getShaderStorageImageWriteWithoutFormat() {
        return new VkBool32(getVkMemory(), getShaderStorageImageWriteWithoutFormatNative(getVkAddress()));
    }

    
    public void setShaderStorageImageWriteWithoutFormat(VkBool32 shaderStorageImageWriteWithoutFormat) {
        setShaderStorageImageWriteWithoutFormatNative(getVkAddress(), shaderStorageImageWriteWithoutFormat != null ? shaderStorageImageWriteWithoutFormat.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageWriteWithoutFormatQ() {
        return getShaderStorageImageWriteWithoutFormat().getValue();
    }

    public void setShaderStorageImageWriteWithoutFormat(int shaderStorageImageWriteWithoutFormat) {
        getShaderStorageImageWriteWithoutFormat().setValue(shaderStorageImageWriteWithoutFormat);
    }

    protected static native long getShaderStorageImageWriteWithoutFormatNative(long address);
    protected static native void setShaderStorageImageWriteWithoutFormatNative(long address, long shaderStorageImageWriteWithoutFormat);

    public VkBool32 getShaderUniformBufferArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderUniformBufferArrayDynamicIndexingNative(getVkAddress()));
    }

    
    public void setShaderUniformBufferArrayDynamicIndexing(VkBool32 shaderUniformBufferArrayDynamicIndexing) {
        setShaderUniformBufferArrayDynamicIndexingNative(getVkAddress(), shaderUniformBufferArrayDynamicIndexing != null ? shaderUniformBufferArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderUniformBufferArrayDynamicIndexingQ() {
        return getShaderUniformBufferArrayDynamicIndexing().getValue();
    }

    public void setShaderUniformBufferArrayDynamicIndexing(int shaderUniformBufferArrayDynamicIndexing) {
        getShaderUniformBufferArrayDynamicIndexing().setValue(shaderUniformBufferArrayDynamicIndexing);
    }

    protected static native long getShaderUniformBufferArrayDynamicIndexingNative(long address);
    protected static native void setShaderUniformBufferArrayDynamicIndexingNative(long address, long shaderUniformBufferArrayDynamicIndexing);

    public VkBool32 getShaderSampledImageArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderSampledImageArrayDynamicIndexingNative(getVkAddress()));
    }

    
    public void setShaderSampledImageArrayDynamicIndexing(VkBool32 shaderSampledImageArrayDynamicIndexing) {
        setShaderSampledImageArrayDynamicIndexingNative(getVkAddress(), shaderSampledImageArrayDynamicIndexing != null ? shaderSampledImageArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderSampledImageArrayDynamicIndexingQ() {
        return getShaderSampledImageArrayDynamicIndexing().getValue();
    }

    public void setShaderSampledImageArrayDynamicIndexing(int shaderSampledImageArrayDynamicIndexing) {
        getShaderSampledImageArrayDynamicIndexing().setValue(shaderSampledImageArrayDynamicIndexing);
    }

    protected static native long getShaderSampledImageArrayDynamicIndexingNative(long address);
    protected static native void setShaderSampledImageArrayDynamicIndexingNative(long address, long shaderSampledImageArrayDynamicIndexing);

    public VkBool32 getShaderStorageBufferArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageBufferArrayDynamicIndexingNative(getVkAddress()));
    }

    
    public void setShaderStorageBufferArrayDynamicIndexing(VkBool32 shaderStorageBufferArrayDynamicIndexing) {
        setShaderStorageBufferArrayDynamicIndexingNative(getVkAddress(), shaderStorageBufferArrayDynamicIndexing != null ? shaderStorageBufferArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageBufferArrayDynamicIndexingQ() {
        return getShaderStorageBufferArrayDynamicIndexing().getValue();
    }

    public void setShaderStorageBufferArrayDynamicIndexing(int shaderStorageBufferArrayDynamicIndexing) {
        getShaderStorageBufferArrayDynamicIndexing().setValue(shaderStorageBufferArrayDynamicIndexing);
    }

    protected static native long getShaderStorageBufferArrayDynamicIndexingNative(long address);
    protected static native void setShaderStorageBufferArrayDynamicIndexingNative(long address, long shaderStorageBufferArrayDynamicIndexing);

    public VkBool32 getShaderStorageImageArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageImageArrayDynamicIndexingNative(getVkAddress()));
    }

    
    public void setShaderStorageImageArrayDynamicIndexing(VkBool32 shaderStorageImageArrayDynamicIndexing) {
        setShaderStorageImageArrayDynamicIndexingNative(getVkAddress(), shaderStorageImageArrayDynamicIndexing != null ? shaderStorageImageArrayDynamicIndexing.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderStorageImageArrayDynamicIndexingQ() {
        return getShaderStorageImageArrayDynamicIndexing().getValue();
    }

    public void setShaderStorageImageArrayDynamicIndexing(int shaderStorageImageArrayDynamicIndexing) {
        getShaderStorageImageArrayDynamicIndexing().setValue(shaderStorageImageArrayDynamicIndexing);
    }

    protected static native long getShaderStorageImageArrayDynamicIndexingNative(long address);
    protected static native void setShaderStorageImageArrayDynamicIndexingNative(long address, long shaderStorageImageArrayDynamicIndexing);

    public VkBool32 getShaderClipDistance() {
        return new VkBool32(getVkMemory(), getShaderClipDistanceNative(getVkAddress()));
    }

    
    public void setShaderClipDistance(VkBool32 shaderClipDistance) {
        setShaderClipDistanceNative(getVkAddress(), shaderClipDistance != null ? shaderClipDistance.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderClipDistanceQ() {
        return getShaderClipDistance().getValue();
    }

    public void setShaderClipDistance(int shaderClipDistance) {
        getShaderClipDistance().setValue(shaderClipDistance);
    }

    protected static native long getShaderClipDistanceNative(long address);
    protected static native void setShaderClipDistanceNative(long address, long shaderClipDistance);

    public VkBool32 getShaderCullDistance() {
        return new VkBool32(getVkMemory(), getShaderCullDistanceNative(getVkAddress()));
    }

    
    public void setShaderCullDistance(VkBool32 shaderCullDistance) {
        setShaderCullDistanceNative(getVkAddress(), shaderCullDistance != null ? shaderCullDistance.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderCullDistanceQ() {
        return getShaderCullDistance().getValue();
    }

    public void setShaderCullDistance(int shaderCullDistance) {
        getShaderCullDistance().setValue(shaderCullDistance);
    }

    protected static native long getShaderCullDistanceNative(long address);
    protected static native void setShaderCullDistanceNative(long address, long shaderCullDistance);

    public VkBool32 getShaderFloat64() {
        return new VkBool32(getVkMemory(), getShaderFloat64Native(getVkAddress()));
    }

    
    public void setShaderFloat64(VkBool32 shaderFloat64) {
        setShaderFloat64Native(getVkAddress(), shaderFloat64 != null ? shaderFloat64.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderFloat64Q() {
        return getShaderFloat64().getValue();
    }

    public void setShaderFloat64(int shaderFloat64) {
        getShaderFloat64().setValue(shaderFloat64);
    }

    protected static native long getShaderFloat64Native(long address);
    protected static native void setShaderFloat64Native(long address, long shaderFloat64);

    public VkBool32 getShaderInt64() {
        return new VkBool32(getVkMemory(), getShaderInt64Native(getVkAddress()));
    }

    
    public void setShaderInt64(VkBool32 shaderInt64) {
        setShaderInt64Native(getVkAddress(), shaderInt64 != null ? shaderInt64.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderInt64Q() {
        return getShaderInt64().getValue();
    }

    public void setShaderInt64(int shaderInt64) {
        getShaderInt64().setValue(shaderInt64);
    }

    protected static native long getShaderInt64Native(long address);
    protected static native void setShaderInt64Native(long address, long shaderInt64);

    public VkBool32 getShaderInt16() {
        return new VkBool32(getVkMemory(), getShaderInt16Native(getVkAddress()));
    }

    
    public void setShaderInt16(VkBool32 shaderInt16) {
        setShaderInt16Native(getVkAddress(), shaderInt16 != null ? shaderInt16.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderInt16Q() {
        return getShaderInt16().getValue();
    }

    public void setShaderInt16(int shaderInt16) {
        getShaderInt16().setValue(shaderInt16);
    }

    protected static native long getShaderInt16Native(long address);
    protected static native void setShaderInt16Native(long address, long shaderInt16);

    public VkBool32 getShaderResourceResidency() {
        return new VkBool32(getVkMemory(), getShaderResourceResidencyNative(getVkAddress()));
    }

    
    public void setShaderResourceResidency(VkBool32 shaderResourceResidency) {
        setShaderResourceResidencyNative(getVkAddress(), shaderResourceResidency != null ? shaderResourceResidency.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderResourceResidencyQ() {
        return getShaderResourceResidency().getValue();
    }

    public void setShaderResourceResidency(int shaderResourceResidency) {
        getShaderResourceResidency().setValue(shaderResourceResidency);
    }

    protected static native long getShaderResourceResidencyNative(long address);
    protected static native void setShaderResourceResidencyNative(long address, long shaderResourceResidency);

    public VkBool32 getShaderResourceMinLod() {
        return new VkBool32(getVkMemory(), getShaderResourceMinLodNative(getVkAddress()));
    }

    
    public void setShaderResourceMinLod(VkBool32 shaderResourceMinLod) {
        setShaderResourceMinLodNative(getVkAddress(), shaderResourceMinLod != null ? shaderResourceMinLod.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderResourceMinLodQ() {
        return getShaderResourceMinLod().getValue();
    }

    public void setShaderResourceMinLod(int shaderResourceMinLod) {
        getShaderResourceMinLod().setValue(shaderResourceMinLod);
    }

    protected static native long getShaderResourceMinLodNative(long address);
    protected static native void setShaderResourceMinLodNative(long address, long shaderResourceMinLod);

    public VkBool32 getSparseBinding() {
        return new VkBool32(getVkMemory(), getSparseBindingNative(getVkAddress()));
    }

    
    public void setSparseBinding(VkBool32 sparseBinding) {
        setSparseBindingNative(getVkAddress(), sparseBinding != null ? sparseBinding.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseBindingQ() {
        return getSparseBinding().getValue();
    }

    public void setSparseBinding(int sparseBinding) {
        getSparseBinding().setValue(sparseBinding);
    }

    protected static native long getSparseBindingNative(long address);
    protected static native void setSparseBindingNative(long address, long sparseBinding);

    public VkBool32 getSparseResidencyBuffer() {
        return new VkBool32(getVkMemory(), getSparseResidencyBufferNative(getVkAddress()));
    }

    
    public void setSparseResidencyBuffer(VkBool32 sparseResidencyBuffer) {
        setSparseResidencyBufferNative(getVkAddress(), sparseResidencyBuffer != null ? sparseResidencyBuffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidencyBufferQ() {
        return getSparseResidencyBuffer().getValue();
    }

    public void setSparseResidencyBuffer(int sparseResidencyBuffer) {
        getSparseResidencyBuffer().setValue(sparseResidencyBuffer);
    }

    protected static native long getSparseResidencyBufferNative(long address);
    protected static native void setSparseResidencyBufferNative(long address, long sparseResidencyBuffer);

    public VkBool32 getSparseResidencyImage2D() {
        return new VkBool32(getVkMemory(), getSparseResidencyImage2DNative(getVkAddress()));
    }

    
    public void setSparseResidencyImage2D(VkBool32 sparseResidencyImage2D) {
        setSparseResidencyImage2DNative(getVkAddress(), sparseResidencyImage2D != null ? sparseResidencyImage2D.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidencyImage2DQ() {
        return getSparseResidencyImage2D().getValue();
    }

    public void setSparseResidencyImage2D(int sparseResidencyImage2D) {
        getSparseResidencyImage2D().setValue(sparseResidencyImage2D);
    }

    protected static native long getSparseResidencyImage2DNative(long address);
    protected static native void setSparseResidencyImage2DNative(long address, long sparseResidencyImage2D);

    public VkBool32 getSparseResidencyImage3D() {
        return new VkBool32(getVkMemory(), getSparseResidencyImage3DNative(getVkAddress()));
    }

    
    public void setSparseResidencyImage3D(VkBool32 sparseResidencyImage3D) {
        setSparseResidencyImage3DNative(getVkAddress(), sparseResidencyImage3D != null ? sparseResidencyImage3D.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidencyImage3DQ() {
        return getSparseResidencyImage3D().getValue();
    }

    public void setSparseResidencyImage3D(int sparseResidencyImage3D) {
        getSparseResidencyImage3D().setValue(sparseResidencyImage3D);
    }

    protected static native long getSparseResidencyImage3DNative(long address);
    protected static native void setSparseResidencyImage3DNative(long address, long sparseResidencyImage3D);

    public VkBool32 getSparseResidency2Samples() {
        return new VkBool32(getVkMemory(), getSparseResidency2SamplesNative(getVkAddress()));
    }

    
    public void setSparseResidency2Samples(VkBool32 sparseResidency2Samples) {
        setSparseResidency2SamplesNative(getVkAddress(), sparseResidency2Samples != null ? sparseResidency2Samples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidency2SamplesQ() {
        return getSparseResidency2Samples().getValue();
    }

    public void setSparseResidency2Samples(int sparseResidency2Samples) {
        getSparseResidency2Samples().setValue(sparseResidency2Samples);
    }

    protected static native long getSparseResidency2SamplesNative(long address);
    protected static native void setSparseResidency2SamplesNative(long address, long sparseResidency2Samples);

    public VkBool32 getSparseResidency4Samples() {
        return new VkBool32(getVkMemory(), getSparseResidency4SamplesNative(getVkAddress()));
    }

    
    public void setSparseResidency4Samples(VkBool32 sparseResidency4Samples) {
        setSparseResidency4SamplesNative(getVkAddress(), sparseResidency4Samples != null ? sparseResidency4Samples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidency4SamplesQ() {
        return getSparseResidency4Samples().getValue();
    }

    public void setSparseResidency4Samples(int sparseResidency4Samples) {
        getSparseResidency4Samples().setValue(sparseResidency4Samples);
    }

    protected static native long getSparseResidency4SamplesNative(long address);
    protected static native void setSparseResidency4SamplesNative(long address, long sparseResidency4Samples);

    public VkBool32 getSparseResidency8Samples() {
        return new VkBool32(getVkMemory(), getSparseResidency8SamplesNative(getVkAddress()));
    }

    
    public void setSparseResidency8Samples(VkBool32 sparseResidency8Samples) {
        setSparseResidency8SamplesNative(getVkAddress(), sparseResidency8Samples != null ? sparseResidency8Samples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidency8SamplesQ() {
        return getSparseResidency8Samples().getValue();
    }

    public void setSparseResidency8Samples(int sparseResidency8Samples) {
        getSparseResidency8Samples().setValue(sparseResidency8Samples);
    }

    protected static native long getSparseResidency8SamplesNative(long address);
    protected static native void setSparseResidency8SamplesNative(long address, long sparseResidency8Samples);

    public VkBool32 getSparseResidency16Samples() {
        return new VkBool32(getVkMemory(), getSparseResidency16SamplesNative(getVkAddress()));
    }

    
    public void setSparseResidency16Samples(VkBool32 sparseResidency16Samples) {
        setSparseResidency16SamplesNative(getVkAddress(), sparseResidency16Samples != null ? sparseResidency16Samples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidency16SamplesQ() {
        return getSparseResidency16Samples().getValue();
    }

    public void setSparseResidency16Samples(int sparseResidency16Samples) {
        getSparseResidency16Samples().setValue(sparseResidency16Samples);
    }

    protected static native long getSparseResidency16SamplesNative(long address);
    protected static native void setSparseResidency16SamplesNative(long address, long sparseResidency16Samples);

    public VkBool32 getSparseResidencyAliased() {
        return new VkBool32(getVkMemory(), getSparseResidencyAliasedNative(getVkAddress()));
    }

    
    public void setSparseResidencyAliased(VkBool32 sparseResidencyAliased) {
        setSparseResidencyAliasedNative(getVkAddress(), sparseResidencyAliased != null ? sparseResidencyAliased.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSparseResidencyAliasedQ() {
        return getSparseResidencyAliased().getValue();
    }

    public void setSparseResidencyAliased(int sparseResidencyAliased) {
        getSparseResidencyAliased().setValue(sparseResidencyAliased);
    }

    protected static native long getSparseResidencyAliasedNative(long address);
    protected static native void setSparseResidencyAliasedNative(long address, long sparseResidencyAliased);

    public VkBool32 getVariableMultisampleRate() {
        return new VkBool32(getVkMemory(), getVariableMultisampleRateNative(getVkAddress()));
    }

    
    public void setVariableMultisampleRate(VkBool32 variableMultisampleRate) {
        setVariableMultisampleRateNative(getVkAddress(), variableMultisampleRate != null ? variableMultisampleRate.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVariableMultisampleRateQ() {
        return getVariableMultisampleRate().getValue();
    }

    public void setVariableMultisampleRate(int variableMultisampleRate) {
        getVariableMultisampleRate().setValue(variableMultisampleRate);
    }

    protected static native long getVariableMultisampleRateNative(long address);
    protected static native void setVariableMultisampleRateNative(long address, long variableMultisampleRate);

    public VkBool32 getInheritedQueries() {
        return new VkBool32(getVkMemory(), getInheritedQueriesNative(getVkAddress()));
    }

    
    public void setInheritedQueries(VkBool32 inheritedQueries) {
        setInheritedQueriesNative(getVkAddress(), inheritedQueries != null ? inheritedQueries.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInheritedQueriesQ() {
        return getInheritedQueries().getValue();
    }

    public void setInheritedQueries(int inheritedQueries) {
        getInheritedQueries().setValue(inheritedQueries);
    }

    protected static native long getInheritedQueriesNative(long address);
    protected static native void setInheritedQueriesNative(long address, long inheritedQueries);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceFeatures> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceFeatures.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceFeatures o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPhysicalDeviceFeatures get(int i){
            return new VkPhysicalDeviceFeatures(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
