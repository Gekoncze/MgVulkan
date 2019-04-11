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


    public VkAttachmentSampleLocationsEXT(VkUInt32 attachmentIndex, VkSampleLocationsInfoEXT sampleLocationsInfo) {
        super(sizeof());
        setAttachmentIndex(attachmentIndex);
        setSampleLocationsInfo(sampleLocationsInfo);
    }

    public VkUInt32 getAttachmentIndex() {
        return new VkUInt32(getVkMemory(), getAttachmentIndex(getVkAddress()));
    }

    
    public void setAttachmentIndex(VkUInt32 attachmentIndex) {
        setAttachmentIndex(getVkAddress(), attachmentIndex != null ? attachmentIndex.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getAttachmentIndex(long address);
    private static native void setAttachmentIndex(long address, long attachmentIndex);

    public VkSampleLocationsInfoEXT getSampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(getVkMemory(), getSampleLocationsInfo(getVkAddress()));
    }

    
    public void setSampleLocationsInfo(VkSampleLocationsInfoEXT sampleLocationsInfo) {
        setSampleLocationsInfo(getVkAddress(), sampleLocationsInfo != null ? sampleLocationsInfo.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getSampleLocationsInfo(long address);
    private static native void setSampleLocationsInfo(long address, long sampleLocationsInfo);


    public static native long sizeof();

    public static class Array extends VkAttachmentSampleLocationsEXT implements cz.mg.collections.array.ReadonlyArray<VkAttachmentSampleLocationsEXT> {        private final int count;

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
            return new VkAttachmentSampleLocationsEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkAttachmentSampleLocationsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkAttachmentSampleLocationsEXT.Pointer> {
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

            public Array(VkAttachmentSampleLocationsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkAttachmentSampleLocationsEXT.Pointer get(int i){
                return new VkAttachmentSampleLocationsEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
