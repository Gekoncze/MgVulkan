package cz.mg.vulkan;

public class VkSubpassSampleLocationsEXT extends VkObject {
    public VkSubpassSampleLocationsEXT() {
        super(sizeof());
    }

    public VkSubpassSampleLocationsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSubpassSampleLocationsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getSubpassIndex() {
        return new VkUInt32(getVkMemory(), getSubpassIndex(getVkAddress()));
    }

    
    public void setSubpassIndex(VkUInt32 subpassIndex) {
        setSubpassIndex(getVkAddress(), subpassIndex != null ? subpassIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubpassIndexQ() {
        return getSubpassIndex().getValue();
    }

    public void setSubpassIndex(int subpassIndex) {
        getSubpassIndex().setValue(subpassIndex);
    }

    protected static native long getSubpassIndex(long address);
    protected static native void setSubpassIndex(long address, long subpassIndex);

    public VkSampleLocationsInfoEXT getSampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(getVkMemory(), getSampleLocationsInfo(getVkAddress()));
    }

    
    public void setSampleLocationsInfo(VkSampleLocationsInfoEXT sampleLocationsInfo) {
        setSampleLocationsInfo(getVkAddress(), sampleLocationsInfo != null ? sampleLocationsInfo.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSampleLocationsInfo(long address);
    protected static native void setSampleLocationsInfo(long address, long sampleLocationsInfo);


    public static native long sizeof();

    public static class Array extends VkSubpassSampleLocationsEXT implements cz.mg.collections.array.ReadonlyArray<VkSubpassSampleLocationsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubpassSampleLocationsEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSubpassSampleLocationsEXT o){
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
        public VkSubpassSampleLocationsEXT get(int i){
            return new VkSubpassSampleLocationsEXT(getVkMemory(), addressAt(i));
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
