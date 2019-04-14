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
        setSubpassIndex(getVkAddress(), subpassIndex != null ? subpassIndex.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSubpassIndex(long address);
    private static native void setSubpassIndex(long address, long subpassIndex);

    public VkSampleLocationsInfoEXT getSampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(getVkMemory(), getSampleLocationsInfo(getVkAddress()));
    }

    
    public void setSampleLocationsInfo(VkSampleLocationsInfoEXT sampleLocationsInfo) {
        setSampleLocationsInfo(getVkAddress(), sampleLocationsInfo != null ? sampleLocationsInfo.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSampleLocationsInfo(long address);
    private static native void setSampleLocationsInfo(long address, long sampleLocationsInfo);


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
            return new VkSubpassSampleLocationsEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSubpassSampleLocationsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSubpassSampleLocationsEXT.Pointer> {
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

            public Array(VkSubpassSampleLocationsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSubpassSampleLocationsEXT.Pointer get(int i){
                return new VkSubpassSampleLocationsEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
