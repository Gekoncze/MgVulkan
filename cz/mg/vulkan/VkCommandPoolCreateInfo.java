package cz.mg.vulkan;

public class VkCommandPoolCreateInfo extends VkObject {
    public VkCommandPoolCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO));
    }

    public VkCommandPoolCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPoolCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
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

    public VkCommandPoolCreateFlags getFlags() {
        return new VkCommandPoolCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkCommandPoolCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndex(getVkAddress()));
    }

    
    public void setQueueFamilyIndex(VkUInt32 queueFamilyIndex) {
        setQueueFamilyIndex(getVkAddress(), queueFamilyIndex != null ? queueFamilyIndex.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getQueueFamilyIndexQ() {
        return getQueueFamilyIndex().getValue();
    }

    public void setQueueFamilyIndex(int queueFamilyIndex) {
        getQueueFamilyIndex().setValue(queueFamilyIndex);
    }

    private static native long getQueueFamilyIndex(long address);
    private static native void setQueueFamilyIndex(long address, long queueFamilyIndex);


    public static native long sizeof();

    public static class Array extends VkCommandPoolCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkCommandPoolCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandPoolCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCommandPoolCreateInfo o){
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
        public VkCommandPoolCreateInfo get(int i){
            return new VkCommandPoolCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCommandPoolCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkCommandPoolCreateInfo.Pointer> {
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

            public Array(VkCommandPoolCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkCommandPoolCreateInfo.Pointer get(int i){
                return new VkCommandPoolCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
