package cz.mg.vulkan;

public class VkDisplayPowerInfoEXT extends VkObject {
    public VkDisplayPowerInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT));
    }

    public VkDisplayPowerInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayPowerInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayPowerInfoEXT(VkPointer pointer) {
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

    public VkDisplayPowerStateEXT getPowerState() {
        return new VkDisplayPowerStateEXT(getVkMemory(), getPowerStateNative(getVkAddress()));
    }

    
    public void setPowerState(VkDisplayPowerStateEXT powerState) {
        setPowerStateNative(getVkAddress(), powerState != null ? powerState.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPowerStateQ() {
        return getPowerState().getValue();
    }

    public void setPowerState(int powerState) {
        getPowerState().setValue(powerState);
    }

    protected static native long getPowerStateNative(long address);
    protected static native void setPowerStateNative(long address, long powerState);


    public static native long sizeof();

    public static class Array extends VkDisplayPowerInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDisplayPowerInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayPowerInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT));;
        }

        public Array(int count, VkDisplayPowerInfoEXT o){
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
        public VkDisplayPowerInfoEXT get(int i){
            return new VkDisplayPowerInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
