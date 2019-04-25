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

    public VkFormatProperties getFormatProperties() {
        return new VkFormatProperties(getVkMemory(), getFormatProperties(getVkAddress()));
    }

    
    public void setFormatProperties(VkFormatProperties formatProperties) {
        setFormatProperties(getVkAddress(), formatProperties != null ? formatProperties.getVkAddress() : VkPointer.getNullAddressNative());
        
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
            return new VkFormatProperties2KHR(getVkMemory(), addressAt(i));
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
