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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkSamplerCreateFlags getFlags() {
        return new VkSamplerCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkSamplerCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkFilter getMagFilter() {
        return new VkFilter(getVkMemory(), getMagFilter(getVkAddress()));
    }

    
    public void setMagFilter(VkFilter magFilter) {
        setMagFilter(getVkAddress(), magFilter != null ? magFilter.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMagFilterQ() {
        return getMagFilter().getValue();
    }

    public void setMagFilter(int magFilter) {
        getMagFilter().setValue(magFilter);
    }

    protected static native long getMagFilter(long address);
    protected static native void setMagFilter(long address, long magFilter);

    public VkFilter getMinFilter() {
        return new VkFilter(getVkMemory(), getMinFilter(getVkAddress()));
    }

    
    public void setMinFilter(VkFilter minFilter) {
        setMinFilter(getVkAddress(), minFilter != null ? minFilter.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinFilterQ() {
        return getMinFilter().getValue();
    }

    public void setMinFilter(int minFilter) {
        getMinFilter().setValue(minFilter);
    }

    protected static native long getMinFilter(long address);
    protected static native void setMinFilter(long address, long minFilter);

    public VkSamplerMipmapMode getMipmapMode() {
        return new VkSamplerMipmapMode(getVkMemory(), getMipmapMode(getVkAddress()));
    }

    
    public void setMipmapMode(VkSamplerMipmapMode mipmapMode) {
        setMipmapMode(getVkAddress(), mipmapMode != null ? mipmapMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMipmapModeQ() {
        return getMipmapMode().getValue();
    }

    public void setMipmapMode(int mipmapMode) {
        getMipmapMode().setValue(mipmapMode);
    }

    protected static native long getMipmapMode(long address);
    protected static native void setMipmapMode(long address, long mipmapMode);

    public VkSamplerAddressMode getAddressModeU() {
        return new VkSamplerAddressMode(getVkMemory(), getAddressModeU(getVkAddress()));
    }

    
    public void setAddressModeU(VkSamplerAddressMode addressModeU) {
        setAddressModeU(getVkAddress(), addressModeU != null ? addressModeU.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAddressModeUQ() {
        return getAddressModeU().getValue();
    }

    public void setAddressModeU(int addressModeU) {
        getAddressModeU().setValue(addressModeU);
    }

    protected static native long getAddressModeU(long address);
    protected static native void setAddressModeU(long address, long addressModeU);

    public VkSamplerAddressMode getAddressModeV() {
        return new VkSamplerAddressMode(getVkMemory(), getAddressModeV(getVkAddress()));
    }

    
    public void setAddressModeV(VkSamplerAddressMode addressModeV) {
        setAddressModeV(getVkAddress(), addressModeV != null ? addressModeV.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAddressModeVQ() {
        return getAddressModeV().getValue();
    }

    public void setAddressModeV(int addressModeV) {
        getAddressModeV().setValue(addressModeV);
    }

    protected static native long getAddressModeV(long address);
    protected static native void setAddressModeV(long address, long addressModeV);

    public VkSamplerAddressMode getAddressModeW() {
        return new VkSamplerAddressMode(getVkMemory(), getAddressModeW(getVkAddress()));
    }

    
    public void setAddressModeW(VkSamplerAddressMode addressModeW) {
        setAddressModeW(getVkAddress(), addressModeW != null ? addressModeW.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAddressModeWQ() {
        return getAddressModeW().getValue();
    }

    public void setAddressModeW(int addressModeW) {
        getAddressModeW().setValue(addressModeW);
    }

    protected static native long getAddressModeW(long address);
    protected static native void setAddressModeW(long address, long addressModeW);

    public VkFloat getMipLodBias() {
        return new VkFloat(getVkMemory(), getMipLodBias(getVkAddress()));
    }

    
    public void setMipLodBias(VkFloat mipLodBias) {
        setMipLodBias(getVkAddress(), mipLodBias != null ? mipLodBias.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMipLodBiasQ() {
        return getMipLodBias().getValue();
    }

    public void setMipLodBias(float mipLodBias) {
        getMipLodBias().setValue(mipLodBias);
    }

    protected static native long getMipLodBias(long address);
    protected static native void setMipLodBias(long address, long mipLodBias);

    public VkBool32 getAnisotropyEnable() {
        return new VkBool32(getVkMemory(), getAnisotropyEnable(getVkAddress()));
    }

    
    public void setAnisotropyEnable(VkBool32 anisotropyEnable) {
        setAnisotropyEnable(getVkAddress(), anisotropyEnable != null ? anisotropyEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAnisotropyEnableQ() {
        return getAnisotropyEnable().getValue();
    }

    public void setAnisotropyEnable(int anisotropyEnable) {
        getAnisotropyEnable().setValue(anisotropyEnable);
    }

    protected static native long getAnisotropyEnable(long address);
    protected static native void setAnisotropyEnable(long address, long anisotropyEnable);

    public VkFloat getMaxAnisotropy() {
        return new VkFloat(getVkMemory(), getMaxAnisotropy(getVkAddress()));
    }

    
    public void setMaxAnisotropy(VkFloat maxAnisotropy) {
        setMaxAnisotropy(getVkAddress(), maxAnisotropy != null ? maxAnisotropy.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxAnisotropyQ() {
        return getMaxAnisotropy().getValue();
    }

    public void setMaxAnisotropy(float maxAnisotropy) {
        getMaxAnisotropy().setValue(maxAnisotropy);
    }

    protected static native long getMaxAnisotropy(long address);
    protected static native void setMaxAnisotropy(long address, long maxAnisotropy);

    public VkBool32 getCompareEnable() {
        return new VkBool32(getVkMemory(), getCompareEnable(getVkAddress()));
    }

    
    public void setCompareEnable(VkBool32 compareEnable) {
        setCompareEnable(getVkAddress(), compareEnable != null ? compareEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCompareEnableQ() {
        return getCompareEnable().getValue();
    }

    public void setCompareEnable(int compareEnable) {
        getCompareEnable().setValue(compareEnable);
    }

    protected static native long getCompareEnable(long address);
    protected static native void setCompareEnable(long address, long compareEnable);

    public VkCompareOp getCompareOp() {
        return new VkCompareOp(getVkMemory(), getCompareOp(getVkAddress()));
    }

    
    public void setCompareOp(VkCompareOp compareOp) {
        setCompareOp(getVkAddress(), compareOp != null ? compareOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCompareOpQ() {
        return getCompareOp().getValue();
    }

    public void setCompareOp(int compareOp) {
        getCompareOp().setValue(compareOp);
    }

    protected static native long getCompareOp(long address);
    protected static native void setCompareOp(long address, long compareOp);

    public VkFloat getMinLod() {
        return new VkFloat(getVkMemory(), getMinLod(getVkAddress()));
    }

    
    public void setMinLod(VkFloat minLod) {
        setMinLod(getVkAddress(), minLod != null ? minLod.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMinLodQ() {
        return getMinLod().getValue();
    }

    public void setMinLod(float minLod) {
        getMinLod().setValue(minLod);
    }

    protected static native long getMinLod(long address);
    protected static native void setMinLod(long address, long minLod);

    public VkFloat getMaxLod() {
        return new VkFloat(getVkMemory(), getMaxLod(getVkAddress()));
    }

    
    public void setMaxLod(VkFloat maxLod) {
        setMaxLod(getVkAddress(), maxLod != null ? maxLod.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxLodQ() {
        return getMaxLod().getValue();
    }

    public void setMaxLod(float maxLod) {
        getMaxLod().setValue(maxLod);
    }

    protected static native long getMaxLod(long address);
    protected static native void setMaxLod(long address, long maxLod);

    public VkBorderColor getBorderColor() {
        return new VkBorderColor(getVkMemory(), getBorderColor(getVkAddress()));
    }

    
    public void setBorderColor(VkBorderColor borderColor) {
        setBorderColor(getVkAddress(), borderColor != null ? borderColor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBorderColorQ() {
        return getBorderColor().getValue();
    }

    public void setBorderColor(int borderColor) {
        getBorderColor().setValue(borderColor);
    }

    protected static native long getBorderColor(long address);
    protected static native void setBorderColor(long address, long borderColor);

    public VkBool32 getUnnormalizedCoordinates() {
        return new VkBool32(getVkMemory(), getUnnormalizedCoordinates(getVkAddress()));
    }

    
    public void setUnnormalizedCoordinates(VkBool32 unnormalizedCoordinates) {
        setUnnormalizedCoordinates(getVkAddress(), unnormalizedCoordinates != null ? unnormalizedCoordinates.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getUnnormalizedCoordinatesQ() {
        return getUnnormalizedCoordinates().getValue();
    }

    public void setUnnormalizedCoordinates(int unnormalizedCoordinates) {
        getUnnormalizedCoordinates().setValue(unnormalizedCoordinates);
    }

    protected static native long getUnnormalizedCoordinates(long address);
    protected static native void setUnnormalizedCoordinates(long address, long unnormalizedCoordinates);


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
