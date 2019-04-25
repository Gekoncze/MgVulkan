package cz.mg.vulkan;

public class VkDeviceQueueInfo2 extends VkObject {
    public VkDeviceQueueInfo2() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2));
    }

    public VkDeviceQueueInfo2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceQueueInfo2(VkMemory vkmemory, long vkaddress) {
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

    public VkDeviceQueueCreateFlags getFlags() {
        return new VkDeviceQueueCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDeviceQueueCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkUInt32 getQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndex(getVkAddress()));
    }

    
    public void setQueueFamilyIndex(VkUInt32 queueFamilyIndex) {
        setQueueFamilyIndex(getVkAddress(), queueFamilyIndex != null ? queueFamilyIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueFamilyIndexQ() {
        return getQueueFamilyIndex().getValue();
    }

    public void setQueueFamilyIndex(int queueFamilyIndex) {
        getQueueFamilyIndex().setValue(queueFamilyIndex);
    }

    protected static native long getQueueFamilyIndex(long address);
    protected static native void setQueueFamilyIndex(long address, long queueFamilyIndex);

    public VkUInt32 getQueueIndex() {
        return new VkUInt32(getVkMemory(), getQueueIndex(getVkAddress()));
    }

    
    public void setQueueIndex(VkUInt32 queueIndex) {
        setQueueIndex(getVkAddress(), queueIndex != null ? queueIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueIndexQ() {
        return getQueueIndex().getValue();
    }

    public void setQueueIndex(int queueIndex) {
        getQueueIndex().setValue(queueIndex);
    }

    protected static native long getQueueIndex(long address);
    protected static native void setQueueIndex(long address, long queueIndex);


    public static native long sizeof();

    public static class Array extends VkDeviceQueueInfo2 implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueInfo2> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceQueueInfo2.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2));;
        }

        public Array(int count, VkDeviceQueueInfo2 o){
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
        public VkDeviceQueueInfo2 get(int i){
            return new VkDeviceQueueInfo2(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceQueueInfo2.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueInfo2.Pointer> {
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

            public Array(VkDeviceQueueInfo2[] a) {
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
            public VkDeviceQueueInfo2.Pointer get(int i){
                return new VkDeviceQueueInfo2.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
