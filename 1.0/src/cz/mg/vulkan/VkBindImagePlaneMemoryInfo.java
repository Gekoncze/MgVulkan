package cz.mg.vulkan;

public class VkBindImagePlaneMemoryInfo extends VkObject {
    public VkBindImagePlaneMemoryInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO));
    }

    public VkBindImagePlaneMemoryInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBindImagePlaneMemoryInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBindImagePlaneMemoryInfo(VkPointer pointer) {
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

    public VkImageAspectFlagBits getPlaneAspect() {
        return new VkImageAspectFlagBits(getVkMemory(), getPlaneAspectNative(getVkAddress()));
    }

    
    public void setPlaneAspect(VkImageAspectFlagBits planeAspect) {
        setPlaneAspectNative(getVkAddress(), planeAspect != null ? planeAspect.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPlaneAspectQ() {
        return getPlaneAspect().getValue();
    }

    public void setPlaneAspect(int planeAspect) {
        getPlaneAspect().setValue(planeAspect);
    }

    protected static native long getPlaneAspectNative(long address);
    protected static native void setPlaneAspectNative(long address, long planeAspect);


    public static native long sizeof();

    public static class Array extends VkBindImagePlaneMemoryInfo implements cz.mg.collections.array.ReadonlyArray<VkBindImagePlaneMemoryInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBindImagePlaneMemoryInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_PLANE_MEMORY_INFO));;
        }

        public Array(int count, VkBindImagePlaneMemoryInfo o){
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
        public VkBindImagePlaneMemoryInfo get(int i){
            return new VkBindImagePlaneMemoryInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
