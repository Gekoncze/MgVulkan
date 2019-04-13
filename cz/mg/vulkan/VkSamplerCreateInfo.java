package cz.mg.vulkan;

public class VkSamplerCreateInfo extends VkObject {
    public VkSamplerCreateInfo() {
        super(sizeof());
    }

    public VkSamplerCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerCreateInfo(VkObject pNext, VkSamplerCreateFlags flags, VkFilter magFilter, VkFilter minFilter, VkSamplerMipmapMode mipmapMode, VkSamplerAddressMode addressModeU, VkSamplerAddressMode addressModeV, VkSamplerAddressMode addressModeW, VkFloat mipLodBias, VkBool32 anisotropyEnable, VkFloat maxAnisotropy, VkBool32 compareEnable, VkCompareOp compareOp, VkFloat minLod, VkFloat maxLod, VkBorderColor borderColor, VkBool32 unnormalizedCoordinates) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setMagFilter(magFilter);
        setMinFilter(minFilter);
        setMipmapMode(mipmapMode);
        setAddressModeU(addressModeU);
        setAddressModeV(addressModeV);
        setAddressModeW(addressModeW);
        setMipLodBias(mipLodBias);
        setAnisotropyEnable(anisotropyEnable);
        setMaxAnisotropy(maxAnisotropy);
        setCompareEnable(compareEnable);
        setCompareOp(compareOp);
        setMinLod(minLod);
        setMaxLod(maxLod);
        setBorderColor(borderColor);
        setUnnormalizedCoordinates(unnormalizedCoordinates);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkSamplerCreateFlags getFlags() {
        return new VkSamplerCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkSamplerCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkFilter getMagFilter() {
        return new VkFilter(getVkMemory(), getMagFilter(getVkAddress()));
    }

    
    public void setMagFilter(VkFilter magFilter) {
        setMagFilter(getVkAddress(), magFilter != null ? magFilter.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMagFilter(long address);
    private static native void setMagFilter(long address, long magFilter);

    public VkFilter getMinFilter() {
        return new VkFilter(getVkMemory(), getMinFilter(getVkAddress()));
    }

    
    public void setMinFilter(VkFilter minFilter) {
        setMinFilter(getVkAddress(), minFilter != null ? minFilter.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMinFilter(long address);
    private static native void setMinFilter(long address, long minFilter);

    public VkSamplerMipmapMode getMipmapMode() {
        return new VkSamplerMipmapMode(getVkMemory(), getMipmapMode(getVkAddress()));
    }

    
    public void setMipmapMode(VkSamplerMipmapMode mipmapMode) {
        setMipmapMode(getVkAddress(), mipmapMode != null ? mipmapMode.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMipmapMode(long address);
    private static native void setMipmapMode(long address, long mipmapMode);

    public VkSamplerAddressMode getAddressModeU() {
        return new VkSamplerAddressMode(getVkMemory(), getAddressModeU(getVkAddress()));
    }

    
    public void setAddressModeU(VkSamplerAddressMode addressModeU) {
        setAddressModeU(getVkAddress(), addressModeU != null ? addressModeU.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getAddressModeU(long address);
    private static native void setAddressModeU(long address, long addressModeU);

    public VkSamplerAddressMode getAddressModeV() {
        return new VkSamplerAddressMode(getVkMemory(), getAddressModeV(getVkAddress()));
    }

    
    public void setAddressModeV(VkSamplerAddressMode addressModeV) {
        setAddressModeV(getVkAddress(), addressModeV != null ? addressModeV.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getAddressModeV(long address);
    private static native void setAddressModeV(long address, long addressModeV);

    public VkSamplerAddressMode getAddressModeW() {
        return new VkSamplerAddressMode(getVkMemory(), getAddressModeW(getVkAddress()));
    }

    
    public void setAddressModeW(VkSamplerAddressMode addressModeW) {
        setAddressModeW(getVkAddress(), addressModeW != null ? addressModeW.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getAddressModeW(long address);
    private static native void setAddressModeW(long address, long addressModeW);

    public VkFloat getMipLodBias() {
        return new VkFloat(getVkMemory(), getMipLodBias(getVkAddress()));
    }

    
    public void setMipLodBias(VkFloat mipLodBias) {
        setMipLodBias(getVkAddress(), mipLodBias != null ? mipLodBias.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMipLodBias(long address);
    private static native void setMipLodBias(long address, long mipLodBias);

    public VkBool32 getAnisotropyEnable() {
        return new VkBool32(getVkMemory(), getAnisotropyEnable(getVkAddress()));
    }

    
    public void setAnisotropyEnable(VkBool32 anisotropyEnable) {
        setAnisotropyEnable(getVkAddress(), anisotropyEnable != null ? anisotropyEnable.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getAnisotropyEnable(long address);
    private static native void setAnisotropyEnable(long address, long anisotropyEnable);

    public VkFloat getMaxAnisotropy() {
        return new VkFloat(getVkMemory(), getMaxAnisotropy(getVkAddress()));
    }

    
    public void setMaxAnisotropy(VkFloat maxAnisotropy) {
        setMaxAnisotropy(getVkAddress(), maxAnisotropy != null ? maxAnisotropy.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMaxAnisotropy(long address);
    private static native void setMaxAnisotropy(long address, long maxAnisotropy);

    public VkBool32 getCompareEnable() {
        return new VkBool32(getVkMemory(), getCompareEnable(getVkAddress()));
    }

    
    public void setCompareEnable(VkBool32 compareEnable) {
        setCompareEnable(getVkAddress(), compareEnable != null ? compareEnable.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getCompareEnable(long address);
    private static native void setCompareEnable(long address, long compareEnable);

    public VkCompareOp getCompareOp() {
        return new VkCompareOp(getVkMemory(), getCompareOp(getVkAddress()));
    }

    
    public void setCompareOp(VkCompareOp compareOp) {
        setCompareOp(getVkAddress(), compareOp != null ? compareOp.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getCompareOp(long address);
    private static native void setCompareOp(long address, long compareOp);

    public VkFloat getMinLod() {
        return new VkFloat(getVkMemory(), getMinLod(getVkAddress()));
    }

    
    public void setMinLod(VkFloat minLod) {
        setMinLod(getVkAddress(), minLod != null ? minLod.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMinLod(long address);
    private static native void setMinLod(long address, long minLod);

    public VkFloat getMaxLod() {
        return new VkFloat(getVkMemory(), getMaxLod(getVkAddress()));
    }

    
    public void setMaxLod(VkFloat maxLod) {
        setMaxLod(getVkAddress(), maxLod != null ? maxLod.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMaxLod(long address);
    private static native void setMaxLod(long address, long maxLod);

    public VkBorderColor getBorderColor() {
        return new VkBorderColor(getVkMemory(), getBorderColor(getVkAddress()));
    }

    
    public void setBorderColor(VkBorderColor borderColor) {
        setBorderColor(getVkAddress(), borderColor != null ? borderColor.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBorderColor(long address);
    private static native void setBorderColor(long address, long borderColor);

    public VkBool32 getUnnormalizedCoordinates() {
        return new VkBool32(getVkMemory(), getUnnormalizedCoordinates(getVkAddress()));
    }

    
    public void setUnnormalizedCoordinates(VkBool32 unnormalizedCoordinates) {
        setUnnormalizedCoordinates(getVkAddress(), unnormalizedCoordinates != null ? unnormalizedCoordinates.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getUnnormalizedCoordinates(long address);
    private static native void setUnnormalizedCoordinates(long address, long unnormalizedCoordinates);


    public static native long sizeof();

    public static class Array extends VkSamplerCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkSamplerCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerCreateInfo.sizeof()));
            this.count = count;
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

        public static class Array extends VkSamplerCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSamplerCreateInfo.Pointer> {
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

            public Array(VkSamplerCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSamplerCreateInfo.Pointer get(int i){
                return new VkSamplerCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
