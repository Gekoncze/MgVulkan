package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPowerInfoEXT.html">khronos documentation</a>
 **/
public class VkDisplayPowerInfoEXT extends VkObject {
    public VkDisplayPowerInfoEXT() {
        super(sizeof());
    }

    public VkDisplayPowerInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayPowerInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDisplayPowerInfoEXT(VkObject pNext, VkDisplayPowerStateEXT powerState) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT));
        setPNext(pNext);
        setPowerState(powerState);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
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

    public VkDisplayPowerStateEXT getPowerState() {
        return new VkDisplayPowerStateEXT(getVkMemory(), getPowerState(getVkAddress()));
    }

    
    public void setPowerState(VkDisplayPowerStateEXT powerState) {
        setPowerState(getVkAddress(), powerState != null ? powerState.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPowerState(long address);
    private static native void setPowerState(long address, long powerState);


    public static native long sizeof();

    public static class Array extends VkDisplayPowerInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDisplayPowerInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayPowerInfoEXT.sizeof()));
            this.count = count;
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

        public static class Array extends VkDisplayPowerInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkDisplayPowerInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
