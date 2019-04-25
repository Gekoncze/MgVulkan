package cz.mg.vulkan;

public class VkImagePlaneMemoryRequirementsInfo extends VkObject {
    public VkImagePlaneMemoryRequirementsInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO));
    }

    public VkImagePlaneMemoryRequirementsInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImagePlaneMemoryRequirementsInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImagePlaneMemoryRequirementsInfo(VkPointer pointer) {
        super(pointer);
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

    public VkImageAspectFlagBits getPlaneAspect() {
        return new VkImageAspectFlagBits(getVkMemory(), getPlaneAspect(getVkAddress()));
    }

    
    public void setPlaneAspect(VkImageAspectFlagBits planeAspect) {
        setPlaneAspect(getVkAddress(), planeAspect != null ? planeAspect.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPlaneAspectQ() {
        return getPlaneAspect().getValue();
    }

    public void setPlaneAspect(int planeAspect) {
        getPlaneAspect().setValue(planeAspect);
    }

    protected static native long getPlaneAspect(long address);
    protected static native void setPlaneAspect(long address, long planeAspect);


    public static native long sizeof();

    public static class Array extends VkImagePlaneMemoryRequirementsInfo implements cz.mg.collections.array.ReadonlyArray<VkImagePlaneMemoryRequirementsInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImagePlaneMemoryRequirementsInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO));;
        }

        public Array(int count, VkImagePlaneMemoryRequirementsInfo o){
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
        public VkImagePlaneMemoryRequirementsInfo get(int i){
            return new VkImagePlaneMemoryRequirementsInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
