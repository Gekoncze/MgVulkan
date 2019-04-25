package cz.mg.vulkan;

public class VkDebugMarkerMarkerInfoEXT extends VkObject {
    public VkDebugMarkerMarkerInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT));
    }

    public VkDebugMarkerMarkerInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugMarkerMarkerInfoEXT(VkMemory vkmemory, long vkaddress) {
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

    public VkChar getPMarkerName() {
        return new VkChar(getVkMemory(), getPMarkerName(getVkAddress()));
    }

    private VkObject pMarkerName = null;
    public void setPMarkerName(VkChar pMarkerName) {
        setPMarkerName(getVkAddress(), pMarkerName != null ? pMarkerName.getVkAddress() : VkPointer.NULL);
        this.pMarkerName = pMarkerName;
    }

    public String getPMarkerNameQ() {
        return new VkString(getPMarkerName()).toString();
    }

    public void setPMarkerName(String pMarkerName) {
        setPMarkerName(new VkString(pMarkerName));
    }

    protected static native long getPMarkerName(long address);
    protected static native void setPMarkerName(long address, long pMarkerName);

    public VkFloat getColor() {
        return new VkFloat(getVkMemory(), getColor(getVkAddress()));
    }

    
    public void setColor(VkFloat color) {
        setColor(getVkAddress(), color != null ? color.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getColor(long address);
    protected static native void setColor(long address, long color);


    public static native long sizeof();

    public static class Array extends VkDebugMarkerMarkerInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugMarkerMarkerInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugMarkerMarkerInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT));;
        }

        public Array(int count, VkDebugMarkerMarkerInfoEXT o){
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
        public VkDebugMarkerMarkerInfoEXT get(int i){
            return new VkDebugMarkerMarkerInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
