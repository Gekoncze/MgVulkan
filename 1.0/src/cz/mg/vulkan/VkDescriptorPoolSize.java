package cz.mg.vulkan;

public class VkDescriptorPoolSize extends VkObject {
    public VkDescriptorPoolSize() {
        super(sizeof());
    }

    protected VkDescriptorPoolSize(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorPoolSize(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorPoolSize(VkPointer pointer) {
        super(pointer);
    }



    public VkDescriptorType getType() {
        return new VkDescriptorType(getVkMemory(), getTypeNative(getVkAddress()));
    }

    
    public void setType(VkDescriptorType type) {
        setTypeNative(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTypeQ() {
        return getType().getValue();
    }

    public void setType(int type) {
        getType().setValue(type);
    }

    protected static native long getTypeNative(long address);
    protected static native void setTypeNative(long address, long type);

    public VkUInt32 getDescriptorCount() {
        return new VkUInt32(getVkMemory(), getDescriptorCountNative(getVkAddress()));
    }

    
    public void setDescriptorCount(VkUInt32 descriptorCount) {
        setDescriptorCountNative(getVkAddress(), descriptorCount != null ? descriptorCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorCountQ() {
        return getDescriptorCount().getValue();
    }

    public void setDescriptorCount(int descriptorCount) {
        getDescriptorCount().setValue(descriptorCount);
    }

    protected static native long getDescriptorCountNative(long address);
    protected static native void setDescriptorCountNative(long address, long descriptorCount);


    public static native long sizeof();

    public static class Array extends VkDescriptorPoolSize implements cz.mg.collections.array.ReadonlyArray<VkDescriptorPoolSize> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorPoolSize.sizeof()));
            this.count = count;
        }

        public Array(VkDescriptorPoolSize o, int count){
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
        public VkDescriptorPoolSize get(int i){
            return new VkDescriptorPoolSize(getVkMemory(), address(i));
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
