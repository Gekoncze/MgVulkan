package cz.mg.vulkan;

public class VkAttachmentSampleLocationsEXT extends VkObject {
    public VkAttachmentSampleLocationsEXT() {
        super(sizeof());
    }

    protected VkAttachmentSampleLocationsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkAttachmentSampleLocationsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkAttachmentSampleLocationsEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getAttachmentIndex() {
        return new VkUInt32(getVkMemory(), getAttachmentIndexNative(getVkAddress()));
    }

    
    public void setAttachmentIndex(VkUInt32 attachmentIndex) {
        setAttachmentIndexNative(getVkAddress(), attachmentIndex != null ? attachmentIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAttachmentIndexQ() {
        return getAttachmentIndex().getValue();
    }

    public void setAttachmentIndex(int attachmentIndex) {
        getAttachmentIndex().setValue(attachmentIndex);
    }

    protected static native long getAttachmentIndexNative(long address);
    protected static native void setAttachmentIndexNative(long address, long attachmentIndex);

    public VkSampleLocationsInfoEXT getSampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(getVkMemory(), getSampleLocationsInfoNative(getVkAddress()));
    }

    
    public void setSampleLocationsInfo(VkSampleLocationsInfoEXT sampleLocationsInfo) {
        setSampleLocationsInfoNative(getVkAddress(), sampleLocationsInfo != null ? sampleLocationsInfo.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSampleLocationsInfoNative(long address);
    protected static native void setSampleLocationsInfoNative(long address, long sampleLocationsInfo);


    public void set(VkAttachmentSampleLocationsEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkAttachmentSampleLocationsEXT implements cz.mg.collections.array.ReadonlyArray<VkAttachmentSampleLocationsEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAttachmentSampleLocationsEXT.sizeof()));
            this.count = count;
        }

        public Array(VkAttachmentSampleLocationsEXT o, int count){
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
        public VkAttachmentSampleLocationsEXT get(int i){
            return new VkAttachmentSampleLocationsEXT(getVkMemory(), address(i));
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
