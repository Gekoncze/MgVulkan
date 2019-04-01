package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAllocationCallbacks.html">khronos documentation</a>
 **/
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


    public VkAllocationCallbacks(VkObject pUserData, PFNvkAllocationFunction pfnAllocation, PFNvkReallocationFunction pfnReallocation, PFNvkFreeFunction pfnFree, PFNvkInternalAllocationNotification pfnInternalAllocation, PFNvkInternalFreeNotification pfnInternalFree) {
        super(sizeof());
        setPUserData(pUserData);
        setPfnAllocation(pfnAllocation);
        setPfnReallocation(pfnReallocation);
        setPfnFree(pfnFree);
        setPfnInternalAllocation(pfnInternalAllocation);
        setPfnInternalFree(pfnInternalFree);
    }

    public VkObject getPUserData() {
        return new VkObject(getVkMemory(), getPUserData(getVkAddress()));
    }

    private VkObject pUserData = null;
    public void setPUserData(VkObject pUserData) {
        setPUserData(getVkAddress(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL);
        this.pUserData = pUserData;
    }

    private static native long getPUserData(long address);
    private static native void setPUserData(long address, long pUserData);

    public PFNvkAllocationFunction getPfnAllocation() {
        return new PFNvkAllocationFunction(getVkMemory(), getPfnAllocation(getVkAddress()));
    }

    
    public void setPfnAllocation(PFNvkAllocationFunction pfnAllocation) {
        setPfnAllocation(getVkAddress(), pfnAllocation != null ? pfnAllocation.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPfnAllocation(long address);
    private static native void setPfnAllocation(long address, long pfnAllocation);

    public PFNvkReallocationFunction getPfnReallocation() {
        return new PFNvkReallocationFunction(getVkMemory(), getPfnReallocation(getVkAddress()));
    }

    
    public void setPfnReallocation(PFNvkReallocationFunction pfnReallocation) {
        setPfnReallocation(getVkAddress(), pfnReallocation != null ? pfnReallocation.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPfnReallocation(long address);
    private static native void setPfnReallocation(long address, long pfnReallocation);

    public PFNvkFreeFunction getPfnFree() {
        return new PFNvkFreeFunction(getVkMemory(), getPfnFree(getVkAddress()));
    }

    
    public void setPfnFree(PFNvkFreeFunction pfnFree) {
        setPfnFree(getVkAddress(), pfnFree != null ? pfnFree.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPfnFree(long address);
    private static native void setPfnFree(long address, long pfnFree);

    public PFNvkInternalAllocationNotification getPfnInternalAllocation() {
        return new PFNvkInternalAllocationNotification(getVkMemory(), getPfnInternalAllocation(getVkAddress()));
    }

    
    public void setPfnInternalAllocation(PFNvkInternalAllocationNotification pfnInternalAllocation) {
        setPfnInternalAllocation(getVkAddress(), pfnInternalAllocation != null ? pfnInternalAllocation.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPfnInternalAllocation(long address);
    private static native void setPfnInternalAllocation(long address, long pfnInternalAllocation);

    public PFNvkInternalFreeNotification getPfnInternalFree() {
        return new PFNvkInternalFreeNotification(getVkMemory(), getPfnInternalFree(getVkAddress()));
    }

    
    public void setPfnInternalFree(PFNvkInternalFreeNotification pfnInternalFree) {
        setPfnInternalFree(getVkAddress(), pfnInternalFree != null ? pfnInternalFree.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPfnInternalFree(long address);
    private static native void setPfnInternalFree(long address, long pfnInternalFree);


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
            return new VkAllocationCallbacks(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkAllocationCallbacks.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkAllocationCallbacks[] a) {
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
