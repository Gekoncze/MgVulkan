package cz.mg.vulkan;

public class VkDescriptorPoolSize extends VkObject {
    public VkDescriptorPoolSize() {
        super(sizeof());
    }

    public VkDescriptorPoolSize(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorPoolSize(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDescriptorType getType() {
        return new VkDescriptorType(getVkMemory(), getType(getVkAddress()));
    }

    
    public void setType(VkDescriptorType type) {
        setType(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTypeQ() {
        return getType().getValue();
    }

    public void setType(int type) {
        getType().setValue(type);
    }

    protected static native long getType(long address);
    protected static native void setType(long address, long type);

    public VkUInt32 getDescriptorCount() {
        return new VkUInt32(getVkMemory(), getDescriptorCount(getVkAddress()));
    }

    
    public void setDescriptorCount(VkUInt32 descriptorCount) {
        setDescriptorCount(getVkAddress(), descriptorCount != null ? descriptorCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorCountQ() {
        return getDescriptorCount().getValue();
    }

    public void setDescriptorCount(int descriptorCount) {
        getDescriptorCount().setValue(descriptorCount);
    }

    protected static native long getDescriptorCount(long address);
    protected static native void setDescriptorCount(long address, long descriptorCount);


    public static native long sizeof();

    public static class Array extends VkDescriptorPoolSize implements cz.mg.collections.array.ReadonlyArray<VkDescriptorPoolSize> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorPoolSize.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorPoolSize o){
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
        public VkDescriptorPoolSize get(int i){
            return new VkDescriptorPoolSize(getVkMemory(), addressAt(i));
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
