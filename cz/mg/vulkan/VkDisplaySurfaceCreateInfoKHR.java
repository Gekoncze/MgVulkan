package cz.mg.vulkan;

public class VkDisplaySurfaceCreateInfoKHR extends VkObject {
    public VkDisplaySurfaceCreateInfoKHR() {
        super(sizeof());
    }

    public VkDisplaySurfaceCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplaySurfaceCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplaySurfaceCreateInfoKHR(VkObject pNext, VkDisplaySurfaceCreateFlagsKHR flags, VkDisplayModeKHR displayMode, VkUInt32 planeIndex, VkUInt32 planeStackIndex, VkSurfaceTransformFlagBitsKHR transform, VkFloat globalAlpha, VkDisplayPlaneAlphaFlagBitsKHR alphaMode, VkExtent2D imageExtent) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR));
        setPNext(pNext);
        setFlags(flags);
        setDisplayMode(displayMode);
        setPlaneIndex(planeIndex);
        setPlaneStackIndex(planeStackIndex);
        setTransform(transform);
        setGlobalAlpha(globalAlpha);
        setAlphaMode(alphaMode);
        setImageExtent(imageExtent);
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

    public VkDisplaySurfaceCreateFlagsKHR getFlags() {
        return new VkDisplaySurfaceCreateFlagsKHR(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDisplaySurfaceCreateFlagsKHR flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkDisplayModeKHR getDisplayMode() {
        return new VkDisplayModeKHR(getVkMemory(), getDisplayMode(getVkAddress()));
    }

    
    public void setDisplayMode(VkDisplayModeKHR displayMode) {
        setDisplayMode(getVkAddress(), displayMode != null ? displayMode.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDisplayMode(long address);
    private static native void setDisplayMode(long address, long displayMode);

    public VkUInt32 getPlaneIndex() {
        return new VkUInt32(getVkMemory(), getPlaneIndex(getVkAddress()));
    }

    
    public void setPlaneIndex(VkUInt32 planeIndex) {
        setPlaneIndex(getVkAddress(), planeIndex != null ? planeIndex.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getPlaneIndex(long address);
    private static native void setPlaneIndex(long address, long planeIndex);

    public VkUInt32 getPlaneStackIndex() {
        return new VkUInt32(getVkMemory(), getPlaneStackIndex(getVkAddress()));
    }

    
    public void setPlaneStackIndex(VkUInt32 planeStackIndex) {
        setPlaneStackIndex(getVkAddress(), planeStackIndex != null ? planeStackIndex.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getPlaneStackIndex(long address);
    private static native void setPlaneStackIndex(long address, long planeStackIndex);

    public VkSurfaceTransformFlagBitsKHR getTransform() {
        return new VkSurfaceTransformFlagBitsKHR(getVkMemory(), getTransform(getVkAddress()));
    }

    
    public void setTransform(VkSurfaceTransformFlagBitsKHR transform) {
        setTransform(getVkAddress(), transform != null ? transform.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getTransform(long address);
    private static native void setTransform(long address, long transform);

    public VkFloat getGlobalAlpha() {
        return new VkFloat(getVkMemory(), getGlobalAlpha(getVkAddress()));
    }

    
    public void setGlobalAlpha(VkFloat globalAlpha) {
        setGlobalAlpha(getVkAddress(), globalAlpha != null ? globalAlpha.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getGlobalAlpha(long address);
    private static native void setGlobalAlpha(long address, long globalAlpha);

    public VkDisplayPlaneAlphaFlagBitsKHR getAlphaMode() {
        return new VkDisplayPlaneAlphaFlagBitsKHR(getVkMemory(), getAlphaMode(getVkAddress()));
    }

    
    public void setAlphaMode(VkDisplayPlaneAlphaFlagBitsKHR alphaMode) {
        setAlphaMode(getVkAddress(), alphaMode != null ? alphaMode.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getAlphaMode(long address);
    private static native void setAlphaMode(long address, long alphaMode);

    public VkExtent2D getImageExtent() {
        return new VkExtent2D(getVkMemory(), getImageExtent(getVkAddress()));
    }

    
    public void setImageExtent(VkExtent2D imageExtent) {
        setImageExtent(getVkAddress(), imageExtent != null ? imageExtent.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getImageExtent(long address);
    private static native void setImageExtent(long address, long imageExtent);


    public static native long sizeof();

    public static class Array extends VkDisplaySurfaceCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplaySurfaceCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplaySurfaceCreateInfoKHR.sizeof()));
            this.count = count;
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
