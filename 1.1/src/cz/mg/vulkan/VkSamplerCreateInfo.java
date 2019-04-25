package cz.mg.vulkan;

public class VkSamplerCreateInfo extends VkObject {
    public VkSamplerCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO));
    }

    public VkSamplerCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerCreateInfo(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkSamplerCreateFlags getFlags() {
        return new VkSamplerCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkSamplerCreateFlags flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);

    public VkFilter getMagFilter() {
        return new VkFilter(getVkMemory(), getMagFilterNative(getVkAddress()));
    }

    
    public void setMagFilter(VkFilter magFilter) {
        setMagFilterNative(getVkAddress(), magFilter != null ? magFilter.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMagFilterQ() {
        return getMagFilter().getValue();
    }

    public void setMagFilter(int magFilter) {
        getMagFilter().setValue(magFilter);
    }

    protected static native long getMagFilterNative(long address);
    protected static native void setMagFilterNative(long address, long magFilter);

    public VkFilter getMinFilter() {
        return new VkFilter(getVkMemory(), getMinFilterNative(getVkAddress()));
    }

    
    public void setMinFilter(VkFilter minFilter) {
        setMinFilterNative(getVkAddress(), minFilter != null ? minFilter.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinFilterQ() {
        return getMinFilter().getValue();
    }

    public void setMinFilter(int minFilter) {
        getMinFilter().setValue(minFilter);
    }

    protected static native long getMinFilterNative(long address);
    protected static native void setMinFilterNative(long address, long minFilter);

    public VkSamplerMipmapMode getMipmapMode() {
        return new VkSamplerMipmapMode(getVkMemory(), getMipmapModeNative(getVkAddress()));
    }

    
    public void setMipmapMode(VkSamplerMipmapMode mipmapMode) {
        setMipmapModeNative(getVkAddress(), mipmapMode != null ? mipmapMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMipmapModeQ() {
        return getMipmapMode().getValue();
    }

    public void setMipmapMode(int mipmapMode) {
        getMipmapMode().setValue(mipmapMode);
    }

    protected static native long getMipmapModeNative(long address);
    protected static native void setMipmapModeNative(long address, long mipmapMode);

    public VkSamplerAddressMode getAddressModeU() {
        return new VkSamplerAddressMode(getVkMemory(), getAddressModeUNative(getVkAddress()));
    }

    
    public void setAddressModeU(VkSamplerAddressMode addressModeU) {
        setAddressModeUNative(getVkAddress(), addressModeU != null ? addressModeU.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAddressModeUQ() {
        return getAddressModeU().getValue();
    }

    public void setAddressModeU(int addressModeU) {
        getAddressModeU().setValue(addressModeU);
    }

    protected static native long getAddressModeUNative(long address);
    protected static native void setAddressModeUNative(long address, long addressModeU);

    public VkSamplerAddressMode getAddressModeV() {
        return new VkSamplerAddressMode(getVkMemory(), getAddressModeVNative(getVkAddress()));
    }

    
    public void setAddressModeV(VkSamplerAddressMode addressModeV) {
        setAddressModeVNative(getVkAddress(), addressModeV != null ? addressModeV.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAddressModeVQ() {
        return getAddressModeV().getValue();
    }

    public void setAddressModeV(int addressModeV) {
        getAddressModeV().setValue(addressModeV);
    }

    protected static native long getAddressModeVNative(long address);
    protected static native void setAddressModeVNative(long address, long addressModeV);

    public VkSamplerAddressMode getAddressModeW() {
        return new VkSamplerAddressMode(getVkMemory(), getAddressModeWNative(getVkAddress()));
    }

    
    public void setAddressModeW(VkSamplerAddressMode addressModeW) {
        setAddressModeWNative(getVkAddress(), addressModeW != null ? addressModeW.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAddressModeWQ() {
        return getAddressModeW().getValue();
    }

    public void setAddressModeW(int addressModeW) {
        getAddressModeW().setValue(addressModeW);
    }

    protected static native long getAddressModeWNative(long address);
    protected static native void setAddressModeWNative(long address, long addressModeW);

    public VkFloat getMipLodBias() {
        return new VkFloat(getVkMemory(), getMipLodBiasNative(getVkAddress()));
    }

    
    public void setMipLodBias(VkFloat mipLodBias) {
        setMipLodBiasNative(getVkAddress(), mipLodBias != null ? mipLodBias.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMipLodBiasQ() {
        return getMipLodBias().getValue();
    }

    public void setMipLodBias(float mipLodBias) {
        getMipLodBias().setValue(mipLodBias);
    }

    protected static native long getMipLodBiasNative(long address);
    protected static native void setMipLodBiasNative(long address, long mipLodBias);

    public VkBool32 getAnisotropyEnable() {
        return new VkBool32(getVkMemory(), getAnisotropyEnableNative(getVkAddress()));
    }

    
    public void setAnisotropyEnable(VkBool32 anisotropyEnable) {
        setAnisotropyEnableNative(getVkAddress(), anisotropyEnable != null ? anisotropyEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAnisotropyEnableQ() {
        return getAnisotropyEnable().getValue();
    }

    public void setAnisotropyEnable(int anisotropyEnable) {
        getAnisotropyEnable().setValue(anisotropyEnable);
    }

    protected static native long getAnisotropyEnableNative(long address);
    protected static native void setAnisotropyEnableNative(long address, long anisotropyEnable);

    public VkFloat getMaxAnisotropy() {
        return new VkFloat(getVkMemory(), getMaxAnisotropyNative(getVkAddress()));
    }

    
    public void setMaxAnisotropy(VkFloat maxAnisotropy) {
        setMaxAnisotropyNative(getVkAddress(), maxAnisotropy != null ? maxAnisotropy.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxAnisotropyQ() {
        return getMaxAnisotropy().getValue();
    }

    public void setMaxAnisotropy(float maxAnisotropy) {
        getMaxAnisotropy().setValue(maxAnisotropy);
    }

    protected static native long getMaxAnisotropyNative(long address);
    protected static native void setMaxAnisotropyNative(long address, long maxAnisotropy);

    public VkBool32 getCompareEnable() {
        return new VkBool32(getVkMemory(), getCompareEnableNative(getVkAddress()));
    }

    
    public void setCompareEnable(VkBool32 compareEnable) {
        setCompareEnableNative(getVkAddress(), compareEnable != null ? compareEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCompareEnableQ() {
        return getCompareEnable().getValue();
    }

    public void setCompareEnable(int compareEnable) {
        getCompareEnable().setValue(compareEnable);
    }

    protected static native long getCompareEnableNative(long address);
    protected static native void setCompareEnableNative(long address, long compareEnable);

    public VkCompareOp getCompareOp() {
        return new VkCompareOp(getVkMemory(), getCompareOpNative(getVkAddress()));
    }

    
    public void setCompareOp(VkCompareOp compareOp) {
        setCompareOpNative(getVkAddress(), compareOp != null ? compareOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCompareOpQ() {
        return getCompareOp().getValue();
    }

    public void setCompareOp(int compareOp) {
        getCompareOp().setValue(compareOp);
    }

    protected static native long getCompareOpNative(long address);
    protected static native void setCompareOpNative(long address, long compareOp);

    public VkFloat getMinLod() {
        return new VkFloat(getVkMemory(), getMinLodNative(getVkAddress()));
    }

    
    public void setMinLod(VkFloat minLod) {
        setMinLodNative(getVkAddress(), minLod != null ? minLod.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMinLodQ() {
        return getMinLod().getValue();
    }

    public void setMinLod(float minLod) {
        getMinLod().setValue(minLod);
    }

    protected static native long getMinLodNative(long address);
    protected static native void setMinLodNative(long address, long minLod);

    public VkFloat getMaxLod() {
        return new VkFloat(getVkMemory(), getMaxLodNative(getVkAddress()));
    }

    
    public void setMaxLod(VkFloat maxLod) {
        setMaxLodNative(getVkAddress(), maxLod != null ? maxLod.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxLodQ() {
        return getMaxLod().getValue();
    }

    public void setMaxLod(float maxLod) {
        getMaxLod().setValue(maxLod);
    }

    protected static native long getMaxLodNative(long address);
    protected static native void setMaxLodNative(long address, long maxLod);

    public VkBorderColor getBorderColor() {
        return new VkBorderColor(getVkMemory(), getBorderColorNative(getVkAddress()));
    }

    
    public void setBorderColor(VkBorderColor borderColor) {
        setBorderColorNative(getVkAddress(), borderColor != null ? borderColor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBorderColorQ() {
        return getBorderColor().getValue();
    }

    public void setBorderColor(int borderColor) {
        getBorderColor().setValue(borderColor);
    }

    protected static native long getBorderColorNative(long address);
    protected static native void setBorderColorNative(long address, long borderColor);

    public VkBool32 getUnnormalizedCoordinates() {
        return new VkBool32(getVkMemory(), getUnnormalizedCoordinatesNative(getVkAddress()));
    }

    
    public void setUnnormalizedCoordinates(VkBool32 unnormalizedCoordinates) {
        setUnnormalizedCoordinatesNative(getVkAddress(), unnormalizedCoordinates != null ? unnormalizedCoordinates.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getUnnormalizedCoordinatesQ() {
        return getUnnormalizedCoordinates().getValue();
    }

    public void setUnnormalizedCoordinates(int unnormalizedCoordinates) {
        getUnnormalizedCoordinates().setValue(unnormalizedCoordinates);
    }

    protected static native long getUnnormalizedCoordinatesNative(long address);
    protected static native void setUnnormalizedCoordinatesNative(long address, long unnormalizedCoordinates);


    public static native long sizeof();

    public static class Array extends VkSamplerCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkSamplerCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO));;
        }

        public Array(int count, VkSamplerCreateInfo o){
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
        public VkSamplerCreateInfo get(int i){
            return new VkSamplerCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
