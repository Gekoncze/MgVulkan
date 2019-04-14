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
        setType(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setType(int type) {
        getType().setValue(type);
    }

    private static native long getType(long address);
    private static native void setType(long address, long type);

    public VkUInt32 getDescriptorCount() {
        return new VkUInt32(getVkMemory(), getDescriptorCount(getVkAddress()));
    }

    
    public void setDescriptorCount(VkUInt32 descriptorCount) {
        setDescriptorCount(getVkAddress(), descriptorCount != null ? descriptorCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setDescriptorCount(int descriptorCount) {
        getDescriptorCount().setValue(descriptorCount);
    }

    private static native long getDescriptorCount(long address);
    private static native void setDescriptorCount(long address, long descriptorCount);


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
            return new VkDescriptorPoolSize(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDescriptorPoolSize.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorPoolSize.Pointer> {
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

            public Array(VkDescriptorPoolSize[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorPoolSize.Pointer get(int i){
                return new VkDescriptorPoolSize.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
