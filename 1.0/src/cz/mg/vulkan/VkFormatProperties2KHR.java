package cz.mg.vulkan;

public class VkFormatProperties2KHR extends VkObject {
    public VkFormatProperties2KHR() {
        super(sizeof());
    }

    public VkFormatProperties2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFormatProperties2KHR(VkMemory vkmemory, long vkaddress) {
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

    public VkFormatProperties getFormatProperties() {
        return new VkFormatProperties(getVkMemory(), getFormatProperties(getVkAddress()));
    }

    
    public void setFormatProperties(VkFormatProperties formatProperties) {
        setFormatProperties(getVkAddress(), formatProperties != null ? formatProperties.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getFormatProperties(long address);
    protected static native void setFormatProperties(long address, long formatProperties);


    public static native long sizeof();

    public static class Array extends VkFormatProperties2KHR implements cz.mg.collections.array.ReadonlyArray<VkFormatProperties2KHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFormatProperties2KHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFormatProperties2KHR o){
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
        public VkFormatProperties2KHR get(int i){
            return new VkFormatProperties2KHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkFormatProperties2KHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkFormatProperties2KHR.Pointer> {
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

            public Array(VkFormatProperties2KHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkFormatProperties2KHR.Pointer get(int i){
                return new VkFormatProperties2KHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
