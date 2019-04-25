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

    public VkChar getPLabelName() {
        return new VkChar(getVkMemory(), getPLabelName(getVkAddress()));
    }

    private VkObject pLabelName = null;
    public void setPLabelName(VkChar pLabelName) {
        setPLabelName(getVkAddress(), pLabelName != null ? pLabelName.getVkAddress() : VkPointer.NULL);
        this.pLabelName = pLabelName;
    }

    public String getPLabelNameQ() {
        return new VkString(getPLabelName()).toString();
    }

    public void setPLabelName(String pLabelName) {
        setPLabelName(new VkString(pLabelName));
    }

    protected static native long getPLabelName(long address);
    protected static native void setPLabelName(long address, long pLabelName);

    public VkFloat getColor() {
        return new VkFloat(getVkMemory(), getColor(getVkAddress()));
    }

    
    public void setColor(VkFloat color) {
        setColor(getVkAddress(), color != null ? color.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getColor(long address);
    protected static native void setColor(long address, long color);


    public static native long sizeof();

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
            return new VkDebugUtilsLabelEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
