package cz.mg.vulkan;

public class VkSharedPresentSurfaceCapabilitiesKHR extends VkObject {
    public VkSharedPresentSurfaceCapabilitiesKHR() {
        super(sizeof());
    }

    public VkSharedPresentSurfaceCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSharedPresentSurfaceCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
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

    public VkImageUsageFlags getSharedPresentSupportedUsageFlags() {
        return new VkImageUsageFlags(getVkMemory(), getSharedPresentSupportedUsageFlags(getVkAddress()));
    }

    
    public void setSharedPresentSupportedUsageFlags(VkImageUsageFlags sharedPresentSupportedUsageFlags) {
        setSharedPresentSupportedUsageFlags(getVkAddress(), sharedPresentSupportedUsageFlags != null ? sharedPresentSupportedUsageFlags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSharedPresentSupportedUsageFlagsQ() {
        return getSharedPresentSupportedUsageFlags().getValue();
    }

    public void setSharedPresentSupportedUsageFlags(int sharedPresentSupportedUsageFlags) {
        getSharedPresentSupportedUsageFlags().setValue(sharedPresentSupportedUsageFlags);
    }

    protected static native long getSharedPresentSupportedUsageFlags(long address);
    protected static native void setSharedPresentSupportedUsageFlags(long address, long sharedPresentSupportedUsageFlags);


    public static native long sizeof();

    public static class Array extends VkSharedPresentSurfaceCapabilitiesKHR implements cz.mg.collections.array.ReadonlyArray<VkSharedPresentSurfaceCapabilitiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSharedPresentSurfaceCapabilitiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSharedPresentSurfaceCapabilitiesKHR o){
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
        public VkSharedPresentSurfaceCapabilitiesKHR get(int i){
            return new VkSharedPresentSurfaceCapabilitiesKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

        public static class Array extends VkSharedPresentSurfaceCapabilitiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSharedPresentSurfaceCapabilitiesKHR.Pointer> {
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

            public Array(VkSharedPresentSurfaceCapabilitiesKHR[] a) {
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
            public VkSharedPresentSurfaceCapabilitiesKHR.Pointer get(int i){
                return new VkSharedPresentSurfaceCapabilitiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
