package cz.mg.vulkan;

public class VkAttachmentSampleLocationsEXT extends VkObject {
    public VkAttachmentSampleLocationsEXT() {
        super(sizeof());
    }

    public VkAttachmentSampleLocationsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAttachmentSampleLocationsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getAttachmentIndex() {
        return new VkUInt32(getVkMemory(), getAttachmentIndex(getVkAddress()));
    }

    
    public void setAttachmentIndex(VkUInt32 attachmentIndex) {
        setAttachmentIndex(getVkAddress(), attachmentIndex != null ? attachmentIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAttachmentIndexQ() {
        return getAttachmentIndex().getValue();
    }

    public void setAttachmentIndex(int attachmentIndex) {
        getAttachmentIndex().setValue(attachmentIndex);
    }

    protected static native long getAttachmentIndex(long address);
    protected static native void setAttachmentIndex(long address, long attachmentIndex);

    public VkSampleLocationsInfoEXT getSampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(getVkMemory(), getSampleLocationsInfo(getVkAddress()));
    }

    
    public void setSampleLocationsInfo(VkSampleLocationsInfoEXT sampleLocationsInfo) {
        setSampleLocationsInfo(getVkAddress(), sampleLocationsInfo != null ? sampleLocationsInfo.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSampleLocationsInfo(long address);
    protected static native void setSampleLocationsInfo(long address, long sampleLocationsInfo);


    public static native long sizeof();

    public static class Array extends VkAttachmentSampleLocationsEXT implements cz.mg.collections.array.ReadonlyArray<VkAttachmentSampleLocationsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAttachmentSampleLocationsEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkAttachmentSampleLocationsEXT o){
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
        public VkAttachmentSampleLocationsEXT get(int i){
            return new VkAttachmentSampleLocationsEXT(getVkMemory(), addressAt(i));
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
