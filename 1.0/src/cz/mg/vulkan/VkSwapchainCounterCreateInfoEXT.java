package cz.mg.vulkan;

public class VkSwapchainCounterCreateInfoEXT extends VkObject {
    public VkSwapchainCounterCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT));
    }

    public VkSwapchainCounterCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSwapchainCounterCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
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

    public VkSurfaceCounterFlagsEXT getSurfaceCounters() {
        return new VkSurfaceCounterFlagsEXT(getVkMemory(), getSurfaceCounters(getVkAddress()));
    }

    
    public void setSurfaceCounters(VkSurfaceCounterFlagsEXT surfaceCounters) {
        setSurfaceCounters(getVkAddress(), surfaceCounters != null ? surfaceCounters.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSurfaceCountersQ() {
        return getSurfaceCounters().getValue();
    }

    public void setSurfaceCounters(int surfaceCounters) {
        getSurfaceCounters().setValue(surfaceCounters);
    }

    protected static native long getSurfaceCounters(long address);
    protected static native void setSurfaceCounters(long address, long surfaceCounters);


    public static native long sizeof();

    public static class Array extends VkSwapchainCounterCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkSwapchainCounterCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSwapchainCounterCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT));;
        }

        public Array(int count, VkSwapchainCounterCreateInfoEXT o){
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
        public VkSwapchainCounterCreateInfoEXT get(int i){
            return new VkSwapchainCounterCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSwapchainCounterCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSwapchainCounterCreateInfoEXT.Pointer> {
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

            public Array(VkSwapchainCounterCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSwapchainCounterCreateInfoEXT.Pointer get(int i){
                return new VkSwapchainCounterCreateInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
