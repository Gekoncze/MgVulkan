package cz.mg.vulkan;

public class VkAllocationCallbacks extends VkObject {
    public VkAllocationCallbacks() {
        super(sizeof());
    }

    protected VkAllocationCallbacks(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkAllocationCallbacks(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkAllocationCallbacks(VkPointer pointer) {
        super(pointer);
    }



    public VkObject getPUserData() {
        return new VkObject(getVkMemory(), getPUserDataNative(getVkAddress()));
    }

    private VkObject pUserData = null;
    public void setPUserData(VkObject pUserData) {
        setPUserDataNative(getVkAddress(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL);
        this.pUserData = pUserData;
    }

    protected static native long getPUserDataNative(long address);
    protected static native void setPUserDataNative(long address, long pUserData);

    public PFNvkAllocationFunction getPfnAllocation() {
        return new PFNvkAllocationFunction(getVkMemory(), getPfnAllocationNative(getVkAddress()));
    }

    
    public void setPfnAllocation(PFNvkAllocationFunction pfnAllocation) {
        setPfnAllocationNative(getVkAddress(), pfnAllocation != null ? pfnAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPfnAllocationNative(long address);
    protected static native void setPfnAllocationNative(long address, long pfnAllocation);

    public PFNvkReallocationFunction getPfnReallocation() {
        return new PFNvkReallocationFunction(getVkMemory(), getPfnReallocationNative(getVkAddress()));
    }

    
    public void setPfnReallocation(PFNvkReallocationFunction pfnReallocation) {
        setPfnReallocationNative(getVkAddress(), pfnReallocation != null ? pfnReallocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPfnReallocationNative(long address);
    protected static native void setPfnReallocationNative(long address, long pfnReallocation);

    public PFNvkFreeFunction getPfnFree() {
        return new PFNvkFreeFunction(getVkMemory(), getPfnFreeNative(getVkAddress()));
    }

    
    public void setPfnFree(PFNvkFreeFunction pfnFree) {
        setPfnFreeNative(getVkAddress(), pfnFree != null ? pfnFree.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPfnFreeNative(long address);
    protected static native void setPfnFreeNative(long address, long pfnFree);

    public PFNvkInternalAllocationNotification getPfnInternalAllocation() {
        return new PFNvkInternalAllocationNotification(getVkMemory(), getPfnInternalAllocationNative(getVkAddress()));
    }

    
    public void setPfnInternalAllocation(PFNvkInternalAllocationNotification pfnInternalAllocation) {
        setPfnInternalAllocationNative(getVkAddress(), pfnInternalAllocation != null ? pfnInternalAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPfnInternalAllocationNative(long address);
    protected static native void setPfnInternalAllocationNative(long address, long pfnInternalAllocation);

    public PFNvkInternalFreeNotification getPfnInternalFree() {
        return new PFNvkInternalFreeNotification(getVkMemory(), getPfnInternalFreeNative(getVkAddress()));
    }

    
    public void setPfnInternalFree(PFNvkInternalFreeNotification pfnInternalFree) {
        setPfnInternalFreeNative(getVkAddress(), pfnInternalFree != null ? pfnInternalFree.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPfnInternalFreeNative(long address);
    protected static native void setPfnInternalFreeNative(long address, long pfnInternalFree);


    public static native long sizeof();

    public static class Array extends VkAllocationCallbacks implements cz.mg.collections.array.ReadonlyArray<VkAllocationCallbacks> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAllocationCallbacks.sizeof()));
            this.count = count;
        }

        public Array(VkAllocationCallbacks o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkAllocationCallbacks get(int i){
            return new VkAllocationCallbacks(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
