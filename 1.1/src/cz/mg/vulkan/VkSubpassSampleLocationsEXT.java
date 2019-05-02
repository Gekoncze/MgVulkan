package cz.mg.vulkan;

public class VkSubpassSampleLocationsEXT extends VkObject {
    public VkSubpassSampleLocationsEXT() {
        super(sizeof());
    }

    protected VkSubpassSampleLocationsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSubpassSampleLocationsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSubpassSampleLocationsEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getSubpassIndex() {
        return new VkUInt32(getVkMemory(), getSubpassIndexNative(getVkAddress()));
    }

    
    public void setSubpassIndex(VkUInt32 subpassIndex) {
        setSubpassIndexNative(getVkAddress(), subpassIndex != null ? subpassIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubpassIndexQ() {
        return getSubpassIndex().getValue();
    }

    public void setSubpassIndex(int subpassIndex) {
        getSubpassIndex().setValue(subpassIndex);
    }

    protected static native long getSubpassIndexNative(long address);
    protected static native void setSubpassIndexNative(long address, long subpassIndex);

    public VkSampleLocationsInfoEXT getSampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(getVkMemory(), getSampleLocationsInfoNative(getVkAddress()));
    }

    
    public void setSampleLocationsInfo(VkSampleLocationsInfoEXT sampleLocationsInfo) {
        setSampleLocationsInfoNative(getVkAddress(), sampleLocationsInfo != null ? sampleLocationsInfo.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSampleLocationsInfoNative(long address);
    protected static native void setSampleLocationsInfoNative(long address, long sampleLocationsInfo);


    public void set(VkSubpassSampleLocationsEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSubpassSampleLocationsEXT implements cz.mg.collections.array.ReadonlyArray<VkSubpassSampleLocationsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubpassSampleLocationsEXT.sizeof()));
            this.count = count;
        }

        public Array(VkSubpassSampleLocationsEXT o, int count){
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
        public VkSubpassSampleLocationsEXT get(int i){
            return new VkSubpassSampleLocationsEXT(getVkMemory(), address(i));
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
