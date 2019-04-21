package cz.mg.vulkan;

public class VkExternalBufferPropertiesKHR extends VkObject {
    public VkExternalBufferPropertiesKHR() {
        super(sizeof());
    }

    public VkExternalBufferPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalBufferPropertiesKHR(VkMemory vkmemory, long vkaddress) {
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

    public VkExternalMemoryPropertiesKHR getExternalMemoryProperties() {
        return new VkExternalMemoryPropertiesKHR(getVkMemory(), getExternalMemoryProperties(getVkAddress()));
    }

    
    public void setExternalMemoryProperties(VkExternalMemoryPropertiesKHR externalMemoryProperties) {
        setExternalMemoryProperties(getVkAddress(), externalMemoryProperties != null ? externalMemoryProperties.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getExternalMemoryProperties(long address);
    private static native void setExternalMemoryProperties(long address, long externalMemoryProperties);


    public static native long sizeof();

    public static class Array extends VkExternalBufferPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkExternalBufferPropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalBufferPropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExternalBufferPropertiesKHR o){
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
        public VkExternalBufferPropertiesKHR get(int i){
            return new VkExternalBufferPropertiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExternalBufferPropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkExternalBufferPropertiesKHR.Pointer> {
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

            public Array(VkExternalBufferPropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkExternalBufferPropertiesKHR.Pointer get(int i){
                return new VkExternalBufferPropertiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
