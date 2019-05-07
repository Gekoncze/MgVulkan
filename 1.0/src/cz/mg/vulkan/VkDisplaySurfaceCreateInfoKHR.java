package cz.mg.vulkan;

public class VkDisplaySurfaceCreateInfoKHR extends VkObject {
    public VkDisplaySurfaceCreateInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR));
    }

    public VkDisplaySurfaceCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplaySurfaceCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplaySurfaceCreateInfoKHR(VkPointer pointer) {
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

    public VkDisplaySurfaceCreateFlagsKHR getFlags() {
        return new VkDisplaySurfaceCreateFlagsKHR(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkDisplaySurfaceCreateFlagsKHR flags) {
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

    public VkDisplayModeKHR getDisplayMode() {
        return new VkDisplayModeKHR(getVkMemory(), getDisplayModeNative(getVkAddress()));
    }

    
    public void setDisplayMode(VkDisplayModeKHR displayMode) {
        setDisplayModeNative(getVkAddress(), displayMode != null ? displayMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDisplayModeNative(long address);
    protected static native void setDisplayModeNative(long address, long displayMode);

    public VkUInt32 getPlaneIndex() {
        return new VkUInt32(getVkMemory(), getPlaneIndexNative(getVkAddress()));
    }

    
    public void setPlaneIndex(VkUInt32 planeIndex) {
        setPlaneIndexNative(getVkAddress(), planeIndex != null ? planeIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPlaneIndexQ() {
        return getPlaneIndex().getValue();
    }

    public void setPlaneIndex(int planeIndex) {
        getPlaneIndex().setValue(planeIndex);
    }

    protected static native long getPlaneIndexNative(long address);
    protected static native void setPlaneIndexNative(long address, long planeIndex);

    public VkUInt32 getPlaneStackIndex() {
        return new VkUInt32(getVkMemory(), getPlaneStackIndexNative(getVkAddress()));
    }

    
    public void setPlaneStackIndex(VkUInt32 planeStackIndex) {
        setPlaneStackIndexNative(getVkAddress(), planeStackIndex != null ? planeStackIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPlaneStackIndexQ() {
        return getPlaneStackIndex().getValue();
    }

    public void setPlaneStackIndex(int planeStackIndex) {
        getPlaneStackIndex().setValue(planeStackIndex);
    }

    protected static native long getPlaneStackIndexNative(long address);
    protected static native void setPlaneStackIndexNative(long address, long planeStackIndex);

    public VkSurfaceTransformFlagBitsKHR getTransform() {
        return new VkSurfaceTransformFlagBitsKHR(getVkMemory(), getTransformNative(getVkAddress()));
    }

    
    public void setTransform(VkSurfaceTransformFlagBitsKHR transform) {
        setTransformNative(getVkAddress(), transform != null ? transform.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTransformQ() {
        return getTransform().getValue();
    }

    public void setTransform(int transform) {
        getTransform().setValue(transform);
    }

    protected static native long getTransformNative(long address);
    protected static native void setTransformNative(long address, long transform);

    public VkFloat getGlobalAlpha() {
        return new VkFloat(getVkMemory(), getGlobalAlphaNative(getVkAddress()));
    }

    
    public void setGlobalAlpha(VkFloat globalAlpha) {
        setGlobalAlphaNative(getVkAddress(), globalAlpha != null ? globalAlpha.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getGlobalAlphaQ() {
        return getGlobalAlpha().getValue();
    }

    public void setGlobalAlpha(float globalAlpha) {
        getGlobalAlpha().setValue(globalAlpha);
    }

    protected static native long getGlobalAlphaNative(long address);
    protected static native void setGlobalAlphaNative(long address, long globalAlpha);

    public VkDisplayPlaneAlphaFlagBitsKHR getAlphaMode() {
        return new VkDisplayPlaneAlphaFlagBitsKHR(getVkMemory(), getAlphaModeNative(getVkAddress()));
    }

    
    public void setAlphaMode(VkDisplayPlaneAlphaFlagBitsKHR alphaMode) {
        setAlphaModeNative(getVkAddress(), alphaMode != null ? alphaMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAlphaModeQ() {
        return getAlphaMode().getValue();
    }

    public void setAlphaMode(int alphaMode) {
        getAlphaMode().setValue(alphaMode);
    }

    protected static native long getAlphaModeNative(long address);
    protected static native void setAlphaModeNative(long address, long alphaMode);

    public VkExtent2D getImageExtent() {
        return new VkExtent2D(getVkMemory(), getImageExtentNative(getVkAddress()));
    }

    
    public void setImageExtent(VkExtent2D imageExtent) {
        setImageExtentNative(getVkAddress(), imageExtent != null ? imageExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageExtentNative(long address);
    protected static native void setImageExtentNative(long address, long imageExtent);


    public void set(VkDisplaySurfaceCreateInfoKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDisplaySurfaceCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplaySurfaceCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplaySurfaceCreateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR));;
        }

        public Array(VkDisplaySurfaceCreateInfoKHR o, int count){
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
        public VkDisplaySurfaceCreateInfoKHR get(int i){
            return new VkDisplaySurfaceCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
