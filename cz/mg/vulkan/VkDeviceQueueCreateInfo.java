package cz.mg.vulkan;

public class VkDeviceQueueCreateInfo extends VkObject {
    public VkDeviceQueueCreateInfo() {
        super(sizeof());
    }

    public VkDeviceQueueCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceQueueCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceQueueCreateInfo(VkObject pNext, VkDeviceQueueCreateFlags flags, VkUInt32 queueFamilyIndex, VkUInt32 queueCount, VkFloat pQueuePriorities) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setQueueFamilyIndex(queueFamilyIndex);
        setQueueCount(queueCount);
        setPQueuePriorities(pQueuePriorities);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkDeviceQueueCreateFlags getFlags() {
        return new VkDeviceQueueCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDeviceQueueCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndex(getVkAddress()));
    }

    
    public void setQueueFamilyIndex(VkUInt32 queueFamilyIndex) {
        setQueueFamilyIndex(getVkAddress(), queueFamilyIndex != null ? queueFamilyIndex.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getQueueFamilyIndex(long address);
    private static native void setQueueFamilyIndex(long address, long queueFamilyIndex);

    public VkUInt32 getQueueCount() {
        return new VkUInt32(getVkMemory(), getQueueCount(getVkAddress()));
    }

    
    public void setQueueCount(VkUInt32 queueCount) {
        setQueueCount(getVkAddress(), queueCount != null ? queueCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getQueueCount(long address);
    private static native void setQueueCount(long address, long queueCount);

    public VkFloat getPQueuePriorities() {
        return new VkFloat(getVkMemory(), getPQueuePriorities(getVkAddress()));
    }

    private VkObject pQueuePriorities = null;
    public void setPQueuePriorities(VkFloat pQueuePriorities) {
        setPQueuePriorities(getVkAddress(), pQueuePriorities != null ? pQueuePriorities.getVkAddress() : VkPointer.NULL);
        this.pQueuePriorities = pQueuePriorities;
    }

    private static native long getPQueuePriorities(long address);
    private static native void setPQueuePriorities(long address, long pQueuePriorities);


    public static native long sizeof();

    public static class Array extends VkDeviceQueueCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceQueueCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceQueueCreateInfo o){
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
        public VkDeviceQueueCreateInfo get(int i){
            return new VkDeviceQueueCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceQueueCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueCreateInfo.Pointer> {
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

            public Array(VkDeviceQueueCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceQueueCreateInfo.Pointer get(int i){
                return new VkDeviceQueueCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
