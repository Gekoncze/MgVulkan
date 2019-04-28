package cz.mg.vulkan;

public class VkProtectedSubmitInfo extends VkObject {
    public VkProtectedSubmitInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO));
    }

    public VkProtectedSubmitInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkProtectedSubmitInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkProtectedSubmitInfo(VkPointer pointer) {
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

    public VkBool32 getProtectedSubmit() {
        return new VkBool32(getVkMemory(), getProtectedSubmitNative(getVkAddress()));
    }

    
    public void setProtectedSubmit(VkBool32 protectedSubmit) {
        setProtectedSubmitNative(getVkAddress(), protectedSubmit != null ? protectedSubmit.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getProtectedSubmitQ() {
        return getProtectedSubmit().getValue();
    }

    public void setProtectedSubmit(int protectedSubmit) {
        getProtectedSubmit().setValue(protectedSubmit);
    }

    protected static native long getProtectedSubmitNative(long address);
    protected static native void setProtectedSubmitNative(long address, long protectedSubmit);


    public static native long sizeof();

    public static class Array extends VkProtectedSubmitInfo implements cz.mg.collections.array.ReadonlyArray<VkProtectedSubmitInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkProtectedSubmitInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO));;
        }

        public Array(int count, VkProtectedSubmitInfo o){
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
        public VkProtectedSubmitInfo get(int i){
            return new VkProtectedSubmitInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
