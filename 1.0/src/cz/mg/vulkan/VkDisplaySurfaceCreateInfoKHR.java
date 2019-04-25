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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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

    public VkDisplaySurfaceCreateFlagsKHR getFlags() {
        return new VkDisplaySurfaceCreateFlagsKHR(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDisplaySurfaceCreateFlagsKHR flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkDisplayModeKHR getDisplayMode() {
        return new VkDisplayModeKHR(getVkMemory(), getDisplayMode(getVkAddress()));
    }

    
    public void setDisplayMode(VkDisplayModeKHR displayMode) {
        setDisplayMode(getVkAddress(), displayMode != null ? displayMode.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getDisplayMode(long address);
    protected static native void setDisplayMode(long address, long displayMode);

    public VkUInt32 getPlaneIndex() {
        return new VkUInt32(getVkMemory(), getPlaneIndex(getVkAddress()));
    }

    
    public void setPlaneIndex(VkUInt32 planeIndex) {
        setPlaneIndex(getVkAddress(), planeIndex != null ? planeIndex.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getPlaneIndexQ() {
        return getPlaneIndex().getValue();
    }

    public void setPlaneIndex(int planeIndex) {
        getPlaneIndex().setValue(planeIndex);
    }

    protected static native long getPlaneIndex(long address);
    protected static native void setPlaneIndex(long address, long planeIndex);

    public VkUInt32 getPlaneStackIndex() {
        return new VkUInt32(getVkMemory(), getPlaneStackIndex(getVkAddress()));
    }

    
    public void setPlaneStackIndex(VkUInt32 planeStackIndex) {
        setPlaneStackIndex(getVkAddress(), planeStackIndex != null ? planeStackIndex.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getPlaneStackIndexQ() {
        return getPlaneStackIndex().getValue();
    }

    public void setPlaneStackIndex(int planeStackIndex) {
        getPlaneStackIndex().setValue(planeStackIndex);
    }

    protected static native long getPlaneStackIndex(long address);
    protected static native void setPlaneStackIndex(long address, long planeStackIndex);

    public VkSurfaceTransformFlagBitsKHR getTransform() {
        return new VkSurfaceTransformFlagBitsKHR(getVkMemory(), getTransform(getVkAddress()));
    }

    
    public void setTransform(VkSurfaceTransformFlagBitsKHR transform) {
        setTransform(getVkAddress(), transform != null ? transform.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getTransformQ() {
        return getTransform().getValue();
    }

    public void setTransform(int transform) {
        getTransform().setValue(transform);
    }

    protected static native long getTransform(long address);
    protected static native void setTransform(long address, long transform);

    public VkFloat getGlobalAlpha() {
        return new VkFloat(getVkMemory(), getGlobalAlpha(getVkAddress()));
    }

    
    public void setGlobalAlpha(VkFloat globalAlpha) {
        setGlobalAlpha(getVkAddress(), globalAlpha != null ? globalAlpha.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public float getGlobalAlphaQ() {
        return getGlobalAlpha().getValue();
    }

    public void setGlobalAlpha(float globalAlpha) {
        getGlobalAlpha().setValue(globalAlpha);
    }

    protected static native long getGlobalAlpha(long address);
    protected static native void setGlobalAlpha(long address, long globalAlpha);

    public VkDisplayPlaneAlphaFlagBitsKHR getAlphaMode() {
        return new VkDisplayPlaneAlphaFlagBitsKHR(getVkMemory(), getAlphaMode(getVkAddress()));
    }

    
    public void setAlphaMode(VkDisplayPlaneAlphaFlagBitsKHR alphaMode) {
        setAlphaMode(getVkAddress(), alphaMode != null ? alphaMode.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getAlphaModeQ() {
        return getAlphaMode().getValue();
    }

    public void setAlphaMode(int alphaMode) {
        getAlphaMode().setValue(alphaMode);
    }

    protected static native long getAlphaMode(long address);
    protected static native void setAlphaMode(long address, long alphaMode);

    public VkExtent2D getImageExtent() {
        return new VkExtent2D(getVkMemory(), getImageExtent(getVkAddress()));
    }

    
    public void setImageExtent(VkExtent2D imageExtent) {
        setImageExtent(getVkAddress(), imageExtent != null ? imageExtent.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getImageExtent(long address);
    protected static native void setImageExtent(long address, long imageExtent);


    public static native long sizeof();

    public static class Array extends VkDisplaySurfaceCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplaySurfaceCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplaySurfaceCreateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR));;
        }

        public Array(int count, VkDisplaySurfaceCreateInfoKHR o){
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

        public static class Array extends VkDisplaySurfaceCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplaySurfaceCreateInfoKHR.Pointer> {
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

            public Array(VkDisplaySurfaceCreateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplaySurfaceCreateInfoKHR.Pointer get(int i){
                return new VkDisplaySurfaceCreateInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
