package cz.mg.vulkan;

public class VkDisplayEventInfoEXT extends VkObject {
    public VkDisplayEventInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT));
    }

    public VkDisplayEventInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayEventInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayEventInfoEXT(VkPointer pointer) {
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

    public VkDisplayEventTypeEXT getDisplayEvent() {
        return new VkDisplayEventTypeEXT(getVkMemory(), getDisplayEventNative(getVkAddress()));
    }

    
    public void setDisplayEvent(VkDisplayEventTypeEXT displayEvent) {
        setDisplayEventNative(getVkAddress(), displayEvent != null ? displayEvent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDisplayEventQ() {
        return getDisplayEvent().getValue();
    }

    public void setDisplayEvent(int displayEvent) {
        getDisplayEvent().setValue(displayEvent);
    }

    protected static native long getDisplayEventNative(long address);
    protected static native void setDisplayEventNative(long address, long displayEvent);


    public void set(VkDisplayEventInfoEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDisplayEventInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDisplayEventInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayEventInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT));;
        }

        public Array(VkDisplayEventInfoEXT o, int count){
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
        public VkDisplayEventInfoEXT get(int i){
            return new VkDisplayEventInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
