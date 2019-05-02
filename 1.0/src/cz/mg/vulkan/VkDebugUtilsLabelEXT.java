package cz.mg.vulkan;

public class VkDebugUtilsLabelEXT extends VkObject {
    public VkDebugUtilsLabelEXT() {
        super(sizeof());
    }

    protected VkDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDebugUtilsLabelEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkChar getPLabelName() {
        return new VkChar(getVkMemory(), getPLabelNameNative(getVkAddress()));
    }

    private VkObject pLabelName = null;
    public void setPLabelName(VkChar pLabelName) {
        setPLabelNameNative(getVkAddress(), pLabelName != null ? pLabelName.getVkAddress() : VkPointer.NULL);
        this.pLabelName = pLabelName;
    }

    public String getPLabelNameQ() {
        return new VkString(getPLabelName()).toString();
    }

    public void setPLabelName(String pLabelName) {
        setPLabelName(new VkString(pLabelName));
    }

    protected static native long getPLabelNameNative(long address);
    protected static native void setPLabelNameNative(long address, long pLabelName);

    public VkFloat getColor() {
        return new VkFloat(getVkMemory(), getColorNative(getVkAddress()));
    }

    
    public void setColor(VkFloat color) {
        setColorNative(getVkAddress(), color != null ? color.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getColorNative(long address);
    protected static native void setColorNative(long address, long color);


    public void set(VkDebugUtilsLabelEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDebugUtilsLabelEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsLabelEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsLabelEXT.sizeof()));
            this.count = count;
        }

        public Array(VkDebugUtilsLabelEXT o, int count){
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
        public VkDebugUtilsLabelEXT get(int i){
            return new VkDebugUtilsLabelEXT(getVkMemory(), address(i));
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
