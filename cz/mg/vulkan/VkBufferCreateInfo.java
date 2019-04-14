package cz.mg.vulkan;

public class VkBufferCreateInfo extends VkObject {
    public VkBufferCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO));
    }

    public VkBufferCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public VkBufferCreateFlags getFlags() {
        return new VkBufferCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkBufferCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSize(long address);
    private static native void setSize(long address, long size);

    public VkBufferUsageFlags getUsage() {
        return new VkBufferUsageFlags(getVkMemory(), getUsage(getVkAddress()));
    }

    
    public void setUsage(VkBufferUsageFlags usage) {
        setUsage(getVkAddress(), usage != null ? usage.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getUsage(long address);
    private static native void setUsage(long address, long usage);

    public VkSharingMode getSharingMode() {
        return new VkSharingMode(getVkMemory(), getSharingMode(getVkAddress()));
    }

    
    public void setSharingMode(VkSharingMode sharingMode) {
        setSharingMode(getVkAddress(), sharingMode != null ? sharingMode.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSharingMode(long address);
    private static native void setSharingMode(long address, long sharingMode);

    public VkUInt32 getQueueFamilyIndexCount() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndexCount(getVkAddress()));
    }

    
    public void setQueueFamilyIndexCount(VkUInt32 queueFamilyIndexCount) {
        setQueueFamilyIndexCount(getVkAddress(), queueFamilyIndexCount != null ? queueFamilyIndexCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getQueueFamilyIndexCount(long address);
    private static native void setQueueFamilyIndexCount(long address, long queueFamilyIndexCount);

    public VkUInt32 getPQueueFamilyIndices() {
        return new VkUInt32(getVkMemory(), getPQueueFamilyIndices(getVkAddress()));
    }

    private VkObject pQueueFamilyIndices = null;
    public void setPQueueFamilyIndices(VkUInt32 pQueueFamilyIndices) {
        setPQueueFamilyIndices(getVkAddress(), pQueueFamilyIndices != null ? pQueueFamilyIndices.getVkAddress() : VkPointer.NULL);
        this.pQueueFamilyIndices = pQueueFamilyIndices;
    }

    private static native long getPQueueFamilyIndices(long address);
    private static native void setPQueueFamilyIndices(long address, long pQueueFamilyIndices);


    public static native long sizeof();

    public static class Array extends VkBufferCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkBufferCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBufferCreateInfo o){
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
        public VkBufferCreateInfo get(int i){
            return new VkBufferCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkBufferCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBufferCreateInfo.Pointer> {
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

            public Array(VkBufferCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkBufferCreateInfo.Pointer get(int i){
                return new VkBufferCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
