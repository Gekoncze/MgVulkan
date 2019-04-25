package cz.mg.vulkan;

public class VkPhysicalDeviceMaintenance3Properties extends VkObject {
    public VkPhysicalDeviceMaintenance3Properties() {
        super(sizeof());
    }

    public VkPhysicalDeviceMaintenance3Properties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceMaintenance3Properties(VkMemory vkmemory, long vkaddress) {
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

    public VkUInt32 getMaxPerSetDescriptors() {
        return new VkUInt32(getVkMemory(), getMaxPerSetDescriptors(getVkAddress()));
    }

    
    public void setMaxPerSetDescriptors(VkUInt32 maxPerSetDescriptors) {
        setMaxPerSetDescriptors(getVkAddress(), maxPerSetDescriptors != null ? maxPerSetDescriptors.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxPerSetDescriptorsQ() {
        return getMaxPerSetDescriptors().getValue();
    }

    public void setMaxPerSetDescriptors(int maxPerSetDescriptors) {
        getMaxPerSetDescriptors().setValue(maxPerSetDescriptors);
    }

    protected static native long getMaxPerSetDescriptors(long address);
    protected static native void setMaxPerSetDescriptors(long address, long maxPerSetDescriptors);

    public VkDeviceSize getMaxMemoryAllocationSize() {
        return new VkDeviceSize(getVkMemory(), getMaxMemoryAllocationSize(getVkAddress()));
    }

    
    public void setMaxMemoryAllocationSize(VkDeviceSize maxMemoryAllocationSize) {
        setMaxMemoryAllocationSize(getVkAddress(), maxMemoryAllocationSize != null ? maxMemoryAllocationSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMaxMemoryAllocationSizeQ() {
        return getMaxMemoryAllocationSize().getValue();
    }

    public void setMaxMemoryAllocationSize(long maxMemoryAllocationSize) {
        getMaxMemoryAllocationSize().setValue(maxMemoryAllocationSize);
    }

    protected static native long getMaxMemoryAllocationSize(long address);
    protected static native void setMaxMemoryAllocationSize(long address, long maxMemoryAllocationSize);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceMaintenance3Properties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMaintenance3Properties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceMaintenance3Properties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceMaintenance3Properties o){
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
        public VkPhysicalDeviceMaintenance3Properties get(int i){
            return new VkPhysicalDeviceMaintenance3Properties(getVkMemory(), addressAt(i));
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

        public static class Array extends VkPhysicalDeviceMaintenance3Properties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMaintenance3Properties.Pointer> {
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

            public Array(VkPhysicalDeviceMaintenance3Properties[] a) {
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
            public VkPhysicalDeviceMaintenance3Properties.Pointer get(int i){
                return new VkPhysicalDeviceMaintenance3Properties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
