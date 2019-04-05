package cz.mg.vulkan.vk;

public class VkDescriptorSetLayoutSupport extends VkObject {
    public VkDescriptorSetLayoutSupport() {
        super(sizeof());
    }

    public VkDescriptorSetLayoutSupport(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetLayoutSupport(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorSetLayoutSupport(VkStructureType sType, VkObject pNext, VkBool32 supported) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setSupported(supported);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
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

    public VkBool32 getSupported() {
        return new VkBool32(getVkMemory(), getSupported(getVkAddress()));
    }

    
    public void setSupported(VkBool32 supported) {
        setSupported(getVkAddress(), supported != null ? supported.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSupported(long address);
    private static native void setSupported(long address, long supported);


    public static native long sizeof();

    public static class Array extends VkDescriptorSetLayoutSupport implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetLayoutSupport> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetLayoutSupport.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorSetLayoutSupport o){
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
        public VkDescriptorSetLayoutSupport get(int i){
            return new VkDescriptorSetLayoutSupport(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDescriptorSetLayoutSupport.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetLayoutSupport.Pointer> {
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

            public Array(VkDescriptorSetLayoutSupport[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorSetLayoutSupport.Pointer get(int i){
                return new VkDescriptorSetLayoutSupport.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
