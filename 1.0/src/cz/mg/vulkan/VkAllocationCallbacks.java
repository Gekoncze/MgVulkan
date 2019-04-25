package cz.mg.vulkan;

public class VkAllocationCallbacks extends VkObject {
    public VkAllocationCallbacks() {
        super(sizeof());
    }

    public VkAllocationCallbacks(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAllocationCallbacks(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkObject getPUserData() {
        return new VkObject(getVkMemory(), getPUserData(getVkAddress()));
    }

    private VkObject pUserData = null;
    public void setPUserData(VkObject pUserData) {
        setPUserData(getVkAddress(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL);
        this.pUserData = pUserData;
    }

    protected static native long getPUserData(long address);
    protected static native void setPUserData(long address, long pUserData);

    public PFNvkAllocationFunction getPfnAllocation() {
        return new PFNvkAllocationFunction(getVkMemory(), getPfnAllocation(getVkAddress()));
    }

    
    public void setPfnAllocation(PFNvkAllocationFunction pfnAllocation) {
        setPfnAllocation(getVkAddress(), pfnAllocation != null ? pfnAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPfnAllocation(long address);
    protected static native void setPfnAllocation(long address, long pfnAllocation);

    public PFNvkReallocationFunction getPfnReallocation() {
        return new PFNvkReallocationFunction(getVkMemory(), getPfnReallocation(getVkAddress()));
    }

    
    public void setPfnReallocation(PFNvkReallocationFunction pfnReallocation) {
        setPfnReallocation(getVkAddress(), pfnReallocation != null ? pfnReallocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPfnReallocation(long address);
    protected static native void setPfnReallocation(long address, long pfnReallocation);

    public PFNvkFreeFunction getPfnFree() {
        return new PFNvkFreeFunction(getVkMemory(), getPfnFree(getVkAddress()));
    }

    
    public void setPfnFree(PFNvkFreeFunction pfnFree) {
        setPfnFree(getVkAddress(), pfnFree != null ? pfnFree.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPfnFree(long address);
    protected static native void setPfnFree(long address, long pfnFree);

    public PFNvkInternalAllocationNotification getPfnInternalAllocation() {
        return new PFNvkInternalAllocationNotification(getVkMemory(), getPfnInternalAllocation(getVkAddress()));
    }

    
    public void setPfnInternalAllocation(PFNvkInternalAllocationNotification pfnInternalAllocation) {
        setPfnInternalAllocation(getVkAddress(), pfnInternalAllocation != null ? pfnInternalAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPfnInternalAllocation(long address);
    protected static native void setPfnInternalAllocation(long address, long pfnInternalAllocation);

    public PFNvkInternalFreeNotification getPfnInternalFree() {
        return new PFNvkInternalFreeNotification(getVkMemory(), getPfnInternalFree(getVkAddress()));
    }

    
    public void setPfnInternalFree(PFNvkInternalFreeNotification pfnInternalFree) {
        setPfnInternalFree(getVkAddress(), pfnInternalFree != null ? pfnInternalFree.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPfnInternalFree(long address);
    protected static native void setPfnInternalFree(long address, long pfnInternalFree);


    public static native long sizeof();

    public static class Array extends VkAllocationCallbacks implements cz.mg.collections.array.ReadonlyArray<VkAllocationCallbacks> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAllocationCallbacks.sizeof()));
            this.count = count;
        }

        public Array(int count, VkAllocationCallbacks o){
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
        public VkAllocationCallbacks get(int i){
            return new VkAllocationCallbacks(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
